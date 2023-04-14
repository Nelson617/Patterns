public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }

    public PatternMaker() {
        System.out.println("Hola Pattern Maker");

        pattern1();
        pattern2();
        pattern3();
        pattern5();
        pattern6();
    }

    public void pattern1() {
        for (int x = 0; x < 6; x++) {
            //     for(int y = 0; y < 5; y++){
            System.out.println(x * 5);
            //     }
        }
    }

    public void pattern2() {
        for (int n = 0; n < 6; n++) {
            System.out.println(2 + n * 5);

        }

    }

    public void pattern3() {
        for (int w = 21; w > 0; w = w - 4) {
            System.out.print(w * 4 + "\t");
        }
    }


    public void pattern5() {
        System.out.println();
        for (int z = 0; z < 4; z++) {
            for (int c = 1; c < 5; c++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        for (int e = 0; e < 5; e++) {
            for (int p = 1; p < 5; p++) {
            }
            System.out.println();
        }
    }
}

