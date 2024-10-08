package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class E80 extends C361158fl {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C229382nI A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;

    public E80(AnonymousClass4DH r1, C229382nI r2, UserSession userSession, String str, C62320sa r5, C62320sa r6) {
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
    }

    public final void A04(C268654dm r4) {
        C59689JTv.A0F(this.A00.requireActivity(), "supervision_bloks_action_failed", 2131961756);
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C62320sa r0;
        C48382Edd.A00(this.A01, DbV.A0Q(obj));
        Map map = ((C46414Deb) this.A02.A01(C46414Deb.class, new C46411DeY())).A00;
        0qQ.A07(map);
        if (Integer.parseInt(String.valueOf(map.get(this.A03))) == 0) {
            r0 = this.A04;
        } else {
            r0 = this.A05;
        }
        r0.invoke();
    }
}
