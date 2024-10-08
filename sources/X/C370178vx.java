package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.8vx  reason: invalid class name and case insensitive filesystem */
public final class C370178vx {
    public TransformMatrixParams A00;

    public C370178vx(TransformMatrixParams transformMatrixParams) {
        0qQ.A0B(transformMatrixParams, 1);
        Integer num = AnonymousClass05K.A00;
        this.A00 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        this.A00 = new TransformMatrixParams(transformMatrixParams);
    }

    public C370178vx() {
        Integer num = AnonymousClass05K.A00;
        this.A00 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
    }
}
