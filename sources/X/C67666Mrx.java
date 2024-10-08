package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.Mrx  reason: case insensitive filesystem */
public final class C67666Mrx extends PhoneStateListener {
    public final /* synthetic */ NDz A00;

    public C67666Mrx(NDz nDz) {
        this.A00 = nDz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r2 == 2) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCallStateChanged(int r5, java.lang.String r6) {
        /*
            r4 = this;
            X.NDz r3 = r4.A00
            X.OqO r2 = r3.audioManagerQplLogger
            java.lang.String r0 = "state="
            java.lang.String r1 = X.002.A0O(r0, r5)
            java.lang.String r0 = "on_call_state_changed"
            r2.CmO(r0, r1)
            r2 = 0
            if (r5 == 0) goto L_0x0019
            r1 = 1
            if (r5 == r1) goto L_0x0025
            r0 = 2
            if (r5 == r0) goto L_0x0022
        L_0x0018:
            return
        L_0x0019:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0018
            X.NkH r0 = X.C69377NkH.BLUETOOTH
            r3.A08(r0)
        L_0x0022:
            r3.A05 = r2
            return
        L_0x0025:
            X.OYs r0 = r3.A09
            X.OZz r0 = r0.A05
            int r2 = r0.A00
            if (r2 == r1) goto L_0x0031
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            r3.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67666Mrx.onCallStateChanged(int, java.lang.String):void");
    }
}
