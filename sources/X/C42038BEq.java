package X;

/* renamed from: X.BEq  reason: case insensitive filesystem */
public final class C42038BEq extends AnonymousClass0T0 implements DRA {
    public final String A00;

    public C42038BEq(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42038BEq) && 0qQ.A0K(this.A00, ((C42038BEq) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
