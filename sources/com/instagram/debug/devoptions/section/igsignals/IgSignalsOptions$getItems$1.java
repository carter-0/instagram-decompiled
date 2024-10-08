package com.instagram.debug.devoptions.section.igsignals;

import X.0qQ;
import X.0sP;
import X.2C5;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C60340gF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.common.session.UserSession;

public final class IgSignalsOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public IgSignalsOptions$getItems$1(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(final View view) {
        int A05 = AnonymousClass0fD.A05(284824816);
        IgSignalsCasper A00 = 2C5.A00(this.$activity, this.$userSession);
        if (A00 != null) {
            final UserSession userSession = this.$userSession;
            final FragmentActivity fragmentActivity = this.$activity;
            A00.A03(new 0sP() {
                public final void invoke(long j) {
                    IgSignalsOptions igSignalsOptions = IgSignalsOptions.INSTANCE;
                    UserSession userSession = userSession;
                    FragmentActivity fragmentActivity = fragmentActivity;
                    View view = view;
                    0qQ.A0A(view);
                    igSignalsOptions.showCasperResult(userSession, fragmentActivity, view, j);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(AnonymousClass7TE.A0R(obj));
                    return C60340gF.A00;
                }
            });
        }
        AnonymousClass0fD.A0C(-443901094, A05);
    }
}
