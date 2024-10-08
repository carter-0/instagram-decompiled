package X;

import android.os.MessageQueue;

/* renamed from: X.3Pc  reason: invalid class name and case insensitive filesystem */
public final class C241413Pc implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass2l3 A00;

    public C241413Pc(AnonymousClass2l3 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r7 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (((X.1Gx) r7.A00().A02.getValue()).A00 >= 2) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean queueIdle() {
        /*
            r10 = this;
            X.2l3 r5 = r10.A00
            X.1Gs r0 = r5.A0H
            X.1H8 r7 = r0.A04
            X.1HB r6 = r7.A02
            X.1Gq r4 = r6.A01
            java.lang.String r0 = "NETWORK_STORIES_TRAY_UI_RENDER_END"
            r4.A02(r0)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r6.A00()
            X.1Gx r3 = X.1Gx.A08
            r0.A00(r3)
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            r5.A0P = r2
            com.instagram.common.session.UserSession r9 = r5.A0F
            X.0Tu r8 = X.0Tu.A05
            r0 = 36327370260625795(0x810f8d00023983, double:3.036913459174101E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x002d
            r5.A0P = r2
        L_0x002d:
            r0 = 36327370260560258(0x810f8d00013982, double:3.036913459132655E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = r7.A01()
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006d
            java.util.Iterator r8 = r1.iterator()
        L_0x0048:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r7 = r8.next()
            r0 = r7
            X.1Gt r0 = (X.1Gt) r0
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r0.A00()
            X.05G r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.1Gx r0 = (X.1Gx) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 >= r0) goto L_0x0048
            if (r7 != 0) goto L_0x007f
        L_0x0068:
            X.AnonymousClass2l3.A01(r5)
            r0 = 0
            return r0
        L_0x006d:
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r7.A00()
            X.05G r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.1Gx r0 = (X.1Gx) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 < r0) goto L_0x007f
            goto L_0x0068
        L_0x007f:
            java.lang.String r0 = "NETWORK_STORIES_TRAY_UI_RENDER_STRICT_END"
            r4.A02(r0)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r6.A00()
            r0.A00(r3)
            r5.A0P = r2
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241413Pc.queueIdle():boolean");
    }
}
