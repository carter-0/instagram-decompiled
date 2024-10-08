package X;

/* renamed from: X.Qni  reason: case insensitive filesystem */
public final class C8302Qni extends RLp {
    public final RE0 A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RLp)) {
                return false;
            }
            C8302Qni qni = (C8302Qni) ((RLp) obj);
            if (!this.A01.equals(qni.A01) || !this.A00.equals(qni.A00)) {
                return false;
            }
        }
        return true;
    }

    public C8302Qni(RE0 re0, Object obj) {
        if (obj != null) {
            this.A01 = obj;
            this.A00 = re0;
            return;
        }
        throw AnonymousClass7TE.A11("Null payload");
    }

    public final int hashCode() {
        return ((-721379959 ^ this.A01.hashCode()) * 1000003) ^ this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Event{code=");
        A1A.append((Object) null);
        A1A.append(", payload=");
        A1A.append(this.A01);
        A1A.append(", priority=");
        return C66582MXn.A0v(this.A00, A1A);
    }
}
