package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Lj0  reason: case insensitive filesystem */
public final class C64838Lj0 implements 0lm {
    public AnonymousClass5JJ A00;
    public AnonymousClass3Q2 A01;
    public final UserSession A02;
    public final Map A03 = AnonymousClass7TE.A1H();

    public C64838Lj0(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        if (r0 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        X.1ua.A0G.A01(r21, r5.A02).A07((X.AnonymousClass0iw) null, ((X.AnonymousClass3Q2) r2).A35, false);
        r2 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r2 = X.AnonymousClass9T3.A00(r2, X.JTQ.A0Z());
        r2.A5J = true;
        r2.A0N = 17;
        r2.A0e(com.instagram.pendingmedia.model.constants.ShareType.CLIPS_UNDERLYING_SPINNABLE_VIDEO);
        r2.A1K = r4.A1K;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r21, X.AnonymousClass3Q2 r22) {
        /*
            r20 = this;
            r9 = 0
            r8 = 1
            r5 = r20
            X.3Q2 r0 = r5.A01
            r4 = r22
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = X.JTQ.A0Z()
            X.3Q2 r0 = X.AnonymousClass9T3.A00(r4, r0)
            r5.A01 = r0
        L_0x0014:
            java.util.Map r3 = r5.A03
            java.lang.String r0 = r4.A35
            java.lang.Object r2 = r3.get(r0)
            java.util.List r0 = r4.A4o
            r6 = 0
            if (r0 == 0) goto L_0x00b1
            java.util.Iterator r7 = r0.iterator()
        L_0x0025:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r1 = r7.next()
            r0 = r1
            X.5JJ r0 = (X.AnonymousClass5JJ) r0
            boolean r0 = r0.A0O
            if (r0 != r8) goto L_0x0025
        L_0x0036:
            X.5JJ r1 = (X.AnonymousClass5JJ) r1
        L_0x0038:
            X.5JJ r0 = r5.A00
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
        L_0x0042:
            if (r2 != 0) goto L_0x007d
            java.lang.String r0 = X.JTQ.A0Z()
            X.3Q2 r2 = X.AnonymousClass9T3.A00(r4, r0)
            r2.A5J = r8
            r0 = 17
            r2.A0N = r0
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS_UNDERLYING_SPINNABLE_VIDEO
            r2.A0e(r0)
            X.4aT r0 = r4.A1K
            r2.A1K = r0
        L_0x005b:
            r10 = r2
            X.3Q2 r10 = (X.AnonymousClass3Q2) r10
            java.util.List r0 = r4.A4o
            if (r0 == 0) goto L_0x00b3
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x006a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r7 = r8.next()
            r0 = r7
            X.5JJ r0 = (X.AnonymousClass5JJ) r0
            boolean r0 = r0.A0O
            X.DbV.A1U(r7, r9, r0)
            goto L_0x006a
        L_0x007d:
            if (r0 == 0) goto L_0x005b
            X.1ud r7 = X.1ua.A0G
            com.instagram.common.session.UserSession r0 = r5.A02
            r10 = r21
            X.1ua r7 = r7.A01(r10, r0)
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            java.lang.String r2 = r2.A35
            r0 = 0
            r7.A07(r0, r2, r9)
            X.3Q2 r2 = r5.A01
            if (r2 == 0) goto L_0x0185
            java.lang.String r0 = X.JTQ.A0Z()
            X.3Q2 r2 = X.AnonymousClass9T3.A00(r2, r0)
            r2.A5J = r8
            r0 = 17
            r2.A0N = r0
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS_UNDERLYING_SPINNABLE_VIDEO
            r2.A0e(r0)
            X.4aT r0 = r4.A1K
            r2.A1K = r0
            goto L_0x005b
        L_0x00ad:
            r0 = 1
            goto L_0x0042
        L_0x00af:
            r1 = r6
            goto L_0x0036
        L_0x00b1:
            r1 = r6
            goto L_0x0038
        L_0x00b3:
            r9 = r6
        L_0x00b4:
            r10.A4o = r9
            if (r1 == 0) goto L_0x0165
            java.util.List r0 = r4.A4a
            if (r0 == 0) goto L_0x0170
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r19 = r0.iterator()
        L_0x00c4:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r9 = r19.next()
            java.util.List r0 = r4.A4a
            X.3ik r11 = r1.A02
            r8 = 0
            if (r11 == 0) goto L_0x015a
            if (r0 == 0) goto L_0x015a
            java.util.Iterator r18 = r0.iterator()
        L_0x00db:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r17 = r18.next()
            r0 = r17
            X.5Eo r0 = (X.C282745Eo) r0
            java.util.Set r0 = r0.A07
            X.0qQ.A07(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x00f2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r15 = r16.next()
            r12 = r15
            X.5Eq r12 = (X.C282765Eq) r12
            float r7 = r12.A04
            float r0 = r11.A03
            float r0 = X.AnonymousClass7TE.A00(r7, r0)
            r14 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            if (r0 == 0) goto L_0x00f2
            float r7 = r12.A06
            float r0 = r11.A04
            float r0 = X.AnonymousClass7TE.A00(r7, r0)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            if (r0 == 0) goto L_0x00f2
            float r7 = r12.A08
            float r0 = r11.A08
            float r13 = r11.A06
            float r0 = r0 * r13
            float r0 = X.AnonymousClass7TE.A00(r7, r0)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            if (r0 == 0) goto L_0x00f2
            float r7 = r12.A07
            float r0 = r11.A02
            float r0 = r0 * r13
            float r0 = X.AnonymousClass7TE.A00(r7, r0)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            if (r0 == 0) goto L_0x00f2
            float r7 = r12.A09
            float r0 = r11.A05
            float r0 = X.AnonymousClass7TE.A00(r7, r0)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            if (r0 == 0) goto L_0x00f2
            if (r15 == 0) goto L_0x00db
            r8 = r17
        L_0x015a:
            boolean r0 = X.0qQ.A0K(r9, r8)
            if (r0 != 0) goto L_0x00c4
            r6.add(r9)
            goto L_0x00c4
        L_0x0165:
            X.0sn r0 = X.0sn.A00
            r4.A0k(r0)
            X.1iA r0 = X.1iA.A0a
            r4.A0V(r0)
            goto L_0x017e
        L_0x0170:
            r10.A4a = r6
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            r4.A0k(r0)
            X.1iA r0 = X.1iA.A0W
            r4.A0V(r0)
        L_0x017e:
            r5.A00 = r1
            java.lang.String r0 = r4.A35
            r3.put(r0, r2)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64838Lj0.A00(android.content.Context, X.3Q2):void");
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = null;
        this.A01 = null;
        this.A03.clear();
    }
}
