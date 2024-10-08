package X;

/* renamed from: X.CIh  reason: case insensitive filesystem */
public final class C43908CIh extends 17P implements DU5 {
    public YCC A00;
    public DV1 A01;
    public DS4 A02;
    public 1Xj A03;

    public final YCC AZ7() {
        YCC ycc = this.A00;
        if (ycc == null) {
            return (YCC) A05(-1366492984, CHo.class);
        }
        return ycc;
    }

    public final DS4 Ag5() {
        DS4 ds4 = this.A02;
        if (ds4 == null) {
            return (DS4) A05(958158610, CNx.class);
        }
        return ds4;
    }

    public final 1Xj BPf() {
        return this.A03;
    }

    public final DV1 BVn() {
        DV1 dv1 = this.A01;
        if (dv1 == null) {
            return (DV1) A05(-1601227723, CMY.class);
        }
        return dv1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIh] */
    public final Integer CAf() {
        return getOptionalIntValueByHashCode(3575610);
    }

    public final DU5 E7B(1E9 r3) {
        YCC AZ7 = AZ7();
        DV1 dv1 = null;
        if (AZ7 != null) {
            AZ7.E71(r3);
        } else {
            AZ7 = null;
        }
        this.A00 = AZ7;
        DS4 Ag5 = Ag5();
        if (Ag5 != null) {
            Ag5.E87(r3);
        } else {
            Ag5 = null;
        }
        this.A02 = Ag5;
        this.A03 = C41847B3o.A0u(r3, this, 103772132);
        DV1 BVn = BVn();
        if (BVn != null) {
            BVn.E7l(r3);
            dv1 = BVn;
        }
        this.A01 = dv1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, X.CIh, X.17P] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BE8 F1X(X.1E9 r8) {
        /*
            r7 = this;
            X.YCC r0 = r7.AZ7()
            r3 = 0
            if (r0 == 0) goto L_0x0049
            X.XET r2 = r0.F0D(r8)
        L_0x000b:
            X.DS4 r0 = r7.Ag5()
            if (r0 == 0) goto L_0x0047
            X.BGB r4 = r0.F8d(r8)
        L_0x0015:
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r1 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r0 = 103772132(0x62f6fe4, float:3.2996046E-35)
            com.facebook.pando.TreeJNI r1 = r7.A05(r0, r1)
            com.instagram.feed.media.ImmutablePandoMediaDict r1 = (com.instagram.feed.media.ImmutablePandoMediaDict) r1
            if (r1 == 0) goto L_0x0045
            X.1Xv r0 = X.1Xj.A0h
            X.1Xj r0 = X.1Xv.A00(r8, r1)
            if (r0 == 0) goto L_0x0045
            X.1Xj r5 = X.C41846B3n.A0Y(r8, r0)
        L_0x002e:
            X.DV1 r0 = r7.BVn()
            if (r0 == 0) goto L_0x0038
            X.BFg r3 = r0.F6m(r8)
        L_0x0038:
            r0 = 3575610(0x368f3a, float:5.010497E-39)
            java.lang.Integer r6 = r7.getOptionalIntValueByHashCode(r0)
            X.BE8 r1 = new X.BE8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0045:
            r5 = r3
            goto L_0x002e
        L_0x0047:
            r4 = r3
            goto L_0x0015
        L_0x0049:
            r2 = r3
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43908CIh.F1X(X.1E9):X.BE8");
    }
}
