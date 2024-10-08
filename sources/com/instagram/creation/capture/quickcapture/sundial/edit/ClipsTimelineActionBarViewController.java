package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.07U;
import X.0Aj;
import X.0mk;
import X.0nA;
import X.0qQ;
import X.19B;
import X.1Eo;
import X.27p;
import X.27r;
import X.2eS;
import X.AOX;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass0fU;
import X.AnonymousClass0xx;
import X.AnonymousClass283;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.AnonymousClass80P;
import X.AnonymousClass8RF;
import X.AnonymousClass8RL;
import X.C252243on;
import X.C270354gb;
import X.C296235pj;
import X.C296245pk;
import X.C60065Jeo;
import X.C60109Jfp;
import X.C60422JlF;
import X.C62480KgV;
import X.C62579KiC;
import X.C62636KjH;
import X.C63715L3z;
import X.C66200MIh;
import X.DbS;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.KSE;
import X.LY4;
import X.LYG;
import X.M32;
import X.MHJ;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.actionbar.ClipsTimelineActionBarRecyclerView;
import com.instagram.creation.capture.quickcapture.sundial.edit.views.ClipsTimelineConstraintLayout;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.EnumMap;

public final class ClipsTimelineActionBarViewController implements C252243on {
    public C63715L3z A00;
    public Integer A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final ClipsCreationViewModel A04;
    public final C60109Jfp A05;
    public final AnonymousClass8RL A06;
    public final AnonymousClass8RF A07;
    public final Runnable A08 = new M32(this);
    public final EnumMap A09;
    public final EnumMap A0A;
    public final int A0B;
    public final boolean A0C;
    public ClipsTimelineConstraintLayout actionBarContainer;
    public ClipsTimelineActionBarRecyclerView actionBarRecyclerView;
    public C60422JlF adapter;
    public IgdsMediaButton addGifButton;
    public ViewGroup backButton;
    public IgdsMediaButton cancelButton;
    public IgdsMediaButton creationDoneButton;
    public ViewGroup discardButton;
    public IgdsMediaButton doneButton;
    public LinearLayoutManager linearLayoutManager;
    public IgdsMediaButton reorderDoneButton;

    public ClipsTimelineActionBarViewController(AnonymousClass4DH r3, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C60109Jfp jfp, AnonymousClass8RL r7, AnonymousClass8RF r8, int i, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A02 = r3;
        this.A03 = userSession;
        this.A0B = i;
        this.A0C = z;
        this.A04 = clipsCreationViewModel;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = jfp;
        Class<C62636KjH> cls = C62636KjH.class;
        this.A09 = new EnumMap(cls);
        this.A0A = new EnumMap(cls);
    }

    public static final IgdsMediaButton A00(Context context) {
        IgdsMediaButton igdsMediaButton = new IgdsMediaButton(context, (AttributeSet) null, 0);
        igdsMediaButton.setSize(C296245pk.LARGE);
        igdsMediaButton.setButtonStyle(C296235pj.CREATION_FLOW);
        igdsMediaButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        igdsMediaButton.setVisibility(8);
        return igdsMediaButton;
    }

