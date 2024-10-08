package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Jvx  reason: case insensitive filesystem */
public final class C61059Jvx extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61059Jvx(C59721JVf jVf, N3V n3v, List list, Map map) {
        this(jVf, (C61084JwM) null, n3v, (Integer) null, list, map);
        this.A00 = 0;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61059Jvx) || ((C61059Jvx) obj).A00 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0124, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
        if (X.0qQ.A0K(r2.A05, r3.A05) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0130, code lost:
        r1 = r2.A06;
        r0 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0170, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0172, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017a, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x004d;
                case 2: goto L_0x007c;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00f3;
                case 5: goto L_0x0135;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x017e
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x017c
            X.Jvx r3 = (X.C61059Jvx) r3
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A06
            java.lang.Object r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x0176
        L_0x004d:
            if (r2 == r3) goto L_0x017e
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x017c
            X.Jvx r3 = (X.C61059Jvx) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x0120
        L_0x007c:
            if (r2 == r3) goto L_0x017e
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x017c
            X.Jvx r3 = (X.C61059Jvx) r3
            java.lang.Object r1 = r2.A06
            java.lang.Object r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L_0x017c
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x0176
        L_0x00bb:
            if (r2 == r3) goto L_0x017e
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x017c
            X.Jvx r3 = (X.C61059Jvx) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A06
            java.lang.Object r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x016c
        L_0x00f3:
            if (r2 == r3) goto L_0x017e
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x017c
            X.Jvx r3 = (X.C61059Jvx) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x0120:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A06
            java.lang.Object r0 = r3.A06
            goto L_0x0176
        L_0x0135:
            if (r2 == r3) goto L_0x017e
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x017c
            X.Jvx r3 = (X.C61059Jvx) r3
            java.lang.Object r1 = r2.A06
            java.lang.Object r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
        L_0x016c:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x0176:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x017e
        L_0x017c:
            r0 = 0
            return r0
        L_0x017e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61059Jvx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = (AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A06, AnonymousClass7TE.A0K(this.A05)))) + AnonymousClass7TG.A0C(this.A01)) * 31;
                i2 = AnonymousClass7TE.A0L(this.A03);
                break;
            case 1:
                i = ((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
                i2 = AnonymousClass7TE.A0L(this.A06);
                break;
            case 2:
                i = (((AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A06))) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
                i2 = AnonymousClass7TE.A0L(this.A04);
                break;
            case 3:
                return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0K(this.A01))))));
            case 4:
                i = (((AnonymousClass7TF.A07(this.A04, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
                i2 = AnonymousClass7TE.A0L(this.A06);
                break;
            case 5:
                i = (((((AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A06)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
                i2 = AnonymousClass7TE.A0L(this.A02);
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridViewModel(items=");
        A1A.append(this.A05);
        A1A.append(", videoSizeMap=");
        A1A.append(this.A06);
        A1A.append(C66579MXk.A00(189));
        A1A.append(this.A04);
        A1A.append(", floatingLayoutConfig=");
        A1A.append(this.A02);
        A1A.append(", floatingGridViewModel=");
        A1A.append(this.A01);
        A1A.append(", gridBackgroundColor=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }

    public C61059Jvx(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
    }

    public C61059Jvx(C266444Yx r4, C266444Yx r5, C266444Yx r6, C266444Yx r7, C266444Yx r8, EVK evk, int i) {
        this.A00 = 2;
        r6 = (i & 8) != 0 ? null : r6;
        r7 = (i & 16) != 0 ? null : r7;
        r8 = (i & 32) != 0 ? null : r8;
        this.A00 = 2;
        this.A06 = r4;
        this.A03 = r5;
        this.A02 = evk;
        this.A05 = r6;
        this.A01 = r7;
        this.A04 = r8;
    }

    public C61059Jvx(C64185LSs lSs, C64185LSs lSs2, C64185LSs lSs3, C64185LSs lSs4, 0sn r7, List list, int i) {
        this.A00 = 6;
        r7 = (i & 2) != 0 ? 0sn.A00 : r7;
        lSs3 = (i & 8) != 0 ? new KY2(AnonymousClass7TE.A0u()) : lSs3;
        lSs4 = (i & 32) != 0 ? null : lSs4;
        this.A00 = 6;
        C51972G9s.A1C(r7, lSs3);
        this.A06 = lSs;
        this.A03 = r7;
        this.A04 = lSs2;
        this.A05 = lSs3;
        this.A02 = list;
        this.A01 = lSs4;
    }

    public C61059Jvx(UO6 uo6, UO6 uo62, UO6 uo63, UO9 uo9, UO7 uo7, UO8 uo8) {
        this.A00 = 4;
        this.A01 = uo9;
        this.A03 = uo7;
        this.A04 = uo8;
        this.A02 = uo6;
        this.A05 = uo62;
        this.A06 = uo63;
    }

    public C61059Jvx(C59721JVf jVf, C61084JwM jwM, N3V n3v, Integer num, List list, Map map) {
        this.A00 = 0;
        AnonymousClass7TG.A1O(list, map);
        this.A05 = list;
        this.A06 = map;
        this.A04 = jVf;
        this.A02 = n3v;
        this.A01 = jwM;
        this.A03 = num;
    }

    public C61059Jvx(C61083JwL jwL, C61083JwL jwL2, C61083JwL jwL3, C61083JwL jwL4, Integer num, List list) {
        this.A00 = 5;
        AnonymousClass7TG.A1O(jwL, list);
        this.A06 = jwL;
        this.A01 = list;
        this.A03 = num;
        this.A04 = jwL2;
        this.A05 = jwL3;
        this.A02 = jwL4;
    }
}
