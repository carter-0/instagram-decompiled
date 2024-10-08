package X;

/* renamed from: X.N7w  reason: case insensitive filesystem */
public final class C68259N7w extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final NYR A00;
    public final C3266877t A01;
    public final C328667Fr A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68259N7w) {
                C68259N7w n7w = (C68259N7w) obj;
                if (!0qQ.A0K(this.A03, n7w.A03) || !0qQ.A0K(this.A00, n7w.A00) || !0qQ.A0K(this.A02, n7w.A02) || !0qQ.A0K(this.A01, n7w.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqu() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C328617Fm Ar3() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW BmF() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0C(this.A02)) * 31);
    }

    public C68259N7w(NYR nyr, C3266877t r2, C328667Fr r3, String str) {
        C51974G9v.A1L(str, nyr, r2);
        this.A03 = str;
        this.A00 = nyr;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AnimatedStickerReplyToNotesXmaViewModel(id=");
        C66583MXo.A1T(A1A, this.A03);
        C66583MXo.A1R(A1A, this.A00);
        C66583MXo.A1P(A1A, this.A02);
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
