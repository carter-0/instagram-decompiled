package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebookpay.widget.navibar.NavigationBar;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Qxp  reason: case insensitive filesystem */
public class C8608Qxp extends QAN implements C13894TjH {
    public static final /* synthetic */ AnonymousClass0YZ[] A0X;
    public DialogInterface.OnDismissListener A00;
    public FrameLayout A01;
    public ImageView A02;
    public ProgressBar A03;
    public ConstraintLayout A04;
    public ConstraintLayout A05;
    public Fragment A06;
    public NavigationBar A07;
    public boolean A08;
    public Bundle A09;
    public ContextThemeWrapper A0A;
    public String A0B = "";
    public final 0s0 A0C;
    public final 0s0 A0D;
    public final 0s0 A0E = new C13408TYs(this, 18);
    public final 0s0 A0F;
    public final 0s0 A0G = new C13408TYs(this, 19);
    public final 0s0 A0H;
    public final 0s0 A0I;
    public final 0s0 A0J;
    public final 0s0 A0K;
    public final 0s0 A0L;
    public final 0s0 A0M;
    public final 0s0 A0N;
    public final 0s0 A0O;
    public final 0s0 A0P;
    public final 0s0 A0Q;
    public final 0s0 A0R;
    public final 0s0 A0S = new C13408TYs(this, 15);
    public final 0s0 A0T;
    public final 0s0 A0U;
    public final 0s0 A0V;
    public final 0s0 A0W;

    public Dialog A0F(Bundle bundle) {
        return A0G((C62320sa) null);
    }

