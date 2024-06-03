
import java.util.List;
import java.util.ArrayList;

class HelloWorld {
    public static void main(String[] args) {
        UserController userController = new UserController();
        
        userController.addUser(new User("Dede Herdiana", 25));
        userController.addUser(new User("Beckham", 30));
        userController.addUser(new User("Kobe Maino", 16));
        
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
    }
    
    public static class User {
        
        // Deklarasi variable
        private String name;
        private int age;
        
        //Constructor
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Getter dan Setter
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
            //Condition
            if(age > 0) {
                this.age = age;  
            }
        }
    }
    
    public static class UserController {
        private List<User> users = new ArrayList<>();
        
        public void addUser(User user) {
            users.add(user);
        }
        
        public List<User> getAllUser() {
            return users;
        }
        
        public List<User> getAdultUser() {
            List<User> adults = new ArrayList<>();
            for(User user : users) {
                if(user.getAge() > 17) {
                    adults.add(user);
                }
            }
            return adults;
        }
    }

}
