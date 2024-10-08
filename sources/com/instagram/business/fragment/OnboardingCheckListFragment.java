package com.instagram.business.fragment;

import X.0Tu;
import X.1QK;
import X.1wn;
import X.2Yu;
import X.2ZS;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass2t9;
import X.AnonymousClass2tC;
import X.AnonymousClass3JR;
import X.AnonymousClass3Jb;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass61R;
import X.AnonymousClass7TF;
import X.C22030Xtl;
import X.C240073Jm;
import X.C303756Aq;
import X.C319586qr;
import X.C321856ur;
import X.C46383De2;
import X.C47697EDg;
import X.C49538ExN;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.EG2;
import X.EtT;
import X.F1I;
import X.F3i;
import X.FG1;
import X.FHI;
import X.FPB;
import X.FRZ;
import X.FXZ;
import X.G8D;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;
import java.util.Map;

public class OnboardingCheckListFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public Handler A00;
    public F1I A01;
    public C49538ExN A02;
    public EtT A03;
    public F3i A04;
    public C46383De2 A05;
    public AnonymousClass2t9 A06;
    public UserSession A07;
    public String A08;
    public boolean A09 = true;
    public boolean A0A;
    public 2da A0B;
    public G8D A0C;
    public boolean A0D;
    public final 1wn A0E = FXZ.A00(this, 9);
    public BusinessNavBar mBusinessNavBar;
    public ImageView mConfettiView;
    public IgdsHeadline mHeadline;
    public ViewGroup mLayoutContent;
    public ProgressBar mProgressBar;
    public RecyclerView mRecyclerView;
    public TextView mSkipOcButton;
    public View mSkipOcContainer;
    public TextView mStepsCompletedTextView;

    public final String getModuleName() {
        return "onboarding_checklist_fragment";
    }

    public final void A00() {
        G8D g8d = this.A0C;
        if (g8d != null) {
            g8d.AGV();
        } else {
            DbT.A1J(this);
        }
        2ZS A002 = C71172bH.A00();
        if (A002 != null) {
            C240073Jm.A00 = true;
            A002.Enh(1QK.A0E);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return this.A07;
    }

    public final boolean onBackPressed() {
        boolean z = this.A09;
        F3i f3i = this.A04;
        if (z) {
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = f3i.A04;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.ChP(new C22030Xtl("onboarding_checklist", f3i.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
        } else {
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = f3i.A04;
            if (businessFlowAnalyticsLogger2 != null) {
                businessFlowAnalyticsLogger2.Ci7(new C22030Xtl("onboarding_checklist", f3i.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
        }
        if (this.A08.equals("profile")) {
            DbZ.A1P(this, 0);
        }
        boolean z2 = this.A0D;
        G8D g8d = this.A0C;
        if (z2) {
            g8d.getClass();
            Dba.A1R(g8d);
            return true;
        } else if (!FG1.A03(g8d)) {
            return false;
        } else {
            A00();
            return true;
        }
    }

    public final void configureActionBar(2da r5) {
        ActionButton ErD = r5.ErD(FPB.A00(this, 57), R.drawable.instagram_x_pano_outline_24);
        ErD.setColorFilter(DbV.A06(requireContext(), 2Yu.A0B(requireContext())));
        ErD.setContentDescription(getString(2131956164));
        if (this.A0D) {
            AnonymousClass3JR A0K = DbV.A0K();
            A0K.A0G = FPB.A00(this, 58);
            A0K.A05 = 2131956164;
            r5.ErG(new AnonymousClass3Jb(A0K));
        }
        this.A0B = r5;
        r5.C7z().setVisibility(8);
    }

    public final void onAttach(Context context) {
        OnboardingCheckListFragment.super.onAttach(context);
        this.A0C = FG1.A01(this);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.F1I, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        G8D g8d;
        G8D g8d2;
        boolean z;
        G8D g8d3;
        int A022 = AnonymousClass0fD.A02(415085458);
        OnboardingCheckListFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = DbX.A0U(this);
        String A0l = DbS.A0l(requireArguments);
        if (A0l == null) {
            A0l = "";
        }
        this.A08 = A0l;
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A0C, this, this.A07);
        this.A01 = new Object();
        this.A03 = new EtT(this.A07);
        this.A02 = new C49538ExN(requireContext());
        this.A00 = AnonymousClass7TF.A0D();
        G8D g8d4 = this.A0C;
        if ((g8d4 == null || g8d4.B6a() != C319586qr.CONVERSION_FLOW) && (((g8d = this.A0C) == null || g8d.B6a() != C319586qr.BUSINESS_SIGNUP_FLOW) && (((g8d2 = this.A0C) == null || g8d2.B6a() != C319586qr.CREATOR_SIGNUP_FLOW) && (!FG1.A03(this.A0C) || (g8d3 = this.A0C) == null || g8d3.E2J() == ConversionStep.RENEW)))) {
            z = false;
        } else {
            z = true;
        }
        this.A0D = z;
        FG1.A02(this.A0C);
        C46383De2 de2 = new C46383De2(this.A07, this);
        this.A05 = de2;
        this.A04 = new F3i(A002, this, de2, this.A07, this.A08);
        AnonymousClass1Nd.A00(this.A07).A01(this.A0E, C321856ur.class);
        F3i f3i = this.A04;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = f3i.A04;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("onboarding_checklist", f3i.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(138482686, A022);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.2tF, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1390027536);
        View inflate = layoutInflater.inflate(R.layout.onboarding_check_list_fragment, viewGroup, false);
        this.mRecyclerView = DbT.A0I(inflate, R.id.recycler_onboarding_check_list);
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A08 = true;
        A0S.A01(new EG2(this, DbY.A1Y(0Tu.A05, this.A07, 36326240684226196L)));
        this.A06 = DbU.A0U(A0S, new Object());
        DbY.A15(this, this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.A06);
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.onboarding_checklist_headline);
        this.mHeadline = A0U;
        A0U.setVisibility(0);
        this.mStepsCompletedTextView = DbU.A0G(inflate, R.id.text_steps_completed);
        this.mProgressBar = (ProgressBar) inflate.requireViewById(R.id.progressbar_loading);
        this.mLayoutContent = DbU.A0C(inflate, R.id.layout_content);
        this.mConfettiView = DbU.A0F(inflate, R.id.image_confetti);
        this.mBusinessNavBar = (BusinessNavBar) inflate.requireViewById(R.id.navigation_bar);
        CallerContext callerContext = FRZ.A00;
        C49538ExN exN = this.A02;
        exN.A00 = this.mConfettiView;
        AnonymousClass61R A002 = C303756Aq.A00(exN.A02, R.raw.countdown_sticker_confetti);
        exN.A01 = A002;
        if (A002 != null) {
            A002.A8s(new FHI(exN, 4));
        }
        ImageView imageView = exN.A00;
        if (imageView != null) {
            imageView.setImageDrawable(exN.A01);
        }
        this.mBusinessNavBar.setPrimaryButtonOnclickListeners(FPB.A00(this, 56));
        AnonymousClass0fD.A09(1573267864, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1164212644);
        super.onDestroy();
        AnonymousClass1Nd.A00(this.A07).A02(this.A0E, C321856ur.class);
        AnonymousClass0fD.A09(41845197, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2086006061);
        super.onDestroyView();
        2da r0 = this.A0B;
        if (r0 != null) {
            r0.C7z().setVisibility(0);
        }
        this.mProgressBar = null;
        this.mLayoutContent = null;
        this.mConfettiView = null;
        AnonymousClass0fD.A09(-1641870030, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(102267022);
        OnboardingCheckListFragment.super.onStart();
        if (this.A08.equals("profile")) {
            DbZ.A1P(this, 8);
        }
        AnonymousClass0fD.A09(-818054959, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        F3i f3i = this.A04;
        List list = f3i.A03;
        if (list == null) {
            f3i.A06.A02(C47697EDg.A00(f3i, 34), f3i.A08);
            return;
        }
        OnboardingCheckListFragment onboardingCheckListFragment = f3i.A05;
        ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
        if (!(progressBar == null || onboardingCheckListFragment.mLayoutContent == null)) {
            progressBar.setVisibility(8);
            onboardingCheckListFragment.mLayoutContent.setVisibility(0);
        }
        f3i.A02(list);
    }
}
