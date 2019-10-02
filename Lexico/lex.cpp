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
	}	
	
}
int main() {
	freopen("archivo.in", "r", stdin);
	string line;
	vector<string> lines;
	while(getline(cin, line)) lines.push_back(line);
	Lex(lines);




}
