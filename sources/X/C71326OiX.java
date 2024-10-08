package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.feeditem.SuggestedChannels;

/* renamed from: X.OiX  reason: case insensitive filesystem */
public final class C71326OiX implements View.OnClickListener {
    public final /* synthetic */ SuggestedChannels A00;
    public final /* synthetic */ AnonymousClass2r8 A01;

    public C71326OiX(SuggestedChannels suggestedChannels, AnonymousClass2r8 r2) {
        this.A01 = r2;
        this.A00 = suggestedChannels;
    }

    public final void onClick(View view) {
        Fragment nIr;
        int A05 = AnonymousClass0fD.A05(2084378882);
        AnonymousClass2r8 r7 = this.A01;
        SuggestedChannels suggestedChannels = this.A00;
        UserSession userSession = r7.A03;
        Oy4 A002 = O15.A00(userSession);
        0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "igd_channels_client_actions");
        if (A0e.isSampled()) {
            A0e.AAJ("user_igid", A002.A01);
            DbS.A1I(A0e, "all_netego_feed_suggestion_rendered");
            DbS.A1M(A0e, "feed_netego");
            Dba.A1B(A0e, "source", "see_all_button");
            A0e.Cgf();
        }
        boolean A06 = 182.A06(0Tu.A05, userSession, 36319407395511637L);
        String A003 = AnonymousClass000.A00(22);
        if (A06) {
            nIr = new NVN();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable("ChannelDiscoverySuggestionsFragment.ARG_CHANNEL_SUGGESTIONS_ENTRYPOINT", C69263NiP.FEED);
            nIr.setArguments(A0a);
        } else {
            Bundle A0A = DbV.A0A(userSession);
            A0A.putParcelable("suggested_channels_key", suggestedChannels);
            nIr = new C68453NIr();
            nIr.setArguments(A0A);
            nIr.A00 = r7;
        }
        FragmentActivity fragmentActivity = r7.A01;
        0qQ.A0C(fragmentActivity, A003);
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        A0Q.A0D(nIr);
        A0Q.A04();
        AnonymousClass0fD.A0C(728703920, A05);
    }
}
