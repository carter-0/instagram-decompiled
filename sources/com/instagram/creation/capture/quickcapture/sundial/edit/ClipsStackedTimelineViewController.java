package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0hq;
import X.0qQ;
import X.0s0;
import X.1Au;
import X.1Av;
import X.2Yu;
import X.AnonymousClass00P;
import X.AnonymousClass030;
import X.AnonymousClass0YZ;
import X.AnonymousClass0fU;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass88B;
import X.AnonymousClass8RF;
import X.AnonymousClass8RH;
import X.AnonymousClass8RL;
import X.AnonymousClass8RU;
import X.AnonymousClass8RV;
import X.AnonymousClass8RW;
import X.AnonymousClass8RX;
import X.AnonymousClass8RY;
import X.AnonymousClass8YU;
import X.C240383Kr;
import X.C339947kR;
import X.C355788Rj;
import X.C355808Rl;
import X.C60108Jfo;
import X.C60415Jl8;
import X.C62517Kh8;
import X.C62636KjH;
import X.C63117Krl;
import X.DbT;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.LPJ;
import X.LQO;
import X.LYG;
import X.MXI;
import X.MXL;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview.AlignmentGuideView;
import java.util.ArrayList;

public final class ClipsStackedTimelineViewController extends LPJ implements MXI {
    public int A00;
    public LinearLayoutManager A01;
    public C60415Jl8 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final AnonymousClass030 A08;
    public final AnonymousClass4DH A09;
    public final UserSession A0A;
    public final MXL A0B;
    public final ClipsTimelineActionBarViewController A0C;
    public final C62517Kh8 A0D;
    public final ClipsCreationViewModel A0E;
    public final AnonymousClass8RL A0F;
    public final AnonymousClass8RF A0G;
    public final C60108Jfo A0H;
    public final AnonymousClass88B A0I;
    public final boolean A0J;
    public IgImageView addClipsFloatingButton;
    public AlignmentGuideView alignmentGuideView;
    public AppBarLayout appBarLayout;
    public View borderLine;
    public View bottomSeekbar;
    public ViewGroup container;
    public View draggableViewCopy;
    public C240383Kr educationNuxFragment;
    public IgTextView helperText;
    public NestedScrollView nestedScrollView;
    public View seekbar;
    public StackedTimelineSpeedActionBar speedActionBar;
    public RecyclerView timeBar;
    public CoordinatorLayout tracksContainer;
    public TextView transitionEffectLabel;
    public View transparentView;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r4 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r0 = r3.A0E.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r0 = r0.A00.A0H.A05.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (X.AnonymousClass7TE.A0M(r0.getValue()) <= 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r3.A0W(r3.A0G.A0E(), r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0 = X.JTQ.A0r(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (X.AnonymousClass7TE.A0M(r0.getValue()) <= 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r3, boolean r4) {
        /*
            r2 = 0
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.addClipsFloatingButton
            if (r4 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x000a
            r0.setVisibility(r2)
        L_0x000a:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0E
            X.8Av r0 = r0.A02
            if (r0 == 0) goto L_0x004e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r0.A0H
            X.8g5 r0 = r0.A05
            X.0Ud r0 = r0.A05
        L_0x0018:
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r1 = 1
            if (r0 > 0) goto L_0x0026
        L_0x0023:
            r1 = 0
            if (r4 == 0) goto L_0x003f
        L_0x0026:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0E
            X.8Av r0 = r0.A02
            if (r0 == 0) goto L_0x0049
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r0.A0H
            X.8g5 r0 = r0.A05
            X.0Ud r0 = r0.A04
        L_0x0034:
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 <= 0) goto L_0x003f
            r2 = 1
        L_0x003f:
            X.8RF r0 = r3.A0G
            X.8RH r0 = r0.A0E()
            r3.A0W(r0, r1, r2)
            return
        L_0x0049:
            X.02z r0 = X.JTQ.A0r(r2)
            goto L_0x0034
        L_0x004e:
            X.02z r0 = X.JTQ.A0r(r2)
            goto L_0x0018
        L_0x0053:
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController.A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController, boolean):void");
    }

    public final void A0R() {
        this.A03 = true;
        NestedScrollView nestedScrollView2 = this.nestedScrollView;
        if (nestedScrollView2 != null) {
            nestedScrollView2.scrollTo(0, this.A00);
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

    public final View A0N() {
        View view = this.seekbar;
        if (view != null) {
            return view;
        }
        0qQ.A0F("seekbar");
        throw AnonymousClass00P.createAndThrow();
    }

    public final RecyclerView A0O() {
        RecyclerView recyclerView = this.timeBar;
        if (recyclerView != null) {
            return recyclerView;
        }
        0qQ.A0F("timeBar");
        throw AnonymousClass00P.createAndThrow();
    }

    public final StackedTimelineSpeedActionBar A0P() {
        StackedTimelineSpeedActionBar stackedTimelineSpeedActionBar = this.speedActionBar;
        if (stackedTimelineSpeedActionBar != null) {
            return stackedTimelineSpeedActionBar;
        }
        0qQ.A0F("speedActionBar");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0Q() {
        this.A0B.APl();
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A0C;
        clipsTimelineActionBarViewController.A04().setEnabled(false);
        clipsTimelineActionBarViewController.A04().getBackground().setAlpha(77);
        clipsTimelineActionBarViewController.A04().setLabelAlpha(0.3f);
    }

    public final void A0U(int i) {
        C60415Jl8 jl8 = this.A02;
        if (jl8 == null) {
            0qQ.A0F("timeBarAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        jl8.A00 = i;
        jl8.notifyItemChanged(jl8.getItemCount() - 1);
    }

    public final void A0V(int i, boolean z) {
        LQO.A02 = i;
        C60415Jl8 jl8 = this.A02;
        if (jl8 != null) {
            int A002 = (i / LQO.A00(LQO.A00, true)) + 1;
            jl8.A01 = A002;
            int i2 = Integer.MAX_VALUE;
            if (!z) {
                int i3 = this.A06;
                Context requireContext = this.A09.requireContext();
                int i4 = LQO.A02;
                int i5 = LQO.A03;
                int i6 = i4 - ((i4 / i5) * i5);
                int i7 = i3 / 2;
                if (A002 % 2 != 1) {
                    i6 -= i5;
                }
                i2 = i7 + C63117Krl.A00(requireContext, i6);
            }
            C60415Jl8 jl82 = this.A02;
            if (jl82 != null) {
                jl82.A02 = this.A06 / 2;
                jl82.A00 = i2;
                jl82.notifyDataSetChanged();
                return;
            }
        }
        0qQ.A0F("timeBarAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0W(AnonymousClass8RH r3, boolean z, boolean z2) {
        MXL mxl;
        if (r3 == null) {
            this.A0B.CLc();
            return;
        }
        if ((r3 instanceof C355788Rj) || (r3 instanceof C355808Rl)) {
            mxl = this.A0B;
            mxl.Eut();
        } else if ((r3 instanceof AnonymousClass8RU) || (r3 instanceof AnonymousClass8RW) || (r3 instanceof AnonymousClass8RV) || (r3 instanceof AnonymousClass8RX) || (r3 instanceof AnonymousClass8RY)) {
            mxl = this.A0B;
            mxl.CLc();
        } else {
            MXL mxl2 = this.A0B;
            mxl2.Eut();
            mxl2.EpS(z);
            mxl2.Ehw(z2);
            return;
        }
        mxl.EpS(false);
        mxl.Ehw(false);
    }

    public final void ADd(AnonymousClass8YU r2) {
        this.A0B.ADd(r2);
    }

    public final AnonymousClass8RH AuZ() {
        return this.A0G.A0E();
    }

    public final int BLy() {
        return this.A07;
    }

    public final void ET9(View.OnClickListener onClickListener) {
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A0C;
        AnonymousClass0fU.A00(LYG.A01(clipsTimelineActionBarViewController, onClickListener, 16), clipsTimelineActionBarViewController.A04());
    }

    public final void Eft(View.OnClickListener onClickListener) {
        this.A0B.Eft(onClickListener);
    }

    public final void EiY(View.OnClickListener onClickListener) {
        ClipsTimelineActionBarViewController.A01(onClickListener, C62636KjH.A0S, this.A0C);
    }

    public final void Eib(View.OnClickListener onClickListener) {
        ClipsTimelineActionBarViewController.A01(onClickListener, C62636KjH.A0e, this.A0C);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof android.view.ViewGroup
            r4 = 0
            if (r0 == 0) goto L_0x0175
            r3 = r8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0008:
            r1 = 0
            if (r3 == 0) goto L_0x0171
            r7.container = r3
            r0 = 2131441686(0x7f0b3816, float:1.850539E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.sundial.edit.StackedTimelineSpeedActionBar r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.StackedTimelineSpeedActionBar) r0
            X.0qQ.A0B(r0, r1)
            r7.speedActionBar = r0
            r0 = 2131442832(0x7f0b3c90, float:1.8507715E38)
            androidx.recyclerview.widget.RecyclerView r5 = X.DbT.A0I(r3, r0)
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x016d
            X.KiI r2 = X.C62585KiI.A05
        L_0x0028:
            X.Jl8 r0 = new X.Jl8
            r0.<init>(r2)
            r7.A02 = r0
            r5.setAdapter(r0)
            android.content.Context r2 = r5.getContext()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController$onViewCreated$1$1$1 r0 = new com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController$onViewCreated$1$1$1
            r0.<init>(r2, r7)
            r7.A01 = r0
            r5.setLayoutManager(r0)
            r7.timeBar = r5
            androidx.recyclerview.widget.RecyclerView r6 = r7.A0O()
            android.content.Context r5 = r3.getContext()
            android.content.res.Resources r2 = r5.getResources()
            r0 = 2131955933(0x7f1310dd, float:1.9548407E38)
            java.lang.CharSequence r0 = r2.getText(r0)
            r6.setContentDescription(r0)
            r0 = 2131436353(0x7f0b2341, float:1.8494574E38)
            android.view.View r0 = r3.requireViewById(r0)
            X.0qQ.A0B(r0, r1)
            r7.seekbar = r0
            r0 = 2131436354(0x7f0b2342, float:1.8494576E38)
            android.view.View r0 = r3.findViewById(r0)
            r7.bottomSeekbar = r0
            r0 = 2131444043(0x7f0b414b, float:1.8510171E38)
            android.view.View r0 = r3.requireViewById(r0)
            X.0qQ.A0B(r0, r1)
            r7.borderLine = r0
            X.Jfo r2 = r7.A0H
            r0 = 44
            X.MMB r0 = X.MMB.A00(r7, r0)
            r7.A0K(r5, r2, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r7.A0E
            X.LPJ.A07(r7, r0, r1)
            r0 = 2131430083(0x7f0b0ac3, float:1.8481857E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r3, r0)
            r7.helperText = r0
            r0 = 2131430095(0x7f0b0acf, float:1.8481881E38)
            android.widget.TextView r0 = X.DbU.A0G(r3, r0)
            X.0qQ.A0B(r0, r1)
            r7.transitionEffectLabel = r0
            r0 = 2131427696(0x7f0b0170, float:1.8477016E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r3, r0)
            r7.addClipsFloatingButton = r0
            if (r0 == 0) goto L_0x00ac
            r0.setVisibility(r1)
        L_0x00ac:
            r0 = 2131430092(0x7f0b0acc, float:1.8481875E38)
            android.view.View r0 = r8.findViewById(r0)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r7.tracksContainer = r0
            r0 = 2131430089(0x7f0b0ac9, float:1.848187E38)
            android.view.View r2 = r8.findViewById(r0)
            com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
            if (r2 == 0) goto L_0x016a
            r0 = 10
            X.C64286LYm.A00(r2, r0, r7)
        L_0x00c7:
            r7.appBarLayout = r2
            r0 = 2131430093(0x7f0b0acd, float:1.8481877E38)
            android.view.View r2 = r8.requireViewById(r0)
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            X.LZU r0 = new X.LZU
            r0.<init>(r7)
            r2.A0B = r0
            r0 = 11
            X.C64286LYm.A00(r2, r0, r7)
            r7.nestedScrollView = r2
            r0 = 2131427991(0x7f0b0297, float:1.8477614E38)
            android.view.View r3 = r3.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview.AlignmentGuideView r3 = (com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview.AlignmentGuideView) r3
            android.content.Context r2 = r3.getContext()
            r0 = 2131100784(0x7f060470, float:1.781396E38)
            int r0 = r2.getColor(r0)
            r3.setVerticalAlignmentGuideColor(r0)
            int r0 = X.JTR.A07(r2)
            r3.setPadding(r1, r0, r1, r1)
            r7.alignmentGuideView = r3
            X.4DH r2 = r7.A09
            boolean r0 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x0111
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            if (r2 == 0) goto L_0x0111
            boolean r0 = r2.A0u
            if (r0 != 0) goto L_0x0111
            r7.A0S()
        L_0x0111:
            r0 = 2131432065(0x7f0b1281, float:1.8485877E38)
            android.view.View r0 = r8.findViewById(r0)
        L_0x0118:
            r7.draggableViewCopy = r0
            if (r8 == 0) goto L_0x0123
            r0 = 2131443175(0x7f0b3de7, float:1.850841E38)
            android.view.View r4 = r8.findViewById(r0)
        L_0x0123:
            r7.transparentView = r4
            X.4DH r0 = r7.A09
            android.content.Context r0 = r0.requireContext()
            boolean r0 = X.0mk.A02(r0)
            if (r0 == 0) goto L_0x0169
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r7.tracksContainer
            if (r0 == 0) goto L_0x0138
            r0.setLayoutDirection(r1)
        L_0x0138:
            com.google.android.material.appbar.AppBarLayout r0 = r7.appBarLayout
            if (r0 == 0) goto L_0x013f
            r0.setLayoutDirection(r1)
        L_0x013f:
            androidx.core.widget.NestedScrollView r0 = r7.nestedScrollView
            if (r0 == 0) goto L_0x0146
            r0.setLayoutDirection(r1)
        L_0x0146:
            com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview.AlignmentGuideView r0 = r7.alignmentGuideView
            if (r0 == 0) goto L_0x014d
            r0.setLayoutDirection(r1)
        L_0x014d:
            if (r8 == 0) goto L_0x015b
            r0 = 2131443665(0x7f0b3fd1, float:1.8509405E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x015b
            r0.setLayoutDirection(r1)
        L_0x015b:
            android.view.View r0 = r7.draggableViewCopy
            if (r0 == 0) goto L_0x0162
            r0.setLayoutDirection(r1)
        L_0x0162:
            android.view.View r0 = r7.transparentView
            if (r0 == 0) goto L_0x0169
            r0.setLayoutDirection(r1)
        L_0x0169:
            return
        L_0x016a:
            r2 = r4
            goto L_0x00c7
        L_0x016d:
            X.KiI r2 = X.C62585KiI.A06
            goto L_0x0028
        L_0x0171:
            if (r8 != 0) goto L_0x0111
            r0 = r4
            goto L_0x0118
        L_0x0175:
            r3 = r4
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public ClipsStackedTimelineViewController(AnonymousClass030 r4, AnonymousClass4DH r5, UserSession userSession, MXL mxl, ClipsTimelineActionBarViewController clipsTimelineActionBarViewController, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RL r10, AnonymousClass8RF r11, C60108Jfo jfo, AnonymousClass88B r13, int i) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A09 = r5;
        this.A0A = userSession;
        this.A0E = clipsCreationViewModel;
        this.A0G = r11;
        this.A0F = r10;
        this.A0H = jfo;
        this.A0I = r13;
        this.A0C = clipsTimelineActionBarViewController;
        this.A0B = mxl;
        this.A06 = i;
        this.A08 = r4;
        boolean A1X = DbT.A1X(r5.requireArguments(), "ARG_IS_BASEL");
        this.A0J = A1X;
        this.A07 = A1X ? R.layout.basel_timeline_editor_stacked_fragment : R.layout.clips_timeline_editor_stacked_fragment_v2;
        this.A0D = C62517Kh8.TIME_MARKER_TRACK;
        this.A03 = A1Y;
    }

    public final void A0S() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession = this.A0A;
        1Av A002 = 1Au.A00(userSession);
        0s0 r0 = A002.A54;
        AnonymousClass0YZ[] r5 = 1Av.A8a;
        if (!AnonymousClass7TG.A1a(A002, r0, r5, 418)) {
            A1C.add(EducationNuxType.A02);
        }
        if (!A1C.isEmpty()) {
            C240383Kr r2 = new C240383Kr();
            DbZ.A1B(r2, "KEY_NUX_TYPES", AnonymousClass7TE.A1D(A1C));
            this.educationNuxFragment = r2;
            0hq childFragmentManager = this.A09.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            r2.A0L(childFragmentManager, "ClipsStackedTimelineEducationNuxFragment");
            if (A1C.contains(EducationNuxType.A02)) {
                1Av A003 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A003, A003.A54, r5, 418, true);
            }
            this.A0H.A0K.A01();
        }
    }

    public final void A0T(float f) {
        IgTextView speedLabel = A0P().getSpeedLabel();
        AnonymousClass4DH r5 = this.A09;
        DbX.A13(r5.requireContext(), speedLabel, C339947kR.A00(f), 2131955846);
        IgTextView speedLabel2 = A0P().getSpeedLabel();
        Context requireContext = r5.requireContext();
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        Context requireContext2 = r5.requireContext();
        int i2 = R.attr.igds_color_creation_tools_yellow;
        if (i == 0) {
            i2 = R.attr.igds_color_primary_text_on_media;
        }
        DbT.A17(requireContext, speedLabel2, 2Yu.A0H(requireContext2, i2));
    }
}
