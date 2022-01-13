import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;


public class FishFlushFussTest {

   private ByteArrayOutputStream outStream, baos;
   private PrintWriter out;
   private PrintStream old;
   private String endStr;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      outStream = new ByteArrayOutputStream();
      baos = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(baos);
      // IMPORTANT: Save the old System.out!
      old = System.out;
      // Tell Java to use your special stream
      System.setOut(ps);
   }


   /** Testing basic numeric input. **/
   @Test public void basicNumTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("11\n12\n13\n5\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: 2"+"\n"+"round 3: 3"+"\n"+"round 4: 4"+"\n"+"round 5: 5"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct with no Fishes, Flushes, or Fusses", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing fish. **/
   @Test public void fishTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("3\n7\n14\n5\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: 2"+"\n"+"round 3: fish"+"\n"+"round 4: 4"+"\n"+"round 5: 5"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct with a fish but no flushes or fusses", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing flush. **/
   @Test public void flushTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("3\n4\n17\n5\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: 2"+"\n"+"round 3: fish"+"\n"+"round 4: flush"+"\n"+"round 5: 5"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct for round 4 with a flush but no fishes or fusses", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing fuss. **/
   @Test public void fussTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("8\n32\n5\n5\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: 2"+"\n"+"round 3: 3"+"\n"+"round 4: 4"+"\n"+"round 5: fuss"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct for round 5 with a fuss but no fishes or flushes", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing fishflush. **/
   @Test public void fishFlushTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("2\n3\n10\n7\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: fish"+"\n"+"round 3: flush"+"\n"+"round 4: fish"+"\n"+"round 5: 5"+"\n"+"round 6: flush"+"\n"+"round 7: 7"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct for round 6 by choosing flush over fish, and no fusses", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing flushfuss. **/
   @Test public void flushFussTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("10\n3\n2\n7\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: fuss"+"\n"+"round 3: flush"+"\n"+"round 4: fuss"+"\n"+"round 5: 5"+"\n"+"round 6: flush"+"\n"+"round 7: 7"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct for round 6 by choosing with flush over fuss, and no fishes", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing fishfuss. **/
   @Test public void fishFussTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("2\n10\n3\n7\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: fish"+"\n"+"round 3: fuss"+"\n"+"round 4: fish"+"\n"+"round 5: 5"+"\n"+"round 6: fuss"+"\n"+"round 7: 7"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct for round 6 by choosing fuss over fish, and no flushes", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing fishflushfuss. **/
   @Test public void fishFlushFussTest1() throws Exception{
      
      // Write to buffer before converting it to input
      outStream.write("2\n3\n6\n7\n".getBytes());
      // Use this to capture input
      ByteArrayInputStream in = new ByteArrayInputStream(outStream.toByteArray());
      System.setIn(in);
      FishFlushFussMain.main(new String[0]);
      String printed = baos.toString();
      String expected = "round 1: 1"+"\n"+"round 2: fish"+"\n"+"round 3: flush"+"\n"+"round 4: fish"+"\n"+"round 5: 5"+"\n"+"round 6: flamingo"+"\n"+"round 7: 7"+"\n"+System.lineSeparator();
      Assert.assertEquals("Output is correct with a flamingo.", expected, printed.substring(printed.length()-expected.length()).toLowerCase());
   }
   
   /** Testing getFish(). **/
   @Test public void getFishTest1() throws Exception{
      FishFlushFuss scp = new FishFlushFuss(3, 4, 5);
      Assert.assertEquals("getFish() returns the correct value", 3, scp.getFish());
   }
   
   /** Testing getFlush(). **/
   @Test public void getFlushTest1() throws Exception{
      FishFlushFuss scp = new FishFlushFuss(3, 4, 5);
      Assert.assertEquals("getFlush() returns the correct value", 4, scp.getFlush());
   }
   
   /** Testing getFuss(). **/
   @Test public void getFussTest1() throws Exception{
      FishFlushFuss scp = new FishFlushFuss(3, 4, 5);
      Assert.assertEquals("getFuss() returns the correct value", 5, scp.getFuss());
   }
}