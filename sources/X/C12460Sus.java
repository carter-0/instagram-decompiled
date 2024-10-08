package X;

import java.util.Map;

/* renamed from: X.Sus  reason: case insensitive filesystem */
public final class C12460Sus implements C13735Tg7 {
    public C10440RsH A00;
    public C11027S6f A01;
    public final AnonymousClass2Fj A02;
    public final SSY A03;
    public final AnonymousClass5A3 A04;
    public final Object A05;
    public final String A06;
    public final Map A07 = AnonymousClass7TE.A1H();
    public final QDE A08;

    public final void Cx0(C10586Rug rug) {
        0qQ.A0B(rug, 0);
        C11330SNj sNj = rug.A01;
        if (sNj != null) {
            String str = sNj.A03;
            C11027S6f s6f = this.A01;
            if (s6f != null) {
                if (!0qQ.A0K(str, s6f.A00)) {
                    throw AnonymousClass7TE.A0z("Auth Ticket type and current in progress auth factor can not be different.");
                }
            }
            0qQ.A0F("inProgressAuthFactor");
            throw AnonymousClass00P.createAndThrow();
        }
        Map map = this.A07;
        C11027S6f s6f2 = this.A01;
        if (s6f2 != null) {
            map.put(s6f2, rug);
            A00(rug);
            return;
        }
        0qQ.A0F("inProgressAuthFactor");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1.A00 == 10) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cwz(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r2 = r5 instanceof X.C13223TQo
            if (r2 == 0) goto L_0x000d
            r0 = r5
            X.TQo r0 = (X.C13223TQo) r0
            int r1 = r0.A00
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L_0x0036
        L_0x000d:
            boolean r0 = r5 instanceof X.TQY
            r3 = 0
            if (r0 != 0) goto L_0x0021
            if (r2 == 0) goto L_0x0037
            r1 = r5
            X.TQo r1 = (X.C13223TQo) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r1 = r1.A00
            r0 = 10
            if (r1 != r0) goto L_0x0037
        L_0x0021:
            X.QDE r0 = r4.A08
            r0.A01()
            X.2Fj r1 = r4.A02
            if (r5 == 0) goto L_0x0042
            X.TQY r0 = new X.TQY
            r0.<init>(r5)
            X.SUj r0 = X.SUj.A0A(r3, r0)
        L_0x0033:
            r1.A0A(r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r5 instanceof X.C8285QnR
            if (r0 == 0) goto L_0x0047
            X.2Fj r1 = r4.A02
            X.SUj r0 = X.SUj.A0A(r3, r5)
            goto L_0x0033
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0047:
            X.S6f r2 = r4.A01
            java.lang.String r0 = "inProgressAuthFactor"
            if (r2 != 0) goto L_0x0055
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0055:
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "BIO"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0064
            java.util.Map r0 = r4.A07
            r0.remove(r2)
        L_0x0064:
            r4.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12460Sus.Cwz(java.lang.Throwable):void");
    }

    public C12460Sus(AnonymousClass2Fj r2, QDE qde, SSY ssy, AnonymousClass5A3 r5, Object obj, String str) {
        AnonymousClass7TG.A1Q(r5, qde);
        0qQ.A0B(obj, 6);
        this.A03 = ssy;
        this.A04 = r5;
        this.A08 = qde;
        this.A02 = r2;
        this.A06 = str;
        this.A05 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r2 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C10586Rug r14) {
        /*
            r13 = this;
            java.util.LinkedHashSet r12 = X.DbS.A0y()
            java.util.Map r4 = r13.A07
            java.util.Iterator r3 = X.DbV.A16(r4)
        L_0x000a:
            boolean r0 = r3.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.S6f r0 = (X.C11027S6f) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "BIO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x000a
            r6 = 1
            if (r2 != 0) goto L_0x0026
        L_0x0025:
            r6 = 0
        L_0x0026:
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r4)
        L_0x002a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x004d
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r3 = r0.getKey()
            X.S6f r3 = (X.C11027S6f) r3
            java.lang.Object r2 = r0.getValue()
            X.Rug r2 = (X.C10586Rug) r2
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00b2
            if (r6 == 0) goto L_0x00b2
            goto L_0x002a
        L_0x004d:
            X.SvT r2 = new X.SvT
            r2.<init>(r5, r14, r13)
            java.lang.String r5 = r13.A06
            java.lang.Object r4 = r13.A05
            X.RsH r0 = r13.A00
            java.lang.String r3 = "inProgressAuthObject"
            r9 = 0
            if (r0 == 0) goto L_0x00ca
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_ACCOUNT_ID"
            java.lang.String r6 = r1.getString(r0)
            X.RsH r0 = r13.A00
            if (r0 == 0) goto L_0x00ca
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_OTC_SESSION_ID"
            java.lang.String r7 = r1.getString(r0)
            X.RsH r0 = r13.A00
            if (r0 == 0) goto L_0x00ca
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_OTC_TYPE"
            java.lang.String r8 = r1.getString(r0)
            X.RsH r0 = r13.A00
            if (r0 == 0) goto L_0x00ca
            android.os.Bundle r0 = r0.A01
            java.util.Map r11 = X.S9s.A01(r0)
            X.0qQ.A07(r11)
            X.SvQ r3 = X.C11095S9w.A00(r2, r12)
            X.SFo r2 = new X.SFo
            r10 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.5A3 r1 = r13.A04
            X.SOC r0 = X.AnonymousClass2E0.A04()
            X.0qQ.A07(r0)
            X.Qnb r0 = X.SQA.A03(r0, r1, r2)
            X.QCn r1 = X.SSC.A03(r0)
            X.0qQ.A07(r1)
            r0 = 31
            X.Sdu r0 = X.C11652Sdu.A00(r13, r0)
            X.SQB.A01(r9, r1, r0)
            return
        L_0x00b2:
            if (r2 != 0) goto L_0x00d2
            X.SSY r1 = r13.A03
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>(r5)
            r6.add(r3)
            X.2Fj r2 = r13.A02
            java.lang.String r5 = r13.A06
            java.lang.Object r4 = r13.A05
            X.RsH r3 = r13.A00
            if (r3 != 0) goto L_0x00db
            java.lang.String r3 = "inProgressAuthObject"
        L_0x00ca:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d2:
            X.SNj r0 = r2.A01
            if (r0 == 0) goto L_0x002a
            r12.add(r0)
            goto L_0x002a
        L_0x00db:
            r1.A06(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12460Sus.A00(X.Rug):void");
    }
}
