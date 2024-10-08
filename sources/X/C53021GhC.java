package X;

import java.util.List;

/* renamed from: X.GhC  reason: case insensitive filesystem */
public final class C53021GhC extends 2YL {
    public final 05G A00 = DbS.A10(new C61054Jvs((List) 0sn.A00, 8));
    public final C61770pa A01;
    public final C55516Hiy A02;
    public final String A03;
    public final 0V2 A04;

    public C53021GhC(C55516Hiy hiy, String str) {
        0qQ.A0B(str, 2);
        this.A02 = hiy;
        this.A03 = str;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A04 = A012;
        this.A01 = new 0V1((C262204Co) null, A012);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C53021GhC r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 44
            boolean r0 = X.C66139MDr.A01(r3, r7)
            if (r0 == 0) goto L_0x00cc
            r4 = r7
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cc
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r3) goto L_0x005b
            if (r0 != r5) goto L_0x00d3
            X.0eS.A00(r1)
        L_0x0027:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x002a:
            X.0eS.A00(r1)
            X.Hiy r0 = r6.A02
            java.lang.String r1 = r6.A03
            r4.A01 = r6
            r4.A00 = r3
            X.Hix r0 = r0.A00
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 3551(0xddf, float:4.976E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.0mp.A06(r0, r1)
            r0 = 1204(0x4b4, float:1.687E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1OC r1 = X.FGQ.A02(r3, r1, r0)
            r0 = 558575316(0x214b2ed4, float:6.884105E-19)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x005b:
            java.lang.Object r6 = r4.A01
            X.GhC r6 = (X.C53021GhC) r6
            X.0eS.A00(r1)
        L_0x0062:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x00b9
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.7ax r0 = (X.C334247ax) r0
            java.util.List r0 = r0.getItems()
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x007b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008e
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            X.Jvs r0 = new X.Jvs
            r0.<init>((com.instagram.user.model.User) r1)
            r5.add(r0)
            goto L_0x007b
        L_0x008e:
            X.05G r4 = r6.A00
            r1 = 43
            X.ImL r0 = new X.ImL
            r0.<init>(r6, r3, r1)
            X.0Ub r3 = new X.0Ub
            r3.<init>(r0, r4)
            X.6oS r2 = X.C318116oQ.A00(r6)
            X.109 r1 = X.AnonymousClass10A.A01
            java.lang.Object r0 = r4.getValue()
            X.05F r0 = X.10b.A02(r0, r2, r3, r1)
            r0.getValue()
            r1 = 8
            X.Jvs r0 = new X.Jvs
            r0.<init>((java.util.List) r5, (int) r1)
            r4.Epw(r0)
            goto L_0x0027
        L_0x00b9:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0027
            X.0V2 r1 = r6.A04
            X.Hz4 r0 = X.C56472Hz4.A00
            r4.A01 = r3
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x00cc:
            X.MDr r4 = new X.MDr
            r4.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x00d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53021GhC.A00(X.GhC, X.4D7):java.lang.Object");
    }
}
