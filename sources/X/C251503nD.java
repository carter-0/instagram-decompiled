package X;

import android.os.PowerManager;

/* renamed from: X.3nD  reason: invalid class name and case insensitive filesystem */
public final class C251503nD implements C251513nE {
    public final 1v1 A00;
    public final /* synthetic */ C251443n7 A01;

    public C251503nD(1v1 r1, C251443n7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r10.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dzt(boolean r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0017
            X.3n7 r1 = r10.A01
            X.3n6 r0 = r1.A07
            if (r0 == 0) goto L_0x0017
            X.1v1 r2 = r10.A00
            int r5 = r1.A02
            java.lang.String r4 = r0.A02
            X.1uw r3 = r1.A06
            long r6 = r0.A01
            long r8 = r0.A00
            r2.A02(r3, r4, r5, r6, r8)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251503nD.Dzt(boolean):void");
    }

    public final void onExit() {
        PowerManager.WakeLock wakeLock = this.A01.A00;
        if (wakeLock != null) {
            C60270fk.A01(wakeLock);
        }
    }
}
