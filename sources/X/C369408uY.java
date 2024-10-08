package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.8uY  reason: invalid class name and case insensitive filesystem */
public abstract class C369408uY {
    public static final ValueMapFilterModel A00(String str) {
        0qQ.A0B(str, 0);
        float[] fArr = new float[16];
        0Yw.A0S(C366498p3.A00, fArr, 16);
        Integer num = AnonymousClass05K.A0C;
        ValueMapFilterModel A00 = C369418uZ.A00(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "image_overlay", fArr, 44);
        A00.A02("sticker_only", true);
        A00.A01.A05.put("overlay", str);
        return A00;
    }

    public static final ValueMapFilterModel A02(float[] fArr, float[] fArr2, float f, float f2, float f3, boolean z) {
        0qQ.A0B(fArr, 0);
        0qQ.A0B(fArr2, 1);
        ValueMapFilterModel A00 = C369418uZ.A00(new TransformMatrixParams(AnonymousClass05K.A0N, AnonymousClass05K.A00, 1.0f, 0.0f, 0.0f, 0.0f, false), "gradient_transform", (float[]) null, 46);
        A00.A03("u_topColor", fArr);
        A00.A03("u_bottomColor", fArr2);
        A00.A02("u_isGainmapEnabled", false);
        A00.A02("u_isInputSamplingDisabled", z);
        A00.A00("u_inputWidth", f);
        A00.A00("u_inputHeight", f2);
        A00.A00("u_cornerRadius", f3);
        return A00;
    }

    public static final ValueMapFilterModel A01(boolean z) {
        Integer num = AnonymousClass05K.A01;
        ValueMapFilterModel A00 = C369418uZ.A00(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), AnonymousClass000.A00(1342), (float[]) null, 46);
        A00.A02("is_linearspace", z);
        return A00;
    }
}
