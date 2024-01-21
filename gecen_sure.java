public class gecen_sure {
    public static void main(String[] args){
        long totalMilliseconds=System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currendSecond = totalSeconds%60;
        long totalMinutes=totalSeconds /60;
       long currenMinute=totalMinutes%60;
       long totalHours = totalMinutes/60;
       long currentHour=totalHours %24;
       System.out.println("current time "+currentHour+ ":"+currenMinute + ":" + currendSecond+ " GMT");

}
}
