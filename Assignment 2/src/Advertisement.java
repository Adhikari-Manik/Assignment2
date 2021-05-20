import java.util.Scanner;

public class Advertisement {

	public static void radioAdvertisement(){
        double cost=1.33333333333;  //   It is 20 divide by 15 (20/15)
        double studioCostBusinHour=70;
        double studioCostEvening=60;
        double studioCostOvernight=35;
        double totalplacementradioadcost=0;
        double prep=0;
        double radio;
        double ad[]=new double[100];
        double advert[]=new double[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("\t Please type the number of advertisement you want: ");
        radio = scan.nextInt();
        for(int i=1;i<=radio;i++){  
                System.out.print("\t Please type the time frame of the advertisement "+i+"(in sec): ");
                advert[i]=scan.nextInt();
        }
        for(int i=1;i<=radio;i++){  
                ad[i]=advert[i]*cost;
               prep=prep+ad[i];
        } 
        System.out.println("\t  The cost of Radio Advertisement Prepration  : $"+Math.ceil(prep));
        System.out.println("***************************************************************************");
        System.out.print("\t Please type the number of radio played during the business hour: ");
        double radioBusinessHour = scan.nextInt();
        System.out.print("\t Please type  the number of weeks you want to  play on during business hours: ");
        double radioPlayedWeek = scan.nextInt();
        System.out.print("\t Please type number of radio stations you want to be played on during evenings: ");
        double radioPlayedEvening = scan.nextInt();
        System.out.print("\t Please type number of weeks you want to be radio station played on during evenings: ");
        double radioPlayedEveningWeek = scan.nextInt();
        System.out.print("\t Please type number of radio stations you want to be played on during overnight and weekends: ");
        double radioPlayedOvernight = scan.nextInt();
        System.out.print("\t Please type number of weeks you want to be radio station played on during overnight and weekends: ");
        double radioPlayedOvernightWeek = scan.nextInt();
        totalplacementradioadcost=totalplacementradioadcost+((radioPlayedWeek*radioBusinessHour*studioCostBusinHour)+(radioPlayedEveningWeek*radioPlayedEvening*studioCostEvening)+(radioPlayedOvernightWeek*radioPlayedOvernight*studioCostOvernight));
        System.out.println("\t Radio Advertisement Placement Cost is : $"+Math.ceil(totalplacementradioadcost));
        System.out.println("\t Total Radio Advertisement Cost is : $"+Math.ceil(prep+totalplacementradioadcost));
        System.out.println("********************************************************************************* ");
        mainMenu();
}





 public static void televisionAdvertisement(){
        double basicAdvert=3.666666;    // 110/30
        double voiceAdvert=8.333333;   // 250/30
        double highExpo=400;
        double mediumExpo=280;
        double lowExpo=150;
        double tspcp=0;
        double tdbcp=0;
        double tdvcp=0;
        double totaltvprepcost=0;
        double totalplacementtvadcost=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("\t Please type the duration you want to show images in television advertisement(in sec): ");
        double tdb = scan.nextInt();
        if(tdb<=30 && tdb>0){
                tdbcp=basicAdvert*30;
        }
        if(tdb>30){
                tdbcp=basicAdvert*tdb;
        }
        System.out.print("\t Please type the duration you want to show filmed footage in television advertisement(in sec): ");
        double tdv = scan.nextInt();
        if(tdv<=30 && tdv>0){
                tdvcp=voiceAdvert*30;
        }
        if(tdv>30){
                tdvcp=voiceAdvert*tdv;
        }
        totaltvprepcost=totaltvprepcost+tdbcp+tdvcp;
        System.out.println("\t Radio Advertisement Prepration Cost is : $"+Math.ceil(totaltvprepcost));
        System.out.println("*****************************************************************************");
        System.out.print("\t Please type how many channels you want to have high exposure for television advertisement: ");
        double televisionAdvertHighExpo = scan.nextInt();
        System.out.print("\t Please type number of weeks you want high exposure television advertisement: ");
        double televisionAdvertHighExpoWeeks = scan.nextInt();
        System.out.print("\t Please type how many channels you want to have medium exposure for television advertisement: ");
        double televisionAdvertMediumExpo = scan.nextInt();
        System.out.print("\t Please type number of weeks you want high exposure medium advertisement: ");
        double televisionAdvertMediumExpoWeeks = scan.nextInt();
        System.out.print("\t Please type how many channels you want to have low exposure for television advertisement: ");
        double televisionAdvertLowExpo = scan.nextInt();
        System.out.print("\t Please type number of weeks you want low exposure television advertisement: ");
        double televisionAdvertLowExpoWeeks = scan.nextInt();

        System.out.println("\t Please type whether you want feature in any specific type of programs such as sports, news, childrens programs.: ");
        System.out.println("\t Choose y for YES and n for NO: ");
        System.out.print("\t Choose your choice: ");
        char tspyn = scan.next().charAt(0);
        if(tspyn=='y' || tspyn=='Y' ){
                tspcp=100;
                System.out.print("\t Please type number of weeks you want feature in any specific type of programs: ");
                double featureSpecificProgram = scan.nextInt();
                tspcp=tspcp*featureSpecificProgram;
        }
        if(tspyn=='n' || tspyn=='N' ){
                tspcp=0;
        }
        totalplacementtvadcost=totalplacementtvadcost+((televisionAdvertHighExpoWeeks*televisionAdvertHighExpo*highExpo)+(televisionAdvertMediumExpoWeeks*televisionAdvertMediumExpo*mediumExpo)+(televisionAdvertLowExpoWeeks*televisionAdvertLowExpo*lowExpo)+(tspcp));
        System.out.println("\t Television Advertisement Placement Cost is : $"+Math.ceil(totalplacementtvadcost));
        System.out.println("\t Total Television Advertisement Cost is : $"+Math.ceil(totaltvprepcost+totalplacementtvadcost));
        System.out.println("*****************************************************************************");
        mainMenu();
        
}







 public static void newspaperAdvertisement(){
        double baseCostForNewspaper=1.35;  
        double nap=0;
        double plainBlackAndWhite=2.20;
        double dbm=0;  

        double totalplacementnewsadcost=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\t Please type the dimension of advertisement in newspaper (in centimeters)-> ");
        System.out.print("\t Please type the height of advertisement : ");
        double adHeight = scan.nextDouble();
System.out.print("\t Please type the width of advertisement : ");
        double adWidth = scan.nextDouble();
        double nar= adHeight*adWidth;
        double calc=nar*baseCostForNewspaper;
        System.out.println("\t Do you need any graphics design in the work? ");
        System.out.println("\t Choose y for YES and n for NO: ");
        System.out.print("\t Choose your choice: ");
        char charact = scan.next().charAt(0);
        if(charact=='y' || charact=='Y' ){
                nap=20;
        }
        if(charact=='n' || charact=='N' ){
                nap=0;
        }
        System.out.println("\t Choose 1 for plain black-and-white advertisements ");
        System.out.println("\t Choose 2 for full-colour advertisements ");
        System.out.print("\t Enter your choice::");
        int choicen = scan.nextInt();
        if(choicen==1){
        	plainBlackAndWhite=2.20*nar;
        }
        if(choicen==2){
        	plainBlackAndWhite=4.80*nar;
        }
        System.out.println("\t Choose whether advertisement is needed to appear in a prominent place within the newspaper");
        System.out.println("\t Press y for YES and n for NO: ");
        System.out.print("\t Enter your choice: ");
        char confirm = scan.next().charAt(0);
        if(confirm=='y' || confirm=='Y' ){
                dbm=10;
        }
        if(confirm=='n' || confirm=='N' ){
                dbm=0;
        }
        System.out.print("\t Type the number of newspapers you want in advertisement: ");
        double nn = scan.nextDouble();
        totalplacementnewsadcost=totalplacementnewsadcost+(nn*(calc+nap+plainBlackAndWhite+dbm));
        System.out.println("\t Total Newspaper Advertisement Cost is : $"+Math.ceil(totalplacementnewsadcost));
        System.out.println("**************************************************************************************");
        mainMenu();
}





public static void mainMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\t Enter 1 for Radio and Spotify advertising campaigns ");
                System.out.println("\t Enter 2 for Television advertising campaigns ");
                System.out.println("\t Enter 3 for Newspaper advertising campaigns ");
                System.out.println("\t Enter 0 to EXIT: ");
                System.out.print("\t Enter your choice::");
                int choice = scan.nextInt();
                System.out.println();


                switch(choice){
                case 1: System.out.println("\t\tWelcome to Radio and Spotify advertising campaigns");
                System.out.println();
                radioAdvertisement();
                break;
                case 2: System.out.println("\t\tWelcome to Television advertising campaigns");
                System.out.println();
                televisionAdvertisement();
                break;
                case 3: System.out.println("\t\tWelcome to Newspaper advertising campaigns");
                System.out.println();
                newspaperAdvertisement();
                break;
                case 0: System.out.println("Thank for using our service.");
                System.exit(0);
                break;
                default: System.out.println("Incorrect input!!! Can you please re-enter options from our menu again?");
                mainMenu();
                }       
}



public static void main(String[] args){
System.out.println();
        System.out.println("\t\tWelcome to Advertising Agency quote-management system \n");
        mainMenu();

}
}
