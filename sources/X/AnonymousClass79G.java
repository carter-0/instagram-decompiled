package X;

import java.util.Arrays;

/* renamed from: X.79G  reason: invalid class name */
public final class AnonymousClass79G extends AnonymousClass79H implements AnonymousClass7FW {
    public final boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof AnonymousClass79G) && super.equals(obj) && 0qQ.A0K(this.A0A, ((AnonymousClass79H) obj).A0A));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A07, this.A0C, this.A0A, this.A0G, this.A0D, Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0K), this.A06, this.A01, this.A0E});
    }
}
