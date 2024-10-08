package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import java.io.IOException;

/* renamed from: X.EnV  reason: case insensitive filesystem */
public abstract class C48993EnV {
    public static C49864FAh parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C49864FAh fAh = new C49864FAh((MsysPendingRecipient) null);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    fAh.A07 = A0l;
                } else if ("eimu".equals(A17)) {
                    fAh.A01 = r5.A0y();
                } else if ("interop_user_type".equals(A17)) {
                    fAh.A00 = r5.A1D();
                } else if (Dbf.A01().equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    fAh.A09 = A0l2;
                } else if ("full_name".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l3, 0);
                    fAh.A05 = A0l3;
                } else if (AnonymousClass000.A00(3986).equals(A17)) {
                    fAh.A08 = AnonymousClass7TG.A0l(r5);
                } else if (C273654mx.A00(2400).equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l4, 0);
                    fAh.A06 = A0l4;
                } else if ("profile_pic_url".equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r5);
                    0qQ.A0B(A00, 0);
                    fAh.A02 = A00;
                } else if ("is_verified".equals(A17)) {
                    fAh.A0H = r5.A0d();
                } else if (AnonymousClass000.A00(1497).equals(A17)) {
                    fAh.A0B = r5.A0d();
                } else if (AnonymousClass000.A00(4983).equals(A17)) {
                    fAh.A0G = r5.A0d();
                } else if ("is_blocking".equals(A17)) {
                    fAh.A0A = r5.A0d();
                } else if (AnonymousClass000.A00(1525).equals(A17)) {
                    fAh.A0F = r5.A0d();
                } else if ("is_connected".equals(A17)) {
                    fAh.A0C = r5.A0d();
                } else if (AnonymousClass000.A00(185).equals(A17)) {
                    fAh.A04 = AnonymousClass7TF.A0X(r5);
                } else if (C273654mx.A00(2931).equals(A17)) {
                    fAh.A0D = r5.A0d();
                } else if (C273654mx.A00(2932).equals(A17)) {
                    fAh.A0E = r5.A0d();
                }
                r5.A0z();
            }
            return fAh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
