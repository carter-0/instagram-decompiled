package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.4k2  reason: invalid class name and case insensitive filesystem */
public abstract class C272064k2 {
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.5Dg] */
    public static C282485Dg parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            Long l = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            C272074k3 r4 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("timestamp".equals(A0q)) {
                    l = Long.valueOf(r9.A0y());
                } else if ("count".equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    r4 = C272074k3.valueOf(r9.A1P().toUpperCase(Locale.US));
                }
                r9.A0z();
            }
            if (l == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("timestamp", "DirectVisualMessageActionSummary");
            } else if (num == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("count", "DirectVisualMessageActionSummary");
            } else if (r4 != null || !(r9 instanceof 0c9)) {
                long longValue = l.longValue();
                int intValue = num.intValue();
                0qQ.A0B(r4, 3);
                ? obj = new Object();
                obj.A01 = longValue;
                obj.A00 = intValue;
                obj.A02 = r4;
                return obj;
            } else {
                ((0c9) r9).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "DirectVisualMessageActionSummary");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C282485Dg r4) {
        r3.A0c();
        r3.A0Q("timestamp", r4.A01);
        r3.A0P("count", r4.A00);
        C272074k3 r0 = r4.A02;
        if (r0 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r0.toString());
        }
        r3.A0Z();
    }
}
