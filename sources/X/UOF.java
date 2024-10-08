package X;

import com.instagram.model.reels.Reel;

public final class UOF extends AnonymousClass0T0 implements C20851X1d {
    public final Reel A00;
    public final C255773uh A01;
    public final C15021UKa A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOF) {
                UOF uof = (UOF) obj;
                if (!0qQ.A0K(this.A00, uof.A00) || !0qQ.A0K(this.A01, uof.A01) || !0qQ.A0K(this.A02, uof.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public UOF(Reel reel, C255773uh r2, C15021UKa uKa) {
        this.A00 = reel;
        this.A01 = r2;
        this.A02 = uKa;
    }
}
