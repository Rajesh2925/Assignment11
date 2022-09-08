public class genericExample{
    static <E> void  genericMethod(E[] array ){
        for(E element : array){
            System.out.println(element);
        }
    }
    public static void main(String args[]){
        Integer[] intArr={1,2,4,5,7,8};
        String[] strArr={"rajesh","Kumar"};
        genericMethod(intArr);
        genericMethod(strArr);
    }
}
