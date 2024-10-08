package X;

import com.facebook.facedetection.amlfacetracker.AMLTrackerConfiguration;

/* renamed from: X.SmQ  reason: case insensitive filesystem */
public final class C12071SmQ implements AMLTrackerConfiguration {
    public final boolean alignFace() {
        return false;
    }

    public final int getMaxDetectionDim() {
        return 600;
    }

    public final int getMaxFaces() {
        return 1;
    }

    public final int getMaxNumScales() {
        return 8;
    }

    public final boolean isNeonSupported() {
        return false;
    }

    public final boolean jpegEncodeAlignedFace() {
        return false;
    }

    public final boolean returnFacesWithoutLandmarks() {
        return true;
    }
}
