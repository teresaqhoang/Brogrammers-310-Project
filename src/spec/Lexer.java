package spec;

public abstract class Lexer {
	public String LEXEME;
	public TokenTypes TOKEN;
	
	public enum TokenTypes {
		LET, 
		ASSIGN,
		END_LET,
		QUERY, 
		END_QUERY, 
		EQUIVALENCE, 
		IMPLICATION, 
		DISJUNCTION, 
		CONJUNCTION, 
		NEGATION,
		LEFT_PAREN,
		RIGHT_PAREN,
		VARIABLE_NAME,
		TRUE_LITERAL,
		FALSE_LITERAL
	}
	
	public abstract void initialize(String sentence);
	public abstract void lex();
}