public class Test2 {
    public static void main(String[] args) {
        Personne person = new Personne("Doe", "John", 15, 6, 1990);

        int age = person.ageEn2023();

        if (age != -1) {
            System.out.println("Âge de la personne en 2023 : " + age);
        } else {
            System.out.println("Date de naissance invalide.");
        }
    }
}
