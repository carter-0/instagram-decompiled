package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

public final class OVO {
    public C331157Pu A00;
    public final Activity A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final OC1 A05;

    public final void A01(DirectThreadKey directThreadKey, Integer num) {
        0qQ.A0B(num, 1);
        Fragment r3 = new C227812jx();
        r3.A00 = this;
        r3.A01 = directThreadKey;
        r3.A02 = num;
        C331127Pr A0W = DbS.A0W(this.A04);
        DbZ.A0z(this.A02, A0W, 2131959568);
        this.A00 = A0W.A00().A02(this.A01, r3);
    }

    public static final void A00(OVO ovo, DirectThreadKey directThreadKey, Integer num, long j) {
        OC1 oc1 = ovo.A05;
        C66709MbG mbG = new C66709MbG(directThreadKey, num, j);
        1NY A0a = AnonymousClass7TG.A0a(oc1.A00);
        A0a.A0A("direct_v2/set_thread_reminder/");
        A0a.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, ((DirectThreadKey) mbG.A03).A00);
        A0a.A0D("notification_time", mbG.A01);
        1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
        NMH.A00(A0S, mbG, oc1, 13);
        1ES.A03(A0S);
    }

    public OVO(Activity activity, Context context, AnonymousClass0iw r4, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = r4;
        this.A02 = context;
        this.A01 = activity;
        this.A05 = new OC1(userSession, this);
    }
}
