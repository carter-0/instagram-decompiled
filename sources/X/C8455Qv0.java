package X;

import java.io.Serializable;

/* renamed from: X.Qv0  reason: case insensitive filesystem */
public final class C8455Qv0 extends C13098TLf implements Serializable {
    public final C13098TLf A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8455Qv0) {
            return this.A00.equals(((C8455Qv0) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return -this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString().concat(".reverse()");
    }

    public C8455Qv0(C13098TLf tLf) {
        this.A00 = tLf;
    }
}
