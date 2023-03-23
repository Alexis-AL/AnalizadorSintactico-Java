/* The following code was generated by JFlex 1.4.3 on 23/02/22 05:51 PM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 23/02/22 05:51 PM from the specification file
 * <tt>/home/zu/Java/AnalizadorLexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\6\1\12\1\23\2\0\1\12\16\6\4\0\1\12\1\50\1\21"+
    "\1\3\1\5\1\53\1\46\1\3\1\54\1\55\1\45\1\43\1\12"+
    "\1\44\1\3\1\22\12\2\1\3\1\63\1\52\1\42\1\51\1\3"+
    "\1\10\14\1\1\13\5\1\1\40\7\1\1\60\1\3\1\61\1\3"+
    "\1\1\1\3\1\20\1\24\1\17\1\37\1\27\1\36\1\35\1\31"+
    "\1\16\2\1\1\33\1\62\1\30\1\34\2\1\1\32\1\15\1\26"+
    "\1\14\1\1\1\41\1\1\1\25\1\1\1\56\1\47\1\57\1\3"+
    "\41\6\2\0\4\4\4\0\1\4\2\0\1\6\2\0\1\0\4\0"+
    "\1\4\1\0\1\7\2\0\1\4\4\0\1\7\27\4\1\0\31\4"+
    "\1\11\5\4\1\0\1\4\u01c0\4\11\11\4\7\14\11\15\7\1\0"+
    "\2\11\3\4\7\0\1\4\1\0\1\4\21\0\160\6\5\4\1\0"+
    "\2\4\2\0\4\4\10\0\1\4\1\0\3\4\1\0\1\4\1\0"+
    "\24\4\1\0\123\4\1\0\213\4\1\0\5\6\2\0\236\4\11\0"+
    "\46\4\2\0\1\4\7\0\47\4\7\0\1\4\1\0\55\6\1\0"+
    "\1\6\1\0\2\6\1\0\2\6\1\0\1\6\10\0\33\4\5\0"+
    "\3\4\15\0\2\6\1\6\2\6\6\0\1\4\4\0\13\6\5\0"+
    "\53\4\37\6\4\0\2\4\1\6\143\4\1\0\1\4\10\6\1\0"+
    "\6\6\2\4\2\6\1\0\4\6\2\4\12\6\3\4\2\0\1\4"+
    "\17\0\1\6\1\4\1\6\36\4\33\6\2\0\131\4\13\6\1\4"+
    "\16\0\12\6\41\4\11\6\2\4\4\0\1\4\5\0\26\4\4\6"+
    "\1\4\11\6\1\4\3\6\1\4\5\6\22\0\31\4\3\6\104\0"+
    "\1\4\1\0\13\4\67\0\33\6\1\0\4\6\66\4\3\6\1\4"+
    "\22\6\1\4\7\6\12\4\2\6\2\0\12\6\1\0\7\4\1\0"+
    "\7\4\1\0\3\6\1\0\10\4\2\0\2\4\2\0\26\4\1\0"+
    "\7\4\1\0\1\4\3\0\4\4\2\0\1\6\1\4\7\6\2\0"+
    "\2\6\2\0\3\6\1\4\10\0\1\6\4\0\2\4\1\0\3\4"+
    "\2\6\2\0\12\6\4\4\7\0\1\4\5\0\3\6\1\0\6\4"+
    "\4\0\2\4\2\0\26\4\1\0\7\4\1\0\2\4\1\0\2\4"+
    "\1\0\2\4\2\0\1\6\1\0\5\6\4\0\2\6\2\0\3\6"+
    "\3\0\1\6\7\0\4\4\1\0\1\4\7\0\14\6\3\4\1\6"+
    "\13\0\3\6\1\0\11\4\1\0\3\4\1\0\26\4\1\0\7\4"+
    "\1\0\2\4\1\0\5\4\2\0\1\6\1\4\10\6\1\0\3\6"+
    "\1\0\3\6\2\0\1\4\17\0\2\4\2\6\2\0\12\6\1\0"+
    "\1\4\17\0\3\6\1\0\10\4\2\0\2\4\2\0\26\4\1\0"+
    "\7\4\1\0\2\4\1\0\5\4\2\0\1\6\1\4\7\6\2\0"+
    "\2\6\2\0\3\6\10\0\2\6\4\0\2\4\1\0\3\4\2\6"+
    "\2\0\12\6\1\0\1\4\20\0\1\6\1\4\1\0\6\4\3\0"+
    "\3\4\1\0\4\4\3\0\2\4\1\0\1\4\1\0\2\4\3\0"+
    "\2\4\3\0\3\4\3\0\14\4\4\0\5\6\3\0\3\6\1\0"+
    "\4\6\2\0\1\4\6\0\1\6\16\0\12\6\11\0\1\4\7\0"+
    "\3\6\1\0\10\4\1\0\3\4\1\0\27\4\1\0\12\4\1\0"+
    "\5\4\3\0\1\4\7\6\1\0\3\6\1\0\4\6\7\0\2\6"+
    "\1\0\2\4\6\0\2\4\2\6\2\0\12\6\22\0\2\6\1\0"+
    "\10\4\1\0\3\4\1\0\27\4\1\0\12\4\1\0\5\4\2\0"+
    "\1\6\1\4\7\6\1\0\3\6\1\0\4\6\7\0\2\6\7\0"+
    "\1\4\1\0\2\4\2\6\2\0\12\6\1\0\2\4\17\0\2\6"+
    "\1\0\10\4\1\0\3\4\1\0\51\4\2\0\1\4\7\6\1\0"+
    "\3\6\1\0\4\6\1\4\10\0\1\6\10\0\2\4\2\6\2\0"+
    "\12\6\12\0\6\4\2\0\2\6\1\0\22\4\3\0\30\4\1\0"+
    "\11\4\1\0\1\4\2\0\7\4\3\0\1\6\4\0\6\6\1\0"+
    "\1\6\1\0\10\6\22\0\2\6\15\0\60\4\1\6\2\4\7\6"+
    "\4\0\10\4\10\6\1\0\12\6\47\0\2\4\1\0\1\4\2\0"+
    "\2\4\1\0\1\4\2\0\1\4\6\0\4\4\1\0\7\4\1\0"+
    "\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0\4\4\1\6"+
    "\2\4\6\6\1\0\2\6\1\4\2\0\5\4\1\0\1\4\1\0"+
    "\6\6\2\0\12\6\2\0\4\4\40\0\1\4\27\0\2\6\6\0"+
    "\12\6\13\0\1\6\1\0\1\6\1\0\1\6\4\0\2\6\10\4"+
    "\1\0\44\4\4\0\24\6\1\0\2\6\5\4\13\6\1\0\44\6"+
    "\11\0\1\6\71\0\53\4\24\6\1\4\12\6\6\0\6\4\4\6"+
    "\4\4\3\6\1\4\3\6\2\4\7\6\3\4\4\6\15\4\14\6"+
    "\1\4\17\6\2\0\46\4\1\0\1\4\5\0\1\4\2\0\53\4"+
    "\1\0\u014d\4\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4"+
    "\2\0\51\4\1\0\4\4\2\0\41\4\1\0\4\4\2\0\7\4"+
    "\1\0\1\4\1\0\4\4\2\0\17\4\1\0\71\4\1\0\4\4"+
    "\2\0\103\4\2\0\3\6\40\0\20\4\20\0\125\4\14\0\u026c\4"+
    "\2\0\21\4\1\0\32\4\5\0\113\4\3\0\3\4\17\0\15\4"+
    "\1\0\4\4\3\6\13\0\22\4\3\6\13\0\22\4\2\6\14\0"+
    "\15\4\1\0\3\4\1\0\2\6\14\0\64\4\40\6\3\0\1\4"+
    "\3\0\2\4\1\6\2\0\12\6\41\0\3\6\2\0\12\6\6\0"+
    "\130\4\10\0\51\4\1\6\1\4\5\0\106\4\12\0\35\4\3\0"+
    "\14\6\4\0\14\6\12\0\12\6\36\4\2\0\5\4\13\0\54\4"+
    "\4\0\21\6\7\4\2\6\6\0\12\6\46\0\27\4\5\6\4\0"+
    "\65\4\12\6\1\0\35\6\2\0\13\6\6\0\12\6\15\0\1\4"+
    "\130\0\5\6\57\4\21\6\7\4\4\0\12\6\21\0\11\6\14\0"+
    "\3\6\36\4\15\6\2\4\12\6\54\4\16\6\14\0\44\4\24\6"+
    "\10\0\12\6\3\0\3\4\12\6\44\4\122\0\3\6\1\0\25\6"+
    "\4\4\1\6\4\4\3\6\2\4\11\0\300\4\47\6\25\0\4\6"+
    "\u0116\4\2\0\6\4\2\0\46\4\2\0\6\4\2\0\10\4\1\0"+
    "\1\4\1\0\1\4\1\0\1\4\1\0\37\4\2\0\65\4\1\0"+
    "\7\4\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0"+
    "\6\4\4\0\15\4\5\0\3\4\1\0\7\4\16\0\5\6\1\7"+
    "\1\0\4\7\1\0\1\7\1\0\3\7\2\0\1\7\3\0\5\7"+
    "\3\0\5\6\3\0\1\7\1\0\1\7\1\0\2\7\7\0\2\4"+
    "\23\0\1\4\3\0\7\7\1\0\5\6\5\0\6\6\1\0\1\4"+
    "\15\0\1\4\20\0\15\4\3\0\33\4\25\0\15\6\4\0\1\6"+
    "\3\0\14\6\21\0\1\4\4\0\1\4\2\0\12\4\1\0\1\4"+
    "\3\0\5\4\6\0\1\4\1\0\1\4\1\0\1\4\1\0\4\4"+
    "\1\0\13\4\2\0\4\4\5\0\5\4\4\0\1\4\21\0\51\4"+
    "\327\0\1\0\14\0\1\0\u03fb\0\7\0\u0590\0\57\4\1\0\57\4"+
    "\1\0\205\4\6\0\4\4\3\6\2\4\14\0\46\4\1\0\1\4"+
    "\5\0\1\4\2\0\70\4\7\0\1\4\17\0\1\6\27\4\11\0"+
    "\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0"+
    "\7\4\1\0\7\4\1\0\7\4\1\0\40\6\57\0\1\4\u01d1\0"+
    "\3\7\1\0\3\4\4\0\4\7\15\0\2\7\2\0\11\4\6\6"+
    "\1\0\5\4\2\0\5\4\4\0\126\4\2\0\2\6\2\0\3\4"+
    "\1\0\132\4\1\0\4\4\5\0\51\4\3\0\136\4\21\0\33\4"+
    "\65\0\20\4\u0200\0\u19b6\4\112\0\u51cd\4\63\0\u048d\4\103\0\56\4"+
    "\2\0\u010d\4\3\0\20\4\12\6\2\4\24\0\57\4\1\6\4\0"+
    "\12\6\1\0\31\4\7\0\1\6\120\4\2\6\45\0\11\4\2\0"+
    "\147\4\2\0\4\4\1\0\4\4\14\0\13\4\115\0\12\4\1\6"+
    "\3\4\1\6\4\4\1\6\27\4\5\6\20\0\1\4\7\0\64\4"+
    "\14\0\2\6\62\4\21\6\13\0\12\6\6\0\22\6\6\4\3\0"+
    "\1\4\4\0\12\6\34\4\10\6\2\0\27\4\15\6\14\0\35\4"+
    "\3\0\4\6\57\4\16\6\16\0\1\4\12\6\46\0\51\4\16\6"+
    "\11\0\3\4\1\6\10\4\2\6\2\0\12\6\6\0\27\4\3\0"+
    "\1\4\1\6\4\0\60\4\1\6\1\4\3\6\2\4\2\6\5\4"+
    "\2\6\1\4\1\6\1\4\30\0\3\4\2\0\13\4\5\6\2\0"+
    "\3\4\2\6\12\0\6\4\2\0\6\4\2\0\6\4\11\0\7\4"+
    "\1\0\7\4\221\0\43\4\10\6\1\0\2\6\2\0\12\6\6\0"+
    "\u2ba4\4\14\0\27\4\4\0\61\4\u2104\0\u016e\4\2\0\152\4\46\0"+
    "\7\4\14\0\5\4\5\0\1\4\1\6\12\4\1\0\15\4\1\0"+
    "\5\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0\154\4\41\0"+
    "\u016b\4\22\0\100\4\2\0\66\4\50\0\15\4\3\0\20\6\20\0"+
    "\7\6\11\0\1\7\2\0\2\4\14\0\4\7\10\0\3\4\1\7"+
    "\1\0\1\7\2\0\1\7\23\0\1\4\6\0\5\4\1\0\207\4"+
    "\2\0\1\6\1\0\1\7\1\0\1\7\1\11\2\7\3\0\1\7"+
    "\1\0\1\7\1\0\1\7\1\0\12\6\1\7\4\0\2\7\32\4"+
    "\4\0\1\4\1\0\32\4\3\0\1\7\7\0\131\4\3\0\6\4"+
    "\2\0\6\4\2\0\6\4\2\0\3\4\3\0\2\4\3\0\2\4"+
    "\22\0\3\6\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\3\1\1\4\3\2\1\5"+
    "\1\6\1\7\10\2\1\10\1\11\1\12\1\13\3\14"+
    "\2\15\1\1\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\2\1\24\1\0\3\25\1\0\2\2\1\26\1\2"+
    "\1\0\1\4\1\27\7\2\1\30\2\2\1\15\1\31"+
    "\1\14\1\0\2\2\1\32\1\2\1\33\6\2\1\34"+
    "\3\2\1\0\2\2\1\35\1\36\3\2\1\3\1\37"+
    "\1\40\1\2\1\41\1\42";

  private static int [] zzUnpackAction() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\64\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u0444\0\u057c\0\u05b0\0\u04e0"+
    "\0\u05e4\0\64\0\64\0\64\0\64\0\64\0\u0618\0\64"+
    "\0\320\0\u064c\0\u0138\0\u0680\0\u0104\0\u06b4\0\u06e8\0\150"+
    "\0\u071c\0\u0750\0\u0784\0\64\0\u07b8\0\u07ec\0\u0820\0\u0854"+
    "\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\64\0\64"+
    "\0\64\0\u09c0\0\u09f4\0\u0a28\0\150\0\u0a5c\0\u0750\0\u0a90"+
    "\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\150\0\u0bc8\0\u0bfc"+
    "\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\150\0\150\0\u0d00\0\u0d34"+
    "\0\u0d68\0\64\0\150\0\u0d9c\0\u0dd0\0\150\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\2\5\1\2\2\6\1\7"+
    "\1\10\1\11\2\3\1\12\1\13\1\3\1\14\1\15"+
    "\1\16\1\17\1\3\1\20\1\21\3\3\1\22\2\3"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\65\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\6\3\3\0\16\3"+
    "\20\0\1\3\3\0\1\4\62\0\2\51\1\0\3\51"+
    "\2\52\1\53\1\0\6\51\3\0\16\51\20\0\1\51"+
    "\2\0\1\54\2\0\2\54\1\0\2\55\1\54\1\0"+
    "\6\54\3\0\16\54\20\0\1\54\2\0\1\54\1\51"+
    "\1\0\2\54\1\51\2\52\1\54\1\0\6\54\3\0"+
    "\16\54\20\0\1\54\13\0\1\10\52\0\2\3\1\0"+
    "\3\51\2\52\1\53\1\0\1\3\1\56\4\3\3\0"+
    "\16\3\20\0\1\3\2\0\2\3\1\0\3\51\2\52"+
    "\1\53\1\0\6\3\3\0\4\3\1\57\5\3\1\60"+
    "\3\3\20\0\1\3\2\0\2\3\1\0\3\51\2\52"+
    "\1\53\1\0\6\3\3\0\5\3\1\61\10\3\20\0"+
    "\1\3\2\0\3\62\1\0\1\62\2\0\1\62\1\0"+
    "\11\62\1\0\23\62\1\0\6\62\2\0\4\62\22\0"+
    "\1\63\17\0\1\64\22\0\2\3\1\0\3\51\2\52"+
    "\1\53\1\0\6\3\3\0\1\3\1\65\14\3\20\0"+
    "\1\3\2\0\2\3\1\0\3\51\2\52\1\53\1\0"+
    "\6\3\3\0\6\3\1\66\7\3\20\0\1\3\2\0"+
    "\2\3\1\0\3\51\2\52\1\53\1\0\6\3\3\0"+
    "\7\3\1\67\6\3\20\0\1\3\2\0\2\3\1\0"+
    "\3\51\2\52\1\53\1\0\6\3\3\0\10\3\1\70"+
    "\5\3\20\0\1\3\2\0\2\3\1\0\3\51\2\52"+
    "\1\53\1\0\5\3\1\71\3\0\7\3\1\72\1\73"+
    "\5\3\20\0\1\3\2\0\2\3\1\0\3\51\2\52"+
    "\1\53\1\0\6\3\3\0\10\3\1\74\5\3\20\0"+
    "\1\3\2\0\2\3\1\0\3\51\2\52\1\53\1\0"+
    "\6\3\3\0\2\3\1\75\13\3\20\0\1\3\2\0"+
    "\2\3\1\0\3\51\2\52\1\53\1\0\6\3\3\0"+
    "\5\3\1\76\10\3\20\0\1\3\43\0\1\77\63\0"+
    "\1\64\1\100\62\0\1\64\1\0\1\100\61\0\1\64"+
    "\67\0\1\101\64\0\1\101\56\0\1\77\6\0\1\77"+
    "\54\0\1\77\7\0\1\77\55\0\1\102\20\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\5\3\1\103\3\0"+
    "\16\3\20\0\1\3\2\0\1\54\2\0\2\54\1\0"+
    "\2\52\1\54\1\0\6\54\3\0\16\54\20\0\1\54"+
    "\2\0\2\54\1\0\3\54\2\52\1\54\1\0\6\54"+
    "\3\0\16\54\20\0\1\54\2\0\2\3\1\0\3\51"+
    "\2\52\1\53\1\0\2\3\1\104\3\3\3\0\16\3"+
    "\20\0\1\3\2\0\2\3\1\0\3\51\2\52\1\53"+
    "\1\0\6\3\3\0\2\3\1\105\13\3\20\0\1\3"+
    "\2\0\2\3\1\0\3\51\2\52\1\53\1\0\5\3"+
    "\1\106\3\0\16\3\20\0\1\3\2\0\3\62\1\0"+
    "\1\62\2\0\1\62\1\0\7\62\1\107\1\62\1\0"+
    "\23\62\1\0\6\62\2\0\4\62\23\63\1\0\40\63"+
    "\1\0\2\3\1\0\3\51\2\52\1\53\1\0\6\3"+
    "\3\0\2\3\1\110\13\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\1\3\1\111\4\3"+
    "\3\0\16\3\20\0\1\3\2\0\2\3\1\0\3\51"+
    "\2\52\1\53\1\0\2\3\1\112\3\3\3\0\16\3"+
    "\20\0\1\3\2\0\2\3\1\0\3\51\2\52\1\53"+
    "\1\0\6\3\3\0\4\3\1\113\11\3\20\0\1\3"+
    "\2\0\2\3\1\0\3\51\2\52\1\53\1\0\6\3"+
    "\3\0\7\3\1\114\6\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\6\3\3\0\10\3"+
    "\1\115\5\3\20\0\1\3\2\0\2\3\1\0\3\51"+
    "\2\52\1\53\1\0\6\3\3\0\6\3\1\116\7\3"+
    "\20\0\1\3\2\0\2\3\1\0\3\51\2\52\1\53"+
    "\1\0\1\3\1\117\4\3\3\0\16\3\20\0\1\3"+
    "\2\0\2\3\1\0\3\51\2\52\1\53\1\0\6\3"+
    "\3\0\6\3\1\120\7\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\3\3\1\121\2\3"+
    "\3\0\16\3\20\0\1\3\3\0\1\122\62\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\3\3\1\123\2\3"+
    "\3\0\16\3\20\0\1\3\2\0\2\3\1\0\3\51"+
    "\2\52\1\53\1\0\3\3\1\124\2\3\3\0\16\3"+
    "\20\0\1\3\2\0\2\3\1\0\3\51\2\52\1\53"+
    "\1\0\6\3\3\0\6\3\1\105\7\3\20\0\1\3"+
    "\2\0\2\3\1\0\3\51\2\52\1\53\1\0\6\3"+
    "\3\0\3\3\1\105\12\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\6\3\3\0\3\3"+
    "\1\125\12\3\20\0\1\3\2\0\2\3\1\0\3\51"+
    "\2\52\1\53\1\0\6\3\3\0\3\3\1\126\12\3"+
    "\20\0\1\3\2\0\2\3\1\0\3\51\2\52\1\53"+
    "\1\0\6\3\3\0\11\3\1\105\4\3\20\0\1\3"+
    "\2\0\2\3\1\0\3\51\2\52\1\53\1\0\2\3"+
    "\1\111\3\3\3\0\16\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\5\3\1\57\3\0"+
    "\16\3\20\0\1\3\2\0\2\3\1\0\3\51\2\52"+
    "\1\53\1\0\6\3\3\0\1\127\15\3\20\0\1\3"+
    "\2\0\2\3\1\0\3\51\2\52\1\53\1\0\3\3"+
    "\1\130\2\3\3\0\16\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\6\3\3\0\7\3"+
    "\1\131\6\3\20\0\1\3\3\0\1\122\52\0\1\132"+
    "\7\0\2\3\1\0\3\51\2\52\1\53\1\0\6\3"+
    "\3\0\4\3\1\133\11\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\4\3\1\134\1\3"+
    "\3\0\16\3\20\0\1\3\2\0\2\3\1\0\3\51"+
    "\2\52\1\53\1\0\6\3\3\0\7\3\1\110\6\3"+
    "\20\0\1\3\2\0\2\3\1\0\3\51\2\52\1\53"+
    "\1\0\6\3\3\0\4\3\1\135\11\3\20\0\1\3"+
    "\2\0\2\3\1\0\3\51\2\52\1\53\1\0\6\3"+
    "\3\0\3\3\1\136\12\3\20\0\1\3\2\0\2\3"+
    "\1\0\3\51\2\52\1\53\1\0\5\3\1\134\3\0"+
    "\16\3\20\0\1\3\2\0\2\3\1\0\3\51\2\52"+
    "\1\53\1\0\6\3\3\0\11\3\1\137\4\3\20\0"+
    "\1\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3588];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\13\1\1\11\23\1\5\11\1\1\1\11"+
    "\1\0\3\1\1\0\4\1\1\0\1\1\1\11\12\1"+
    "\3\11\1\0\17\1\1\0\7\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2386) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { lexeme=yytext(); return Comillas;
          }
        case 35: break;
        case 20: 
          { lexeme=yytext(); return P_coma;
          }
        case 36: break;
        case 21: 
          { lexeme=yytext(); return ERROR;
          }
        case 37: break;
        case 13: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 38: break;
        case 18: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 39: break;
        case 34: 
          { lexeme=yytext(); return Cadena;
          }
        case 40: break;
        case 29: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 41: break;
        case 16: 
          { lexeme=yytext(); return Llave_a;
          }
        case 42: break;
        case 9: 
          { lexeme=yytext(); return Suma;
          }
        case 43: break;
        case 27: 
          { lexeme=yytext(); return constante;
          }
        case 44: break;
        case 6: 
          { lexeme=yytext(); return Division;
          }
        case 45: break;
        case 7: 
          { return Linea;
          }
        case 46: break;
        case 23: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 47: break;
        case 22: 
        case 48: break;
        case 25: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 49: break;
        case 8: 
          { lexeme=yytext(); return Igual;
          }
        case 50: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 51: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 52: break;
        case 53: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 54: break;
        case 55: break;
        case 11: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 56: break;
        case 1: 
          { return ERROR;
          }
        case 57: break;
        case 31: 
          { lexeme=yytext(); return Main;
          }
        case 58: break;
        case 59: break;
        case 4: 
          { /*Ignore*/
          }
        case 60: break;
        case 12: 
          { lexeme=yytext(); return Op_logico;
          }
        case 61: break;
        case 62: break;
        case 26: 
          { lexeme=yytext(); return T_dato;
          }
        case 63: break;
        case 14: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 64: break;
        case 19: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 65: break;
        case 17: 
          { lexeme=yytext(); return Llave_c;
          }
        case 66: break;
        case 67: break;
        case 10: 
          { lexeme=yytext(); return Resta;
          }
        case 68: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
