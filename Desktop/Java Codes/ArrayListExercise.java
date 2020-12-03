import java.util.*;
public class ArrayListExercise{

public static void main(String[] args){
Scanner con = new Scanner(System.in);
int n=1;
String num = null;
ArrayList<String> name = new ArrayList<String>(); //given format
System.out.println("Add Student Mode (type  -1 to exit mode)");
System.out.print("-------------------------------\n");

     do{                  //do while since it executes until the given limitation                                   
        System.out.print("Enter Student#"+n+": ");
        num = con.next();
        name.add(num);
        n++;
     }while(!(num.equals("-1"))); //the limitation which is entering -1                      
     name.remove("-1"); 
     
    ArrayList<Double>[] scores = new ArrayList[name.size()];//given format
    for (int i = 0; i < name.size(); i++) {
    scores[i] = new ArrayList<Double>();                
    }
   
    System.out.println("Exiting Add student mode...");
    System.out.print("-------------------------------\n");

System.out.print("\nENTER NUMBER OF QUIZZES: ");
int nQ = con.nextInt();

     for(int i = 0;i < name.size();i++){//loop for the name of students
        Double nums = .0; //initialize
        System.out.print("Enter scores for "+name.get(i) + ": \n");        
        for(int j = 0;j < nQ;j++){//loop for number of quizzes entered
            System.out.print("Quiz#"+(j+1)+": ");                  
             nums = con.nextDouble();
             scores[i].add(nums);                                        
            }
        }
   System.out.print("\nOutput:");
   System.out.print("\nStudent\t");
   for(int i = 1; i <= nQ;i++){
      System.out.print("Quiz "+i+"\t");
   }
   System.out.print("Total\t\tAverage\n");
   /*String temp = new String();              //I tried to sort but it's still complicated haha
                                              //dont mind this sir
   boolean sort = true; 
   for(int i = 0; i < n-1;i++){ 
      for(int j = i+1; j < n; j++){
      int t = 0 , t2 = 0;
         for(int x = 0; x < nQ; x++){
         t += scores[i].get[x];     
         t2 += scores[j].get[x]; 
                 } 
     if(t < t2)
            sort = true;
     else
            sort = false;
            if(sort){
               temp = num[i];
               num[i] = num[j];
               num[j] = temp;
                  for(int y = 0 ; y < nQ;y++){
                     int tempnum = score[i][y];
                     score[i].get[y] = score[j].get[y];
                     score[j].get[y] = tempnum;    
            }
            -----------------------------------
        int arrLength = name.length;
        if (arrLength == 0)
            return array;
        int max = array[0], min = array[0];
        for (int i = 1; i < arrLength; i++) {
            if (name[i] > max)
                max = array[i];
            if (nam[i] < min)
                min = array[i];
        }
        int range = max - min + 1;

        int[] count = new int[range];
        for (int i = 0; i < arrLength; i++){
            count[array[i] - min]++;}
        for (int i = 1; i < range; i++){
            count[i] += count[i - 1];}
        int j = 0;
        for (int i = 0; i < range; i++){
            while (j < count[i])
                array[j++] = i + min;
            }

         return array; 
       }  
      } */   
       for(int i = 0;i<name.size();i++){//loop to output the names of student
        System.out.print(name.get(i)+"\t\t");
        for(int j = 0;j<nQ;j++){//loopfor the number of quizzes and display the scores
            System.out.print(String.format("%.2f",(scores[i].get(j)))+"\t\t");
        }
        double total = 0.0;
        for(int j = 0;j < nQ;j++){//loop for the total
            total += scores[i].get(j); 
        }
        System.out.print(String.format("%.2f",total)+"\t\t"+ String.format("%.2f",(total/nQ))+"\n"); 
        //string format is used to lessen the numbers of decimal point and would 
        //only print 2 decimal places.
    }

    }
}