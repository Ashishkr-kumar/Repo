package com.newera.util;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.newera.model.Registration;

public class TableBuilder {

	public static PdfPTable createTable(Registration registration)
			throws DocumentException {
		
		String voucherCode=new String(ConnectionUtil.VoucherCode(16, 16, 5, 11));

		// create 6 column table
		PdfPTable table = new PdfPTable(2);

		// set the width of the table to 100% of page
		table.setWidthPercentage(100);

		// set relative columns width
		table.setWidths(new float[] { 0.6f, 1.0f });

		// ----------------Table Header "Title"----------------
		// font
		Font font = new Font(FontFamily.HELVETICA, 14, Font.BOLD,
				BaseColor.WHITE);
		// create header cell
		PdfPCell cell = new PdfPCell(new Phrase("Newera.com Voucher", font));
		// set Column span "1 cell = 6 cells width"
		cell.setColspan(6);
		// set style
		Style.headerCellStyle(cell);
		// add to table
		table.addCell(cell);

		// -----------------Table Cells Label/Value------------------

		if (registration != null) {
			// 1st Row
			if (registration.getFname() != null
					&& registration.getLname() != null) {
				table.addCell(createLabelCell("Name"));
				table.addCell(createValueCell(registration.getFname() + " "
						+ registration.getLname()));
			}
			// 2nd Row
			if (registration.getEmail() != null) {
				table.addCell(createLabelCell("Email"));
				table.addCell(createValueCell(registration.getEmail()));
			}

			// 3rd Row
			if (registration.getMobile() != null) {
				table.addCell(createLabelCell("Mobile"));
				table.addCell(createValueCell(registration.getMobile()));
			}
			// 4th Row
			if (registration.getSex() != null) {
				table.addCell(createLabelCell("Gender"));
				table.addCell(createValueCell(registration.getSex()));
			}

			// 5th Row
			if (registration.getRewardpoints() != null) {
				table.addCell(createLabelCell("Voucher Code"));
				table.addCell(createValueCell(voucherCode));
			}
			// 6th Row
			if (registration.getRewardpoints() != null) {
				table.addCell(createLabelCell("Voucher Value"));
				table.addCell(createValueCell(registration.getRewardpoints()));
				
			}
		}
		return table;
	}

	// create cells
	private static PdfPCell createLabelCell(String text) {
		// font
		Font font = new Font(FontFamily.HELVETICA, 8, Font.BOLD,
				BaseColor.DARK_GRAY);

		// create cell
		PdfPCell cell = new PdfPCell(new Phrase(text, font));

		// set style
		Style.labelCellStyle(cell);
		return cell;
	}

	// create cells
	private static PdfPCell createValueCell(String text) {
		// font
		Font font = new Font(FontFamily.HELVETICA, 8, Font.NORMAL,
				BaseColor.BLACK);

		// create cell
		PdfPCell cell = new PdfPCell(new Phrase(text, font));

		// set style
		Style.valueCellStyle(cell);
		return cell;
	}

}
