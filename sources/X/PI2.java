package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

public final class PI2 implements C13822Ths {
    public OHX A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final 1Xj A03;
    public final AnonymousClass4DU A04;
    public final PRU A05;
    public final C67732Mtl A06;
    public final C310306am A07;
    public final UpcomingEvent A08;

    public final void DvV(String str, Object obj) {
    }

    public final void EF2(View view) {
        UpcomingEvent upcomingEvent = this.A08;
        if (upcomingEvent != null) {
            FragmentActivity fragmentActivity = this.A01;
            this.A00 = new OHX((ViewStub) AnonymousClass7TE.A0b(view, R.id.ig_expandable_footer_stub), fragmentActivity, this.A04, this.A02, this.A05, upcomingEvent);
            if ((fragmentActivity instanceof AnonymousClass07Z) && fragmentActivity != null) {
                07U r6 = 07U.A05;
                AnonymousClass7TE.A1Z(new C66170MGh(fragmentActivity, r6, this, (AnonymousClass4D7) null, 2), DbW.A0E(fragmentActivity));
            }
        }
    }

    public final View B7F() {
        OHX ohx = this.A00;
        if (ohx != null) {
            return ohx.A02.A01;
        }
        0qQ.A0F("viewBinder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DJ7() {
        AnonymousClass3M8 r0;
        OHX ohx = this.A00;
        if (ohx == null) {
            0qQ.A0F("viewBinder");
            throw AnonymousClass00P.createAndThrow();
        }
        C70823OMv oMv = (C70823OMv) ohx.A05.getValue();
        Dc2 dc2 = oMv.A00;
        if (dc2 != null && (r0 = oMv.A01) != null) {
            r0.A09(dc2);
        }
    }

    public final void onDestroyView() {
        AnonymousClass3M8 r0;
        if (this.A08 != null) {
            OHX ohx = this.A00;
            if (ohx == null) {
                0qQ.A0F("viewBinder");
                throw AnonymousClass00P.createAndThrow();
            }
            C70823OMv oMv = (C70823OMv) ohx.A05.getValue();
            Dc2 dc2 = oMv.A00;
            if (dc2 != null && (r0 = oMv.A01) != null) {
                r0.A09(dc2);
            }
        }
    }

    public PI2(C68181N3w n3w) {
        FragmentActivity fragmentActivity = (FragmentActivity) n3w.A02;
        this.A01 = fragmentActivity;
        UserSession userSession = (UserSession) n3w.A04;
        this.A02 = userSession;
        1Xj r4 = (1Xj) n3w.A03;
        this.A03 = r4;
        UpcomingEvent A002 = C310266ai.A00(userSession).A00(n3w.A0C);
        this.A08 = A002;
        PG5 pg5 = new PG5(n3w);
        this.A04 = pg5;
        this.A07 = new C310306am(pg5, userSession, n3w.A0D);
        this.A06 = new 2YN(new NNH(userSession, r4, pg5, A002), fragmentActivity).A00(C67732Mtl.class);
        this.A05 = new PRU(n3w, this);
    }
}
