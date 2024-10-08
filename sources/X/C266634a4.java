package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.io.IOException;

/* renamed from: X.4a4  reason: invalid class name and case insensitive filesystem */
public abstract class C266634a4 {
    public static final TransformMatrixParams A00(16F r11) {
        Integer num = AnonymousClass05K.A00;
        TransformMatrixParams transformMatrixParams = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        if (0qQ.A0K(r11.A0q(), "transform_matrix_params")) {
            r11.A12();
            if (0qQ.A0K(r11.A0q(), "force_center_crop_scale")) {
                transformMatrixParams.A04 = r11.A0d();
                r11.A12();
                if (0qQ.A0K(r11.A0q(), "scale")) {
                    transformMatrixParams.A01 = r11.A0h();
                    r11.A12();
                    if (0qQ.A0K(r11.A0q(), "rotation")) {
                        transformMatrixParams.A00 = r11.A0h();
                        r11.A12();
                        if (0qQ.A0K(r11.A0q(), "translationX")) {
                            transformMatrixParams.A02 = r11.A0h();
                            r11.A12();
                            if (0qQ.A0K(r11.A0q(), "translationY")) {
                                transformMatrixParams.A03 = r11.A0h();
                                r11.A12();
                                return transformMatrixParams;
                            }
                            throw new IOException(002.A0g("Trying to parse ", r11.A0q(), " as float TransformMatrixParams.translationY"));
                        }
                        throw new IOException(002.A0g("Trying to parse ", r11.A0q(), " as float TransformMatrixParams.translationX"));
                    }
                    throw new IOException(002.A0g("Trying to parse ", r11.A0q(), " as float TransformMatrixParams.rotation"));
                }
                throw new IOException(002.A0g("Trying to parse ", r11.A0q(), " as float TransformMatrixParams.scale"));
            }
            throw new IOException(002.A0g("Trying to parse ", r11.A0q(), " as boolean TransformMatrixParams.force_center_crop_scale"));
        }
        throw new IOException(002.A0g("Trying to parse ", r11.A0q(), " as TransformMatrixParams"));
    }

    public static final void A01(TransformMatrixParams transformMatrixParams, 17Z r3) {
        r3.A0q("transform_matrix_params");
        r3.A0c();
        r3.A0S("force_center_crop_scale", transformMatrixParams.A04);
        r3.A0O("scale", transformMatrixParams.A01);
        r3.A0O("rotation", transformMatrixParams.A00);
        r3.A0O("translationX", transformMatrixParams.A02);
        r3.A0O("translationY", transformMatrixParams.A03);
        r3.A0Z();
    }
}
