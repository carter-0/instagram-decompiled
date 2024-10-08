package X;

/* renamed from: X.N6a  reason: case insensitive filesystem */
public final class C68211N6a extends AnonymousClass0T0 implements C232262tL, C328627Fn, AnonymousClass7FW {
    public final C328667Fr A00;
    public final String A01;
    public final C328607Fl A02;

    public C68211N6a(C328607Fl r2, C328667Fr r3, String str) {
        0qQ.A0B(r3, 2);
        this.A01 = str;
        this.A00 = r3;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68211N6a) {
                C68211N6a n6a = (C68211N6a) obj;
                if (!0qQ.A0K(this.A01, n6a.A01) || !0qQ.A0K(this.A00, n6a.A00) || !0qQ.A0K(this.A02, n6a.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C328607Fl ApX() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GenericCollapsibleXmaMessageViewModel(id=");
        C66583MXo.A1S(A1A, this.A01);
        C66583MXo.A1Q(A1A, this.A00);
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
