package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.VIr  reason: case insensitive filesystem */
public abstract class C17121VIr {
    public static C17679VcA parseFromJson(16F r6) {
        C391379sn r0;
        0qQ.A0B(r6, 0);
        try {
            C17679VcA vcA = new C17679VcA();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    vcA.A03 = C41845B3m.A0a(r6, false);
                } else if (C41845B3m.A1A(A17)) {
                    vcA.A07 = AnonymousClass7TG.A0l(r6);
                } else if ("qid".equals(A17)) {
                    vcA.A01 = r6.A0y();
                } else if ("source".equals(A17)) {
                    vcA.A06 = AnonymousClass7TG.A0l(r6);
                } else if (AnonymousClass000.A00(4078).equals(A17)) {
                    vcA.A02 = C63478Kxh.parseFromJson(r6);
                } else if ("timestamp".equals(A17)) {
                    vcA.A05 = AnonymousClass7TF.A0Z(r6);
                } else if ("like_count".equals(A17)) {
                    vcA.A00 = r6.A1D();
                } else if ("is_liked_by_viewer".equals(A17)) {
                    vcA.A08 = r6.A0d();
                } else if ("answer_state".equals(A17)) {
                    String A1Q = r6.A1Q();
                    if (A1Q == null || (r0 = (C391379sn) C391379sn.A01.get(AnonymousClass7TF.A0j(A1Q))) == null) {
                        r0 = C391379sn.UNANSWERED;
                    }
                    vcA.A04 = r0;
                }
                r6.A0z();
            }
            return vcA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
