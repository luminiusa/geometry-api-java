package com.esri.core.geometry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CoverageHandler {
    public static final CoverageHandler c;
    
    static {
        c = new CoverageHandler();
    }
    
    private boolean[] MultiPathImpl_addSegmentsFromPath;
    
    private CoverageHandler() {
        MultiPathImpl_addSegmentsFromPath = new boolean[16];
    }
    
    public static void update(String identifier, int instrumentID) {
        boolean[] toUpdate = null;
        if (identifier.equals("MultiPathImpl::addSegmentsFromPath")) {
            toUpdate = c.MultiPathImpl_addSegmentsFromPath;
        } else {
            System.out.println("\n\nUNRECOGNIZED IDENTIFIER: " + identifier + "\n\n");
        }
        if (!toUpdate[instrumentID]) {
            toUpdate[instrumentID] = true;
            log();
        }
    }
    
    private static void log() {
        logHelper("MultiPathImpl::addSegmentsFromPath", c.MultiPathImpl_addSegmentsFromPath);
    }
    
    private static void logHelper(String s, boolean[] toPrint) {
        System.out.print(s + ":");
        for (boolean b : toPrint) {
            System.out.print(" " + (b ? 1 : 0));
        }
        System.out.println("");
    }
}
