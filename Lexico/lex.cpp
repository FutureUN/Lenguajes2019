#include<bits/stdc++.h>
#include <string> 
#define END '\0'
using namespace std;

bool IsLetter(char c) {
	return islower(c) || isupper(c);
}

bool IsDigit(char c) {
	return c >= '0' && c <= '9';
}

bool IsOperatorChar(char c) {
	string chars = ":=.+/*-[],();->!<";
	for (auto ch : chars) if (c == ch) return true;
	return false;
}

bool IsSpace(char c) {
	return c == ' ' || c == '\t';
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
	keywords.insert("op");	
	keywords.insert("do");	
	keywords.insert("od");	
	keywords.insert("param");	
	keywords.insert("proto");	
	keywords.insert("proc");	
	keywords.insert("procedure");	
	keywords.insert("process");	
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
	

	operators[":="] = "tk_assig";
	operators["="] = "tk_equal";
	operators["."] = "tk_dot";
	operators[":"] = "tok_dots";	
	operators["+"] = "tk_add";	
	operators["/"] = "tok_div";	
	operators["mod"] = "tok_mod";	
	operators["*"] = "tk_multi";	
	operators["-"] = "substract";	
	operators["["] = "tk_bracket_l";	
	operators["]"] = "tk_bracket_r";	
	operators[","] = "tk_coma";	
	operators["("] = "tk_parent_l";	
	operators[")"] = "tk_parent_r";	
	operators[";"] = "tk_semicolon";	
	operators["->"] = "tk_execute";	
	operators["[]"] = "tk_separa";
	operators["<"] = "tk_less";
	operators[">"] = "tk_more";
}


struct token {
	bool extra, isValid;
	string id, lex, msg;
	int row, col;
	token(){}
		
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
	string toString() {
		string ret = "<" + id + ",";
		if (extra) ret+=lex+",";
		ret += IntToStr(row) + ",";
		ret += IntToStr(col) + ">";	
		return ret;
	}	
	void NotValid(string _msg) {
		isValid = false;
		msg = _msg;
	}
};



void Lex(vector<string>& lines) {

	for (int i=0; i<(int)lines.size(); i++) {
		int j = 0;		
		cout << lines[i] << " \n"; 
	}	
	
}
void IsString(string line,int row){
	int i = 0; 
	int len = 0 ; 
	int state = 0 ; 
	int start; 
	char act = line[i]; 
	string s;
	while (act != END ){
		if (act == '\"' ){
			if ( state == 0 ) {
				state = 1;
				start = i ; }
			else if (state == 1 ) {
				s = line.substr(start,len+1);		
				len= 0; 
				state = 0 ; 
				token t("tk_string" , s , row , start);
				cout<< t.toString() << " \n"; 
			} 
		}
		i++;		
		act = line[i];
		if (state == 1) len++; 
	}
	if ( state == 1) {
	token t; 
	t.NotValid("LEXIC ERROR (0,"+IntToStr(start)+")");
	cout << t.msg << " \n";  }
}
void isOp(string line, int row){
	int i = 0 ; 
	char act = line[i];
	string acts = line.substr(i,1); 
	token t; 
	while (act != END){
		if (IsOperatorChar(act)== false && IsLetter(act) == false && IsDigit(act) == false && act != ' ' && act != '#'  && act!= '\"' && act!= '?'){
		// es error xd 		
			cout << "BREAK " << act << " \n" ; 
			token t; 
			t.NotValid("LEXIC ERROR (0, " + IntToStr(i)+ ")" );
			break;
		}else if (IsOperatorChar(act)){
			token t (operators[acts],row,i);
			if ( act == ':'){
					if(line[i+1] == '='){	
						token t(operators[":="], row, i );
						i++;}
			}
			if ( act == '-'){
				if ( line[i+1] == '>' ){
					token t(operators["->"],row, i); 
					i++; 				
				}			
			}
			if (act == '[' ){
				if (line[i+1]== ']' ){	
					token t(operators["[]"],row, i); 
					i++; 					
				}			
			}
			if (act == '!' ){
				if (line[i+1]== '=' ){	
					token t(operators["!="],row, i); 
					i++; 					
				}else{//token de que esta mal 	
					token t; 
					t.NotValid("LEXIC ERROR (0, " + IntToStr(i)+ ")" );
					break;
				}			
			}
			if (act == '>' ){
				if (line[i+1]== '=' ){	
					token t(operators[">="],row, i); 
					i++; 					
				}			
			}
			if (act == '<' ){
				if (line[i+1]== '=' ){	
					token t(operators["<="],row, i); 
					i++; 					
				}			
			}
			cout << t.toString() << '\n';
		}
		i++; 
		act = line[i];
		acts = line[i]; 
	}

}
int main() {
	freopen("archivo.in", "r", stdin);
	string line;
	vector<string> lines;
	while(getline(cin, line)) lines.push_back(line);
	Lex(lines);
	init();
	for ( int i = 0 ; i < lines.size() ; i ++){
		IsString(lines[i],i);
		isOp(lines[i],i); }
}
