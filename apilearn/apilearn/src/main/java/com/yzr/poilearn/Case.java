package com.yzr.poilearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Case {
	
	public static void main(String[] args) throws IOException {
		// xlsxExport();
		// xlsExport();
		xlsxImport();
	}
	
	public static void xlsxExport() throws IOException {
		// ����һ��excel����
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// ����һ�� ����������, ����������Ϊ"Ա����Ϣ"
		XSSFSheet sheet = workbook.createSheet("Ա����Ϣ");
 		sheet.setColumnWidth(3, 20 * 256); // �������ĵ���������Ϊ20���ֵĿ���
 		sheet.setColumnWidth(4, 20 * 256); // �������ĵ���������Ϊ20���ֵĿ���
 		
 		// ����һ��  �±��0��ʼ
 		XSSFRow row = sheet.createRow(0);
 		// ���������е��У� �±��0��ʼ����ͷ��
 		XSSFCell cell = row.createCell(0);
		
 		// ��cell��0���±���ֵ
 		cell.setCellValue("����");
 		//���������е���,��������ֱ�Ӹ�ֵ
 		row.createCell(1).setCellValue("����");
 		row.createCell(2).setCellValue("�Ա�");
 		row.createCell(3).setCellValue("����");
 		row.createCell(4).setCellValue("�ֻ���");
 
 		// ���ñ�������
 		row = sheet.createRow(1);
 		row.createCell(0).setCellValue("T");
 		row.createCell(1).setCellValue("����");
 		row.createCell(2).setCellValue("��");
 		row.createCell(3).setCellValue("1996-07-12");
 		row.createCell(4).setCellValue("18623970959");
 		
 		row = sheet.createRow(2);
 		row.createCell(0).setCellValue("T");
 		row.createCell(1).setCellValue("18");
 		row.createCell(2).setCellValue("Ů");
 		row.createCell(3).setCellValue("1995-04-25");
 		row.createCell(4).setCellValue("18854875347");
 		
 		// �����ļ�·��
 		File file = new File("F:\\Ա����Ϣ.xlsx");
 		FileOutputStream stream = new FileOutputStream(file);
 		workbook.write(stream);
 		stream.close();
	}
	
	public static void xlsExport() throws IOException {
		// ����һ��excel����
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		// ����һ�� ����������, ����������Ϊ"Ա����Ϣ"
		HSSFSheet sheet = workbook.createSheet("Ա����Ϣ");
 		sheet.setColumnWidth(3, 20 * 256); // �������ĵ���������Ϊ20���ֵĿ���
 		sheet.setColumnWidth(4, 20 * 256); // �������ĵ���������Ϊ20���ֵĿ���
 		
 		// ����һ��  �±��0��ʼ
 		HSSFRow row = sheet.createRow(0);
 		// ���������е��У� �±��0��ʼ����ͷ��
 		HSSFCell cell = row.createCell(0);
		
 		// ��cell��0���±���ֵ
 		cell.setCellValue("����");
 		//���������е���,��������ֱ�Ӹ�ֵ
 		row.createCell(1).setCellValue("����");
 		row.createCell(2).setCellValue("�Ա�");
 		row.createCell(3).setCellValue("����");
 		row.createCell(4).setCellValue("�ֻ���");
 		
 		// ���ñ�������
 		row = sheet.createRow(1);
 		row.createCell(0).setCellValue("T");
 		row.createCell(1).setCellValue("����");
 		row.createCell(2).setCellValue("��");
 		row.createCell(3).setCellValue("1996-07-12");
 		row.createCell(4).setCellValue("18623970959");
 		
 		row = sheet.createRow(2);
 		row.createCell(0).setCellValue("T");
 		row.createCell(1).setCellValue("18");
 		row.createCell(2).setCellValue("Ů");
 		row.createCell(3).setCellValue("1995-04-25");
 		row.createCell(4).setCellValue("18854875347");
 		
 		// �����ļ�·��
 		File file = new File("F:\\Ա����Ϣ.xls");
 		FileOutputStream stream = new FileOutputStream(file);
 		workbook.write(stream);
 		stream.close();
	}

	public static void xlsxImport() throws IOException {
		
		File file = new File("F:\\Ա����Ϣ.xlsx");
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Ա����Ϣ");
		
		// System.out.println(sheet.getLastRowNum());
		
		for (int i = 0;i <= sheet.getLastRowNum(); ++i) {
			Row row = sheet.getRow(i);
			int num = row.getLastCellNum();
			for (int j = 0;j< num; ++j)
				System.out.print(row.getCell(j).getStringCellValue() + "\t\t");
			System.out.println();
		}
		
		// ��Դ�ر�
		workbook.close();stream.close();
		
	}
	
}





