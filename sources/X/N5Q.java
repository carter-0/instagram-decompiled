package X;

public final class N5Q extends AnonymousClass0T0 implements C232262tL {
    public final String A00;

    public N5Q(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N5Q) && 0qQ.A0K(this.A00, ((N5Q) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        N5Q n5q = (N5Q) obj;
        String str2 = this.A00;
        if (n5q != null) {
            str = n5q.A00;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }
}
