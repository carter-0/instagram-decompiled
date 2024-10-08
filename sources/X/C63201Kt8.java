package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.Kt8  reason: case insensitive filesystem */
public abstract class C63201Kt8 {
    public static final ValueMapFilterModel A00() {
        Integer num = AnonymousClass05K.A01;
        ValueMapFilterModel A00 = C369418uZ.A00(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), AnonymousClass000.A00(1131), (float[]) null, 46);
        A00.A00("strength", 1.0f);
        A00.A00("brightness", 0.0f);
        A00.A00("contrast", 0.0f);
        A00.A00("saturation", 0.0f);
        A00.A00("temperature", 0.0f);
        A00.A00("fade", 0.0f);
        A00.A00("vignette", 0.0f);
        A00.A00("highlights", 0.0f);
        A00.A00("shadows", 0.0f);
        A00.A00("sharpen", 0.0f);
        A00.A00("tint_shadows_intensity", 0.0f);
        A00.A03("tint_shadows_color", C63555Kz4.A01);
        A00.A00("tint_shadows_intensity", 0.0f);
        A00.A00("tint_highlights_color", 0.0f);
        A00.A03("tint_highlights_color", C63555Kz4.A00);
        A00.A00("tint_highlights_intensity", 0.0f);
        A00.A00("tint_highlights_intensity", 0.5f);
        A00.A00("tint_shadows_intensity", 0.5f);
        return A00;
    }
}
