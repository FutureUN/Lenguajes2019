/* Analizador lexico desarrollado por
		*Juan Sebasitan Chaves 
		*Jimmy Pulido
		*Laura Santos

	Curso: Lenguajes de programacion 2019-02
	Profesor: Felipe Restrepo

*/


#include<bits/stdc++.h>
#define END '\0'
using namespace std;

bool IsLetter(char c) {
	return islower(c) || isupper(c);
}

bool IsDigit(char c) {
	return c >= '0' && c <= '9';
}

bool IsOperatorChar(char c) {
	string chars = ":=.+/*-[],();->!<%{}";
	for (auto ch : chars) if (c == ch) return true;
	return false;
}

bool IsSpace(char c) {
	return c == ' ' || c == '\t' ;
}

string IntToStr(int a) {
	stringstream ss;
	ss << a;
	string ret;
	ss >> ret;
	return ret;
}

set<string> keywords;
map<string, string> operators;

void init() {
 	string line;
  	ifstream myfile ("tokens.txt");
  	if (myfile.is_open())
  	{
			while (! myfile.eof() )
			{
				getline (myfile,line);
				if (line == "-----") break;
				keywords.insert(line);
			}
			while (! myfile.eof() )
    	{	
				stringstream ss(line);
      	getline (myfile,line);
				string key, value;
				ss >> key;
				ss >> value;
      	operators[key] = value;
			}
		}
    myfile.close(); 
}


struct Token {
	bool extra, isValid;
	string id, lex, msg;
	int row, col;
	Token(){
		isValid = true;
		id = lex = msg = "";
	}
		
	Token(string _id, string _lex, int _row, int _col) : 
		id(_id), lex(_lex), row(_row), col(_col) {
		extra = true;
		isValid = true;
	}
	
	Token(string _id, int _row, int _col) : 
		id(_id), row(_row), col(_col) {
		extra = false;
		isValid = true;
	}
	
	~Token() {}

	Token(int _row, int _col) : row(_row), col(_col){
		isValid = false;	
	}
	string toString() {
		if (!isValid) return ">>>Error lexico(linea:"+IntToStr(row)+",posicion:"+IntToStr(col)+")";
		string ret = "<" + id + ",";
		if (extra) ret+=lex+",";
		ret += IntToStr(row) + ",";
		ret += IntToStr(col) + ">";	
		return ret;
	}	
	
};


void Lex(vector<string>& lines) {

	for (int i=0; i<(int)lines.size(); i++) {
		Token tok;
		int j=0;
		//cout << i << endl;

		while (j<(int)lines[i].size()) {	
			string line = lines[i];
			int row = i+1;
			int col = j+1;
			if (line[j] == END || line[j] == '#') {
				break;	
			}	
			if (IsSpace(line[j])) {
				j++;
				continue;
			} 
			string str = "";

			// Encontro -, chequear si es negativo
			if (line[j] == '-') {	
			
				if(IsDigit(line[j+1])) {
					if (j==0 || IsSpace(line[j-1])) {
						j++;
						str = "-";
					}
				}
			} 
			

			// Encontro digito
			if (IsDigit(line[j])) {
				while(IsDigit(line[j])) {
					str += line[j];
					j++;
				}	
				if ( line[j] != END && line[j] == '.' && IsDigit(line[j+1])) {
					str+=".";
					j++;
					while (IsDigit(line[j])) {
						str += line[j];
						j++;
					}
				}
				
				tok =	 Token("tk_num", str, row, col);
				cout <<tok.toString() << endl;

				if (IsLetter(line[j])){
					tok = Token(row, j+1);
					cout << tok.toString() << "\n";
					return;
				}
				continue;
			}

			// Encontro letra
			if( IsLetter(line[j]) ){
        while(IsLetter(line[j]) or IsDigit(line[j]) or line[j] == '_'){
					str += line[j]; 
					j++; 
					continue; 
				}
				if(str.compare("mod") == 0) {
					tok = Token(operators["mod"], row, col); 
					cout <<tok.toString() << endl;
					continue;
				}
				if(keywords.find(str) != keywords.end() ){
					tok =  Token(str, row ,col ); 
					cout <<tok.toString() << endl;
					continue; 
				}
				tok = Token("tk_id", str, row, col); 
				cout << tok.toString() << endl;
				continue;
			}
		
			// Encontro " puede ser una string
			if (line[j] == '\"' ){
				str += line[j];
				j++;
				while(line[j] != END && line[j] != '\"') {
					str += line[j];
					j++;
				}
				if (line[j] == END) {
					tok = Token(row, col);
					cout << tok.toString() << "\n";
					return;
				}else {
					str += line[j];
					j++;
					tok = Token("tk_string" , str, row , col);
					cout<< tok.toString() << " \n"; 
					continue;
				}
			}
			

			// Encontro caracter de operador
			char act = line[j];
			string acts = "";
			acts += act;
			if (IsOperatorChar(act)){
				Token t;
				j++;
				if ( act == '.'){
					if (line[j] == '.' && line[j+1] == '.'){
					    acts += "..";
					    j +=2;
					}
				}
				if ( act == ':'){
					if(line[j] == '='){
						acts += line[j];	
						j++;
						if (line[j] == ':') {
						    acts+=line[j];
						    j++;
						}
					}
				}
				if ( act == '-'){
					if ( line[j] == '>' ){
						acts += line[j];
						j++; 				
					}			
				}
				if (act == '[' ){
					if (line[j]== ']' ){	
						acts += line[j];
						j++; 					
					}			
				}
				if (act == '!' ){
					if (line[j]== '=' ){	
						acts += line[j];
						j++;					
					}else{
						tok = Token(row, col);
						cout << tok.toString() << "\n";
						return;
					
					}			
				}
				if (act == '>' ){
					if (line[j]== '=' ){	
						acts += line[j];
						j++;					
					}			
				}
				if (act == '<' ){
					if (line[j]== '=' ){	
						acts += line[j];
						j++;					
					}			
				}
				tok = Token(operators[acts], row, col);
				cout << tok.toString() << '\n';
				continue;
			}

			// Nunca encontro caracter valido, error lexico
			tok = Token(row, j+1);
			cout << line[j] << endl;
			cout << tok.toString() << "\n";
			return;
		
		}

	}	
	
}

int main() {
//	freopen("archivo.in", "r", stdin);
//	freopen("archivo.out", "w", stdout);
	init();
	string line;
	vector<string> lines;
	while(getline(cin, line)) {lines.push_back(line);}
	Lex(lines);




}
