package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.IOException;

/* renamed from: X.4a0  reason: invalid class name and case insensitive filesystem */
public abstract class C266614a0 {
    public static TransformMatrixConfig parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            TransformMatrixConfig transformMatrixConfig = new TransformMatrixConfig();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("mp_input_width".equals(A0q)) {
                    transformMatrixConfig.A05 = r5.A1D();
                } else if ("mp_input_height".equals(A0q)) {
                    transformMatrixConfig.A03 = r5.A1D();
                } else if ("mp_input_orientation".equals(A0q)) {
                    transformMatrixConfig.A04 = r5.A1D();
                } else if ("is_ig_media_pipeline_orientation_normalized".equals(A0q)) {
                    transformMatrixConfig.A0C = r5.A0d();
                } else if ("output_width".equals(A0q)) {
                    transformMatrixConfig.A07 = r5.A1D();
                } else if ("output_height".equals(A0q)) {
                    transformMatrixConfig.A06 = r5.A1D();
                } else if ("is_front_facing_camera".equals(A0q)) {
                    transformMatrixConfig.A0A = r5.A0d();
                } else if ("should_mirror_if_front_facing_camera".equals(A0q)) {
                    transformMatrixConfig.A0F = r5.A0d();
                } else if ("is_used_in_iglu_filters".equals(A0q)) {
                    transformMatrixConfig.A0D = r5.A0d();
                } else if ("use_inverted_texture_coordinates".equals(A0q)) {
                    transformMatrixConfig.A0G = r5.A0d();
                } else if ("tag".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    transformMatrixConfig.A09 = str;
                } else if ("should_flip_texture".equals(A0q)) {
                    transformMatrixConfig.A0E = r5.A0d();
                } else if ("transform_matrix_params".equals(A0q)) {
                    TransformMatrixParams A00 = C266634a4.A00(r5);
                    if (!transformMatrixConfig.A0B) {
                        transformMatrixConfig.A08 = A00;
                        transformMatrixConfig.A0B = true;
                    } else {
                        throw new IllegalAccessException("Cannot reassign TransformMatrixConfig's TransformMatrixParams instance after JSON parser assignment");
                    }
                } else {
                    continue;
                }
                r5.A0z();
            }
            transformMatrixConfig.A01();
            return transformMatrixConfig;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, TransformMatrixConfig transformMatrixConfig) {
        r2.A0c();
        r2.A0P("mp_input_width", transformMatrixConfig.A05);
        r2.A0P("mp_input_height", transformMatrixConfig.A03);
        r2.A0P("mp_input_orientation", transformMatrixConfig.A04);
        r2.A0S("is_ig_media_pipeline_orientation_normalized", transformMatrixConfig.A0C);
        r2.A0P("output_width", transformMatrixConfig.A07);
        r2.A0P("output_height", transformMatrixConfig.A06);
        r2.A0S("is_front_facing_camera", transformMatrixConfig.A0A);
        r2.A0S("should_mirror_if_front_facing_camera", transformMatrixConfig.A0F);
        r2.A0S("is_used_in_iglu_filters", transformMatrixConfig.A0D);
        r2.A0S("use_inverted_texture_coordinates", transformMatrixConfig.A0G);
        String str = transformMatrixConfig.A09;
        if (str != null) {
            r2.A0R("tag", str);
        }
        r2.A0S("should_flip_texture", transformMatrixConfig.A0E);
        C266634a4.A01(transformMatrixConfig.A08, r2);
        r2.A0Z();
    }
}
