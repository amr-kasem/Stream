public class App {
    public static boolean check(String x){
        if(x == null || x.length() == 0)
            return false;
        return x.chars().allMatch(Character::isLetter);
    }
    public static void main(String[] args) throws Exception {
        String[] strings = new String[]{
            "",
            "test",
            "2k3",
            "3S2%",
            "$ss",
            "ss",
            null
        };
        for(String s : strings){
            System.out.println(
                check(s)
            );
        }
    }
}
