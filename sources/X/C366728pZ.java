package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;

/* renamed from: X.8pZ  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C366728pZ {
    public static void A00(FilterModel filterModel, float[] fArr) {
        float[] contentTransform = filterModel.getContentTransform();
        if (fArr == null) {
            0Yw.A0S(C366498p3.A01, contentTransform, 16);
        } else {
            0Yw.A0S(fArr, contentTransform, fArr.length);
        }
    }

    public static void A01(FilterModel filterModel, float[] fArr) {
        float[] textureTransform = filterModel.getTextureTransform();
        if (fArr == null) {
            0Yw.A0S(C366498p3.A01, textureTransform, 16);
        } else {
            0Yw.A0S(fArr, textureTransform, fArr.length);
        }
    }
}
