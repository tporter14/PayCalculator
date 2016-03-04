

public class payrollCalculator2{

	public static void main(String[] args)
{
  double grosspay = 0, withholdings = 0, netpay = 0, overtime;

  int wages = 0, hours = 0, numofEmployees = 0, loopCount = 0, innerloopCount = 0, outerloopCount = 0;



  System.out.println("Welcome to the payroll Calcualtor.  When prompted, please enter how many employees would you like to calculate payroll, hours worked and rate of pay per hour");

  System.out.println(" ");

  System.out.println("Please enter how many employees would you like to calculate payroll:        ");

  numofEmployees = TextIO.getlnInt();

  System.out.println(" ");


  int [] wagesArray = new int [wages];

  double [][] payrollArray  = new double [numofEmployees][hours];


  while(loopCount < wages)
  {

        System.out.printf("Enter Wages #%d:  ", loopCount);

        wagesArray[loopCount] = TextIO.getlnInt();

        loopCount = loopCount + 1;
  }

  loopCount = 0;

    while(outerloopCount < numofEmployees)

  {
    
        innerloopCount = innerloopCount = 0;
        System.out.printf("\n\n");
        
        while(innerloopCount < hours)
        {
        System.out.printf("Enter hours for Employee #%d: ", outerloopCount, innerloopCount);
        payrollArray[outerloopCount][innerloopCount] = TextIO.getlnDouble();
         
        innerloopCount = innerloopCount + 1;
        }
          
            outerloopCount = outerloopCount + 1;
        }

        outerloopCount = 0;
        while(outerloopCount < numofEmployees)
        {

        innerloopCount = 0;
        while(innerloopCount < hours)
        {

            innerloopCount = innerloopCount + 1;
            }

  System.out.printf ( "Payroll Summary\n");

  System.out.printf ( "---------------\n");
  double taxrate = .10;

  grosspay = 0.00;

  overtime = 0.00;

   if (hours <= 40)
   {   grosspay = wages*hours; 
       System.out.printf("Gross Pay          %5.2f\n\n", + grosspay); }
         
   else if  (hours > 40)
    {   overtime = hours - 40;
        grosspay = ((wages*40) + (1.5*wages * overtime));

        System.out.printf("Gross Pay          %5.2f\n\n", + grosspay);   
    }

  withholdings = grosspay * taxrate;
  netpay = grosspay - withholdings;
  }

  System.out.printf("Withholdings       %6.2f\n\n", + withholdings);

  System.out.printf("Net Pay            %5.2f\n\n", + netpay);

  
  outerloopCount = outerloopCount + 1;
  }

  }
