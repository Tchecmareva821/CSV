import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    // �������� ����������
    private static final String separator = File.separator; //";"
    private static final String fname = "URUS.csv"; // ���� � �������
    private static int elements1[][] = new int[6][3];
    private static String s[]=new String[6];

    // ����������� ������ � �����

    // �������� ���������
    public static void main(String[] args) throws IOException {

        // ������� ������ �� �����
        ReadCSV();
        double average=0;

        for (int i = 0; i < 6; i++) {
            //average
            for (int j = 0; j < 3; j++) {
                average = (double) (elements1[i][j] + average);
            }
            average=average/3;

            System.out.println(s[i]+average);
        }
    }

    // ��������� ������ �� ����� � ������
    public static void ReadCSV() throws IOException /*throws IOException*/ {
        File file = new File(fname);
        try( BufferedReader br=
                new BufferedReader(new InputStreamReader(new FileInputStream(file), "Windows-1251"));) {
            String line="";
            int i=0;
                    line=br.readLine();
                    while((line=br.readLine())!=null){
                        String[] elements = line.split(separator);
                        s[i]=elements[0];
                        elements1[i][0] = Integer.parseInt(elements[3]);
                        elements1[i][1] = Integer.parseInt(elements[4]);
                        elements1[i][2] = Integer.parseInt(elements[5]);
                        elements1[i][3] = Integer.parseInt(elements[6]);
                        i++;

                    }

        }
        catch(UnsupportedEncodingException e){
    e.printStackTrace();
        }
        catch(IOException e){
    e.printStackTrace();
        }
    }
}