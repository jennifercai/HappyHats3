package hats3.print;

import java.awt.print.*;
/**
 * Print class creates the HighScorePrinter to print out the high scores.
 * @author Cindy Lian
 * @author Jennifer Cai
 * @version 4.0, June 10, 2013
 */
public class Print 
{
  /**
   * The constructor creates a printer job the high score printer to print out the high scores.
   * <p>
   * Variable Dictionary<br>
   * print - PrinterJob - Gets the Printer Job<br>
   * </p>
   * @throws PrinterException e
   */
  public Print ()
  {
    PrinterJob print = PrinterJob.getPrinterJob ();
    print.setPrintable (new HighScorePrinter ());
    try
    {
      print.print ();
    }
    catch (PrinterException e)
    {
    }
  }

}