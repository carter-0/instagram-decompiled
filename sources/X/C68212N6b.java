package X;

/* renamed from: X.N6b  reason: case insensitive filesystem */
public final class C68212N6b extends AnonymousClass0T0 implements C232262tL, C328627Fn, AnonymousClass7FW {
    public final C328667Fr A00;
    public final AnonymousClass741 A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68212N6b) && 0qQ.A0K(this.A01, ((C68212N6b) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final C328607Fl ApX() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A02;
    }

    public C68212N6b(AnonymousClass741 r2) {
        this.A01 = r2;
        this.A00 = r2.A01;
        this.A02 = r2.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LayeredXmaMessageViewModel(model=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
