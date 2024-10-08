package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.GeQ  reason: case insensitive filesystem */
public final class C52890GeQ extends C56880IGb {
    public final WindowInsets A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52890GeQ)) {
            return false;
        }
        return 0qQ.A0K(((C52890GeQ) obj).A00, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C52890GeQ(WindowInsets windowInsets) {
        this.A00 = windowInsets;
    }
}
