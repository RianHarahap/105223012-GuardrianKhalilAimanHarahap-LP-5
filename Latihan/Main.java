import comuniversitymodel.Student;

public class Main {
    public static void main(String[] args) {
        
        Student[] students = {
            new Student("105223012", "Rian", 20, 3.8),
            new Student("105223013", "Viesto", 22, 3.6),
            new Student("105223014", "Tiara", 22, 3.9),
            new Student("105223041", "Rippun", 20, 3.5),
            new Student("105223016", "Nazhan", 15, 3.7)
        };

       
        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            student.dataMahasiswa();
        }
    }
}

