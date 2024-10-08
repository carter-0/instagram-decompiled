package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;

/* renamed from: X.MbL  reason: case insensitive filesystem */
public final class C66714MbL extends C69599Noh {
    public final DirectThreadKey A00;
    public final Reel A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66714MbL) {
                C66714MbL mbL = (C66714MbL) obj;
                if (!0qQ.A0K(this.A00, mbL.A00) || !0qQ.A0K(this.A01, mbL.A01)) {
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

    public C66714MbL(DirectThreadKey directThreadKey, Reel reel) {
        this.A00 = directThreadKey;
        this.A01 = reel;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OpenReel(threadKey=");
        A1A.append(this.A00);
        A1A.append(", reelForThread=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
