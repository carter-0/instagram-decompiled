package com.facebookpay.widget.navibar;

import X.0qQ;
import X.0s0;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0YZ;
import X.AnonymousClass0t1;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10911S0m;
import X.C11409SSh;
import X.C11512SbZ;
import X.C13406TYq;
import X.C13407TYr;
import X.C13408TYs;
import X.C270354gb;
import X.C71382cm;
import X.C8287QnT;
import X.DbS;
import X.DbV;
import X.JTS;
import X.Pxe;
import X.Pxh;
import X.Q6J;
import X.RH2;
import X.RH3;
import X.SPB;
import X.SRn;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;

public final class NavigationBar extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A0g;
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public LinearLayout A09;
    public ProgressBar A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public Q6J A0E;
    public boolean A0F;
    public final C11512SbZ A0G;
    public final C11512SbZ A0H;
    public final C11512SbZ A0I;
    public final 0s0 A0J;
    public final 0s0 A0K;
    public final 0s0 A0L;
    public final 0s0 A0M;
    public final 0s0 A0N;
    public final 0s0 A0O;
    public final 0s0 A0P;
    public final 0s0 A0Q;
    public final 0s0 A0R;
    public final 0s0 A0S;
    public final 0s0 A0T;
    public final 0s0 A0U;
    public final 0s0 A0V;
    public final 0s0 A0W;
    public final 0s0 A0X;
    public final 0s0 A0Y;
    public final 0s0 A0Z;
    public final 0s0 A0a;
    public final 0s0 A0b;
    public final 0s0 A0c;
    public final 0s0 A0d;
    public final 0s0 A0e;
    public final 0s0 A0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0H = new C11512SbZ(this, 2);
        this.A0G = new C11512SbZ(this, 1);
        this.A0I = new C11512SbZ(this, 3);
        this.A0e = new C13408TYs((Object) this, 66);
        this.A0f = new C13407TYr(6, context, this);
        this.A0N = new C13407TYr(7, context, this);
        this.A0K = new C13406TYq(0, this, false);
        this.A0P = new C13406TYq(this, 1);
        this.A0T = new C13406TYq(this, 2);
        this.A0L = new C13406TYq(3, this, false);
        this.A0X = new C13407TYr(8, context, this);
        this.A0Z = new C13406TYq(this, 4);
        this.A0d = new C13408TYs((Object) this, 58);
        this.A0M = new C13408TYs(59, this, false);
        this.A0W = new C13408TYs(60, this, false);
        this.A0Q = new C13407TYr(context, this, false, 4);
        this.A0a = new C13407TYr(context, this, false, 5);
        this.A0U = new C13408TYs(61, this, false);
        this.A0V = new C13408TYs(62, this, false);
        this.A0O = new C13408TYs((Object) this, 63);
        this.A0R = new C13408TYs((Object) this, 64);
        this.A0Y = new C13408TYs((Object) this, 65);
        this.A0b = new C13408TYs((Object) this, 67);
        this.A0S = new C13408TYs((Object) this, 68);
        this.A0c = new C13408TYs((Object) this, 69);
        this.A0J = new C13408TYs(70, this, false);
        Q6J A002 = Q6J.A00(context);
        this.A0E = A002;
        View.inflate(A002, R.layout.fbpay_ui_navigation_bar, this);
        this.A08 = Pxe.A0M(this, R.id.navbar_left_container);
        this.A07 = Pxe.A0M(this, R.id.navbar_center_container);
        this.A09 = Pxe.A0M(this, R.id.navbar_right_container);
        this.A06 = DbS.A0G(this, R.id.title_icon);
        this.A0D = AnonymousClass7TE.A0d(this, R.id.title_text);
        this.A04 = DbS.A0G(this, R.id.left_icon_button);
        this.A0B = AnonymousClass7TE.A0d(this, R.id.left_text_button);
        this.A0C = AnonymousClass7TE.A0d(this, R.id.right_text_button);
        this.A05 = DbS.A0G(this, R.id.right_icon_button);
        Context context2 = this.A0E;
        Context context3 = context2;
        this.A03 = new View(context2 == null ? getContext() : context2);
        this.A0A = (ProgressBar) findViewById(R.id.progress_icon);
        View view = this.A03;
        String str = "bottomDivider";
        if (view != null) {
            FrameLayout.LayoutParams A0D2 = JTS.A0D();
            A0D2.gravity = 80;
            addView(view, A0D2);
            TextView textView = this.A0D;
            if (textView != null) {
                SRn.A02(textView, RH2.A0v);
                TextView textView2 = this.A0B;
                if (textView2 != null) {
                    RH2 rh2 = RH2.A10;
                    SRn.A02(textView2, rh2);
                    TextView textView3 = this.A0C;
                    if (textView3 != null) {
                        SRn.A02(textView3, rh2);
                        TextView textView4 = this.A0B;
                        if (textView4 != null) {
                            SRn.A00(textView4);
                            TextView textView5 = this.A0C;
                            if (textView5 != null) {
                                SRn.A00(textView5);
                                ProgressBar progressBar = this.A0A;
                                if (progressBar == null) {
                                    str = "progressIcon";
                                } else {
                                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                                    if (indeterminateDrawable != null) {
                                        SPB A0A2 = AnonymousClass2E0.A0A();
                                        Context context4 = context3 == null ? getContext() : context3;
                                        0qQ.A0A(context4);
                                        indeterminateDrawable.setColorFilter(A0A2.A03(context4, 25), PorterDuff.Mode.MULTIPLY);
                                    }
                                    Context context5 = context3 == null ? getContext() : context3;
                                    AnonymousClass2E0.A0A();
                                    TypedArray obtainStyledAttributes = context5.obtainStyledAttributes(R.style.FBPayUINavigationBar, C71382cm.A0f);
                                    C11409SSh.A00(obtainStyledAttributes, AnonymousClass7TE.A0b(this, R.id.navi_bar_container), 1, R.style.FBPayUINavigationBarContainer);
                                    ImageView imageView = this.A06;
                                    if (imageView == null) {
                                        str = "titleIconView";
                                    } else {
                                        C11409SSh.A00(obtainStyledAttributes, imageView, 3, R.style.FBPayUINavigationBarTitleIcon);
                                        TextView textView6 = this.A0D;
                                        if (textView6 != null) {
                                            C11409SSh.A00(obtainStyledAttributes, textView6, 4, R.style.FBPayUINavigationBarTitle);
                                            View view2 = this.A03;
                                            if (view2 != null) {
                                                C11409SSh.A05(view2, obtainStyledAttributes.getResourceId(0, R.style.FBPayUINavigationBarBottomDivider), false);
                                                TextView textView7 = this.A0B;
                                                if (textView7 != null) {
                                                    C11409SSh.A00(obtainStyledAttributes, textView7, 2, R.style.FBPayUINavigationBarLeftOrRightTextButton);
                                                    TextView textView8 = this.A0C;
                                                    if (textView8 != null) {
                                                        C11409SSh.A00(obtainStyledAttributes, textView8, 2, R.style.FBPayUINavigationBarLeftOrRightTextButton);
                                                        ImageView imageView2 = this.A04;
                                                        if (imageView2 == null) {
                                                            str = "leftIconButton";
                                                        } else {
                                                            C11409SSh.A05(imageView2, R.style.FBPayUINavigationBarRightIconButton, false);
                                                            ImageView imageView3 = this.A05;
                                                            if (imageView3 == null) {
                                                                str = "rightIconButton";
                                                            } else {
                                                                C11409SSh.A05(imageView3, R.style.FBPayUINavigationBarRightIconButton, false);
                                                                obtainStyledAttributes.recycle();
                                                                context3 = context3 == null ? getContext() : context3;
                                                                0qQ.A0A(context3);
                                                                View view3 = this.A03;
                                                                if (view3 != null) {
                                                                    0qQ.A0B(context3, 0);
                                                                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                                                                    int applyDimension = (int) TypedValue.applyDimension(1, 0.5f, AnonymousClass7TF.A0E(context3));
                                                                    layoutParams.height = applyDimension == 0 ? 1 : applyDimension;
                                                                    C11409SSh.A01(this, 2);
                                                                    View view4 = this.A03;
                                                                    if (view4 != null) {
                                                                        C11409SSh.A01(view4, 19);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("rightTextButton");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("leftTextButton");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("titleTextView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    static {
        Class<NavigationBar> cls = NavigationBar.class;
        A0g = new AnonymousClass0YZ[]{Pxh.A0y(cls, DialogModule.KEY_TITLE, "getTitle()Ljava/lang/String;"), Pxh.A0y(cls, "titleIcon", "getTitleIcon()Lcom/facebookpay/widget/style/Icon;"), Pxh.A0y(cls, "leftIconButtonIcon", "getLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), Pxh.A0y(cls, "isLeftProfileIcon", "isLeftProfileIcon()Z"), Pxh.A0y(cls, "leftIconButtonOnClickListener", "getLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "leftTextButtonText", "getLeftTextButtonText()Ljava/lang/String;"), Pxh.A0y(cls, "isRightProfileIcon", "isRightProfileIcon()Z"), Pxh.A0y(cls, "rightIconButtonIcon", "getRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), Pxh.A0y(cls, "rightIconButtonOnClickListener", "getRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "rightTextButtonText", "getRightTextButtonText()Ljava/lang/String;"), Pxh.A0y(cls, "leftIconButtonEnable", "getLeftIconButtonEnable()Z"), Pxh.A0y(cls, "rightIconButtonEnable", "getRightIconButtonEnable()Z"), Pxh.A0y(cls, "leftTextButtonEnable", "getLeftTextButtonEnable()Z"), Pxh.A0y(cls, "rightTextButtonEnable", "getRightTextButtonEnable()Z"), Pxh.A0y(cls, "navBarClickableActionsEnable", "getNavBarClickableActionsEnable()Z"), Pxh.A0y(cls, "progressIconShow", "getProgressIconShow()Z"), Pxh.A0y(cls, "leftIconButtonLabel", "getLeftIconButtonLabel()Ljava/lang/String;"), Pxh.A0y(cls, "leftTextButtonHint", "getLeftTextButtonHint()Ljava/lang/String;"), Pxh.A0y(cls, "rightIconButtonLabel", "getRightIconButtonLabel()Ljava/lang/String;"), Pxh.A0y(cls, "rightTextButtonHint", "getRightTextButtonHint()Ljava/lang/String;"), Pxh.A0y(cls, "leftTextButtonOnClickListener", "getLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "rightTextButtonOnClickListener", "getRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), Pxh.A0y(cls, "bottomDividerVisible", "getBottomDividerVisible()Z")};
    }

    public static final void A01(NavigationBar navigationBar) {
        String str;
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            str = "navbarLeftContainer";
        } else {
            float measuredWidth = (float) linearLayout.getMeasuredWidth();
            LinearLayout linearLayout2 = navigationBar.A07;
            if (linearLayout2 == null) {
                str = "navbarCenterContainer";
            } else {
                float measuredWidth2 = ((float) linearLayout2.getMeasuredWidth()) * 0.6f;
                LinearLayout linearLayout3 = navigationBar.A09;
                if (linearLayout3 == null) {
                    str = "navbarRightContainer";
                } else {
                    float measuredWidth3 = (float) linearLayout3.getMeasuredWidth();
                    float f = measuredWidth + measuredWidth2 + measuredWidth3;
                    float f2 = measuredWidth / f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    float f3 = measuredWidth2 / f;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    float f4 = measuredWidth3 / f;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(R.id.navi_bar_container);
                    C270354gb r1 = new C270354gb();
                    r1.A0I(constraintLayout);
                    r1.A07(R.id.navbar_left_container, f2);
                    r1.A07(R.id.navbar_center_container, f3);
                    r1.A07(R.id.navbar_right_container, f4);
                    r1.A0G(constraintLayout);
                    constraintLayout.requestLayout();
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            0qQ.A0F("navbarLeftContainer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0H);
        }
    }

    public static final void A04(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A09;
        if (linearLayout == null) {
            0qQ.A0F("navbarRightContainer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0I);
        }
    }

    public static final void A05(NavigationBar navigationBar, boolean z) {
        int i;
        Context context = navigationBar.A0E;
        if (context == null) {
            context = navigationBar.getContext();
        }
        AnonymousClass2E0.A0A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132017617, C71382cm.A0g);
        int i2 = 0;
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0, 0);
        View findViewById = navigationBar.findViewById(R.id.navi_bar_container);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.leftMargin;
        boolean z2 = navigationBar.A0F;
        if (z2) {
            i = 0;
        } else {
            i = marginLayoutParams.topMargin;
        }
        int i4 = marginLayoutParams.rightMargin;
        if (!z2) {
            i2 = dimensionPixelOffset;
        }
        marginLayoutParams.setMargins(i3, i, i4, i2);
        findViewById.requestLayout();
        findViewById.invalidate();
        obtainStyledAttributes.recycle();
    }

    public final boolean getBottomDividerVisible() {
        return AnonymousClass7TG.A1a(this, this.A0J, A0g, 22);
    }

    public final boolean getLeftIconButtonEnable() {
        return AnonymousClass7TG.A1a(this, this.A0M, A0g, 10);
    }

    public final RH3 getLeftIconButtonIcon() {
        return (RH3) Pxe.A0s(this, this.A0N, A0g, 2);
    }

    public final String getLeftIconButtonLabel() {
        return DbV.A13(this, this.A0O, A0g, 16);
    }

    public final View.OnClickListener getLeftIconButtonOnClickListener() {
        return (View.OnClickListener) Pxe.A0s(this, this.A0P, A0g, 4);
    }

    public final boolean getLeftTextButtonEnable() {
        return AnonymousClass7TG.A1a(this, this.A0Q, A0g, 12);
    }

    public final String getLeftTextButtonHint() {
        return DbV.A13(this, this.A0R, A0g, 17);
    }

    public final View.OnClickListener getLeftTextButtonOnClickListener() {
        return (View.OnClickListener) Pxe.A0s(this, this.A0S, A0g, 20);
    }

    public final String getLeftTextButtonText() {
        return DbV.A13(this, this.A0T, A0g, 5);
    }

    public final boolean getNavBarClickableActionsEnable() {
        return AnonymousClass7TG.A1a(this, this.A0U, A0g, 14);
    }

    public final boolean getProgressIconShow() {
        return AnonymousClass7TG.A1a(this, this.A0V, A0g, 15);
    }

    public final boolean getRightIconButtonEnable() {
        return AnonymousClass7TG.A1a(this, this.A0W, A0g, 11);
    }

    public final RH3 getRightIconButtonIcon() {
        return (RH3) Pxe.A0s(this, this.A0X, A0g, 7);
    }

    public final String getRightIconButtonLabel() {
        return DbV.A13(this, this.A0Y, A0g, 18);
    }

    public final View.OnClickListener getRightIconButtonOnClickListener() {
        return (View.OnClickListener) Pxe.A0s(this, this.A0Z, A0g, 8);
    }

    public final boolean getRightTextButtonEnable() {
        return AnonymousClass7TG.A1a(this, this.A0a, A0g, 13);
    }

    public final String getRightTextButtonHint() {
        return DbV.A13(this, this.A0b, A0g, 19);
    }

    public final View.OnClickListener getRightTextButtonOnClickListener() {
        return (View.OnClickListener) Pxe.A0s(this, this.A0c, A0g, 21);
    }

    public final String getRightTextButtonText() {
        return DbV.A13(this, this.A0d, A0g, 9);
    }

    public final String getTitle() {
        return DbV.A13(this, this.A0e, A0g, 0);
    }

    public final RH3 getTitleIcon() {
        return (RH3) Pxe.A0s(this, this.A0f, A0g, 1);
    }

    public final void setBottomDividerVisible(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0J, A0g, 22, z);
    }

    public final void setLandscape(boolean z) {
        this.A0F = z;
        A05(this, getBottomDividerVisible());
    }

    public final void setLeftIconButtonEnable(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0M, A0g, 10, z);
    }

    public final void setLeftIconButtonIcon(RH3 rh3) {
        DbS.A1a(this, rh3, this.A0N, A0g, 2);
    }

    public final void setLeftIconButtonLabel(String str) {
        DbS.A1a(this, str, this.A0O, A0g, 16);
    }

    public final void setLeftIconButtonOnClickListener(View.OnClickListener onClickListener) {
        DbS.A1a(this, onClickListener, this.A0P, A0g, 4);
    }

    public final void setLeftProfileIcon(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0K, A0g, 3, z);
    }

    public final void setLeftTextButtonEnable(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0Q, A0g, 12, z);
    }

    public final void setLeftTextButtonHint(String str) {
        DbS.A1a(this, str, this.A0R, A0g, 17);
    }

    public final void setLeftTextButtonOnClickListener(View.OnClickListener onClickListener) {
        DbS.A1a(this, onClickListener, this.A0S, A0g, 20);
    }

    public final void setLeftTextButtonText(String str) {
        DbS.A1a(this, str, this.A0T, A0g, 5);
    }

    public final void setNavBarClickableActionsEnable(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0U, A0g, 14, z);
    }

    public final void setProgressIconShow(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0V, A0g, 15, z);
    }

    public final void setRightIconButtonEnable(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0W, A0g, 11, z);
    }

    public final void setRightIconButtonIcon(RH3 rh3) {
        DbS.A1a(this, rh3, this.A0X, A0g, 7);
    }

    public final void setRightIconButtonLabel(String str) {
        DbS.A1a(this, str, this.A0Y, A0g, 18);
    }

    public final void setRightIconButtonOnClickListener(View.OnClickListener onClickListener) {
        DbS.A1a(this, onClickListener, this.A0Z, A0g, 8);
    }

    public final void setRightProfileIcon(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0L, A0g, 6, z);
    }

    public final void setRightTextButtonEnable(boolean z) {
        AnonymousClass7TF.A1J(this, this.A0a, A0g, 13, z);
    }

    public final void setRightTextButtonHint(String str) {
        DbS.A1a(this, str, this.A0b, A0g, 19);
    }

    public final void setRightTextButtonOnClickListener(View.OnClickListener onClickListener) {
        DbS.A1a(this, onClickListener, this.A0c, A0g, 21);
    }

    public final void setRightTextButtonText(String str) {
        DbS.A1a(this, str, this.A0d, A0g, 9);
    }

    public final void setTitle(String str) {
        DbS.A1a(this, str, this.A0e, A0g, 0);
    }

    public final void setTitleIcon(RH3 rh3) {
        DbS.A1a(this, rh3, this.A0f, A0g, 1);
    }

    public static final void A00(ImageView imageView) {
        imageView.setImageDrawable(AnonymousClass2E0.A0A().A05(AnonymousClass7TE.A0S(imageView), 11, 18));
        String url = AnonymousClass0t1.A01.A01(AnonymousClass2E0.A0H().A00).Bh3().getUrl();
        if (url != null) {
            C10911S0m A0G2 = AnonymousClass2E0.A0G();
            if (A0G2.A00(url)) {
                C8287QnT qnT = new C8287QnT(A0G2.A00, url, "ProfileIconButtonContextName");
                qnT.A06 = true;
                qnT.A02(imageView);
            }
        }
        imageView.setVisibility(0);
    }

    public static final void A02(NavigationBar navigationBar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(R.id.navi_bar_container);
        C270354gb r2 = new C270354gb();
        r2.A0I(constraintLayout);
        r2.A07(R.id.navbar_left_container, 0.0f);
        r2.A07(R.id.navbar_center_container, 0.0f);
        r2.A07(R.id.navbar_right_container, 0.0f);
        r2.A0G(constraintLayout);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
