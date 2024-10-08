package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.4bY  reason: invalid class name and case insensitive filesystem */
public final class C267434bY implements AnonymousClass153 {
    public final int Bcx() {
        return 10;
    }

    public final int Bcy() {
        return 4;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mediatek");
            jSONObject.put("framework", "PowerHalMgr");
            jSONObject.put("extra", "");
            jSONObject.put("access", AnonymousClass15I.A03.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r6 = new X.AnonymousClass15I();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.14s ALZ(X.AnonymousClass155 r10, X.AnonymousClass15J r11) {
        /*
            r9 = this;
            int[] r7 = r10.Ah3(r11)
            r8 = 0
            int r1 = r7.length
            r2 = 2
            if (r1 < r2) goto L_0x0036
            X.15I r6 = new X.15I
            r6.<init>()
            int r5 = r6.A00()
            r0 = -1
            if (r5 == r0) goto L_0x0036
            r0 = 4
            r4 = 1
            r3 = 0
            if (r1 != r0) goto L_0x0037
            r0 = r7[r3]
            r6.A03(r5, r4, r4, r0)
            r1 = 3
            r0 = r7[r4]
            r6.A03(r5, r1, r4, r0)
            r0 = r7[r2]
            r6.A03(r5, r4, r3, r0)
            r0 = r7[r1]
            r6.A03(r5, r1, r3, r0)
        L_0x002f:
            int r0 = r11.A00
            X.XEC r8 = new X.XEC
            r8.<init>(r6, r7, r0, r5)
        L_0x0036:
            return r8
        L_0x0037:
            if (r1 != r2) goto L_0x0036
            r0 = r7[r3]
            r6.A03(r5, r4, r3, r0)
            r1 = 3
            r0 = r7[r4]
            r6.A03(r5, r1, r3, r0)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267434bY.ALZ(X.155, X.15J):X.14s");
    }
}
