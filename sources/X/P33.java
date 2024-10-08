package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.model.direct.DirectThreadKey;

public final class P33 implements C74450Pv5 {
    public DirectVisualMessageActionLogPriorityFragment A00;
    public final Context A01;
    public final UserSession A02;
    public final 2Dm A03;
    public final DirectThreadKey A04;
    public final String A05;

    public final void cleanup() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        if (r2 != null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass11X Ex0() {
        /*
            r14 = this;
            com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment r0 = r14.A00
            java.lang.String r6 = "Required value was null."
            if (r0 == 0) goto L_0x00aa
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.spinner
            if (r0 == 0) goto L_0x00a0
            X.DbS.A1T(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.2Dm r3 = r14.A03
            com.instagram.model.direct.DirectThreadKey r2 = r14.A04
            java.lang.String r0 = r14.A05
            X.3su r5 = r3.BRz(r2, r0)
            X.3U9 r4 = r3.B33(r2)
            r3 = 0
            if (r5 == 0) goto L_0x008e
            X.4ik r2 = r5.A0e
            if (r2 == 0) goto L_0x008c
            X.5Dg r0 = r2.A03
            if (r0 == 0) goto L_0x008c
            X.4k3 r0 = r0.A02
        L_0x002c:
            X.4k3 r10 = X.C272074k3.RAVEN_SCREENSHOT
            if (r0 == r10) goto L_0x007b
            if (r2 == 0) goto L_0x0071
            X.5Dg r0 = r2.A03
            if (r0 == 0) goto L_0x0071
            X.4k3 r0 = r0.A02
        L_0x0038:
            X.4k3 r10 = X.C272074k3.RAVEN_REPLAYED
            if (r0 == r10) goto L_0x007b
            if (r2 == 0) goto L_0x0073
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x0073
            X.4k3 r10 = X.C272074k3.RAVEN_OPENED
        L_0x0044:
            X.5Dg r0 = r2.A03
            if (r0 == 0) goto L_0x0090
            long r12 = r0.A01
        L_0x004a:
            if (r4 == 0) goto L_0x0093
            java.util.List r0 = r4.BRZ()
            java.util.Iterator r2 = r0.iterator()
        L_0x0054:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0093
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            java.lang.String r11 = r0.getUsername()
            com.instagram.common.typedurl.ImageUrl r9 = r0.Bh3()
            android.content.Context r8 = r14.A01
            X.OF4 r7 = new X.OF4
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add(r7)
            goto L_0x0054
        L_0x0071:
            r0 = 0
            goto L_0x0038
        L_0x0073:
            boolean r0 = r5.A1P()
            if (r0 == 0) goto L_0x007e
            X.4k3 r10 = X.C272074k3.RAVEN_CANNOT_DELIVER
        L_0x007b:
            if (r2 == 0) goto L_0x0090
            goto L_0x0044
        L_0x007e:
            if (r2 == 0) goto L_0x0089
            X.5Dg r0 = r2.A03
            if (r0 == 0) goto L_0x0089
            X.4k3 r10 = r0.A02
            if (r10 == 0) goto L_0x0089
            goto L_0x0044
        L_0x0089:
            X.4k3 r10 = X.C272074k3.RAVEN_SENDING
            goto L_0x007b
        L_0x008c:
            r0 = 0
            goto L_0x002c
        L_0x008e:
            X.4k3 r10 = X.C272074k3.RAVEN_SENDING
        L_0x0090:
            r12 = 0
            goto L_0x004a
        L_0x0093:
            com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment r0 = r14.A00
            if (r0 == 0) goto L_0x009b
            r0.A00(r1)
            return r3
        L_0x009b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x00a0:
            java.lang.String r0 = "spinner"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P33.Ex0():X.11X");
    }

    public P33(Context context, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        C51972G9s.A1C(userSession, directThreadKey);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = directThreadKey;
        this.A03 = 2L2.A00(userSession);
    }

    public final void EU7(DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A00 = directVisualMessageActionLogPriorityFragment;
    }
}
