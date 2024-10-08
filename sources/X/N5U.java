package X;

public final class N5U extends AnonymousClass0T0 implements C232262tL {
    public final AnonymousClass77I A00;

    public N5U(AnonymousClass77I r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N5U) && 0qQ.A0K(this.A00, ((N5U) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00.hashCode());
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
