package com.company.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil
{
  public static String fileToBeRead = "my-store-display.xls";

  public static void main(String[] argv)
  {
    try
    {
      FileInputStream fis = new FileInputStream(fileToBeRead);

      Workbook workBook = create(fis);
      Sheet sheet = workBook.getSheetAt(0);

      Row row = sheet.getRow(0);
      Cell cell0 = row.getCell(0);
      Cell cell1 = row.getCell(1);

      System.out.println(cell0.toString());
      System.out.println(cell1.toString());
    }
    catch (Exception e) {
      System.out.println("已运行xlRead() : " + e);
    }
  }

  public static Workbook create(InputStream inp)
    throws IOException, InvalidFormatException
  {
    if (!inp.markSupported()) {
      inp = new PushbackInputStream(inp, 8);
    }
    if (POIFSFileSystem.hasPOIFSHeader(inp)) {
      return new HSSFWorkbook(inp);
    }
    if (POIXMLDocument.hasOOXMLHeader(inp)) {
      return new XSSFWorkbook(OPCPackage.open(inp));
    }
    throw new IllegalArgumentException("你的excel版本目前poi解析不了");
  }
}