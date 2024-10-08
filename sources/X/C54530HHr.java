package X;

/* renamed from: X.HHr  reason: case insensitive filesystem */
public final class C54530HHr extends HQ1 {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C54530HHr) && this.A00 == ((C54530HHr) obj).A00);
    }

    public final String toString() {
        return 002.A0L("SuggestionVisible(isMemu=", ')', this.A00);
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C54530HHr(boolean z) {
        this.A00 = z;
    }
}
