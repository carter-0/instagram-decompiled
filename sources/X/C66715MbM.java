package X;

import com.instagram.api.schemas.RingSpec;

/* renamed from: X.MbM  reason: case insensitive filesystem */
public final class C66715MbM extends C69598Nog {
    public final RingSpec A00;
    public final boolean A01;

    public C66715MbM(RingSpec ringSpec, boolean z) {
        0qQ.A0B(ringSpec, 1);
        this.A00 = ringSpec;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66715MbM) {
                C66715MbM mbM = (C66715MbM) obj;
                if (!0qQ.A0K(this.A00, mbM.A00) || this.A01 != mbM.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Normal(ringSpec=");
        A1A.append(this.A00);
        A1A.append(", isActivated=");
        return G9t.A1C(A1A, this.A01);
    }
}
