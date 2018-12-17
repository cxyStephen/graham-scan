import java.io.*;

//driver class: reads the inputs and writes the outputs.
public class Main {

    private static final String dir = "./input/";

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        File inputDir = new File(dir);
        File[] files = inputDir.listFiles();

        try {
            for (File f : files) {
                String name = f.getName();
                if(name.equals("results"))
                    continue;
                String outName = name.substring(0, name.indexOf(".")) + "_convexhull.txt";

                String writePath = dir + "results/" + outName;
                br = new BufferedReader(new FileReader(f));
                bw = new BufferedWriter(new FileWriter(writePath));
                System.out.println("results/" + outName);

                //read from file
                line = br.readLine();
                Point[] points = new Point[Integer.parseInt(line)];

                for (int i = 0; i < points.length; i++) {
                    line = br.readLine();
                    int split = line.indexOf(",");
                    int x = Integer.parseInt(line.substring(1, split));
                    int y = Integer.parseInt(line.substring(split + 1, line.length() - 1));
                    points[i] = new Point(x, y);
                }

                //calculate the convex hull
                Point[] hull = GrahamScan.convexHull(points);

                //write to file
                System.out.println(hull.length);
                bw.write(hull.length + "\r\n");
                for (Point p : hull) {
                    System.out.println(p.toString());
                    bw.write(p.toString() + "\r\n");
                }

                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Either input directory is empty or there is a malformed input.");
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Failed to close input/output streams!");
                    e.printStackTrace();
                }
            }
        }
    }
}
