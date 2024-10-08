package X;

public final class N5V extends AnonymousClass0T0 implements C232262tL {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N5V) && 0qQ.A0K(this.A00, ((N5V) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        N5V n5v = (N5V) obj;
        String str2 = this.A00;
        if (n5v != null) {
            str = n5v.A00;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }

    public N5V(String str) {
        this.A00 = str;
    }
}
