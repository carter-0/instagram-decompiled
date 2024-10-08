package X;

/* renamed from: X.Jy7  reason: case insensitive filesystem */
public final class C61155Jy7 extends AnonymousClass0T0 implements C232262tL {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61155Jy7) && this.A00 == ((C61155Jy7) obj).A00);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61155Jy7 jy7 = (C61155Jy7) obj;
        if (jy7 == null || this.A00 != jy7.A00) {
            return false;
        }
        return true;
    }

    public C61155Jy7(boolean z) {
        this.A00 = z;
    }
}
