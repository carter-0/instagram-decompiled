package X;

import com.instagram.common.session.UserSession;

public final class NSP extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (X.182.A06(r6, r9, 2342161901218306779L) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            com.instagram.common.session.UserSession r9 = r0.A00
            java.lang.String r1 = r0.A02
            java.lang.String r5 = r0.A01
            X.0sP r4 = r0.A03
            X.2Dm r3 = X.2L2.A00(r9)
            X.3U9 r8 = X.C66580MXl.A0d(r3, r1)
            if (r8 != 0) goto L_0x0025
            java.lang.String r0 = "Thread not found: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "ArmadilloExpressReportMessagesLoader"
            X.0KC.A0D(r0, r1)
            X.0sn r5 = X.0sn.A00
        L_0x0021:
            r4.invoke(r5)
            return
        L_0x0025:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36318892000680622(0x8107d700561aae, double:3.031551773445561E-306)
            boolean r2 = X.182.A06(r6, r9, r0)
            boolean r0 = r8.CVZ(r9)
            if (r0 == 0) goto L_0x0042
            r0 = 2342161901218306779(0x208107d700921adb, double:4.06464639413767E-152)
            boolean r1 = X.182.A06(r6, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r2 != 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00eb
            r7 = 1
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            com.instagram.model.direct.DirectThreadKey r2 = r8.BJz()
            X.OrF r1 = X.C71812OrF.A00
            r0 = 0
            java.util.List r0 = r3.BSS(r1, r2, r0)
            if (r0 == 0) goto L_0x0071
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0061:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r1 = r2.next()
            X.0sn r0 = X.0sn.A00
            X.AnonymousClass7TF.A1I(r1, r0, r3)
            goto L_0x0061
        L_0x0071:
            X.0sn r3 = X.0sn.A00
        L_0x0073:
            r6.addAll(r3)
            r0 = 15
            if (r5 != 0) goto L_0x007c
            r0 = 30
        L_0x007c:
            X.NTB r1 = new X.NTB
            r1.<init>(r5, r0)
            X.C370748x0.A00()
            X.C66833MdR.A00(r9)
            X.0sn r0 = X.0sn.A00
            r6.addAll(r0)
            java.util.List r0 = X.C71114Od7.A00(r9, r1, r8)
            r6.addAll(r0)
            int r0 = r6.size()
            if (r0 <= r7) goto L_0x009e
            r0 = 8
            X.C73429PcU.A01(r0, r6)
        L_0x009e:
            X.Pny r0 = X.C74033Pny.A00
            java.util.List r0 = X.C71114Od7.A02(r5, r6, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x00ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            X.3su r0 = (X.C254703su) r0
            boolean r0 = r0.A1S()
            if (r0 == 0) goto L_0x00ac
            r3.add(r1)
            goto L_0x00ac
        L_0x00c7:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r3.iterator()
        L_0x00cf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0021
            X.0eP r2 = X.JTO.A1A(r3)
            java.lang.Object r0 = r2.A00
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.Object r0 = r2.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            X.018.A16(r0, r5)
            goto L_0x00cf
        L_0x00eb:
            r11 = 0
            r12 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0181
            java.util.List r0 = X.C71114Od7.A01(r8, r3)
            java.util.ListIterator r1 = X.C51968G9o.A18(r0)
        L_0x00f8:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = r1.previous()
            java.lang.String r0 = X.C66584MXp.A0Y(r0)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x00f8
            int r1 = r1.nextIndex()
            r0 = -1
            if (r1 == r0) goto L_0x0159
            r13 = 30
            X.NTB r0 = new X.NTB
            r0.<init>(r5, r13)
        L_0x011a:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            X.C370748x0.A00()
            X.C66833MdR.A00(r9)
            X.0sn r7 = X.0sn.A00
            r10.addAll(r7)
            java.util.List r0 = X.C71114Od7.A00(r9, r0, r8)
            r10.addAll(r0)
            int r0 = r10.size()
            if (r0 <= r12) goto L_0x013b
            r0 = 10
            X.C73429PcU.A01(r0, r10)
        L_0x013b:
            r6 = 10
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r2 = r10.iterator()
        L_0x0145:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0189
            X.0eP r0 = X.JTO.A1A(r2)
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = X.C66580MXl.A0y(r0)
            r1.add(r0)
            goto L_0x0145
        L_0x0159:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = X.C71114Od7.A01(r8, r3)
            r1.addAll(r0)
            int r0 = r1.size()
            if (r0 <= r12) goto L_0x016f
            r0 = 9
            X.C73429PcU.A01(r0, r1)
        L_0x016f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0181
            java.lang.Object r0 = r1.get(r11)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r2 = X.C66580MXl.A0y(r0)
        L_0x0181:
            r13 = 30
            X.NTB r0 = new X.NTB
            r0.<init>(r2, r13)
            goto L_0x011a
        L_0x0189:
            java.util.Set r2 = X.00k.A0k(r1)
            com.instagram.model.direct.DirectThreadKey r0 = r8.BJy()
            java.util.ArrayList r0 = r3.Aax(r0, r12)
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r0.iterator()
        L_0x019d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r1 = r15.next()
            java.lang.String r0 = X.C66580MXl.A0y(r1)
            if (r0 == 0) goto L_0x019d
            r14.add(r1)
            goto L_0x019d
        L_0x01b1:
            X.Pnt r0 = X.C74028Pnt.A00
            java.util.List r1 = X.C71114Od7.A02(r5, r14, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0220
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0220
        L_0x01c1:
            if (r5 != 0) goto L_0x01f1
            java.util.List r0 = X.00k.A0h(r10, r13)
        L_0x01c7:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x01cf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0021
            X.0eP r1 = X.JTO.A1A(r3)
            java.lang.Object r0 = r1.A00
            java.lang.Object r2 = r1.A01
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 11
            java.util.List r0 = X.C73429PcU.A00(r2, r0)
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            X.018.A16(r0, r5)
            goto L_0x01cf
        L_0x01f1:
            int r0 = r10.size()
            java.util.ListIterator r1 = r10.listIterator(r0)
        L_0x01f9:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r1.previous()
            java.lang.String r0 = X.C66584MXp.A0Y(r0)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x01f9
            int r1 = r1.nextIndex()
            r0 = -1
            if (r1 == r0) goto L_0x021b
            X.Pnz r0 = X.C74034Pnz.A00
            java.util.List r0 = X.C71114Od7.A02(r5, r10, r0)
            goto L_0x01c7
        L_0x021b:
            java.util.List r0 = X.00k.A0d(r10, r13)
            goto L_0x01c7
        L_0x0220:
            java.util.Iterator r14 = r1.iterator()
        L_0x0224:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01c1
            X.3su r1 = X.C66580MXl.A0a(r14)
            boolean r0 = r1.A1S()
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = r1.A0g()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0224
            com.instagram.model.direct.DirectThreadKey r0 = r8.BJy()
            java.util.ArrayList r0 = r3.Aax(r0, r12)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x024e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0262
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = X.C66580MXl.A0y(r1)
            if (r0 == 0) goto L_0x024e
            r3.add(r1)
            goto L_0x024e
        L_0x0262:
            X.Pnx r0 = X.C74032Pnx.A00
            java.util.List r2 = X.C71114Od7.A02(r5, r3, r0)
            int r0 = X.0Yv.A1E(r2, r6)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r6 = X.DbS.A0x(r0)
            java.util.Iterator r3 = r2.iterator()
        L_0x0278:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0295
            X.3su r0 = X.C66580MXl.A0a(r3)
            java.lang.String r1 = r0.A0g()
            if (r1 == 0) goto L_0x0290
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r7)
            r6.put(r1, r0)
            goto L_0x0278
        L_0x0290:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0295:
            java.util.LinkedHashMap r10 = X.0Yt.A03(r6)
            java.lang.Object r0 = X.00k.A0J(r2)
            X.3su r0 = (X.C254703su) r0
            if (r0 == 0) goto L_0x02c7
            long r16 = r0.C7c()
        L_0x02a5:
            X.00k.A0L(r2)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x02b0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ca
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3su r0 = (X.C254703su) r0
            boolean r0 = r0.A1S()
            if (r0 == 0) goto L_0x02b0
            r3.add(r1)
            goto L_0x02b0
        L_0x02c7:
            r16 = -9223372036854775808
            goto L_0x02a5
        L_0x02ca:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r3.iterator()
        L_0x02d2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02e6
            X.3su r0 = X.C66580MXl.A0a(r1)
            java.lang.String r0 = r0.A0g()
            if (r0 == 0) goto L_0x02d2
            r2.add(r0)
            goto L_0x02d2
        L_0x02e6:
            r6 = 0
            X.C71114Od7.A03(r9, r8, r2, r6, r10)
            r0 = 15
            if (r5 != 0) goto L_0x02f0
            r0 = 30
        L_0x02f0:
            X.NTB r13 = new X.NTB
            r13.<init>(r5, r0)
            X.C370748x0.A00()
            X.C66833MdR.A00(r9)
            r0 = 4
            java.util.List r0 = X.C73429PcU.A00(r7, r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x0304:
            boolean r0 = r15.hasNext()
            java.lang.String r14 = "Required value was null."
            if (r0 == 0) goto L_0x032f
            X.0eP r12 = X.JTO.A1A(r15)
            java.lang.Object r3 = r12.A00
            X.3su r3 = (X.C254703su) r3
            boolean r0 = r3.A2D
            if (r0 == 0) goto L_0x0304
            long r1 = r3.C7c()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0304
            java.lang.String r0 = r3.A0g()
            if (r0 == 0) goto L_0x032a
            r10.put(r0, r12)
            goto L_0x0304
        L_0x032a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x032f:
            java.util.List r1 = X.C71114Od7.A00(r9, r13, r8)
            r0 = 5
            java.util.List r0 = X.C73429PcU.A00(r1, r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x033c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0365
            X.0eP r12 = X.JTO.A1A(r13)
            java.lang.Object r3 = r12.A00
            X.3su r3 = (X.C254703su) r3
            boolean r0 = r3.A2D
            if (r0 == 0) goto L_0x033c
            long r1 = r3.C7c()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x033c
            java.lang.String r0 = r3.A0g()
            if (r0 == 0) goto L_0x0360
            r10.put(r0, r12)
            goto L_0x033c
        L_0x0360:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0365:
            r21 = 13
            X.Pmh r3 = new X.Pmh
            r19 = r10
            r20 = r5
            r17 = r9
            r18 = r8
            r15 = r3
            r16 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.0qQ.A0B(r10, r11)
            java.util.Set r0 = r10.entrySet()
            X.0jq r1 = X.00k.A0o(r0)
            X.Pnu r0 = X.C74029Pnu.A00
            X.3Sz r1 = X.C242173Sx.A0E(r0, r1)
            X.Pnv r0 = X.C74030Pnv.A00
            X.3T1 r0 = X.C242173Sx.A09(r0, r1)
            X.3T3 r2 = new X.3T3
            r2.<init>(r0)
        L_0x039b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03c4
            java.lang.Object r1 = r2.next()
            X.3su r1 = (X.C254703su) r1
            java.lang.String r0 = r1.A0g()
            if (r0 == 0) goto L_0x03bf
            r5.add(r0)
            java.lang.String r0 = r1.A0f()
            if (r0 == 0) goto L_0x03ba
            r4.add(r0)
            goto L_0x039b
        L_0x03ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x03bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x03c4:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x03ce
            r3.invoke(r7)
            return
        L_0x03ce:
            java.lang.String r0 = r8.C6C()
            if (r0 == 0) goto L_0x03e0
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A0E(r9, r0, r6, r5, r4)
            r0 = 2
            X.NMI.A00(r1, r3, r0)
            X.1ES.A02(r1)
            return
        L_0x03e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NSP.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSP(UserSession userSession, String str, String str2, 0sP r7) {
        super(1651335304, 3, false, false);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = r7;
    }
}
