package com.facebook.facedetection.amlfacetracker;

public interface AMLTrackerConfiguration {
    boolean alignFace();

    int getMaxDetectionDim();

    int getMaxFaces();

    int getMaxNumScales();

    boolean isNeonSupported();

    boolean jpegEncodeAlignedFace();

    boolean returnFacesWithoutLandmarks();
}
