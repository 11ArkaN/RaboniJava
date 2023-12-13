public class Program {
    public enum PoryRoku {
        Wiosna ("Marzec, Kwiecień, Maj"),
        Lato ("Czerwiec, Lipiec, Sierpień"),
        Jesien ("Wrzesień, Październik, Listopad"),
        Zima ("Grudzień, Styczeń, Luty");

        private final String miesiace;
        private PoryRoku(String miesiace) {
            this.miesiace = miesiace;
        }

        public String PokazMiesiace() {
            return miesiace;
        }
    }

    public static void main(String[] args) {
        for (PoryRoku poryRoku : PoryRoku.values()) {
            System.out.println(poryRoku + ": " + poryRoku.PokazMiesiace());
        }
    }
}
