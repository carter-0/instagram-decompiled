package X;

/* renamed from: X.N5o  reason: case insensitive filesystem */
public final class C68199N5o extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final int A01;
    public final N4t A02;

    public C68199N5o(N4t n4t, int i, int i2) {
        0qQ.A0B(n4t, 1);
        this.A02 = n4t;
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68199N5o) {
                C68199N5o n5o = (C68199N5o) obj;
                if (!(0qQ.A0K(this.A02, n5o.A02) && this.A00 == n5o.A00 && this.A01 == n5o.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A0B;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + this.A00) * 31) + this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C68199N5o n5o = (C68199N5o) obj;
        0qQ.A0B(n5o, 0);
        return 0qQ.A0K(this.A02, n5o.A02);
    }
}
