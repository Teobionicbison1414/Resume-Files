import java.util.Scanner;

public class Moneytracker {
    Scanner keyboard = new Scanner(System.in);

    public void runMoneyTracker() throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);

        // Input delay time
        System.out.print("Input delay time milliseconds: ");
        int m_delaytimemillis = keyboard.nextInt();

        // Input starting values
        System.out.print("Input starting equity: ");
        double equity = keyboard.nextDouble();

        System.out.print("Input starting salary: ");
        double salary = keyboard.nextDouble();
        keyboard.nextLine(); // consume newline

        System.out.print("Is your salary per second, minute, hour, day, week, month, or year? ");
        String unit = keyboard.nextLine().trim().toLowerCase();

        // Convert salary to per-second rate
        double salaryPerSecond;
        switch (unit) {
            case "second": salaryPerSecond = salary; break;
            case "minute": salaryPerSecond = salary / 60.0; break;
            case "hour":   salaryPerSecond = salary / 3600.0; break;
            case "day":    salaryPerSecond = salary / 86400.0; break;
            case "week":   salaryPerSecond = salary / 604800.0; break;
            case "month":  salaryPerSecond = salary / 2629746.0; break; // average month ~30.44 days
            case "year":   salaryPerSecond = salary / 31536000.0; break;
            default:
                System.out.println("Invalid unit. Exiting.");
                keyboard.close();
                return;
        }

        // Ask how long to simulate (with unit)
        System.out.print("Enter duration (number): ");
        int duration = keyboard.nextInt();
        keyboard.nextLine(); // consume newline

        System.out.print("Is this duration in seconds, minutes, hours, days, weeks, months, or years? ");
        String durationUnit = keyboard.nextLine().trim().toLowerCase();

        int totalSeconds = 0;
        switch (durationUnit) {
            case "second":
            case "seconds": totalSeconds = duration; break;
            case "minute":
            case "minutes": totalSeconds = duration * 60; break;
            case "hour":
            case "hours":   totalSeconds = duration * 3600; break;
            case "day":
            case "days":    totalSeconds = duration * 86400; break;
            case "week":
            case "weeks":   totalSeconds = duration * 604800; break;
            case "month":
            case "months":  totalSeconds = (int)(duration * 2629746.0); break; // average month length
            case "year":
            case "years":   totalSeconds = duration * 31536000; break;
            default:
                System.out.println("Invalid duration unit. Exiting.");
                keyboard.close();
                return;
        }

        // Time counters
        int second = 0, minute = 0, hour = 0, day = 0, year = 0, month = 1, week = 0;

        // Month lengths (non-leap year)
        int[] monthLengths = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Simulation loop
        for (int i = 0; i < totalSeconds; i++) {
            second++;
            equity += salaryPerSecond;
            Thread.sleep(m_delaytimemillis);

            if (second == 60) { minute++; second = 0; }
            if (minute == 60) { hour++; minute = 0; }
            if (hour == 24)   { day++; hour = 0; week = day / 7; }

            // Leap year check
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int febDays = isLeapYear ? 29 : 28;
            monthLengths[1] = febDays;

            if (day >= monthLengths[month-1]) {
                day = 0;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            System.out.printf("Year: %d | Month: %d | Week: %d | Day: %d | Hours: %d | Minutes: %d | Seconds: %d | Equity: %.2f | Salary (%s): %.2f | Salary per second: %.6f%n",
                    year, month, week, day, hour, minute, second, equity, unit, salary, salaryPerSecond);
        }

        keyboard.close();
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Moneytracker Teocount = new Moneytracker();
        //Teocount.trackmymoney();
        Teocount.runMoneyTracker();
    }
}
