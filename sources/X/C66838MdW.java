package X;

/* renamed from: X.MdW  reason: case insensitive filesystem */
public final class C66838MdW extends AnonymousClass7FV implements AnonymousClass7FW {
    public final int A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final AnonymousClass7FT A03;
    public final AnonymousClass7FE A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66838MdW) {
                C66838MdW mdW = (C66838MdW) obj;
                if (!0qQ.A0K(this.A02, mdW.A02) || !0qQ.A0K(this.A01, mdW.A01) || this.A00 != mdW.A00 || !0qQ.A0K(this.A04, mdW.A04) || !0qQ.A0K(this.A03, mdW.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A04, ((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31) + this.A00) * 31));
    }

    public C66838MdW(AnonymousClass7FT r1, AnonymousClass7FE r2, CharSequence charSequence, CharSequence charSequence2, int i) {
        super(r1);
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = i;
        this.A04 = r2;
        this.A03 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
