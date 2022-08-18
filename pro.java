import java.io.*;
import java.lang.*;
public class pro{
    BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
    //Variables of UniCalculator
    int choose,var1,var5,var7,var9,var3;
    float var2,var6,var4,length,breathe,height,var10,var8;
    double m,cm,mm,km;
    //Variable of Mathematical Operational Calculator
    float num1,num2;
    int choose3,choose1,choose2,exit;
    double total;
    //Variable of ChooseMethod Function
    int anyone;
//Staring choosing function
public void choosemethod()throws IOException{
    while(true){
    System.out.println("Choose Any Number:");
    System.out.println("1.Simple Calculator:");
    System.out.println("2.Unit Calculator:");
    System.out.println("3.Exit:");
    anyone=Integer.parseInt(buff.readLine());
    if(anyone==1){
        calculator();
    }
    else if(anyone==2){
        unitcalculator();
    }
    else if(anyone==3){
        break;
    }
    else{
        System.out.println("You Entered Wrong Number ! Please Entered Valid Number");
    }
    }
}
    
   public void calculator()throws IOException{ 
    System.out.println("Choose Any One Option");
    System.out.println("1.Normal Calculator/Arithematical Calculator");
    System.out.println("2.Mathematical Method Calculator:");
    choose1=Integer.parseInt(buff.readLine());
    
    //Use if condition for going Arithematic Calculator
    if(choose1==1){
            System.out.println("--------------Welcome To Jayant Calculator---------");
            
            //Use while true loop for no stop running 
            while(true){
            System.out.println("Go to next 1.y / 2.n");
            exit=Integer.parseInt(buff.readLine());
            //If statement is used for going further
            if(exit==1){
            System.out.println("Enter First Number");
            num1=Float.parseFloat(buff.readLine());
            System.out.println("Enter Second Number:");
            num2=Float.parseFloat(buff.readLine());
            System.out.println("Choose Any Number(1.+ , 2.- , 3.* , 4./ , 5.%)");
            choose3=Integer.parseInt(buff.readLine());
            
        //Use Switch case for performing task one by one
            switch(choose3){
                case 1:{
                total=num1+num2;
                System.out.println("Your Addition is:"+total);
                break;
                }
                case 2:{
                total=num1-num2;
                System.out.println("Your Subtraction is:"+total);
                break;
                }
            case 3:{
                total=num1*num2;
                System.out.println("Your Multiplication is:"+total);
                break;
                }
            case 4:{
                total=num1/num2;
                System.out.println("Your Division is:"+total);
                break;
                }
            case 5:{
                total=num1%num2;
                System.out.println("Your Modulo/Remainder is:"+total);
                break;
                }   
            case 6:{
                break;
                }     
            default:{
                System.out.println("You Entered Wrong Number!Print Enter Valid Number");
                break;
                }    
        }
    }
    //Use else if statement for exit no further going
    else if(exit==2){
        break;
    }
}
}  

//Use else if condition for going Mathematical operations Calculator 
else if(choose1==2)
{
    //Use while true loop for no stop loop running
    while(true){
        System.out.println("Go to next 1.y / 2.n");
        exit=Integer.parseInt(buff.readLine());
        
        //If statement is used for going further
        if(exit==1){
        System.out.println("Enter First Number");
        num1=Float.parseFloat(buff.readLine());
        System.out.println("Choose any Mathematical operations like(1.abs , 2.sqrt , 3.cbrt , 4.roundoff)Only one number are required for mathematical operations"); 
        choose2=Integer.parseInt(buff.readLine());
        switch(choose2){
        case 1:{
            total=Math.abs(num1);
            System.out.println("Your Absolute Value is:"+total);
            break;
            }
        case 2:{
            total=Math.sqrt(num1);
            System.out.println("Your Square Root is:"+total);
            break;
            }
        case 3:{
            total=Math.cbrt(num1);
            System.out.println("Your Cube Root is:"+total);
            break;
            }
        case 4:{
            total=Math.round(num1);
            System.out.println("Your Round Off Value is:"+total);
            break;
            }
        default:{
            System.out.println("This number is not Valid!Please Enter Valid Number");
            break;
            }
    }
 }
 //Use else if for exit not further going
else if(exit==2){
        break;
    }
}
}
//Else is Used for Number is not Valid
else{
    System.out.println("This is Wrong number!Please Enter Valid Number");
}
}
   
//Starting Unit Calculator
    
