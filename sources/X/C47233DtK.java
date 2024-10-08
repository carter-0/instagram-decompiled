package X;

/* renamed from: X.DtK  reason: case insensitive filesystem */
public final class C47233DtK extends AnonymousClass0T0 implements C232262tL {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47233DtK) && this.A00 == ((C47233DtK) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47233DtK dtK = (C47233DtK) obj;
        if (dtK == null || dtK.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public C47233DtK(int i) {
        this.A00 = i;
    }
}
