class Student{
    public String name;
    Student(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

class J0806_1{
    public static void main(String[] args){
        Student[] myStudents = new Student[]{new Student("Dharma"), new Student("Sanvi"), new Student("Rupa"), new Student("Ajay")};
        for (Student m:myStudents){
            System.out.println(m);
        }
    }
}