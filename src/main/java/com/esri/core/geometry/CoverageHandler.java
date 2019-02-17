package com.esri.core.geometry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CoverageHandler {
    public static final boolean[] MultiPathImpl_addSegmentsFromPath = new boolean[16];
    public static final boolean[] MultiPathImpl_insertPoints = new boolean[16];
    public static final boolean[] TopologicalOperations_normalizeResult = new boolean[13];
    public static final boolean[] AttributeStreamOfInt16_writeRange = new boolean[15];
    public static final boolean[] MultiPathImpl_openAllPathsAndDuplicateStartVertex = new boolean[16];
    
    private static boolean[] target = null;
    
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
        System.out.println("-----------------------");
        logHelper("MultiPathImpl::addSegmentsFromPath                ", MultiPathImpl_addSegmentsFromPath);
        logHelper("MultiPathImpl::insertPoints                       ", MultiPathImpl_insertPoints);
        logHelper("TopologicalOperations::normalizeResult            ", TopologicalOperations_normalizeResult);
        logHelper("AttributeStreamOfInt16::writeRange                ", AttributeStreamOfInt16_writeRange);
        logHelper("MultiPathImpl::openAllPathsAndDuplicateStartVertex", MultiPathImpl_openAllPathsAndDuplicateStartVertex);
        System.out.println("-----------------------");        
    }
    
    private static void logHelper(String s, boolean[] toPrint) {
        System.out.print(s);
        for (boolean b : toPrint) {
            System.out.print(" " + (b ? 1 : 0));
        }
        System.out.println("");
    }
}
