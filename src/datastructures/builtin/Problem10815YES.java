package datastructures.builtin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;

/**
 * Andy's First Dictionary.
 *
 * @author Izhari Ishak Aksa
 */
public class Problem10815YES {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String line;
        TreeSet<String> set = new TreeSet<String>();
        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    sb.append(c);
                } else if (sb.length() > 0) {
                    set.add(sb.toString().toLowerCase());
                    sb = new StringBuilder();
                }
            }
            if (sb.length() > 0) {
                set.add(sb.toString().toLowerCase());
            }
        }
        for (String s : set) {
            pw.println(s);
        }
        pw.flush();
        pw.close();
        br.close();
    }
}
