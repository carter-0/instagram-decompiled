package X;

import java.util.Arrays;

public final class KKA extends C317456nI {
    public final C62476KgR A00;
    public final 0sK A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (obj instanceof KKA) {
            if (obj == this) {
                return true;
            }
            C317876nz r0 = this.A00;
            if (r0 != null) {
                String str = r0.A0Z;
                KKA kka = (KKA) obj;
                C317876nz r02 = kka.A00;
                if (r02 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (0qQ.A0K(str, r02.A0Z) && this.A00 == kka.A00 && this.A03 == kka.A03 && this.A02 == kka.A02) {
                    return true;
                } else {
                    return false;
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        C317876nz r0 = this.A00;
        if (r0 != null) {
            str = r0.A0Z;
        } else {
            str = null;
        }
        return Arrays.hashCode(new Object[]{str, this.A00, Boolean.valueOf(this.A03), Boolean.valueOf(this.A02)});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KKA(C62476KgR kgR, C317876nz r2, 0sK r3, boolean z, boolean z2) {
        super(r2);
        AnonymousClass7TG.A1P(r2, r3);
        this.A00 = kgR;
        this.A01 = r3;
        this.A03 = z;
        this.A02 = z2;
    }
}
