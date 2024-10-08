package X;

import android.telephony.TelephonyCallback;

/* renamed from: X.5OO  reason: invalid class name */
public final class AnonymousClass5OO extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final AnonymousClass4R9 A00;

    public AnonymousClass5OO(AnonymousClass4R9 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r3 == 5) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r5) {
        /*
            r4 = this;
            int r3 = r5.getOverrideNetworkType()
            r2 = 5
            r0 = 3
            if (r3 == r0) goto L_0x000e
            r0 = 4
            if (r3 == r0) goto L_0x000e
            r1 = 0
            if (r3 != r2) goto L_0x000f
        L_0x000e:
            r1 = 1
        L_0x000f:
            X.4R9 r0 = r4.A00
            if (r1 == 0) goto L_0x0015
            r2 = 10
        L_0x0015:
            X.AnonymousClass4R9.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5OO.onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo):void");
    }
}
