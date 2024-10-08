package X;

/* renamed from: X.F3f  reason: case insensitive filesystem */
public final class C49719F3f {
    public final String A00;
    public final 0sL A01;
    public final 0sK A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49719F3f) {
                C49719F3f f3f = (C49719F3f) obj;
                if (!0qQ.A0K(this.A00, f3f.A00) || !0qQ.A0K(this.A01, f3f.A01) || !0qQ.A0K(this.A02, f3f.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public C49719F3f(String str, 0sL r2, 0sK r3) {
        this.A00 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ScreenDefinition(name=");
        A1A.append(this.A00);
        A1A.append(", dataSource=");
        A1A.append(this.A01);
        A1A.append(C66579MXk.A00(187));
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
