import java.util.Random;
import java.util.Scanner;

public class Login_page_of_Student_and_Marks {
    static int serch(String []a,String names){
        int index=-1;
        for(int idx=0;idx<a.length;idx++){
            if(a[idx].equals(names)){
                 index = idx;
            }
        }return index;
      }
      static void display(String []name,int [] m1,int []m2,int []m3,int [] m4,int []m5,int []m6,int serialno){
          System.out.println("profile");
          System.out.println("Name : "+name[serialno]);
          System.out.println("Student marks grade card ");
          System.out.println("Subject name   |   marks");
          System.out.println("Mathematics 3     "+m1[serialno]);
          System.out.println("CAO               "+m2[serialno]);
          System.out.println("Discrit M         "+m3[serialno]);
          System.out.println("Data Structure    "+m4[serialno]);
          System.out.println("OPPJ              "+m5[serialno]);
          System.out.println("UHV 2             "+m6[serialno]);
      }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
      
      //Database
        // Array for names
String[] name = {
  "RUTUJA MADHAV DESHMUKH", "SARVESH SUDHIR KULKARNI", "CHAITANYA RAJESH KOYALWAR",
  "ROHAN BALAJI KSHIRSAGAR", "PRATIKSHA PRABHAKAR GHATOL", "ADITYA BALASAHEB CHANDRAVANSHI",
  "KARN SURYAKANT DESHMUKH", "CHANDANA KIRAN CHIITTOJI", "MD FAISAL MD AMIN KHIMANI",
  "DARSHDEEP SINGH HARJEET SINGH DUTTA", "ANIKET SHIVAJIRAO JADHAV", "SHRUTI SANTOSH BHINGE",
  "NIKHIL PADMAKAR LANJE", "TANMAY SANJAY GAIDHANI", "SHIVAM VIDYADHAR JATALE",
  "ASHITOSH MANOJ CHARPILWAR", "SANKIRTANA SRINIVAS ADEPU", "ONKAR KRISHNAKUMAR KALASKAR",
  "ANKUSH ASHOKRAO DURGEKAR", "RITIKA HARIDAS BAILKWAD", "SUDESH ASHOK KADAM",
  "MRUDULA MOHANRAO KASRALIKAR", "SHIVAM NAGNATH KURUNDE", "ADITYA SHIVADATTA KORPAKWAD",
  "SARANG SATISH KADAM", "RUTIK SANTOSH HARBALE", "PRAJWAL SANJAY GOVANDE",
  "YASH SHRINIWAS BACHEWAR", "SAMADHAN MADHUKAR KAMBLE", "VAISHNAVI GAJANAN DHANDARE",
  "AARYA AMOL MALWADE", "MAROOF SYED FARUKH SYED", "IRAFAN RASHID SHAIKH",
  "DHANANJAY SANTOSHRAO KADAM", "PRANAV PRASHANT KULKARNI", "VEDANT BHARAT MORE",
  "DINKAR MADHAV NAMWAD", "ROHIT RAMESH SURYAWANSHI", "MOHAMMED SHAHID AMAAN MOHAMMED",
  "SOMESH NAVNATH SHERKAR", "BHAGYASHRI MUKUND SONTAKKE", "SAKSHI SURESH BHOYAR",
  "HARSHVARDHAN C. DESHMUKH", "OM RAJESH WATTAMWAR", "OMKAR BASWARAJ PARATKAR",
  "VEDANT VILAS PATIL", "SANIKA DATTARAO MANE", "TEJAS SANTOSHRAO MODI",
  "SIDRA SAREEN NISAR AHEMAD SHAIKH", "UTKARSH PRADIP SAWANT", "SWARUP SUNIL YASHWANT",
  "CHANDRASHEKHAR PRADIP KALYAN", "KRISHNA VASANTRAO RATHOD", "VIRBHADRA LAXMAN SAKARGE",
  "SHRUSTI SANTOSH CHANDOLE", "ATHARV CHANDRAKANT PAWAR", "VINAYAK BALAJI MUKHEDE",
  "YOGESH SANTOSH MARKHELE", "AVINASH RAMRAO WARED", "MD AZHAAN KHAN",
  "DEEPAK BAPURAO MORE", "SHREYA MADHAV BANSODE", "PRASAD NIWRUTTI TONCHAR",
  "VIJAY SHIDDHESHWAR YADAV", "KETAKI SHIVAJI GUNDEWAR", "ADITYA DATTA BANDEWAR",
  "ATIF ALI AYUB KHAN KHAN", "PAWAN REVAN WADJE", "RUSHIKESH VIKAS KADAM",
  "TEJSVINI ASHOKRAO KAULWAR", "PRITI MANOHAR HAMBARDE", "VAISHNAVI SANTOSH PIMPARWAR",
  "ARATI RAJKUMAR SURYAWANSHI", "SHWETA BHAGAWAN SHELKE", "PRANALI SATISH THOMBARE",
  "SANYUKTA NAGESH GANDEWAR", "BRAMHANAND VYANKAT GAIKWAD"
};

// Array for roll numbers
int[] password = {
  101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 
  119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 
  137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 
  155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 
  173, 174, 175, 176, 177};


