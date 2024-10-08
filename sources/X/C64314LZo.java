package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.LZo  reason: case insensitive filesystem */
public final /* synthetic */ class C64314LZo implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass6SY A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public /* synthetic */ C64314LZo(AnonymousClass6SY r1, ReelViewerFragment reelViewerFragment) {
        this.A01 = reelViewerFragment;
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        ReelViewerFragment reelViewerFragment = this.A01;
        AnonymousClass6SY r4 = this.A00;
        MR8 mr8 = (MR8) obj;
        if (mr8 instanceof C65693Ly8) {
            ReelViewerFragment.A0I(reelViewerFragment, false);
        } else if (mr8 instanceof C61251Jzj) {
            reelViewerFragment.EHY(((C61251Jzj) mr8).A00);
        } else if (mr8 instanceof C61252Jzk) {
            C61252Jzk jzk = (C61252Jzk) mr8;
            C250973mM r1 = reelViewerFragment.A0a;
            if (r1 != null) {
                UserSession session = reelViewerFragment.getSession();
                C255773uh r8 = jzk.A00;
                AnonymousClass7TG.A1N(session, r8);
                if (r1.A03(session, r8) >= 0) {
                    reelViewerFragment.A3G.DcP((RectF) null, r8, reelViewerFragment.A0a, jzk.A01, false);
                }
            }
        } else if (mr8 instanceof C61253Jzl) {
            C61253Jzl jzl = (C61253Jzl) mr8;
            C250973mM r12 = reelViewerFragment.A0a;
            if (r12 != null) {
                UserSession session2 = reelViewerFragment.getSession();
                C255773uh r3 = jzl.A00;
                AnonymousClass7TG.A1N(session2, r3);
                if (r12.A03(session2, r3) >= 0) {
                    reelViewerFragment.A3G.Dw4(r3, reelViewerFragment.A0a, jzl.A01);
                }
            }
        }
        if (!0qQ.A0K(r4.A00.A02(), C65692Ly7.A00)) {
            AnonymousClass7TE.A1Z(new MG5(r4, (AnonymousClass4D7) null, 25), C318116oQ.A00(r4));
        }
    }
}
