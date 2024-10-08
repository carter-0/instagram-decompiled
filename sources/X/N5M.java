package X;

public final class N5M extends AnonymousClass0T0 implements C232262tL {
    public final String A00;

    public N5M(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N5M) && 0qQ.A0K(this.A00, ((N5M) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        N5M n5m = (N5M) obj;
        0qQ.A0B(n5m, 0);
        return 0qQ.A0K(this.A00, n5m.A00);
    }
}
