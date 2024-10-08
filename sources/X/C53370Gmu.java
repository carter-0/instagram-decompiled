package X;

/* renamed from: X.Gmu  reason: case insensitive filesystem */
public final class C53370Gmu extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final int A02 = 1;
    public final Object A03;

    public C53370Gmu(HLF hlf, float f, float f2) {
        this.A03 = hlf;
        this.A00 = f;
        this.A01 = f2;
    }

    public final boolean equals(Object obj) {
        if (this.A02 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53370Gmu)) {
                return false;
            }
            C53370Gmu gmu = (C53370Gmu) obj;
            if (gmu.A02 == 1 && this.A03 == gmu.A03 && Float.compare(this.A00, gmu.A00) == 0 && Float.compare(this.A01, gmu.A01) == 0) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53370Gmu)) {
                return false;
            }
            C53370Gmu gmu2 = (C53370Gmu) obj;
            if (gmu2.A02 == 0 && Float.compare(this.A00, gmu2.A00) == 0 && Float.compare(this.A01, gmu2.A01) == 0 && 0qQ.A0K(this.A03, gmu2.A03)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A002;
        int A0C;
        if (this.A02 != 0) {
            A002 = AnonymousClass7TF.A00(AnonymousClass7TE.A0K(this.A03), this.A00);
            A0C = Float.floatToIntBits(this.A01);
        } else {
            A002 = AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01);
            A0C = AnonymousClass7TG.A0C(this.A03);
        }
        return A002 + A0C;
    }

    public final String toString() {
        if (1 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProfileTapInfo(profileType=");
        A1A.append(this.A03);
        A1A.append(", xDown=");
        A1A.append(this.A00);
        A1A.append(", yDown=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }

    public C53370Gmu(Boolean bool, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A03 = bool;
    }
}
