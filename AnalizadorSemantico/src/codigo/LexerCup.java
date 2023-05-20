/* The following code was generated by JFlex 1.6.1 */

package codigo;
import java_cup.runtime.*;
/* User code */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Scanner.flex</tt>
 */
public class LexerCup implements java_cup.runtime.Scanner {

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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9, 23, 25, 23, 24,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     9, 35, 36,  0,  0, 28, 14, 13, 29, 30, 22, 26, 59,  4,  0, 21, 
     3,  8,  8,  8,  8,  8,  8,  8,  2,  2, 60, 58, 34, 27, 33,  0, 
    15, 40, 37, 43, 53, 39,  6, 55, 46, 51,  1, 42, 54,  1, 48, 47, 
     1,  1, 38, 45, 49, 52, 57, 56,  5,  1,  1,  0, 10,  0, 15,  1, 
     0, 40, 37, 43, 53, 39,  6, 55, 46, 51,  1, 42, 54,  1, 48, 47, 
     1,  1, 38, 45, 49, 52, 57, 56,  5,  1,  1, 31,  7, 32,  0,  0, 
     0,  0,  0,  0,  0, 25,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 18,  0,  0,  0,  0,  0, 12,  0, 12, 12, 17,  0, 12,  0,  0, 
     0, 12,  0, 12,  0,  0,  0,  0,  0,  0, 12,  0,  0,  0,  0, 17, 
     0,  0, 16, 11,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0, 16, 11,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\1\5\1\3\1\2\1\6"+
    "\1\2\3\1\1\2\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\2"+
    "\4\3\1\2\1\3\1\2\5\3\1\23\1\24\1\25"+
    "\1\3\1\0\1\1\1\0\1\1\2\0\1\1\1\26"+
    "\2\4\1\27\1\30\1\3\1\31\2\1\3\0\1\32"+
    "\1\0\1\6\1\0\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\3\0\1\43\6\3\2\0\2\3"+
    "\1\44\1\0\1\44\2\3\1\45\4\3\1\1\2\0"+
    "\1\46\1\0\1\47\3\50\3\0\3\3\1\0\1\3"+
    "\1\0\3\3\2\0\2\3\2\51\2\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\3\1\46\1\52\1\3\1\53"+
    "\1\3\2\54\2\55\1\56\1\0\2\3\2\0\3\3"+
    "\1\57\1\0\1\3\1\0\1\3\2\60\2\61\1\3"+
    "\2\62\1\0\1\3\1\63\1\0\1\63\2\3\2\64"+
    "\2\65\1\66\1\0\1\3\2\67\1\3\1\0\1\3"+
    "\1\70\2\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[185];
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
    "\0\0\0\75\0\172\0\267\0\364\0\u0131\0\u016e\0\u01ab"+
    "\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319\0\u0356\0\u0393"+
    "\0\u03d0\0\u040d\0\75\0\75\0\75\0\75\0\75\0\u044a"+
    "\0\u0487\0\u04c4\0\u0501\0\u053e\0\u057b\0\u05b8\0\u05f5\0\u0632"+
    "\0\u066f\0\u06ac\0\u06e9\0\u0726\0\u0763\0\u07a0\0\u07dd\0\75"+
    "\0\75\0\75\0\u081a\0\u0857\0\u0894\0\u08d1\0\u090e\0\u094b"+
    "\0\u0988\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c\0\75\0\75\0\u0ab9"+
    "\0\75\0\u0af6\0\u0b33\0\u0b70\0\u0bad\0\u0bea\0\u0894\0\u0c27"+
    "\0\u0c64\0\u0ca1\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\75\0\u0501\0\u0cde\0\u0d1b\0\75\0\u0d58\0\u0d95"+
    "\0\u0dd2\0\u0e0f\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d"+
    "\0\75\0\u0fba\0\172\0\u0ff7\0\u1034\0\172\0\u1071\0\u10ae"+
    "\0\u10eb\0\u1128\0\u1165\0\u11a2\0\u11df\0\u09c5\0\u121c\0\172"+
    "\0\u090e\0\u0894\0\75\0\u1259\0\u1296\0\u12d3\0\u1310\0\u134d"+
    "\0\u138a\0\u13c7\0\u1404\0\u1441\0\u147e\0\u14bb\0\u14f8\0\u1535"+
    "\0\u1572\0\u15af\0\u15ec\0\75\0\172\0\u1629\0\u1666\0\u16a3"+
    "\0\u16e0\0\u171d\0\u175a\0\u1797\0\u17d4\0\u121c\0\75\0\u1811"+
    "\0\172\0\u184e\0\75\0\172\0\75\0\172\0\172\0\u188b"+
    "\0\u18c8\0\u1905\0\u1942\0\u197f\0\u19bc\0\u19f9\0\u1a36\0\172"+
    "\0\u1a73\0\u1ab0\0\u1aed\0\u1b2a\0\75\0\172\0\75\0\172"+
    "\0\u1b67\0\75\0\172\0\u1ba4\0\u1be1\0\75\0\u1c1e\0\172"+
    "\0\u1c5b\0\u1c98\0\75\0\172\0\75\0\172\0\172\0\u1cd5"+
    "\0\u1d12\0\75\0\172\0\u1d4f\0\u1d8c\0\u1dc9\0\172\0\75"+
    "\0\172";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[185];
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
    "\1\2\1\3\1\4\1\5\1\6\1\3\1\7\1\10"+
    "\1\4\1\11\1\2\1\12\1\2\1\13\1\14\1\15"+
    "\1\16\4\2\1\17\1\20\2\11\1\0\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\3\1\2\1\3\1\37"+
    "\1\40\1\41\4\3\1\42\1\43\1\3\1\44\1\45"+
    "\1\3\1\46\1\47\1\50\1\51\1\52\76\0\1\3"+
    "\2\53\1\0\2\3\1\0\1\53\2\0\1\54\1\0"+
    "\3\55\1\56\24\0\4\3\1\0\2\3\1\0\5\3"+
    "\1\0\7\3\4\0\1\57\2\4\1\0\2\57\1\0"+
    "\1\4\2\0\1\60\1\0\3\57\1\61\24\0\4\57"+
    "\1\0\2\57\1\0\5\57\1\0\7\57\4\0\1\57"+
    "\2\4\1\0\1\62\1\57\1\0\1\63\2\0\1\60"+
    "\1\0\3\57\1\61\24\0\4\57\1\0\2\57\1\0"+
    "\5\57\1\0\7\57\5\0\1\64\1\65\1\66\3\0"+
    "\1\64\22\0\1\67\42\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\0\2\3\1\70\2\3\1\0"+
    "\7\3\12\0\1\71\76\0\1\11\15\0\2\11\60\0"+
    "\1\15\5\0\1\15\1\0\1\15\51\0\1\72\2\73"+
    "\1\0\2\72\1\0\1\73\2\74\1\75\1\0\3\73"+
    "\1\76\7\0\1\74\14\0\4\72\1\0\2\72\1\0"+
    "\5\72\1\0\7\72\4\0\1\57\2\55\1\0\2\57"+
    "\1\0\1\55\2\0\1\54\1\0\1\55\1\77\1\55"+
    "\1\56\24\0\4\57\1\0\2\57\1\0\5\57\1\0"+
    "\7\57\4\0\1\57\2\55\1\0\2\57\1\0\1\55"+
    "\2\0\1\54\1\0\3\55\1\56\24\0\4\57\1\0"+
    "\2\57\1\0\5\57\1\0\7\57\24\0\2\15\1\100"+
    "\76\0\1\101\1\102\4\0\1\103\74\0\1\104\73\0"+
    "\1\105\1\106\74\0\1\107\74\0\1\110\74\0\1\111"+
    "\74\0\1\112\42\0\3\113\1\0\2\113\1\0\3\113"+
    "\1\114\1\0\3\113\1\115\7\0\1\113\13\0\1\116"+
    "\4\113\1\0\2\113\1\0\5\113\1\0\7\113\4\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\1\3\1\117\2\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\4\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\2\3\1\120\1\3\1\0\2\3\1\0"+
    "\5\3\1\0\7\3\4\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\0\5\3\1\0\3\3\1\121"+
    "\3\3\4\0\1\3\2\53\1\0\2\3\1\0\1\53"+
    "\2\0\1\54\1\0\3\55\1\56\24\0\3\3\1\122"+
    "\1\0\2\3\1\0\1\3\1\123\1\124\2\3\1\0"+
    "\7\3\61\0\1\125\11\0\1\126\5\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\3\1\0\2\3\1\0\1\3\1\127"+
    "\3\3\1\0\5\3\1\130\1\3\11\0\1\131\51\0"+
    "\1\132\15\0\1\3\2\53\1\0\1\3\1\133\1\0"+
    "\1\53\2\0\1\54\1\0\3\55\1\56\24\0\4\3"+
    "\1\0\2\3\1\0\3\3\1\134\1\3\1\0\7\3"+
    "\4\0\1\3\2\53\1\0\2\3\1\0\1\53\2\0"+
    "\1\54\1\0\3\55\1\56\24\0\2\3\1\135\1\3"+
    "\1\0\2\3\1\0\2\3\1\136\2\3\1\0\7\3"+
    "\4\0\1\3\2\53\1\0\2\3\1\0\1\53\2\0"+
    "\1\54\1\0\3\55\1\56\24\0\4\3\1\0\2\3"+
    "\1\0\2\3\1\137\2\3\1\0\7\3\4\0\1\3"+
    "\2\53\1\0\2\3\1\0\1\53\2\0\1\54\1\0"+
    "\3\55\1\56\24\0\1\3\1\140\2\3\1\0\2\3"+
    "\1\0\1\3\1\141\3\3\1\0\7\3\4\0\1\3"+
    "\2\53\1\0\2\3\1\0\1\53\2\0\1\54\1\0"+
    "\3\55\1\56\24\0\4\3\1\0\2\3\1\0\2\3"+
    "\1\142\2\3\1\0\7\3\4\0\3\53\1\0\2\53"+
    "\1\0\1\53\34\0\4\53\1\0\2\53\1\0\5\53"+
    "\1\0\7\53\17\0\1\55\5\0\1\55\1\0\1\55"+
    "\51\0\1\143\2\55\1\0\2\143\1\0\1\55\2\0"+
    "\1\54\1\0\3\55\1\56\24\0\4\143\1\0\2\143"+
    "\1\0\5\143\1\0\7\143\24\0\2\55\1\144\52\0"+
    "\3\57\1\0\2\57\1\0\1\57\2\0\1\60\1\0"+
    "\3\57\1\61\24\0\4\57\1\0\2\57\1\0\5\57"+
    "\1\0\7\57\17\0\1\57\5\0\1\57\1\0\1\57"+
    "\71\0\2\57\1\145\52\0\1\57\2\146\1\0\1\57"+
    "\1\146\1\0\1\146\2\0\1\60\1\0\3\57\1\61"+
    "\24\0\1\146\1\57\2\146\1\0\1\57\1\146\1\0"+
    "\5\57\1\0\2\57\1\146\4\57\4\0\1\57\2\4"+
    "\1\0\2\57\1\0\1\63\2\0\1\60\1\0\3\57"+
    "\1\61\24\0\4\57\1\0\2\57\1\0\5\57\1\0"+
    "\7\57\5\0\2\64\4\0\1\64\66\0\2\64\1\0"+
    "\1\147\2\0\1\64\65\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\1\3\1\150\2\3\1\0\2\3\1\0\5\3\1\0"+
    "\7\3\4\0\3\57\1\0\2\57\1\0\1\57\2\0"+
    "\1\60\1\0\1\151\2\57\1\61\24\0\4\57\1\0"+
    "\2\57\1\0\5\57\1\0\7\57\4\0\1\143\2\55"+
    "\1\0\2\143\1\0\1\55\2\0\1\54\1\0\1\152"+
    "\2\55\1\56\24\0\4\143\1\0\2\143\1\0\5\143"+
    "\1\0\7\143\20\0\1\153\73\0\1\73\5\0\1\73"+
    "\1\0\1\73\71\0\2\73\1\154\75\0\1\15\50\0"+
    "\27\101\3\0\43\101\26\102\1\155\46\102\14\0\1\113"+
    "\5\0\1\113\1\0\1\113\71\0\2\113\1\156\52\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\2\3\1\157\1\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\4\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\3\3\1\160\1\0\2\3\1\0\4\3"+
    "\1\161\1\0\7\3\4\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\162\1\163\4\3\1\0\7\3"+
    "\4\0\1\3\2\53\1\0\2\3\1\0\1\53\2\0"+
    "\1\54\1\0\3\55\1\56\24\0\4\3\1\0\2\3"+
    "\1\164\1\165\4\3\1\0\7\3\4\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\3\3\1\166\1\0\2\3\1\0\5\3"+
    "\1\0\7\3\4\0\1\3\2\53\1\0\2\3\1\0"+
    "\1\53\2\0\1\54\1\0\3\55\1\56\24\0\4\3"+
    "\1\0\2\3\1\0\3\3\1\167\1\3\1\0\7\3"+
    "\62\0\1\170\77\0\2\171\12\0\1\3\2\53\1\0"+
    "\2\3\1\0\1\53\2\0\1\54\1\0\3\55\1\56"+
    "\24\0\4\3\1\0\2\3\1\0\2\3\1\172\2\3"+
    "\1\0\7\3\4\0\1\3\2\53\1\0\2\3\1\0"+
    "\1\53\2\0\1\54\1\0\3\55\1\56\24\0\4\3"+
    "\1\0\2\3\1\0\5\3\1\171\1\173\6\3\64\0"+
    "\1\174\14\0\1\3\2\53\1\0\2\3\1\0\1\53"+
    "\2\0\1\54\1\0\3\55\1\56\24\0\4\3\1\0"+
    "\2\3\1\0\4\3\1\175\1\0\7\3\4\0\1\3"+
    "\2\53\1\0\1\3\1\176\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\4\3\1\0\2\3\1\0"+
    "\5\3\1\0\7\3\4\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\0\3\3\1\177\1\3\1\0"+
    "\7\3\4\0\1\3\2\53\1\0\2\3\1\0\1\53"+
    "\2\0\1\54\1\0\3\55\1\56\24\0\4\3\1\0"+
    "\2\3\1\0\5\3\1\200\1\201\6\3\4\0\1\3"+
    "\2\53\1\0\2\3\1\0\1\53\2\0\1\54\1\0"+
    "\3\55\1\56\24\0\4\3\1\0\2\3\1\0\5\3"+
    "\1\202\1\203\6\3\4\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\0\5\3\1\204\1\205\6\3"+
    "\4\0\1\143\3\0\2\143\4\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\143\1\0\2\143\1\0\5\143\1\0"+
    "\7\143\27\0\1\55\74\0\1\57\52\0\2\206\2\0"+
    "\1\206\1\0\1\206\34\0\1\206\1\0\2\206\2\0"+
    "\1\206\11\0\1\206\33\0\1\73\50\0\25\102\1\207"+
    "\1\155\46\102\24\0\1\113\51\0\1\3\2\53\1\0"+
    "\2\3\1\0\1\53\2\0\1\54\1\0\3\55\1\56"+
    "\24\0\3\3\1\210\1\0\2\3\1\0\5\3\1\0"+
    "\7\3\4\0\1\3\2\53\1\0\2\3\1\0\1\53"+
    "\2\0\1\54\1\0\3\55\1\56\24\0\4\3\1\0"+
    "\2\3\1\0\5\3\1\0\2\3\1\211\4\3\4\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\4\3\1\0\2\3\1\0"+
    "\5\3\1\0\1\3\1\212\5\3\52\0\1\213\26\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\2\3\1\214\1\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\52\0\1\215\26\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\2\3\1\216\1\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\4\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\1\3\1\217\2\3\1\0\2\3\1\0"+
    "\5\3\1\0\7\3\4\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\220\1\221\3\3\1\222\1\0"+
    "\7\3\51\0\1\223\107\0\1\224\14\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\1\3\1\225\2\3\1\0\2\3\1\0"+
    "\5\3\1\0\7\3\4\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\0\4\3\1\226\1\0\7\3"+
    "\4\0\1\3\2\53\1\0\2\3\1\0\1\53\2\0"+
    "\1\54\1\0\3\55\1\56\24\0\3\3\1\227\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\4\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\3\1\0\2\3\1\0\5\3\1\0"+
    "\4\3\1\230\2\3\64\0\1\231\14\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\3\1\0\2\3\1\0\4\3\1\232"+
    "\1\0\7\3\71\0\1\233\7\0\1\3\2\53\1\0"+
    "\2\3\1\0\1\53\2\0\1\54\1\0\3\55\1\56"+
    "\24\0\4\3\1\0\2\3\1\0\5\3\1\0\3\3"+
    "\1\234\3\3\70\0\1\235\10\0\1\3\2\53\1\0"+
    "\2\3\1\0\1\53\2\0\1\54\1\0\3\55\1\56"+
    "\24\0\4\3\1\0\2\3\1\0\5\3\1\0\2\3"+
    "\1\236\4\3\4\0\1\3\2\53\1\0\2\3\1\0"+
    "\1\53\2\0\1\54\1\0\3\55\1\56\24\0\4\3"+
    "\1\237\1\240\1\3\1\0\5\3\1\0\7\3\4\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\1\3\1\241\2\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\64\0\1\242\14\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\4\3\1\0\2\3\1\0"+
    "\4\3\1\243\1\0\7\3\4\0\1\3\2\53\1\0"+
    "\2\3\1\0\1\53\2\0\1\54\1\0\3\55\1\56"+
    "\24\0\4\3\1\0\2\3\1\0\5\3\1\244\1\245"+
    "\6\3\64\0\1\246\66\0\1\247\22\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\3\1\0\2\3\1\0\4\3\1\250"+
    "\1\0\7\3\4\0\1\3\2\53\1\0\2\3\1\0"+
    "\1\53\2\0\1\54\1\0\3\55\1\56\24\0\4\3"+
    "\1\0\1\3\1\251\1\0\5\3\1\0\7\3\4\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\4\3\1\0\2\3\1\0"+
    "\5\3\1\0\1\3\1\252\5\3\52\0\1\253\26\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\2\3\1\254\1\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\52\0\1\255\26\0"+
    "\1\3\2\53\1\0\2\3\1\0\1\53\2\0\1\54"+
    "\1\0\3\55\1\56\24\0\2\3\1\256\1\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\4\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\3\1\0\2\3\1\0\3\3\1\257"+
    "\1\3\1\0\7\3\63\0\1\260\15\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\3\1\0\2\3\1\0\3\3\1\261"+
    "\1\3\1\0\7\3\61\0\1\262\17\0\1\3\2\53"+
    "\1\0\2\3\1\0\1\53\2\0\1\54\1\0\3\55"+
    "\1\56\24\0\4\3\1\0\2\3\1\0\1\3\1\263"+
    "\3\3\1\0\7\3\4\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\0\5\3\1\0\3\3\1\264"+
    "\3\3\67\0\1\265\11\0\1\3\2\53\1\0\2\3"+
    "\1\0\1\53\2\0\1\54\1\0\3\55\1\56\24\0"+
    "\4\3\1\0\2\3\1\0\5\3\1\0\1\3\1\266"+
    "\5\3\4\0\1\3\2\53\1\0\2\3\1\0\1\53"+
    "\2\0\1\54\1\0\3\55\1\56\24\0\4\3\1\0"+
    "\2\3\1\0\4\3\1\267\1\0\7\3\52\0\1\270"+
    "\26\0\1\3\2\53\1\0\2\3\1\0\1\53\2\0"+
    "\1\54\1\0\3\55\1\56\24\0\2\3\1\271\1\3"+
    "\1\0\2\3\1\0\5\3\1\0\7\3\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7686];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\20\1\5\11\20\1\3\11\1\1\1\0"+
    "\1\1\1\0\1\1\2\0\4\1\2\11\1\1\1\11"+
    "\2\1\3\0\1\1\1\0\1\1\1\0\10\11\3\0"+
    "\1\11\6\1\2\0\2\1\1\11\1\0\11\1\2\0"+
    "\1\1\1\0\3\1\1\11\3\0\3\1\1\0\1\1"+
    "\1\0\3\1\2\0\2\1\1\11\3\1\1\0\1\1"+
    "\1\0\1\1\1\0\2\1\1\11\3\1\1\11\1\1"+
    "\1\11\2\1\1\0\2\1\2\0\4\1\1\0\1\1"+
    "\1\0\1\1\1\11\1\1\1\11\2\1\1\11\1\1"+
    "\1\0\1\1\1\11\1\0\3\1\1\11\1\1\1\11"+
    "\2\1\1\0\1\1\1\11\2\1\1\0\2\1\1\11"+
    "\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[185];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerCup(java.io.Reader in) {
    this.zzReader = in;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("ERROR: " + yytext() + " columna: " + yycolumn + " fila: " + yyline);
            }
          case 58: break;
          case 2: 
            { System.out.println("ERROR:" + yytext() + " columna: " + yycolumn + " fila: " + yyline);
            }
          case 59: break;
          case 3: 
            { return new Symbol(Sym.IDENTIFIER, yycolumn, yyline, yytext());
            }
          case 60: break;
          case 4: 
            { return new Symbol(Sym.NUMBER, yycolumn, yyline, yytext());
            }
          case 61: break;
          case 5: 
            { return new Symbol(Sym.SUB, yycolumn, yyline, yytext());
            }
          case 62: break;
          case 6: 
            { /*Ignore*/
            }
          case 63: break;
          case 7: 
            { return new Symbol(Sym.DIV, yycolumn, yyline, yytext());
            }
          case 64: break;
          case 8: 
            { return new Symbol(Sym.MUL, yycolumn, yyline, yytext());
            }
          case 65: break;
          case 9: 
            { return new Symbol(Sym.ADD, yycolumn, yyline, yytext());
            }
          case 66: break;
          case 10: 
            { return new Symbol(Sym.EQUAL, yycolumn, yyline, yytext());
            }
          case 67: break;
          case 11: 
            { return new Symbol(Sym.MOD, yycolumn, yyline, yytext());
            }
          case 68: break;
          case 12: 
            { return new Symbol(Sym.OPEN_BRACKET, yycolumn, yyline, yytext());
            }
          case 69: break;
          case 13: 
            { return new Symbol(Sym.CLOSE_BRACKET, yycolumn, yyline, yytext());
            }
          case 70: break;
          case 14: 
            { return new Symbol(Sym.OPEN_KEY, yycolumn, yyline, yytext());
            }
          case 71: break;
          case 15: 
            { return new Symbol(Sym.CLOSE_KEY, yycolumn, yyline, yytext());
            }
          case 72: break;
          case 16: 
            { return new Symbol(Sym.LESS, yycolumn, yyline, yytext());
            }
          case 73: break;
          case 17: 
            { return new Symbol(Sym.GREATER, yycolumn, yyline, yytext());
            }
          case 74: break;
          case 18: 
            { return new Symbol(Sym.LOGICAL_NOT, yycolumn, yyline, yytext());
            }
          case 75: break;
          case 19: 
            { return new Symbol(Sym.SEMICOLON, yycolumn, yyline, yytext());
            }
          case 76: break;
          case 20: 
            { return new Symbol(Sym.COMMA, yycolumn, yyline, yytext());
            }
          case 77: break;
          case 21: 
            { return new Symbol(Sym.COLON, yycolumn, yyline, yytext());
            }
          case 78: break;
          case 22: 
            { return new Symbol(Sym.OCTAL_NUMBER, yycolumn, yyline, yytext());
            }
          case 79: break;
          case 23: 
            { return new Symbol(Sym.DECR, yycolumn, yyline, yytext());
            }
          case 80: break;
          case 24: 
            { return new Symbol(Sym.SUB_EQUAL, yycolumn, yyline, yytext());
            }
          case 81: break;
          case 25: 
            { return new Symbol(Sym.LOGICAL_OR, yycolumn, yyline, yytext());
            }
          case 82: break;
          case 26: 
            { return new Symbol(Sym.LOGICAL_AND, yycolumn, yyline, yytext());
            }
          case 83: break;
          case 27: 
            { return new Symbol(Sym.DIV_EQUAL, yycolumn, yyline, yytext());
            }
          case 84: break;
          case 28: 
            { return new Symbol(Sym.MUL_EQUAL, yycolumn, yyline, yytext());
            }
          case 85: break;
          case 29: 
            { return new Symbol(Sym.INCR, yycolumn, yyline, yytext());
            }
          case 86: break;
          case 30: 
            { return new Symbol(Sym.ADD_EQUAL, yycolumn, yyline, yytext());
            }
          case 87: break;
          case 31: 
            { return new Symbol(Sym.EQUAL_TO, yycolumn, yyline, yytext());
            }
          case 88: break;
          case 32: 
            { return new Symbol(Sym.GREATER_EQUAL, yycolumn, yyline, yytext());
            }
          case 89: break;
          case 33: 
            { return new Symbol(Sym.LESS_EQUAL, yycolumn, yyline, yytext());
            }
          case 90: break;
          case 34: 
            { return new Symbol(Sym.NOT_EQUAL, yycolumn, yyline, yytext());
            }
          case 91: break;
          case 35: 
            { return new Symbol(Sym.LITERAL_STR, yycolumn, yyline, yytext());
            }
          case 92: break;
          case 36: 
            { return new Symbol(Sym.I_IF, yycolumn, yyline, yytext());
            }
          case 93: break;
          case 37: 
            { return new Symbol(Sym.I_DO, yycolumn, yyline, yytext());
            }
          case 94: break;
          case 38: 
            { return new Symbol(Sym.HEXADECIMAL_NUMBER, yycolumn, yyline, yytext());
            }
          case 95: break;
          case 39: 
            { return new Symbol(Sym.I_FOR, yycolumn, yyline, yytext());
            }
          case 96: break;
          case 40: 
            { return new Symbol(Sym.LITERAL_CHAR, yycolumn, yyline, yytext());
            }
          case 97: break;
          case 41: 
            { return new Symbol(Sym.I_INT, yycolumn, yyline, yytext());
            }
          case 98: break;
          case 42: 
            { /* Ignore */
            }
          case 99: break;
          case 43: 
            { return new Symbol(Sym.I_READ, yycolumn, yyline, yytext());
            }
          case 100: break;
          case 44: 
            { return new Symbol(Sym.I_ELSE, yycolumn, yyline, yytext());
            }
          case 101: break;
          case 45: 
            { return new Symbol(Sym.I_CASE, yycolumn, yyline, yytext());
            }
          case 102: break;
          case 46: 
            { return new Symbol(Sym.I_CHAR, yycolumn, yyline, yytext());
            }
          case 103: break;
          case 47: 
            { return new Symbol(Sym.I_LONG, yycolumn, yyline, yytext());
            }
          case 104: break;
          case 48: 
            { return new Symbol(Sym.I_VOID, yycolumn, yyline, yytext());
            }
          case 105: break;
          case 49: 
            { return new Symbol(Sym.I_BREAK, yycolumn, yyline, yytext());
            }
          case 106: break;
          case 50: 
            { return new Symbol(Sym.I_CONST, yycolumn, yyline, yytext());
            }
          case 107: break;
          case 51: 
            { return new Symbol(Sym.I_SHORT, yycolumn, yyline, yytext());
            }
          case 108: break;
          case 52: 
            { return new Symbol(Sym.I_WRITE, yycolumn, yyline, yytext());
            }
          case 109: break;
          case 53: 
            { return new Symbol(Sym.I_WHILE, yycolumn, yyline, yytext());
            }
          case 110: break;
          case 54: 
            { return new Symbol(Sym.I_RETURN, yycolumn, yyline, yytext());
            }
          case 111: break;
          case 55: 
            { return new Symbol(Sym.I_SWITCH, yycolumn, yyline, yytext());
            }
          case 112: break;
          case 56: 
            { return new Symbol(Sym.I_DEFAULT, yycolumn, yyline, yytext());
            }
          case 113: break;
          case 57: 
            { return new Symbol(Sym.I_CONTINUE, yycolumn, yyline, yytext());
            }
          case 114: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
