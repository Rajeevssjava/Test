public class Test
{
  public void show()
  {
    System.out.println("Non-static Method");
  }
  public static void main(String args[])
  {
    System.out.println("Welcome User");
    new Test().show();
  }
}
