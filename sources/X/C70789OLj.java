package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OLj  reason: case insensitive filesystem */
public final class C70789OLj {
    public final UserSession A00;
    public final Activity A01;
    public final 1UV A02 = new AWR(this, 10);
    public final AnonymousClass2Ep A03;
    public final 2Dm A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.OW6 A00(com.instagram.model.direct.DirectThreadKey r15, java.lang.String r16, java.lang.String r17) {
        /*
            r14 = this;
            r13 = 0
            X.0qQ.A0B(r15, r13)
            r2 = 1
            r7 = 0
            r6 = r16
            if (r16 != 0) goto L_0x0048
            r4 = r17
            if (r17 == 0) goto L_0x0020
            X.2Dm r1 = r14.A04
            X.2FW r0 = X.2FW.A0q
            X.3su r4 = r1.BRx(r15, r0, r4)
        L_0x0016:
            if (r4 != 0) goto L_0x004f
            java.lang.String r1 = "DirectVisualMessageViewerViewModelFactory"
            java.lang.String r0 = "Message not available"
            X.0wb.A03(r1, r0)
        L_0x001f:
            return r7
        L_0x0020:
            boolean r0 = r14.A06
            X.2Dm r1 = r14.A04
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r14.A05
            java.util.List r1 = r1.CFn(r15, r0)
            if (r1 == 0) goto L_0x001f
            int r0 = r1.size()
            r12 = 100
            if (r12 <= r0) goto L_0x0037
            r12 = r0
        L_0x0037:
            X.OW6 r7 = new X.OW6
            android.app.Activity r8 = r14.A01
            com.instagram.common.session.UserSession r9 = r14.A00
            X.2Ep r10 = r14.A03
            java.util.List r11 = r1.subList(r13, r12)
            r13 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0048:
            X.2Dm r1 = r14.A04
            X.3su r4 = r1.BRz(r15, r6)
            goto L_0x0016
        L_0x004f:
            com.instagram.common.session.UserSession r9 = r14.A00
            boolean r0 = r4.A1e(r9)
            if (r0 != 0) goto L_0x007c
            boolean r0 = r4.A1W()
            if (r0 != 0) goto L_0x007c
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Trying to play a visual message that does not have valid urls. Seen count = "
            r1.append(r0)
            X.4ik r0 = r4.A0e
            if (r0 == 0) goto L_0x007a
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0070:
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.String r0 = "play_visual_message_without_valid_urls"
            X.0wb.A04(r0, r1, r2)
            return r7
        L_0x007a:
            r0 = r7
            goto L_0x0070
        L_0x007c:
            com.instagram.user.model.User r0 = X.DbT.A0j(r9)
            boolean r0 = r4.A1l(r0)
            if (r0 == 0) goto L_0x00b3
            X.1UV r0 = r14.A02
            java.util.List r0 = r1.BSS(r0, r15, r6)
            if (r0 == 0) goto L_0x00ac
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            r1.add(r13, r4)
        L_0x0095:
            int r0 = r1.size()
            r12 = 100
            if (r12 <= r0) goto L_0x009e
            r12 = r0
        L_0x009e:
            android.app.Activity r8 = r14.A01
            X.2Ep r10 = r14.A03
            java.util.List r11 = r1.subList(r13, r12)
            X.OW6 r7 = new X.OW6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x00ac:
            java.lang.String r1 = "fetch_message_from_thread_range_failed"
            java.lang.String r0 = "Null list received from thread range"
            X.0wb.A03(r1, r0)
        L_0x00b3:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r4)
            goto L_0x0095
        L_0x00b8:
            java.util.List r2 = r1.CBt(r15, r7)
            if (r2 == 0) goto L_0x00e9
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00e9
            X.2Ep r10 = r14.A03
            int r1 = r10.CBu()
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x00d1
            r1 = r0
        L_0x00d1:
            r12 = 100
            if (r12 <= r1) goto L_0x00d6
            r12 = r1
        L_0x00d6:
            X.OW6 r7 = new X.OW6
            android.app.Activity r8 = r14.A01
            com.instagram.common.session.UserSession r9 = r14.A00
            int r0 = java.lang.Math.min(r0, r12)
            java.util.List r11 = r2.subList(r13, r0)
            r13 = 1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x00e9:
            java.lang.String r1 = "DirectVisualMessageViewerViewModelFactory"
            java.lang.String r0 = "getUnseenVisualMessages is empty"
            X.0wb.A03(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70789OLj.A00(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String):X.OW6");
    }

    public C70789OLj(Activity activity, UserSession userSession, AnonymousClass2Ep r5, 2Dm r6, String str, boolean z) {
        AnonymousClass7TG.A1P(userSession, r6);
        this.A00 = userSession;
        this.A01 = activity;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = z;
        this.A05 = str;
    }
}
