package com.instagram.igds.components.bottomsheet;

import X.0Tu;
import X.0hq;
import X.0j8;
import X.0nA;
import X.0qQ;
import X.0s1;
import X.0wb;
import X.0xF;
import X.182;
import X.1Zm;
import X.1Zp;
import X.2dY;
import X.2dZ;
import X.2da;
import X.2db;
import X.AnonymousClass03Q;
import X.AnonymousClass05K;
import X.AnonymousClass06Q;
import X.AnonymousClass06S;
import X.AnonymousClass0Dg;
import X.AnonymousClass0Ke;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass37D;
import X.AnonymousClass37F;
import X.AnonymousClass4DH;
import X.AnonymousClass4DJ;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass57Z;
import X.AnonymousClass90A;
import X.C12926TDp;
import X.C14119TqE;
import X.C14125TqK;
import X.C226112fe;
import X.C227642jf;
import X.C227842k3;
import X.C249443jn;
import X.C249453jo;
import X.C252063oV;
import X.C262944Gp;
import X.C268594df;
import X.C268604dg;
import X.C273494mf;
import X.C331127Pr;
import X.C331157Pu;
import X.C331167Pv;
import X.C331177Pw;
import X.C331187Px;
import X.C331197Py;
import X.C332277Ui;
import X.C53033GhO;
import X.C73589PgP;
import X.FN1;
import X.FN2;
import X.NJ8;
import X.U1A;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;

public final class BottomSheetFragment extends AnonymousClass4DH implements AnonymousClass4DR, C268594df, C249453jo, AnonymousClass4DS {
    public int A00;
    public int A01;
    public C331157Pu A02;
    public C331127Pr A03;
    public C249443jn A04 = new C331177Pw(this);
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public 0xF A09;
    public U1A A0A;
    public Boolean A0B;
    public boolean A0C;
    public final Stack A0D = new Stack();
    public final Stack A0E = new Stack();
    public final View.OnClickListener A0F = new C331167Pv(this);
    public final AnonymousClass03Q A0G = new C331197Py(this);
    public final AnonymousClass06Q A0H = new C331187Px(this);
    public final AnonymousClass0eM A0I = C227642jf.A01(this);
    public 2dZ _actionBarService;
    public IgdsBottomButtonLayout bottomButton;
    public ViewGroup bottomSheetContainer;
    public C252063oV buttonContainer;
    public TouchInterceptorFrameLayout contentView;
    public IgFrameLayout dragHandleFrame;
    public ImageView dragHandleView;
    public ImageView dragHandleViewPrism;
    public C252063oV elementAboveTitleView;
    public C252063oV leftNavButtonIcon;
    public C252063oV leftNavButtonText;
    public C252063oV navBarDivider;
    public Guideline navButtonEndGuideline;
    public Guideline navButtonStartGuideline;
    public C252063oV rightLoadingSpinnerIcon;
    public C252063oV rightNavButtonIcon;
    public C252063oV rightNavButtonText;
    public C252063oV secondaryRightNavButtonIcon;
    public C252063oV subtitleTextView;
    public ViewGroup titleAndNavContainer;
    public C252063oV titleTextView;

