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
		/*在Java 8中，还有两个特殊的类用于处理一些特殊的时间问题：
		Period：该类用于处理日期相关的时间段
		Duration：该类用于处理时间相关的时间段
		 */
		dt.showPeriod();
		dt.showDuration();
		dt.testLocalDateTime();
		//在java.time.temporal.ChronoUnit包内
		//添加了枚举常量，来代替旧的API里用整数值代表的日期值。
		dt.testChromUnits();
		//具有时区功能的日期时间API被用于需要考虑时区信息的情况。
		ZonedDateTime date6 = ZonedDateTime.parse("2016-04-20T19:22:15+01:30[Europe/Paris]");
	      System.out.println("date6: " + date6);

	      // 设定地区ID为亚洲的加尔各答（位于印度），并输出
	      ZoneId id = ZoneId.of("Asia/Kolkata");
	      System.out.println("ZoneId: " + id);

	      // 获得系统默认的当前地区并输出
	      ZoneId currentZone = ZoneId.systemDefault();
	      System.out.println("CurrentZone: " + currentZone);
	   }
				

	//Java 8提供了LocalDate、LocalTime和LocalDataTime类来简化不需要时区的情况下的开发工作。
	public void testLocalDateTime(){
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("current date and time:"+currentTime);
		//输出当前时间的本地值（本时区）
		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("local date:"+date1);
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		//由当前时间对象获得各个字段，输出结果
		System.out.println("month:"+month+"day:"+day+"seconds:"+seconds);
		//由当前时间附带月份和年再输出
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2017);
		System.out.println("date 2:" + date2);
		//输出2017年圣诞节的日期
		LocalDate date3 = LocalDate.of(2017, Month.DECEMBER, 25);
		System.out.println("date 3:"+date3);
		 // 输出新闻联播的开始时间
	      LocalTime date4 = LocalTime.of(19, 00);
	      System.out.println("date 4: " + date4);

	      // 转化为字符串，再输出
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date 5: " + date5);
	      
	   }
	public void testChromUnits(){
		//获得当前的日期并输出
		LocalDate today = LocalDate.now();
		System.out.println("current date:"+ today);
		//在当前的日期基础上增加两周时间并输出
		LocalDate nextweek = today.plus(2,ChronoUnit.WEEKS);
		System.out.println("two weeks after now:"+nextweek);
		//在当前的日期基础增加六个月并输出
		LocalDate nextmonth = today.plusMonths(6);
		System.out.println("6 month after now:"+nextmonth);
		//在当前的日期基础增加5年并输出
		LocalDate nextyear = today.plusYears(5);
		System.out.println("5 years after now:"+nextyear);	
		
	}
	public void showPeriod(){
		// 获得当前的日期
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);

	      // 在当前日期的基础上增加一个月时间
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + date2);

	      // 用between方法计算两个日期直接的间隔（称之为Period）
	      Period period = Period.between(date2, date1);
	      System.out.println("Period: " + period);
	}
	public void showDuration(){
		LocalTime time1 = LocalTime.now();
		System.out.println("time 1:"+time1);
	      Duration fiveHours = Duration.ofHours(5);

	      LocalTime time2 = time1.plus(fiveHours);
	      System.out.println("time 2:"+time2);
	      // 对应的，用between方法显示两个时间直接的间隔（称之为Duration）
	      Duration duration = Duration.between(time1, time2);
	      System.out.println("Duration: " + duration);
	}
	//时间调节器TemporalAdjuster是用于计算日期的数学工具。
	//比如说你可以通过下面的例子，获得“下个月的第二个周日”这样的计算出来的日期。
	public void applyAdjusters(){
		// 获得当前的日期
	      LocalDate date1 = LocalDate.now();
	      System.out.println("current date: " + date1);

	      // 计算下周一的日期并输出
	      LocalDate nextMonday = date1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	      System.out.println("next monday on : " + nextMonday);

	      // 获得下个月的第二个周期的日期并输出
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      LocalDate firstInMonth = LocalDate.of(date2.getYear(),date2.getMonth(), 1);
	      LocalDate secondSunday = firstInMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	      System.out.println("second sunday of next month : " + secondSunday);
	   }
	}

