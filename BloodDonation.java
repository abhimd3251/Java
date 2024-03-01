class BloodDonation 
{
  public static void main(String[]args )
  {
    int hemoglobin = 13;
    int age = 25;
    boolean diease = false;
    boolean drugsaddict = false;

    if(age>18 && age<=60)
    {
        if (hemoglobin >=13)
        {
            if (diease==false)
            { 
                if (drugsaddict==false)
                {
                 System.out.println("yor are eligiable for blood donation");
                }
                else 
                {
                System.out.println("you can not donate because you are durg addict");
                }
            }    
            else
            {
             System.out.println("you can not donate because you have cold");
            }
        }         
        else 
        {
         System.out.println("you can not donate because your humoglobin is less than 13");
        }
    }
    else
    {
                System.out.println("your age is not valid for donating blood");
    }

        }
    } 

