package X;

import java.util.Arrays;

/* renamed from: X.98L  reason: invalid class name */
public final class AnonymousClass98L extends AnonymousClass983 {
    public final AnonymousClass98E A00;

    public final String toString() {
        String str;
        C384459hM r0 = this.A00.A00;
        String str2 = r0.typeUrl_;
        int ordinal = r0.A0F().ordinal();
        if (ordinal == 1) {
            str = "TINK";
        } else if (ordinal == 2) {
            str = "LEGACY";
        } else if (ordinal == 3) {
            str = "RAW";
        } else if (ordinal != 4) {
            str = "UNKNOWN";
        } else {
            str = "CRUNCHY";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[]{str2, str});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass98L)) {
            return false;
        }
        AnonymousClass98E r2 = ((AnonymousClass98L) obj).A00;
        C384459hM r3 = this.A00.A00;
        AnonymousClass98D A0F = r3.A0F();
        C384459hM r22 = r2.A00;
        if (!A0F.equals(r22.A0F()) || !r3.typeUrl_.equals(r22.typeUrl_) || !r3.value_.equals(r22.value_)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass98E r0 = this.A00;
        return Arrays.hashCode(new Object[]{r0.A00, r0.A01});
    }

    public AnonymousClass98L(AnonymousClass98E r1) {
        this.A00 = r1;
    }
}
