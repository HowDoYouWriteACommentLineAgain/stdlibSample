/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CIIT
 */
public class DrawingKo {
    
    public static void main(String[] args) {
        // number of line segments to plot
        int n = 100;
//        int n = Integer.parseInt(args[0]);
        //in netbeans leftclick the project then add in the run the argument

        // the function y = sin(4x) + sin(20x), sampled at n+1 points
        // between x = 0 and x = pi
        double[] x = new double[n+1];
        double[] y = new double[n+1];
        for (int i = 0; i <= n; i++) {
            x[i] = Math.PI * i / n;
            y[i] = Math.sin(4*x[i]) + Math.sin(20*x[i]);
        }

        // rescale the coordinate system
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.1, +2.1);

        // plot the approximation to the function
        for (int i = 0; i < n; i++) {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }
    }
    
}
