package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CRi extends 17P implements AnonymousClass3UK {
    public C266554Zl A00;
    public C270824hM A01;
    public C270844hO A02;
    public User A03;
    public List A04;
    public List A05;

    public final C241273Oo Aux() {
        return (C241273Oo) A05(-1183438890, CO6.class);
    }

    public final List BQO() {
        return this.A04;
    }

    public final C270824hM Bf3() {
        C270824hM r0 = this.A01;
        if (r0 == null) {
            return (C270824hM) A05(700235949, CMc.class);
        }
        return r0;
    }

    public final List BxQ() {
        return this.A05;
    }

    public final C266554Zl CCD() {
        C266554Zl r0 = this.A00;
        if (r0 == null) {
            return (C266554Zl) A05(1395735988, CKN.class);
        }
        return r0;
    }

    public final User CCd() {
        return this.A03;
    }

    public final C270844hO CCz() {
        C270844hO r0 = this.A02;
        if (r0 == null) {
            return (C270844hO) A05(1934820225, C44026CRj.class);
        }
        return r0;
    }

    public final AnonymousClass3UK E9x(1E9 r5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ImmutableList A08 = A08(-3896982, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r5, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A04 = arrayList;
        C270824hM Bf3 = Bf3();
        C270844hO r3 = null;
        if (Bf3 != null) {
            Bf3.E7o(r5);
        } else {
            Bf3 = null;
        }
        this.A01 = Bf3;
        ImmutableList A082 = A08(378965114, ImmutablePandoUserDict.class);
        if (A082 != null) {
            arrayList2 = AnonymousClass7TG.A0r(A082);
            Iterator it2 = A082.iterator();
            while (it2.hasNext()) {
                C41847B3o.A1P(r5, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A05 = arrayList2;
        C266554Zl CCD = CCD();
        if (CCD != null) {
            CCD.E7S(r5);
        } else {
            CCD = null;
        }
        this.A00 = CCD;
        this.A03 = C41847B3o.A0y(r5, this);
        C270844hO CCz = CCz();
        if (CCz != null) {
            CCz.E9y(r5);
            r3 = CCz;
        }
        this.A02 = r3;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRi, X.3UK] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44888Cme.A00(this));
    }

    public final String Aeo() {
        return A0i(-168253766);
    }

    public final String AlL() {
        return A0i(552573414);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRi] */
    public final Boolean B6t() {
        return getOptionalBooleanValueByHashCode(1601672934);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRi] */
    public final Boolean BCB() {
        return getOptionalBooleanValueByHashCode(-1011195986);
    }

    public final String BE9() {
        return C41847B3o.A1D(this);
    }

    public final String BIN() {
        return A0i(-304132134);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRi] */
    public final List BKX() {
        return getOptionalStringListByHashCode(2040312680);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRi] */
    public final Integer BPt() {
        return getOptionalIntValueByHashCode(-9393932);
    }

    public final List BQJ() {
        return A0n(2140775389);
    }

    public final String Bkl() {
        return A0j(-598090789);
    }

    public final Float Bpp() {
        return A0K(109264530);
    }

    public final String BxN() {
        return A0i(-823445795);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRi] */
    public final List C76() {
        return getOptionalStringListByHashCode(760022103);
    }

    public final String CDC() {
        return A0j(3601339);
    }

    public final Float CDL() {
        return A0K(111972721);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRi] */
    public final Boolean CYE() {
        return getOptionalBooleanValueByHashCode(91445688);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3UJ FEu(X.1E9 r31) {
        /*
            r30 = this;
            r1 = 225490031(0xd70b46f, float:7.41729E-31)
            r0 = r30
            java.lang.String r17 = r0.A0i(r1)
            r1 = -168253766(0xfffffffff5f8a6ba, float:-6.3040588E32)
            java.lang.String r18 = r0.A0i(r1)
            r1 = 552573414(0x20ef99e6, float:4.0590016E-19)
            java.lang.String r19 = r0.A0i(r1)
            X.3Oo r1 = r0.Aux()
            if (r1 == 0) goto L_0x0075
            X.3On r8 = r1.F8o()
        L_0x0021:
            r1 = 1601672934(0x5f7796e6, float:1.78407E19)
            java.lang.Boolean r11 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1011195986(0xffffffffc3ba5fae, float:-372.7475)
            java.lang.Boolean r12 = r0.getOptionalBooleanValueByHashCode(r1)
            java.lang.String r20 = X.C41847B3o.A1D(r0)
            r1 = -304132134(0xffffffffeddf4fda, float:-8.6389615E27)
            java.lang.String r21 = r0.A0i(r1)
            r1 = 91445688(0x57359b8, float:1.1442284E-35)
            java.lang.Boolean r13 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 2040312680(0x799cb368, float:1.0170464E35)
            com.google.common.collect.ImmutableList r25 = r0.getOptionalStringListByHashCode(r1)
            r1 = -9393932(0xffffffffff70a8f4, float:-3.1989197E38)
            java.lang.Integer r16 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 2140775389(0x7f99a3dd, float:NaN)
            java.util.List r26 = r0.A0n(r1)
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r2 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r1 = -3896982(0xffffffffffc4896a, float:NaN)
            com.google.common.collect.ImmutableList r3 = r0.A08(r1, r2)
            r1 = r31
            if (r3 == 0) goto L_0x008b
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x006b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0077
            X.C41847B3o.A1O(r1, r2, r3)
            goto L_0x006b
        L_0x0075:
            r8 = 0
            goto L_0x0021
        L_0x0077:
            if (r2 == 0) goto L_0x008b
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0081:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x008c
            X.C41848B3p.A1V(r1, r4, r2)
            goto L_0x0081
        L_0x008b:
            r4 = 0
        L_0x008c:
            X.4hM r2 = r0.Bf3()
            if (r2 == 0) goto L_0x00c8
            X.4hL r7 = r2.F6z(r1)
        L_0x0096:
            r2 = -598090789(0xffffffffdc59dbdb, float:-2.45287214E17)
            java.lang.String r22 = r0.A0j(r2)
            r2 = 109264530(0x6833e92, float:4.936866E-35)
            java.lang.Float r14 = r0.A0K(r2)
            r2 = -823445795(0xffffffffceeb36dd, float:-1.97312064E9)
            java.lang.String r23 = r0.A0i(r2)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            r2 = 378965114(0x16968c7a, float:2.432246E-25)
            com.google.common.collect.ImmutableList r3 = r0.A08(r2, r3)
            if (r3 == 0) goto L_0x00de
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x00be:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ca
            X.C41847B3o.A1P(r1, r2, r3)
            goto L_0x00be
        L_0x00c8:
            r7 = 0
            goto L_0x0096
        L_0x00ca:
            if (r2 == 0) goto L_0x00de
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x00d4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00df
            X.C41847B3o.A1Q(r1, r3, r2)
            goto L_0x00d4
        L_0x00de:
            r3 = 0
        L_0x00df:
            r2 = 760022103(0x2d4d0457, float:1.16538645E-11)
            com.google.common.collect.ImmutableList r29 = r0.getOptionalStringListByHashCode(r2)
            X.4Zl r2 = r0.CCD()
            if (r2 == 0) goto L_0x0126
            X.4Zk r6 = r2.F3P(r1)
        L_0x00f0:
            com.instagram.user.model.ImmutablePandoUserDict r2 = X.C41846B3n.A0Z(r0)
            if (r2 == 0) goto L_0x0124
            com.instagram.user.model.User r2 = X.C41845B3m.A0b(r1, r2)
            if (r2 == 0) goto L_0x0124
            com.instagram.user.model.User r10 = X.C41846B3n.A0b(r1, r2)
        L_0x0100:
            X.4hO r2 = r0.CCz()
            if (r2 == 0) goto L_0x0122
            X.4hN r9 = r2.FEv(r1)
        L_0x010a:
            r1 = 3601339(0x36f3bb, float:5.046551E-39)
            java.lang.String r24 = r0.A0j(r1)
            r1 = 111972721(0x6ac9171, float:6.4912916E-35)
            java.lang.Float r15 = r0.A0K(r1)
            X.3UJ r5 = new X.3UJ
            r27 = r4
            r28 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r5
        L_0x0122:
            r9 = 0
            goto L_0x010a
        L_0x0124:
            r10 = 0
            goto L_0x0100
        L_0x0126:
            r6 = 0
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CRi.FEu(X.1E9):X.3UJ");
    }

    public final String getAlgorithm() {
        return A0i(225490031);
    }
}
