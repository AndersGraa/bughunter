/* Prøv at simplificere isWeekend-metoden */

void main() {
    String dayOfWeek = "Mandag";

    boolean weekend = isWeekend(dayOfWeek);
    IO.println("Er " + dayOfWeek + " i weekenden: " + weekend);
}

boolean isWeekend(String day) {
    boolean weekend = false;

    if (day.equals("Lørdag") || day.equals("Søndag")) {
        weekend = true;
    }
    return weekend;
}
