package X;

import java.util.Arrays;

/* renamed from: X.99k  reason: invalid class name and case insensitive filesystem */
public final class C3744299k extends AnonymousClass99T {
    public final C3744199j A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3744299k) || ((C3744299k) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C3744299k.class, this.A00});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public C3744299k(C3744199j r1) {
        this.A00 = r1;
    }
}
