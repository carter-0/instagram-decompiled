package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;

/* renamed from: X.Gog  reason: case insensitive filesystem */
public final class C53448Gog extends AnonymousClass0T0 implements JSG {
    public final C53459Gor A00;
    public final MidCardClipsClickedAction A01;
    public final JSD A02;

    public C53448Gog(MidCardClipsClickedAction midCardClipsClickedAction, JSD jsd, C53459Gor gor) {
        0qQ.A0B(midCardClipsClickedAction, 1);
        this.A01 = midCardClipsClickedAction;
        this.A02 = jsd;
        this.A00 = gor;
    }

    public final C53448Gog F6G() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53448Gog) {
                C53448Gog gog = (C53448Gog) obj;
                if (this.A01 != gog.A01 || !0qQ.A0K(this.A02, gog.A02) || !0qQ.A0K(this.A00, gog.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final MidCardClipsClickedAction AYD() {
        return this.A01;
    }

    public final JSD BYM() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ JSH BYQ() {
        return this.A00;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
