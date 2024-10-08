package X;

/* renamed from: X.JvR  reason: case insensitive filesystem */
public final class C61027JvR extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61027JvR) {
                C61027JvR jvR = (C61027JvR) obj;
                if (!(this.A03 == jvR.A03 && this.A02 == jvR.A02 && this.A01 == jvR.A01 && this.A00 == jvR.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A01(C60262JiJ jiJ) {
        return ((C61027JvR) jiJ.A0D.getValue()).A03;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A03))) + this.A00;
    }

    public C61027JvR(boolean z, boolean z2, boolean z3, int i) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A00 = i;
    }

    public static void A00(05G r3, boolean z, boolean z2) {
        r3.Epw(new C61027JvR(z, ((C61027JvR) r3.getValue()).A02, z2, ((C61027JvR) r3.getValue()).A00));
    }
}
