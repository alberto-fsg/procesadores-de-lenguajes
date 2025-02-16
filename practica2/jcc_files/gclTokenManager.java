/* Generated By:JavaCC: Do not edit this line. gclTokenManager.java */
package traductor;

/** Token Manager. */
public class gclTokenManager implements gclConstants
{
    public static void CommonTokenAction(Token t) {
        System.out.printf("(%d,%d): %s \"%s\"%n",
            t.beginLine, t.beginColumn, getTokenType(t.kind), t.image);
    }

    private static String getTokenType(int kind) {
        switch(kind) {
            case gclConstants.tIDENTIFICADOR: return "identificador";
            case gclConstants.tASSIGN: return "operador asignaci\u00f3n";
            case gclConstants.tCONSTANT: return "constante entera";
            case gclConstants.tSTRING: return "cadena";
            case gclConstants.tCHAR: return "caracter";
            default: return "token"; // todos los tokens sin lexema relevante
        }
    }

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20000000000L) != 0L)
            return 0;
         if ((active0 & 0x800000L) != 0L)
            return 12;
         if ((active0 & 0x2000000L) != 0L)
            return 8;
         if ((active0 & 0x30010cf701e7f00L) != 0L)
         {
            jjmatchedKind = 58;
            return 12;
         }
         return -1;
      case 1:
         if ((active0 & 0x200000000L) != 0L)
            return 12;
         if ((active0 & 0x30010cd701e7f00L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 1;
            return 12;
         }
         return -1;
      case 2:
         if ((active0 & 0x3000048601c7f00L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 2;
            return 12;
         }
         if ((active0 & 0x108510020000L) != 0L)
            return 12;
         return -1;
      case 3:
         if ((active0 & 0x860000000L) != 0L)
            return 12;
         if ((active0 & 0x3000040001c7f00L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 3;
            return 12;
         }
         return -1;
      case 4:
         if ((active0 & 0x200000000002000L) != 0L)
            return 12;
         if ((active0 & 0x1000040001c5f00L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 4;
            return 12;
         }
         return -1;
      case 5:
         if ((active0 & 0x100004000185f00L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 5;
            return 12;
         }
         if ((active0 & 0x40000L) != 0L)
            return 12;
         return -1;
      case 6:
         if ((active0 & 0x600L) != 0L)
            return 12;
         if ((active0 & 0x100004000185900L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 6;
            return 12;
         }
         return -1;
      case 7:
         if ((active0 & 0x184100L) != 0L)
            return 12;
         if ((active0 & 0x100004000001800L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 7;
            return 12;
         }
         return -1;
      case 8:
         if ((active0 & 0x100004000001800L) != 0L)
            return 12;
         return -1;
      case 9:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 9;
            return 12;
         }
         return -1;
      case 10:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 10;
            return 12;
         }
         return -1;
      case 11:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 11;
            return 12;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 47);
      case 38:
         return jjStopAtPos(0, 45);
      case 39:
         return jjStartNfaWithStates_0(0, 25, 8);
      case 40:
         return jjStopAtPos(0, 36);
      case 41:
         return jjStopAtPos(0, 37);
      case 42:
         return jjStopAtPos(0, 42);
      case 43:
         return jjStopAtPos(0, 40);
      case 44:
         return jjStopAtPos(0, 21);
      case 45:
         return jjStartNfaWithStates_0(0, 41, 0);
      case 46:
         return jjStopAtPos(0, 54);
      case 47:
         return jjStopAtPos(0, 43);
      case 58:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 59:
         return jjStopAtPos(0, 22);
      case 60:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0x28000000000000L);
      case 61:
         return jjStopAtPos(0, 52);
      case 62:
         jjmatchedKind = 48;
         return jjMoveStringLiteralDfa1_0(0x2000000000000L);
      case 91:
         return jjStopAtPos(0, 26);
      case 93:
         return jjStopAtPos(0, 27);
      case 95:
         return jjStartNfaWithStates_0(0, 23, 12);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x40080400L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40200L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200008420000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x100200000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x4000000100L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x3800L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 124:
         return jjStopAtPos(0, 46);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         break;
      case 62:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(1, 53);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000840080400L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000010025800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100002000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40200L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000100000L);
      case 81:
      case 113:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 12);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000100L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 12);
         break;
      case 68:
      case 100:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20006000L);
      case 70:
      case 102:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 12);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 76:
      case 108:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 12);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x100100L);
      case 81:
      case 113:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 12);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000080400L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40001800L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x40200L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x80600L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1800L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x42000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 76:
      case 108:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 79:
      case 111:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 12);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000080200L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x100400L);
      case 79:
      case 111:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 57, 12);
         break;
      case 82:
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x41900L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x100300L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000001800L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 79:
      case 111:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 12);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0x1800L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000000080000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000L);
      case 82:
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 9, 12);
         break;
      case 84:
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(7, 8, 12);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000001800L);
      case 78:
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 12);
         break;
      case 79:
      case 111:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 20, 12);
         break;
      case 82:
      case 114:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(7, 19, 12);
         return jjMoveStringLiteralDfa8_0(active0, 0x100000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 38, 12);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 56, 12);
         break;
      case 82:
      case 114:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 8;
         }
         return jjMoveStringLiteralDfa9_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 76:
      case 108:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(12, 12, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(10);
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(5, 6);
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 5:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 34 && kind > 15)
                     kind = 15;
                  break;
               case 7:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if (curChar == 39 && kind > 16)
                     kind = 16;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(10);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 12:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(12);
                  break;
               case 1:
                  jjAddStates(0, 1);
                  break;
               case 5:
                  jjAddStates(2, 3);
                  break;
               case 8:
                  jjstateSet[jjnewStateCnt++] = 9;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 5, 6, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, "\54", "\73", "\137", "\72\75", 
"\47", "\133", "\135", null, null, null, "\72", null, null, null, null, "\50", "\51", 
null, null, "\53", "\55", "\52", "\57", null, "\46", "\174", "\41", "\76", "\76\75", 
"\74", "\74\75", "\75", "\74\76", "\56", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0xfffffffffffff01L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[13];
static private final int[] jjstateSet = new int[26];
static protected char curChar;
/** Constructor. */
public gclTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public gclTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      CommonTokenAction(matchedToken);
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 59)
   {
      jjmatchedKind = 59;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         CommonTokenAction(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
