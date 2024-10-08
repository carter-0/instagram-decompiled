package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;

/* renamed from: X.5WR  reason: invalid class name */
public final class AnonymousClass5WR extends C267794cD {
    public MRL A00;

    public final void A0E() {
        A0H(this.A00);
    }

    public final void A0F() {
        MRL mrl = this.A00;
        if (mrl instanceof BringIntoViewRequesterImpl) {
            0qQ.A0C(mrl, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) mrl).A00.A0B(this);
        }
    }

    public final boolean A0G() {
        return false;
    }

    public final void A0H(MRL mrl) {
        MRL mrl2 = this.A00;
        if (mrl2 instanceof BringIntoViewRequesterImpl) {
            0qQ.A0C(mrl2, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) mrl2).A00.A0B(this);
        }
        if (mrl instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) mrl).A00.A09(this);
        }
        this.A00 = mrl;
    }
}
