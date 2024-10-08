package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.796  reason: invalid class name */
public abstract class AnonymousClass796 {
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0163, code lost:
        if (((X.1k3) r13).A08().A05() != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x024f, code lost:
        if (r2.Aqm() != X.2FW.A1p) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r0.A05() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (((X.C65481cr) r13).A08 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b3, code lost:
        if (((X.1fi) r13).A04.A05() == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (X.182.A06(r2, r12, r0) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass797 A00(com.instagram.common.session.UserSession r12, X.1OS r13, com.instagram.model.direct.DirectThreadKey r14) {
        /*
            r0 = 0
            r6 = r12
            X.0qQ.A0B(r12, r0)
            r0 = 1
            r7 = r14
            X.0qQ.A0B(r14, r0)
            r3 = r13
            boolean r0 = r13 instanceof X.1cE
            if (r0 == 0) goto L_0x008d
            X.1cE r3 = (X.1cE) r3
            X.OKm r0 = r3.A02
            if (r0 == 0) goto L_0x0026
            X.3Q2 r0 = r3.A07
            X.0Tu r2 = X.0Tu.A05
            if (r0 == 0) goto L_0x006f
            r0 = 36320906334905284(0x8109ac000323c4, double:3.03282564652031E-306)
        L_0x0020:
            boolean r0 = X.182.A06(r2, r12, r0)
            if (r0 == 0) goto L_0x008d
        L_0x0026:
            java.util.List r1 = r3.A0M
            if (r1 == 0) goto L_0x0034
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0075
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0075
        L_0x0034:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
        L_0x0036:
            boolean r0 = r13 instanceof X.1bp
            if (r0 == 0) goto L_0x004a
            r0 = r13
            X.1bp r0 = (X.1bp) r0
            X.3tI r0 = r0.A03()
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.A05()
            r11 = 1
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            boolean r0 = r13 instanceof X.C65481cr
            if (r0 == 0) goto L_0x0057
            r0 = r13
            X.1cr r0 = (X.C65481cr) r0
            java.lang.String r0 = r0.A08
            r12 = 1
            if (r0 != 0) goto L_0x0058
        L_0x0057:
            r12 = 0
        L_0x0058:
            X.MaY r0 = r13.A02
            boolean r10 = r0.A07
            X.ODs r0 = r0.A00
            if (r0 == 0) goto L_0x006d
            boolean r0 = X.C70054NwW.A00(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L_0x0068:
            X.797 r0 = A02(r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006d:
            r8 = 0
            goto L_0x0068
        L_0x006f:
            r0 = 2342165418789251229(0x20810b0a0023289d, double:4.067628995911394E-152)
            goto L_0x0020
        L_0x0075:
            java.util.Iterator r2 = r1.iterator()
        L_0x0079:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r2.next()
            X.9IY r0 = (X.AnonymousClass9IY) r0
            int r1 = r0.A03
            r0 = 5
            if (r1 == r0) goto L_0x008d
            r0 = 6
            if (r1 != r0) goto L_0x0079
        L_0x008d:
            boolean r0 = r13 instanceof X.AnonymousClass1g2
            if (r0 == 0) goto L_0x0094
            java.lang.Integer r9 = X.AnonymousClass05K.A0E
            goto L_0x0036
        L_0x0094:
            boolean r0 = r13 instanceof X.C65711gJ
            if (r0 == 0) goto L_0x009b
            java.lang.Integer r9 = X.AnonymousClass05K.A0F
            goto L_0x0036
        L_0x009b:
            boolean r0 = r13 instanceof X.C66311lu
            if (r0 == 0) goto L_0x00a2
            java.lang.Integer r9 = X.AnonymousClass05K.A0G
            goto L_0x0036
        L_0x00a2:
            boolean r0 = r13 instanceof X.AnonymousClass1cj
            if (r0 != 0) goto L_0x027d
            boolean r0 = r13 instanceof X.1fi
            if (r0 == 0) goto L_0x00b9
            r0 = r13
            X.1fi r0 = (X.1fi) r0
            X.5yB r0 = r0.A04
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0165
        L_0x00b5:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            goto L_0x0036
        L_0x00b9:
            boolean r0 = r13 instanceof X.1jN
            if (r0 != 0) goto L_0x0279
            boolean r0 = r13 instanceof X.1kF
            if (r0 != 0) goto L_0x0279
            boolean r0 = r13 instanceof X.1dd
            if (r0 != 0) goto L_0x0275
            boolean r0 = r13 instanceof X.1di
            if (r0 != 0) goto L_0x0275
            boolean r0 = r13 instanceof X.C65621em
            if (r0 != 0) goto L_0x0271
            boolean r0 = r13 instanceof X.C65561e1
            if (r0 != 0) goto L_0x0271
            boolean r0 = r13 instanceof X.AnonymousClass1eE
            if (r0 != 0) goto L_0x026d
            boolean r0 = r13 instanceof X.1du
            if (r0 != 0) goto L_0x026d
            boolean r0 = r13 instanceof X.C65481cr
            if (r0 != 0) goto L_0x026d
            boolean r0 = r13 instanceof X.1dI
            if (r0 != 0) goto L_0x0269
            boolean r0 = r13 instanceof X.1dq
            if (r0 != 0) goto L_0x0265
            boolean r0 = r13 instanceof X.AnonymousClass1dS
            if (r0 != 0) goto L_0x0265
            boolean r0 = r13 instanceof X.1cX
            if (r0 != 0) goto L_0x0261
            boolean r0 = r13 instanceof X.C65691fy
            if (r0 != 0) goto L_0x025d
            boolean r0 = r13 instanceof X.C66151k7
            if (r0 != 0) goto L_0x025d
            boolean r0 = r13 instanceof X.C65611ei
            if (r0 != 0) goto L_0x0259
            boolean r0 = r13 instanceof X.AnonymousClass1fu
            if (r0 == 0) goto L_0x010c
            r0 = r13
            X.1fu r0 = (X.AnonymousClass1fu) r0
            X.7Qt r0 = r0.A01
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01b5
            java.lang.Integer r9 = X.AnonymousClass05K.A03
            goto L_0x0036
        L_0x010c:
            boolean r0 = r13 instanceof X.AnonymousClass1dM
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r9 = X.AnonymousClass05K.A05
            goto L_0x0036
        L_0x0114:
            boolean r0 = r13 instanceof X.1fV
            if (r0 != 0) goto L_0x0255
            boolean r0 = r13 instanceof X.AnonymousClass1kB
            if (r0 != 0) goto L_0x0255
            boolean r0 = r13 instanceof X.1jn
            if (r0 != 0) goto L_0x0034
            boolean r0 = r13 instanceof X.C66141jr
            if (r0 != 0) goto L_0x0034
            boolean r0 = r13 instanceof X.1jv
            if (r0 != 0) goto L_0x0034
            boolean r0 = r13 instanceof X.AnonymousClass1jz
            if (r0 != 0) goto L_0x0034
            boolean r0 = r13 instanceof X.AnonymousClass1er
            if (r0 != 0) goto L_0x0034
            boolean r0 = r13 instanceof X.C65641fB
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.C65521dX
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.AnonymousClass1ez
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.C66221kr
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.AnonymousClass1f3
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.C65631f7
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.C65581eX
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.C65601ee
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.C65571eI
            if (r0 != 0) goto L_0x0251
            boolean r0 = r13 instanceof X.1k3
            if (r0 == 0) goto L_0x0169
            r0 = r13
            X.1k3 r0 = (X.1k3) r0
            X.5yB r0 = r0.A08()
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00b5
        L_0x0165:
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            goto L_0x0036
        L_0x0169:
            boolean r0 = r13 instanceof X.C65701gB
            if (r0 == 0) goto L_0x0281
            r2 = r13
            X.1gB r2 = (X.C65701gB) r2
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1g
            if (r1 == r0) goto L_0x0034
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A16
            if (r1 == r0) goto L_0x027d
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A17
            if (r1 == r0) goto L_0x0261
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1s
            if (r1 == r0) goto L_0x0261
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1E
            if (r1 == r0) goto L_0x0261
            X.2FW r0 = r2.Aqm()
            X.2FW r1 = X.2FW.A1A
            if (r0 != r1) goto L_0x01a7
            boolean r0 = A05(r12, r2)
            if (r0 == 0) goto L_0x01a7
            goto L_0x0165
        L_0x01a7:
            X.2FW r0 = r2.Aqm()
            if (r0 != r1) goto L_0x01b9
            boolean r0 = A05(r12, r2)
            if (r0 != 0) goto L_0x01b9
            goto L_0x00b5
        L_0x01b5:
            java.lang.Integer r9 = X.AnonymousClass05K.A04
            goto L_0x0036
        L_0x01b9:
            X.2FW r0 = r2.Aqm()
            X.2FW r4 = X.2FW.A0y
            if (r0 != r4) goto L_0x01e7
            X.2Dm r5 = X.2L2.A00(r12)
            com.instagram.direct.model.DirectForwardingParams r0 = r2.A03()
            java.lang.String r3 = r0.A07
            r0 = 0
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>(r3, r0)
            com.instagram.direct.model.DirectForwardingParams r0 = r2.A03()
            java.lang.String r0 = r0.A06
            X.3su r0 = r5.BRz(r1, r0)
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r0.A1a()
            if (r0 == 0) goto L_0x01e7
            java.lang.Integer r9 = X.AnonymousClass05K.A0A
            goto L_0x0036
        L_0x01e7:
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A0K
            if (r1 == r0) goto L_0x0255
            X.2FW r0 = r2.Aqm()
            if (r0 != r4) goto L_0x01f9
            java.lang.Integer r9 = X.AnonymousClass05K.A07
            goto L_0x0036
        L_0x01f9:
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1v
            if (r1 == r0) goto L_0x0265
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1w
            if (r1 == r0) goto L_0x0259
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A20
            if (r1 == r0) goto L_0x0269
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1S
            if (r1 == r0) goto L_0x026d
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1a
            if (r1 == r0) goto L_0x0251
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1o
            if (r1 == r0) goto L_0x0251
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1z
            if (r1 == r0) goto L_0x0251
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1Y
            if (r1 == r0) goto L_0x0251
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1Z
            if (r1 == r0) goto L_0x0251
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1u
            if (r1 == r0) goto L_0x0251
            X.2FW r1 = r2.Aqm()
            X.2FW r0 = X.2FW.A1p
            if (r1 != r0) goto L_0x0281
        L_0x0251:
            java.lang.Integer r9 = X.AnonymousClass05K.A08
            goto L_0x0036
        L_0x0255:
            java.lang.Integer r9 = X.AnonymousClass05K.A06
            goto L_0x0036
        L_0x0259:
            java.lang.Integer r9 = X.AnonymousClass05K.A02
            goto L_0x0036
        L_0x025d:
            java.lang.Integer r9 = X.AnonymousClass05K.A1F
            goto L_0x0036
        L_0x0261:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            goto L_0x0036
        L_0x0265:
            java.lang.Integer r9 = X.AnonymousClass05K.A1I
            goto L_0x0036
        L_0x0269:
            java.lang.Integer r9 = X.AnonymousClass05K.A0u
            goto L_0x0036
        L_0x026d:
            java.lang.Integer r9 = X.AnonymousClass05K.A15
            goto L_0x0036
        L_0x0271:
            java.lang.Integer r9 = X.AnonymousClass05K.A0B
            goto L_0x0036
        L_0x0275:
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            goto L_0x0036
        L_0x0279:
            java.lang.Integer r9 = X.AnonymousClass05K.A09
            goto L_0x0036
        L_0x027d:
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            goto L_0x0036
        L_0x0281:
            X.797 r0 = X.AnonymousClass797.OPEN_ONLY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass796.A00(com.instagram.common.session.UserSession, X.1OS, com.instagram.model.direct.DirectThreadKey):X.797");
    }

    public static final AnonymousClass797 A01(UserSession userSession, 1bp r2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        List C6L = r2.C6L();
        0qQ.A07(C6L);
        DirectThreadKey directThreadKey = (DirectThreadKey) 00k.A0J(C6L);
        if (directThreadKey == null) {
            return AnonymousClass797.OPEN_ONLY;
        }
        return A00(userSession, r2, directThreadKey);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e9, code lost:
        if (((java.util.Set) r5.A01.getValue()).contains(r1) != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0200, code lost:
        if ((r1.A04.A01 & 42) == 42) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0256, code lost:
        if (X.182.A06(r2, r6, r0) != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0265, code lost:
        if (r0 != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0104, code lost:
        if (X.182.A06(r3, r6, 36320906334905284L) == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        r0 = X.182.A06(r2, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass797 A02(com.instagram.common.session.UserSession r6, com.instagram.model.direct.DirectThreadKey r7, java.lang.Boolean r8, java.lang.Integer r9, boolean r10, boolean r11, boolean r12) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r5 = 1
            X.0qQ.A0B(r7, r5)
            X.2Dm r0 = X.2L2.A00(r6)
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r4 = X.2Dr.A03(r0, r7)
            X.7Pk r3 = X.C331057Pi.A00(r6)
            if (r10 == 0) goto L_0x0109
            com.instagram.common.session.UserSession r2 = r3.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342161901208738417(0x208107d700001a71, double:4.064646386024511E-152)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0106
            if (r4 == 0) goto L_0x0106
            int r1 = r4.Btc()
            r0 = 4
            if (r1 != r0) goto L_0x0106
            r0 = 36318892001991357(0x8107d7006a1abd, double:3.031551774274475E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r9 == r0) goto L_0x0267
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r9 != r0) goto L_0x004e
            r0 = 36318891999107742(0x8107d7003e1a9e, double:3.0315517724508655E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x004e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r9 != r0) goto L_0x005d
            r0 = 36318891996093051(0x8107d700101a7b, double:3.031551770544363E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x005d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r9 != r0) goto L_0x006c
            r0 = 2342165852578916877(0x20810b6f00042a0d, double:4.067996812750519E-152)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x006c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r9 == r0) goto L_0x0074
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r9 != r0) goto L_0x007f
        L_0x0074:
            r0 = 2342165852578654729(0x20810b6f00002a09, double:4.0679968125282395E-152)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x007f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r9 != r0) goto L_0x008e
            r0 = 36318891996617340(0x8107d700181a7c, double:3.031551770875925E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x008e:
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            if (r9 != r0) goto L_0x009d
            r0 = 2342165852578785803(0x20810b6f00022a0b, double:4.067996812639379E-152)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x009d:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            if (r9 != r0) goto L_0x00ac
            r0 = 2342165852579179025(0x20810b6f00082a11, double:4.067996812972798E-152)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x00ac:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            if (r9 != r0) goto L_0x00bb
            r0 = 2342165852578851340(0x20810b6f00032a0c, double:4.067996812694949E-152)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x00bb:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r9 != r0) goto L_0x00ca
            r0 = 36318891998321300(0x8107d700321a94, double:3.0315517719535164E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x00ca:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r9 != r0) goto L_0x00d9
            r0 = 36318891999173279(0x8107d7003f1a9f, double:3.0315517724923114E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x00d9:
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            if (r9 != r0) goto L_0x00e8
            r0 = 36318891999107742(0x8107d7003e1a9e, double:3.0315517724508655E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x00e8:
            java.lang.Integer r2 = X.AnonymousClass05K.A0B
            if (r9 != r2) goto L_0x00f7
            r0 = 2342165852579310099(0x20810b6f000a2a13, double:4.067996813083938E-152)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x00f7:
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            if (r9 != r0) goto L_0x025a
            r0 = 36320906334905284(0x8109ac000323c4, double:3.03282564652031E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0267
        L_0x0106:
            X.797 r0 = X.AnonymousClass797.OPEN_ONLY
            return r0
        L_0x0109:
            if (r8 == 0) goto L_0x013b
            boolean r0 = r8.booleanValue()
        L_0x010f:
            if (r0 == 0) goto L_0x0175
            r0 = 0
            if (r4 == 0) goto L_0x0118
            X.3Tu r0 = r4.AiM()
        L_0x0118:
            boolean r0 = X.C308556Us.A0I(r6, r0)
            if (r0 != 0) goto L_0x0106
            if (r4 == 0) goto L_0x0106
            X.3Tu r0 = r4.AiM()
            if (r0 == 0) goto L_0x0106
            X.3Tv r0 = r0.A04
            int r1 = r0.A01
            r0 = r1 & 64
            if (r0 > 0) goto L_0x0132
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 <= 0) goto L_0x0106
        L_0x0132:
            int r0 = r9.intValue()
            switch(r0) {
                case 1: goto L_0x0150;
                case 2: goto L_0x0139;
                case 3: goto L_0x0140;
                case 4: goto L_0x0140;
                case 5: goto L_0x0139;
                case 6: goto L_0x0139;
                case 7: goto L_0x0139;
                case 8: goto L_0x0158;
                case 9: goto L_0x0139;
                case 10: goto L_0x0139;
                case 11: goto L_0x0148;
                case 12: goto L_0x0148;
                case 13: goto L_0x0139;
                case 14: goto L_0x0150;
                case 15: goto L_0x0139;
                case 16: goto L_0x0139;
                case 17: goto L_0x0160;
                case 18: goto L_0x0168;
                default: goto L_0x0139;
            }
        L_0x0139:
            goto L_0x0267
        L_0x013b:
            boolean r0 = X.C308556Us.A0M(r6, r4)
            goto L_0x010f
        L_0x0140:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163529001411087(0x208109520001220f, double:4.0660266161291575E-152)
            goto L_0x016f
        L_0x0148:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320519787848209(0x81095200032211, double:3.032581192604916E-306)
            goto L_0x016f
        L_0x0150:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163529001738771(0x2081095200062213, double:4.066026616407006E-152)
            goto L_0x016f
        L_0x0158:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163529001345550(0x208109520000220e, double:4.066026616073588E-152)
            goto L_0x016f
        L_0x0160:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320906334774211(0x8109ac000123c3, double:3.032825646437419E-306)
            goto L_0x016f
        L_0x0168:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323792552734222(0x810c4c00002e0e, double:3.034650902297197E-306)
        L_0x016f:
            boolean r0 = X.182.A06(r2, r6, r0)
            goto L_0x0265
        L_0x0175:
            int r0 = r9.intValue()
            switch(r0) {
                case 0: goto L_0x0203;
                case 1: goto L_0x021b;
                case 2: goto L_0x0223;
                case 3: goto L_0x020b;
                case 4: goto L_0x0213;
                case 5: goto L_0x017c;
                case 6: goto L_0x017c;
                case 7: goto L_0x017c;
                case 8: goto L_0x022b;
                case 9: goto L_0x017c;
                case 10: goto L_0x017c;
                case 11: goto L_0x023b;
                case 12: goto L_0x023b;
                case 13: goto L_0x017c;
                case 14: goto L_0x0233;
                case 15: goto L_0x017c;
                case 16: goto L_0x017c;
                case 17: goto L_0x024b;
                case 18: goto L_0x0243;
                default: goto L_0x017c;
            }
        L_0x017c:
            com.instagram.common.session.UserSession r2 = r3.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 2342161901208738417(0x208107d700001a71, double:4.064646386024511E-152)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 != 0) goto L_0x01b0
            if (r4 == 0) goto L_0x01a7
            X.3Tu r0 = r4.AiM()
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r0.A01()
            if (r0 != r5) goto L_0x01a7
            X.0wj r2 = X.0wj.A01
            r1 = 817904752(0x30c03c70, float:1.3987016E-9)
            java.lang.String r0 = "TLC is enabled but MC is disabled"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.report()
        L_0x01a7:
            boolean r0 = r3.A00(r4, r9, r11, r12)
            if (r0 == 0) goto L_0x0106
            X.797 r0 = X.AnonymousClass797.ARMADILLO_EXPRESS_OPEN_EB
            return r0
        L_0x01b0:
            if (r4 == 0) goto L_0x01a7
            boolean r0 = r4.CUG()
            if (r0 != r5) goto L_0x01ec
            java.lang.Long r0 = r4.C6I()
            r7 = 0
            if (r0 == 0) goto L_0x01a7
            long r1 = r0.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a7
            X.7Ep r5 = r3.A01
            com.instagram.common.session.UserSession r2 = r5.A00
            r0 = 36323564919467271(0x810c1700002d07, double:3.0345069461025716E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r1 = r4.C6k()
            if (r1 == 0) goto L_0x01ec
            X.0eM r0 = r5.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01ec
            goto L_0x0267
        L_0x01ec:
            X.3Tu r1 = r4.AiM()
            if (r1 == 0) goto L_0x01a7
            boolean r0 = X.C331057Pi.A02(r1)
            if (r0 != 0) goto L_0x0267
            X.3Tv r0 = r1.A04
            int r0 = r0.A01
            r1 = 42
            r0 = r0 & 42
            if (r0 != r1) goto L_0x01a7
            goto L_0x0267
        L_0x0203:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418787154065(0x20810b0a00032891, double:4.067628994133177E-152)
            goto L_0x0252
        L_0x020b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418788464788(0x20810b0a00172894, double:4.067628995244559E-152)
            goto L_0x0252
        L_0x0213:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418788530325(0x20810b0a00182895, double:4.0676289953001286E-152)
            goto L_0x0252
        L_0x021b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418787219602(0x20810b0a00042892, double:4.067628994188747E-152)
            goto L_0x0252
        L_0x0223:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418787350675(0x20810b0a00062893, double:4.067628994299885E-152)
            goto L_0x0252
        L_0x022b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418788595862(0x20810b0a00192896, double:4.067628995355698E-152)
            goto L_0x0252
        L_0x0233:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418788661399(0x20810b0a001a2897, double:4.067628995411268E-152)
            goto L_0x0252
        L_0x023b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418788989082(0x20810b0a001f289a, double:4.067628995689116E-152)
            goto L_0x0252
        L_0x0243:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342165418788858009(0x20810b0a001d2899, double:4.067628995577977E-152)
            goto L_0x0252
        L_0x024b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320906334774211(0x8109ac000123c3, double:3.032825646437419E-306)
        L_0x0252:
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x017c
            goto L_0x0106
        L_0x025a:
            if (r9 != r2) goto L_0x0106
            r0 = 36322843366205980(0x810b6f00132a1c, double:3.0340506329146694E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
        L_0x0265:
            if (r0 == 0) goto L_0x0106
        L_0x0267:
            X.797 r0 = X.AnonymousClass797.ARMADILLO_EXPRESS_ONLY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass796.A02(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Integer, boolean, boolean, boolean):X.797");
    }

    public static final AnonymousClass797 A03(UserSession userSession, DirectThreadKey directThreadKey, Integer num) {
        return A02(userSession, directThreadKey, (Boolean) null, num, false, false, false);
    }

    public static final AnonymousClass797 A04(UserSession userSession, DirectThreadKey directThreadKey, Integer num, boolean z) {
        boolean z2;
        Boolean bool;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        DirectThreadKey directThreadKey2 = directThreadKey;
        0qQ.A0B(directThreadKey, 1);
        Integer num2 = num;
        0qQ.A0B(num, 2);
        AnonymousClass3U9 A03 = 2Dr.A03(2L2.A00(userSession), directThreadKey);
        if (A03 != null) {
            z2 = A03.CVE();
            C70621ODs B25 = A03.B25();
            if (B25 != null) {
                bool = Boolean.valueOf(C70054NwW.A00(B25));
            }
            bool = null;
        } else {
            z2 = false;
            bool = null;
        }
        return A02(userSession2, directThreadKey2, bool, num2, z2, z, false);
    }

    public static final boolean A06(UserSession userSession, 1bp r2, DirectThreadKey directThreadKey) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(directThreadKey, 1);
        0qQ.A0B(r2, 2);
        if (!A00(userSession, r2, directThreadKey).A00()) {
            return false;
        }
        if (r2 instanceof C65481cr) {
            C65481cr r22 = (C65481cr) r2;
            if (r22.A0D == null && r22.A0F == null) {
                return true;
            }
            return false;
        } else if (!(r2 instanceof C65421cY) || ((C65421cY) r2).ACS() != null) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean A07(UserSession userSession, DirectThreadKey directThreadKey, Integer num) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        Integer num2 = num;
        0qQ.A0B(num, 2);
        DirectThreadKey directThreadKey2 = directThreadKey;
        if (directThreadKey == null || A02(userSession2, directThreadKey2, (Boolean) null, num2, false, false, false) == AnonymousClass797.OPEN_ONLY) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession, C65701gB r4) {
        C254703su BRz = 2L2.A00(userSession).BRz(new DirectThreadKey(r4.A03().A07, (List) null), r4.A03().A06);
        if (BRz == null || BRz.A0W() != 1iA.A0a) {
            return false;
        }
        return true;
    }
}
