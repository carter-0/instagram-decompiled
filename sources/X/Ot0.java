package X;

public final class Ot0 implements 27S, 1wn {
    public final int A00;
    public final Object A01;

    public Ot0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        r0 = r1.A0E(r0.getId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0098, code lost:
        r0 = r0.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
        if (r0 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        r1 = X.C300965yF.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        if (r1.A0E(r4.A00.getId()) != true) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        r0 = X.0qQ.A0K(r1, r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A72(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00a1;
                case 2: goto L_0x008a;
                case 3: goto L_0x007d;
                case 4: goto L_0x0064;
                case 5: goto L_0x0057;
                case 6: goto L_0x00f0;
                case 7: goto L_0x001c;
                case 8: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.FWR r4 = (X.FWR) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r1 = r4.A00
            java.lang.Object r0 = r3.A01
            X.Ngf r0 = (X.C69185Ngf) r0
            X.PQ2 r0 = r0.A00
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r0.A0A
            boolean r2 = r1.equals(r0)
        L_0x001b:
            return r2
        L_0x001c:
            X.5g2 r4 = (X.C290835g2) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.Mfy r0 = (X.C66965Mfy) r0
            X.N4P r1 = r0.A00
            if (r1 == 0) goto L_0x00e2
            com.instagram.user.model.User r0 = r4.A00
            goto L_0x0074
        L_0x002d:
            X.3EK r4 = (X.AnonymousClass3EK) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "direct"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r3.A01
            com.instagram.direct.visual.DirectVisualMessageViewerController r0 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r0
            com.instagram.common.session.UserSession r0 = r0.A0m
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00e2
            r2 = 1
            java.lang.String r0 = "user in visual message viewer"
            r4.A04 = r0
            r0 = 1019(0x3fb, float:1.428E-42)
            r4.A03 = r0
            return r2
        L_0x0057:
            X.27U r4 = (X.27U) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.NJm r0 = (X.NJm) r0
            X.N4P r1 = r0.A04
            goto L_0x00ad
        L_0x0064:
            X.27U r4 = (X.27U) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.NKQ r0 = (X.NKQ) r0
            X.N4P r1 = r0.A0A
            if (r1 == 0) goto L_0x00e2
            com.instagram.user.model.User r0 = r4.A00
        L_0x0074:
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.A0E(r0)
            goto L_0x00df
        L_0x007d:
            X.2Kb r4 = (X.2Kb) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.NKQ r0 = (X.NKQ) r0
            X.N4P r0 = r0.A0A
            goto L_0x0096
        L_0x008a:
            X.2Kb r4 = (X.2Kb) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.NJk r0 = (X.C68472NJk) r0
            X.N4P r0 = r0.A04
        L_0x0096:
            if (r0 == 0) goto L_0x00e2
            X.3t3 r0 = r0.A0L
            if (r0 == 0) goto L_0x00e4
            X.3sy r1 = X.C300965yF.A05(r0)
            goto L_0x00d9
        L_0x00a1:
            X.27U r4 = (X.27U) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.NJY r0 = (X.NJY) r0
            X.N4P r1 = r0.A0Z
        L_0x00ad:
            r2 = 1
            if (r1 == 0) goto L_0x00e2
            com.instagram.user.model.User r0 = r4.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.A0E(r0)
            if (r0 != r2) goto L_0x00e2
            return r2
        L_0x00bd:
            X.2Kb r4 = (X.2Kb) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.NJY r0 = (X.NJY) r0
            X.N4P r0 = r0.A0Z
            if (r0 == 0) goto L_0x00e2
            X.3t3 r0 = r0.A0L
            if (r0 == 0) goto L_0x00e4
            X.3sy r0 = X.C300965yF.A05(r0)
            if (r0 == 0) goto L_0x00e4
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A04(r0)
        L_0x00d9:
            com.instagram.model.direct.DirectThreadKey r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x00df:
            r2 = 1
            if (r0 != 0) goto L_0x001b
        L_0x00e2:
            r2 = 0
            return r2
        L_0x00e4:
            r1 = 0
            goto L_0x00d9
        L_0x00e6:
            java.lang.String r0 = "controller"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f0:
            X.2Kb r4 = (X.2Kb) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.NJU r0 = (X.NJU) r0
            X.N4P r0 = r0.A03
            if (r0 == 0) goto L_0x010d
            X.3t3 r0 = r0.A0L
            if (r0 == 0) goto L_0x010d
            X.3sy r1 = X.C300965yF.A05(r0)
        L_0x0106:
            com.instagram.model.direct.DirectThreadKey r0 = r4.A00
            boolean r2 = X.0qQ.A0K(r1, r0)
            return r2
        L_0x010d:
            r1 = 0
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ot0.A72(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0185, code lost:
        X.0qQ.A0F("clientInfra");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x018e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0140;
                case 1: goto L_0x0120;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00bc;
                case 5: goto L_0x0098;
                case 6: goto L_0x0065;
                case 7: goto L_0x002d;
                case 8: goto L_0x016c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -624943053(0xffffffffdac02033, float:-2.70392995E16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1153563529(0xffffffffbb3e0477, float:-0.002899436)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.Ngf r1 = (X.C69185Ngf) r1
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C69185Ngf.A06(r0, r1)
            r0 = 187885712(0xb32e890, float:3.4456514E-32)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -439430337(0xffffffffe5ced33f, float:-1.2208804E23)
        L_0x0029:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x002d:
            r0 = -1617968489(0xffffffff9f8fc297, float:-6.088478E-20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.5g2 r6 = (X.C290835g2) r6
            r0 = -1798267335(0xffffffff94d09e39, float:-2.106504E-26)
            int r2 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r1 = r5.A01
            X.Mfy r1 = (X.C66965Mfy) r1
            X.PvQ r0 = r1.A03
            r0.CgA()
            com.instagram.user.model.User r0 = r6.A00
            boolean r0 = r0.isRestricted()
            if (r0 == 0) goto L_0x005b
            X.2qi r1 = r1.A04
            if (r1 == 0) goto L_0x005b
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A13
            java.util.Set r0 = X.JTP.A0y(r0)
            r1.AVg(r0)
        L_0x005b:
            r0 = 1217084518(0x488b3c66, float:285155.2)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -228586767(0xfffffffff2600af1, float:-4.4376237E30)
            goto L_0x0029
        L_0x0065:
            r0 = 1185189920(0x46a49020, float:21064.062)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1311687002(0xffffffffb1d13ea6, float:-6.089823E-9)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.NJU r2 = (X.NJU) r2
            X.N4P r0 = r2.A03
            if (r0 == 0) goto L_0x008e
            int r1 = r0.A09
            boolean r0 = X.AnonymousClass48O.A01(r1)
            if (r0 != 0) goto L_0x0087
            r0 = 29
            if (r1 != r0) goto L_0x008e
        L_0x0087:
            X.Pv4 r0 = r2.A01
            if (r0 == 0) goto L_0x0185
            X.C74550Pwj.A00(r0)
        L_0x008e:
            r0 = 1608530190(0x5fe0390e, float:3.231392E19)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1288050571(0xffffffffb339e875, float:-4.3285088E-8)
            goto L_0x0029
        L_0x0098:
            r0 = -1759347428(0xffffffff97227d1c, float:-5.2502933E-25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 2140372443(0x7f937ddb, float:NaN)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.NJm r0 = (X.NJm) r0
            X.Pv4 r0 = r0.A02
            if (r0 == 0) goto L_0x0185
            X.C74550Pwj.A00(r0)
            r0 = 1807405613(0x6bbad22d, float:4.5170546E26)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 39597278(0x25c34de, float:1.617822E-37)
            goto L_0x0029
        L_0x00bc:
            r0 = 1967842435(0x754ae483, float:2.5719696E32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1927305076(0xffffffff8d1fa88c, float:-4.919854E-31)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.NKQ r0 = (X.NKQ) r0
            X.NKQ.A01(r0)
            r0 = 639146249(0x26189909, float:5.2942995E-16)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -451197403(0xffffffffe51b4625, float:-4.5828796E22)
            goto L_0x0029
        L_0x00dc:
            r0 = -1255619115(0xffffffffb528c5d5, float:-6.287276E-7)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 297384381(0x11b9b9bd, float:2.9302324E-28)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.NKQ r0 = (X.NKQ) r0
            X.NKQ.A01(r0)
            r0 = 1290009539(0x4ce3fbc3, float:1.19528984E8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 470215377(0x1c06ead1, float:4.4640374E-22)
            goto L_0x0029
        L_0x00fc:
            r0 = 1194979025(0x4739eed1, float:47598.816)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -787523832(0xffffffffd10f5708, float:-3.8477529E10)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.NJk r0 = (X.C68472NJk) r0
            X.Pv4 r0 = r0.A02
            if (r0 == 0) goto L_0x0185
            X.C74550Pwj.A00(r0)
            r0 = 41742081(0x27cef01, float:1.8582627E-37)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1954457354(0x747ea70a, float:8.0702597E31)
            goto L_0x0029
        L_0x0120:
            r0 = 1449624720(0x56678490, float:6.3639134E13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 706152996(0x2a170a24, float:1.3415012E-13)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.NJY r0 = (X.NJY) r0
            X.NJY.A07(r0)
            r0 = -483356125(0xffffffffe3309223, float:-3.2571572E21)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 375520245(0x1661fbf5, float:1.8254859E-25)
            goto L_0x0029
        L_0x0140:
            r0 = 415509412(0x18c42ba4, float:5.070888E-24)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2Kb r6 = (X.2Kb) r6
            r0 = 787335052(0x2eedc78c, float:1.0812959E-10)
            int r2 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Integer r1 = r6.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            if (r1 == r0) goto L_0x0161
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0161
            java.lang.Object r0 = r5.A01
            X.NJY r0 = (X.NJY) r0
            X.NJY.A07(r0)
        L_0x0161:
            r0 = 299491133(0x11d9df3d, float:3.4374144E-28)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1505789281(0xffffffffa63f7a9f, float:-6.643262E-16)
            goto L_0x0029
        L_0x016c:
            r0 = 230907025(0xdc35c91, float:1.2040087E-30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1855577478(0x6e99dd86, float:2.3809506E28)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 823193250(0x3110eea2, float:2.1090405E-9)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1809353108(0x6bd88994, float:5.2355534E26)
            goto L_0x0029
        L_0x0185:
            java.lang.String r0 = "clientInfra"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ot0.onEvent(java.lang.Object):void");
    }
}
