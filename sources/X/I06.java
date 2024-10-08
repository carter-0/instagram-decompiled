package X;

import com.instagram.common.session.UserSession;

public final class I06 {
    public final 1wn A00;
    public final 1wn A01;
    public final 1wn A02;
    public final 1wn A03;
    public final UserSession A04;
    public final C54228H3x A05;
    public final JQJ A06;
    public final AnonymousClass0eM A07;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r1.A04 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        r3 = X.C51966G9m.A03(r5);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r2 >= r3) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        r1 = (com.instagram.save.model.SavedCollection) r5.A01.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (X.0qQ.A0K(r1.A0F, r12) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r1.A0H = r10.getId();
        r1.A04 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        X.C54228H3x.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (r13 != false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.1Xj r10, X.I06 r11, java.lang.String r12, boolean r13) {
        /*
            r9 = 1
            r4 = 0
            if (r12 != 0) goto L_0x0072
            boolean r0 = r10.CbC()
            X.H3x r6 = r11.A05
            if (r0 != 0) goto L_0x00d1
            X.HAi r5 = r6.A04
            X.0qQ.A0B(r5, r4)
            int r3 = X.C51966G9m.A03(r5)
            r8 = 0
            r2 = 0
        L_0x0017:
            if (r2 >= r3) goto L_0x0065
            java.util.List r0 = r5.A01
            java.lang.Object r7 = r0.get(r2)
            com.instagram.save.model.SavedCollection r7 = (com.instagram.save.model.SavedCollection) r7
            X.HMw r1 = r7.A07
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 != r0) goto L_0x005b
            java.util.List r0 = r7.A0L
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r1 = r0.size()
            r0 = 4
            r5 = 0
            if (r1 < r0) goto L_0x0036
            r5 = 1
        L_0x0036:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r7.A0L
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0045:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005e
            X.1Xj r1 = X.C51966G9m.A0t(r3)
            boolean r0 = X.I6V.A05(r10, r1)
            if (r0 == 0) goto L_0x0057
            r2 = 1
            goto L_0x0045
        L_0x0057:
            r4.add(r1)
            goto L_0x0045
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x005e:
            r7.A0L = r4
            if (r2 == 0) goto L_0x0065
            if (r5 == 0) goto L_0x0065
            r8 = 1
        L_0x0065:
            X.C54228H3x.A00(r6)
            boolean r0 = r6.A02(r10)
            if (r8 != 0) goto L_0x0071
            if (r0 != 0) goto L_0x0071
            r9 = 0
        L_0x0071:
            return r9
        L_0x0072:
            java.util.List r0 = r10.A3i()
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x00c3
            X.H3x r6 = r11.A05
            X.HAi r5 = r6.A04
            X.0qQ.A0B(r5, r4)
            int r3 = X.C51966G9m.A03(r5)
            r2 = 0
        L_0x0088:
            if (r2 >= r3) goto L_0x009e
            java.util.List r0 = r5.A01
            java.lang.Object r1 = r0.get(r2)
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            java.lang.String r0 = r1.A0F
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x00c0
            X.1Xj r0 = r1.A04
            if (r0 != 0) goto L_0x00cf
        L_0x009e:
            int r3 = X.C51966G9m.A03(r5)
            r2 = 0
        L_0x00a3:
            if (r2 >= r3) goto L_0x00cc
            java.util.List r0 = r5.A01
            java.lang.Object r1 = r0.get(r2)
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            java.lang.String r0 = r1.A0F
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r10.getId()
            r1.A0H = r0
            r1.A04 = r10
        L_0x00bd:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x0088
        L_0x00c3:
            X.H3x r0 = r11.A05
            boolean r0 = r0.A02(r10)
            if (r0 == 0) goto L_0x00d4
            return r9
        L_0x00cc:
            X.C54228H3x.A00(r6)
        L_0x00cf:
            if (r13 == 0) goto L_0x00d4
        L_0x00d1:
            r6.A01(r10)
        L_0x00d4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I06.A00(X.1Xj, X.I06, java.lang.String, boolean):boolean");
    }

    public I06(UserSession userSession, C54228H3x h3x, JQJ jqj) {
        AnonymousClass7TG.A1Q(jqj, userSession);
        this.A05 = h3x;
        this.A06 = jqj;
        this.A04 = userSession;
        IO4 io4 = new IO4((Object) this, 14);
        this.A00 = io4;
        IO4 io42 = new IO4((Object) this, 15);
        this.A01 = io42;
        IO4 io43 = new IO4((Object) this, 16);
        this.A02 = io43;
        IO4 io44 = new IO4((Object) this, 17);
        this.A03 = io44;
        0t0 A002 = C58685Ivu.A00(this, 26);
        this.A07 = A002;
        1Ng r1 = (1Ng) A002.getValue();
        r1.A01(io44, AnonymousClass3DT.class);
        r1.A01(io42, C57074INo.class);
        r1.A01(io43, C57077INr.class);
        r1.A01(io4, C57078INs.class);
    }
}
