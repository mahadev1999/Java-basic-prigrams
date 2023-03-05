import java.util.Random;
class random
{
public static void main(String args[])
{
Random rand = new Random();
int rand_int = rand.nextInt(1000);

System.out.println("the random number is:"+rand_int);
}}