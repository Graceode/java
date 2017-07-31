package com.shiyanlou;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTest dt = new DateTest();
		dt.applyAdjusters();
		/*��Java 8�У�������������������ڴ���һЩ�����ʱ�����⣺
		Period���������ڴ���������ص�ʱ���
		Duration���������ڴ���ʱ����ص�ʱ���
		 */
		dt.showPeriod();
		dt.showDuration();
		dt.testLocalDateTime();
		//��java.time.temporal.ChronoUnit����
		//�����ö�ٳ�����������ɵ�API��������ֵ���������ֵ��
		dt.testChromUnits();
		//����ʱ�����ܵ�����ʱ��API��������Ҫ����ʱ����Ϣ�������
		ZonedDateTime date6 = ZonedDateTime.parse("2016-04-20T19:22:15+01:30[Europe/Paris]");
	      System.out.println("date6: " + date6);

	      // �趨����IDΪ���޵ļӶ�����λ��ӡ�ȣ��������
	      ZoneId id = ZoneId.of("Asia/Kolkata");
	      System.out.println("ZoneId: " + id);

	      // ���ϵͳĬ�ϵĵ�ǰ���������
	      ZoneId currentZone = ZoneId.systemDefault();
	      System.out.println("CurrentZone: " + currentZone);
	   }
				

	//Java 8�ṩ��LocalDate��LocalTime��LocalDataTime�����򻯲���Ҫʱ��������µĿ���������
	public void testLocalDateTime(){
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("current date and time:"+currentTime);
		//�����ǰʱ��ı���ֵ����ʱ����
		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("local date:"+date1);
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		//�ɵ�ǰʱ������ø����ֶΣ�������
		System.out.println("month:"+month+"day:"+day+"seconds:"+seconds);
		//�ɵ�ǰʱ�丽���·ݺ��������
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2017);
		System.out.println("date 2:" + date2);
		//���2017��ʥ���ڵ�����
		LocalDate date3 = LocalDate.of(2017, Month.DECEMBER, 25);
		System.out.println("date 3:"+date3);
		 // ������������Ŀ�ʼʱ��
	      LocalTime date4 = LocalTime.of(19, 00);
	      System.out.println("date 4: " + date4);

	      // ת��Ϊ�ַ����������
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date 5: " + date5);
	      
	   }
	public void testChromUnits(){
		//��õ�ǰ�����ڲ����
		LocalDate today = LocalDate.now();
		System.out.println("current date:"+ today);
		//�ڵ�ǰ�����ڻ�������������ʱ�䲢���
		LocalDate nextweek = today.plus(2,ChronoUnit.WEEKS);
		System.out.println("two weeks after now:"+nextweek);
		//�ڵ�ǰ�����ڻ������������²����
		LocalDate nextmonth = today.plusMonths(6);
		System.out.println("6 month after now:"+nextmonth);
		//�ڵ�ǰ�����ڻ�������5�겢���
		LocalDate nextyear = today.plusYears(5);
		System.out.println("5 years after now:"+nextyear);	
		
	}
	public void showPeriod(){
		// ��õ�ǰ������
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);

	      // �ڵ�ǰ���ڵĻ���������һ����ʱ��
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + date2);

	      // ��between����������������ֱ�ӵļ������֮ΪPeriod��
	      Period period = Period.between(date2, date1);
	      System.out.println("Period: " + period);
	}
	public void showDuration(){
		LocalTime time1 = LocalTime.now();
		System.out.println("time 1:"+time1);
	      Duration fiveHours = Duration.ofHours(5);

	      LocalTime time2 = time1.plus(fiveHours);
	      System.out.println("time 2:"+time2);
	      // ��Ӧ�ģ���between������ʾ����ʱ��ֱ�ӵļ������֮ΪDuration��
	      Duration duration = Duration.between(time1, time2);
	      System.out.println("Duration: " + duration);
	}
	//ʱ�������TemporalAdjuster�����ڼ������ڵ���ѧ���ߡ�
	//����˵�����ͨ����������ӣ���á��¸��µĵڶ������ա������ļ�����������ڡ�
	public void applyAdjusters(){
		// ��õ�ǰ������
	      LocalDate date1 = LocalDate.now();
	      System.out.println("current date: " + date1);

	      // ��������һ�����ڲ����
	      LocalDate nextMonday = date1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	      System.out.println("next monday on : " + nextMonday);

	      // ����¸��µĵڶ������ڵ����ڲ����
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      LocalDate firstInMonth = LocalDate.of(date2.getYear(),date2.getMonth(), 1);
	      LocalDate secondSunday = firstInMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	      System.out.println("second sunday of next month : " + secondSunday);
	   }
	}

