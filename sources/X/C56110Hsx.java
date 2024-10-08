package X;

/* renamed from: X.Hsx  reason: case insensitive filesystem */
public final class C56110Hsx {
    public final HNN A00;
    public final C56094Hsh A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56110Hsx) {
                C56110Hsx hsx = (C56110Hsx) obj;
                if (this.A00 != hsx.A00 || !0qQ.A0K(this.A02, hsx.A02) || !0qQ.A0K(this.A01, hsx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public C56110Hsx(HNN hnn, C56094Hsh hsh, String str) {
        this.A00 = hnn;
        this.A02 = str;
        this.A01 = hsh;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NuxSectionData(iconName=");
        A1A.append(this.A00);
        A1A.append(", title=");
        A1A.append(this.A02);
        A1A.append(", body=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
