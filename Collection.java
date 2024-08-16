import java.util.*;
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void tostr(){
        System.out.println(this.age + " " + this.name);

    }

    public int compareTo(Student that){
        return this.age > that.age ? 1 : -1;
    }
}

public class Collection {
    public static void main(String[] args) {    
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(7);
        nums.add(8);    

        Collections.sort(nums);


        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a<b)return 1;
                return -1;
            }
        };

        Comparator<Integer> com2 = (a, b) -> a<b ? 1 : -1;
    
        Student s1 = new Student(20,  "Pintu");
        Student s2 = new Student(90, "Piyush");
        Student s3 = new Student(10, "Ayush");
        List<Student> students = new ArrayList<>();
        students.add(s3);
        students.add(s2);
        students.add(s1);
        Collections.sort(students);
        

        Collections.sort(nums, com);

        
        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(8));

        System.out.println(nums);
        for(Object n : nums){
            int num = (Integer)n;
            System.out.println(num);
        }

        Set<Integer> myset = new HashSet<>();
        myset.add(6);
        myset.add(7);
        myset.add(1);
        myset.add(2);
        myset.add(8);
        myset.add(7);
        myset.add(8);
        System.out.println(myset);
        
        
        Set<Integer> myset2 = new TreeSet<>();
        myset2.add(6);
        myset2.add(7);
        myset2.add(1);
        myset2.add(2);
        myset2.add(8);
        myset2.add(7);
        myset2.add(8);
        System.out.println(myset2);

        Iterator<Integer> values = myset2.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
            
        }


        // Map<String, Integer> students = new HashMap<>();
        // students.put("Prashant", 1);
        // students.put("Navin", 2);
        // students.put("Keran", 3);
        // students.put("bro", 4);
        // System.out.println(students);
        // System.out.println(students.keySet());

        // for(String key : students.keySet()){
        //     System.out.println(key + " : " + students.get(key));
        // }
        Map<String, Integer> students2 = new Hashtable<>();
        students2.put("Prashant", 1);
        students2.put("Navin", 2);
        students2.put("Keran", 3);
        students2.put("bro", 4);
        System.out.println(students2);
        System.out.println(students2.keySet());

        for(String key : students2.keySet()){
            System.out.println(key + " : " + students2.get(key));
        }



    }
}
