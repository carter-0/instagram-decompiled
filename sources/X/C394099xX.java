package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9xX  reason: invalid class name and case insensitive filesystem */
public abstract class C394099xX {
    public static C321096tZ parseFromJson(16F r6) {
        Integer num;
        0qQ.A0B(r6, 0);
        try {
            C321096tZ r1 = new C321096tZ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l, 0);
                    r1.A08 = A0l;
                } else if ("image_url".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l2, 0);
                    r1.A09 = A0l2;
                } else if (C273654mx.A00(2448).equals(A17)) {
                    r1.A07 = AnonymousClass7TG.A0l(r6);
                } else if (C273654mx.A00(3178).equals(A17)) {
                    r1.A00 = (float) r6.A0U();
                } else if (C273654mx.A00(2894).equals(A17)) {
                    r1.A02 = r6.A1D();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    r1.A05 = r6.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    r1.A01 = r6.A1D();
                } else if (C273654mx.A00(3177).equals(A17)) {
                    r1.A03 = r6.A1D();
                } else if (C273654mx.A00(3179).equals(A17)) {
                    r1.A04 = r6.A1D();
                } else if (C273654mx.A00(2903).equals(A17)) {
                    r1.A0A = r6.A0d();
                } else if (AnonymousClass000.A00(3922).equals(A17)) {
                    String A1Q = r6.A1Q();
                    if (A1Q.equals("VERTICAL")) {
                        num = AnonymousClass05K.A00;
                    } else if (A1Q.equals("HORIZONTAL")) {
                        num = AnonymousClass05K.A01;
                    } else {
                        throw AnonymousClass7TE.A0w(A1Q);
                    }
                    0qQ.A0B(num, 0);
                    r1.A06 = num;
                } else {
                    continue;
                }
                r6.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
