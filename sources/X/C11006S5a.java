package X;

/* renamed from: X.S5a  reason: case insensitive filesystem */
public final class C11006S5a {
    public final QXR A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11006S5a) {
                C11006S5a s5a = (C11006S5a) obj;
                if (!0qQ.A0K(this.A01, s5a.A01) || !0qQ.A0K(this.A00, s5a.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }

    public C11006S5a(QXR qxr, String str) {
        this.A01 = str;
        this.A00 = qxr;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FBPayFullNameComponent(payerName=");
        A1A.append(this.A01);
        A1A.append(", fullNameFieldConfig=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
