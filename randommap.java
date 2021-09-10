import java.util.Scanner;
public class randommap {
     String loc="[#]";
    public static void loop(){
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println("|||||__ENTRANCE_||||||||||||||||___________|||||||||||||||||||||||||||");
    System.out.println("|||||  |EXIT|   ||=============||           ||||||||||||||||||||||||||");
    System.out.println("||||| |||       ||||||||||||||||   WATSONS |||||||||||||||||||||||||||");
    System.out.println("|||||___________||||||||||||||||___________|||||||||||||||||||||||||||");
    System.out.println("|||||||||=||||\\||||||||||||||//||||\\||||||||||||||||||||||||||||||||||");
    System.out.println("|||||||||=|||||\\||||||||||||//||||||\\|||||||||||||||||||||||||||||||||");
    System.out.println("|||||||||=||||||\\||||||||||//||||||||\\||||||||||||||||||||||||||||||||");
    System.out.println("|||||||||=|||||||\\||||||||//|||||||||||\\|_____BDO___||||||||||||||||||");
    System.out.println("|||||||||=||||||||\\||||||//||||||||||||||            ||||||||||||||||||");
    System.out.println("|||||||||=|||||||||\\||||//|||||||||||||||        ||||||||||||||||||||||");
    System.out.println("|||||||||=||||||||||\\||//||||||||||||||||------------||||||||||||||||||");
    System.out.println("|||_____________|||||\\//||||||||||||||||||||||||||\\|||||||||||||||||||");
    System.out.println("||||||||         ||||\\||||||||||||||||||||||||||||\\|||||||||||||||||");
    System.out.println("||| WORLD OF FUN |||//|\\|||||||||||||||||||||___||||||||___|||||||||||");
    System.out.println("||||||||||||||||||======\\====================|COMFORT ROOM ||||||||||");
    System.out.println("|||______________||||||||\\||||||||||||||||||||   |||||| || ||||||||||");
    System.out.println("||||\\||||||||||||\\|||||||\\||||||||||||||||||____________|||||||||||||");
    System.out.println("|||||\\||||||||||||\\|||||||\\||||||||||||||||||||//||||||||||||||||||");
    System.out.println("||||||\\||||||||||||\\|||||||\\|||||||||||||||||//|||||||||||||||||||||");
    System.out.println("|||||||\\||||||||||||\\|||||||\\||||||||||||||//||||||||||||||||||||||");
    System.out.println("||||||||\\|||||||||||||\\||||||\\||||||||||||//|||||||||||||||||||||||||");
    System.out.println("|||||___________||||||||\\===|__STARBUCKS__//|||||||||||||||||||||||||");
    System.out.println("|||||MANG INASAL||||||||||||||            ||||||||||||||||||||||||||||");
    System.out.println("|||||           |============|             |||||||||||||||||||||||||||");
    System.out.println("|||||           |||||||||||||||___________||||||||||||||||||||||||||||");
    System.out.println("|||||___________||||||||||||||||//|||||||\\|||||||||||||||||||||||||||");
    System.out.println("|||||||\\||||||||||||||||||||||//|||||||||\\||||||||||||||||||||||||||");
    System.out.println("||||||||\\||||||||||||||||||||//|||||||||||\\||||||||||||||||||||||||||");
    System.out.println("|||||||||\\||||||||||||||||||//|||||||||||||___________||||||||||||||||");
    System.out.println("||||||||||\\||||||||||||||||//|||||||||||//|           ||||||||||||||||");
    System.out.println("|||||||||||\\||||||||||||||//|||||||||||//||PARKING LOT|||||||||||||||");
    System.out.println("||||||||||||\\|||_______________|||||||//|||___________|||||||||||||||");
    System.out.println("|||||||||||||\\||               ||||||//||||||||||||||||||||||||||||||");
    System.out.println("|||||||||||||||NATIONAL BOOKSTORE||||//|||||||||||||||||||||||||||||||");
    System.out.println("|||||||||||||||                  |||//||||||||||||||||||||||||||||||||");
    System.out.println("|||||||||||||||||_______________||=//|||||||||||||||||||||||||||||||||");
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println("||||||||||||||||||||[#]==currentLocation||||||||||||||||||||||||||||||");
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    
    }
    public static void main(String[] args) {
    
    do {
    //GENERATE DISTANCE/METER 10 TO 100
    int min = 10, max = 100;
    //STOP LOOPING WHEN USER WANT TO EXIT
     
    //LIST OF PLACES
    String[] places;
    places = new String[8];
    places[0] = "STARBUCKS";
    places[1] = "BDO";
    places[2] = "MANG INASAL";
    places[3] = "NATIONAL BOOKSTORE";
    places[4] = "COMFORT ROOM";
    places[5] = "WATSONS";
    places[6] = " WORLD OF FUN";
    places[7] = "PARKING LOT";
    //MENU OR SELECTION FOR USER AS INPUT
    String destinationSelected;
    loop();
    System.out.println(" ");
    System.out.println("-------------------------- Java Malling --------------------------");
    System.out.println(" ");
    String place = " A.STARBUCKS " + " B.BDO " + " C.MANG INASAL " + "\n" + " D.NATIONAL BOOKSTORE "
        + "E.COMFORTROOM " + "\n" + " F.WATSONS " + " G.WORLD OF FUN " +"H.PARKING LOT"+ " I.EXIT ";
    System.out.println(place);
    System.out.println(" ");


    //POSSIBLE ROUTES/OTHER/NEAR ROUTES OR DESTINATIONS
    int route, nearRoute, otherRoute;
    route = (int) (Math.random() * 7);
    nearRoute = (int) (Math.random() * 7);
   
    
    //NEAR AND OTHER ROUTE IN METER        
   double routeMeter = (int)Math.floor(Math.random()*(max-min+2)+min);
   double nearRouteMeter = (int)Math.floor(Math.random()*(max-min+2)+min);
   double otherRouteMeter = (int)Math.floor(Math.random()*(max-min+2)+min);

    //GENERATE RANDOM/CURRENT LOCATION/PLACES AND METERS/DISTANCE      
    int randomPlaces, currentPlaces, meterAway;
    randomPlaces = (int) (Math.random() * 7);
    currentPlaces = (int) (Math.random() * 7);
    meterAway = (int) Math.floor(Math.random() * (max - min) + min);
    System.out.println("Current Location: " + places[currentPlaces]);
    System.out.println(" ");
    //SPEED PER MINUTE ON ROUTE METER       
    double speed,time, nearTime, otherTime, distance, nearDistance, otherDistance;
    speed = 0.1; 
    distance = (double)Math.ceil(Math.random()*(max-min+2)+min); nearDistance = (double)Math.ceil(Math.random()*(max-min+2)+min); otherDistance = (int)Math.ceil(Math.random()*(max-min+2)+min);
    time = distance/speed; nearTime = nearDistance/speed; otherTime = otherDistance/speed;
    //TIME        
    double timerouteMeter=distance%routeMeter,timenearRouteMeter=nearDistance%nearRouteMeter, timeotherRouteMeter=otherDistance%otherRouteMeter;

    System.out.print("Please Select Destination: ");
    //SCANNER FOR USERSELECT                    
    Scanner scan = new Scanner(System.in);
    char userSelect = scan.next().charAt(0);

    //OUTPUT OF USER SELECTION                
    switch (userSelect) {

    case 'a':
    case 'A':
    destinationSelected = "STARBUCKS";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
        || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
    System.out.println("Fastest Route is: " + places[route] + "  " + route + " meters away, "
                       + places[nearRoute] + " " + nearRoute + " meters away, ");
    } else {
    System.out.println("Location is very far.");
    }
    break;
    case 'b':
    case 'B':
    destinationSelected = "BDO";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest Route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    break;
    case 'c':
    case 'C':
    destinationSelected = "MANG INASAL";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest Route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    break;
    case 'd':
    case 'D':
    destinationSelected = "NATIONAL BOOKSTORE";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest Route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    break;
    case 'e':
    case 'E':
    destinationSelected = "COMFORT ROOM";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest Route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    break;
    case 'f':
    case 'F':
    destinationSelected = "WATSONS";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest Route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    break;
    case 'g':
    case 'G':
    destinationSelected = "WORLD OF FUN";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest Route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    break;
    case 'h':
    case 'H':
    destinationSelected = "PARKING LOT";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest Route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    break;
    //PROGRAM WILL STOP IF USER WANT TO EXIT            
    case 'i':
    case 'I':
    destinationSelected = "EXIT";
    System.out.println("Possible Route is: " + places[route] + " about " + timerouteMeter + " minutes and " + routeMeter + " meters away, \n"
                       + places[nearRoute] + " about " + timenearRouteMeter + " minutes and " + nearRouteMeter + " meters away,\n"
                       );   
    if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute)
        if (randomPlaces != route || route != randomPlaces && randomPlaces != nearRoute
            || nearRoute != randomPlaces && randomPlaces != randomPlaces) {
        System.out.println("Fastest route is: " + places[route] + " " + route + " meters away "
                           + places[nearRoute] + " " + nearRoute + " meters away ");
        } else {
        System.out.println("Location is very far.");
        }
    System.exit('i'+'I');
    System.out.println("Thanks for Shopping with us.");
    
    scan.close();
    break;
    //IF INPUT IS INTEGER OR LOWERCASE LETTER PROGRAM WILL PRINT "INVALID" AND RE-RUN THE PROGRAM            
    default:
    destinationSelected = "INVALID OPTION, PLEASE SELECT AGAIN.";
    System.err.print(destinationSelected);
    break;

    }
    System.out.println("Your Destination is: " + destinationSelected);
    System.out.println(" ");
    
    } while (true);
    
    }
}
