package X;

import java.io.File;

/* renamed from: X.Vij  reason: case insensitive filesystem */
public final class C17952Vij {
    public final File A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C17952Vij)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C17952Vij) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C17952Vij(File file) {
        this.A00 = file;
    }
}
