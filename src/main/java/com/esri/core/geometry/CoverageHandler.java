package com.esri.core.geometry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CoverageHandler {
    public static final boolean[] MultiPathImpl_addSegmentsFromPath;
    public static final boolean[] MultiPathImpl_insertPoints;
    private static boolean[] target = null;
    
    static {
        MultiPathImpl_addSegmentsFromPath = new boolean[16];
        MultiPathImpl_insertPoints = new boolean[16];
    }
    
    public static void setTarget(boolean[] target) {
        CoverageHandler.target = target;
    }
    
    public static void update(int instrumentID) {
        if (!target[instrumentID]) {
            target[instrumentID] = true;
            log();
        }
    }
    
    private static void log() {
        logHelper("MultiPathImpl::addSegmentsFromPath", MultiPathImpl_addSegmentsFromPath);
        logHelper("MultiPathImpl::insertPoints", MultiPathImpl_insertPoints);
    }
    
    private static void logHelper(String s, boolean[] toPrint) {
        System.out.print(s + ":");
        for (boolean b : toPrint) {
            System.out.print(" " + (b ? 1 : 0));
        }
        System.out.println("");
    }
}
