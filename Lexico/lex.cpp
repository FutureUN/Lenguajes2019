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
        ret += msg; 
		return ret;
	}	
	void NotValid(string _msg) {
		isValid = false;
		msg = _msg;
	}
};




token identifier(int row, int& idx ,string line){
    int j = idx;
    string str = "";  
    while(true){
        if(str.length() == 0 ){
            if( IsSpace(line[j]) ){
                j++; 
                continue; 
            }     
            if( IsLetter(line[j]) ){
                str += line[j]; 
                j++; 
                continue; 
            }
            
            if( line[j] == END or !IsLetter(line[j])){
                j++;
                token t("", row, j);
                t.NotValid("No valid"); 
                return t; 
            }
            
        }
        if(str.length() > 0 ){
            if( IsSpace(line[j]) or line[j] == END or IsOperatorChar(line[j])){
                if(str.compare("mod") == 0) {
                   token t(operators["mod"], row, j); 
                   return t;
                }
                if(keywords.find(str) != keywords.end() ){
                    token t(str, row ,j ); 
                    return t; 
                }
                token t("tk_identifier", str, row, j); 
                return t;
            }
            if( IsLetter(line[j]) or IsDigit(line[j]) or line[j] == '_'){
                str += line[j]; 
                j++; 
                continue; 
            }
            if( !IsLetter( line[j]) ){
                j++; 
                token t("", row, j); // Sintaxis error
                t.NotValid("Sintaxis Error"); 
                return t; 
            }
        }
    }
}
void Lex(vector<string>& lines) {
    auto i = lines.begin(); 
	for (int k = 0 ; i != lines.end(); ++i, k++) {
		int j = 0;		
        string str = *i; 
        while(j < str.length()){
            token t = identifier(k, j, *i);
            j = t.col ; 
            cout << t.toString() << " "<<j << " " << str.length();
        }
        cout << endl; 

	}	
	
}
int main() {
    init(); 
	freopen("archivo.in", "r", stdin);
	string line;
	vector<string> lines;
	while(getline(cin, line)) lines.push_back(line);
	Lex(lines);

}
