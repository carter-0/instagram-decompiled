package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class WNT implements X3E {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;

    public WNT(AnonymousClass4DH r1, Reel reel, AnonymousClass6Z5 r3) {
        this.A02 = r3;
        this.A01 = reel;
        this.A00 = r1;
    }

    public final void onSuccess() {
        AnonymousClass6Z5 r3 = this.A02;
        UserSession userSession = r3.A09;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass1Nd.A00(userSession).A00(new WQC(this.A01));
        r3.A17.CpD();
        C59689JTv.A07(this.A00.requireContext(), 2131963426);
    }
}
