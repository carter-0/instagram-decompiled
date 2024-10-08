package X;

/* renamed from: X.GaM  reason: case insensitive filesystem */
public final class C52648GaM extends AnonymousClass0T0 implements JNG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C52648GaM(C53451Goj goj, 1Xj r3) {
        this.A00 = 1;
        this.A00 = 1;
        this.A03 = goj;
        this.A01 = r3;
        this.A02 = goj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C52648GaM) || ((C52648GaM) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (A00(0, obj)) {
                    C52648GaM gaM = (C52648GaM) obj;
                    if (0qQ.A0K(this.A03, gaM.A03) && this.A02 == gaM.A02) {
                        obj2 = this.A01;
                        obj3 = gaM.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj)) {
            return false;
        }
        C52648GaM gaM2 = (C52648GaM) obj;
        if (!0qQ.A0K(this.A03, gaM2.A03) || !0qQ.A0K(this.A01, gaM2.A01)) {
            return false;
        }
        obj2 = this.A02;
        obj3 = gaM2.A02;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A02
        L_0x0018:
            int r1 = r0.hashCode()
        L_0x001c:
            int r1 = r1 + r2
            return r1
        L_0x001e:
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x001c
        L_0x0036:
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L_0x0018
            r1 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52648GaM.hashCode():int");
    }

    public C52648GaM(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }
}
