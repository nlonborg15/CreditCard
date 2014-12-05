public class CreditCard
{
  public String verify(String num)
  {
    int totalEvens = 0;
    int totalOdds = 0;
    String revNum = "";
    for (int k = num.length() - 1; k >= 0; k--)//flips string around
    {
      revNum += num.substring(k, k+1);
    }
    for (int i = 1; i<revNum.length(); i += 2)//takes the even digits
    {
      int w = Integer.parseInt(revNum.substring(i, i+1), 10);
      if (w >= 5)//adds the two digits together if it doubles into a two-digit number
      {
        totalEvens += (int)(1+((2*w)%10));
      }
      else
      {
        totalEvens = totalEvens + (2*w);
      }
      
    }
    for (int t = 0; t<revNum.length(); t += 2)//takes the odd digits
    {
      int h = Integer.parseInt(revNum.substring(t, t+1), 10);
      totalOdds += h;
    }
    int total = totalOdds + totalEvens;
    if ((total%10 == 0) && (num.length() >= 13) && (num.length() <= 16))
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
    if ((num.substring(0, 1)).equals("4"))
    {
      return 2;//Visa
    }
    else if (num.substring(0, 2).equals("51")
          ||num.substring(0, 2).equals("52")
          ||num.substring(0, 2).equals("53")
          ||num.substring(0, 2).equals("54")
          ||num.substring(0, 2).equals("55"))
    {
      return 1;
    }
    else if (num.substring(0, 2).equals("34")
          ||num.substring(0, 2).equals("37"))
    {
      return 3;//American Express
    }
    else if (num.substring(0, 4).equals("6011"))
    {
      return 4;//Discover
    }
    else if (num.substring(0, 2).equals("36")
          ||num.substring(0, 2).equals("38")
          ||num.substring(0, 3).equals("301")
          ||num.substring(0, 3).equals("302")
          ||num.substring(0, 3).equals("303")
          ||num.substring(0, 3).equals("304")
          ||num.substring(0, 3).equals("305"))
    {
      return 5;//Diners Club/Carte Blanche
    }
    else
    {
      return 0;//none
    }
  }
}