    public static final void A0E(BottomSheetFragment bottomSheetFragment, CharSequence charSequence, CharSequence charSequence2) {
        C252063oV r4;
        View view;
        Context context;
        int i;
        TextView textView;
        if (charSequence == null || charSequence.length() == 0) {
            C252063oV r0 = bottomSheetFragment.titleTextView;
            if (r0 != null) {
                0nA.A0i(r0.getView(), 0, 0);
                return;
            }
            return;
        }
        if (charSequence2 == null || charSequence2.length() == 0) {
            C252063oV r1 = bottomSheetFragment.subtitleTextView;
            if (r1 != null) {
                r1.setVisibility(8);
            }
            r4 = bottomSheetFragment.titleTextView;
            if (r4 != null) {
                view = r4.getView();
                context = r4.getView().getContext();
                0qQ.A07(context);
                i = 11;
            } else {
                return;
            }
        } else {
            C252063oV r02 = bottomSheetFragment.subtitleTextView;
            if (r02 != null) {
                r02.setVisibility(0);
            }
            C252063oV r03 = bottomSheetFragment.subtitleTextView;
            if (!(r03 == null || (textView = (TextView) r03.getView()) == null)) {
                textView.setText(charSequence2);
            }
            r4 = bottomSheetFragment.titleTextView;
            if (r4 != null) {
                view = r4.getView();
                context = r4.getView().getContext();
                0qQ.A07(context);
                i = 6;
            } else {
                return;
            }
        }
        int A042 = (int) 0nA.A04(context, i);
        Context context2 = r4.getView().getContext();
        0qQ.A07(context2);
        0nA.A0i(view, A042, (int) 0nA.A04(context2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r3.length() == 0) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c2, code lost:
        if (r9.isElementAboveTitleEnabled() != true) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(android.content.Context r12, androidx.fragment.app.Fragment r13, int r14) {
        /*
            r11 = this;
            r8 = 0
            X.0qQ.A0B(r12, r8)
            r7 = 1
            boolean r0 = A0J(r11)
            if (r0 == 0) goto L_0x024a
            r11.A00 = r8
            X.7Pr r6 = A00(r11)
            java.lang.Boolean r2 = r6.A0Z
            r0 = 0
            if (r2 == 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x0299
            android.view.ViewGroup r1 = r11.bottomSheetContainer
            if (r1 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0296
            boolean r0 = r2.booleanValue()
        L_0x0025:
            r1.setFitsSystemWindows(r0)
        L_0x0028:
            java.lang.CharSequence r3 = r6.A0d
            if (r3 == 0) goto L_0x0033
            int r0 = r3.length()
            r2 = 0
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            r1 = 8
            X.3oV r0 = r11.titleTextView
            if (r2 != 0) goto L_0x0288
            if (r0 == 0) goto L_0x003f
            r0.setVisibility(r8)
        L_0x003f:
            X.3oV r0 = r11.titleTextView
            if (r0 == 0) goto L_0x004e
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x004e
            r0.setText(r3)
        L_0x004e:
            X.3oV r0 = r11.titleTextView
            if (r0 == 0) goto L_0x005f
            android.view.View r2 = r0.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x005f
            int r0 = r6.A0C
            r2.setMaxLines(r0)
        L_0x005f:
            X.3oV r0 = r11.titleTextView
            if (r0 == 0) goto L_0x006a
            android.view.View r0 = r0.getView()
            X.2eQ.A03(r0)
        L_0x006a:
            int r2 = r6.A0E
            if (r2 != 0) goto L_0x0079
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r12, r0)
            int r2 = r12.getColor(r0)
        L_0x0079:
            X.3oV r0 = r11.titleTextView
            if (r0 == 0) goto L_0x0088
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0088
            r0.setTextColor(r2)
        L_0x0088:
            android.view.View$OnClickListener r0 = r6.A0M
            if (r0 == 0) goto L_0x026f
            X.3oV r0 = r11.titleTextView
            if (r0 == 0) goto L_0x009b
            android.view.View r2 = r0.getView()
            if (r2 == 0) goto L_0x009b
            android.view.View$OnClickListener r0 = r6.A0M
        L_0x0098:
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x009b:
            java.lang.CharSequence r0 = r6.A0c
            A0E(r11, r3, r0)
        L_0x00a0:
            r11.A04(r12, r6, r14)
            A0A(r11)
            r10 = 0
            int r4 = r6.A06
            if (r4 != 0) goto L_0x00b6
            r0 = 2130970208(0x7f040660, float:1.754912E38)
            int r0 = X.2Yu.A0H(r12, r0)
            int r4 = r12.getColor(r0)
        L_0x00b6:
            r11.A02()
            X.4mf r9 = r6.A0T
            if (r9 == 0) goto L_0x00c4
            boolean r0 = r9.isElementAboveTitleEnabled()
            r3 = 1
            if (r0 == r7) goto L_0x00c5
        L_0x00c4:
            r3 = 0
        L_0x00c5:
            r2 = 0
            X.3oV r0 = r11.elementAboveTitleView
            if (r3 == 0) goto L_0x0266
            if (r0 == 0) goto L_0x00cf
            r0.setVisibility(r8)
        L_0x00cf:
            X.3oV r0 = r11.elementAboveTitleView
            if (r0 == 0) goto L_0x00d6
            r9.configureElementAboveTitle(r0)
        L_0x00d6:
            android.view.ViewGroup r3 = r11.bottomSheetContainer
            if (r3 == 0) goto L_0x00f5
            android.graphics.drawable.Drawable r0 = r6.A0I
            if (r0 != 0) goto L_0x00f2
            boolean r1 = X.C61670oa.A04()
            r0 = 2130968778(0x7f0400ca, float:1.754622E38)
            if (r1 == 0) goto L_0x00ea
            r0 = 2130968779(0x7f0400cb, float:1.7546221E38)
        L_0x00ea:
            int r0 = X.2Yu.A0H(r12, r0)
            android.graphics.drawable.Drawable r0 = r12.getDrawable(r0)
        L_0x00f2:
            r3.setBackground(r0)
        L_0x00f5:
            android.graphics.drawable.Drawable r1 = r6.A0J
            if (r1 == 0) goto L_0x0100
            android.view.ViewGroup r0 = r11.titleAndNavContainer
            if (r0 == 0) goto L_0x0100
            r0.setBackground(r1)
        L_0x0100:
            android.graphics.drawable.Drawable r1 = r6.A0H
            if (r1 == 0) goto L_0x010b
            com.instagram.common.ui.base.IgFrameLayout r0 = r11.dragHandleFrame
            if (r0 == 0) goto L_0x010b
            r0.setBackground(r1)
        L_0x010b:
            android.view.View r0 = r6.A0N
            if (r0 == 0) goto L_0x024e
            android.view.ViewGroup r9 = r11.bottomSheetContainer
            if (r9 == 0) goto L_0x02b4
            android.view.View[] r1 = new android.view.View[]{r0}
            java.lang.String r0 = "BottomSheetFragment"
            X.Vc0 r3 = new X.Vc0
            r3.<init>(r9, r0, r1)
            r3.A03 = r4
            r0 = 2130968787(0x7f0400d3, float:1.7546238E38)
            int r0 = X.2Yu.A0G(r12, r0)
            r3.A04 = r0
            X.U1A r1 = new X.U1A
            r1.<init>(r3)
            r11.A0A = r1
            android.view.ViewGroup r0 = r11.bottomSheetContainer
            if (r0 == 0) goto L_0x0137
            r0.setBackground(r1)
        L_0x0137:
            X.U1A r0 = r11.A0A
            if (r0 == 0) goto L_0x013e
            r0.setVisible(r7, r8)
        L_0x013e:
            X.3oV r0 = r11.buttonContainer
            if (r0 == 0) goto L_0x0151
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L_0x0151
            r0 = 2131428897(0x7f0b0621, float:1.8479451E38)
            android.view.View r2 = r1.findViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r2
        L_0x0151:
            r11.bottomButton = r2
            r11.A07(r6)
            boolean r2 = r6.A16
            android.view.ViewGroup r10 = r11.bottomSheetContainer
            boolean r0 = r10 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r10, r0)
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            X.4gb r9 = new X.4gb
            r9.<init>()
            r9.A0I(r10)
            r4 = 2131428954(0x7f0b065a, float:1.8479567E38)
            r3 = 2131428949(0x7f0b0655, float:1.8479557E38)
            r1 = 3
            r0 = 4
            r9.A0C(r4, r0, r3, r1)
            r9.A0C(r3, r0, r8, r0)
            r9.A0G(r10)
        L_0x017e:
            boolean r0 = A0K(r11)
            if (r0 != 0) goto L_0x01a1
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r11.contentView
            if (r0 == 0) goto L_0x024b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0191
            r0 = -2
            r1.height = r0
        L_0x0191:
            boolean r0 = r1 instanceof X.C71492dQ
            if (r0 == 0) goto L_0x019a
            r0 = r1
            X.2dQ r0 = (X.C71492dQ) r0
            r0.A10 = r2
        L_0x019a:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r11.contentView
            if (r0 == 0) goto L_0x01a1
            r0.setLayoutParams(r1)
        L_0x01a1:
            X.4Gp r9 = r6.A0X
            X.3jn r0 = r11.A04
            X.37D r2 = r0.getBottomSheetNavigator()
            if (r2 == 0) goto L_0x02ae
            r3 = r2
            X.37F r3 = (X.AnonymousClass37F) r3
            r3.A09 = r13
            int[] r0 = r6.A1T
            r4 = 0
            if (r0 != 0) goto L_0x01b6
            r4 = 1
        L_0x01b6:
            X.7Pr r0 = A00(r11)
            boolean r1 = r0.A1O
            X.GPw r0 = new X.GPw
            r0.<init>(r4, r4, r1)
            r2.A0O(r0)
            if (r9 == 0) goto L_0x01cc
            r2.A0R(r9)
            r2.A0Q(r9)
        L_0x01cc:
            boolean r0 = r6.A19
            if (r0 != 0) goto L_0x01d7
            X.Pzn r0 = r3.A0D
            if (r0 == 0) goto L_0x01d7
            r0.A0I(r8)
        L_0x01d7:
            boolean r0 = r6.A0z
            r3.A0i = r0
            java.lang.Boolean r1 = r11.A0B
            if (r1 == 0) goto L_0x01f1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01f1
            boolean r0 = A0K(r11)
            if (r0 != 0) goto L_0x01f1
            r6.A19 = r7
        L_0x01f1:
            android.widget.ImageView r0 = r11.dragHandleView
            if (r0 == 0) goto L_0x01fc
            int r0 = r0.getVisibility()
            A0D(r11, r0)
        L_0x01fc:
            boolean r0 = r6.A1H
            if (r0 == 0) goto L_0x0208
            X.NgE r0 = new X.NgE
            r0.<init>(r6, r11, r2)
            r2.A0Q(r0)
        L_0x0208:
            java.lang.Boolean r0 = r6.A0a
            r11.A0B = r0
            X.0wW r5 = r11.getSession()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36326932173830230(0x810f2700003856, double:3.036636411320552E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r3.A0Z = r0
            boolean r0 = r6.A0k
            r3.A0N = r0
            boolean r0 = r6.A1D
            r3.A0f = r0
            boolean r0 = r6.A18
            r3.A0c = r0
            boolean r0 = r6.A1P
            r3.A0m = r0
            boolean r0 = r6.A1Q
            r3.A0n = r0
            boolean r0 = r6.A15
            r3.A0a = r0
            X.7Pr r0 = r11.A03
            if (r0 == 0) goto L_0x024a
            boolean r0 = r0.A0m
            if (r0 != r7) goto L_0x024a
            X.OkS r1 = new X.OkS
            r1.<init>(r12, r11, r2)
            X.NgF r0 = new X.NgF
            r0.<init>(r1, r11, r2)
            r2.A0Q(r0)
        L_0x024a:
            return
        L_0x024b:
            r1 = 0
            goto L_0x0191
        L_0x024e:
            android.view.ViewGroup r0 = r11.bottomSheetContainer
            if (r0 == 0) goto L_0x02c0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x02ba
            android.graphics.drawable.Drawable r1 = r0.mutate()
            X.0qQ.A07(r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r4, r0)
            goto L_0x013e
        L_0x0266:
            if (r0 == 0) goto L_0x026b
            r0.setVisibility(r1)
        L_0x026b:
            r11.elementAboveTitleView = r10
            goto L_0x00d6
        L_0x026f:
            boolean r0 = r13 instanceof X.C227252iu
            if (r0 == 0) goto L_0x009b
            X.4mf r0 = r6.A0T
            if (r0 == 0) goto L_0x009b
            X.3oV r0 = r11.titleTextView
            if (r0 == 0) goto L_0x009b
            android.view.View r2 = r0.getView()
            if (r2 == 0) goto L_0x009b
            X.7d0 r0 = new X.7d0
            r0.<init>(r13, r6)
            goto L_0x0098
        L_0x0288:
            if (r0 == 0) goto L_0x028d
            r0.setVisibility(r1)
        L_0x028d:
            X.3oV r0 = r11.subtitleTextView
            if (r0 == 0) goto L_0x00a0
            r0.setVisibility(r1)
            goto L_0x00a0
        L_0x0296:
            r0 = 0
            goto L_0x0025
        L_0x0299:
            android.graphics.Rect r0 = r6.A0G
            if (r0 == 0) goto L_0x0028
            android.view.ViewGroup r4 = r11.bottomSheetContainer
            if (r4 == 0) goto L_0x0028
            int r3 = r0.left
            int r2 = r0.top
            int r1 = r0.right
            int r0 = r0.bottom
            r4.setPadding(r3, r2, r1, r0)
            goto L_0x0028
        L_0x02ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x02b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x02ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x02c0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.A0U(android.content.Context, androidx.fragment.app.Fragment, int):void");
    }

    public final void A0V(Fragment fragment, C331127Pr r10, boolean z, boolean z2, boolean z3) {
        View view;
        Integer num;
        ViewGroup.LayoutParams layoutParams;
        0qQ.A0B(fragment, 0);
        if (A0I(this) && (view = this.mView) != null && view.findViewById(R.id.bottom_sheet_container_view) != null) {
            Bundle bundle = fragment.mArguments;
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.getString("IgSessionManager.SESSION_TOKEN_KEY") == null) {
                AnonymousClass0Dg.A00(bundle, r10.A1V);
                fragment.setArguments(bundle);
            }
            0s1 r2 = new 0s1(getChildFragmentManager());
            if (z) {
                String str = r10.A0f;
                if (str == null || str.length() == 0) {
                    str = fragment.getClass().getSimpleName();
                }
                r2.A0I(str);
            }
            if (this.A0C) {
                if (A0M() == null || AnonymousClass0Ke.A00(requireContext()) <= 2012) {
                    r10.A1U = null;
                } else {
                    r10.A03();
                }
            }
            int[] iArr = r10.A1U;
            if (iArr != null) {
                r2.A07(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            if (fragment instanceof AnonymousClass4DJ) {
                AnonymousClass4DJ r1 = (AnonymousClass4DJ) fragment;
                r1.registerLifecycleListener(new C14125TqK(r1, this));
            }
            String canonicalName = fragment.getClass().getCanonicalName();
            if (z3) {
                r2.A0C(fragment, canonicalName, R.id.bottom_sheet_container_view);
            } else {
                r2.A0D(fragment, canonicalName, R.id.bottom_sheet_container_view);
            }
            r2.A00();
            if (z2) {
                getChildFragmentManager().A0a();
            }
            this.A03 = r10;
            this.A05 = z;
            if (z) {
                this.A0D.push(r10);
                Stack stack = this.A0E;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.contentView;
                if (touchInterceptorFrameLayout == null || (layoutParams = touchInterceptorFrameLayout.getLayoutParams()) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(layoutParams.height);
                }
                stack.push(num);
            }
            A0H(this);
            A0U(getThemedContext(), fragment, getChildFragmentManager().A0M());
        }
    }

    public final boolean AB6() {
        return true;
    }

    public final int AhP(Context context) {
        0qQ.A0B(context, 0);
        int i = A00(this).A0F;
        if (i == 0) {
            return ViewConfiguration.get(context).getScaledTouchSlop();
        }
        return i;
    }

    public final void DMt() {
        this.A08 = false;
        if (A0J(this) && !A00(this).A0x && !A0G()) {
            A03(0);
        }
        if (isAdded()) {
            C268604dg A0M = A0M();
            if (A0M instanceof C268604dg) {
                A0M.DMt();
            }
        }
    }

    public final void DMu(int i) {
        this.A08 = true;
        if (!A00(this).A0x && !A0G()) {
            A03(i);
        }
        if (isAdded()) {
            C268604dg A0M = A0M();
            if (A0M instanceof C268604dg) {
                A0M.DMu(i);
            }
        }
    }

    public final void configureActionBar(2da r21) {
        2da r3 = r21;
        0qQ.A0B(r3, 0);
        AnonymousClass4DS A0M = A0M();
        if (A0M == null || !(A0M instanceof AnonymousClass4DS)) {
            r3.Etr(false);
        } else {
            r3.Etr(true);
            r3.ENd(new ColorDrawable(requireContext().getColor(R.color.fds_transparent)));
            A0M.configureActionBar(r3);
            C252063oV r1 = this.navBarDivider;
            if (!(!((2dZ) r3).A0A || r1 == null || this.contentView == null)) {
                r1.setVisibility(0);
                A0B(this);
            }
        }
        if (A0J(this) && !2db.A09() && A00(this).A0B != 0) {
            r3.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, requireContext().getColor(A00(this).A0B), -2, -2, -2, -2, -2, false));
        }
    }

    public final String getModuleName() {
        return "bottom_sheet_component";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        BottomSheetFragment.super.onAttach(context);
        getChildFragmentManager().A0s(this.A0H);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        if (r3.A1R != true) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r1 = 0
            X.0qQ.A0B(r6, r1)
            super.onViewCreated(r6, r7)
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0011
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A06(r0)
        L_0x0011:
            r0 = 2131428952(0x7f0b0658, float:1.8479563E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.bottomSheetContainer = r0
            r5.A06(r0)
            r0 = 2131428954(0x7f0b065a, float:1.8479567E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r5.contentView = r0
            r0 = 2131436801(0x7f0b2501, float:1.8495483E38)
            android.view.View r0 = r6.requireViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r5.navButtonStartGuideline = r0
            r0 = 2131436800(0x7f0b2500, float:1.849548E38)
            android.view.View r0 = r6.requireViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r5.navButtonEndGuideline = r0
            r0 = 2131428968(0x7f0b0668, float:1.8479595E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = (com.instagram.common.ui.base.IgFrameLayout) r0
            r5.dragHandleFrame = r0
            boolean r2 = X.C61670oa.A04()
            r0 = 2131428967(0x7f0b0667, float:1.8479593E38)
            if (r2 == 0) goto L_0x0057
            r0 = 2131428969(0x7f0b0669, float:1.8479597E38)
        L_0x0057:
            android.view.View r0 = r6.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.dragHandleView = r0
            if (r0 == 0) goto L_0x0064
            r0.setVisibility(r1)
        L_0x0064:
            X.7Pr r3 = r5.A03
            r4 = 1
            if (r3 == 0) goto L_0x006e
            boolean r2 = r3.A1R
            r0 = 1
            if (r2 == r4) goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x01fe
            boolean r0 = r3.A0p
            if (r0 != 0) goto L_0x01fe
        L_0x0079:
            r0 = 2131436802(0x7f0b2502, float:1.8495485E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.titleAndNavContainer = r0
            r0 = 2131442901(0x7f0b3cd5, float:1.8507855E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.titleTextView = r0
            r0 = 2131442065(0x7f0b3991, float:1.850616E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.subtitleTextView = r0
            r0 = 2131428971(0x7f0b066b, float:1.8479602E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.elementAboveTitleView = r0
            r0 = 2131428989(0x7f0b067d, float:1.8479638E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.navBarDivider = r0
            r0 = 2131428949(0x7f0b0655, float:1.8479557E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.buttonContainer = r0
            r0 = 2131429011(0x7f0b0693, float:1.8479683E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.leftNavButtonIcon = r0
            r0 = 2131429012(0x7f0b0694, float:1.8479685E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.leftNavButtonText = r0
            r0 = 2131428973(0x7f0b066d, float:1.8479606E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.rightNavButtonIcon = r0
            r0 = 2131428974(0x7f0b066e, float:1.8479608E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.rightNavButtonText = r0
            r0 = 2131429010(0x7f0b0692, float:1.847968E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.secondaryRightNavButtonIcon = r0
            r0 = 2131428972(0x7f0b066c, float:1.8479604E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            r5.rightLoadingSpinnerIcon = r0
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.2eO.A00(r0)
            if (r0 == 0) goto L_0x0159
            X.3oV r0 = r5.leftNavButtonIcon
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.getView()
            X.2eS.A01(r0)
            X.3oV r0 = r5.rightNavButtonIcon
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.getView()
            X.2eS.A01(r0)
            X.3oV r0 = r5.secondaryRightNavButtonIcon
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.getView()
            X.2eS.A01(r0)
            X.3oV r0 = r5.leftNavButtonText
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.getView()
            X.2eS.A01(r0)
            X.3oV r0 = r5.rightNavButtonText
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.getView()
            X.2eS.A01(r0)
        L_0x0159:
            boolean r0 = A0J(r5)
            if (r0 == 0) goto L_0x017c
            X.7Pr r0 = A00(r5)
            int r0 = r0.A0D
            if (r0 == 0) goto L_0x017c
            X.3oV r0 = r5.titleTextView
            if (r0 == 0) goto L_0x017c
            android.view.View r1 = r0.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x017c
            X.7Pr r0 = A00(r5)
            int r0 = r0.A0D
            r1.setTextAppearance(r0)
        L_0x017c:
            android.view.ViewGroup r3 = r5.bottomSheetContainer
            if (r3 == 0) goto L_0x020d
            X.03Q r0 = r5.A0G
            X.AnonymousClass03j.A00(r3, r0)
            boolean r0 = A0J(r5)
            if (r0 == 0) goto L_0x019b
            X.7Pr r0 = r5.A03
            if (r0 == 0) goto L_0x0207
            boolean r0 = r0.A17
            if (r0 == 0) goto L_0x019b
            X.PWe r0 = new X.PWe
            r0.<init>(r3)
            X.0nA.A0r(r3, r0)
        L_0x019b:
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.2eO.A00(r0)
            if (r0 == 0) goto L_0x01d1
            android.widget.ImageView r1 = r5.dragHandleView
            if (r1 == 0) goto L_0x01b1
            X.FLO r0 = new X.FLO
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x01b1:
            android.widget.ImageView r2 = r5.dragHandleView
            r0 = 500(0x1f4, double:2.47E-321)
            X.2eQ.A06(r2, r0)
            android.widget.ImageView r0 = r5.dragHandleView
            if (r0 == 0) goto L_0x01bf
            r0.setImportantForAccessibility(r4)
        L_0x01bf:
            android.widget.ImageView r2 = r5.dragHandleView
            if (r2 == 0) goto L_0x01d1
            android.content.Context r1 = r5.requireContext()
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
        L_0x01d1:
            X.Pzv r0 = new X.Pzv
            r0.<init>(r5)
            r3.addOnLayoutChangeListener(r0)
            r5.A0O()
            boolean r0 = A0J(r5)
            if (r0 == 0) goto L_0x01fd
            X.7Pr r0 = A00(r5)
            boolean r0 = r0.A1F
            if (r0 == 0) goto L_0x01fd
            android.content.Context r0 = r5.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r3.setElevation(r0)
        L_0x01fd:
            return
        L_0x01fe:
            android.widget.ImageView r0 = r5.dragHandleView
            if (r0 == 0) goto L_0x0213
            X.0nA.A0X(r0, r1)
            goto L_0x0079
        L_0x0207:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x020d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0213:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A03(int i) {
        ViewGroup viewGroup;
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.bottomButton;
        if (igdsBottomButtonLayout == null || igdsBottomButtonLayout.getVisibility() != 0) {
            viewGroup = this.contentView;
        } else {
            viewGroup = this.bottomSheetContainer;
        }
        if (viewGroup != null && isAdded()) {
            0nA.A0X(viewGroup, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:322:0x03ce, code lost:
        if (r1 != null) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0444, code lost:
        if (r1 != null) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.CVM() != true) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0266 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(android.content.Context r11, X.C331127Pr r12, int r13) {
        /*
            r10 = this;
            X.3oV r4 = r10.leftNavButtonText
            r5 = 1
            if (r4 == 0) goto L_0x000c
            boolean r1 = r4.CVM()
            r0 = 1
            if (r1 == r5) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0033
            if (r4 == 0) goto L_0x001f
            android.view.View r0 = r4.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x001f
            r0.setText(r3)
        L_0x001f:
            X.3oV r0 = r10.leftNavButtonText
            if (r0 == 0) goto L_0x002c
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x002c
            r0.setOnClickListener(r3)
        L_0x002c:
            X.3oV r0 = r10.leftNavButtonText
            if (r0 == 0) goto L_0x0033
            r0.setVisibility(r2)
        L_0x0033:
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.CVM()
            if (r0 != r5) goto L_0x005c
            android.view.View r0 = r1.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0048
            r0.setText(r3)
        L_0x0048:
            X.3oV r0 = r10.rightNavButtonText
            if (r0 == 0) goto L_0x0055
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x0055
            r0.setOnClickListener(r3)
        L_0x0055:
            X.3oV r0 = r10.rightNavButtonText
            if (r0 == 0) goto L_0x005c
            r0.setVisibility(r2)
        L_0x005c:
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x0085
            boolean r0 = r1.CVM()
            if (r0 != r5) goto L_0x0085
            android.view.View r0 = r1.getView()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0071
            r0.setImageDrawable(r3)
        L_0x0071:
            X.3oV r0 = r10.leftNavButtonIcon
            if (r0 == 0) goto L_0x007e
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x007e
            r0.setOnClickListener(r3)
        L_0x007e:
            X.3oV r0 = r10.leftNavButtonIcon
            if (r0 == 0) goto L_0x0085
            r0.setVisibility(r2)
        L_0x0085:
            X.3oV r1 = r10.rightNavButtonIcon
            if (r1 == 0) goto L_0x00ae
            boolean r0 = r1.CVM()
            if (r0 != r5) goto L_0x00ae
            android.view.View r0 = r1.getView()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x009a
            r0.setImageDrawable(r3)
        L_0x009a:
            X.3oV r0 = r10.rightNavButtonIcon
            if (r0 == 0) goto L_0x00a7
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x00a7
            r0.setOnClickListener(r3)
        L_0x00a7:
            X.3oV r0 = r10.rightNavButtonIcon
            if (r0 == 0) goto L_0x00ae
            r0.setVisibility(r2)
        L_0x00ae:
            X.3oV r1 = r10.secondaryRightNavButtonIcon
            if (r1 == 0) goto L_0x00d7
            boolean r0 = r1.CVM()
            if (r0 != r5) goto L_0x00d7
            android.view.View r0 = r1.getView()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x00c3
            r0.setImageDrawable(r3)
        L_0x00c3:
            X.3oV r0 = r10.secondaryRightNavButtonIcon
            if (r0 == 0) goto L_0x00d0
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x00d0
            r0.setOnClickListener(r3)
        L_0x00d0:
            X.3oV r0 = r10.secondaryRightNavButtonIcon
            if (r0 == 0) goto L_0x00d7
            r0.setVisibility(r2)
        L_0x00d7:
            X.3oV r1 = r10.rightLoadingSpinnerIcon
            if (r1 == 0) goto L_0x00e4
            boolean r0 = r1.CVM()
            if (r0 != r5) goto L_0x00e4
            r1.setVisibility(r2)
        L_0x00e4:
            X.Hky r6 = r12.A0P
            if (r6 == 0) goto L_0x0478
            int r4 = r6.A01
        L_0x00ea:
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
            int r0 = X.2Yu.A0H(r11, r0)
            int r9 = r11.getColor(r0)
            if (r6 == 0) goto L_0x0463
            int r0 = r6.A00
        L_0x00f9:
            X.7Pt r7 = r12.A0Q
            java.lang.CharSequence r1 = r7.A05
            r6 = 0
            if (r1 == 0) goto L_0x0379
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0379
            X.3oV r1 = r10.leftNavButtonText
            if (r1 == 0) goto L_0x0117
            android.view.View r2 = r1.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0117
            java.lang.CharSequence r1 = r7.A05
            r2.setText(r1)
        L_0x0117:
            X.3oV r1 = r10.leftNavButtonText
            if (r1 == 0) goto L_0x0126
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x0126
            android.view.View$OnClickListener r1 = r7.A04
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x0126:
            X.3oV r1 = r10.leftNavButtonText
            if (r1 == 0) goto L_0x013e
            android.view.View r5 = r1.getView()
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x013e
            boolean r2 = r7.A0A
            if (r2 == 0) goto L_0x0373
            boolean r1 = r7.A09
            if (r1 == 0) goto L_0x0373
            r1 = r9
        L_0x013b:
            r5.setTextColor(r1)
        L_0x013e:
            java.lang.Integer r1 = r7.A08
            if (r1 == 0) goto L_0x0157
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x0157
            X.3oV r1 = r10.leftNavButtonText
            if (r1 == 0) goto L_0x0157
            android.view.View r1 = r1.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0157
            r1.setTextAppearance(r2)
        L_0x0157:
            X.3oV r1 = r10.leftNavButtonText
            if (r1 == 0) goto L_0x015e
            r1.setVisibility(r6)
        L_0x015e:
            X.7Pt r5 = r12.A0R
            java.lang.CharSequence r1 = r5.A05
            if (r1 == 0) goto L_0x016a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x028d
        L_0x016a:
            int r1 = r5.A01
            if (r1 != 0) goto L_0x028d
            int r2 = r5.A02
            if (r2 != 0) goto L_0x0176
            android.graphics.drawable.Drawable r1 = r5.A03
            if (r1 == 0) goto L_0x01e2
        L_0x0176:
            X.3oV r1 = r10.rightNavButtonIcon
            if (r2 == 0) goto L_0x027c
            if (r1 == 0) goto L_0x0187
            android.view.View r1 = r1.getView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x0187
            r1.setImageResource(r2)
        L_0x0187:
            int r2 = r5.A00
            if (r2 == 0) goto L_0x0198
            X.3oV r1 = r10.rightNavButtonIcon
            if (r1 == 0) goto L_0x0198
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x0198
            r1.setPadding(r2, r2, r2, r2)
        L_0x0198:
            X.3oV r1 = r10.rightNavButtonIcon
            if (r1 == 0) goto L_0x01a7
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x01a7
            android.view.View$OnClickListener r1 = r5.A04
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x01a7:
            X.3oV r1 = r10.rightNavButtonIcon
            if (r1 == 0) goto L_0x01c6
            android.view.View r3 = r1.getView()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            boolean r2 = r5.A0A
            if (r2 == 0) goto L_0x0276
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x0276
            r7 = r9
        L_0x01ba:
            android.util.TypedValue r1 = X.AnonymousClass4Ed.A00
            X.0qQ.A0B(r3, r6)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r7)
            r3.setColorFilter(r1)
        L_0x01c6:
            java.lang.CharSequence r2 = r5.A06
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x01db
            X.3oV r1 = r10.rightNavButtonIcon
            if (r1 == 0) goto L_0x01db
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x01db
            r1.setContentDescription(r2)
        L_0x01db:
            X.3oV r1 = r10.rightNavButtonIcon
        L_0x01dd:
            if (r1 == 0) goto L_0x01e2
            r1.setVisibility(r6)
        L_0x01e2:
            X.7Pt r5 = r12.A0S
            int r2 = r5.A02
            if (r2 != 0) goto L_0x01ec
            android.graphics.drawable.Drawable r1 = r5.A03
            if (r1 == 0) goto L_0x025b
        L_0x01ec:
            X.3oV r1 = r10.secondaryRightNavButtonIcon
            if (r2 == 0) goto L_0x0266
            if (r1 == 0) goto L_0x01ff
            android.view.View r2 = r1.getView()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x01ff
            int r1 = r5.A02
            r2.setImageResource(r1)
        L_0x01ff:
            X.3oV r1 = r10.secondaryRightNavButtonIcon
            if (r1 == 0) goto L_0x020e
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x020e
            android.view.View$OnClickListener r1 = r5.A04
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x020e:
            X.3oV r1 = r10.secondaryRightNavButtonIcon
            if (r1 == 0) goto L_0x0220
            android.view.View r2 = r1.getView()
            r1 = 2130968782(0x7f0400ce, float:1.7546227E38)
            int r1 = X.2Yu.A0G(r11, r1)
            X.0nA.A0U(r2, r1)
        L_0x0220:
            X.3oV r1 = r10.secondaryRightNavButtonIcon
            if (r1 == 0) goto L_0x023f
            android.view.View r3 = r1.getView()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            boolean r2 = r5.A0A
            if (r2 == 0) goto L_0x0262
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x0262
            r4 = r9
        L_0x0233:
            android.util.TypedValue r0 = X.AnonymousClass4Ed.A00
            X.0qQ.A0B(r3, r6)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r4)
            r3.setColorFilter(r0)
        L_0x023f:
            java.lang.CharSequence r1 = r5.A06
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0254
            X.3oV r0 = r10.secondaryRightNavButtonIcon
            if (r0 == 0) goto L_0x0254
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x0254
            r0.setContentDescription(r1)
        L_0x0254:
            X.3oV r0 = r10.secondaryRightNavButtonIcon
            if (r0 == 0) goto L_0x025b
            r0.setVisibility(r6)
        L_0x025b:
            A0C(r10)
            A05(r11, r10)
            return
        L_0x0262:
            if (r2 != 0) goto L_0x0233
            r4 = r0
            goto L_0x0233
        L_0x0266:
            if (r1 == 0) goto L_0x01ff
            android.view.View r2 = r1.getView()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x01ff
            android.graphics.drawable.Drawable r1 = r5.A03
            r2.setImageDrawable(r1)
            goto L_0x01ff
        L_0x0276:
            r7 = r0
            if (r2 == 0) goto L_0x01ba
            r7 = r4
            goto L_0x01ba
        L_0x027c:
            if (r1 == 0) goto L_0x0187
            android.view.View r2 = r1.getView()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x0187
            android.graphics.drawable.Drawable r1 = r5.A03
            r2.setImageDrawable(r1)
            goto L_0x0187
        L_0x028d:
            X.3oV r2 = r10.rightNavButtonText
            if (r2 == 0) goto L_0x02a3
            boolean r1 = r2.CVM()
            if (r1 != 0) goto L_0x02a3
            android.view.View r2 = r2.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x02a3
            r1 = 5
            r2.setGravity(r1)
        L_0x02a3:
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x02b4
            android.view.View r2 = r1.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x02b4
            java.lang.CharSequence r1 = r5.A05
            r2.setText(r1)
        L_0x02b4:
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x02c3
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x02c3
            android.view.View$OnClickListener r1 = r5.A04
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x02c3:
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x02db
            android.view.View r7 = r1.getView()
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x02db
            boolean r2 = r5.A0A
            if (r2 == 0) goto L_0x036d
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x036d
            r1 = r9
        L_0x02d8:
            r7.setTextColor(r1)
        L_0x02db:
            java.lang.Integer r1 = r5.A08
            if (r1 == 0) goto L_0x02f4
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x02f4
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x02f4
            android.view.View r1 = r1.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x02f4
            r1.setTextAppearance(r2)
        L_0x02f4:
            int r1 = r5.A01
            if (r1 == 0) goto L_0x033d
            android.graphics.drawable.Drawable r2 = r11.getDrawable(r1)
            if (r2 == 0) goto L_0x0323
            r2.mutate()
            java.lang.Integer r1 = r5.A07
            if (r1 == 0) goto L_0x035f
            int r1 = r1.intValue()
            int r1 = r11.getColor(r1)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r1)
        L_0x0311:
            r2.setColorFilter(r1)
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x0323
            android.view.View r1 = r1.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0323
            r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3)
        L_0x0323:
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x033d
            android.view.View r3 = r1.getView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x033d
            android.content.res.Resources r2 = r11.getResources()
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r3.setCompoundDrawablePadding(r1)
        L_0x033d:
            X.3oV r1 = r10.rightNavButtonIcon
            if (r1 == 0) goto L_0x034c
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x034c
            java.lang.CharSequence r1 = r5.A06
            r2.setContentDescription(r1)
        L_0x034c:
            X.3oV r1 = r10.rightNavButtonText
            if (r1 == 0) goto L_0x035b
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x035b
            java.lang.CharSequence r1 = r5.A06
            r2.setContentDescription(r1)
        L_0x035b:
            X.3oV r1 = r10.rightNavButtonText
            goto L_0x01dd
        L_0x035f:
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x0368
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r9)
            goto L_0x0311
        L_0x0368:
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r4)
            goto L_0x0311
        L_0x036d:
            r1 = r0
            if (r2 == 0) goto L_0x02d8
            r1 = r4
            goto L_0x02d8
        L_0x0373:
            r1 = r0
            if (r2 == 0) goto L_0x013b
            r1 = r4
            goto L_0x013b
        L_0x0379:
            int r2 = r7.A02
            r8 = 8
            if (r2 != 0) goto L_0x03fe
            android.graphics.drawable.Drawable r1 = r7.A03
            if (r1 != 0) goto L_0x03fe
            if (r13 <= r5) goto L_0x015e
            java.lang.CharSequence r1 = r12.A0d
            if (r1 == 0) goto L_0x015e
            int r1 = r1.length()
            if (r1 == 0) goto L_0x015e
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x03a1
            android.view.View r2 = r1.getView()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x03a1
            r1 = 2131237915(0x7f081c1b, float:1.8092094E38)
            r2.setImageResource(r1)
        L_0x03a1:
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x03b0
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x03b0
            android.view.View$OnClickListener r1 = r10.A0F
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x03b0:
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x03cc
            android.view.View r5 = r1.getView()
            if (r5 == 0) goto L_0x03cc
            android.content.Context r1 = r10.requireContext()
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131953555(0x7f130793, float:1.9543584E38)
            java.lang.String r1 = r2.getString(r1)
            r5.setContentDescription(r1)
        L_0x03cc:
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x03eb
        L_0x03d0:
            android.view.View r5 = r1.getView()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            boolean r2 = r7.A0A
            if (r2 == 0) goto L_0x03f9
            boolean r1 = r7.A09
            if (r1 == 0) goto L_0x03f9
            r7 = r9
        L_0x03df:
            android.util.TypedValue r1 = X.AnonymousClass4Ed.A00
            X.0qQ.A0B(r5, r6)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r7)
            r5.setColorFilter(r1)
        L_0x03eb:
            X.3oV r2 = r10.leftNavButtonIcon
            if (r2 == 0) goto L_0x015e
            boolean r1 = r12.A12
            if (r1 != 0) goto L_0x03f4
            r8 = 0
        L_0x03f4:
            r2.setVisibility(r8)
            goto L_0x015e
        L_0x03f9:
            r7 = r0
            if (r2 == 0) goto L_0x03df
            r7 = r4
            goto L_0x03df
        L_0x03fe:
            X.3oV r1 = r10.leftNavButtonIcon
            if (r2 == 0) goto L_0x0453
            if (r1 == 0) goto L_0x040f
            android.view.View r1 = r1.getView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x040f
            r1.setImageResource(r2)
        L_0x040f:
            int r2 = r7.A00
            if (r2 == 0) goto L_0x0420
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x0420
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x0420
            r1.setPadding(r2, r2, r2, r2)
        L_0x0420:
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x042f
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x042f
            java.lang.CharSequence r1 = r7.A06
            r2.setContentDescription(r1)
        L_0x042f:
            android.view.View$OnClickListener r2 = r7.A04
            X.3oV r1 = r10.leftNavButtonIcon
            if (r2 != 0) goto L_0x0447
            if (r1 == 0) goto L_0x0442
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L_0x0442
            android.view.View$OnClickListener r1 = r10.A0F
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x0442:
            X.3oV r1 = r10.leftNavButtonIcon
            if (r1 == 0) goto L_0x03eb
            goto L_0x03d0
        L_0x0447:
            if (r1 == 0) goto L_0x0442
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x0442
            X.AnonymousClass0fU.A00(r2, r1)
            goto L_0x0442
        L_0x0453:
            if (r1 == 0) goto L_0x040f
            android.view.View r2 = r1.getView()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x040f
            android.graphics.drawable.Drawable r1 = r7.A03
            r2.setImageDrawable(r1)
            goto L_0x040f
        L_0x0463:
            android.content.Context r2 = r10.getThemedContext()
            android.content.Context r1 = r10.getThemedContext()
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r2.getColor(r0)
            goto L_0x00f9
        L_0x0478:
            android.content.Context r2 = r10.getThemedContext()
            android.content.Context r1 = r10.getThemedContext()
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r4 = r2.getColor(r0)
            goto L_0x00ea
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.A04(android.content.Context, X.7Pr, int):void");
    }

    public static final void A05(Context context, BottomSheetFragment bottomSheetFragment) {
        Guideline guideline = bottomSheetFragment.navButtonStartGuideline;
        if (guideline != null) {
            Resources resources = context.getResources();
            boolean A0F2 = bottomSheetFragment.A0F();
            int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            if (A0F2) {
                i = R.dimen.ad_not_delivering_thumbnail_height;
            }
            guideline.setGuidelineBegin(resources.getDimensionPixelSize(i));
        }
        Guideline guideline2 = bottomSheetFragment.navButtonEndGuideline;
        if (guideline2 != null) {
            Resources resources2 = context.getResources();
            boolean A0F3 = bottomSheetFragment.A0F();
            int i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            if (A0F3) {
                i2 = R.dimen.ad_not_delivering_thumbnail_height;
            }
            guideline2.setGuidelineEnd(resources2.getDimensionPixelSize(i2));
        }
    }

    private final void A07(C331127Pr r5) {
        View.OnClickListener onClickListener;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        View.OnClickListener onClickListener2;
        String str = r5.A0g;
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.bottomButton;
        if (igdsBottomButtonLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (str == null || str.length() == 0) {
            igdsBottomButtonLayout2.setVisibility(8);
            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.bottomButton;
            if (igdsBottomButtonLayout3 != null) {
                igdsBottomButtonLayout3.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            igdsBottomButtonLayout2.setPrimaryActionText(str);
            if (r5.A0v) {
                onClickListener = new FN1(r5, this);
            } else {
                onClickListener = r5.A0K;
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout4 = this.bottomButton;
            if (igdsBottomButtonLayout4 != null) {
                igdsBottomButtonLayout4.setPrimaryActionOnClickListener(onClickListener);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout5 = this.bottomButton;
            if (igdsBottomButtonLayout5 != null) {
                igdsBottomButtonLayout5.setPrimaryButtonEnabled(this.A06);
            }
            String str2 = r5.A0h;
            if (!(str2 == null || str2.length() == 0)) {
                IgdsBottomButtonLayout igdsBottomButtonLayout6 = this.bottomButton;
                if (igdsBottomButtonLayout6 != null) {
                    igdsBottomButtonLayout6.setSecondaryActionText(str2);
                }
                if (r5.A0w) {
                    onClickListener2 = new FN2(r5, this);
                } else {
                    onClickListener2 = r5.A0L;
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout7 = this.bottomButton;
                if (igdsBottomButtonLayout7 != null) {
                    igdsBottomButtonLayout7.setSecondaryActionOnClickListener(onClickListener2);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout8 = this.bottomButton;
                if (igdsBottomButtonLayout8 != null) {
                    igdsBottomButtonLayout8.setSecondaryButtonEnabled(this.A07);
                }
            }
            CharSequence charSequence = r5.A0b;
            if (!(charSequence == null || charSequence.length() == 0 || (igdsBottomButtonLayout = this.bottomButton) == null)) {
                igdsBottomButtonLayout.setFooterText(charSequence);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout9 = this.bottomButton;
            if (igdsBottomButtonLayout9 != null) {
                igdsBottomButtonLayout9.setDividerVisible(A00(this).A14);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout10 = this.bottomButton;
            if (igdsBottomButtonLayout10 != null) {
                igdsBottomButtonLayout10.setVisibility(0);
            }
        }
    }

    public static final void A0A(BottomSheetFragment bottomSheetFragment) {
        CharSequence charSequence;
        ViewGroup.LayoutParams layoutParams;
        C331127Pr r0 = bottomSheetFragment.A03;
        if ((r0 == null || !r0.A1R) && ((charSequence = A00(bottomSheetFragment).A0d) == null || charSequence.length() == 0)) {
            2dZ r1 = bottomSheetFragment._actionBarService;
            if (!bottomSheetFragment.A0F() && r1 != null && !r1.A0A) {
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = bottomSheetFragment.contentView;
                if (touchInterceptorFrameLayout != null) {
                    layoutParams = touchInterceptorFrameLayout.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = bottomSheetFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = bottomSheetFragment.contentView;
                if (touchInterceptorFrameLayout2 != null) {
                    touchInterceptorFrameLayout2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            return;
        }
        A0B(bottomSheetFragment);
    }

    public static final void A0B(BottomSheetFragment bottomSheetFragment) {
        ViewGroup.LayoutParams layoutParams;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = bottomSheetFragment.contentView;
        if (touchInterceptorFrameLayout != null) {
            layoutParams = touchInterceptorFrameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.topMargin != 0) {
            marginLayoutParams.topMargin = 0;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = bottomSheetFragment.contentView;
            if (touchInterceptorFrameLayout2 != null) {
                touchInterceptorFrameLayout2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static final void A0C(BottomSheetFragment bottomSheetFragment) {
        ViewGroup viewGroup;
        C252063oV r0;
        C252063oV r2 = bottomSheetFragment.navBarDivider;
        if (r2 != null) {
            int i = 0;
            if (!A00(bottomSheetFragment).A1C || (((viewGroup = bottomSheetFragment.titleAndNavContainer) == null || viewGroup.getVisibility() != 0 || (r0 = bottomSheetFragment.titleTextView) == null || r0.CFV() != 0) && !bottomSheetFragment.A0F())) {
                i = 8;
            }
            r2.setVisibility(i);
        }
    }

    private final boolean A0F() {
        C252063oV r0;
        C252063oV r02;
        C252063oV r03;
        C252063oV r04;
        C252063oV r05;
        C252063oV r06;
        ViewGroup viewGroup = this.titleAndNavContainer;
        if ((viewGroup == null || viewGroup.getVisibility() != 8) && ((r0 = this.leftNavButtonText) == null || r0.CFV() != 8 || (r02 = this.leftNavButtonIcon) == null || r02.CFV() != 8 || (r03 = this.rightNavButtonText) == null || r03.CFV() != 8 || (r04 = this.rightNavButtonIcon) == null || r04.CFV() != 8 || (r05 = this.secondaryRightNavButtonIcon) == null || r05.CFV() != 8 || (r06 = this.rightLoadingSpinnerIcon) == null || r06.CFV() != 8)) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(BottomSheetFragment bottomSheetFragment) {
        String str;
        if (bottomSheetFragment.A05) {
            int A0M = bottomSheetFragment.getChildFragmentManager().A0M();
            int size = bottomSheetFragment.A0D.size();
            if (!(bottomSheetFragment.getSession() instanceof UserSession) || A0M == size) {
                return true;
            }
            UserSession session = bottomSheetFragment.getSession();
            0qQ.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            1Zp A002 = 1Zm.A00(session).A00(AnonymousClass05K.A0B, 817895635, 0, false);
            A002.A01("child_fragment_manager_back_stack_size", A0M);
            A002.A01("builder_back_stack_size", size);
            AnonymousClass0iw A0M2 = bottomSheetFragment.A0M();
            if (A0M2 instanceof AnonymousClass0iw) {
                str = A0M2.getModuleName();
            } else {
                str = "bottom_sheet_component";
            }
            A002.A03("fragment_module", str);
            A002.A00();
        }
        return false;
    }

    public static final boolean A0J(BottomSheetFragment bottomSheetFragment) {
        String str;
        boolean z = true;
        if (bottomSheetFragment.A03 == null) {
            z = false;
            Locale locale = Locale.US;
            AnonymousClass0iw A0M = bottomSheetFragment.A0M();
            if (A0M instanceof AnonymousClass0iw) {
                str = A0M.getModuleName();
            } else {
                str = "bottom_sheet_component";
            }
            String format = String.format(locale, "hasBuilder() returns false, so current bottom sheet builder is null. Analytics module: %s.", Arrays.copyOf(new Object[]{str}, 1));
            0qQ.A07(format);
            0wb.A03("BottomSheetFragment", format);
        }
        return z;
    }

    public final TextView A0L() {
        C252063oV r1 = this.titleTextView;
        if (!isAdded() || r1 == null) {
            return null;
        }
        return (TextView) r1.getView();
    }

    public final void A0O() {
        View view = this.mView;
        if (view != null) {
            View requireViewById = view.requireViewById(R.id.action_bar_container);
            0qQ.A07(requireViewById);
            this._actionBarService = 2dY.A01(new AnonymousClass90A(this), (ViewGroup) requireViewById);
        }
        2dZ r0 = this._actionBarService;
        if (r0 != null) {
            r0.A0X(this);
        }
    }

    public final void A0Q() {
        if (this.bottomButton != null) {
            A07(A00(this));
        }
    }

    public final void A0S(int i) {
        ViewGroup viewGroup = this.bottomSheetContainer;
        if (viewGroup != null) {
            Drawable background = viewGroup.getBackground();
            if (background != null) {
                Drawable mutate = background.mutate();
                0qQ.A07(mutate);
                mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0T(int i) {
        ViewGroup viewGroup = this.titleAndNavContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
        C252063oV r0 = this.navBarDivider;
        if (r0 != null) {
            r0.setVisibility(i);
        }
    }

    public final 2dZ AYJ() {
        return this._actionBarService;
    }

    public final View C4U() {
        return this.bottomSheetContainer;
    }

    public final boolean Erf() {
        C331127Pr r0 = this.A03;
        if (r0 != null) {
            return !r0.A1I;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A0I.getValue();
    }

    public final C227842k3 getStatusBarType() {
        return C227842k3.PERSIST;
    }

    public static final C331127Pr A00(BottomSheetFragment bottomSheetFragment) {
        A0J(bottomSheetFragment);
        C331127Pr r0 = bottomSheetFragment.A03;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("BottomSheetFragment builder is null");
    }

    private final void A01() {
        if (A0I(this)) {
            boolean A0H2 = A0H(this);
            getChildFragmentManager().A13();
            if (A0J(this)) {
                AnonymousClass37D bottomSheetNavigator = this.A04.getBottomSheetNavigator();
                if (bottomSheetNavigator != null) {
                    C262944Gp r0 = A00(this).A0X;
                    if (r0 != null) {
                        bottomSheetNavigator.A0R(r0);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (A0H2) {
                this.A0D.pop();
            }
            if (A0H(this)) {
                this.A03 = (C331127Pr) this.A0D.peek();
                NJ8 A0M = A0M();
                if (A0M instanceof NJ8) {
                    NJ8 nj8 = A0M;
                    if (!nj8.A0F) {
                        ((C53033GhO) nj8.A0N.getValue()).A03(nj8.requireContext(), nj8.getViewLifecycleOwner(), new C73589PgP(nj8), NJ8.A00(nj8));
                        return;
                    }
                    NJ8.A0C(nj8, true);
                    return;
                }
                return;
            }
            C331157Pu r4 = this.A02;
            if (r4 != null) {
                if (182.A06(0Tu.A05, getSession(), 36323423185546391L)) {
                    r4.A0L((C332277Ui) null);
                }
            }
        }
    }

    private final void A02() {
        int i;
        if (A00(this).A0A != 0) {
            i = getThemedContext().getColor(A00(this).A0A);
        } else if (A00(this).A09 != 0) {
            i = A00(this).A09;
        } else {
            i = 255;
        }
        AnonymousClass37D bottomSheetNavigator = this.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            bottomSheetNavigator.A0G(i);
        }
    }

    private final void A06(ViewGroup viewGroup) {
        if (A0J(this)) {
            C331127Pr r0 = this.A03;
            if (r0 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (r0.A17 && viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    public static final void A08(BottomSheetFragment bottomSheetFragment) {
        boolean z;
        C331127Pr r0;
        String str;
        if (bottomSheetFragment.getContext() == null) {
            str = "getContext() is null when trying to reanchor bottom sheet fragment";
        } else {
            AnonymousClass37D bottomSheetNavigator = bottomSheetFragment.A04.getBottomSheetNavigator();
            if (bottomSheetNavigator == null) {
                str = "getBottomSheetNavigator(context) returns null when trying toreanchor bottom sheet fragment";
            } else {
                if (!bottomSheetFragment.A0C || (((r0 = bottomSheetFragment.A03) == null || r0.A1U == null) && AnonymousClass0Ke.A00(bottomSheetFragment.requireContext()) > 2012)) {
                    z = false;
                } else {
                    z = true;
                }
                bottomSheetNavigator.A0V(!z);
                return;
            }
        }
        0wb.A03("BottomSheetFragment", str);
    }

    public static final void A09(BottomSheetFragment bottomSheetFragment) {
        Context themedContext = bottomSheetFragment.getThemedContext();
        Fragment A0M = bottomSheetFragment.A0M();
        if (A0M != null) {
            bottomSheetFragment.A0U(themedContext, A0M, bottomSheetFragment.getChildFragmentManager().A0M());
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0D(BottomSheetFragment bottomSheetFragment, int i) {
        if (A00(bottomSheetFragment).A13) {
            ImageView imageView = bottomSheetFragment.dragHandleView;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = bottomSheetFragment.dragHandleView;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
    }

    private final boolean A0G() {
        Activity rootActivity;
        if (!isAdded() || (rootActivity = getRootActivity()) == null || rootActivity.getWindow() == null || (rootActivity.getWindow().getAttributes().softInputMode & 240) != 16) {
            return false;
        }
        return true;
    }

    public static final boolean A0I(BottomSheetFragment bottomSheetFragment) {
        if (!bottomSheetFragment.isAdded() || AnonymousClass06S.A00(bottomSheetFragment.getChildFragmentManager()) || bottomSheetFragment.getChildFragmentManager().A12()) {
            return false;
        }
        return true;
    }

    public static final boolean A0K(BottomSheetFragment bottomSheetFragment) {
        Boolean bool = A00(bottomSheetFragment).A0a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return 0qQ.A0K(bottomSheetFragment.A0B, true);
    }

    public final Fragment A0M() {
        if (!isAdded()) {
            return null;
        }
        return getChildFragmentManager().A0P(R.id.bottom_sheet_container_view);
    }

    public final void A0N() {
        if (A0I(this)) {
            A0H(this);
            0hq childFragmentManager = getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            if (childFragmentManager.A0M() > 0) {
                0s1 A0T = childFragmentManager.A0T(0);
                0qQ.A07(A0T);
                childFragmentManager.A0d(A0T.A00);
            }
            this.A0D.clear();
            A0H(this);
        }
    }

    public final void A0P() {
        if (getChildFragmentManager().A0M() <= 0) {
            0wb.A03("BottomSheetFragment", "No back stack entry in child fragment manager.");
            return;
        }
        ViewGroup viewGroup = this.bottomSheetContainer;
        if (viewGroup != null) {
            0nA.A0N(viewGroup);
            DMt();
        }
        if (getChildFragmentManager().A0M() == 1) {
            C331157Pu r1 = this.A02;
            if (r1 != null) {
                r1.A0L((C332277Ui) null);
                return;
            }
            return;
        }
        A01();
        A09(this);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.contentView;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.post(new C12926TDp(this));
        }
    }

    public final void A0R() {
        if (isAdded()) {
            A04(requireContext(), A00(this), getChildFragmentManager().A0M());
        }
    }

    public final boolean ANU() {
        C273494mf r0 = A00(this).A0T;
        if (r0 != null) {
            return r0.useCustomScrollDetermination();
        }
        return false;
    }

    public final int AqL() {
        if (A0K(this)) {
            return -1;
        }
        return -2;
    }

    public final int C8P() {
        if (isAdded() && this.A00 == 0) {
            ImageView imageView = this.dragHandleView;
            if (imageView != null && imageView.getVisibility() == 0) {
                this.A00 += imageView.getHeight();
            }
            ViewGroup viewGroup = this.titleAndNavContainer;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                this.A00 += viewGroup.getHeight();
            }
            C252063oV r2 = this.navBarDivider;
            if (r2 != null && r2.CFV() == 0) {
                this.A00 += r2.getView().getHeight();
            }
        }
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
        if (r0.isInMultiWindowMode() != false) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float CMx() {
        /*
            r11 = this;
            android.content.Context r6 = r11.getContext()
            X.7Pr r0 = A00(r11)
            boolean r0 = r0.A1G
            java.lang.String r3 = "Required value was null."
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x00e7
            if (r6 == 0) goto L_0x00e7
            androidx.fragment.app.Fragment r0 = r11.A0M()
            if (r0 == 0) goto L_0x00e7
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x00e7
            android.view.ViewGroup r0 = r11.bottomSheetContainer
            if (r0 == 0) goto L_0x0170
            int r0 = r0.getHeight()
            float r3 = (float) r0
            int r0 = X.0nA.A08(r6)
            float r4 = (float) r0
            X.7Pr r0 = A00(r11)
            float r1 = r0.A03
            androidx.fragment.app.Fragment r0 = r11.A0M()
            boolean r0 = r0 instanceof X.C54165H1k
            if (r0 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r9 = r11.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.bottomsheet.BottomSheetDynamicAnchorDelegate"
            X.0qQ.A0C(r9, r0)
            X.H1k r9 = (X.C54165H1k) r9
            int r1 = r9.A00
            java.lang.String r8 = "media"
            if (r1 == 0) goto L_0x00c4
            r0 = 1
            if (r1 != r0) goto L_0x0168
            X.I76 r0 = X.I76.A00
            X.1Xj r9 = r9.A01
            if (r9 == 0) goto L_0x00d8
            float r7 = X.I76.A00(r6)
            java.util.ArrayList r0 = X.I76.A05(r9)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c2
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            float r10 = r1.getDimension(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            float r0 = r1.getDimension(r0)
            float r10 = r10 + r0
        L_0x0079:
            android.content.res.Resources r5 = r6.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r8 = r5.getDimension(r0)
            android.content.res.Resources r0 = r6.getResources()
            float r5 = r0.getDimension(r1)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            float r0 = r1.getDimension(r0)
            float r8 = r8 + r0
            float r8 = r8 + r5
            java.util.ArrayList r0 = X.I76.A05(r9)
            int r0 = r0.size()
            float r0 = (float) r0
            float r0 = r0 * r8
            float r7 = r7 + r0
            float r7 = r7 + r10
            int r0 = X.0nA.A08(r6)
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = java.lang.Math.min(r1, r7)
            int r0 = X.0nA.A08(r6)
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x00ba:
            float r1 = r1 * r4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            float r2 = r1 / r3
        L_0x00c1:
            return r2
        L_0x00c2:
            r10 = 0
            goto L_0x0079
        L_0x00c4:
            X.I76 r7 = X.I76.A00
            X.0eM r0 = r9.A06
            java.lang.Object r5 = r0.getValue()
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.1Xj r1 = r9.A01
            if (r1 == 0) goto L_0x00d8
            instagram.features.clips.viewer.recipesheet.RecipeSheetParams r0 = r9.A04
            if (r0 != 0) goto L_0x00e0
            java.lang.String r8 = "params"
        L_0x00d8:
            X.0qQ.A0F(r8)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00e0:
            boolean r0 = r0.A07
            float r1 = r7.A06(r6, r5, r1, r0)
            goto L_0x00ba
        L_0x00e7:
            androidx.fragment.app.Fragment r4 = r11.A0M()
            X.7Pr r0 = A00(r11)
            int r1 = r0.A08
            r0 = -1
            if (r1 == r0) goto L_0x0155
            X.7Pr r0 = A00(r11)
            int r1 = r0.A08
        L_0x00fa:
            int r0 = r11.C8P()
            int r1 = r1 + r0
            float r4 = (float) r1
            X.7Pr r1 = A00(r11)
            android.content.Context r0 = r11.getContext()
            if (r0 == 0) goto L_0x0152
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0152
            android.view.ViewGroup r0 = r11.bottomSheetContainer
            if (r0 == 0) goto L_0x017c
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
        L_0x0119:
            r1.A03 = r4
        L_0x011b:
            if (r6 == 0) goto L_0x012a
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 == r0) goto L_0x013c
        L_0x012a:
            boolean r0 = r11.isAdded()
            if (r0 == 0) goto L_0x0145
            android.app.Activity r0 = r11.getRootActivity()
            if (r0 == 0) goto L_0x0176
            boolean r0 = r0.isInMultiWindowMode()
            if (r0 == 0) goto L_0x0145
        L_0x013c:
            X.7Pr r1 = A00(r11)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r1.A03 = r0
        L_0x0145:
            boolean r0 = A0K(r11)
            if (r0 == 0) goto L_0x00c1
            X.7Pr r0 = A00(r11)
            float r2 = r0.A03
            return r2
        L_0x0152:
            r4 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0119
        L_0x0155:
            if (r4 == 0) goto L_0x011b
            X.7Pr r0 = A00(r11)
            boolean r0 = r0.A19
            if (r0 == 0) goto L_0x011b
            android.view.View r0 = r4.requireView()
            int r1 = r0.getHeight()
            goto L_0x00fa
        L_0x0168:
            java.lang.String r0 = "Unknown View Type: recipe_sheet_parent"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0170:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x017c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.CMx():float");
    }

    public final boolean CPc() {
        if (!A0J(this)) {
            return true;
        }
        C331127Pr r0 = this.A03;
        if (r0 != null) {
            return r0.A0y;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final float Cmb() {
        if (A00(this).A1G) {
            return 1.0f;
        }
        if (!A0K(this) || A00(this).A1E) {
            return CMx();
        }
        return A00(this).A04;
    }

    public final float CoU() {
        Float f = A00(this).A0e;
        if (A00(this).A0s) {
            return A00(this).A01;
        }
        if (f == null) {
            return CMx();
        }
        return f.floatValue();
    }

    public final boolean isScrolledToTop() {
        C273494mf r0;
        if (A00(this).A0T == null || ((r0 = A00(this).A0T) != null && r0.isScrolledToTop())) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        AnonymousClass4DR A0M = A0M();
        if (!(A0M instanceof AnonymousClass4DR) || !A0M.onBackPressed()) {
            ViewGroup viewGroup = this.bottomSheetContainer;
            if (viewGroup != null) {
                0nA.A0N(viewGroup);
                DMt();
            }
            if (getChildFragmentManager().A0M() <= 1) {
                return false;
            }
            AnonymousClass37D bottomSheetNavigator = this.A04.getBottomSheetNavigator();
            if (bottomSheetNavigator != null) {
                if (A0M != null) {
                    0hq childFragmentManager = getChildFragmentManager();
                    0qQ.A07(childFragmentManager);
                    bottomSheetNavigator.A0K(A0M, childFragmentManager, AnonymousClass05K.A0N);
                    A01();
                }
                A09(this);
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.contentView;
                if (touchInterceptorFrameLayout != null) {
                    touchInterceptorFrameLayout.post(new C12926TDp(this));
                    return true;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 != null) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBottomSheetClosed() {
        /*
            r2 = this;
            X.7Pr r0 = A00(r2)
            X.4mf r0 = r0.A0T
            if (r0 == 0) goto L_0x001e
            X.7Pr r0 = A00(r2)
            X.4mf r1 = r0.A0T
            if (r1 == 0) goto L_0x0013
        L_0x0010:
            r1.onBottomSheetClosed()
        L_0x0013:
            X.U1A r0 = r2.A0A
            if (r0 == 0) goto L_0x001d
            r0.A06()
            r0 = 0
            r2.A0A = r0
        L_0x001d:
            return
        L_0x001e:
            androidx.fragment.app.Fragment r0 = r2.A0M()
            if (r0 == 0) goto L_0x0013
            androidx.fragment.app.Fragment r0 = r2.A0M()
            boolean r0 = r0 instanceof X.C273494mf
            if (r0 == 0) goto L_0x0013
            androidx.fragment.app.Fragment r1 = r2.A0M()
            r0 = 7
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.4mf r1 = (X.C273494mf) r1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.onBottomSheetClosed():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBottomSheetPositionChanged(int r5, int r6) {
        /*
            r4 = this;
            X.7Pr r0 = A00(r4)
            X.4mf r0 = r0.A0T
            if (r0 == 0) goto L_0x000b
            r0.onBottomSheetPositionChanged(r5, r6)
        L_0x000b:
            X.U1A r0 = r4.A0A
            if (r0 == 0) goto L_0x0012
            r0.invalidateSelf()
        L_0x0012:
            X.7Pr r0 = A00(r4)
            boolean r0 = r0.A0x
            if (r0 == 0) goto L_0x00a5
            boolean r0 = A0K(r4)
            java.lang.String r3 = "Required value was null."
            if (r0 != 0) goto L_0x002a
            X.7Pr r0 = A00(r4)
            boolean r0 = r0.A1G
            if (r0 == 0) goto L_0x0065
        L_0x002a:
            android.view.ViewGroup r0 = r4.bottomSheetContainer
            if (r0 == 0) goto L_0x00d1
            int r2 = r0.getHeight()
            int r0 = r4.C8P()
            int r2 = r2 - r0
            int r2 = r2 - r5
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x005c
            int r2 = r2 - r6
            X.7Pr r0 = A00(r4)
            float r1 = r0.A05
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            android.view.ViewGroup r0 = r4.bottomSheetContainer
            if (r0 == 0) goto L_0x00cb
            int r0 = r0.getHeight()
            float r1 = (float) r0
            X.7Pr r0 = A00(r4)
            float r0 = r0.A05
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 >= r0) goto L_0x005c
            r2 = r0
        L_0x005c:
            if (r2 < 0) goto L_0x0065
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r4.contentView
            if (r0 == 0) goto L_0x0065
            X.0nA.A0V(r0, r2)
        L_0x0065:
            X.7Pr r0 = A00(r4)
            boolean r0 = r0.A1G
            if (r0 == 0) goto L_0x0084
            android.view.ViewGroup r2 = r4.bottomSheetContainer
            if (r2 == 0) goto L_0x00c5
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r1 = r0.height
            int r0 = r2.getHeight()
            if (r1 == r0) goto L_0x0084
            int r0 = r2.getHeight()
        L_0x0081:
            X.0nA.A0V(r2, r0)
        L_0x0084:
            X.7Pr r0 = A00(r4)
            boolean r0 = r0.A1M
            if (r0 == 0) goto L_0x00a4
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L_0x00a4
            android.view.ViewGroup r1 = r4.bottomSheetContainer
            if (r1 == 0) goto L_0x00a4
            r0 = 2130968778(0x7f0400ca, float:1.754622E38)
            int r0 = X.2Yu.A0H(r2, r0)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r1.setBackground(r0)
        L_0x00a4:
            return
        L_0x00a5:
            java.util.Stack r0 = r4.A0D
            int r2 = r0.size()
            java.util.Stack r1 = r4.A0E
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0084
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r4.contentView
            if (r2 == 0) goto L_0x0084
            java.lang.Object r0 = r1.pop()
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0081
        L_0x00c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.onBottomSheetPositionChanged(int, int):void");
    }

    public final void onCreate(Bundle bundle) {
        Map map;
        int A022 = AnonymousClass0fD.A02(636098638);
        BottomSheetFragment.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("BottomSheetNavigator.ARG_EXTRA_BUNDLE");
        0xF r0 = null;
        if ((serializable instanceof Map) && (map = (Map) serializable) != null) {
            r0 = 0j8.A01(map);
        }
        this.A09 = r0;
        this.A0C = 182.A06(0Tu.A05, getSession(), 36313798163826938L);
        C331127Pr r02 = this.A03;
        if (r02 != null) {
            setDayNightMode(r02.A0O);
        }
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            C226112fe.A0B.A04(rootActivity, new C14119TqE(this), false);
        }
        AnonymousClass0fD.A09(152522905, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1282599313);
        0qQ.A0B(layoutInflater, 0);
        if (viewGroup != null) {
            A06(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getRootView().findViewById(R.id.bottom_sheet_container);
            if (viewGroup2 != null) {
                A06(viewGroup2);
            }
        }
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-881852558, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-234722526);
        super.onDestroyView();
        BottomSheetFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-977151747, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(-1013884039);
        BottomSheetFragment.super.onDetach();
        0hq childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A0H);
        AnonymousClass0fD.A09(-1192721251, A022);
    }

    public final void onResume() {
        int i;
        int A022 = AnonymousClass0fD.A02(-1141826257);
        super.onResume();
        AnonymousClass37D bottomSheetNavigator = this.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            AnonymousClass37F r5 = (AnonymousClass37F) bottomSheetNavigator;
            if (r5.A0g && A0J(this) && !2db.A09()) {
                boolean z = false;
                if (A00(this).A0B != 0) {
                    z = true;
                }
                FragmentActivity requireActivity = requireActivity();
                Context themedContext = getThemedContext();
                if (z) {
                    i = A00(this).A0B;
                } else {
                    i = R.color.black_50_transparent;
                }
                2db.A02(requireActivity, themedContext.getColor(i));
            }
            if (r5.A0g && A0J(this)) {
                A02();
            }
        }
        AnonymousClass0fD.A09(-992995534, A022);
    }
}
