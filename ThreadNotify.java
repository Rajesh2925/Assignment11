

class Container{
    int num;
Boolean valueSet=false;
    public synchronized void getNum() {
        while(valueSet){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("put"+num);
        valueSet=true;
        notify();
    }

    public synchronized void setNum(int num) {
        while(!valueSet){
            try{
                wait();

            }catch(InterruptedException e){}
        }System.out.print("get"+num);



        this.num = num;
        valueSet=false;
        notify();
    }
}


class produce implements Runnable {
    Container c;

    public produce(Container c) {
        this.c = c;
        Thread t = new Thread(this, "produce");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            c.setNum(i++);
            try {
                Thread.sleep(1000);

            }catch(Exception e){}
        }
    }
}
class consume implements Runnable{
    Container c;

    public consume(Container c) {
        this.c = c;
        Thread t=new Thread(this,"consumer");
        t.start();
    }
    public void run(){

        while(true){
            c.getNum();
            try{
                Thread.sleep(1000);}
catch(Exception e){}
            }

        }
    }


public class ThreadNotify {
        public static void main(String args[]){
            Container c=new Container();
           new produce(c);
            new consume(c);

        }
}