    public final void A0I(Bundle bundle, 0hq r5, String str, String str2) {
        0qQ.A0B(r5, 0);
        this.A0B = str;
        this.A09 = bundle;
        C11353SOm A012 = AnonymousClass2E0.A01();
        String str3 = this.A0B;
        Bundle bundle2 = this.A09;
        if (bundle2 == null) {
            0qQ.A0F("fragmentBundle");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A06 = A012.A03(bundle2, str3);
        A0B(r5, str2);
    }

    public final void ESk(Fragment fragment, boolean z, boolean z2) {
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        if (z2 && childFragmentManager.A0M() > 0) {
            childFragmentManager.A0d(childFragmentManager.A0T(0).A00);
        }
        07M.A02(this);
        fragment.setTargetFragment((Fragment) null, this.mTargetRequestCode);
        0s1 r2 = new 0s1(childFragmentManager);
        r2.A0D(fragment, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG", R.id.content_fragment);
        if (z) {
            r2.A0I((String) null);
        }
        r2.A00();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        String str = this.A0B;
        if (str.length() > 0) {
            bundle.putString("SAVED_INSTANCE_FRAGMENT_ID_KEY", str);
        }
        Bundle bundle2 = this.A09;
        if (bundle2 != null) {
            bundle.putBundle("SAVED_INSTANCE_FRAGMENT_BUNDLE_KEY", bundle2);
        }
        C8608Qxp.super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
        if (r2.equals("loading_fragment") != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            r0 = 2131428952(0x7f0b0658, float:1.8479563E38)
            android.view.View r0 = r7.requireViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            X.0qQ.A0B(r0, r3)
            r6.A05 = r0
            r0 = 2131428992(0x7f0b0680, float:1.8479644E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            r6.A07 = r0
            r0 = 2131428967(0x7f0b0667, float:1.8479593E38)
            android.widget.ImageView r0 = X.DbU.A0F(r7, r0)
            r6.A02 = r0
            r0 = 2131430693(0x7f0b0d25, float:1.8483094E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.A01 = r0
            r0 = 2131441592(0x7f0b37b8, float:1.85052E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r6.A03 = r0
            r0 = 2131443171(0x7f0b3de3, float:1.8508403E38)
            android.view.View r0 = r7.requireViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            X.0qQ.A0B(r0, r3)
            r6.A04 = r0
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x005a
            com.facebookpay.widget.navibar.NavigationBar r1 = r6.A07
            if (r1 == 0) goto L_0x0118
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
        L_0x0058:
            r6.A08 = r0
        L_0x005a:
            androidx.constraintlayout.widget.ConstraintLayout r4 = r6.A05
            if (r4 == 0) goto L_0x0113
            X.AnonymousClass2E0.A0A()
            r6.requireContext()
            android.content.Context r1 = r6.requireContext()
            r0 = 2131231196(0x7f0801dc, float:1.8078466E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            java.lang.String r5 = "Required value was null."
            if (r2 == 0) goto L_0x0124
            X.AnonymousClass2E0.A0A()
            android.content.Context r1 = r6.requireContext()
            r0 = 2131100339(0x7f0602b3, float:1.7813057E38)
            X.Pxi.A0u(r1, r2, r4, r0)
            android.widget.ImageView r4 = r6.A02
            if (r4 != 0) goto L_0x008f
            java.lang.String r0 = "viewDragHandle"
        L_0x0087:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008f:
            X.AnonymousClass2E0.A0A()
            r6.requireContext()
            android.content.Context r1 = r6.requireContext()
            r0 = 2131231197(0x7f0801dd, float:1.8078468E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            if (r2 == 0) goto L_0x011f
            X.AnonymousClass2E0.A0A()
            android.content.Context r1 = r6.requireContext()
            r0 = 2131100473(0x7f060339, float:1.7813328E38)
            X.Pxi.A0u(r1, r2, r4, r0)
            android.app.Dialog r1 = r6.A01
            boolean r0 = r1 instanceof X.QAL
            if (r0 == 0) goto L_0x00c2
            X.QAL r1 = (X.QAL) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r1.A06()
            X.0qQ.A07(r1)
            r0 = 3
            r1.A0W(r0)
        L_0x00c2:
            androidx.fragment.app.Fragment r0 = r6.A06
            if (r0 != 0) goto L_0x00f7
            if (r8 == 0) goto L_0x00d0
            java.lang.String r0 = "SAVED_INSTANCE_FRAGMENT_ID_KEY"
            java.lang.String r0 = r8.getString(r0)
            if (r0 != 0) goto L_0x00d2
        L_0x00d0:
            java.lang.String r0 = ""
        L_0x00d2:
            r6.A0B = r0
            if (r8 == 0) goto L_0x00de
            java.lang.String r0 = "SAVED_INSTANCE_FRAGMENT_BUNDLE_KEY"
            android.os.Bundle r0 = r8.getBundle(r0)
            if (r0 != 0) goto L_0x00e2
        L_0x00de:
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
        L_0x00e2:
            r6.A09 = r0
            X.SOm r2 = X.AnonymousClass2E0.A01()
            java.lang.String r1 = r6.A0B
            android.os.Bundle r0 = r6.A09
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "fragmentBundle"
            goto L_0x0087
        L_0x00f1:
            androidx.fragment.app.Fragment r0 = r2.A03(r0, r1)
            r6.A06 = r0
        L_0x00f7:
            java.lang.String r2 = r6.A0B
            boolean r0 = r6 instanceof X.C8134QhS
            if (r0 == 0) goto L_0x0111
            r1 = 0
            X.0qQ.A0B(r2, r3)
            java.lang.String r0 = "loading_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0111
        L_0x0109:
            androidx.fragment.app.Fragment r0 = r6.A06
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "currentContentFragment"
            goto L_0x0087
        L_0x0111:
            r1 = 1
            goto L_0x0109
        L_0x0113:
            java.lang.String r0 = "viewContainer"
            goto L_0x0087
        L_0x0118:
            r0 = 1
            goto L_0x0058
        L_0x011b:
            r6.ESk(r0, r1, r3)
            return
        L_0x011f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0124:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8608Qxp.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    static {
        Class<C8608Qxp> cls = C8608Qxp.class;
        A0X = new AnonymousClass0YZ[]{Pxh.A0y(cls, "headerTitle", "getHeaderTitle()Ljava/lang/String;"), Pxh.A0y(cls, "headerIcon", "getHeaderIcon()Lcom/facebookpay/widget/style/Icon;"), Pxh.A0y(cls, "headerLeftIconButtonIcon", "getHeaderLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), Pxh.A0y(cls, "isLeftProfileIcon", "isLeftProfileIcon()Z"), Pxh.A0y(cls, "headerLeftTextButtonText", "getHeaderLeftTextButtonText()Ljava/lang/String;"), Pxh.A0y(cls, "headerRightIconButtonIcon", "getHeaderRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), Pxh.A0y(cls, "headerRightTextButtonText", "getHeaderRightTextButtonText()Ljava/lang/String;"), Pxh.A0y(cls, "isRightProfileIcon", "isRightProfileIcon()Z"), Pxh.A0y(cls, "headerRightTextButtonEnable", "getHeaderRightTextButtonEnable()Z"), Pxh.A0y(cls, "headerClickableActionsEnable", "getHeaderClickableActionsEnable()Z"), Pxh.A0y(cls, "progressIconShow", "getProgressIconShow()Z"), Pxh.A0y(cls, "headerLeftIconButtonOnClickListener", "getHeaderLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "headerLeftTextButtonOnClickListener", "getHeaderLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "headerRightIconButtonOnClickListener", "getHeaderRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "headerRightTextButtonOnClickListener", "getHeaderRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "headerLeftTextButtonHint", "getHeaderLeftTextButtonHint()Ljava/lang/String;"), Pxh.A0y(cls, "headerLeftIconButtonHint", "getHeaderLeftIconButtonHint()Ljava/lang/String;"), Pxh.A0y(cls, "headerRightIconButtonHint", "getHeaderRightIconButtonHint()Ljava/lang/String;"), Pxh.A0y(cls, "headerRightTextButtonHint", "getHeaderRightTextButtonHint()Ljava/lang/String;"), Pxh.A0y(cls, "headerDividerVisible", "getHeaderDividerVisible()Z"), Pxh.A0y(cls, "isLandscape", "isLandscape()Z")};
    }

    public final void A07() {
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this.A01);
        }
        super.A07();
    }

    public final void A0H() {
        C270354gb r2 = new C270354gb();
        ConstraintLayout constraintLayout = this.A04;
        if (constraintLayout != null) {
            r2.A0I(constraintLayout);
            r2.A07(R.id.bottom_sheet_container, 0.67f);
            ConstraintLayout constraintLayout2 = this.A04;
            if (constraintLayout2 != null) {
                r2.A0G(constraintLayout2);
                return;
            }
        }
        0qQ.A0F("transparentViewContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public C8608Qxp() {
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A0U = new C13408TYs(20, this, A0u);
        this.A0K = new C13408TYs(this, 21);
        this.A0M = new C13408TYs(this, 22);
        this.A0R = new C13408TYs(this, 23);
        this.A0V = new C13408TYs(24, this, A0u);
        this.A0O = new C13408TYs(25, this, A0u);
        this.A0C = new C13408TYs(5, this, A0u);
        this.A0W = new C13408TYs(6, this, A0u);
        this.A0H = new C13408TYs(this, 7);
        this.A0J = new C13408TYs(this, 8);
        this.A0N = new C13408TYs(this, 9);
        this.A0Q = new C13408TYs(this, 10);
        this.A0I = new C13408TYs(this, 11);
        this.A0F = new C13408TYs(this, 12);
        this.A0L = new C13408TYs(this, 13);
        this.A0P = new C13408TYs(this, 14);
        this.A0D = new C13408TYs(16, this, A0u);
        this.A0T = new C13408TYs(17, this, A0u);
    }

    public final int A0E() {
        if (requireArguments().containsKey("STYLE_RES")) {
            return requireArguments().getInt("STYLE_RES");
        }
        AnonymousClass2E0.A0A();
        return 2132017647;
    }

    public final C8605Qxm A0G(C62320sa r5) {
        Window window;
        C8605Qxm qxm = new C8605Qxm(requireContext(), this, r5, requireArguments().getInt("STYLE_RES"));
        qxm.setOnShowListener(new SVK(this, 1));
        if (DbT.A1X(requireArguments(), "checkoutInFullScreen") && (window = qxm.getWindow()) != null) {
            window.setFlags(1024, 1024);
        }
        return qxm;
    }

    public final boolean Cmg() {
        String str;
        if (getChildFragmentManager().A0M() <= 1) {
            return false;
        }
        List A042 = getChildFragmentManager().A0U.A04();
        0qQ.A07(A042);
        QCJ qcj = (Fragment) 00k.A0K(A042);
        if (!(qcj instanceof QCJ)) {
            return true;
        }
        QCJ qcj2 = qcj;
        if (qcj2 instanceof C8127QhL) {
            C8127QhL qhL = (C8127QhL) qcj2;
            View view = qhL.A02;
            if (view == null) {
                str = "loadingOverlay";
            } else if (view.getVisibility() == 0) {
                return true;
            } else {
                QDK qdk = qhL.A0C;
                if (qdk == null) {
                    str = "formFragmentViewModel";
                } else if (!qdk.A07()) {
                    C8127QhL.A03(qhL, true);
                } else {
                    ContextThemeWrapper contextThemeWrapper = qhL.A00;
                    if (contextThemeWrapper == null) {
                        str = "viewContext";
                    } else {
                        C11394SRm.A04(contextThemeWrapper, new C13346TVt(qhL, 1), qhL.A0K);
                        return true;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        getChildFragmentManager().A13();
        return true;
    }

    public boolean D68() {
        if (getChildFragmentManager().A0M() <= 1) {
            return false;
        }
        getChildFragmentManager().A13();
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1301915478);
        0qQ.A0B(layoutInflater, 0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), A0E());
        this.A0A = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fbpay_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1967154109, A022);
        return inflate;
    }
}
