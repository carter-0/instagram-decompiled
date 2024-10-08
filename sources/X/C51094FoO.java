package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FoO  reason: case insensitive filesystem */
public final class C51094FoO implements G83 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C3263576k A02;
    public final /* synthetic */ C69445Nlp A03;
    public final /* synthetic */ 0wc A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C358248ab A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ G87 A08;
    public final /* synthetic */ C48088EVg A09;

    public final void onFinish() {
    }

    public C51094FoO(Context context, FragmentActivity fragmentActivity, C3263576k r3, C69445Nlp nlp, 0wc r5, UserSession userSession, C358248ab r7, User user, G87 g87, C48088EVg eVg) {
        this.A08 = g87;
        this.A09 = eVg;
        this.A01 = fragmentActivity;
        this.A05 = userSession;
        this.A00 = context;
        this.A07 = user;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = nlp;
    }

    public final void DEH(Integer num) {
        C59689JTv.A0B(this.A00, "something_went_wrong");
        this.A08.DfM();
    }

    public final void onStart() {
        this.A08.DfN();
    }

    public final void onSuccess() {
        G87 g87 = this.A08;
        C48088EVg eVg = this.A09;
        if (eVg == C48088EVg.STORY_VIEWERSHEET) {
            g87.DfN();
        }
        FragmentActivity fragmentActivity = this.A01;
        if (!fragmentActivity.isDestroyed()) {
            UserSession userSession = this.A05;
            if (182.A06(0Tu.A06, userSession, 36321486155294136L)) {
                C49239Eri.A00(fragmentActivity, this.A00, userSession, this.A07.B8Q());
                g87.Doz();
            }
        }
        DbT.A1V(this.A06);
        0wc r3 = this.A04;
        String id = this.A07.getId();
        C3263576k r4 = this.A02;
        AnonymousClass73V.A02(r3, r4, this.A03, eVg, "impression", "optimistic_restrict_alert", id);
        if (r4 == C3263576k.CANONICAL || r4 == C3263576k.SECURE_OVER_WA_CANONICAL) {
            C59689JTv.A07(this.A00, 2131952092);
        }
        g87.Doz();
    }
}
