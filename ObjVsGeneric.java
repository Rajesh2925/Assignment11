public class ObjVsGeneric<rajesh> {

        private rajesh obj;


        public Object getObj() {
            return obj;
        }

        public void setObj(rajesh obj) {
            this.obj = obj;
        }


    public static void main(String args[]) {

        //ObjVsGeneric<Integer> obj = new ObjVsGeneric();
        ObjVsGeneric <String> obj1 = new ObjVsGeneric();
       // obj.setObj("1");
        obj1.setObj("1");
       // System.out.println(obj.getObj());
        System.out.println(obj1.getObj());


    }
}
