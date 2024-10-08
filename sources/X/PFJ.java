package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

public final class PFJ implements AnonymousClass758 {
    public final PBV A00;
    public final 1Xj A01;
    public final DirectMessageIdentifier A02;

    public PFJ(PBV pbv, 1Xj r3, DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 2);
        this.A00 = pbv;
        this.A02 = directMessageIdentifier;
        this.A01 = r3;
    }

    public final void EgV(int i, int i2) {
    }

    public final void EiL(int i) {
    }

    public final void Er6(C245853da r1) {
    }

    public final void setVideoIconState(AnonymousClass3TO r1) {
    }

    public final DirectMessageIdentifier Ax8() {
        return this.A02;
    }

    public final 1Xj BPr() {
        return this.A01;
    }

    public final RoundedCornerMediaFrameLayout C5q() {
        return this.A00.A0A;
    }

    public final String CEE() {
        1Xj r0 = this.A01;
        if (r0 != null) {
            return r0.A0M;
        }
        return null;
    }

    public final void ET5(int i) {
        this.A00.A08.setVisibility(i);
    }
}
