// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.ArrayList;

class HelloWorld {
    public static void main(String[] args) {
        UserController userController = new UserController();
        
        userController.addUser(new User("Dede Herdiana", 25));
        userController.addUser(new User("Beckham", 30));
        userController.addUser(new User("Kobe Maino", 16));
        
        // 3. Looping
        System.out.println("List Semua");
        List<User> users = userController.getAllUser();
        for (User user : users) {
            System.out.println("Nama: " + user.getName() + " Umur: " + user.getAge());
        }
        
        System.out.println("List User Dewasa");
        
        List<User> adults = userController.getAdultUser();
        for(User adult : adults) {
            System.out.println("Nama: " + adult.getName() + " Umur: " +adult.getAge());
        }
        
        System.out.println("------------------");
        
        System.out.println("Contoh Bilangan prima");
        
        BilanganController bilanganController = new BilanganController();
        
        List<Bilangan> bilanganPrima = bilanganController.getBilanganPrima();
        for(Bilangan angka : bilanganPrima) {
            System.out.print(angka.getAngka() + ", ");
        }
        
    }
    
    // 6. Class
    public static class UserController {
        private List<User> users = new ArrayList<>();
        
        // 5. Function
        public void addUser(User user) {
            users.add(user);
        }
        
        // 5. Function
        public List<User> getAllUser() {
            return users;
        }
        // 5. Function
        public List<User> getAdultUser() {
            List<User> adults = new ArrayList<>();
            // 3. Looping
            for(User user : users) {
                // 2. Condition 
                if(user.getAge() > 17) {
                    adults.add(user);
                }
            }
            return adults;
        }
    }
    
    // 7. Objek
    public static class User {
        
        // Deklarasi variable
        private String name;
        private int age;
        
        //Constructor
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // 4. Enkapsulasi pada case Getter dan Setter 
        public String getName() {
            return name;
        }
        
        public void setName(String Name) {
            this.name = name;
        }
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int Age) {
            //2. Condition
            if(age > 0) {
                this.age = age;  
            }
        }
    }
    
    public static class BilanganController {
        private List<Bilangan> bilangans = new ArrayList<>();
        
        public void addAngka(Bilangan bilangan) {
            bilangans.add(bilangan);
        }
        
        public List<Bilangan> getBilanganPrima() {
            for (int i = 1; i <= 100; i++) {
                if(this.isPrima(i)) {
                    this.addAngka( new Bilangan(i));
                }
            }
            return bilangans;
        }
        
        public boolean isPrima(int angka) {
            // 1. Bilangan harus lebih dari 1
            if(angka < 2 ){
                return false;
            }
            
            // 2.1 Cari akar kuadratnya
            for(int i = 2; i <= Math.sqrt(angka); i++) {
                // 3. Jika dia punya akar kuadrat dan hasilnya sama dengan 0 maka dia buka bilangan prima karena bilangan prima hanya akan habis dibagi 1 dan dirinya sendiri
                if(angka % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static class Bilangan {
        //Deklarasi
        private int angka;
        
        public Bilangan(int angka) {
            this.angka = angka;
        }
        
        // getter Setter
        public int getAngka() {
            return angka;
        }
        
        public void setAngka(int angka){
            this.angka = angka;
        }
    }

}
