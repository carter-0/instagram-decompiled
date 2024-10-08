package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

public abstract class AEE {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, java.lang.Object] */
    public static MediaTransformation A00(C366668pT r4) {
        C370178vx r0;
        if (r4 == null || !r4.A00 || (r0 = (C370178vx) r4.A00()) == null) {
            return null;
        }
        TransformMatrixParams transformMatrixParams = r0.A00;
        float f = transformMatrixParams.A02;
        float f2 = transformMatrixParams.A03;
        float f3 = transformMatrixParams.A01;
        float f4 = transformMatrixParams.A00;
        ? obj = new Object();
        obj.A01 = f;
        obj.A02 = f2;
        obj.A03 = f3;
        obj.A00 = f4;
        return obj;
    }

    public static final boolean A02(C366688pV r2) {
        TransformMatrixConfig transformMatrixConfig = r2.A01;
        if (transformMatrixConfig != null) {
            return C366718pY.A00(transformMatrixConfig.C5o(), true);
        }
        return false;
    }

    public static final boolean A01(C364758lx r1) {
        TransformMatrixConfig transformMatrixConfig = r1.A03;
        if (transformMatrixConfig != null) {
            return C366718pY.A00(transformMatrixConfig.C5o(), true);
        }
        return false;
    }
}
