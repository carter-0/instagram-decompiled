package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

/* renamed from: X.9T9  reason: invalid class name */
public abstract class AnonymousClass9T9 {
    public static final C376429Hy A00(TransformMatrixConfig transformMatrixConfig, float f) {
        if (transformMatrixConfig == null) {
            return new C376429Hy(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
        }
        TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
        return new C376429Hy(2, transformMatrixParams.A01, transformMatrixParams.A00, transformMatrixParams.A02 * f, transformMatrixParams.A03 * f);
    }
}
