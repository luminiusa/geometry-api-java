package com.esri.core.geometry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CoverageHandler {
    public static final boolean[] MultiPathImpl_addSegmentsFromPath = new boolean[28];
    public static final boolean[] MultiPathImpl_insertPoints = new boolean[26];
    public static final boolean[] TopologicalOperations_normalizeResult = new boolean[25];
    public static final boolean[] AttributeStreamOfInt16_writeRange = new boolean[21];
    public static final boolean[] MultiPathImpl_openAllPathsAndDuplicateStartVertex = new boolean[25];
    public static final boolean[] RasterizedGeometry2DImpl_queryEnvelopeInGeometry = new boolean[23];
    public static final boolean[] OperatorExportToGeoJsonCursor_exportPolygonToGeoJson_ = new boolean[20];
    public static final boolean[] SweepComparator_compareSegments = new boolean[23];
    public static final boolean[] OperatorImportFromWkbLocal_importFromWkbMultiPoint = new boolean[29];
    public static final boolean[] RelationalOperationsMatrix_areaGeomContainsOrDisjointPredicates_ = new boolean[13];
    
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
        logHelper("MultiPathImpl::addSegmentsFromPath                               ", MultiPathImpl_addSegmentsFromPath);
        logHelper("MultiPathImpl::insertPoints                                      ", MultiPathImpl_insertPoints);
        logHelper("TopologicalOperations::normalizeResult                           ", TopologicalOperations_normalizeResult);
        logHelper("AttributeStreamOfInt16::writeRange                               ", AttributeStreamOfInt16_writeRange);
        logHelper("MultiPathImpl::openAllPathsAndDuplicateStartVertex               ", MultiPathImpl_openAllPathsAndDuplicateStartVertex);
        logHelper("RasterizedGeometry2DImpl::queryEnvelopeInGeometry                ", RasterizedGeometry2DImpl_queryEnvelopeInGeometry);
        logHelper("OperatorExportToGeoJsonCursor::exportPolygonToGeoJson_           ", OperatorExportToGeoJsonCursor_exportPolygonToGeoJson_);
        logHelper("SweepComparator::compareSegments                                 ", SweepComparator_compareSegments);
        logHelper("OperatorImportFromWkbLocal::importFromWkbMultiPoint              ", OperatorImportFromWkbLocal_importFromWkbMultiPoint);
        logHelper("RelationalOperationsMatrix::areaGeomContainsOrDisjointPredicates_", RelationalOperationsMatrix_areaGeomContainsOrDisjointPredicates_);
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