  int[] m1 = {
    15, 8, 19, 13, 10, 17, 6, 18, 12, 14, 
    7, 16, 11, 9, 20, 5, 14, 10, 19, 8, 
    13, 11, 17, 6, 15, 12, 8, 18, 9, 10, 
    14, 5, 7, 16, 13, 15, 11, 19, 12, 8, 
    10, 17, 6, 14, 20, 9, 15, 13, 18, 7, 
    12, 11, 9, 16, 5, 13, 8, 20, 7, 15, 
    14, 10, 12, 19, 6, 17, 13, 11, 8, 9, 
    16, 5, 18, 14, 10
};

int[] m2 = {
    12, 9, 14, 18, 11, 7, 15, 10, 16, 8,
    13, 6, 17, 10, 14, 20, 9, 18, 11, 15,
    7, 19, 6, 12, 8, 13, 10, 15, 18, 9,
    7, 12, 20, 8, 16, 14, 6, 13, 11, 17,
    10, 5, 18, 15, 8, 12, 16, 14, 9, 20,
    7, 13, 11, 10, 19, 6, 15, 8, 12, 14,
    17, 9, 5, 18, 10, 8, 11, 14, 7, 13,
    12, 16, 9, 6, 15
};

int[] m3 = {
    16, 10, 13, 7, 12, 18, 5, 14, 20, 9,
    11, 17, 6, 15, 13, 8, 12, 19, 10, 14,
    7, 16, 9, 18, 15, 11, 5, 10, 13, 20,
    6, 12, 17, 7, 15, 9, 8, 14, 10, 11,
    18, 5, 19, 13, 9, 12, 17, 6, 16, 8,
    13, 11, 20, 14, 7, 15, 10, 5, 12, 18,
    9, 13, 6, 11, 14, 7, 8, 20, 16, 15,
    10, 17, 12, 9, 13
};

int[] m4 = {
    14, 8, 16, 11, 19, 7, 13, 10, 12, 18,
    9, 15, 6, 20, 11, 10, 8, 17, 9, 14,
    5, 13, 12, 18, 7, 15, 10, 14, 11, 9,
    17, 8, 6, 12, 19, 13, 20, 9, 14, 7,
    15, 6, 18, 11, 10, 13, 9, 16, 5, 14,
    11, 19, 7, 12, 10, 16, 8, 15, 13, 20,
    6, 11, 9, 14, 12, 5, 7, 18, 17, 15,
    10, 13, 8, 9, 16
};

int[] m5 = {
    13, 7, 14, 18, 11, 9, 12, 15, 6, 10,
    17, 8, 16, 13, 20, 12, 9, 14, 10, 7,
    15, 6, 11, 17, 9, 12, 14, 8, 20, 7,
    13, 15, 10, 6, 9, 19, 8, 11, 12, 18,
    10, 14, 5, 16, 12, 9, 11, 14, 13, 8,
    20, 7, 15, 10, 16, 12, 13, 9, 14, 6,
    11, 19, 7, 15, 10, 18, 8, 12, 9, 14,
    16, 5, 7, 10, 13
};

int[] m6 = {
    10, 18, 12, 9, 16, 11, 8, 14, 20, 7,
    15, 6, 13, 19, 10, 8, 17, 9, 14, 12,
    7, 16, 5, 18, 11, 10, 13, 8, 9, 12,
    6, 15, 7, 20, 10, 14, 9, 17, 13, 5,
    16, 8, 12, 19, 10, 6, 15, 9, 14, 11,
    18, 5, 13, 17, 9, 12, 7, 15, 8, 20,
    6, 13, 10, 11, 19, 14, 9, 7, 12, 16,
    15, 10, 8, 11, 13
};
        //  User interference 
        System.out.println("LOGIN PAGE");
        System.out.print("Username : ");
        String name_input=sc.nextLine();
        System.out.print("\nPassword :");
        int password_input=sc.nextInt();
        int captch=+random.nextInt(900000);// Captcha generating 
        System.out.println("Enter captcha : "+captch);
        int captcha_input=sc.nextInt();
        if(captch==captcha_input){
        int serialno=serch(name,name_input);
        // Backend Data serching 
        if(serialno!=-1){
          if(password_input==password[serialno]){
            System.out.println("Acciess permited");
            display(name,m1,m2,m3,m4,m5,m6, serialno);
          }else{
            System.out.println("plese enter correct password");
          }
        }else{
          System.out.println("Plese Enter valid username to login ");
        }
      }else{
        System.out.println("captcha not matheces");
      }
  }
}

