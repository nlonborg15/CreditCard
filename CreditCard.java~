public class CreditCard
{
  int[] evens = {0, 0, 0, 0, 0, 0, 0, 0};
  int[] odds = {0, 0, 0, 0, 0, 0, 0, 0};
  public String verify(String num)
  {
    int totalEvens = 0;
    int totalOdds = 0;
    String revNum = "";
    for (int k = num.length() - 1; k >= 0; k--)//flips string around
    {
      revNum += num.substring(k, k+1);
    }
    System.out.println(revNum);
    for (int i = 1; i<revNum.length(); i += 2)//takes the even digits
    {
      int w = 0;
      evens[w] = Integer.parseInt(revNum.substring(i, i+1), 10);//takes digit from string to int and puts it into an array
      w++;
    }
    for (int j = 0; j < 8; j++)//adds all the even digits together
    {
      if (2*evens[j] >= 10)//adds the two digits together if it doubles into a two-digit number
      {
        totalEvens += (int)(1+((2*evens[j])%10));
      }
      else
      {
        totalEvens += 2*evens[j];
      }
    }
    System.out.println(totalEvens);
    for (int t = 0; t<revNum.length(); t += 2)//takes the odd digits
    {
      int h = 0;
      odds[h] = Integer.parseInt(revNum.substring(t, t+1), 10);//takes digit from string to int and puts it into an array
      h++;
    }
    for (int y = 0; y < 8; y++)//adds the odd digits together
    {
      totalOdds += odds[y];
    }
    System.out.println(totalOdds);
    int total = totalOdds + totalEvens;
    if ((total%10 == 0)) //&& (num.length() >= 13) && (num.length() <= 16))
    {
      return "yes";
    }
    else
    {
      return "no";
    }
  }
  public int findType(String num)
  {
    System.out.println(num.substring(0, 1));
    System.out.println(num.substring(0, 2));
    System.out.println(num.substring(0, 3));
    System.out.println(num.substring(0, 4));
    if ((num.substring(0, 1)) == "4")
    {
      return 2;//Visa
    }
    else if ((num.substring(0, 2)) == "51"
          ||(num.substring(0, 2)) == "52"
          ||(num.substring(0, 2)) == "53"
          ||(num.substring(0, 2)) == "54"
          ||(num.substring(0, 2)) == "55")
    {
      return 1;
    }
    else if ((num.substring(0, 2)) == "34"
          ||(num.substring(0, 2)) == "37")
    {
      return 3;//American Express
    }
    else if ((num.substring(0, 4)) == "6011")
    {
      return 4;//Discover
    }
    else if ((num.substring(0, 2)) == "36"
          ||(num.substring(0, 2)) == "38"
          ||(num.substring(0, 3)) == "301"
          ||(num.substring(0, 3)) == "302"
          ||(num.substring(0, 3)) == "303"
          ||(num.substring(0, 3)) == "304"
          ||(num.substring(0, 3)) == "305")
    {
      return 5;//Diners Club/Carte Blanche
    }
    else
    {
      return 0;//none
    }
  }
}