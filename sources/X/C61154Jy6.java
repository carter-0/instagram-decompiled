package X;

/* renamed from: X.Jy6  reason: case insensitive filesystem */
public final class C61154Jy6 extends AnonymousClass0T0 implements C232262tL {
    public final String A00;

    public C61154Jy6(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61154Jy6) && 0qQ.A0K(this.A00, ((C61154Jy6) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
