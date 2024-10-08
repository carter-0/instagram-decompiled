package X;

/* renamed from: X.NYa  reason: case insensitive filesystem */
public final class C68816NYa extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass7FE A00;
    public final AnonymousClass7FT A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68816NYa) {
                C68816NYa nYa = (C68816NYa) obj;
                if (!0qQ.A0K(this.A00, nYa.A00) || !0qQ.A0K(this.A01, nYa.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C68816NYa(AnonymousClass7FT r1, AnonymousClass7FE r2) {
        super(r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VotingContentViewModel(themeModel=");
        A1A.append(this.A00);
        A1A.append(", gestureDetectionModel=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
