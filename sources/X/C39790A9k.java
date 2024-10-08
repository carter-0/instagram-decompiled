package X;

/* renamed from: X.A9k  reason: case insensitive filesystem */
public final class C39790A9k {
    public AnonymousClass6GO A00 = null;
    public C286025Tq A01;
    public boolean A02 = false;
    public final C286025Tq A03;

    public C39790A9k(C286025Tq r3, C286025Tq r4) {
        this.A03 = r3;
        this.A01 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39790A9k) {
                C39790A9k a9k = (C39790A9k) obj;
                if (!0qQ.A0K(this.A03, a9k.A03) || !0qQ.A0K(this.A01, a9k.A01) || this.A02 != a9k.A02 || !0qQ.A0K(this.A00, a9k.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03))) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextSubstitutionValue(original=");
        A1A.append(this.A03);
        A1A.append(", substitution=");
        A1A.append(this.A01);
        A1A.append(", isShowingSubstitution=");
        A1A.append(this.A02);
        A1A.append(", layoutCache=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
