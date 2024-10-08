package X;

/* renamed from: X.5ZY  reason: invalid class name */
public final class AnonymousClass5ZY {
    public final boolean A00;

    public final boolean equals(Object obj) {
        boolean z = this.A00;
        if (!(obj instanceof AnonymousClass5ZY) || z != ((AnonymousClass5ZY) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return 002.A0L("AppTheme(isDark=", ')', this.A00);
    }

    public /* synthetic */ AnonymousClass5ZY(boolean z) {
        this.A00 = z;
    }
}
