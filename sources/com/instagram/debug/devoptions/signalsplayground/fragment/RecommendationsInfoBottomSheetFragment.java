package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0fL;
import X.0sL;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass4DH;
import X.AnonymousClass5RD;
import X.AnonymousClass5RM;
import X.AnonymousClass5Z4;
import X.AnonymousClass5Z7;
import X.AnonymousClass5ZD;
import X.AnonymousClass5ZZ;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C252063oV;
import X.C268454dQ;
import X.C273494mf;
import X.C285245Qk;
import X.C286565Wx;
import X.C286575Wy;
import X.C286625Xd;
import X.C287195Zj;
import X.C287215Zl;
import X.C287275Zs;
import X.C287395a4;
import X.C287425a7;
import X.C287435a8;
import X.C287485aD;
import X.C287595aO;
import X.C288035bG;
import X.C288165bT;
import X.C289645dx;
import X.C291805hu;
import X.C291825hw;
import X.C51965G9l;
import X.C51966G9m;
import X.C51967G9n;
import X.C51969G9p;
import X.C51971G9r;
import X.C51972G9s;
import X.C51973G9u;
import X.C62320sa;
import X.DbV;
import X.EVS;
import X.G9t;
import X.G9w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RecommendationsInfoBottomSheetFragment extends AnonymousClass4DH implements C273494mf {
    public static final int $stable = 8;
    public static final Companion Companion = new Object();
    public final String moduleName = "recommendations_info_bottom_sheet";
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    public final class Companion {
        public final RecommendationsInfoBottomSheetFragment newInstance() {
            return new RecommendationsInfoBottomSheetFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public /* synthetic */ void onBottomSheetClosed() {
    }

    public /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public /* synthetic */ void onDragStarted() {
    }

    public /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public /* synthetic */ boolean collapseToPartialStateOnClickXButton() {
        return false;
    }

    public /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* access modifiers changed from: private */
    public final void RecommendationsInfoBottomSheetContent(C286575Wy r9, int i) {
        C286575Wy r6 = r9;
        if (C51967G9n.A1T(r9, 1242257684)) {
            0fL.A01(1988726799, "com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment.RecommendationsInfoBottomSheetContent (RecommendationsInfoBottomSheetFragment.kt:46)");
        }
        Modifier A0F = C51967G9n.A0F(Modifier.A00, 16.0f);
        AnonymousClass5RD A0L = G9w.A0L(C287275Zs.A01(16.0f), r9);
        int A00 = C287425a7.A00(r9);
        C286565Wx r3 = (C286565Wx) r6;
        AnonymousClass5RM A04 = C286565Wx.A04(r3);
        Modifier A01 = C287435a8.A01(r9, A0F);
        C51973G9u.A0y(r9, r3);
        C51971G9r.A12(r9, A0L, A04);
        0sL r1 = C287485aD.A02;
        if (r3.A0K || !C51972G9s.A1Q(r9, A00)) {
            C51971G9r.A13(r9, r1, A00);
        }
        C51965G9l.A18(r9, A01);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_face2_pano_outline_24, 2131957097, 2131957096, r6, 4096);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_face3_pano_outline_24, 2131957095, 2131957094, r6, 4096);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_face4_pano_outline_24, 2131957093, 2131957092, r6, 4096);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_comment_pano_outline_24, 2131957085, 2131957084, r6, 4096);
        if (C51967G9n.A1R(r9)) {
            0fL.A00(-543190006);
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetContent$2(this, i);
        }
    }

    /* access modifiers changed from: private */
    public final void RecommendationsInfoBottomSheetRow(int i, int i2, int i3, C286575Wy r27, int i4) {
        int i5;
        C286575Wy r4 = r27;
        r4.ExV(-1003933104);
        int i6 = i4;
        if ((i4 & 14) == 0) {
            i5 = G9t.A05(r4, i) | i4;
        } else {
            i5 = i6;
        }
        int i7 = i2;
        if ((i4 & 112) == 0) {
            i5 |= G9t.A06(r4, i7);
        }
        int i8 = i3;
        if ((i6 & 896) == 0) {
            i5 |= G9t.A07(r4, i8);
        }
        if ((i5 & 731) != 146 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2018478532, "com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment.RecommendationsInfoBottomSheetRow (RecommendationsInfoBottomSheetFragment.kt:71)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(r5, 16.0f, 0.0f);
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A01(16.0f), r4, C287215Zl.A05);
            int A002 = C287425a7.A00(r4);
            C286565Wx r9 = (C286565Wx) r4;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r4, A09);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r4, r9, r8);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A00, A04, r7);
            0sL r1 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r1, A002);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            C286575Wy r16 = r4;
            C288165bT.A00(r16, (Modifier) null, C51966G9m.A0Y(r4, i5, i), 56, 20, C51966G9m.A0G(r4));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r4, 0);
            int A003 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r4, r5);
            C51973G9u.A0z(r4, r9, r8);
            C287595aO.A00(r4, A0Z, r7);
            if (C51965G9l.A1Y(r4, r9, A042, A0w) || !C51972G9s.A1Q(r4, A003)) {
                C51971G9r.A13(r4, r1, A003);
            }
            C287595aO.A00(r4, A012, A1K);
            String A004 = C288035bG.A00(r4, i7);
            AnonymousClass5ZZ.A0W(r16, C287195Zj.A0A(r5, 0.0f, 0.0f, 0.0f), AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0h(r4), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16646143, 0, 0, 0, AnonymousClass5Z7.A01(18)), A004, C51966G9m.A0H(r4));
            AnonymousClass5ZZ.A0r(r4, AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0c(r4), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16646143, 0, 0, 0, AnonymousClass5Z7.A01(18)), C288035bG.A00(r4, i8), C51966G9m.A0M(r4));
            if (C51971G9r.A1R(r4)) {
                0fL.A00(596363016);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetRow$2(this, i, i2, i3, i6);
        }
    }

    public /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-748029230);
        ComposeView A0H = DbV.A0H(this, new RecommendationsInfoBottomSheetFragment$onCreateView$1(this), -1415700585);
        AnonymousClass0fD.A09(1895971072, A02);
        return A0H;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
