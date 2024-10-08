package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Xxq  reason: case insensitive filesystem */
public final class C22235Xxq implements AnonymousClass153 {
    public static boolean A00;

    private int A00(AnonymousClass15E r8, int[] iArr, int i) {
        if (i != 3) {
            try {
                int length = iArr.length;
                if (length == 4) {
                    if (A00) {
                        return r8.A01(iArr[0], iArr[1], iArr[2], iArr[3]);
                    }
                } else if (length == 2) {
                    return r8.A00(iArr[0], iArr[1]);
                }
            } catch (UnsatisfiedLinkError unused) {
                return A00(r8, iArr, i + 1);
            }
        }
        return -1;
    }

    public final int Bcx() {
        return 5;
    }

    public final int Bcy() {
        return 4;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AnonymousClass000.A00(3585));
            jSONObject.put("framework", "PerfService");
            jSONObject.put("extra", A00 ? "BL" : "");
            jSONObject.put("access", AnonymousClass15E.A03.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = new X.AnonymousClass15E();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.14s ALZ(X.AnonymousClass155 r6, X.AnonymousClass15J r7) {
        /*
            r5 = this;
            int[] r4 = r6.Ah3(r7)
            r3 = 0
            int r1 = r4.length
            r0 = 2
            if (r1 < r0) goto L_0x001c
            X.15E r2 = new X.15E
            r2.<init>()
            r0 = 0
            int r1 = r5.A00(r2, r4, r0)
            if (r1 < 0) goto L_0x001c
            int r0 = r7.A00
            X.XMW r3 = new X.XMW
            r3.<init>(r2, r4, r0, r1)
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22235Xxq.ALZ(X.155, X.15J):X.14s");
    }
}
