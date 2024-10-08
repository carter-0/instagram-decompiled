package X;

/* renamed from: X.4sL  reason: invalid class name and case insensitive filesystem */
public final class C276014sL extends AnonymousClass0T0 implements C276024sM {
    public final 1Xj A00;
    public final Integer A01;

    public C276014sL(1Xj r2, Integer num) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = num;
    }

    public final C276014sL F1W(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C276014sL) {
                C276014sL r5 = (C276014sL) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Integer num = this.A01;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final 1Xj BPf() {
        return this.A00;
    }

    public final Integer CAf() {
        return this.A01;
    }

    public final C276024sM E7A(1E9 r1) {
        return this;
    }
}
