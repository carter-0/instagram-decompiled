package X;

import java.util.Arrays;

/* renamed from: X.99i  reason: invalid class name and case insensitive filesystem */
public final class C3744099i extends AnonymousClass99T {
    public final C3743999h A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3744099i) || ((C3744099i) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C3744099i.class, this.A00});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public C3744099i(C3743999h r1) {
        this.A00 = r1;
    }
}
