public class EncapDemo1841720065Rifqie{
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        if(newAge > 30 && newAge <= 18){
            age = 30;
        }
        else{
            age = newAge;
        }
    }
}
