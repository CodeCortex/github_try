package Java_oops.com;

// this program is not in run

     class Phone{
        public void notice(){
            System.out.println("good morning");
        }
        public void ring() {
            System.out.println("the phone is ringing......");
        }
    }
    class Smartphone extends Phone {
        public void alarm() {
            System.out.println("this phone give the facilities of alarm");
        }

        public void ring() {
            System.out.println(" your smartphone is ringing........");
        }


        public class java_dynamic_method_dispatch {
            public static void main(String[] args) {
//        Phone obj = new Phone();  // allowed
//        Smartphone oj= new Smartphone();  // allowed
//        obj.ring();     // allowed

                Phone obb = new Smartphone();  // allowed
                //      Smartphone p= new Phone();  // not allowed       we can't take the subclass as a reference name.

                obb.notice();
                obb.ring();    // this will give the result of subclass
                // ph.alarm;  // not allowed because the reference is of phone


            }

        }
    }





