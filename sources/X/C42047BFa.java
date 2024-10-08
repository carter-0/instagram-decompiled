package X;

/* renamed from: X.BFa  reason: case insensitive filesystem */
public final class C42047BFa extends AnonymousClass0T0 implements C46243DRy {
    public final C276014sL A00;
    public final Float A01;
    public final Float A02;

    public final C42047BFa F6N(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42047BFa) {
                C42047BFa bFa = (C42047BFa) obj;
                if (!0qQ.A0K(this.A01, bFa.A01) || !0qQ.A0K(this.A00, bFa.A00) || !0qQ.A0K(this.A02, bFa.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C42047BFa(C276014sL r1, Float f, Float f2) {
        this.A01 = f;
        this.A00 = r1;
        this.A02 = f2;
    }

    public final C46243DRy E7g(1E9 r1) {
        return this;
    }
}
