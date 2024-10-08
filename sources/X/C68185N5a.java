package X;

/* renamed from: X.N5a  reason: case insensitive filesystem */
public final class C68185N5a extends AnonymousClass0T0 implements C232262tL {
    public boolean A00;
    public final C317966o8 A01;

    public C68185N5a(C317966o8 r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68185N5a) && 0qQ.A0K(this.A01, ((C68185N5a) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A01.A0S;
        0qQ.A07(str);
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
