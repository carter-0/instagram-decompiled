package X;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel;

public final class H7F extends C232222tE {
    public final Activity A00;
    public final UserSession A01;
    public final X47 A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass7TF.A1B(activity, 0, userSession);
        ComposeView composeView = new ComposeView(activity, (AttributeSet) null, 0);
        viewGroup.addView(composeView);
        composeView.setContent(AnonymousClass5PI.A04(new J7L(userSession, 0, C51965G9l.A1a(0Tu.A06, userSession, 36327164102129879L), true), -2035604561, true));
        composeView.A03();
        viewGroup.removeView(composeView);
        composeView.setTag(new C53118Giq(composeView));
        return new C53118Giq(composeView);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C69163Nfm nfm = (C69163Nfm) r9;
        C53118Giq giq = (C53118Giq) r10;
        0qQ.A0B(nfm, 0);
        0qQ.A0B(giq, 1);
        C70826OMy oMy = nfm.A00;
        if (oMy.A01().intValue() == 6) {
            FragmentActivity fragmentActivity = this.A00;
            DbS.A1X(fragmentActivity);
            FragmentActivity fragmentActivity2 = fragmentActivity;
            UserSession userSession = this.A01;
            X47 x47 = this.A02;
            AnonymousClass7TG.A0w(0, fragmentActivity2, userSession, x47);
            String str = giq.A00;
            if (str == null || !str.equals(oMy.A0A.getValue())) {
                giq.A00 = DbS.A0t(oMy.A0A);
                ThreadsSearchHcmViewModel threadsSearchHcmViewModel = new ThreadsSearchHcmViewModel(fragmentActivity2, C14481Tx3.A01, userSession, oMy);
                View view = giq.itemView;
                0qQ.A06(view);
                x47.EBK(view, oMy);
                giq.A01.setContent(AnonymousClass5PI.A04(new C59137J7t(14, threadsSearchHcmViewModel, fragmentActivity2, userSession, oMy), -1592092552, true));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Unsupported entity type for Compose");
    }

    public final Class modelClass() {
        return C69163Nfm.class;
    }

    public H7F(Activity activity, UserSession userSession, X47 x47) {
        AnonymousClass7TG.A1Q(userSession, x47);
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = x47;
    }
}
