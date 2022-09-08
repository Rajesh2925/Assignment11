import java.io.*;
    class Svce implements Serializable
    {
        String name;
        int regId;
        static String contact;
        Svce(String n, int r, String c)
        {
            this.name = n;
            this.regId = r;
            this.contact = c;
        }

        @Override
        public String toString() {
            return "Svce{" +
                    "name='" + name + '\'' +
                    ", regId=" + regId +
                    '}';
        }
    }

    class SerializeExample
    {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            try {
                Svce svce = new Svce("Rajesh", 104, "143");
                FileOutputStream fos = new FileOutputStream("E:\\programs\\svce.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(svce);
                oos.flush();
                oos.close();

                FileInputStream fis = new FileInputStream("E:\\programs\\svce.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Svce svce1 = (Svce) ois.readObject();
                System.out.println(svce1);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }


