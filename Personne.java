public class Personne {
        private String name;
        private String firstName;
        private int dayNaiss;
        private int monthNaiss;
        private int yearNaiss;

        public Personne(String name, String firstName, int dayNaiss, int monthNaiss, int yearNaiss) {
            this.name = name;
            this.firstName = firstName;
            this.dayNaiss = dayNaiss;
            this.monthNaiss = monthNaiss;
            this.yearNaiss = yearNaiss;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setDateNaiss(int dayNaiss, int monthNaiss, int yearNaiss) {
            this.dayNaiss = dayNaiss;
            this.monthNaiss = monthNaiss;
            this.yearNaiss = yearNaiss;
        }

        public int ageEn2023() {
            int Year = 2023;

            int age = Year - yearNaiss;

            if (monthNaiss > 12 || dayNaiss > 31 || yearNaiss > Year) {
                return -1;
            }

            if (monthNaiss > 12 || dayNaiss > 31) {
                return -1;
            }

            if (monthNaiss == 12 && dayNaiss > 31) {
                return -1;
            }

            if (monthNaiss == 2 && dayNaiss > 29 && !(yearNaiss)) {
                return -1;
            }

        }
    }
