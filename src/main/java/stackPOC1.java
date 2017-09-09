/**
 * Created by Ketan Katariya on 08-09-2017.
 */
public class stackPOC1 {
    public static int getPopVal = 0;
    public static void main(String[] args) {
        System.out.println("***Welcome to Push Pop Operation***");
        Stack stk = new Stack();
        stk.push(10);
        stk.push(15);
        stk.push(21);
        stk.push(27);
        stk.push(62);
        stk.push(123);
        stk.push(102);
        stk.push(201);
        stk.push(123);
        stk.push(123);
        getPopVal = stk.pop();
        getPopVal = stk.pop();
        getPopVal = stk.pop();
        getPopVal = stk.pop();
         stk.print();
    }
}

class Stack{
    public int pt=0;
    public int stk[] = new int[10];

    public void push(int val){
        if(pt<10){
            stk[pt] = val;
            System.out.println("Pushed Value --> stk["+pt+"] = " + stk[pt]);
            pt = pt + 1;
        }
    }

    public int pop(){
        int popVal = 0;
        if(pt>0){
            popVal = stk[pt - 1];
            pt = pt - 1;
        }
    return popVal;
    }

    public void print(){
        System.out.println("Current Stack is --");
        for(int i=0; i<pt; i++){
            System.out.println("stk["+i+"] = " + stk[i]);
        }
    }
}