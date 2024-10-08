package X;

import android.graphics.Matrix;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9UX  reason: invalid class name */
public abstract class AnonymousClass9UX {
    public static C369458un parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            C369458un r7 = new C369458un();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    r7.A08 = r9.A1D();
                } else if ("uuid".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r7.A0C = str;
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    r7.A0A = r9.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    r7.A07 = r9.A1D();
                } else if ("layer".equals(A0q)) {
                    r7.A09 = r9.A1D();
                } else if ("z".equals(A0q)) {
                    r7.A0B = r9.A1D();
                } else if ("pivot_x".equals(A0q)) {
                    r7.A03 = (float) r9.A0U();
                } else if ("pivot_y".equals(A0q)) {
                    r7.A04 = (float) r9.A0U();
                } else if ("offset_x".equals(A0q)) {
                    r7.A01 = (float) r9.A0U();
                } else if ("offset_y".equals(A0q)) {
                    r7.A02 = (float) r9.A0U();
                } else if ("rotation".equals(A0q)) {
                    r7.A05 = (float) r9.A0U();
                } else if ("scale".equals(A0q)) {
                    r7.A06 = (float) r9.A0U();
                } else if ("bouncing_scale".equals(A0q)) {
                    r7.A00 = (float) r9.A0U();
                } else if ("is_outside_suggested_margins".equals(A0q)) {
                    r7.A0D = r9.A0d();
                }
                r9.A0z();
            }
            Matrix matrix = r7.A0E;
            float f = r7.A05;
            float f2 = r7.A03;
            float f3 = r7.A04;
            float f4 = r7.A06;
            float f5 = r7.A01;
            float f6 = r7.A02;
            0qQ.A0B(matrix, 0);
            matrix.reset();
            matrix.preRotate(f, f2, f3);
            matrix.preScale(f4, f4, f2, f3);
            matrix.preTranslate(f5, f6);
            return r7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C369458un r3) {
        r2.A0c();
        r2.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A08);
        r2.A0R("uuid", r3.A0C);
        r2.A0P(IgReactMediaPickerNativeModule.WIDTH, r3.A0A);
        r2.A0P(IgReactMediaPickerNativeModule.HEIGHT, r3.A07);
        r2.A0P("layer", r3.A09);
        r2.A0P("z", r3.A0B);
        r2.A0O("pivot_x", r3.A03);
        r2.A0O("pivot_y", r3.A04);
        r2.A0O("offset_x", r3.A01);
        r2.A0O("offset_y", r3.A02);
        r2.A0O("rotation", r3.A05);
        r2.A0O("scale", r3.A06);
        r2.A0O("bouncing_scale", r3.A00);
        r2.A0S("is_outside_suggested_margins", r3.A0D);
        r2.A0Z();
    }
}
