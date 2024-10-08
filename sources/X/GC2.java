package X;

import com.instagram.common.session.UserSession;

public final class GC2 implements C250603lj {
    public final UserSession A00;
    public final GC1 A01;

    public GC2(UserSession userSession, GC1 gc1) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = gc1;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (((X.C52079GDz) r2).A03 != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r24, X.C252093oY r25) {
        /*
            r23 = this;
            r7 = 0
            r1 = r24
            r0 = r25
            boolean r6 = X.AnonymousClass7TF.A1U(r7, r1, r0)
            float r3 = r0.CFe(r1)
            java.lang.Integer r16 = r0.CEk(r1)
            X.0qQ.A07(r16)
            java.lang.Object r1 = r1.A03
            X.4bN r1 = (X.C267324bN) r1
            X.GmE r10 = r1.A02()
            if (r10 == 0) goto L_0x00bd
            java.lang.String r2 = r10.A0B
        L_0x0020:
            java.lang.String r0 = "ad4ad_in_reels"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x018c
            r0 = r23
            X.GC1 r5 = r0.A01
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0174
            double r2 = (double) r3
            r8 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0174
            X.GBn r2 = r5.A02
            r0 = 0
            r2.A0O(r0)
            r5.A00 = r6
            X.GBj r9 = r5.A03
            int r8 = r9.A07()
            android.view.View r4 = r9.A0A(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2 = 0
            if (r4 == 0) goto L_0x00bb
            java.lang.Object r0 = r4.getTag()
        L_0x0057:
            boolean r0 = r0 instanceof X.C52079GDz
            if (r0 == 0) goto L_0x00b0
            if (r4 == 0) goto L_0x0061
            java.lang.Object r2 = r4.getTag()
        L_0x0061:
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.ui.common.ClipsMultipleMediaViewHolder"
            X.0qQ.A0C(r2, r0)
            X.GDz r2 = (X.C52079GDz) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00b0
        L_0x006c:
            int r21 = r3.intValue()
            if (r4 == 0) goto L_0x00ae
            java.lang.Object r3 = r4.getTag()
        L_0x0076:
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.ui.common.ClipsMultipleMediaViewHolder"
            X.0qQ.A0C(r3, r0)
            X.GDz r3 = (X.C52079GDz) r3
            X.GC0 r9 = r5.A01
            java.lang.String r8 = "message"
            java.lang.String r4 = "ClipsMultipleVideoPlayerController"
            r2 = 817902720(0x30c03480, float:1.398476E-9)
            if (r3 == 0) goto L_0x014c
            X.5o2 r1 = r1.A01
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r1 != r0) goto L_0x014c
            if (r10 == 0) goto L_0x0155
            java.util.List r0 = r10.A0F
            if (r0 == 0) goto L_0x0155
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x009c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r1.next()
            X.4sL r0 = (X.C276014sL) r0
            X.1Xj r0 = r0.A00
            r11.add(r0)
            goto L_0x009c
        L_0x00ae:
            r3 = 0
            goto L_0x0076
        L_0x00b0:
            int r0 = r8 + 1
            android.view.View r4 = r9.A0A(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x006c
        L_0x00bb:
            r0 = r2
            goto L_0x0057
        L_0x00bd:
            r2 = 0
            goto L_0x0020
        L_0x00c0:
            java.util.List r3 = r3.A0C
            int r1 = r3.size()
            int r0 = r11.size()
            if (r1 > r0) goto L_0x0155
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            int r0 = r11.size()
            r4 = 3
            if (r0 <= r6) goto L_0x00f2
            java.lang.Object r2 = r11.get(r6)
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r11.get(r7)
            X.1Xj r1 = (X.1Xj) r1
            r0 = 2
            java.lang.Object r0 = r11.get(r0)
            X.1Xj r0 = (X.1Xj) r0
            X.1Xj[] r0 = new X.1Xj[]{r2, r1, r0}
            java.util.List r11 = X.0sr.A1P(r0)
        L_0x00f2:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r15 = r3.iterator()
            r1 = 0
        L_0x00fb:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0164
            java.lang.Object r12 = r15.next()
            int r14 = r1 + 1
            if (r1 >= 0) goto L_0x0111
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0111:
            X.JQi r12 = (X.C59614JQi) r12
            java.lang.Object r3 = r11.get(r1)
            java.lang.Object r2 = r11.get(r1)
            X.1Xj r2 = (X.1Xj) r2
            r22 = 0
            if (r1 != 0) goto L_0x0123
            r22 = 1
        L_0x0123:
            com.instagram.common.session.UserSession r13 = r9.A02
            X.0iw r0 = r9.A01
            r1 = 2
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.0qQ.A0C(r0, r1)
            X.4DU r0 = (X.AnonymousClass4DU) r0
            X.Uty r1 = new X.Uty
            r1.<init>(r13, r0)
            X.HGt r0 = new X.HGt
            r18 = r2
            r19 = r1
            r20 = r12
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.Object r0 = r8.put(r3, r0)
            r10.add(r0)
            r1 = r14
            goto L_0x00fb
        L_0x014c:
            X.0wj r0 = X.0wj.A01
            X.0f9 r1 = r0.AEf(r4, r2)
            java.lang.String r0 = "failed to resume multiple players"
            goto L_0x015d
        L_0x0155:
            X.0wj r0 = X.0wj.A01
            X.0f9 r1 = r0.AEf(r4, r2)
            java.lang.String r0 = "insufficient medias to bind to players"
        L_0x015d:
            r1.ABQ(r8, r0)
            r1.report()
            goto L_0x0174
        L_0x0164:
            r9.A00 = r6
            com.instagram.common.session.UserSession r0 = r9.A02
            X.1wS r0 = X.1wS.A01(r0)
            r0.A0C(r4)
            X.GBu r0 = r9.playerManager
            r0.A01(r8)
        L_0x0174:
            int r0 = r16.intValue()
            if (r0 == r7) goto L_0x018c
            if (r0 == r6) goto L_0x018d
            r5.A00 = r7
            X.GC0 r1 = r5.A01
            r1.A00 = r7
            X.GBu r0 = r1.playerManager
            r0.A00()
            com.instagram.common.session.UserSession r0 = r1.A02
            X.C51971G9r.A1K(r0)
        L_0x018c:
            return
        L_0x018d:
            X.GBn r1 = r5.A02
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x018c
            r0 = 0
            r1.A0O(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GC2.ATF(X.30Y, X.3oY):void");
    }
}
