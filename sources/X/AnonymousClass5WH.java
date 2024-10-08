package X;

/* renamed from: X.5WH  reason: invalid class name */
public abstract class AnonymousClass5WH {
    public static final C268054cg A03(C267804cE r1) {
        String str;
        if (!((C267794cD) r1).A03.A08) {
            str = "Cannot get LayoutCoordinates, Modifier.Node is not attached.";
        } else {
            C268054cg A04 = A04(r1, 2);
            if (A04.COx()) {
                return A04;
            }
            str = "LayoutCoordinates is not attached.";
        }
        I2E.A01(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C268054cg A04(C267804cE r2, int i) {
        C268054cg r1 = ((C267794cD) r2).A03.A05;
        0qQ.A0A(r1);
        if (r1.A0X() != r2) {
            return r1;
        }
        0vu r0 = AnonymousClass5WB.A00;
        if ((i & 128) == 0) {
            return r1;
        }
        C268054cg r12 = r1.A06;
        0qQ.A0A(r12);
        return r12;
    }

    public static final C267794cD A00(C285045Pl r1) {
        int i;
        if (r1 == null || (i = r1.A00) == 0) {
            return null;
        }
        return (C267794cD) r1.A00(i - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r2 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if ((r2 instanceof X.C268434dO) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if ((r2 instanceof X.C267944cV) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if ((r2.A01 & 2) == 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r2 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if ((r2 instanceof X.C267944cV) != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r2 = ((X.C267944cV) r2).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C268434dO A01(X.C267794cD r2) {
        /*
            int r0 = r2.A01
            r1 = r0 & 2
            r0 = 0
            if (r1 == 0) goto L_0x0008
            r0 = 1
        L_0x0008:
            r1 = 0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r2 instanceof X.C268434dO
            if (r0 != 0) goto L_0x002b
            boolean r0 = r2 instanceof X.C267944cV
            if (r0 == 0) goto L_0x002e
        L_0x0013:
            X.4cV r2 = (X.C267944cV) r2
            X.4cD r2 = r2.A00
        L_0x0017:
            if (r2 == 0) goto L_0x002e
            boolean r0 = r2 instanceof X.C268434dO
            if (r0 != 0) goto L_0x002b
            boolean r0 = r2 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0028
            int r0 = r2.A01
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0028
            goto L_0x0013
        L_0x0028:
            X.4cD r2 = r2.A02
            goto L_0x0017
        L_0x002b:
            X.4dO r2 = (X.C268434dO) r2
            return r2
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WH.A01(X.4cD):X.4dO");
    }

    public static final AnonymousClass5R6 A02(C267804cE r0) {
        C268054cg r02 = ((C267794cD) r0).A03.A05;
        if (r02 != null) {
            return r02.A0H;
        }
        I2E.A02("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C268124co A05(C267804cE r0) {
        C268124co r02 = A02(r0).A0A;
        if (r02 != null) {
            return r02;
        }
        I2E.A02("This node does not have an owner.");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(C285045Pl r3, C267794cD r4) {
        C285045Pl A0A = A02(r4).A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = A0A.A02;
            do {
                r3.A09(((AnonymousClass5R6) objArr[i2]).A0W.A02);
                i2--;
            } while (i2 >= 0);
        }
    }
}