    public static final void A02(ClipsTimelineActionBarViewController clipsTimelineActionBarViewController, C62480KgV kgV, int i) {
        int A022;
        int i2;
        int i3;
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController2 = clipsTimelineActionBarViewController;
        ClipsTimelineConstraintLayout clipsTimelineConstraintLayout = clipsTimelineActionBarViewController.actionBarContainer;
        if (clipsTimelineConstraintLayout != null) {
            C270354gb A0C2 = JTQ.A0C(clipsTimelineConstraintLayout);
            int i4 = i;
            if (i4 == R.id.action_bar_recycler_view) {
                A022 = 0;
            } else {
                A022 = DbS.A02(AnonymousClass7TE.A0S(clipsTimelineConstraintLayout), 12);
            }
            int ordinal = kgV.ordinal();
            if (ordinal == 0) {
                i3 = 6;
                A0C2.A0E(i4, 6, R.id.action_bar_container, 6, A022);
                if (i4 != R.id.action_bar_recycler_view) {
                    i2 = 7;
                    A0C2.A09(i4, i2);
                    A0C2.A0E(R.id.action_bar_recycler_view, i3, i4, i2, DbS.A02(AnonymousClass7TE.A0S(clipsTimelineConstraintLayout), 3));
                }
            } else if (ordinal == 1) {
                i3 = 7;
                A0C2.A0E(i4, 7, R.id.action_bar_container, 7, A022);
                if (i4 != R.id.action_bar_recycler_view) {
                    i2 = 6;
                    A0C2.A09(i4, i2);
                    A0C2.A0E(R.id.action_bar_recycler_view, i3, i4, i2, DbS.A02(AnonymousClass7TE.A0S(clipsTimelineConstraintLayout), 3));
                }
            } else if (ordinal == 2) {
                A0C2.A0D(i4, 6, R.id.action_bar_container, 6);
                A0C2.A0D(i4, 7, R.id.action_bar_container, 7);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            A0C2.A0G(clipsTimelineActionBarViewController2.actionBarContainer);
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A01(View.OnClickListener onClickListener, C62636KjH kjH, ClipsTimelineActionBarViewController clipsTimelineActionBarViewController) {
        clipsTimelineActionBarViewController.A09.put(kjH, LYG.A01(clipsTimelineActionBarViewController, onClickListener, 13));
    }

    public final ViewGroup A03() {
        ViewGroup viewGroup = this.discardButton;
        if (viewGroup != null) {
            return viewGroup;
        }
        0qQ.A0F("discardButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgdsMediaButton A04() {
        IgdsMediaButton igdsMediaButton = this.creationDoneButton;
        if (igdsMediaButton != null) {
            return igdsMediaButton;
        }
        0qQ.A0F("creationDoneButton");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.L3z, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (view != null) {
            this.actionBarContainer = (ClipsTimelineConstraintLayout) view2.requireViewById(R.id.action_bar_container);
            this.actionBarRecyclerView = (ClipsTimelineActionBarRecyclerView) view2.requireViewById(R.id.action_bar_recycler_view);
            Context context = view2.getContext();
            if (0mk.A02(context)) {
                ClipsTimelineConstraintLayout clipsTimelineConstraintLayout = this.actionBarContainer;
                if (clipsTimelineConstraintLayout != null) {
                    clipsTimelineConstraintLayout.setLayoutDirection(0);
                }
                ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView = this.actionBarRecyclerView;
                if (clipsTimelineActionBarRecyclerView != null) {
                    clipsTimelineActionBarRecyclerView.setLayoutDirection(0);
                }
            }
            0qQ.A07(context);
            AnonymousClass4DH r2 = this.A02;
            FragmentActivity activity = r2.getActivity();
            UserSession userSession = this.A03;
            int i = this.A0B;
            boolean z = this.A0C;
            this.adapter = new C60422JlF(context, activity, userSession, JTO.A1C(this, 33), JTO.A1C(this, 34), new C66200MIh(this, 20), i, z);
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, 0, false);
            this.linearLayoutManager = linearLayoutManager2;
            ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView2 = this.actionBarRecyclerView;
            if (clipsTimelineActionBarRecyclerView2 != null) {
                clipsTimelineActionBarRecyclerView2.setLayoutManager(linearLayoutManager2);
            }
            ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView3 = this.actionBarRecyclerView;
            if (clipsTimelineActionBarRecyclerView3 != null) {
                clipsTimelineActionBarRecyclerView3.setAdapter(this.adapter);
            }
            ClipsTimelineConstraintLayout clipsTimelineConstraintLayout2 = this.actionBarContainer;
            if (clipsTimelineConstraintLayout2 != null) {
                clipsTimelineConstraintLayout2.setVisibility(0);
            }
            ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView4 = this.actionBarRecyclerView;
            if (clipsTimelineActionBarRecyclerView4 != null) {
                clipsTimelineActionBarRecyclerView4.setVisibility(0);
            }
            this.A00 = new Object();
            IgdsMediaButton A002 = A00(context);
            A002.setLabel(A002.getResources().getText(2131955434));
            this.addGifButton = A002;
            27r A012 = 27p.A01(userSession);
            0Aj A0e = AnonymousClass7TE.A0e(A012.A01, AnonymousClass000.A00(1429));
            if (A0e.isSampled()) {
                AnonymousClass7TE.A1W(A0e, "event_type", 1);
                AnonymousClass7TE.A1W(A0e, "entity_type", 7);
                AnonymousClass7TH.A0W(A0e, A012);
                AnonymousClass283 r3 = A012.A04;
                JTP.A1I(A0e, r3);
                A0e.A8M(AnonymousClass80P.THIRD_PARTY_MEDIA, "camera_tool");
                A0e.AAJ("composition_str_id", r3.A0M);
                AnonymousClass7TE.A1V(A0e, r3);
                JTP.A1F(A0e);
                DbS.A1K(A0e, "giphy_clips_grid");
                AnonymousClass7TH.A0V(A0e);
            }
            A01(LY4.A00(this, 51), C62636KjH.A07, this);
            IgdsMediaButton A003 = A00(context);
            A003.setId(R.id.clips_action_bar_cancel_button);
            A003.setLabel(A003.getResources().getText(2131954722));
            this.cancelButton = A003;
            KSE kse = new KSE(context);
            kse.setId(R.id.clips_action_bar_creation_done_button);
            kse.setSize(C296245pk.LARGE);
            C296235pj r4 = C296235pj.PRIMARY;
            kse.setButtonStyle(r4);
            kse.setLabel(kse.getResources().getText(2131960992));
            this.creationDoneButton = kse;
            C60065Jeo jeo = new C60065Jeo(context, C62579KiC.ROUNDED_RECT_COMPACT);
            jeo.setId(R.id.clips_action_bar_discard_button);
            jeo.setButtonStyle(C296235pj.CREATION_FLOW_DESTRUCTIVE);
            jeo.setIconResId(R.drawable.instagram_delete_pano_filled_24);
            jeo.setLabel(jeo.getResources().getText(2131960790));
            JTP.A14(jeo, -2, -1);
            jeo.A02();
            this.discardButton = jeo;
            IgdsMediaButton A004 = A00(context);
            A004.setButtonStyle(r4);
            A004.setLabel(A004.getResources().getText(2131960992));
            this.doneButton = A004;
            AnonymousClass0fU.A00(LYG.A01(this, new AOX((Object) this, 18), 18), A004);
            C60065Jeo jeo2 = new C60065Jeo(context, C62579KiC.ICON_COMPACT);
            jeo2.setId(R.id.clips_action_bar_back_button);
            jeo2.setButtonStyle(C296235pj.CREATION_FLOW);
            jeo2.A01();
            jeo2.setGravity(16);
            JTP.A14(jeo2, -2, -1);
            Context A0S = AnonymousClass7TE.A0S(jeo2);
            int A022 = DbS.A02(A0S, 2);
            0nA.A0i(jeo2, A022, A022);
            int A023 = DbS.A02(A0S, 4);
            0nA.A0h(jeo2, A023, A023);
            C60065Jeo.A00(jeo2);
            this.backButton = jeo2;
            jeo2.setContentDescription(context.getResources().getText(2131955911));
            ViewGroup viewGroup = this.backButton;
            if (viewGroup != null) {
                2eS.A01(viewGroup);
            }
            IgdsMediaButton A005 = A00(context);
            A005.setLabel(A005.getResources().getText(2131960992));
            A005.setButtonStyle(r4);
            this.reorderDoneButton = A005;
            07U r6 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = r2.getViewLifecycleOwner();
            AnonymousClass0xx A006 = AnonymousClass07a.A00(viewLifecycleOwner);
            MHJ A024 = MHJ.A02(viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, 18);
            19B r32 = 19B.A00;
            AnonymousClass07Z A0I = JTP.A0I(r2, r32, A024, A006);
            1Eo.A05(r32, MHJ.A02(A0I, r6, this, (AnonymousClass4D7) null, 19), AnonymousClass07a.A00(A0I));
        }
    }
}
