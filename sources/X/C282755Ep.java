package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5Ep  reason: invalid class name and case insensitive filesystem */
public abstract class C282755Ep {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5Eq, java.lang.Object] */
    public static C282765Eq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("drawable_id".equals(A0q)) {
                    obj.A0B = r4.A1D();
                } else if ("center_x".equals(A0q)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("center_y".equals(A0q)) {
                    obj.A01 = (float) r4.A0U();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    obj.A0A = (float) r4.A0U();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    obj.A02 = (float) r4.A0U();
                } else if ("normalized_center_x".equals(A0q)) {
                    obj.A03 = (float) r4.A0U();
                } else if ("normalized_center_y".equals(A0q)) {
                    obj.A05 = (float) r4.A0U();
                } else if ("normalized_center_x_precise".equals(A0q)) {
                    obj.A04 = (float) r4.A0U();
                } else if ("normalized_center_y_precise".equals(A0q)) {
                    obj.A06 = (float) r4.A0U();
                } else if ("normalized_width".equals(A0q)) {
                    obj.A08 = (float) r4.A0U();
                } else if ("normalized_height".equals(A0q)) {
                    obj.A07 = (float) r4.A0U();
                } else if ("video_position".equals(A0q)) {
                    obj.A0C = r4.A1D();
                } else if ("rotation".equals(A0q)) {
                    obj.A09 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
