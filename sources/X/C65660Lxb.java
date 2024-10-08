package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Lxb  reason: case insensitive filesystem */
public final class C65660Lxb implements C66462MSq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C63768L6a A03;
    public final /* synthetic */ LEH A04;
    public final /* synthetic */ ReelDashboardFragment A05;

    public C65660Lxb(Context context, AnonymousClass4DH r2, UserSession userSession, C63768L6a l6a, LEH leh, ReelDashboardFragment reelDashboardFragment) {
        this.A04 = leh;
        this.A00 = context;
        this.A03 = l6a;
        this.A01 = r2;
        this.A02 = userSession;
        this.A05 = reelDashboardFragment;
    }

    public final void E1P(Integer num) {
        int A032 = C51967G9n.A03(num, 0);
        if (A032 == 0) {
            CallerContext callerContext = C59719JVd.A01;
            LEH leh = this.A04;
            IgdsButton A002 = leh.A00();
            A002.setLoading(true);
            A002.setEnabled(false);
            Context context = this.A00;
            C63768L6a l6a = this.A03;
            AnonymousClass4DH r8 = this.A01;
            UserSession userSession = this.A02;
            ReelDashboardFragment reelDashboardFragment = this.A05;
            LSZ.A01(context, r8, userSession, l6a, leh, reelDashboardFragment, true, false);
            C65633LxA lxA = new C65633LxA(l6a, reelDashboardFragment);
            0qQ.A0B(userSession, 0);
            new C363008it(userSession, lxA).A05(true, "ig_story_viewers_dashboard");
        } else if (A032 == 1) {
            CallerContext callerContext2 = C59719JVd.A01;
            LEH leh2 = this.A04;
            IgdsButton A003 = leh2.A00();
            A003.setLoading(true);
            A003.setEnabled(false);
            LSZ.A01(this.A00, this.A01, this.A02, this.A03, leh2, this.A05, false, false);
        }
    }
}
