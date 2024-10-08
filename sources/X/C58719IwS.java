package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.IwS  reason: case insensitive filesystem */
public final class C58719IwS extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58719IwS(Object obj, Object obj2, String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    public static C296295pp A00(UserSession userSession, String str) {
        return new C296295pp(userSession, new IYU(userSession, str), C230432pc.CLIPS);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0492, code lost:
        r2.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04d3, code lost:
        r2.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0720, code lost:
        return new X.AnonymousClass4LP();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0105, code lost:
        r3 = X.AnonymousClass0eN.A00(r4, r3).getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x010d, code lost:
        if (r3 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0111, code lost:
        return r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x032a, code lost:
        r1.Dhy(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x037a, code lost:
        if (r2 == X.AnonymousClass3OB.PREPARED) goto L_0x037c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0398  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0112;
                case 1: goto L_0x04d8;
                case 2: goto L_0x012a;
                case 3: goto L_0x0165;
                case 4: goto L_0x01a3;
                case 5: goto L_0x01ba;
                case 6: goto L_0x01d1;
                case 7: goto L_0x01e8;
                case 8: goto L_0x021d;
                case 9: goto L_0x023a;
                case 10: goto L_0x0251;
                case 11: goto L_0x0278;
                case 12: goto L_0x003e;
                case 13: goto L_0x02a7;
                case 14: goto L_0x02b1;
                case 15: goto L_0x02da;
                case 16: goto L_0x02fa;
                case 17: goto L_0x0313;
                case 18: goto L_0x032f;
                case 19: goto L_0x045b;
                case 20: goto L_0x046a;
                case 21: goto L_0x04a0;
                case 22: goto L_0x04e7;
                case 23: goto L_0x0516;
                case 24: goto L_0x0545;
                case 25: goto L_0x0565;
                case 26: goto L_0x0594;
                case 27: goto L_0x05b9;
                case 28: goto L_0x05fa;
                case 29: goto L_0x061e;
                case 30: goto L_0x065f;
                case 31: goto L_0x068e;
                case 32: goto L_0x06bd;
                case 33: goto L_0x06ec;
                case 34: goto L_0x0479;
                case 35: goto L_0x04c5;
                case 36: goto L_0x004d;
                case 37: goto L_0x005c;
                case 38: goto L_0x006b;
                case 39: goto L_0x007a;
                case 40: goto L_0x0088;
                case 41: goto L_0x0096;
                case 42: goto L_0x00a4;
                case 43: goto L_0x00b2;
                case 44: goto L_0x00c0;
                case 45: goto L_0x00ce;
                case 46: goto L_0x00dc;
                case 47: goto L_0x00ea;
                case 48: goto L_0x00f8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r0.A02
            X.OYk r6 = (X.C71012OYk) r6
            r5 = 0
            r6.A01 = r5
            java.lang.Object r1 = r0.A01
            java.lang.Number r1 = (java.lang.Number) r1
            r2 = 584648731(0x22d9081b, float:5.882655E-18)
            com.facebook.quicklog.reliability.UserFlowLogger r4 = r6.A03
            if (r1 == 0) goto L_0x0039
            int r1 = r1.intValue()
            long r2 = r4.generateFlowId(r2, r1)
        L_0x0021:
            java.lang.String r1 = r0.A03
            com.facebook.quicklog.reliability.UserFlowConfig r0 = new com.facebook.quicklog.reliability.UserFlowConfig
            r0.<init>(r1, r5)
            r4.flowStart(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A00 = r0
            X.HAC r0 = X.HAC.A00
            X.C71012OYk.A00(r0, r6)
        L_0x0036:
            X.0gF r3 = X.C60340gF.A00
        L_0x0038:
            return r3
        L_0x0039:
            long r2 = r4.generateNewFlowId(r2)
            goto L_0x0021
        L_0x003e:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.Fz6 r3 = new X.Fz6
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x004d:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzE r3 = new X.FzE
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x005c:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzF r3 = new X.FzF
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x006b:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzG r3 = new X.FzG
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x007a:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzH r3 = new X.FzH
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x0088:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzJ r3 = new X.FzJ
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x0096:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzO r3 = new X.FzO
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x00a4:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzU r3 = new X.FzU
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x00b2:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzV r3 = new X.FzV
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x00c0:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.FzW r3 = new X.FzW
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x00ce:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.Fzc r3 = new X.Fzc
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x00dc:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.Fzh r3 = new X.Fzh
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x00ea:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.Fzn r3 = new X.Fzn
            r3.<init>(r2, r1)
            goto L_0x0105
        L_0x00f8:
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r0.A03
            X.0eO r4 = X.0eO.A02
            X.Fzw r3 = new X.Fzw
            r3.<init>(r2, r1)
        L_0x0105:
            X.0eM r1 = X.AnonymousClass0eN.A00(r4, r3)
            java.lang.Object r3 = r1.getValue()
            if (r3 != 0) goto L_0x0038
            java.lang.Object r3 = r0.A01
            return r3
        L_0x0112:
            java.lang.Object r2 = r0.A01
            X.0r1 r2 = (X.0r1) r2
            java.lang.Object r1 = r0.A02
            X.45c r1 = (X.C2603045c) r1
            X.3m2 r1 = r1.A0C
            if (r1 == 0) goto L_0x0128
            java.lang.String r0 = r0.A03
            boolean r0 = r1.verifyAuthToken(r0)
        L_0x0124:
            r2.A00 = r0
            goto L_0x0036
        L_0x0128:
            r0 = 0
            goto L_0x0124
        L_0x012a:
            java.lang.Object r2 = r0.A02
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A01
            java.lang.Class r0 = (java.lang.Class) r0
            X.Cvn r2 = r2.getOptionalPaginableListEdges(r1, r0)
            r3 = 0
            if (r2 == 0) goto L_0x0038
            boolean r0 = X.AnonymousClass1vU.A00
            if (r0 == 0) goto L_0x014b
            com.google.common.collect.ImmutableList r1 = r2.A00
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x014c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x014c
        L_0x014b:
            return r2
        L_0x014c:
            java.util.Iterator r1 = r1.iterator()
        L_0x0150:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r1.next()
            X.3lr r0 = (X.C250663lr) r0
            boolean r0 = r0.areAllSelectionsOptionalOrNonnull()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0150
            return r3
        L_0x0165:
            X.Sto r3 = X.C51965G9l.A0g()
            java.lang.Object r2 = r0.A02
            com.facebookpay.addresstypeahead.controller.AddressTypeaheadController r2 = (com.facebookpay.addresstypeahead.controller.AddressTypeaheadController) r2
            com.facebookpay.logging.LoggingContext r4 = r2.A07
            java.lang.String r1 = r0.A03
            int r8 = X.DbX.A05(r1)
            java.lang.Object r0 = r0.A01
            int r7 = X.DbS.A05(r0)
            java.lang.String r6 = "enter_address_manually"
            r5 = 0
            r9 = 0
            X.0Ae r1 = r3.A00
            r0 = 919(0x397, float:1.288E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 391(0x187, float:5.48E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            X.Pmf r3 = new X.Pmf
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C12411Sto.A03(r0, r4, r3)
            r0 = 1
            r2.A02 = r0
            X.0sa r0 = r2.A08
            r0.invoke()
            goto L_0x0036
        L_0x01a3:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r1 = r0.A02
            X.QDM r1 = (X.QDM) r1
            com.facebookpay.logging.LoggingContext r3 = r1.A0R
            java.lang.String r2 = r0.A03
            X.QDH r1 = r1.A0S
            java.util.LinkedHashMap r0 = A01(r1, r0)
            r4.A0a(r3, r2, r0)
            goto L_0x0036
        L_0x01ba:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r1 = r0.A02
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.logging.LoggingContext r3 = r1.A1P
            java.lang.String r2 = r0.A03
            X.QDH r1 = r1.A1Q
            java.util.LinkedHashMap r0 = A01(r1, r0)
            r4.A0W(r3, r2, r0)
            goto L_0x0036
        L_0x01d1:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r1 = r0.A02
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.logging.LoggingContext r3 = r1.A1P
            java.lang.String r2 = r0.A03
            X.QDH r1 = r1.A1Q
            java.util.LinkedHashMap r0 = A01(r1, r0)
            r4.A0X(r3, r2, r0)
            goto L_0x0036
        L_0x01e8:
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.Object r1 = r0.A02
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.logging.LoggingContext r3 = r1.A1P
            java.lang.String r5 = r0.A03
            X.QDH r1 = r1.A1Q
            java.util.LinkedHashMap r4 = A01(r1, r0)
            r0 = 1116(0x45c, float:1.564E-42)
            java.lang.String r6 = X.C66579MXk.A00(r0)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_load_fulfillmentoption_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 76
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r7 = 6
            X.PqY r2 = new X.PqY
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7)
            X.C12411Sto.A03(r0, r3, r2)
            goto L_0x0036
        L_0x021d:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r1 = r0.A02
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.logging.LoggingContext r3 = r1.A1P
            java.lang.String r2 = r0.A03
            X.QDH r1 = r1.A1Q
            java.util.LinkedHashMap r1 = A01(r1, r0)
            r0 = 163(0xa3, float:2.28E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.A0P(r3, r2, r0, r1)
            goto L_0x0036
        L_0x023a:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r1 = r0.A02
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.logging.LoggingContext r3 = r1.A1P
            java.lang.String r2 = r0.A03
            X.QDH r1 = r1.A1Q
            java.util.LinkedHashMap r0 = A01(r1, r0)
            r4.A0d(r3, r2, r0)
            goto L_0x0036
        L_0x0251:
            java.lang.Object r1 = r0.A02
            X.QDO r1 = (X.QDO) r1
            java.lang.String r4 = r0.A03
            java.lang.Object r0 = r0.A01
            X.QXT r0 = (X.QXT) r0
            X.RGh r0 = r0.A0E()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r0 = 671(0x29f, float:9.4E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            r3 = 0
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            X.QDO.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0036
        L_0x0278:
            X.K5Z r4 = new X.K5Z
            r4.<init>()
            java.lang.String r3 = r0.A03
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "arg_entry_point"
            r2.putString(r1, r3)
            r4.setArguments(r2)
            java.lang.Object r1 = r0.A02
            X.0lg r1 = (X.0lg) r1
            X.7Pr r2 = X.DbS.A0W(r1)
            r1 = 0
            r2.A1G = r1
            X.DbS.A1S(r2, r1)
            r2.A0k = r1
            r2.A03()
            java.lang.Object r0 = r0.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A0F(r4, r2)
            goto L_0x0036
        L_0x02a7:
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A01
            goto L_0x0492
        L_0x02b1:
            java.lang.Object r2 = r0.A01
            X.Xzg r2 = (X.C22331Xzg) r2
            java.lang.String r4 = r0.A03
            java.lang.Object r1 = r0.A02
            X.4gU r1 = (X.C270284gU) r1
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            boolean r7 = r0.A0C
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            boolean r8 = r0.A0A
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            com.instagram.api.schemas.RepostRestrictedReason r3 = r0.A05
            r5 = 0
            r6 = r5
            r2.DeB(r3, r4, r5, r6, r7, r8)
            goto L_0x0036
        L_0x02da:
            java.lang.Object r4 = r0.A01
            X.Xzg r4 = (X.C22331Xzg) r4
            java.lang.String r3 = r0.A03
            java.lang.Object r1 = r0.A02
            X.4gU r1 = (X.C270284gU) r1
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            boolean r2 = r0.A0A
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            com.instagram.api.schemas.RepostRestrictedReason r1 = r0.A05
            r0 = 0
            r4.DeC(r1, r3, r0, r2)
            goto L_0x0036
        L_0x02fa:
            java.lang.Object r1 = r0.A02
            X.5vQ r1 = (X.C299575vQ) r1
            X.GpB r1 = (X.C53479GpB) r1
            java.lang.String r2 = r1.A07
            java.lang.String r4 = "timely_topics"
            java.lang.String r5 = r1.A05
            java.lang.String r6 = r1.A06
            java.lang.String r8 = r1.A03
            java.lang.String r7 = r1.A04
            java.lang.Object r1 = r0.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r3 = r0.A03
            goto L_0x032a
        L_0x0313:
            java.lang.Object r1 = r0.A02
            X.5vQ r1 = (X.C299575vQ) r1
            X.GpI r1 = (X.C53486GpI) r1
            java.lang.String r2 = r1.A07
            java.lang.String r5 = r1.A06
            java.lang.String r7 = r1.A05
            java.lang.String r4 = "timely_topics"
            java.lang.String r8 = r1.A04
            java.lang.Object r1 = r0.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r3 = r0.A03
            r6 = r2
        L_0x032a:
            r1.Dhy(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0036
        L_0x032f:
            java.lang.Object r2 = r0.A01
            X.6D8 r2 = (X.AnonymousClass6D8) r2
            X.4gU r1 = r2.A00
            boolean r1 = X.C51971G9r.A1X(r1)
            if (r1 != 0) goto L_0x033e
            r2.A00()
        L_0x033e:
            java.lang.Object r5 = r0.A02
            X.Hr5 r5 = (X.C55999Hr5) r5
            java.lang.String r6 = r0.A03
            r10 = 0
            X.0qQ.A0B(r6, r10)
            X.Ib5 r1 = r5.A05
            X.Tol r0 = r1.A01
            r12 = 1
            if (r0 == 0) goto L_0x036b
            boolean r0 = r0.A0F()
            if (r0 != r12) goto L_0x036b
            X.Tol r0 = r1.A01
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.A0F()
            if (r0 != r12) goto L_0x0036
            r1.A00(r12)
            X.HM0 r1 = X.HM0.Paused
            X.5Oz r0 = r5.A02
            r0.Epw(r1)
            goto L_0x0036
        L_0x036b:
            X.Tol r0 = r1.A01
            if (r0 == 0) goto L_0x03a5
            X.4M3 r0 = r0.A06
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r2 = r0.A0M
            X.0qQ.A07(r2)
            X.3OB r0 = X.AnonymousClass3OB.PREPARED
            if (r2 != r0) goto L_0x03a5
        L_0x037c:
            X.Tol r2 = r1.A01
            if (r2 == 0) goto L_0x0390
            boolean r0 = r2.A01
            if (r0 != r12) goto L_0x0390
            java.lang.String r0 = "resume"
            r2.A0C(r0, r10)
            X.HM0 r2 = X.HM0.Play
            X.5Oz r0 = r5.A02
            r0.Epw(r2)
        L_0x0390:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            X.Tol r0 = r1.A01
            if (r0 == 0) goto L_0x0036
            boolean r1 = r2.equals(r2)
            X.TuR r0 = r0.A07
            if (r1 == 0) goto L_0x0456
            r0.A02(r10)
            goto L_0x0036
        L_0x03a5:
            r3 = 0
            X.Tol r0 = r1.A01
            if (r0 == 0) goto L_0x03af
            boolean r0 = r0.A01
            if (r0 != r12) goto L_0x03af
            goto L_0x037c
        L_0x03af:
            X.HM0 r2 = X.HM0.Loading
            X.5Oz r0 = r5.A02
            r0.Epw(r2)
            java.lang.String r2 = r5.A06
            if (r2 == 0) goto L_0x03c0
            com.instagram.common.session.UserSession r0 = r5.A04
            X.1Xj r3 = X.DbV.A0U(r0, r2)
        L_0x03c0:
            X.Hhq r4 = new X.Hhq
            r4.<init>(r5)
            X.Tol r2 = r1.A01
            r5 = 1
            if (r2 == 0) goto L_0x03ea
            boolean r0 = r2.A0F()
            if (r0 != 0) goto L_0x03d4
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x03ea
        L_0x03d4:
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x03dd
            r1.A00(r12)
        L_0x03dd:
            r0 = 2199(0x897, float:3.081E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            X.Tol r0 = r1.A01
            if (r0 == 0) goto L_0x03ea
            r0.A0D(r2, r12)
        L_0x03ea:
            X.Hmc r0 = new X.Hmc
            r0.<init>(r4, r3)
            r1.A00 = r0
            X.Tol r0 = r1.A01
            if (r0 != 0) goto L_0x040c
            android.content.Context r14 = r1.A02
            com.instagram.common.session.UserSession r15 = r1.A03
            X.3ov r2 = r1.A05
            X.4DU r0 = r1.A04
            java.lang.String r18 = r0.getModuleName()
            X.Tol r13 = new X.Tol
            r17 = r1
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r1.A01 = r13
        L_0x040c:
            if (r3 == 0) goto L_0x042c
            X.3WR r4 = r3.A2C()
        L_0x0412:
            X.Hmc r0 = r1.A00
            if (r0 == 0) goto L_0x0390
            X.Tol r2 = r1.A01
            if (r2 == 0) goto L_0x0390
            r3 = 0
            X.4Nf r5 = r0.A01
            r8 = 1065353216(0x3f800000, float:1.0)
            X.4DU r0 = r1.A04
            java.lang.String r7 = r0.getModuleName()
            r9 = -1
            r11 = r10
            r2.A09(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0390
        L_0x042c:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
            X.4im r4 = new X.4im
            r4.<init>(r2, r0)
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.DIRECT_AUDIO
            r4.A04 = r0
            X.IOp r0 = new X.IOp
            r0.<init>(r6)
            r4.A03 = r0
            r4.A0G = r12
            r2 = -1
            r4.A02 = r2
            int r0 = r6.length()
            if (r0 != 0) goto L_0x044f
            r5 = 0
        L_0x044f:
            r4.A0I = r5
            X.3WR r4 = r4.A00()
            goto L_0x0412
        L_0x0456:
            r0.A01(r10)
            goto L_0x0036
        L_0x045b:
            java.lang.Object r2 = r0.A01
            X.5Oz r2 = (X.C284945Oz) r2
            r1 = 0
            X.C51967G9n.A16(r2, r1)
            java.lang.Object r2 = r0.A02
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.String r0 = r0.A03
            goto L_0x04d3
        L_0x046a:
            java.lang.String r2 = r0.A03
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LHU.A01(r0, r1, r2)
            goto L_0x0036
        L_0x0479:
            java.lang.Object r1 = r0.A01
            X.7aK r1 = (X.C333897aK) r1
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x0497
            r1 = 1
            if (r2 == r1) goto L_0x0036
            r1 = 2
            if (r2 != r1) goto L_0x0721
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.String r1 = r0.A03
            X.7aK r0 = X.C333897aK.SHOW_ORIGINAL
        L_0x0492:
            r2.invoke(r1, r0)
            goto L_0x0036
        L_0x0497:
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.String r1 = r0.A03
            X.7aK r0 = X.C333897aK.SHOW_TRANSLATION
            goto L_0x0492
        L_0x04a0:
            java.lang.Object r1 = r0.A02
            X.I09 r1 = (X.I09) r1
            X.SVf r2 = r1.A00
            if (r2 != 0) goto L_0x04b2
            java.lang.String r0 = "framesHandler"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04b2:
            java.lang.String r3 = r0.A03
            java.lang.Object r0 = r0.A01
            X.8HJ r0 = (X.AnonymousClass8HJ) r0
            X.IIm r1 = r1.A03
            X.AnonymousClass7TG.A1T(r3, r0, r1)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = r4
            X.C11443SVf.A01(r0, r1, r2, r3, r4, r5)
            goto L_0x0036
        L_0x04c5:
            java.lang.Object r2 = r0.A02
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r0.A03
            java.lang.Object r0 = r1.invoke(r0)
        L_0x04d3:
            r2.Epw(r0)
            goto L_0x0036
        L_0x04d8:
            java.lang.Object r2 = r0.A02
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A01
            java.lang.Class r0 = (java.lang.Class) r0
            com.google.common.collect.ImmutableList r3 = r2.getOptionalTreeList(r1, r0)
            return r3
        L_0x04e7:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36318140376881054(0x8107280011179e, double:3.031076443528168E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
            X.GLJ r2 = new X.GLJ
            r2.<init>(r5, r4)
            X.2pc r0 = X.C230432pc.CLIPS
            X.5pS r1 = new X.5pS
            r1.<init>(r5, r2, r0)
            X.5pU r0 = X.C296095pT.A00(r5, r3)
            X.GLK r3 = new X.GLK
            r3.<init>(r0, r1)
            return r3
        L_0x0516:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36318140377274275(0x810728001717a3, double:3.031076443776843E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
            X.GLL r2 = new X.GLL
            r2.<init>(r5, r4)
            X.2pc r0 = X.C230432pc.CLIPS
            X.5sx r1 = new X.5sx
            r1.<init>(r5, r2, r0)
            X.5sz r0 = X.C298155sy.A00(r5, r3, r0)
            X.GLM r3 = new X.GLM
            r3.<init>(r0, r1)
            return r3
        L_0x0545:
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r1 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.5pp r2 = A00(r4, r1)
            X.2v9 r1 = X.C233162v9.LONG_DWELL
            X.2pg r0 = X.C230472pg.SPONSORED
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.5pr r0 = X.C296305pq.A00(r4, r3, r1, r0)
            X.IYa r3 = new X.IYa
            r3.<init>(r0, r2)
            return r3
        L_0x0565:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.C51968G9o.A0b(r5)
            r0 = 36319239891917899(0x81082800451c4b, double:3.031771781264861E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
            X.5pp r2 = A00(r5, r4)
            X.2v9 r1 = X.C233162v9.MEDIA_SWIPE_LEFT
            X.2pg r0 = X.C230472pg.SPONSORED
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.5pr r0 = X.C296305pq.A00(r5, r3, r1, r0)
            X.IYb r3 = new X.IYb
            r3.<init>(r0, r2)
            return r3
        L_0x0594:
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r1 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.GKZ r0 = new X.GKZ
            r0.<init>(r4, r1)
            X.2pc r2 = X.C230432pc.CLIPS
            X.5pZ r1 = new X.5pZ
            r1.<init>(r4, r2, r0)
            X.5pa r0 = new X.5pa
            r0.<init>(r2)
            X.5pc r0 = X.C296175pb.A00(r4, r3, r0)
            X.GKa r3 = new X.GKa
            r3.<init>(r0, r1)
            return r3
        L_0x05b9:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316894835249862(0x810606000012c6, double:3.030288757985209E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x05df
            X.0Tu r2 = X.C51968G9o.A0b(r5)
            r0 = 36319239887526940(0x81082800021c1c, double:3.0317717784880005E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
        L_0x05df:
            X.GLH r0 = new X.GLH
            r0.<init>(r5, r4)
            X.2pc r2 = X.C230432pc.CLIPS
            X.5CA r1 = new X.5CA
            r1.<init>(r5, r0, r2)
            X.5CB r0 = new X.5CB
            r0.<init>(r2)
            X.5CD r0 = X.AnonymousClass5CC.A00(r5, r3, r0)
            X.GLI r3 = new X.GLI
            r3.<init>(r0, r1)
            return r3
        L_0x05fa:
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r1 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.GLF r0 = new X.GLF
            r0.<init>(r4, r1)
            X.2pc r2 = X.C230432pc.CLIPS
            X.5C1 r1 = new X.5C1
            r1.<init>(r4, r0, r2)
            X.DbY.A1S(r4, r3)
            X.5C2 r0 = new X.5C2
            r0.<init>(r4, r3, r2)
            X.GLG r3 = new X.GLG
            r3.<init>(r0, r1)
            return r3
        L_0x061e:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318140376422297(0x810728000a1799, double:3.0310764432380485E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0644
            X.0Tu r2 = X.C51968G9o.A0b(r5)
            r0 = 36319239887461403(0x81082800011c1b, double:3.0317717784465547E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
        L_0x0644:
            X.GP8 r0 = new X.GP8
            r0.<init>(r5, r4)
            X.2pc r2 = X.C230432pc.CLIPS
            X.5Br r1 = new X.5Br
            r1.<init>(r5, r0, r2)
            X.5Bs r0 = new X.5Bs
            r0.<init>(r2)
            X.5Bv r0 = X.C282135Bu.A00(r5, r3, r0)
            X.GP9 r3 = new X.GP9
            r3.<init>(r0, r1)
            return r3
        L_0x065f:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.C51968G9o.A0b(r5)
            r0 = 36319239888247845(0x810828000d1c25, double:3.031771778943904E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
            X.5pp r2 = A00(r5, r4)
            X.2v9 r1 = X.C233162v9.COMMENT_BUTTON_CLICK
            X.2pg r0 = X.C230472pg.SPONSORED
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.5pr r0 = X.C296305pq.A00(r5, r3, r1, r0)
            X.IYZ r3 = new X.IYZ
            r3.<init>(r0, r2)
            return r3
        L_0x068e:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.C51968G9o.A0b(r5)
            r0 = 36319239888247845(0x810828000d1c25, double:3.031771778943904E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
            X.5pp r2 = A00(r5, r4)
            X.2v9 r1 = X.C233162v9.CAPTION_CLICK
            X.2pg r0 = X.C230472pg.SPONSORED
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.5pr r0 = X.C296305pq.A00(r5, r3, r1, r0)
            X.IYY r3 = new X.IYY
            r3.<init>(r0, r2)
            return r3
        L_0x06bd:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.C51968G9o.A0b(r5)
            r0 = 36319239888378919(0x810828000f1c27, double:3.0317717790267955E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
            X.5pp r2 = A00(r5, r4)
            X.2v9 r1 = X.C233162v9.SHARE_BUTTON_CLICK
            X.2pg r0 = X.C230472pg.SPONSORED
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.5pr r0 = X.C296305pq.A00(r5, r3, r1, r0)
            X.IYc r3 = new X.IYc
            r3.<init>(r0, r2)
            return r3
        L_0x06ec:
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36325093927826021(0x810d7b00003265, double:3.0354738971454676E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x071b
            X.IYQ r2 = new X.IYQ
            r2.<init>(r5, r4)
            X.2pc r0 = X.C230432pc.CLIPS
            X.Hqc r1 = new X.Hqc
            r1.<init>(r5, r2, r0)
            X.IYT r0 = X.I3v.A00(r5, r3, r0)
            X.IYX r3 = new X.IYX
            r3.<init>(r0, r1)
            return r3
        L_0x071b:
            X.4LP r3 = new X.4LP
            r3.<init>()
            return r3
        L_0x0721:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58719IwS.invoke():java.lang.Object");
    }

    public static LinkedHashMap A01(QDH qdh, C58719IwS iwS) {
        SEB A032 = qdh.A03();
        Throwable th = (Throwable) iwS.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SUU.A0A(A032, linkedHashMap);
        if (th != null) {
            linkedHashMap.put("error_message", 2Og.A00(th));
        }
        return linkedHashMap;
    }
}
