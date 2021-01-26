import java.util.Scanner;
import java.lang.Character;



class Operations{
// реалізація сортування вибором
  void selectionSort(int arr[]) 
    { 
        int n = arr.length; 
  
        
        for (int i = 0; i < n-1; i++) 
        {  
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }
    // показ елементів в консолі
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }

  //сумма цифр в числі
    int sumDigigts(int num){
      int sum=0;
      while(num!=0){
        sum+=num%10;
        num/=10;
      }
      return sum;
    }
  //інверсія регістру  строки

  String reverseStr(String str){
    char []charArray = str.toCharArray();
    for(int i = 0; i< charArray.length;i++){
      char c = charArray[i];
      charArray [i] = Character.isUpperCase(c)?Character.toLowerCase(c):Character.toUpperCase(c);
      
    }
    return new String(charArray);
  }
    
  /*
   Розробіть метод, який дозволяє знайти спільні елементи двох діапазонів цілих
    чисел, та вивести їх на екран. Приклад: діапазон з 5 до 11 та діапазон з 18  до 9.
    Спільні елементи - 9,10,11.
    */
    void findCommonIntsInDiapason(int firstBeg, int firstEnd, int secondBeg, int secondEnd) {
        int tmp;
        if (firstBeg > firstEnd) {
            tmp = firstBeg;
            firstBeg = firstEnd;
            firstEnd = tmp;
        }
        if (secondBeg > firstEnd) {
            tmp = secondBeg;
            secondBeg = secondEnd;
            secondEnd = tmp;
        }

        if (firstBeg > secondBeg) {
            tmp = firstBeg;
            firstBeg = secondBeg;
            secondBeg = tmp;

            tmp = firstEnd;
            firstEnd = secondEnd;
            secondEnd = tmp;
        }
        for(int number = secondBeg; number <= firstEnd;++number){
            System.out.print(number + " ");
        }
    }
    

}


class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Введите число для изменения:");
    int num = sc.nextInt();
    String numMode = Integer.toHexString(num);
    System.out.println("Число " + num + " в HEX в представлении:  " + numMode);

    Operations digit = new Operations();
    int array[]= {433,37,8,12,55,73,12,4,0};
    digit.selectionSort(array);
    System.out.print("Sorted array:");
    digit.printArray(array);

    int numEdited=digit.sumDigigts(num);
    System.out.println("Sum digits = " +numEdited);
    
    System.out.print("Введите строку для инверсии:");
    String text= sc.next();
    String textMode = digit.reverseStr(text);
    System.out.println("Revers text = " +textMode);

    digit.findCommonIntsInDiapason(3,7,1,9);
  }
}