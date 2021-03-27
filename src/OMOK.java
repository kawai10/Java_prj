public class OMOK {
    public static void main(String[] args) {
        for (int y=0; y<10; y++){
            for (int x=1; x<=10; x++){
                if(x==4 && y==2) {
                    System.out.printf("%c", '○');
                }
                else if (x==1 && y==0) {
                    System.out.printf("%c",'┌');
                }
                else if (x==10 && y==0) {
                    System.out.printf("%c", '┐');
                }
                else if (x==1 && y==9) {
                    System.out.printf("%c", '└');
                }
                else if (x==10 && y==9) {
                    System.out.printf("%c", '┘');
                }
                else if (y==0) {
                    System.out.printf("%c", '┬');
                }
                else if (x==1) {
                    System.out.printf("%c", '├');
                }
                else if (x==10) {
                    System.out.printf("%c", '┤');
                }
                else if (y==9) {
                    System.out.printf("%c", '┴');
                }
                else {
                    System.out.printf("%c", '┼');

                }

            }System.out.println();
        }
    }
}
