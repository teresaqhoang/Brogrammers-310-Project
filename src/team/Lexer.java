package team;

import java.io.StringReader; 

public class Lexer extends spec.Lexer {
	
	StringReader reader; 
	
	@Override
	public void initialize(String sentence) {
		reader = new StringReader(sentence);
	}

	@Override
	public void lex() {
		throw new UnsupportedOperationException();
	}
}
