package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Collection;

public final class NV4 extends C68495NKo {
    public static final String __redex_internal_original_name = "DirectChallengeWinnerFragment";
    public IgSimpleImageView A00;
    public IgTextView A01;
    public IgTextView A02;
    public CirclePageIndicator A03;
    public SpinnerImageView A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(MYO.A01(this, 40));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(MYO.A01(this, 46));
    public final 1wn A07 = C71932OtG.A00(this, 7);
    public final O6H A08 = new O6H(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C252063oV r1 = this.A03;
        if (r1 != null) {
            r1.setVisibility(8);
            this.A02 = DbT.A0a(view, R.id.challenge_winner_title);
            this.A01 = DbT.A0a(view, R.id.challenge_winner_subtitle);
            this.A04 = (SpinnerImageView) view.requireViewById(R.id.challenge_winner_loading_spinner);
            this.A03 = (CirclePageIndicator) view.requireViewById(R.id.page_indicator);
            this.A00 = JTP.A0T(view, R.id.confetti_image_view);
            new C228422le().A07(getRecyclerView());
            getRecyclerView().A15(new C67837Mvh(this, 3));
            C67759MuF A0E = A0E();
            0qQ.A0C(A0E, "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengeWinnerViewModel");
            Dba.A15(getViewLifecycleOwner(), ((NVF) A0E).A01, new C74184PqQ(this, 10), 36);
            return;
        }
        0qQ.A0F("emptyStateViewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Collection getDefinitions() {
        String str;
        Context requireContext = requireContext();
        AnonymousClass0eM r0 = this.A0S;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l2 = AnonymousClass7TE.A0l(r0);
        DirectThreadKey A0G = A0G();
        C67759MuF A0E = A0E();
        C73459Pd1 pd1 = new C73459Pd1(this, 2);
        C72518P9b p9b = new C72518P9b(this, 0);
        C72537P9u p9u = new C72537P9u(this);
        C72516P8z p8z = C72516P8z.A00;
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            str = bundle.getString("surface");
        } else {
            str = null;
        }
        return AnonymousClass7TE.A1I(new C68588NOk(requireContext, this, A0l, this.A08, new OIO(requireActivity, A0l2, this, A0E, p8z, p9b, p9u, A0G, str, pd1)));
    }

    public final String getModuleName() {
        return "direct_challenge_winner";
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new C74184PqQ(this, 9));
    }

    public static final String A01(NV4 nv4) {
        C67759MuF A0E = nv4.A0E();
        0qQ.A0C(A0E, "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengeWinnerViewModel");
        C69583NoR noR = (C69583NoR) ((NVF) A0E).A01.A02();
        if (noR instanceof NVJ) {
            return ((NVJ) noR).A06;
        }
        return null;
    }

    public static final void A02(NV4 nv4, String str, boolean z, boolean z2) {
        Integer num;
        String str2;
        String str3;
        AnonymousClass3U9 A0N = C66584MXp.A0N(nv4);
        C72202OyR A0T = C66580MXl.A0T(nv4.A06);
        String A0w = C66580MXl.A0w(nv4);
        String str4 = nv4.A0G().A01;
        C242243Te r0 = null;
        if (A0N != null) {
            num = Integer.valueOf(A0N.AdN());
        } else {
            num = null;
        }
        String str5 = AnonymousClass7TE.A0l(nv4.A0S).A06;
        int i = nv4.A02;
        if (A0N != null) {
            r0 = A0N.A01.A0s;
        }
        String A002 = C329997La.A00(r0, str5, i);
        if (z2) {
            str2 = "share_winning_submission";
        } else {
            str2 = "share_winners";
        }
        if (z) {
            str3 = "share_airplane_button";
        } else {
            str3 = "share_winners_button";
        }
        C72202OyR.A03((C69493Nmb) null, A0T, num, A0w, str4, "challenge_share_sheet_rendered", "tap", str3, "challenge_winners_chosen_sheet", C72202OyR.A02(str, A002, "winners_chosen", str2));
    }

    public final void onCreate(Bundle bundle) {
        ODX odx;
        int A022 = AnonymousClass0fD.A02(29025825);
        super.onCreate(bundle);
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A01(this.A07, AY1.class);
        if (!DbT.A1X(requireArguments(), "channel_is_member")) {
            odx = new ODX(DbU.A0m(this, 2131954903), MYO.A01(this, 42), true);
        } else {
            odx = null;
        }
        this.A04 = odx;
        AnonymousClass0fD.A09(-57571921, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1592006365);
        super.onDestroy();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A02(this.A07, AY1.class);
        AnonymousClass0fD.A09(-170456941, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1801108031);
        super.onDestroyView();
        ((C314126hh) this.A05.getValue()).A00();
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(748121612, A022);
    }
}
