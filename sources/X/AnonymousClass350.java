package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.350  reason: invalid class name */
public final class AnonymousClass350 implements 1wn {
    public final /* synthetic */ C2365134a A00;

    public AnonymousClass350(C2365134a r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1026322952);
        int A032 = AnonymousClass0fD.A03(1859780236);
        ReelStore A05 = 1OP.A05(this.A00.A0F);
        1Np r5 = A05.A03;
        r5.A00.clear();
        UserSession userSession = A05.A09;
        r5.A02(1O2.A00(userSession).A00(new Reel(new 1Nr(0eE.A00(userSession).A00()), userSession.A06, true)));
        A05.A06 = false;
        A05.A07 = false;
        AnonymousClass0fD.A0A(-1186043846, A032);
        AnonymousClass0fD.A0A(-1051271549, A03);
    }
}
