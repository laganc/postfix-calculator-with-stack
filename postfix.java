public class postfix {

	public static void main(String[] args){
    	myStack<Integer> s = new myStack<Integer>();
        int a = 0, b = 0;
    	//int[] intNums = new int[args.length];

    	for(int i = 0; i < args.length; i++){
            try{
                int x = Integer.parseInt(args[i]);
                s.push(x);
            } catch(NumberFormatException e){
                //Not an integer
            }
            if(args[i].equals("+")){
                a = s.pop();
                b = s.pop();
                int addition = a + b;
                s.push(addition);
            }
            if(args[i].equals("-")){
                a = s.pop();
                b = s.pop();
                int subtraction = a - b;
                s.push(subtraction);
            }
            if(args[i].equals("*")){
                a = s.pop();
                b = s.pop();
                int multiplication = a * b;
                s.push(multiplication);
            }
            if(args[i].equals("/")){
                a = s.pop();
                b = s.pop();
                int division = a / b;
                s.push(division);
            }
    	}
        int output = s.pop();
        System.out.println(output);
	}
}