
package com.newera.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {

	public static final String DATE_FORMAT = "yyyyMMdd";

	public static String formatDate(final String dateStr) throws ParseException {
		String reformattedStr = "";
		if (null != dateStr && !"".equals(dateStr)) {
			SimpleDateFormat srcFormat = new SimpleDateFormat(
				"yyyy-MM-dd hh:mm:ss");
			SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
			try {
				reformattedStr = outputFormat.format(srcFormat.parse(dateStr));
			} catch (ParseException e) {
				throw e;
			}
		}
		return reformattedStr;
	}

	/**
	 * Parse the given date to a proper string-date for the given format
	 * 
	 * @param dateToParse	
	 * @return
	 */
	public static String parseDateToString(final Date dateToParse) {
		if (dateToParse == null)
			return null;
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			return df.format(dateToParse);
		} catch (IllegalArgumentException ex) {
			return null;
		}
	}

	/**
	 * Parse the given date to a proper string-date for the given format
	 * 
	 * @param dateToParse
	 * @param dateFormat
	 * @return
	 */
	public static Date parseStringToDate(final String dateToParse,
			final String dateFormat) {

		try {
			if (null != dateToParse && !dateToParse.isEmpty()) {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				return sdf.parse(dateToParse);
			} else
				return null;
		} catch (ParseException ex) {
			return null;
		}

	}

	public static XMLGregorianCalendar getXmlGregorianCalendar(
			final GregorianCalendar gregorianCalendar) {
		XMLGregorianCalendar xmlGregorianCalendar = null;
		try {
			xmlGregorianCalendar = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			System.out.println(e.getMessage());
		}
		return xmlGregorianCalendar;
	}

	public static XMLGregorianCalendar getXmlGregorianCalendar(final String date) {
		XMLGregorianCalendar xmlGregorianCalendar = null;
		try {
			if (null != date && !date.isEmpty()) {
				xmlGregorianCalendar = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(date);
			}
		} catch (DatatypeConfigurationException e) {
			System.out.println(e.getMessage());
		}
		return xmlGregorianCalendar;
	}

	/**
	 * Add a given numbers of days to a date.
	 * 
	 * @param date the date
	 * @param days the number of days to be added. Might be negative (which
	 *        means: the number of days will be subtracted)
	 * @return the new date.
	 */
	public static Date addDays(final Date date, final int days) {
		return addDays(date, null, days);
	}

	/**
	 * Add a given numbers of days to a date.
	 * 
	 * @param date the date
	 * @param timezone the timezone to use
	 * @param days the number of days to be added. Might be negative (which
	 *        means: the number of days will be subtracted)
	 * @return the new date.
	 */
	public static Date addDays(final Date date, final TimeZone timezone,
			final int days) {
		final Calendar cal = timezone != null ? Calendar.getInstance(timezone)
				: Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

	/**
	 * Checks, if the two date objects represent the same day (ignoring the
	 * time).
	 * 
	 * @param date1 date 1
	 * @param date2 date 2
	 * @return true, if date1 and date2 represent the same day
	 */
	public static boolean isSameDay(final Date date1, final Date date2) {
		return isSameDay(date1, date2, null);
	}

	/**
	 * Checks, if the two date objects represent the same day (ignoring the
	 * time).
	 * 
	 * @param date1 date 1
	 * @param date2 date 2
	 * @param timezone the timezone
	 * @return true, if date1 and date2 represent the same day
	 */
	public static boolean isSameDay(final Date date1, final Date date2,
			final TimeZone timezone) {
		if (date1 == null || date2 == null) {
			return false;
		}

		final Calendar c1 = timezone != null ? Calendar.getInstance(timezone)
				: Calendar.getInstance();
		c1.setTime(date1);
		final Calendar c2 = timezone != null ? Calendar.getInstance(timezone)
				: Calendar.getInstance();
		c2.setTime(date2);

		if (c1.get(Calendar.YEAR) != c2.get(Calendar.YEAR)) {
			return false;
		}
		if (c1.get(Calendar.MONTH) != c2.get(Calendar.MONTH)) {
			return false;
		}
		return c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH);
	}

	public static Date convertTo(final XMLGregorianCalendar source) {
		Date date = null;
		if (source != null) {
			Calendar calendar = new GregorianCalendar();
			calendar = source.toGregorianCalendar();
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);
			date = calendar.getTime();
		}
		return date;
	}

	public static String formatDateForEDI(final Date date)
			{
		String reformattedStr = "";
		if (null != date && !"".equals(date)) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
			reformattedStr = dateFormat.format(date);

		}
		return reformattedStr;
	}

	/**
	 * Return XML Gregorain Calender from Gregorian
	 * 
	 * @param calender
	 * @return
	 */
	public static final XMLGregorianCalendar getXMLGregorian(
			final GregorianCalendar calender) {
		DatatypeFactory datatypeFactory = null;
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (final DatatypeConfigurationException ex) {
			System.out.println(ex.getMessage());
		}
		return datatypeFactory.newXMLGregorianCalendar(calender);

	}

	/**
	 * Return XML Gregorian Calender from Date
	 * 
	 * @param date
	 * @return
	 */
	public static final XMLGregorianCalendar getXMLGregorianFromDate(
			final Date date) {
		if (date != null) {
			GregorianCalendar calender = new GregorianCalendar();
			calender.setTime(date);
			return getXMLGregorian(calender);
		}
		return null;
	}

	/**
	 * Returns the year as a int value.
	 * 
	 * @param date the date
	 * @return the year as an int value.
	 */
	public static int getYear(final Date date) {
		final Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		final int year = cal.get(Calendar.YEAR);
		return year;
	}

	/**
	 * Compare the year
	 * 
	 * @param date
	 * @param y2
	 * @return
	 */
	public static boolean isSameYear(final Date date, final int y2) {
		int y1 = getYear(date);
		return (y1 == y2);
	}
	
	//This function is used to addExpiryDate in FFM Eligibility functionality
	public static XMLGregorianCalendar addExpiryDate(
			XMLGregorianCalendar effectiveDate, Date iepEndDate) {
		XMLGregorianCalendar xmlGregCal = null;
		// If effectiveDate is null put current date
		if (null == effectiveDate) {
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			DatatypeFactory datatypeFactory;
			try {
				datatypeFactory = DatatypeFactory.newInstance();
				effectiveDate = datatypeFactory
						.newXMLGregorianCalendar(gregorianCalendar);
			} catch (DatatypeConfigurationException e) {
				e.printStackTrace();
			}
		}

		/*
		 * Adding 20 days as per business functionality. If the manipulated date
		 * is greater than iepAependDate then return iepAependDate.
		 */
		Date tempeffDate = null, temptermDate = null, termdate = null;

		tempeffDate = DateUtil.convertTo(effectiveDate);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(tempeffDate);
		cal.add(Calendar.DATE, 20);

		temptermDate = cal.getTime();

		if (null != iepEndDate) {
			if (temptermDate.after(iepEndDate))
				termdate = iepEndDate;
			else
				termdate = temptermDate;
		} else
			termdate = temptermDate;

		xmlGregCal = DateUtil.getXMLGregorianFromDate(termdate);

		return xmlGregCal;
	}
	
	public static Date getFormatedDate(Date date) {
		
		Calendar calendar = Calendar.getInstance();
		if(null != date){
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
		}else{
			return null;
		}
	}
	
	/**
	 * Parse the given date to a proper string-date for the given format
	 * 
	 * @param dateToParse	
	 * @return
	 */
	public static String parseDateToString(final XMLGregorianCalendar dateToParse) {
		if (dateToParse == null)
			return null;
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date date = DateUtil.convertTo(dateToParse);
			return df.format(date);
		} catch (IllegalArgumentException ex) {
			return null;
		}
	}

	public static String getSystemDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy_HHmmss");
		Date date = new Date();
		
		return dateFormat.format(date);
		
	}
	
	/*public static Date changeFromUtc(Date utcdate, String timeZone) {
		if (null == utcdate)
			return null;
		else {
			try {
				TimeZone tz = TimeZone.getTimeZone(timeZone);
				Date convDate = new Date(utcdate.getTime()
						+ tz.getOffset(utcdate.getTime()));
				return convDate;
			} catch (IllegalArgumentException ex) {
				return null;
			}
		}

	}*/
	
	
	/*public static Date changeFromUtc(Date effDate, String timeZone) {
		Date utcDate = null;
		if (null != timeZone && !timeZone.equalsIgnoreCase(" ")
				&& null != effDate) {
			String Zone = getTimeZoneId(timeZone);
			SimpleDateFormat sdfgmt = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			sdfgmt.setTimeZone(TimeZone.getTimeZone("UTC"));

			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date = df.format(effDate);
			SimpleDateFormat sdfmad = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			sdfmad.setTimeZone(TimeZone.getTimeZone(Zone));
			try {
				effDate = sdfgmt.parse(date);
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyy-MM-dd HH:mm:ss");
				utcDate = sdf.parse(sdfmad.format(effDate));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			utcDate = effDate;
		}
		return utcDate;

	}*/

	public static XMLGregorianCalendar changeFromUtc(XMLGregorianCalendar utcdate, String timeZone) {
		if (null == utcdate)
			return null;
		if (null == timeZone)
			return utcdate;
		
		TimeZone tz = TimeZone.getTimeZone(timeZone);
		utcdate.setTimezone(tz.getOffset(utcdate.getMillisecond()));
		return utcdate;
	}

	/*public static String getTimeZoneId(String timezone) {
		if (null == timezone)
			return null;
		TimeZone timeZone = TimeZoneList.getInstance().getTimeZone(timezone);
		if(null != timeZone){
		return timeZone.getID();
		}else{
			return null;
		}
	}*/
	
	
	public static int getMonthsBetween(Date maxDate, Date minDate) {
		if (null != maxDate && null != minDate) {
			Calendar cal = Calendar.getInstance();
			// default will be Gregorian in US Locales
			cal.setTime(maxDate);
			int maxDateMonth = cal.get(Calendar.MONTH);
			int maxDateYear = cal.get(Calendar.YEAR);
			cal.setTime(minDate);
			int minDateMonth = cal.get(Calendar.MONTH);
			int minDateYear = cal.get(Calendar.YEAR);

			// the following will work okay for Gregorian but will not
			// work correctly in a Calendar where the number of months
			// in a year is not constant
			return ((maxDateYear - minDateYear) * (cal
					.getMaximum(Calendar.MONTH)+1))
					+ (maxDateMonth - minDateMonth+1);
		} else {
			return 0;
		}
	}

	public static String parseDateToString(final Date dateToParse,final String dateFormat) {
		if (dateToParse == null)
			return null;
		try {
			DateFormat df = new SimpleDateFormat(dateFormat);
			
			return df.format(dateToParse);
		} catch (IllegalArgumentException ex) {
			return null;
		}
	}
	
	public static java.sql.Date convertToJavaSqlDate(
			XMLGregorianCalendar xmlGregorianCalendar) {

		java.sql.Date sqlDate = null;

		if (null != xmlGregorianCalendar) {
			java.util.Date dt = xmlGregorianCalendar.toGregorianCalendar()
					.getTime();
			sqlDate = new java.sql.Date(dt.getTime());

		}
		return sqlDate;
	}
}
