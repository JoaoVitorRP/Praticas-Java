public class Holiday {
    private String date;
    private String name;

    public Holiday(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public void getHoliday() {
        System.out.println(this.date + " => " + this.name);
    }

    public String getDate() {
        return this.date;
    }

    public String getName() {
        return this.name;
    }
}