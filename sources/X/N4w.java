package X;

import java.util.Arrays;

public final class N4w extends AnonymousClass0T0 implements C74376Ptr {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N4w) && 0qQ.A0K(this.A00, ((N4w) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final byte[] CDO() {
        return this.A00;
    }

    public final String CDP() {
        return new String(this.A00, AnonymousClass15Q.A05);
    }

    public final String toString() {
        return G9w.A0k("ByteArray(value=", Arrays.toString(this.A00));
    }

    public N4w(byte[] bArr) {
        this.A00 = bArr;
    }
}
