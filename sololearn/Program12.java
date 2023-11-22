public class Program12{
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        
        double sum = 0.0;
        for (double monthRevenue : revenue) {
            sum += monthRevenue;
        }

        double avarageRevenue = sum / revenue.length;

        System.out.println(avarageRevenue);
    }
}