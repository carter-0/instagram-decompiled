package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.6fl  reason: invalid class name and case insensitive filesystem */
public final class C313046fl implements C313056fm {
    public C255963v0 A00;
    public final Context A01;
    public final ViewGroup A02;
    public final UserSession A03;
    public final ReboundViewPager A04;
    public final C310566bG A05;

    public C313046fl(View view, UserSession userSession, C310566bG r8) {
        0qQ.A0B(r8, 1);
        0qQ.A0B(view, 2);
        0qQ.A0B(userSession, 3);
        this.A05 = r8;
        this.A03 = userSession;
        View requireViewById = view.requireViewById(R.id.view_pager);
        0qQ.A07(requireViewById);
        ViewStub viewStub = (ViewStub) requireViewById;
        viewStub.setLayoutResource(R.layout.layout_reel_viewer_rebound_viewpager);
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager");
        ReboundViewPager reboundViewPager = (ReboundViewPager) inflate;
        this.A04 = reboundViewPager;
        if (182.A06(0Tu.A05, userSession, 36328259318922397L)) {
            reboundViewPager.A0S = true;
        }
        Context context = reboundViewPager.getContext();
        0qQ.A07(context);
        this.A01 = context;
        this.A02 = reboundViewPager;
    }

    public final void A90(C252293os r2) {
        0qQ.A0B(r2, 0);
        this.A04.A0P(r2);
    }

    public final boolean CYp() {
        if (this.A04.A0O != AnonymousClass3TF.IDLE) {
            return true;
        }
        return false;
    }

    public final void EJb(0sP r2) {
        View view = this.A04.A0F;
        if (view != null) {
            r2.invoke(view);
        }
    }

    public final boolean isIdle() {
        if (this.A04.A0O == AnonymousClass3TF.IDLE) {
            return true;
        }
        return false;
    }
}
