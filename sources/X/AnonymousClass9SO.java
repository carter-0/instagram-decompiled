package X;

import android.graphics.Rect;
import com.instagram.creation.base.CropInfo;
import java.io.IOException;

/* renamed from: X.9SO  reason: invalid class name */
public abstract class AnonymousClass9SO {
    public static CropInfo parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            Integer num = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num2 = null;
            Rect rect = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("original_image_width".equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                } else if ("original_image_height".equals(A0q)) {
                    num2 = Integer.valueOf(r9.A1D());
                } else if ("crop_rect".equals(A0q)) {
                    rect = Rect.unflattenFromString(r9.A1Q());
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_image_width", r9, "CropInfo");
            } else if (num2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_image_height", r9, "CropInfo");
            } else if (rect != null || !(r9 instanceof 0c9)) {
                return new CropInfo(rect, num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("crop_rect", r9, "CropInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, CropInfo cropInfo) {
        r2.A0c();
        r2.A0P("original_image_width", cropInfo.A01);
        r2.A0P("original_image_height", cropInfo.A00);
        Rect rect = cropInfo.A02;
        if (rect != null) {
            r2.A0R("crop_rect", rect.flattenToString());
        }
        r2.A0Z();
    }
}
