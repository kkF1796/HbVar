/* Generated By:JavaCC: Do not edit this line. GrammarHbVarTokenManager.java */
package grammarHbVar;
import user.*;
import java.util.*;
import java.io.*;
import mutationStructures.*;
import helpers.*;
import java.lang.Object;

/** Token Manager. */
public class GrammarHbVarTokenManager implements GrammarHbVarConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1f7fffffffff8000L) != 0L)
         {
            jjmatchedKind = 7;
            return -1;
         }
         if ((active0 & 0x80000000000000L) != 0L)
         {
            jjmatchedKind = 8;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0x1f7fffffffff8000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x80000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 8;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x1f7fffffffdc0000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x80000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 8;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x1f7ffc0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x1f07dc0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x1f07cc0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0xf07000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0xf07000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0xf07000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0xf07000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0xf05000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0xf05000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x805000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x804000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x804000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x804000000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 7;
               jjmatchedPos = 0;
            }
            return -1;
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
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 4);
      case 32:
         return jjStopAtPos(0, 1);
      case 42:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x600080007940000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x8000008000000L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x40030400000L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x40200000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x300000000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x30000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x1800000000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x30002000000000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x1c000000000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x100c00000080000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1000000000000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x800000000000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x2000000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40000000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      default :
         return jjMoveNfa_0(0, 0);
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
      case 42:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 62:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000040000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L);
      case 82:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 98:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x5302500000000L);
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000b1400000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0xd00000000180000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1002000000000000L);
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         return jjMoveStringLiteralDfa2_0(active0, 0x9002000000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x50000000000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x10208000000L);
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
      case 42:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(2, 14);
         break;
      case 48:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(2, 55);
         break;
      case 68:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000000000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x28000000000000L);
      case 97:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(2, 24);
         return jjMoveStringLiteralDfa3_0(active0, 0xc0000000000L);
      case 100:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1502000000000000L);
      case 101:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(2, 31);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(2, 35);
         break;
      case 103:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(2, 25);
         break;
      case 108:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(2, 41);
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      case 110:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(2, 26);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(2, 28);
         break;
      case 111:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(2, 36);
         return jjMoveStringLiteralDfa3_0(active0, 0x50000000000000L);
      case 112:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(2, 23);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(2, 39);
         return jjMoveStringLiteralDfa3_0(active0, 0x1c00000000000L);
      case 114:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(2, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(2, 38);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(2, 40);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L);
      case 115:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(2, 27);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(2, 30);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(2, 33);
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000000L);
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(2, 34);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000000L);
      case 117:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(2, 22);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(2, 32);
         break;
      case 121:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(2, 29);
         break;
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
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x700000000000000L);
      case 72:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(3, 51);
         break;
      case 80:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(3, 53);
         break;
      case 97:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(3, 45);
         break;
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0xc00000000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x40c0000000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000000L);
      case 112:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(3, 52);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(3, 54);
         break;
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
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
      case 97:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(4, 44);
         return jjMoveStringLiteralDfa5_0(active0, 0x1c00000000000L);
      case 102:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x704000000000000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0xc0000000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000000L);
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
      case 49:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(5, 46);
         break;
      case 50:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(5, 47);
         break;
      case 97:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(5, 42);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(5, 43);
         break;
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x704000000000000L);
      case 115:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(5, 60);
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000000000L);
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
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000000L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x803000000000000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x700000000000000L);
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
      case 100:
         return jjMoveStringLiteralDfa8_0(active0, 0x803000000000000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x700000000000000L);
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000000000L);
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
      case 32:
         return jjMoveStringLiteralDfa9_0(active0, 0x807000000000000L);
      case 114:
         return jjMoveStringLiteralDfa9_0(active0, 0x700000000000000L);
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
      case 67:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(9, 49);
         break;
      case 98:
         return jjMoveStringLiteralDfa10_0(active0, 0x800000000000000L);
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000000000000L);
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x700000000000000L);
      case 119:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000000000L);
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
      case 101:
         return jjMoveStringLiteralDfa11_0(active0, 0xf04000000000000L);
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000000000L);
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
      case 100:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(11, 56);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(11, 57);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(11, 58);
         break;
      case 113:
         return jjMoveStringLiteralDfa12_0(active0, 0x4000000000000L);
      case 116:
         return jjMoveStringLiteralDfa12_0(active0, 0x801000000000000L);
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
      case 104:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(12, 48);
         break;
      case 117:
         return jjMoveStringLiteralDfa13_0(active0, 0x4000000000000L);
      case 119:
         return jjMoveStringLiteralDfa13_0(active0, 0x800000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa14_0(active0, 0x804000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa15_0(active0, 0x800000000000000L);
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x4000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
static private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa16_0(active0, 0x4000000000000L);
      case 110:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(15, 59);
         break;
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(16, 50);
         break;
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0x0L, 0x105047bb00000080L
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 8;
   int i = 1;
   jjstateSet[0] = startState;
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
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAdd(7);
                  }
                  else if ((0x9c00d88100000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  else if ((0x30000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 12)
                        kind = 12;
                  }
                  else if (curChar == 62)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  else if (curChar == 45)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  break;
               case 1:
                  if (curChar == 45)
                     kind = 8;
                  break;
               case 2:
                  if (curChar == 62)
                     kind = 9;
                  break;
               case 3:
                  if ((0x30000000000L & l) != 0L)
                     kind = 10;
                  break;
               case 4:
                  if ((0x9c00d88100000000L & l) != 0L)
                     kind = 11;
                  break;
               case 5:
                  if (curChar == 36)
                     kind = 12;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(7);
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
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                  }
                  else if ((0xa8000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  break;
               case 4:
                  if ((0xa8000000L & l) != 0L)
                     kind = 11;
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
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 7)
                     kind = 7;
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
      if ((i = jjnewStateCnt) == (startsAt = 8 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\12", null, null, null, null, null, null, null, null, 
null, "\52\52\52", "\157\162", "\117\122", "\117\162", "\101\116\104", 
"\141\156\144", "\101\156\144", "\110\142", "\107\154\165", "\101\163\160", "\101\154\141", 
"\101\162\147", "\101\163\156", "\103\171\163", "\107\154\156", "\107\154\171", 
"\110\151\163", "\111\154\145", "\114\145\165", "\114\171\163", "\115\145\164", 
"\120\150\145", "\120\162\157", "\123\145\162", "\124\150\162", "\124\162\160", 
"\124\171\162", "\126\141\154", "\107\147\141\155\155\141", "\101\147\141\155\155\141", 
"\144\145\154\164\141", "\142\145\164\141", "\141\154\160\150\141\61", "\141\154\160\150\141\62", 
"\162\145\160\154\141\143\145\144\40\167\151\164\150", "\155\157\144\151\146\151\145\144\40\103", 
"\164\145\162\155\151\156\141\154\40\163\145\161\165\145\156\143\145", "\103\117\117\110", "\123\164\157\160", "\123\124\117\120", 
"\163\164\157\160", "\55\76\60", "\141\156\144\40\151\156\163\145\162\164\145\144", 
"\101\116\104\40\151\156\163\145\162\164\145\144", "\101\156\144\40\151\156\163\145\162\164\145\144", 
"\151\156\163\145\162\164\145\144\40\142\145\164\167\145\145\156", "\143\157\144\157\156\163", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffffffffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[8];
static private final int[] jjstateSet = new int[16];
static protected char curChar;
/** Constructor. */
public GrammarHbVarTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public GrammarHbVarTokenManager(SimpleCharStream stream, int lexState){
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
   for (i = 8; i-- > 0;)
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
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

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
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 13)
   {
      jjmatchedKind = 13;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
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

}
