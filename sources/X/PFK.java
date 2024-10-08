package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

public final class PFK implements AnonymousClass758 {
    public final UserSession A00;
    public final C72578PBj A01;
    public final C70739OJk A02;
    public final 1Xj A03;
    public final DirectMessageIdentifier A04;

    public final void EgV(int i, int i2) {
    }

    public final DirectMessageIdentifier Ax8() {
        return this.A04;
    }

    public final 1Xj BPr() {
        return this.A03;
    }

    public final RoundedCornerMediaFrameLayout C5q() {
        return this.A01.A0K;
    }

    public final String CEE() {
        1Xj r0 = this.A03;
        if (r0 == null) {
            return null;
        }
        return r0.A0M;
    }

    public final void ET5(int i) {
        this.A02.A00(this.A04);
        this.A01.A0I.setVisibility(i);
    }

    public final void EiL(int i) {
        this.A02.A00(this.A04);
        this.A01.A0J.EiM(i, false);
    }

    public final void Er6(C245853da r3) {
        C69655Npd A002 = this.A02.A00(this.A04);
        0qQ.A0B(r3, 0);
        A002.A00 = r3;
        this.A01.A0H.A00(r3);
    }

    public final void setVideoIconState(AnonymousClass3TO r3) {
        C69655Npd A002 = this.A02.A00(this.A04);
        0qQ.A0B(r3, 0);
        A002.A01 = r3;
        this.A01.A0J.setVideoIconState(r3);
    }

    public PFK(UserSession userSession, C72578PBj pBj, C70739OJk oJk, 1Xj r4, DirectMessageIdentifier directMessageIdentifier) {
        this.A04 = directMessageIdentifier;
        this.A03 = r4;
        this.A01 = pBj;
        this.A02 = oJk;
        this.A00 = userSession;
    }
}
