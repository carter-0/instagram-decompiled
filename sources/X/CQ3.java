package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CQ3 extends 17P implements C241293Oq {
    public C270824hM A00;
    public User A01;
    public List A02;
    public List A03;

    public final C241273Oo Aux() {
        return (C241273Oo) A05(-1183438890, CO6.class);
    }

    public final List BQO() {
        return this.A02;
    }

    public final C270824hM Bf3() {
        C270824hM r0 = this.A00;
        if (r0 == null) {
            return (C270824hM) A05(700235949, CMc.class);
        }
        return r0;
    }

    public final List BxQ() {
        return this.A03;
    }

    public final User CCd() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'user' field.");
    }

    public final C241293Oq E9F(1E9 r4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ImmutableList A08 = A08(-3896982, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        C270824hM Bf3 = Bf3();
        if (Bf3 != null) {
            Bf3.E7o(r4);
        } else {
            Bf3 = null;
        }
        this.A00 = Bf3;
        ImmutableList A082 = A08(378965114, ImmutablePandoUserDict.class);
        if (A082 != null) {
            arrayList2 = AnonymousClass7TG.A0r(A082);
            Iterator it2 = A082.iterator();
            while (it2.hasNext()) {
                C41847B3o.A1P(r4, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A03 = arrayList2;
        this.A01 = C41846B3n.A0c(r4, this, 3599307);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ3, X.3Oq] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44481Cfd.A00(this));
    }

    public final String Aeo() {
        return A0i(-168253766);
    }

    public final String AlL() {
        return A0i(552573414);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ3] */
    public final Boolean B6t() {
        return getOptionalBooleanValueByHashCode(1601672934);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ3] */
    public final Boolean BCB() {
        return getOptionalBooleanValueByHashCode(-1011195986);
    }

    public final String BE9() {
        return C41847B3o.A1D(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ3] */
    public final List BKX() {
        return getOptionalStringListByHashCode(2040312680);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ3] */
    public final Integer BPt() {
        return getOptionalIntValueByHashCode(-9393932);
    }

    public final List BQJ() {
        return A0n(2140775389);
    }

    public final Float Bpp() {
        return A0K(109264530);
    }

    public final String BxN() {
        return A0h(-823445795);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ3] */
    public final List C76() {
        return getOptionalStringListByHashCode(760022103);
    }

    public final String CDC() {
        return A0j(3601339);
    }

    public final Float CDL() {
        return A0K(111972721);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ3] */
    public final Boolean CYE() {
        return getOptionalBooleanValueByHashCode(91445688);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C241283Op FC4(X.1E9 r27) {
        /*
            r26 = this;
            r1 = 225490031(0xd70b46f, float:7.41729E-31)
            r0 = r26
            java.lang.String r15 = r0.A0h(r1)
            r1 = -168253766(0xfffffffff5f8a6ba, float:-6.3040588E32)
            java.lang.String r16 = r0.A0i(r1)
            r1 = 552573414(0x20ef99e6, float:4.0590016E-19)
            java.lang.String r17 = r0.A0i(r1)
            X.3Oo r1 = r0.Aux()
            if (r1 == 0) goto L_0x006e
            X.3On r7 = r1.F8o()
        L_0x0021:
            r1 = 1601672934(0x5f7796e6, float:1.78407E19)
            java.lang.Boolean r9 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1011195986(0xffffffffc3ba5fae, float:-372.7475)
            java.lang.Boolean r10 = r0.getOptionalBooleanValueByHashCode(r1)
            java.lang.String r18 = X.C41847B3o.A1D(r0)
            r1 = 91445688(0x57359b8, float:1.1442284E-35)
            java.lang.Boolean r11 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 2040312680(0x799cb368, float:1.0170464E35)
            com.google.common.collect.ImmutableList r21 = r0.getOptionalStringListByHashCode(r1)
            r1 = -9393932(0xffffffffff70a8f4, float:-3.1989197E38)
            java.lang.Integer r14 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 2140775389(0x7f99a3dd, float:NaN)
            java.util.List r22 = r0.A0n(r1)
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r2 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r1 = -3896982(0xffffffffffc4896a, float:NaN)
            com.google.common.collect.ImmutableList r2 = r0.A08(r1, r2)
            r1 = r27
            if (r2 == 0) goto L_0x0084
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x0064:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0070
            X.C41847B3o.A1O(r1, r3, r4)
            goto L_0x0064
        L_0x006e:
            r7 = 0
            goto L_0x0021
        L_0x0070:
            if (r3 == 0) goto L_0x0084
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x007a:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0085
            X.C41848B3p.A1V(r1, r4, r3)
            goto L_0x007a
        L_0x0084:
            r4 = 0
        L_0x0085:
            X.4hM r2 = r0.Bf3()
            if (r2 == 0) goto L_0x00ba
            X.4hL r6 = r2.F6z(r1)
        L_0x008f:
            r2 = 109264530(0x6833e92, float:4.936866E-35)
            java.lang.Float r12 = r0.A0K(r2)
            r2 = -823445795(0xffffffffceeb36dd, float:-1.97312064E9)
            java.lang.String r19 = r0.A0h(r2)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            r2 = 378965114(0x16968c7a, float:2.432246E-25)
            com.google.common.collect.ImmutableList r3 = r0.A08(r2, r3)
            if (r3 == 0) goto L_0x00d0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x00b0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00bc
            X.C41847B3o.A1P(r1, r2, r3)
            goto L_0x00b0
        L_0x00ba:
            r6 = 0
            goto L_0x008f
        L_0x00bc:
            if (r2 == 0) goto L_0x00d0
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x00c6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00d1
            X.C41847B3o.A1Q(r1, r3, r2)
            goto L_0x00c6
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            r2 = 760022103(0x2d4d0457, float:1.16538645E-11)
            com.google.common.collect.ImmutableList r25 = r0.getOptionalStringListByHashCode(r2)
            r2 = 3599307(0x36ebcb, float:5.043703E-39)
            X.17K r8 = X.C41847B3o.A0r(r1, r0, r2)
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            r1 = 3601339(0x36f3bb, float:5.046551E-39)
            java.lang.String r20 = r0.A0j(r1)
            r1 = 111972721(0x6ac9171, float:6.4912916E-35)
            java.lang.Float r13 = r0.A0K(r1)
            X.3Op r5 = new X.3Op
            r23 = r4
            r24 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQ3.FC4(X.1E9):X.3Op");
    }

    public final String getAlgorithm() {
        return A0h(225490031);
    }
}
