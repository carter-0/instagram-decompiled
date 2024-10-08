package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class FVT implements C51897G6n {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ C62320sa A04;

    public FVT(AnonymousClass4DH r1, UserSession userSession, String str, C62320sa r4, C62320sa r5) {
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
    }

    public final void onFailure(Throwable th) {
        C59689JTv.A0F(this.A00.requireActivity(), "supervision_bloks_action_failed", 2131961756);
    }

    public final void onSuccess() {
        C62320sa r0;
        Map map = ((C46414Deb) this.A01.A01(C46414Deb.class, new C46411DeY())).A00;
        0qQ.A07(map);
        if (Integer.parseInt(String.valueOf(map.get(this.A02))) == 0) {
            r0 = this.A03;
        } else {
            r0 = this.A04;
        }
        r0.invoke();
    }
}
