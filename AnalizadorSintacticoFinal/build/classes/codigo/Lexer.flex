package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
Strings = ["_""-""/""."",""~""!""@""#""$""%""^""&""*""""("")""=""+""\\"":"";""<"">""?""`""[""]""\'""\""a-zA-Z0-9 \t\r]+
Identifier = [:jletter:] [:jletterdigit:]*
Undefined = [@ñ˙‥、。〃「」『』〝〞︰﹁﹂﹃﹄﹐﹒﹕！＃＄％＆＊，．：？＠～•…¿·′’‐‒–—―‗‚‛„‣․‴‶‷ʹʺʻʼʽʾʿˀˁ˂˃˄˅ˆˇˈˉˊˋˌˍˎˏːˑ˒˓˔˕˖˗˘˚˛˜˝˞ˠˡ⁘⁙⁚⁛⁜⁜⁝⁞]+
espacio=[ \t \r]+
%{
    public String lexeme;
%}
%%

/*Strings en " */
"\""{Strings}+"\"" {lexeme=yytext(); return constante;}

/*Simbolos no definidos*/
{Identifier}? ({Undefined}{Identifier})+ {lexeme=yytext(); return ERROR;}
({Identifier} {Undefined})+ {Identifier}? {lexeme=yytext(); return ERROR;}
({Undefined}{Identifier})+ {Undefined}? {lexeme=yytext(); return ERROR;}

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Entero */
( int ) {lexeme=yytext(); return Int;}

/* Cadena */
( char ) {lexeme=yytext(); return Char;}

/* Tipos de datos */
( long | float | double | string) {lexeme=yytext(); return T_dato;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/* Operadores logicos */
( "||" ) {lexeme=yytext(); return OpOr;}
( "&&" ) {lexeme=yytext(); return OpAnd;}
( "!=" ) {lexeme=yytext(); return OpNot;}

/*Operadores Relacionales */
( ">" | "<" | "==" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexeme=yytext(); return Main;}

/* Ciclos */
( "while" ) {lexeme=yytext(); return While;}

/* If, else, return */
( "if" ) {lexeme=yytext(); return If;}
( "else" ) {lexeme=yytext(); return Else;}
( "return" ) {lexeme=yytext(); return Return;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Coma */
( "," ) {lexeme=yytext(); return Coma;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}
