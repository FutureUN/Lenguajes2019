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

	keywords.insert("af");
	keywords.insert("body");	
	keywords.insert("cap");	
	keywords.insert("call");
	keywords.insert("class");	
	keywords.insert("const");	
	keywords.insert("create");	
	keywords.insert("do");	
	keywords.insert("end");	
	keywords.insert("extend");
	keywords.insert("fi");	
	keywords.insert("final");	
	keywords.insert("fa");	
	keywords.insert("getarg");	
	keywords.insert("global");	
	keywords.insert("if");	
	keywords.insert("import");	
	keywords.insert("in");	
	keywords.insert("int");	
	keywords.insert("ni");			
	keywords.insert("od");	
	keywords.insert("op");
	keywords.insert("or");
	keywords.insert("param");	
	keywords.insert("proto");	
	keywords.insert("proc");	
	keywords.insert("procedure");	
	keywords.insert("process");	
	keywords.insert("read");
	keywords.insert("real");	
	keywords.insert("recdata");	
	keywords.insert("receive");	
	keywords.insert("returns");	
	keywords.insert("resource");	
	keywords.insert("signat");	
	keywords.insert("sem");	
	keywords.insert("send");	
	keywords.insert("stop");	
	keywords.insert("to");	
	keywords.insert("true");	
	keywords.insert("var");	
	keywords.insert("while");	
	keywords.insert("write");	
	keywords.insert("writes");	
	keywords.insert("next");
	keywords.insert("string");
	keywords.insert("reply");
	keywords.insert("destroy");
	keywords.insert("bool");
	keywords.insert("char");
	keywords.insert("col");
	

	operators[":="] = "tk_assig";
	operators[":=:"] = "tk_swap";
	operators["!="] = "tk_different";
	operators["="] = "tk_equal";
	operators["."] = "tk_dot";
	operators["..."] = "tk_triple_dot";
	operators[":"] = "tk_colon";	
	operators["+"] = "tk_add";	
	operators["/"] = "tk_div";	
	operators["mod"] = "mod";	
	operators["*"] = "tk_multi";	
	operators["-"] = "tk_substract";	
	operators["["] = "tk_brace_l";	
	operators["]"] = "tk_brace_r";	
	operators[","] = "tk_coma";	
	operators["("] = "tk_parent_l";	
	operators[")"] = "tk_parent_r";	
	operators[";"] = "tk_semicolon";	
	operators["->"] = "tk_execute";	
	operators["[]"] = "tk_separa";
	operators["<"] = "tk_lesser_tham";
	operators[">"] = "tk_great_than";
	operators["<="] = "tk_lesser_eq_than";
	operators[">="] = "tk_greater_eq_than";
	operators["%"] = "tk_percent";
	operators["{"] = "tk_brack_l";
	operators["}"] = "tk_brack_r";
}


struct token {
	bool extra, isValid;
	string id, lex, msg;
	int row, col;
	token(){
		isValid = true;
		id = lex = msg = "";
	}
		
	token(string _id, string _lex, int _row, int _col) : 
		id(_id), lex(_lex), row(_row), col(_col) {
		extra = true;
		isValid = true;
	}
	
	token(string _id, int _row, int _col) : 
		id(_id), row(_row), col(_col) {
		extra = false;
		isValid = true;
	}

	token(int _row, int _col) : row(_row), col(_col){
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
		token tok;
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
				
				tok =token("tk_num", str, row, col);
				cout <<tok.toString() << endl;

				if (IsLetter(line[j])){
					tok = token(row, j+1);
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
					token t(operators["mod"], row, col); 
					cout <<t.toString() << endl;
					continue;
				}
				if(keywords.find(str) != keywords.end() ){
					token t(str, row ,col ); 
					cout <<t.toString() << endl;
					continue; 
				}
				token t("tk_id", str, row, col); 
				cout << t.toString() << endl;
				continue;
			}
		
			// Encontro " puede ser una string
			int state = 0;
			if (line[j] == '\"' ){
				str += line[j];
				j++;
				while(line[j] != END && line[j] != '\"') {
					str += line[j];
					j++;
				}
				if (line[j] == END) {
					tok = token(row, col);
					cout << tok.toString() << "\n";
					return;
				}else {
					str += line[j];
					j++;
					token t("tk_string" , str, row , col);
					cout<< t.toString() << " \n"; 
					continue;
				}
			}
			

			// Encontro caracter de operador
			char act = line[j];
			string acts = "";
			acts += act;
			if (IsOperatorChar(act)){
				token t;
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
						t = token(row, col);
						cout << t.toString() << "\n";
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
				t = token(operators[acts], row, col);
				cout << t.toString() << '\n';
				continue;
			}

			// Nunca encontro caracter valido, error lexico
			tok = token(row, j+1);
			cout << line[j] << endl;
			cout << tok.toString() << "\n";
			return;
		
		}

	}	
	
}

int main() {
//	freopen("archivo.in", "r", stdin);
	freopen("archivo.out", "w", stdout);
	init();
	string line;
	vector<string> lines;
	while(getline(cin, line)) {lines.push_back(line);}
	Lex(lines);




}
