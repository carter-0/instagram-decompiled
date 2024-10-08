package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OTl  reason: case insensitive filesystem */
public final class C70964OTl {
    public View A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public AnonymousClass7L0 A03;
    public final Activity A04;
    public final UserSession A05;
    public final C252063oV A06;
    public final C66930MfP A07;

    public C70964OTl(Activity activity, View view, UserSession userSession) {
        0qQ.A0B(view, 1);
        this.A04 = activity;
        this.A05 = userSession;
        C252063oV A002 = 2b1.A00(view);
        this.A06 = A002;
        this.A07 = C69868NtW.A00(userSession);
        A002.EeU(new C72245OzD(this, 0));
    }

    public static final void A00(C70964OTl oTl, 2Er r5) {
        C254743sy BJz = r5.BJz();
        0qQ.A0C(BJz, AnonymousClass000.A00(87));
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = oTl.A05;
        AnonymousClass0Dg.A00(A0a, userSession);
        A0a.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, (DirectThreadKey) BJz);
        A0a.putSerializable("prompts_tab", C69365Nk5.DAILY_PROMPT);
        A0a.putInt("direct_thread_sub_type", r5.C6a());
        A0a.putInt("direct_thread_audience_type", r5.AdN());
        A0a.putSerializable("prompts_entry_point", C69309NjA.FAB);
        DbY.A0u(oTl.A04, A0a, userSession, C273654mx.A00(650));
    }
}
