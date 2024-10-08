package X;

import com.instagram.business.promote.model.LinkingAuthState;

public final class WON implements X3K {
    public final /* synthetic */ X6L A00;

    public WON(X6L x6l) {
        this.A00 = x6l;
    }

    public final void DfU(C17322VRb vRb) {
        X6L x6l = this.A00;
        if (vRb instanceof C15416UcS) {
            String str = vRb.A01;
            if (str != null) {
                LinkingAuthState linkingAuthState = LinkingAuthState.BUSINESS_TOKEN_OR_UNKNOWN;
                if (x6l instanceof C21049XBq) {
                    ((C21049XBq) x6l).Dmn(linkingAuthState);
                }
                x6l.Doe(str);
            }
        } else if (vRb.equals(C15417UcT.A00)) {
            x6l.DED();
        } else {
            throw new RuntimeException();
        }
    }
}
