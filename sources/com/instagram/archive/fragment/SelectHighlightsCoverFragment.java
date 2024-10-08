package com.instagram.archive.fragment;

import X.0kR;
import X.1NK;
import X.1OO;
import X.2dZ;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1MK;
import X.AnonymousClass36P;
import X.AnonymousClass3LX;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.C226952iF;
import X.C227272iw;
import X.C250563lf;
import X.C254673sr;
import X.C63830L8l;
import X.C64184LSr;
import X.C64878Lje;
import X.C65847M1n;
import X.C71342cb;
import X.DbT;
import X.DbV;
import X.LYC;
import X.U4F;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import java.io.File;

public class SelectHighlightsCoverFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass36P, AnonymousClass1MK, C227272iw {
    public Bitmap A00;
    public U4F A01;
    public C64184LSr A02;
    public C63830L8l A03;
    public UserSession A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = false;
    public C64878Lje A0A;
    public C226952iF A0B = null;
    public PunchedOverlayView mPunchedOverlayView;
    public View mRootView;
    public TouchImageView mTouchImageView;
    public ReboundViewPager mViewPager;

    public final /* synthetic */ void CJ6(Intent intent) {
    }

    public final boolean COC() {
        return true;
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final /* synthetic */ void Ewk(File file, int i) {
    }

    public final String getModuleName() {
        return "reel_highlights_cover_pic";
    }

    public static void A00(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        if (selectHighlightsCoverFragment.A03 != null) {
            1OO A0J = 1NK.A00().A0J(selectHighlightsCoverFragment.A03.A02, "reel_highlights_cover_pic");
            A0J.A02(selectHighlightsCoverFragment);
            C226952iF A002 = A0J.A00();
            selectHighlightsCoverFragment.A0B = A002;
            A002.E5t();
        }
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        TouchImageView touchImageView = this.mTouchImageView;
        if (touchImageView != null && this.A0B == r3 && this.A03 != null) {
            this.A00 = r4.A01;
            touchImageView.post(new C65847M1n(this));
        }
    }

    public final void ExB(Intent intent, int i) {
        C71342cb.A00(this.A04).A0A(requireActivity(), "new_highlight_cover_photo");
        Context context = getContext();
        if (context != null && C250563lf.A0o(context, intent)) {
            0kR.A05(this, intent, i);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r0 >= 10) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r7 = this;
            boolean r0 = r7.A05
            r6 = 0
            if (r0 == 0) goto L_0x0008
            r7.A05 = r6
        L_0x0007:
            return r6
        L_0x0008:
            X.L8l r0 = r7.A03
            if (r0 == 0) goto L_0x0007
            android.graphics.Rect r3 = r0.A00
            com.instagram.common.ui.widget.touchimageview.TouchImageView r0 = r7.mTouchImageView
            android.graphics.Rect r2 = r0.getCropRect()
            int r1 = r3.bottom
            int r0 = r2.bottom
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            r5 = 10
            boolean r0 = X.AnonymousClass7TF.A1T(r0, r5)
            r4 = 1
            if (r0 == 0) goto L_0x0048
            int r1 = r3.left
            int r0 = r2.left
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 >= r5) goto L_0x0048
            int r1 = r3.right
            int r0 = r2.right
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 >= r5) goto L_0x0048
            int r1 = r3.top
            int r0 = r2.top
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 < r5) goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            X.LSr r0 = r7.A02
            X.L8l r0 = r0.A00
            r2 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A04
        L_0x0054:
            if (r3 != 0) goto L_0x005a
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x006e
        L_0x005a:
            X.L8l r0 = r7.A03
            java.lang.String r0 = r0.A03
            boolean r0 = X.2PP.A00(r0, r2)
            if (r0 == 0) goto L_0x006e
            X.L8l r0 = r7.A03
            java.lang.String r0 = r0.A04
            boolean r0 = X.2PP.A00(r0, r1)
            if (r0 != 0) goto L_0x0007
        L_0x006e:
            X.8ab r3 = X.DbW.A0U(r7)
            r0 = 2131975992(0x7f135f38, float:1.9589092E38)
            r3.A09(r0)
            r0 = 2131975991(0x7f135f37, float:1.958909E38)
            r3.A08(r0)
            r0 = 2131960798(0x7f1323de, float:1.9558275E38)
            java.lang.String r2 = r7.getString(r0)
            X.LV3 r1 = X.LV3.A00(r7, r5)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r3.A0Y(r1, r0, r2, r4)
            r3.A05()
            X.DbT.A1V(r3)
            return r4
        L_0x0095:
            r1 = r2
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onBackPressed():boolean");
    }

    public final void configureActionBar(2da r5) {
        if (getContext() != null) {
            r5.Eu4(true);
            r5.setTitle(DbV.A05(this).getString(2131963454));
            2dZ.A0t.A03(requireActivity()).AA9(new LYC((Object) this, 38), 2131960992);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        if (r2.A03 == null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r6 != r0) goto L_0x0073
            r0 = -1
            if (r7 != r0) goto L_0x0073
            if (r8 == 0) goto L_0x0073
            java.lang.String r0 = r8.getAction()
            r0.getClass()
            android.net.Uri r3 = X.JTQ.A09(r0)
            java.lang.String r0 = "pending_media_key"
            java.lang.String r1 = r8.getStringExtra(r0)
            r1.getClass()
            com.instagram.common.session.UserSession r0 = r5.A04
            X.3Q2 r2 = X.JTQ.A0M(r0, r1)
            java.lang.String r0 = r3.getPath()
            r0.getClass()
            android.graphics.Rect r0 = X.1MF.A0H(r0)
            int r1 = r0.width()
            int r0 = r0.height()
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.C253833rU.A00(r3, r1, r0)
            int r1 = r4.A01
            int r0 = r4.A00
            android.graphics.Rect r3 = X.JW0.A01(r1, r0)
            if (r2 == 0) goto L_0x0074
            java.lang.String r2 = r2.A3t
        L_0x0049:
            r1 = 0
            X.L8l r0 = new X.L8l
            r0.<init>(r3, r4, r1, r2)
            r5.A03 = r0
            A00(r5)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r5.mViewPager
            X.L8l r2 = r5.A03
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = r2.A03
            r0 = 1
            if (r1 != 0) goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0Q = r0
            if (r2 == 0) goto L_0x0073
            X.U4F r1 = r5.A01
            java.lang.String r0 = r2.A03
            int r0 = r1.A00(r0)
            r3.A0K(r0)
        L_0x0073:
            return
        L_0x0074:
            r2 = 0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (X.182.A06(X.DbS.A0J(r5, 0), r5, 36329019528134373L) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -341543928(0xffffffffeba47408, float:-3.9762355E26)
            int r2 = X.AnonymousClass0fD.A02(r0)
            com.instagram.archive.fragment.SelectHighlightsCoverFragment.super.onCreate(r7)
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r6)
            r6.A04 = r0
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            boolean r0 = r0.A2S()
            r3 = 0
            if (r0 != 0) goto L_0x002d
            com.instagram.common.session.UserSession r5 = r6.A04
            X.0Tu r4 = X.DbS.A0J(r5, r3)
            r0 = 36329019528134373(0x81110d00033ee5, double:3.037956462587593E-306)
            boolean r1 = X.182.A06(r4, r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            r6.A06 = r0
            com.instagram.common.session.UserSession r0 = r6.A04
            X.LSr r0 = X.C64184LSr.A00(r0)
            r6.A02 = r0
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0047
            X.LSr r1 = r6.A02
            android.content.Context r0 = r6.requireContext()
            r1.A05(r0)
        L_0x0047:
            X.LSr r0 = r6.A02
            X.L8l r0 = r0.A00
            r6.A03 = r0
            android.view.Window r1 = X.DbV.A0G(r6)
            r1.getClass()
            r0 = 48
            r1.setSoftInputMode(r0)
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L_0x006a
            r0 = 1243(0x4db, float:1.742E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x006a
            r3 = 1
        L_0x006a:
            r6.A07 = r3
            r0 = r3 ^ 1
            r6.A08 = r0
            r0 = 1387928429(0x52ba1b6d, float:3.99662023E11)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1037935326);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_highlights_cover_frame_fragment);
        AnonymousClass0fD.A09(-1268641305, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-987346653);
        super.onDestroyView();
        SelectHighlightsCoverFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-1625114656, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(605428199);
        SelectHighlightsCoverFragment.super.onPause();
        Window A0G = DbV.A0G(this);
        A0G.getClass();
        A0G.setSoftInputMode(0);
        AnonymousClass0fD.A09(-1189756124, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00ab, code lost:
        if (r1 == null) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            r5.mRootView = r6
            r0 = 2131438869(0x7f0b2d15, float:1.8499677E38)
            android.view.View r3 = r6.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r3 = (com.instagram.common.ui.widget.imageview.PunchedOverlayView) r3
            r5.mPunchedOverlayView = r3
            android.content.Context r2 = r5.requireContext()
            boolean r1 = r5.A06
            r0 = 2130970861(0x7f0408ed, float:1.7550444E38)
            if (r1 == 0) goto L_0x001e
            r0 = 2130970127(0x7f04060f, float:1.7548955E38)
        L_0x001e:
            int r0 = X.2Yu.A0F(r2, r0)
            r3.A01 = r0
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r0 = r5.mPunchedOverlayView
            r3 = 0
            X.LYT.A00(r0, r3, r5)
            r0 = 2131433959(0x7f0b19e7, float:1.8489718E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.widget.touchimageview.TouchImageView r0 = (com.instagram.common.ui.widget.touchimageview.TouchImageView) r0
            r5.mTouchImageView = r0
            X.Lje r0 = new X.Lje
            r0.<init>()
            r5.A0A = r0
            com.instagram.common.ui.widget.touchimageview.TouchImageView r1 = r5.mTouchImageView
            r1.A06 = r0
            boolean r0 = r5.A06
            r0 = r0 ^ 1
            r1.A0G = r0
            A00(r5)
            r0 = 2131436052(0x7f0b2214, float:1.8493964E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r5.mViewPager = r0
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r4 = r1.getDimensionPixelSize(r0)
            int r0 = X.JTT.A06(r5)
            float r1 = (float) r0
            float r0 = (float) r4
            int r0 = X.JTO.A04(r1, r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            r1.A0C = r4
            int r0 = r0 + -1
            int r0 = r0 / 2
            int r0 = r0 + 2
            r1.A0M(r0, r3)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            r0 = 0
            r1.setPageSpacing(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            X.3TG r0 = X.AnonymousClass3TG.WHEEL_OF_FORTUNE
            r1.setScrollMode(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            X.KI9 r0 = new X.KI9
            r0.<init>(r5)
            r1.A0P(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r5.mViewPager
            r1 = 1065353216(0x3f800000, float:1.0)
            X.4HC r0 = new X.4HC
            r0.<init>(r4, r3, r1)
            r2.A0J = r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            X.Oz7 r0 = new X.Oz7
            r0.<init>(r5, r3)
            r1.A0P(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r5.mViewPager
            X.L8l r0 = r5.A03
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = r0.A03
            r0 = 1
            if (r1 != 0) goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0Q = r0
            X.LSr r0 = r5.A02
            java.util.SortedMap r0 = r0.A07
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            X.Kze r0 = new X.Kze
            r0.<init>(r5)
            X.U4F r1 = new X.U4F
            r1.<init>(r0, r5, r2)
            r5.A01 = r1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r5.mViewPager
            r0.setAdapter((android.widget.Adapter) r1)
            X.L8l r0 = r5.A03
            if (r0 == 0) goto L_0x00e2
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r5.mViewPager
            X.U4F r1 = r5.A01
            java.lang.String r0 = r0.A03
            int r0 = r1.A00(r0)
            r2.A0K(r0)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
