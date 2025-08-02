package skill;

class ReplaceModify {
    public static void main(String[] args) {
        String s = "Raju";
        System.out.println(s.replace('R', 'r'));         
        System.out.println(s.replace("a", "A"));     
        System.out.println(s.replaceAll("aj.", "Ju"));    
        System.out.println(s.replaceFirst("Ra", "rA")); 
    }
}