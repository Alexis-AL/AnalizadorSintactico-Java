package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
Strings = ["_""-""/""."",""~""!""@""#""$""%""^""&""*""""("")""=""+""\\"":"";""<"">""?""`""[""]""\'""\""a-zA-Z0-9 \t\r]+
Identifier = [:jletter:] [:jletterdigit:]*
Undefined = [@ñ˙‥、。〃「」『』〝〞︰﹁﹂﹃﹄﹐﹒﹕！＃＄％＆＊，．：？＠～•…¿·′’‐‒–—―‗‚‛„‣․‴‶‷ʹʺʻʼʽʾʿˀˁ˂˃˄˅ˆˇˈˉˊˋˌˍˎˏːˑ˒˓˔˕˖˗˘˚˛˜˝˞ˠˡ⁘⁙⁚⁛⁜⁜⁝⁞]+
espacio=[ \t \r \n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%


/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Entero */
( "int" ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Cadena */
( char ) {return new Symbol(sym.Char, yychar, yyline, yytext());}

/* Tipos de datos */
( long | float | double ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}


/* Operadores logicos */
( "||" ) {return new Symbol(sym.OpOr, yychar, yyline, yytext());}
( "&&" ) {return new Symbol(sym.OpAnd, yychar, yyline, yytext());}
( "!=" ) {return new Symbol(sym.OpNot, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Ciclos */
( "while" ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* If, else, return */
( "if" ) {return new Symbol(sym.If, yychar, yyline, yytext());}
( "else" ) {return new Symbol(sym.Else, yychar, yyline, yytext());}
( "return" ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
({D})* {return new Symbol(sym.Numero, yychar, yyline, yytext());}

