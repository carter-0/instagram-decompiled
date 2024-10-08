package X;

/* renamed from: X.HsK  reason: case insensitive filesystem */
public final class C56071HsK {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56071HsK) {
                C56071HsK hsK = (C56071HsK) obj;
                if (!0qQ.A0K(this.A00, hsK.A00) || !0qQ.A0K(this.A01, hsK.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E;
        int hashCode;
        Object obj = this.A00;
        if (obj instanceof Enum) {
            A0E = ((Enum) obj).ordinal();
        } else {
            A0E = C51971G9r.A0E(obj);
        }
        int i = A0E * 31;
        Object obj2 = this.A01;
        if (obj2 instanceof Enum) {
            hashCode = ((Enum) obj2).ordinal();
        } else {
            hashCode = obj2.hashCode();
        }
        return i + hashCode;
    }

    public C56071HsK(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("JoinedKey(left=");
        A1A.append(this.A00);
        A1A.append(", right=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
