
import java.util.ArrayList;
import java.util.Scanner;

    public class ArrayList1 {

        public static void main(String[]args)
        {
            ArrayList<String>list = new ArrayList<>();
            Pojo pojos = new Pojo();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter some datas else enter quit");
            String input;
            while(true)
            {
                input = sc.nextLine();
                if(!input.equalsIgnoreCase("quit"))
                {
                    list.add(input);
                }
                else
                {
                    break;
                }
            }
            pojos.setList1(list);
            System.out.println("list is"+pojos.getList1());
            System.out.println("enter the data need to remove");
            String inputs = sc.nextLine();
            if(pojos.getList1().contains(inputs))
            {
                pojos.getList1().add(pojos.getList1().indexOf(inputs), null);
                pojos.getList1().remove(inputs);
                System.out.println("list is"+pojos.getList1());

            }

            sc.close();
        }

    }