    public void unitcalculator()throws IOException{
   System.out.println("-----------Welcome to Jayant Unit Calculator---------");
while(true){
    System.out.println("Choose any number:");
    System.out.println("Enter:1 for find the Length");
    System.out.println("Enter:2 for find the Temperature");
    System.out.println("Enter:3 for find the Voulume");
    System.out.println("Enter:4 for find the Weight");
    System.out.println("Enter:5 for find the Time");
    System.out.println("Enter:6 for Exit");

    //Take input for numbers
    System.out.println("Enter any Number:");
    choose=Integer.parseInt(buff.readLine());
    if(choose!=6){
    //Take if condition for perform the operations in Length
    if(choose==1){
        System.out.println("Choose any Number:");
        System.out.println("Enter:1 for Meter to Km");
        System.out.println("Enter:2 for Meter to cm");
        System.out.println("Enter:3 for Meter to mm");
        System.out.println("Enter:4 for Kilometer to m");
        System.out.println("Enter:5 for Kilometer to cm");
        System.out.println("Enter:6 for Kilometer to mm");
        System.out.println("Enter:7 for Centimeter to Km");
        System.out.println("Enter:8 for Centimeter to m");
        System.out.println("Enter:9 for Centimeter to mm");
        System.out.println("Enter:10 for Millimeter to m");
        System.out.println("Enter:11 for Millimeter to cm");
        System.out.println("Enter:12 for Millimeter to Km");
        
        //Take input from user
        System.out.println("Enter any Number:");
        var1=Integer.parseInt(buff.readLine());

        //It is used for convertion m to{-
        if(var1==1){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            m=0.001*var2;
            System.out.println("Your Kilometer is:"+m);
        }
        else if(var1==2){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            m=100*var2;
            System.out.println("Your Centemeter is:"+m);
        }
        else if(var1==3){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            m=1000*var2;
            System.out.println("Your Mellimeter is:"+m);
        }
        
        //It is used for convertion km to{-
        else if(var1==4){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            km=1000*var2;
            System.out.println("Your meter is:"+km);
        }
        else if(var1==5){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            km=100000*var2;
            System.out.print("Your Centemeter is:"+km);
        }
        else if(var1==6){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            km=1000000*var2;
            System.out.println("Your Mellimeter is:"+km);
        }

        //It is used for convertion cm to{-
        else if(var1==7){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            cm=0.00001*var2;
            System.out.println("Your Kilometer is:"+cm);
        }
        else if(var1==8){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            cm=0.01*var2;
            System.out.println("Your meter is:"+cm);
        }
        else if(var1==9){
           //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            cm=10*var2;
            System.out.println("Your Mellimeter is:"+cm);
        }

        //It is used for convertion mm to{-
        else if(var1==10){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            mm=0.001*var2;
            System.out.print("Your meter is:"+mm);
        }
        else if(var1==11){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            mm=0.1*var2;
            System.out.println("Your centimeter is:"+mm);
        }
        else if(var1==12){
            //Take input form user
            System.out.println("Enter Number for Conversion:");
            var2=Float.parseFloat(buff.readLine());
            mm=0.000001*var2;
            System.out.println("Your Kilometer is:"+mm);
        }
        else
           System.out.println("You Entered Wrong Number ! Please Try Again");
        }      
    else if(choose==2){
       System.out.println("Welcome to Temperature");
       System.out.println("Choose any Number:");
       System.out.println("Enter:1 for Celsius to Farhen");
       System.out.println("Enter:2 for Celsius to Kelvin");
       System.out.println("Enter:3 for Farhen to Kelvin");
       System.out.println("Enter:4 for Farhen to Celsius");
       System.out.println("Enter:5 for Kelvin to Celsius");
       System.out.println("Enter:6 for Kelvin to Farhen");
        //Take input from user
       var3=Integer.parseInt(buff.readLine());
       //It is used for convertion m to{-
       if(var3==1){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=33.8*var4;
           System.out.println("Your Farhen is:"+m);
        }
       else if(var3==2){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=274.15*var4;
           System.out.println("Your Kalvin is:"+m);
        }  
       else if(var3==3){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=255.927778*var4;
           System.out.println("Your Kalvin is:"+m);
        }
       else if(var3==4){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=(-17.22)*var4;
           System.out.println("Your Celsius is:"+m);
        }
       else if(var3==5){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=(-272.15)*var4;
           System.out.println("Your Celsius is:"+m);
        }  
       else if(var3==6){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=(-475.87)*var4;
           System.out.println("Your Farhen is:"+m);
       }
       else{
           System.out.println("You Entered Wrong Number ! Please Try Again");
        }
    }  

    else if(choose==3){
       System.out.println("Welcome to Volumes");
       System.out.println("Choose any Number:");
       System.out.println("Enter:1 for Cube");
       System.out.println("Enter:2 for Cuboid");
       System.out.println("Enter:3 for Square");
       
        //Take input from user
       var5=Integer.parseInt(buff.readLine());

       //It is used for convertion m to{-
       if(var5==1){
       //Take input form user
           System.out.println("Enter Number for Volume:");
           var6=Float.parseFloat(buff.readLine());
           m=Math.pow(var6,3);
           System.out.println("Volume of Cube is:"+m);
            }
       else if(var5==2){
       //Take input form user
           System.out.println("Enter the Length:");
           length=Float.parseFloat(buff.readLine());
           System.out.println("Enter the Breathe:");
           breathe=Float.parseFloat(buff.readLine());
           System.out.println("Enter the Height:");
           height=Float.parseFloat(buff.readLine());
           m=length*breathe*height;
           System.out.println("Volume of cuboid is:"+m);
        }  
       else if(var5==3){
       //Take input form user
           System.out.println("Enter Number for Volume:");
           var6=Float.parseFloat(buff.readLine());
           m=Math.pow(var6,3);
           System.out.println("Volume of Cube is:"+m);
        }
        else{
               System.out.println("You Entered Wrong Number ! Please Try Again:");
        }
    }
    else if(choose==4){
       System.out.println("Welcome to Weights");
       System.out.println("Choose any Number:");
       System.out.println("Enter:1 for Gram to Kilogram");
       System.out.println("Enter:2 for Gram to Ton");
       System.out.println("Enter:3 for Kilogram to Gram");
       System.out.println("Enter:4 for Kilogram to Ton");
       System.out.println("Enter:5 for ton to Gram");;
       System.out.println("Enter:6 for Ton to Kilogram");
        //Take input from user
       var7=Integer.parseInt(buff.readLine());

       //It is used for convertion m to{-
       if(var7==1){
       //Take input form user
           var8=Float.parseFloat(buff.readLine());
           m=0.001*var8;
           System.out.println("Your Kilogram is:"+m);
        }
       else if(var7==2){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var8=Float.parseFloat(buff.readLine());
           m=0.0000011*var8;
           System.out.println("Your Ton is:"+m);
        }
       else if(var7==3){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var8=Float.parseFloat(buff.readLine());
           m=1000*var4;
           System.out.println("Your Gram is:"+m);
        }
       else if(var7==4){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=0.001*var4;
           System.out.println("Your Ton is:"+m);
        }
       else if(var7==5){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=1000000*var4;
           System.out.println("Your Gram is:"+m);
        }  
       else if(var7==6){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var4=Float.parseFloat(buff.readLine());
           m=(1000)*var4;
           System.out.println("Your Kilogram is:"+m);
        }
       else{
           System.out.println("You Entered Wrong Number ! Please Try Again");
        }
    }
    else if(choose==5){
       System.out.println("Welcome to Time");
       System.out.println("Choose any Number:");
       System.out.println("Enter:1 for Seconds to Milliseconds");
       System.out.println("Enter:2 for seconds to Minutes");
       System.out.println("Enter:3 for Seconds to Hours");
       System.out.println("Enter:4 for Minutes to Milliseconds");
       System.out.println("Enter:5 for Minutes to Seconds");
       System.out.println("Enter:6 for Minutes to Hours");
       System.out.println("Enter:7 for Hours to Milliseconds");
       System.out.println("Enter:8 for Hours to Minutes");
       System.out.println("Enter:9 for Hours to Seconds");
       System.out.println("Enter:10 for Milliseconds to Seconds");
       System.out.println("Enter:11 for Milliseconds to Minutes");
       System.out.println("Enter:12 for Milliseconds to Hours");
        //Take input from user
       var9=Integer.parseInt(buff.readLine());

       //It is used for convertion m to{-
       if(var9==1){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=1000*var10;
           System.out.println("Your Milliseconds is:"+m);
        }
       else if(var9==2){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=0.0166*var10;
           System.out.println("Your Minutes is:"+m);
        }  
       else if(var9==3){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=0.00027778*var10;
           System.out.println("Your Hours is:"+m);
        }   
       else if(var9==4){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=60000*var10;
           System.out.println("Your Milliseconds is:"+m);
        }
       else if(var9==5){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=60*var10;
           System.out.println("Your Seconds is:"+m);
        }   
       else if(var9==6){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=0.01666*var10;
           System.out.println("Your Hours is:"+m);
        }
       else if(var9==7){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=3600000*var10;
           System.out.println("Your Milliseconds is:"+m);
        }
       else if(var9==8){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=60*var10;
           System.out.println("Your Minutes is:"+m);
        }  
       else if(var9==9){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=3600*var10;
           System.out.println("Your Seconds is:"+m);
        }    
       else if(var9==10){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=0.001*var10;
           System.out.println("Your Seconds is:"+m);
        }
       else if(var9==11){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=0.00001667*var10;
           System.out.println("Your Minutes is:"+m);
        }   
       else if(var9==12){
       //Take input form user
           System.out.println("Enter Number for Conversion:");
           var10=Float.parseFloat(buff.readLine());
           m=2.7778*var10;
           System.out.println("Your Hours is:"+m);
        }
       else
        System.out.println("You Entered Wrong Number ! Please Try Again");
    }      
    else
        System.out.println("You Entered Wrong Number ! Please Try Again");

}
else if(choose==6){
    break;
}
}
}
public static void main()throws IOException{
    pro obj=new pro();
    obj.choosemethod();
    }
}
