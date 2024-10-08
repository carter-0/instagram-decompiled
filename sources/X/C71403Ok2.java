package X;

import android.view.View;

/* renamed from: X.Ok2  reason: case insensitive filesystem */
public final class C71403Ok2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C71403Ok2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C67754Mu9 A00(C71403Ok2 ok2) {
        return (C67754Mu9) ((C69180NgT) ok2.A01).A04.getValue();
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C71403Ok2(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r2v68, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v71, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v74, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0961, code lost:
        X.0qQ.A0F(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0b40, code lost:
        r4 = "bugReport";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0b43, code lost:
        r4 = "userFlowLoggerV2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0b60, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0b67, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0baa, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0bad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x046b, code lost:
        r13 = "bottomSheet";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A00
            r2 = r22
            switch(r0) {
                case 0: goto L_0x0b8d;
                case 1: goto L_0x0b24;
                case 2: goto L_0x0b00;
                case 3: goto L_0x0aed;
                case 4: goto L_0x0ace;
                case 5: goto L_0x09b0;
                case 6: goto L_0x0b4d;
                case 7: goto L_0x0992;
                case 8: goto L_0x097f;
                case 9: goto L_0x096e;
                case 10: goto L_0x07d2;
                case 11: goto L_0x07c1;
                case 12: goto L_0x077b;
                case 13: goto L_0x033b;
                case 14: goto L_0x0768;
                case 15: goto L_0x0a82;
                case 16: goto L_0x0754;
                case 17: goto L_0x072b;
                case 18: goto L_0x0700;
                case 19: goto L_0x06ef;
                case 20: goto L_0x06de;
                case 21: goto L_0x06b9;
                case 22: goto L_0x0687;
                case 23: goto L_0x0655;
                case 24: goto L_0x0625;
                case 25: goto L_0x0950;
                case 26: goto L_0x0612;
                case 27: goto L_0x05fa;
                case 28: goto L_0x05e7;
                case 29: goto L_0x05cf;
                case 30: goto L_0x05b7;
                case 31: goto L_0x0a2e;
                case 32: goto L_0x09ef;
                case 33: goto L_0x05a0;
                case 34: goto L_0x0589;
                case 35: goto L_0x0546;
                case 36: goto L_0x04f3;
                case 37: goto L_0x04df;
                case 38: goto L_0x04cb;
                case 39: goto L_0x0495;
                case 40: goto L_0x0482;
                case 41: goto L_0x046f;
                case 42: goto L_0x0454;
                case 43: goto L_0x0436;
                case 44: goto L_0x0418;
                case 45: goto L_0x03fa;
                case 46: goto L_0x03e3;
                case 47: goto L_0x0378;
                case 48: goto L_0x0328;
                case 49: goto L_0x02f8;
                case 50: goto L_0x02cb;
                case 51: goto L_0x029e;
                case 52: goto L_0x0280;
                case 53: goto L_0x0262;
                case 54: goto L_0x0244;
                case 55: goto L_0x0217;
                case 56: goto L_0x01ea;
                case 57: goto L_0x01d0;
                case 58: goto L_0x01b3;
                case 59: goto L_0x0195;
                case 60: goto L_0x0177;
                case 61: goto L_0x0158;
                case 62: goto L_0x0139;
                case 63: goto L_0x011a;
                case 64: goto L_0x00e0;
                case 65: goto L_0x00c3;
                case 66: goto L_0x0093;
                case 67: goto L_0x0075;
                case 68: goto L_0x0058;
                case 69: goto L_0x003b;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -829812923(0xffffffffce8a0f45, float:-1.15812826E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.05G r1 = r4.A0D
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "BUNDLE_SURFACE"
            r3.putString(r1, r2)
            X.6Yo r2 = r4.A01
            X.NIL r1 = new X.NIL
            r1.<init>()
            r2.A0B(r3, r1)
            r2.A04()
            r1 = 2076620789(0x7bc6b7f5, float:2.0636117E36)
        L_0x0037:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x003b:
            r0 = -767594783(0xffffffffd23f6ee1, float:-2.05549748E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r1 = A00(r1)
            com.instagram.common.session.UserSession r3 = r1.A05
            X.61K r2 = X.AnonymousClass61K.ARMADILLO_EXPRESS_OUTBOX
            r1 = 1
            X.6AO r1 = X.AnonymousClass6AN.A02(r3, r2, r1)
            X.6AQ r1 = r1.A00
            r1.A00()
            r1 = 944404003(0x384a7623, float:4.8270576E-5)
            goto L_0x0037
        L_0x0058:
            r0 = 231696764(0xdcf697c, float:1.2782754E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            X.1aU r2 = r4.A03
            r1 = 4
            X.1aU r3 = X.C72120Owf.A00(r2, r4, r1)
            X.1a8 r2 = r4.A04
            X.PSo r1 = X.C73005PSo.A00
            r2.A02(r3, r1)
            r1 = -2040717371(0xffffffff865d1fc5, float:-4.158882E-35)
            goto L_0x0037
        L_0x0075:
            r0 = 1442409290(0x55f96b4a, float:3.42798998E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            X.1aU r2 = r4.A03
            r1 = 8
            X.1aU r3 = X.C72120Owf.A00(r2, r4, r1)
            X.1a8 r2 = r4.A04
            X.PSs r1 = X.C73009PSs.A00
            r2.A02(r3, r1)
            r1 = 1208168725(0x48033115, float:134340.33)
            goto L_0x0037
        L_0x0093:
            r0 = 747482498(0x2c8dad82, float:4.0267243E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.Mu9 r2 = X.C66583MXo.A0S(r1)
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r2.A05
            X.OW5 r3 = X.C69900Nu2.A00(r1)
            java.lang.Integer r7 = X.AnonymousClass05K.A0Y
            X.05G r1 = r2.A0D
            java.lang.Object r6 = r1.getValue()
            X.NiX r6 = (X.C69271NiX) r6
            r8 = 0
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            r3.A02(r4, r5, r6, r7, r8)
            r1 = 88284968(0x5431f28, float:9.1745784E-36)
            goto L_0x0037
        L_0x00c3:
            r0 = -1429163747(0xffffffffaad0b11d, float:-3.707112E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r1 = A00(r1)
            X.6Yo r2 = r1.A01
            X.Nga r1 = new X.Nga
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = -1931151313(0xffffffff8ce4f82f, float:-3.5278332E-31)
            goto L_0x0037
        L_0x00e0:
            r0 = -37052687(0xfffffffffdca9ef1, float:-3.3666166E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.NgT r3 = (X.C69180NgT) r3
            X.0eM r1 = r3.A04
            java.lang.Object r2 = r1.getValue()
            r1 = 2131962485(0x7f132a75, float:1.9561696E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r1 = 2131976948(0x7f1362f4, float:1.959103E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r1 = 16
            X.Plf r11 = new X.Plf
            r11.<init>(r2, r1)
            r7 = 0
            r12 = 2131962484(0x7f132a74, float:1.9561694E38)
            r13 = 2131968381(0x7f13417d, float:1.9573655E38)
            X.8ae r4 = X.C358278ae.BLUE_BOLD
            r8 = r7
            r9 = r7
            r10 = r7
            X.C71145Oe2.A06(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -25135654(0xfffffffffe8075da, float:-8.537655E37)
            goto L_0x0037
        L_0x011a:
            r0 = -148359496(0xfffffffff72836b8, float:-3.41178E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.0eM r1 = r1.A04
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 24
            X.C66583MXo.A1O(r3, r2, r1)
            r1 = 1421181793(0x54b58361, float:6.236746E12)
            goto L_0x0037
        L_0x0139:
            r0 = 1559106169(0x5cee1279, float:5.36090843E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.0eM r1 = r1.A04
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 26
            X.C66583MXo.A1O(r3, r2, r1)
            r1 = 584902876(0x22dce8dc, float:5.987767E-18)
            goto L_0x0037
        L_0x0158:
            r0 = 1929759526(0x7305cb26, float:1.0600217E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.0eM r1 = r1.A04
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 25
            X.C66583MXo.A1O(r3, r2, r1)
            r1 = -28629027(0xfffffffffe4b27dd, float:-6.7510066E37)
            goto L_0x0037
        L_0x0177:
            r0 = 1047272981(0x3e6c1e15, float:0.2305835)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r3 = A00(r1)
            java.lang.String r1 = "save started"
            X.C67754Mu9.A01(r3, r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 27
            X.C66583MXo.A1O(r3, r2, r1)
            r1 = -1935463494(0xffffffff8ca32bba, float:-2.5140443E-31)
            goto L_0x0037
        L_0x0195:
            r0 = 195437489(0xba623b1, float:6.3994577E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r3 = A00(r1)
            java.lang.String r1 = "create backup started"
            X.C67754Mu9.A01(r3, r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 23
            X.C66583MXo.A1O(r3, r2, r1)
            r1 = -1013507534(0xffffffffc3971a32, float:-302.20465)
            goto L_0x0037
        L_0x01b3:
            r0 = -1769430926(0xffffffff9688a072, float:-2.207324E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r1 = A00(r1)
            X.6Yo r2 = r1.A01
            X.NIK r1 = new X.NIK
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = -1537747717(0xffffffffa457d4fb, float:-4.6801095E-17)
            goto L_0x0037
        L_0x01d0:
            r0 = -1676559537(0xffffffff9c11bb4f, float:-4.8218566E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.0eM r1 = r1.A03
            X.1Av r2 = X.DbX.A0h(r1)
            r1 = 0
            r2.A0V(r1)
            r1 = -1248737809(0xffffffffb591c5ef, float:-1.0860948E-6)
            goto L_0x0037
        L_0x01ea:
            r0 = -1222734139(0xffffffffb71e8ec5, float:-9.450775E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.Mu9 r6 = X.C66583MXo.A0S(r1)
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r6.A05
            X.OW5 r4 = X.C69900Nu2.A00(r1)
            X.Njy r3 = X.C69358Njy.RESTORE_WITH_PIN
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.05G r1 = r6.A0D
            java.lang.Object r1 = r1.getValue()
            X.NiX r1 = (X.C69271NiX) r1
            X.OW5.A00(r5, r3, r1, r4, r2)
            r1 = 321562115(0x132aa603, float:2.1538867E-27)
            goto L_0x0037
        L_0x0217:
            r0 = -235627802(0xfffffffff1f49ae6, float:-2.4224513E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgT r1 = (X.C69180NgT) r1
            X.Mu9 r6 = X.C66583MXo.A0S(r1)
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r6.A05
            X.OW5 r4 = X.C69900Nu2.A00(r1)
            X.Njy r3 = X.C69358Njy.CREATE_PIN
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.05G r1 = r6.A0D
            java.lang.Object r1 = r1.getValue()
            X.NiX r1 = (X.C69271NiX) r1
            X.OW5.A00(r5, r3, r1, r4, r2)
            r1 = -149873554(0xfffffffff7111c6e, float:-2.9432018E33)
            goto L_0x0037
        L_0x0244:
            r0 = -44360694(0xfffffffffd5b1c0a, float:-1.8202907E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            X.1aU r2 = r4.A02
            r1 = 5
            X.1aU r3 = X.C72120Owf.A00(r2, r4, r1)
            X.1a8 r2 = r4.A04
            X.PSp r1 = X.C73006PSp.A00
            r2.A02(r3, r1)
            r1 = -1179570040(0xffffffffb9b13088, float:-3.379623E-4)
            goto L_0x0037
        L_0x0262:
            r0 = 143834507(0x892bd8b, float:8.831617E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            X.1aU r2 = r4.A02
            r1 = 2
            X.1aU r3 = X.C72120Owf.A00(r2, r4, r1)
            X.1a8 r2 = r4.A04
            X.PSm r1 = X.C73003PSm.A00
            r2.A02(r3, r1)
            r1 = 671110468(0x28005544, float:7.123916E-15)
            goto L_0x0037
        L_0x0280:
            r0 = -934460946(0xffffffffc84d41ee, float:-210183.72)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            X.1aU r2 = r4.A02
            r1 = 7
            X.1aU r3 = X.C72120Owf.A00(r2, r4, r1)
            X.1a8 r2 = r4.A04
            X.PSr r1 = X.C73008PSr.A00
            r2.A02(r3, r1)
            r1 = -1595299407(0xffffffffa0e9a9b1, float:-3.9584028E-19)
            goto L_0x0037
        L_0x029e:
            r0 = -653597002(0xffffffffd90ae6b6, float:-2.44357601E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 2131962502(0x7f132a86, float:1.956173E38)
            X.GKO r2 = X.DbS.A0Q(r2, r1)
            X.05G r1 = r4.A0B
            r1.Epw(r2)
            X.1aU r2 = r4.A02
            r1 = 3
            X.1aU r3 = X.C72120Owf.A00(r2, r4, r1)
            X.1a8 r2 = r4.A04
            X.PSn r1 = X.C73004PSn.A00
            r2.A02(r3, r1)
            r1 = 2045065240(0x79e53818, float:1.4877171E35)
            goto L_0x0037
        L_0x02cb:
            r0 = -1291383605(0xffffffffb3070ccb, float:-3.1443772E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Mu9 r4 = A00(r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 2131962503(0x7f132a87, float:1.9561733E38)
            X.GKO r2 = X.DbS.A0Q(r2, r1)
            X.05G r1 = r4.A0B
            r1.Epw(r2)
            X.1aU r2 = r4.A02
            r1 = 6
            X.1aU r3 = X.C72120Owf.A00(r2, r4, r1)
            X.1a8 r2 = r4.A04
            X.PSq r1 = X.C73007PSq.A00
            r2.A02(r3, r1)
            r1 = 1688687492(0x64a75384, float:2.4692994E22)
            goto L_0x0037
        L_0x02f8:
            r0 = 828186751(0x315d207f, float:3.2178205E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.ONj r2 = (X.C70837ONj) r2
            java.lang.Integer r1 = r2.A00
            if (r1 == 0) goto L_0x0316
            int r5 = r1.intValue()
            if (r5 <= 0) goto L_0x031b
            com.instagram.common.session.UserSession r4 = r2.A02
            java.lang.String r3 = r2.A08
            r2 = 0
            r1 = 1
            X.C66671Mae.A0H(r4, r2, r3, r1, r5)
        L_0x0316:
            r1 = 1814750064(0x6c2ae370, float:8.263657E26)
            goto L_0x0037
        L_0x031b:
            com.instagram.common.session.UserSession r1 = r2.A02
            r4 = 1
            java.lang.String r3 = r2.A08
            X.3Tu r2 = r2.A06
            r5 = 0
            r6 = r5
            X.C66671Mae.A08(r1, r2, r3, r4, r5, r6)
            goto L_0x0316
        L_0x0328:
            r0 = 487049324(0x1d07c86c, float:1.7970717E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.B2v r1 = (X.C41840B2v) r1
            r1.D7K()
            r1 = -927382611(0xffffffffc8b943ad, float:-379421.4)
            goto L_0x0037
        L_0x033b:
            r0 = -1447222090(0xffffffffa9bd24b6, float:-8.3996544E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Nsb r2 = X.OV8.A01
            java.lang.Object r3 = r1.A01
            X.NJ2 r3 = (X.NJ2) r3
            com.instagram.bugreporter.model.BugReport r1 = r3.A03
            if (r1 == 0) goto L_0x0b40
            java.lang.String r2 = r1.A0G
            X.OV8 r1 = new X.OV8
            r1.<init>(r2)
            java.io.File r1 = r1.A00()
            X.AnonymousClass5Kg.A07(r1)
            X.F1f r2 = r3.A01
            if (r2 != 0) goto L_0x0362
            java.lang.String r4 = "bugReportLogger"
            goto L_0x0b60
        L_0x0362:
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r2.A00(r1)
            X.Pwg r2 = r3.A02
            if (r2 == 0) goto L_0x0b43
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.AVr(r1)
            X.DbT.A1K(r3)
            r1 = 2142725256(0x7fb76488, float:NaN)
            goto L_0x0037
        L_0x0378:
            r0 = 616557242(0x24bfeaba, float:8.323069E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.direct.appwidget.DirectWidgetConfig r3 = (com.instagram.direct.appwidget.DirectWidgetConfig) r3
            X.QAL r2 = r3.A02
            java.lang.String r4 = "bottomSheet"
            if (r2 == 0) goto L_0x0b60
            r1 = 2131624492(0x7f0e022c, float:1.8876165E38)
            r2.setContentView(r1)
            X.QAL r2 = r3.A02
            if (r2 == 0) goto L_0x0b60
            r1 = 2131435423(0x7f0b1f9f, float:1.8492688E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x03a1
            r1 = 43
            A01(r2, r1, r3)
        L_0x03a1:
            X.QAL r2 = r3.A02
            if (r2 == 0) goto L_0x0b60
            r1 = 2131431292(0x7f0b0f7c, float:1.848431E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x03b3
            r1 = 44
            A01(r2, r1, r3)
        L_0x03b3:
            X.QAL r2 = r3.A02
            if (r2 == 0) goto L_0x0b60
            r1 = 2131431384(0x7f0b0fd8, float:1.8484496E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x03c5
            r1 = 45
            A01(r2, r1, r3)
        L_0x03c5:
            X.QAL r2 = r3.A02
            if (r2 == 0) goto L_0x0b60
            r1 = 2131432509(0x7f0b143d, float:1.8486777E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x03d7
            r1 = 46
            A01(r2, r1, r3)
        L_0x03d7:
            X.QAL r1 = r3.A02
            if (r1 == 0) goto L_0x0b60
            X.AnonymousClass0fN.A00(r1)
            r1 = 691440770(0x29368c82, float:4.053399E-14)
            goto L_0x0037
        L_0x03e3:
            r0 = -650405467(0xffffffffd93b99a5, float:-3.30029716E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.direct.appwidget.DirectWidgetConfig r1 = (com.instagram.direct.appwidget.DirectWidgetConfig) r1
            X.QAL r1 = r1.A02
            if (r1 == 0) goto L_0x046b
            r1.dismiss()
            r1 = 1454959398(0x56b8eb26, float:1.01660047E14)
            goto L_0x0037
        L_0x03fa:
            r0 = 1866821521(0x6f456f91, float:6.1103422E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r2 = -1
            X.2X1.A01(r2)
            java.lang.Object r2 = r1.A01
            com.instagram.direct.appwidget.DirectWidgetConfig r2 = (com.instagram.direct.appwidget.DirectWidgetConfig) r2
            X.QAL r1 = r2.A02
            if (r1 == 0) goto L_0x046b
            r1.dismiss()
            r2.recreate()
            r1 = 357645942(0x15513e76, float:4.2256487E-26)
            goto L_0x0037
        L_0x0418:
            r0 = 2086263312(0x7c59da10, float:4.524605E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r2 = 2
            X.2X1.A01(r2)
            java.lang.Object r2 = r1.A01
            com.instagram.direct.appwidget.DirectWidgetConfig r2 = (com.instagram.direct.appwidget.DirectWidgetConfig) r2
            X.QAL r1 = r2.A02
            if (r1 == 0) goto L_0x046b
            r1.dismiss()
            r2.recreate()
            r1 = -1413080723(0xffffffffabc6196d, float:-1.4075803E-12)
            goto L_0x0037
        L_0x0436:
            r0 = 1757298587(0x68be3f9b, float:7.1873836E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r2 = 1
            X.2X1.A01(r2)
            java.lang.Object r2 = r1.A01
            com.instagram.direct.appwidget.DirectWidgetConfig r2 = (com.instagram.direct.appwidget.DirectWidgetConfig) r2
            X.QAL r1 = r2.A02
            if (r1 == 0) goto L_0x046b
            r1.dismiss()
            r2.recreate()
            r1 = 467591830(0x1bdee296, float:3.6873247E-22)
            goto L_0x0037
        L_0x0454:
            r0 = 216934774(0xcee2976, float:3.669466E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.direct.appwidget.DirectWidgetConfig r1 = (com.instagram.direct.appwidget.DirectWidgetConfig) r1
            X.QAL r1 = r1.A02
            if (r1 == 0) goto L_0x046b
            r1.dismiss()
            r1 = -614927503(0xffffffffdb58f371, float:-6.1066262E16)
            goto L_0x0037
        L_0x046b:
            java.lang.String r13 = "bottomSheet"
            goto L_0x0961
        L_0x046f:
            r0 = -2133882837(0xffffffff80cf882b, float:-1.9058796E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r1.dismiss()
            r1 = 99465895(0x5edbaa7, float:2.2355938E-35)
            goto L_0x0037
        L_0x0482:
            r0 = -1277997612(0xffffffffb3d34dd4, float:-9.83961E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
            r1 = 98101081(0x5d8e759, float:2.0397526E-35)
            goto L_0x0037
        L_0x0495:
            r0 = -965056597(0xffffffffc67a67ab, float:-16025.917)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.NIU r3 = (X.NIU) r3
            X.0eM r1 = r3.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            r1 = 1
            X.C331227Qb.A00(r2, r1)
            X.0eM r1 = r3.A00
            java.lang.Object r2 = r1.getValue()
            X.7I3 r2 = (X.AnonymousClass7I3) r2
            X.0eM r1 = r3.A01
            java.lang.Object r1 = r1.getValue()
            X.Nml r1 = (X.C69503Nml) r1
            r2.A05(r1)
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            X.DbX.A10(r1, r2)
            r1 = -1732172512(0xffffffff98c12520, float:-4.9926817E-24)
            goto L_0x0037
        L_0x04cb:
            r0 = 1088431167(0x40e0243f, float:7.0044246)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJe r2 = (X.C68466NJe) r2
            r1 = 0
            X.C68466NJe.A02(r2, r1)
            r1 = 1302945084(0x4da95d3c, float:3.55182464E8)
            goto L_0x0037
        L_0x04df:
            r0 = 1146269640(0x4452afc8, float:842.7466)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJe r2 = (X.C68466NJe) r2
            r1 = 1
            X.C68466NJe.A02(r2, r1)
            r1 = 16500516(0xfbc724, float:2.3122148E-38)
            goto L_0x0037
        L_0x04f3:
            r0 = -412073882(0xffffffffe7704066, float:-1.1345559E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Nh3 r1 = (X.C69203Nh3) r1
            com.instagram.common.ui.base.IgSimpleImageView r5 = r1.A00
            if (r5 == 0) goto L_0x053f
            X.PrO r1 = r1.A02
            if (r1 == 0) goto L_0x0529
            X.P0K r1 = (X.P0K) r1
            X.7Sq r2 = r1.A00
            X.7I3 r4 = r2.A09
            X.0eM r1 = r2.A0H
            java.lang.Object r1 = r1.getValue()
            X.7Zs r1 = (X.C333637Zs) r1
            java.lang.String r3 = r1.A00()
            X.Nh3 r1 = r2.A01
            if (r1 == 0) goto L_0x0544
            java.lang.String r2 = r1.getCurrentDecorAvatarPosition()
        L_0x0520:
            r1 = 369(0x171, float:5.17E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0B(r3, r2, r1)
        L_0x0529:
            r5.bringToFront()
            int r4 = r5.getVisibility()
            r3 = 0
            r2 = 8
            r1 = 1
            if (r4 == r2) goto L_0x0539
            r1 = 0
            r3 = 8
        L_0x0539:
            r5.setVisibility(r3)
            r5.setClickable(r1)
        L_0x053f:
            r1 = 1049439570(0x3e8d2d52, float:0.2757364)
            goto L_0x0037
        L_0x0544:
            r2 = 0
            goto L_0x0520
        L_0x0546:
            r0 = -1414674747(0xffffffffabadc6c5, float:-1.2347559E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.7Rx r6 = (X.C331677Rx) r6
            X.4DH r1 = r6.A0B
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.7Rs r1 = r6.A00
            com.instagram.common.session.UserSession r1 = r1.A00
            X.6Yo r5 = X.DbS.A0M(r2, r1)
            X.K4q r4 = new X.K4q
            r4.<init>()
            java.lang.String r2 = "entrypoint"
            java.lang.String r1 = "sr_header"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r2, r1)
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r1 = X.C331677Rx.A00(r6)
            com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext r2 = r1.getLoggingContext()
            r1 = 331(0x14b, float:4.64E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            android.os.Bundle r1 = X.AnonymousClass7TG.A0P(r1, r2, r3)
            r4.setArguments(r1)
            X.Dba.A12(r4, r5)
            r1 = 582001201(0x22b0a231, float:4.7876622E-18)
            goto L_0x0037
        L_0x0589:
            r0 = 770300334(0x2de9d9ae, float:2.6585702E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.7Rx r1 = (X.C331677Rx) r1
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r1 = X.C331677Rx.A00(r1)
            r1.cancel()
            r1 = 357523537(0x154f6051, float:4.1879297E-26)
            goto L_0x0037
        L_0x05a0:
            r0 = -741069518(0xffffffffd3d42d32, float:-1.82258264E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.7Rx r1 = (X.C331677Rx) r1
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r1 = X.C331677Rx.A00(r1)
            r1.refreshResponses()
            r1 = -63750327(0xfffffffffc333f49, float:-3.722819E36)
            goto L_0x0037
        L_0x05b7:
            r0 = 55495716(0x34ecc24, float:6.07723E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.7Rx r1 = (X.C331677Rx) r1
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r2 = X.C331677Rx.A00(r1)
            r1 = 0
            r2.onContainerExpanded(r1)
            r1 = -1961069874(0xffffffff8b1c72ce, float:-3.0130877E-32)
            goto L_0x0037
        L_0x05cf:
            r0 = -1670701492(0xffffffff9c6b1e4c, float:-7.7794135E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UbI r1 = (X.C15365UbI) r1
            X.Puw r2 = r1.A03
            if (r2 == 0) goto L_0x0b36
            r1 = 0
            r2.D9n(r1)
            r1 = -844646895(0xffffffffcda7b611, float:-3.51715872E8)
            goto L_0x0037
        L_0x05e7:
            r0 = 1988637527(0x76883357, float:1.3812376E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UbI r1 = (X.C15365UbI) r1
            r1.A03()
            r1 = 1064453319(0x3f7244c7, float:0.94636196)
            goto L_0x0037
        L_0x05fa:
            r0 = 307648095(0x1256565f, float:6.7632954E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UbI r1 = (X.C15365UbI) r1
            X.Puw r2 = r1.A03
            if (r2 == 0) goto L_0x0b3b
            r1 = 0
            r2.D9n(r1)
            r1 = -1007917567(0xffffffffc3ec6601, float:-472.7969)
            goto L_0x0037
        L_0x0612:
            r0 = -532964876(0xffffffffe03b99f4, float:-5.4072416E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UbI r1 = (X.C15365UbI) r1
            r1.A03()
            r1 = 1953111855(0x746a1f2f, float:7.4196164E31)
            goto L_0x0037
        L_0x0625:
            r0 = 1323796434(0x4ee787d2, float:1.94221901E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Ac1 r6 = (X.C40430Ac1) r6
            android.view.View r5 = r6.A04
            com.instagram.model.direct.DirectThreadKey r4 = r6.A08
            X.0eK r1 = r6.A0A
            java.lang.Object r1 = r1.get()
            X.8Wi r1 = (X.C357068Wi) r1
            android.graphics.Bitmap r3 = r1.A05()
            com.instagram.common.session.UserSession r2 = r6.A06
            java.lang.Integer r1 = r6.A09
            X.C64176LSd.A02(r3, r5, r2, r4, r1)
            android.app.Activity r2 = r6.A02
            r1 = -1
            r2.setResult(r1)
            r2.finish()
            r1 = 615243832(0x24abe038, float:7.453927E-17)
            goto L_0x0037
        L_0x0655:
            r0 = -1308227641(0xffffffffb20607c7, float:-7.801595E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NKC r4 = (X.NKC) r4
            X.0eM r1 = r4.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.3gp r2 = r4.A01
            java.lang.String r1 = "comment_hidden_nux_undo"
            X.AAQ.A00(r3, r2, r1)
            r1 = 1
            r4.A03 = r1
            X.ODM r2 = r4.A00
            if (r2 == 0) goto L_0x067f
            X.GgO r1 = r2.A00
            java.lang.String r3 = r2.A01
            java.lang.String r2 = r2.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = r1.A0A
            r1.A0M(r3, r2)
        L_0x067f:
            X.NKC.A00(r4)
            r1 = 580236419(0x2295b483, float:4.0577655E-18)
            goto L_0x0037
        L_0x0687:
            r0 = -1474254177(0xffffffffa820aa9f, float:-8.918782E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NKC r4 = (X.NKC) r4
            X.0eM r1 = r4.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.3gp r2 = r4.A01
            java.lang.String r1 = "comment_hidden_nux_ok"
            X.AAQ.A00(r3, r2, r1)
            r1 = 1
            r4.A03 = r1
            X.ODM r2 = r4.A00
            if (r2 == 0) goto L_0x06b1
            X.GgO r1 = r2.A00
            java.lang.String r3 = r2.A01
            java.lang.String r2 = r2.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = r1.A0A
            r1.A0L(r3, r2)
        L_0x06b1:
            X.NKC.A00(r4)
            r1 = 940695282(0x3811def2, float:3.4778328E-5)
            goto L_0x0037
        L_0x06b9:
            r0 = -679960298(0xffffffffd778a116, float:-2.73370743E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ngk r1 = (X.C69186Ngk) r1
            X.OBF r4 = r1.A00
            if (r4 == 0) goto L_0x06d9
            X.7aA r3 = r1.A01
            java.lang.Integer r2 = r1.A02
            X.AnonymousClass7TG.A1N(r3, r2)
            X.GgO r1 = r4.A01
            r1.A0S(r3, r2)
            androidx.fragment.app.FragmentActivity r1 = r4.A00
            r1.onBackPressed()
        L_0x06d9:
            r1 = -1319360512(0xffffffffb15c2800, float:-3.203695E-9)
            goto L_0x0037
        L_0x06de:
            r0 = -1283065521(0xffffffffb385f94f, float:-6.238644E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 810018183(0x3047e587, float:7.2721956E-10)
            goto L_0x0037
        L_0x06ef:
            r0 = 973477284(0x3a0615a4, float:5.114919E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 2039637294(0x7992652e, float:9.501594E34)
            goto L_0x0037
        L_0x0700:
            r0 = -700604291(0xffffffffd63da07d, float:-5.2124247E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYr r1 = (X.UYr) r1
            androidx.fragment.app.FragmentActivity r4 = r1.getActivity()
            if (r4 == 0) goto L_0x0726
            X.0eM r1 = r1.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r2 = X.2EG.A0L
            java.lang.String r1 = "https://www.facebook.com/legal/terms/ad_creative_generative_ai_terms"
            X.SUL r2 = X.Dba.A0J(r4, r3, r2, r1)
            java.lang.String r1 = "promote_automatic_creative_optimization_bottom_sheet"
            r2.A0S = r1
            r2.A0A()
        L_0x0726:
            r1 = 877716851(0x3450e573, float:1.9454983E-7)
            goto L_0x0037
        L_0x072b:
            r0 = -381708003(0xffffffffe93f991d, float:-1.4476743E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYr r1 = (X.UYr) r1
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.0eM r1 = r1.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r2 = X.2EG.A34
            java.lang.String r1 = "https://www.facebook.com/help/instagram/145903034165129?ref=igapp"
            X.SUL r2 = X.Dba.A0J(r4, r3, r2, r1)
            java.lang.String r1 = "promote_automatic_creative_optimization_bottom_sheet"
            r2.A0S = r1
            r2.A0A()
            r1 = -1762712539(0xffffffff96ef2425, float:-3.8635343E-25)
            goto L_0x0037
        L_0x0754:
            r0 = 421571692(0x1920ac6c, float:8.3066264E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.OtM r2 = (X.C71936OtM) r2
            r1 = 0
            X.C71936OtM.A00(r1, r2)
            r1 = 546162410(0x208dc6ea, float:2.401796E-19)
            goto L_0x0037
        L_0x0768:
            r0 = 1187291215(0x46c4a04f, float:25168.154)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r2)
            r1 = -1342899880(0xffffffffaff4f958, float:-4.456051E-10)
            goto L_0x0037
        L_0x077b:
            r0 = -1427913682(0xffffffffaae3c42e, float:-4.0459427E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            com.instagram.bugreporter.BugReportComposerFragment r7 = (com.instagram.bugreporter.BugReportComposerFragment) r7
            X.0wW r4 = r7.getSession()
            X.Pwg r6 = r7.A07
            if (r6 == 0) goto L_0x0b43
            r5 = 0
            X.0qQ.A0B(r4, r5)
            java.lang.Class<X.OtM> r3 = X.C71936OtM.class
            r2 = 2
            X.Wvn r1 = new X.Wvn
            r1.<init>(r4, r2)
            java.lang.Object r4 = r4.A01(r3, r1)
            X.OtM r4 = (X.C71936OtM) r4
            r4.A04 = r6
            com.instagram.bugreporter.model.BugReport r3 = r7.A08
            if (r3 == 0) goto L_0x0b40
            com.instagram.bugreporter.BugReportComposerViewModel r2 = r7.A04
            if (r2 != 0) goto L_0x07ae
            java.lang.String r4 = "viewModel"
            goto L_0x0b60
        L_0x07ae:
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r4.A05 = r3
            r4.A03 = r2
            r1.finish()
            r1.overridePendingTransition(r5, r5)
            r1 = 1161475936(0x453ab760, float:2987.461)
            goto L_0x0037
        L_0x07c1:
            r0 = -1159494477(0xffffffffbae384b3, float:-0.0017358273)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -1899964895(0xffffffff8ec0d621, float:-4.7537853E-30)
            goto L_0x0037
        L_0x07d2:
            r0 = -1168812163(0xffffffffba55577d, float:-8.138342E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.bugreporter.BugReportComposerFragment r5 = (com.instagram.bugreporter.BugReportComposerFragment) r5
            boolean r1 = r5.A0A
            r4 = 1
            java.lang.String r12 = "logger"
            if (r1 == 0) goto L_0x080a
            android.content.Context r2 = r5.requireContext()
            r1 = 2131954332(0x7f130a9c, float:1.954516E38)
            X.C59689JTv.A07(r2, r1)
            X.F1f r2 = r5.A06
            if (r2 == 0) goto L_0x0805
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            r2.A00(r1)
            long r2 = r5.A00
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x094b
            com.facebook.quicklog.reliability.UserFlowLogger r5 = r5.A03
            if (r5 != 0) goto L_0x0946
            java.lang.String r12 = "userFlowLogger"
        L_0x0805:
            X.0qQ.A0F(r12)
            goto L_0x0b63
        L_0x080a:
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x0819
            X.F1f r2 = r5.A06
            if (r2 == 0) goto L_0x0805
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            r2.A00(r1)
            goto L_0x094b
        L_0x0819:
            com.instagram.bugreporter.model.BugReport r1 = r5.A08
            if (r1 != 0) goto L_0x0820
            java.lang.String r12 = "bugReport"
            goto L_0x0805
        L_0x0820:
            java.lang.String r1 = r1.A0A
            r6 = 0
            if (r1 == 0) goto L_0x0932
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0932
            r5.A09 = r4
            X.F1f r2 = r5.A06
            if (r2 == 0) goto L_0x0805
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r2.A00(r1)
            X.Pwg r2 = r5.A07
            java.lang.String r13 = "userFlowLoggerV2"
            r9 = 0
            if (r2 == 0) goto L_0x0961
            java.lang.String r1 = "start_report_submit"
            r2.AVy(r1)
            android.content.Context r11 = r5.requireContext()
            X.0wW r2 = r5.getSession()
            java.lang.Class<X.0tQ> r1 = X.0tQ.class
            java.lang.Object r2 = r2.A00(r1)
            X.0tQ r2 = (X.0tQ) r2
            com.instagram.bugreporter.BugReportComposerViewModel r1 = r5.A04
            java.lang.String r12 = "viewModel"
            if (r1 == 0) goto L_0x0805
            boolean r1 = r1.A03
            java.lang.String r8 = "bugReport"
            if (r1 != 0) goto L_0x0892
            if (r2 == 0) goto L_0x0887
            X.0Up r7 = r2.A01
            if (r7 == 0) goto L_0x0887
            X.0yy r3 = X.AnonymousClass0Wc.A00()
            java.lang.String r2 = "IgProfiloSessionManager"
            java.lang.String r1 = "Bugreport Blackbox trace is discarded"
            r3.A04(r2, r1)
            monitor-enter(r7)
            boolean r1 = r7.A03     // Catch:{ all -> 0x0b46 }
            if (r1 != 0) goto L_0x0886
            java.io.File r1 = r7.A00     // Catch:{ all -> 0x0b46 }
            if (r1 == 0) goto L_0x087d
            r1.delete()     // Catch:{ all -> 0x0b46 }
            r7.A00 = r9     // Catch:{ all -> 0x0b46 }
        L_0x087d:
            X.0we r2 = X.0we.A00()     // Catch:{ all -> 0x0b46 }
            X.0wf r1 = r7.A04     // Catch:{ all -> 0x0b46 }
            r2.A07(r1)     // Catch:{ all -> 0x0b46 }
        L_0x0886:
            monitor-exit(r7)
        L_0x0887:
            com.instagram.bugreporter.model.BugReport r1 = r5.A08
            if (r1 == 0) goto L_0x0b49
            com.instagram.bugreporter.model.BugReport r1 = com.instagram.bugreporter.BugReportComposerFragment.A00(r5, r1, r9, r9)
            r5.A08 = r1
            goto L_0x08a6
        L_0x0892:
            if (r2 == 0) goto L_0x08a6
            X.0Up r7 = r2.A01
            if (r7 == 0) goto L_0x08a6
            X.0yy r3 = X.AnonymousClass0Wc.A00()
            java.lang.String r2 = "IgProfiloSessionManager"
            java.lang.String r1 = "Bugreport Blackbox trace is triggered for upload"
            r3.A04(r2, r1)
            r7.A00()
        L_0x08a6:
            com.instagram.bugreporter.model.BugReport r3 = r5.A08
            if (r3 == 0) goto L_0x0b49
            java.util.List r2 = r3.A0J
            java.util.List r1 = r3.A0M
            com.instagram.bugreporter.model.BugReport r1 = com.instagram.bugreporter.BugReportComposerFragment.A00(r5, r3, r2, r1)
            r5.A08 = r1
            X.0wW r9 = r5.getSession()
            com.instagram.bugreporter.model.BugReport r10 = r5.A08
            if (r10 == 0) goto L_0x0b49
            com.instagram.bugreporter.BugReportComposerViewModel r8 = r5.A04
            if (r8 == 0) goto L_0x0805
            X.Pwg r7 = r5.A07
            if (r7 == 0) goto L_0x0961
            X.0qQ.A0B(r9, r4)
            r4 = 3
            android.content.Context r15 = X.DbT.A05(r11)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36324359489597477(0x810cd000123025, double:3.035009435452391E-306)
            boolean r1 = X.182.A06(r3, r9, r1)
            if (r1 == 0) goto L_0x0908
            java.lang.String r1 = "upload_service_start_no_service"
            r7.AVy(r1)
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 623968396(0x2531008c, float:1.5352488E-16)
            X.0nV r1 = r2.CO6(r1, r4)
            r20 = 0
            com.instagram.bugreporter.BugReporterService$Companion$startService$1 r14 = new com.instagram.bugreporter.BugReporterService$Companion$startService$1
            r17 = r7
            r18 = r10
            r19 = r9
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.1ES.A07(r1, r14)
        L_0x08f9:
            X.Pwg r2 = r5.A07
            if (r2 == 0) goto L_0x0961
            java.lang.String r1 = "end_report_submit"
            r2.AVy(r1)
            X.DbT.A1K(r5)
            r5.A09 = r6
            goto L_0x094b
        L_0x0908:
            java.lang.String r1 = "upload_service_start_with_service"
            r7.AVy(r1)
            java.lang.Class<com.instagram.bugreporter.BugReporterService> r4 = com.instagram.bugreporter.BugReporterService.class
            android.content.Intent r3 = X.C66580MXl.A0A(r15, r4)
            X.OVq r1 = X.C70995OVq.A00
            r1.A01(r3, r10, r9)
            java.lang.String r1 = "BugReporterActivity.INTENT_EXTRA_VIEWMODEL"
            r3.putExtra(r1, r8)
            java.lang.String r2 = r9.getToken()
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putExtra(r1, r2)
            android.os.Bundle r1 = r7.E2f()
            r3.putExtras(r1)
            r1 = 5
            X.02C.enqueueWork(r15, r4, r1, r3)
            goto L_0x08f9
        L_0x0932:
            X.F1f r2 = r5.A06
            if (r2 == 0) goto L_0x0805
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            r2.A00(r1)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131954320(0x7f130a90, float:1.9545136E38)
            X.C59689JTv.A07(r2, r1)
            goto L_0x094b
        L_0x0946:
            java.lang.String r1 = "IS_LOG_PROCESSING_BLOCKING_SUBMISSION"
            r5.flowAnnotate(r2, r1, r4)
        L_0x094b:
            r1 = 896840681(0x3574b3e9, float:9.1158887E-7)
            goto L_0x0037
        L_0x0950:
            r0 = -1611950148(0xffffffff9feb97bc, float:-9.9777395E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OLy r1 = (X.C70803OLy) r1
            X.UbI r1 = r1.A02
            if (r1 != 0) goto L_0x0966
            java.lang.String r13 = "bottomSheetFragment"
        L_0x0961:
            X.0qQ.A0F(r13)
            goto L_0x0b63
        L_0x0966:
            r1.A03()
            r1 = -304482361(0xffffffffedd9f7c7, float:-8.432224E27)
            goto L_0x0037
        L_0x096e:
            r0 = -31189654(0xfffffffffe24156a, float:-5.4526145E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 377581042(0x16816df2, float:2.091046E-25)
            goto L_0x0037
        L_0x097f:
            r0 = -1101281729(0xffffffffbe5bc63f, float:-0.21462344)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJJ r1 = (X.NJJ) r1
            X.DbT.A1K(r1)
            r1 = -1857574638(0xffffffff9147a912, float:-1.5750431E-28)
            goto L_0x0037
        L_0x0992:
            r0 = 1871901615(0x6f92f3af, float:9.095881E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OLL r1 = (X.OLL) r1
            r1.A00()
            android.view.View$OnClickListener r1 = r1.A01
            if (r1 != 0) goto L_0x09a8
            java.lang.String r4 = "onCancelListener"
            goto L_0x0b60
        L_0x09a8:
            r1.onClick(r2)
            r1 = 1182689790(0x467e69fe, float:16282.498)
            goto L_0x0037
        L_0x09b0:
            r0 = -600981903(0xffffffffdc2dbe71, float:-1.95618254E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.8ab r4 = X.DbW.A0U(r5)
            r1 = 2131963369(0x7f132de9, float:1.956349E38)
            r4.A09(r1)
            r1 = 2131963368(0x7f132de8, float:1.9563487E38)
            r4.A08(r1)
            r1 = 1
            r4.A0r(r1)
            r4.A0s(r1)
            r1 = 2131963365(0x7f132de5, float:1.9563481E38)
            java.lang.String r3 = r5.getString(r1)
            r2 = 2
            X.W5U r1 = new X.W5U
            r1.<init>(r5, r2)
            r4.A0d(r1, r3)
            r1 = 0
            X.OgE r1 = X.C71249OgE.A00(r5, r1)
            X.DbX.A16(r1, r4)
            r1 = -756863268(0xffffffffd2e32edc, float:-4.87871873E11)
            goto L_0x0037
        L_0x09ef:
            r0 = -1279939130(0xffffffffb3b5adc6, float:-8.4600785E-8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.7Rx r4 = (X.C331677Rx) r4
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r0 = X.C331677Rx.A00(r4)
            X.0Ud r0 = r0.uiState
            java.lang.Object r0 = r0.getValue()
            X.JwC r0 = (X.C61074JwC) r0
            java.lang.Object r0 = r0.A02
            java.util.Iterator r3 = X.C51966G9m.A1H(r0)
        L_0x0a0c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a22
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)
            boolean r0 = X.C51966G9m.A1X(r1)
            if (r0 == 0) goto L_0x0a0c
            X.0sP r0 = r4.A0G
            r0.invoke(r1)
            goto L_0x0a0c
        L_0x0a22:
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r0 = X.C331677Rx.A00(r4)
            r0.onSendTapped()
            r0 = -577035334(0xffffffffdd9b23ba, float:-1.3973729E18)
            goto L_0x0baa
        L_0x0a2e:
            r0 = 1009863522(0x3c314b62, float:0.010821195)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.7Rx r5 = (X.C331677Rx) r5
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r0 = X.C331677Rx.A00(r5)
            r0.onEditTapped()
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r0 = X.C331677Rx.A00(r5)
            X.0Ud r0 = r0.uiState
            java.lang.Object r0 = r0.getValue()
            X.JwC r0 = (X.C61074JwC) r0
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0a58:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r1 = r3.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00l.A0W(r0)
            X.DbV.A1U(r1, r4, r0)
            goto L_0x0a58
        L_0x0a6d:
            java.lang.String r0 = " "
            java.lang.String r1 = X.C66581MXm.A0w(r0, r4)
            X.0sP r0 = r5.A0F
            r0.invoke(r1)
            X.0sa r0 = r5.A0E
            r0.invoke()
            r0 = -1184872941(0xffffffffb9604613, float:-2.138841E-4)
            goto L_0x0baa
        L_0x0a82:
            r0 = 1074349165(0x4009446d, float:2.1448014)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.OtM r7 = (X.C71936OtM) r7
            X.LRG r3 = X.LRG.A00
            X.0lg r1 = r7.A07
            android.app.Activity r0 = r7.A00
            if (r0 == 0) goto L_0x0ac9
            java.lang.Object r6 = r3.A01(r0, r1)
            java.lang.Throwable r5 = X.0eR.A00(r6)
            r4 = 0
            if (r5 == 0) goto L_0x0aba
            X.Pwg r3 = r7.A04
            if (r3 != 0) goto L_0x0aae
            java.lang.String r0 = "userFlowLoggerV2"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0aae:
            r0 = 30
            X.Iwb r1 = new X.Iwb
            r1.<init>(r5, r0)
            java.lang.String r0 = "take_screenshot_failure"
            r3.AW0(r0, r1)
        L_0x0aba:
            boolean r0 = r6 instanceof X.0eQ
            if (r0 == 0) goto L_0x0abf
            r6 = r4
        L_0x0abf:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            X.C71936OtM.A00(r6, r7)
            r0 = 437861474(0x1a193c62, float:3.1688435E-23)
            goto L_0x0baa
        L_0x0ac9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ace:
            r0 = 1231603623(0x4968c7a7, float:953466.44)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcs r0 = (X.C7921Qcs) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x0ae8
            java.lang.Object r0 = r0.get()
            X.PsX r0 = (X.C74298PsX) r0
            if (r0 == 0) goto L_0x0ae8
            r0.CzA()
        L_0x0ae8:
            r0 = -118131865(0xfffffffff8f57367, float:-3.9826668E34)
            goto L_0x0baa
        L_0x0aed:
            r0 = 1234532060(0x499576dc, float:1224411.5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1J(r0)
            r0 = -556650708(0xffffffffded22f2c, float:-7.5726862E18)
            goto L_0x0baa
        L_0x0b00:
            r0 = -1952004501(0xffffffff8ba6c66b, float:-6.423942E-32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcs r0 = (X.C7921Qcs) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 != 0) goto L_0x0b14
            r0 = -1520904318(0xffffffffa558d782, float:-1.880803E-16)
            goto L_0x0baa
        L_0x0b14:
            java.lang.Object r0 = r0.get()
            X.PsX r0 = (X.C74298PsX) r0
            if (r0 == 0) goto L_0x0b1f
            r0.CzA()
        L_0x0b1f:
            r0 = -398288093(0xffffffffe8429b23, float:-3.6760035E24)
            goto L_0x0baa
        L_0x0b24:
            r0 = -1424317333(0xffffffffab1aa46b, float:-5.4939966E-13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1J(r0)
            r0 = 2046252102(0x79f75446, float:1.6052582E35)
            goto L_0x0baa
        L_0x0b36:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b3b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b40:
            java.lang.String r4 = "bugReport"
            goto L_0x0b60
        L_0x0b43:
            java.lang.String r4 = "userFlowLoggerV2"
            goto L_0x0b60
        L_0x0b46:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0b49:
            X.0qQ.A0F(r8)
            goto L_0x0b63
        L_0x0b4d:
            r0 = -825604826(0xffffffffceca4526, float:-1.69676467E9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.OLL r5 = (X.OLL) r5
            X.FAt r4 = X.C49872FAt.A00
            android.content.Context r3 = r5.A00
            if (r3 != 0) goto L_0x0b68
            java.lang.String r4 = "context"
        L_0x0b60:
            X.0qQ.A0F(r4)
        L_0x0b63:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0b68:
            com.instagram.common.session.UserSession r1 = r5.A04
            if (r1 != 0) goto L_0x0b6f
            java.lang.String r4 = "userSession"
            goto L_0x0b60
        L_0x0b6f:
            X.6iu r0 = r5.A03
            if (r0 != 0) goto L_0x0b76
            java.lang.String r4 = "audLogging"
            goto L_0x0b60
        L_0x0b76:
            r4.A00(r3, r0, r1)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.Fragment r0 = r5.A02
            if (r0 != 0) goto L_0x0b82
            java.lang.String r4 = "fragment"
            goto L_0x0b60
        L_0x0b82:
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.DbX.A10(r0, r1)
            r0 = 1395061261(0x5326f20d, float:7.1702551E11)
            goto L_0x0baa
        L_0x0b8d:
            r0 = -1669141664(0xffffffff9c82eb60, float:-8.663521E-22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcs r0 = (X.C7921Qcs) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x0ba7
            java.lang.Object r0 = r0.get()
            X.PsX r0 = (X.C74298PsX) r0
            if (r0 == 0) goto L_0x0ba7
            r0.CzA()
        L_0x0ba7:
            r0 = -2048812890(0xffffffff85e198a6, float:-2.1214972E-35)
        L_0x0baa:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71403Ok2.onClick(android.view.View):void");
    }
}
