#include<bits/stdc++.h>
using namespace std;

bool IsLetter(char c) {
	return islower(c) || isupper(c);
}

bool IsDigit(char c) {
	return c - '0' >= 0 && c - '0' < 10;
}


string IntToStr(int a) {
	stringstream ss;
	ss << a;
	string ret;
	ss >> ret;
	return ret;
}

struct token {
	bool extra;
	string id, lex;
	int row, col;
	token(){}
		
	token(string _id, string _lex, int _row, int _col) : 
		id(_id), lex(_lex), row(_row), col(_col) {
		extra = true;
	}
	
	token(string _id, int _row, int _col) : 
		id(_id), row(_row), col(_col) {
		extra = false;
	}
	string toString() {
		string ret = "<" + id + ",";
		if (extra) ret+=lex+",";
		ret += IntToStr(row) + ",";
		ret += IntToStr(col) + ">";	
		return ret;
	}	
};

void Lex(vector<string>& lines) {

	for (auto l : lines) cout << l + "\n";
	
	
}
int main() {
	freopen("archivo.in", "r", stdin);
	string line;
	vector<string> lines;
	while(getline(cin, line)) lines.push_back(line);
	Lex(lines);
	token test1("global", 1, 3);
	token test2("tk_cadena", "\"Tisa\"", 2, 2);
	cout << test1.toString() << endl << test2.toString() << endl;


	string check_end = "blabla";
	int n = check_end.size();
	cout << check_end.size() << " " << (check_end[n] == '\0') << endl;


}
