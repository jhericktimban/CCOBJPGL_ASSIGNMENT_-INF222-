public class Exercise {

    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;


    public static void main(String[] args) {


        // precondtion 

        assert iWillBehave == true : "I cheated on our exam day.";

        // method
        College(); 

        // postconditon
        assert iWillGraduate == true : "I didn't passed all of my subjects.";

        
    }


    static void College() {
    
    iWillGraduate = false;
    System.out.println("Graduation Day");


    }

   



} 
