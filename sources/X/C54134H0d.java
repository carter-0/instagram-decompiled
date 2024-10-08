package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsFeedbackBottomSheetFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.H0d  reason: case insensitive filesystem */
public final class C54134H0d extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorInspirationSignalsPlaygroundRecommendationsFragment";
    public int A00;
    public IgdsButton A01;
    public IgdsButton A02;
    public IgdsButton A03;
    public C234502xy A04;
    public C55883Hp4 A05;
    public User A06;
    public final String A07 = AnonymousClass000.A00(2954);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = C58673Ivi.A00(this, 34);
    public final AnonymousClass0eM A0A = C58673Ivi.A00(this, 35);
    public final AnonymousClass0eM A0B = C58673Ivi.A00(this, 36);
    public final AnonymousClass0eM A0C = C58673Ivi.A00(this, 37);
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E = C227642jf.A02(this);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;

    public final void configureActionBar(2da r10) {
        0qQ.A0B(r10, 0);
        AnonymousClass0eM r1 = this.A0E;
        User A022 = 17h.A00(AnonymousClass7TE.A0l(r1)).A02(DbS.A0t(this.A0I));
        if (A022 != null) {
            this.A06 = A022;
            r10.Eu4(true);
            View ETj = r10.ETj(AnonymousClass7TE.A0l(r1), R.layout.creator_inspiration_signals_playground_recommendations_action_bar, 0, 0);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AnonymousClass7TF.A0F(ETj, R.id.profile_image);
            User user = this.A06;
            if (user != null) {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this, user.Bh3());
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                C56801ICy.A01(gradientSpinnerAvatarView, 14, this);
                TextView A0R = AnonymousClass7TG.A0R(ETj, R.id.primary_name);
                User user2 = this.A06;
                if (user2 != null) {
                    DbU.A1H(A0R, user2);
                    C56801ICy.A01(A0R, 15, this);
                    TextView A0R2 = AnonymousClass7TG.A0R(ETj, R.id.secondary_name);
                    User user3 = this.A06;
                    if (user3 != null) {
                        A0R2.setText(user3.A0Q());
                        C56801ICy.A01(A0R2, 16, this);
                        View A0G2 = AnonymousClass7TF.A0G(ETj, R.id.action_bar_buttons_container);
                        if (182.A06(0Tu.A05, DbT.A0X(r1), 36328598621208011L)) {
                            A0G2.setVisibility(8);
                            ViewGroup.LayoutParams layoutParams = A0R.getLayoutParams();
                            String A002 = C273654mx.A00(3);
                            0qQ.A0C(layoutParams, A002);
                            ((C71492dQ) layoutParams).A0M = 0;
                            ViewGroup.LayoutParams layoutParams2 = A0R2.getLayoutParams();
                            0qQ.A0C(layoutParams2, A002);
                            ((C71492dQ) layoutParams2).A0M = 0;
                            return;
                        }
                        C56801ICy.A01(AnonymousClass7TF.A0G(ETj, R.id.comment_icon_button), 17, this);
                        C56801ICy.A01(AnonymousClass7TF.A0G(ETj, R.id.info_icon_button), 18, this);
                        return;
                    }
                }
            }
            0qQ.A0F("testUser");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        2Rw r0;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View A0G2 = AnonymousClass7TF.A0G(view2, R.id.error_message);
        View A0F2 = AnonymousClass7TF.A0F(view2, R.id.loading_spinner);
        View A0F3 = AnonymousClass7TF.A0F(view2, R.id.recommendations_container);
        AnonymousClass7TG.A0R(view2, R.id.signal_title_line).setText(DbS.A0t(this.A0H));
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0G(view2, R.id.recommendations_hscroll_recycler_view);
        C55883Hp4 hp4 = this.A05;
        if (hp4 == null) {
            0qQ.A0F("recommendationsRecyclerViewHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(recyclerView, 0);
        DbV.A1A(hp4.A00, recyclerView);
        String str = hp4.A08;
        if (0qQ.A0K(str, "CLIPS")) {
            r0 = hp4.A06;
        } else if (0qQ.A0K(str, "AUDIO")) {
            r0 = hp4.A05;
        } else {
            r0 = null;
        }
        recyclerView.setAdapter(r0);
        recyclerView.A15(hp4.A03);
        recyclerView.A11(hp4.A02);
        new C228422le().A07(recyclerView);
        View A0G3 = AnonymousClass7TF.A0G(view2, R.id.feedback_buttons_container);
        IgdsButton igdsButton = (IgdsButton) view2.requireViewById(R.id.relevant_button);
        this.A03 = igdsButton;
        CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType feedbackType = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.RELEVANT;
        if (igdsButton != null) {
            ID3.A02(igdsButton, 3, feedbackType, this);
        }
        IgdsButton igdsButton2 = (IgdsButton) view2.requireViewById(R.id.partially_relevant_button);
        this.A02 = igdsButton2;
        CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType feedbackType2 = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.PARTIALLY_RELEVANT;
        if (igdsButton2 != null) {
            ID3.A02(igdsButton2, 3, feedbackType2, this);
        }
        IgdsButton igdsButton3 = (IgdsButton) view2.requireViewById(R.id.not_relevant_button);
        this.A01 = igdsButton3;
        CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType feedbackType3 = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.NOT_RELEVANT;
        if (igdsButton3 != null) {
            ID3.A02(igdsButton3, 3, feedbackType3, this);
        }
        07U r8 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new JVZ(viewLifecycleOwner, A0F2, this, A0G2, A0G3, r8, A0F3, (AnonymousClass4D7) null, 16), AnonymousClass07a.A00(viewLifecycleOwner));
        DbZ.A1C(this, new C66172MGj(view2, recyclerView, this, (AnonymousClass4D7) null, 39), ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel) this.A0D.getValue()).viewEffect);
    }

    public static final void A00(C54134H0d h0d) {
        AnonymousClass0eM r4 = h0d.A0E;
        C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r4), DbS.A0t(h0d.A0I), "creator_inspiration_signals_playground_action_bar", h0d.A07);
        C309516Yo A0P = DbZ.A0P(h0d, r4);
        A0P.A08();
        C46474Dfc.A03(A0P, AnonymousClass7TE.A0l(r4), C46447Df9.A02(), A012);
    }

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public C54134H0d() {
        0eO r3 = 0eO.A02;
        this.A0G = C51804G2n.A01(this, AnonymousClass000.A00(5262), r3, 44);
        this.A0H = C51804G2n.A01(this, AnonymousClass000.A00(5260), r3, 45);
        this.A0F = C51804G2n.A01(this, AnonymousClass000.A00(5261), r3, 46);
        this.A0I = C51804G2n.A01(this, AnonymousClass000.A00(4094), r3, 47);
        C58673Ivi ivi = new C58673Ivi(this, 38);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C58673Ivi(new C58673Ivi(this, 39), 40));
        this.A0D = DbS.A0I(new C58673Ivi(A002, 41), ivi, C58690Ivz.A00((Object) null, A002, 12), DbS.A0z(CreatorInspirationSignalsPlaygroundRecommendationsViewModel.class));
        C58673Ivi ivi2 = new C58673Ivi(this, 33);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r3, new C58673Ivi(new C58673Ivi(this, 42), 43));
        this.A08 = DbS.A0I(new C58673Ivi(A003, 44), ivi2, C58690Ivz.A00((Object) null, A003, 13), DbS.A0z(C52967GgK.class));
    }

    public static final void A01(C54134H0d h0d, Integer num) {
        int i;
        Fragment recommendationsFeedbackBottomSheetFragment;
        if (num.intValue() != 0) {
            i = 2131957091;
            recommendationsFeedbackBottomSheetFragment = new RecommendationsInfoBottomSheetFragment();
        } else {
            i = 2131957088;
            recommendationsFeedbackBottomSheetFragment = new RecommendationsFeedbackBottomSheetFragment();
        }
        C331127Pr A0f = DbX.A0f(h0d.A0E);
        DbZ.A0z(h0d.requireContext(), A0f, i);
        DbY.A13(h0d, recommendationsFeedbackBottomSheetFragment, A0f);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-28599201);
        C54134H0d.super.onCreate(bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A0E;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        this.A04 = C234472xv.A00(requireContext, A0l, (AnonymousClass4DU) null, new C234462xu(requireContext(), AnonymousClass7TE.A0l(r3)), "CreatorInspirationSignalsPlayground", C234472xv.A02(A0l));
        String A0t = DbS.A0t(this.A0F);
        Context requireContext2 = requireContext();
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
        C52967GgK ggK = (C52967GgK) this.A08.getValue();
        int A072 = DbX.A07(this.A0A);
        int A073 = DbX.A07(this.A09);
        String A0t2 = DbS.A0t(this.A0H);
        C249403jg r7 = (C249403jg) this.A0C.getValue();
        AnonymousClass3B3 r6 = (AnonymousClass3B3) this.A0B.getValue();
        C234502xy r10 = this.A04;
        if (r10 != null) {
            this.A05 = new C55883Hp4(requireContext2, requireActivity, r6, r7, this, A0l2, r10, ggK, A0t, A0t2, A072, A073);
            ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel) this.A0D.getValue()).fetchSignalRecommendations(DbS.A0t(this.A0G), DbS.A0t(this.A0I));
            AnonymousClass0fD.A09(-583112239, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-937607294, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1688478414);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_inspiration_signals_playground_recommendations_fragment, false);
        AnonymousClass0fD.A09(-1549677399, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1399742367);
        super.onDestroy();
        C234502xy r0 = this.A04;
        if (r0 != null) {
            r0.release();
        }
        this.A04 = null;
        AnonymousClass0fD.A09(638184299, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1414048960);
        super.onDestroyView();
        ((C52967GgK) this.A08.getValue()).A0E();
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-794079824, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(713128524);
        C54134H0d.super.onPause();
        ((C52967GgK) this.A08.getValue()).A0F();
        C234502xy r1 = this.A04;
        if (r1 != null) {
            r1.EHu(false);
        }
        AnonymousClass0fD.A09(-1922980172, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1584449727);
        super.onResume();
        C52967GgK.A01(this.A08);
        AnonymousClass0fD.A09(-2027532333, A022);
    }
}
