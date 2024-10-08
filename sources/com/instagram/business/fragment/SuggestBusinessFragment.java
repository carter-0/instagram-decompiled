package com.instagram.business.fragment;

import X.1wn;
import X.2dZ;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass3KA;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TG;
import X.C15474UdP;
import X.C17362VSp;
import X.C22030Xtl;
import X.C249403jg;
import X.C320126ro;
import X.C46383De2;
import X.C46864Dmg;
import X.C47697EDg;
import X.C49703F2o;
import X.C50211FTr;
import X.C51925G7t;
import X.C59904JbT;
import X.DbT;
import X.DbU;
import X.DbX;
import X.Dba;
import X.EEJ;
import X.EtU;
import X.F2O;
import X.FG1;
import X.FPB;
import X.FXZ;
import X.G8D;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public class SuggestBusinessFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C51925G7t {
    public C15474UdP A00;
    public BusinessFlowAnalyticsLogger A01;
    public C46383De2 A02;
    public F2O A03;
    public UserSession A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09 = true;
    public int A0A;
    public int A0B;
    public C249403jg A0C = new C46864Dmg(this, 1);
    public C49703F2o A0D;
    public G8D A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public final 1wn A0I = FXZ.A00(this, 10);
    public 2dZ mActionBarService;
    public BusinessNavBar mBusinessNavBar;
    public EEJ mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public IgdsStepperHeader mStepperHeader;

    public static C15474UdP A00(SuggestBusinessFragment suggestBusinessFragment) {
        SuggestBusinessFragment suggestBusinessFragment2 = suggestBusinessFragment;
        C15474UdP udP = suggestBusinessFragment.A00;
        if (udP != null) {
            return udP;
        }
        C15474UdP udP2 = new C15474UdP(suggestBusinessFragment.requireContext(), new EtU(suggestBusinessFragment2), suggestBusinessFragment2, suggestBusinessFragment.A04, suggestBusinessFragment.A0G, suggestBusinessFragment.A0F);
        suggestBusinessFragment2.A00 = udP2;
        return udP2;
    }

    public final void APF() {
    }

    public final void ARL() {
    }

    public final void DZI() {
        this.A09 = false;
        A03(this, "continue", (Map) null);
        G8D g8d = this.A0E;
        if (g8d != null) {
            ((BusinessConversionActivity) g8d).Clz((Bundle) null);
        } else {
            DbT.A1J(this);
        }
    }

    public final void Di0() {
    }

    public final String getModuleName() {
        return "suggest_business_fragment";
    }

    public static void A01(SuggestBusinessFragment suggestBusinessFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ci5(new C22030Xtl("pro_account_suggestions", suggestBusinessFragment.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public static void A02(SuggestBusinessFragment suggestBusinessFragment) {
        if (suggestBusinessFragment.mView != null && suggestBusinessFragment.A07 != null) {
            C15474UdP A002 = A00(suggestBusinessFragment);
            List list = suggestBusinessFragment.A07;
            if (list != null) {
                A002.A00 = list;
                A002.A00();
            }
            List list2 = suggestBusinessFragment.A07;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            for (int i = 0; i < list2.size(); i++) {
                User user = ((C17362VSp) list2.get(i)).A01;
                if (user != null) {
                    builder.add(user);
                    builder2.add(user.getId());
                }
            }
            UserSession userSession = suggestBusinessFragment.A04;
            ImmutableList build = builder.build();
            AnonymousClass7TG.A1N(userSession, build);
            C47697EDg.A01(suggestBusinessFragment, C320126ro.A03(userSession, build), 26);
        }
    }

    public static void A03(SuggestBusinessFragment suggestBusinessFragment, String str, Map map) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("pro_account_suggestions", suggestBusinessFragment.A05, str, (String) null, (String) null, (Map) null, map, (Map) null));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r3) {
        r3.setTitle("");
        C59904JbT.A01(FPB.A00(this, 68), r3, new Object());
        FPB.A02(DbX.A0M(), r3, this, 69);
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A09 || (businessFlowAnalyticsLogger = this.A01) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("pro_account_suggestions", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void onAttach(Context context) {
        SuggestBusinessFragment.super.onAttach(context);
        this.A0E = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1391987609);
        SuggestBusinessFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = DbX.A0U(this);
        this.A05 = DbU.A0l(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A08 = requireArguments.getBoolean("ARG_CHECKLIST_ITEM_COMPLETED", false);
        String string = requireArguments.getString("suggested_business_fetch_entry_point");
        this.A06 = "";
        if (string != null) {
            this.A06 = string;
        }
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A0E, this, this.A04);
        this.A01 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("pro_account_suggestions", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        this.A02 = new C46383De2(this.A04, this);
        this.A03 = new F2O();
        this.A0H = requireArguments.getBoolean("ARG_SHOW_STEPPER_HEADER", false);
        this.A0B = requireArguments.getInt("ARG_STEP_INDEX", -1);
        this.A0A = requireArguments.getInt("ARG_STEP_COUNT", -1);
        this.A0G = requireArguments.getString("ARG_TITLE", requireContext().getString(2131974658));
        this.A0F = requireArguments.getString("ARG_SUB_TITLE", requireContext().getString(2131974657));
        AnonymousClass0fD.A09(-72314051, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1925800858);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.suggest_business_fragment);
        BusinessNavBar businessNavBar = (BusinessNavBar) A0C2.requireViewById(R.id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        EEJ eej = new EEJ(businessNavBar, (C51925G7t) this, 2131968361, -1);
        this.mBusinessNavBarHelper = eej;
        registerLifecycleListener(eej);
        this.mLoadingSpinner = (SpinnerImageView) A0C2.requireViewById(R.id.loading_indicator);
        String A0o = DbX.A0o(this);
        A0o.getClass();
        this.A05 = A0o;
        this.mActionBarService = Dba.A0A(this);
        this.mBusinessNavBar.setVisibility(8);
        G8D g8d = this.A0E;
        if (g8d != null && g8d.E2I() == null) {
            this.mBusinessNavBar.setPrimaryButtonText(2131960992);
        }
        AnonymousClass0fD.A09(1206583995, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-785230903);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass1Nd.A00(this.A04).A02(this.A0I, AnonymousClass3KA.class);
        AnonymousClass0fD.A09(358279542, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView A0K = DbX.A0K(view);
        this.mRecyclerView = A0K;
        A0K.A15(this.A0C);
        if (this.A01 != null) {
            this.A0D = new C49703F2o(this.mRecyclerView, A00(this), this);
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mBusinessNavBar.A01(this.mRecyclerView);
        this.mRecyclerView.setAdapter(A00(this));
        AnonymousClass1Nd.A00(this.A04).A01(this.A0I, AnonymousClass3KA.class);
        if (this.A0H) {
            IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
            this.mStepperHeader = igdsStepperHeader;
            igdsStepperHeader.setVisibility(0);
            this.mStepperHeader.A02(this.A0B, this.A0A);
        }
        if (this.A07 == null) {
            SpinnerImageView spinnerImageView = this.mLoadingSpinner;
            if (!(spinnerImageView == null || this.mBusinessNavBar == null)) {
                spinnerImageView.setVisibility(0);
            }
            this.A03.A00(new C50211FTr(this), this.A04, this, this.A06);
            return;
        }
        A02(this);
    }
}
