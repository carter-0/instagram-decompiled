package X;

import com.facebook.odin.model.Feature$Companion;
import kotlinx.serialization.Serializable;

@Serializable(with = C20434WrK.class)
public final class ULA extends AnonymousClass0T0 {
    public static final Feature$Companion Companion = new Object();
    public final int A00;
    public final String A01;

    public ULA(String str, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULA) {
                ULA ula = (ULA) obj;
                if (!0qQ.A0K(this.A01, ula.A01) || this.A00 != ula.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }
}
