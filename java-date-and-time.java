public static String findDay(int month, int day, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day); 

    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

    switch (dayOfWeek) {
        case Calendar.SUNDAY:    return "SUNDAY";
        case Calendar.MONDAY:    return "MONDAY";
        case Calendar.TUESDAY:   return "TUESDAY";
        case Calendar.WEDNESDAY: return "WEDNESDAY";
        case Calendar.THURSDAY:  return "THURSDAY";
        case Calendar.FRIDAY:    return "FRIDAY";
        case Calendar.SATURDAY:  return "SATURDAY";
        default: return "";
    }
}
