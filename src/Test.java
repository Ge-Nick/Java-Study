public class Test {
    public static void main(String[] args) {
        int varTest = 100;
        int varTest1 = 50;
        System.out.println(varTest + " " + varTest1);
        System.out.println(varTest1);
        //int varTest3 = varTest ^ varTest1;
        //System.out.println(varTest3);
        varTest += varTest1;
        varTest1 = varTest - varTest1;
        varTest -= varTest1;
        System.out.println(varTest + " " + varTest1);

        int tern = varTest > varTest1 ? (varTest - varTest1) : varTest1 - varTest;
        System.out.println(tern);
    }
}
