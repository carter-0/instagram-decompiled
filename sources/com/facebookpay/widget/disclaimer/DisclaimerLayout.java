package com.facebookpay.widget.disclaimer;

import X.0qQ;
import X.0s0;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0YZ;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C11409SSh;
import X.C13408TYs;
import X.C54770HSc;
import X.C8869RDl;
import X.DbS;
import X.DbV;
import X.Pxe;
import X.Pxh;
import X.Pxi;
import X.RH2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.accessibility.AccessibleTextView;
import com.instagram.android.R;

public final class DisclaimerLayout extends LinearLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A0A;
    public View A00;
    public ShimmerFrameLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public ShimmerFrameLayout A04;
    public AccessibleTextView A05;
    public final 0s0 A06;
    public final 0s0 A07;
    public final 0s0 A08;
    public final 0s0 A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = new C13408TYs((Object) this, 26);
        this.A07 = new C13408TYs((Object) this, 27);
        RH2 rh2 = RH2.A14;
        this.A09 = new C13408TYs(28, this, rh2);
        this.A06 = new C13408TYs(29, this, C8869RDl.DISCLAIMER_PUX);
        View inflate = View.inflate(context, R.layout.fbpay_ui_disclaimer, this);
        this.A00 = inflate;
        if (inflate == null) {
            0qQ.A0F("containerView");
            throw AnonymousClass00P.createAndThrow();
        }
        ((LinearLayout) inflate).setOrientation(1);
        setPrimaryTextView((AccessibleTextView) findViewById(R.id.disclaimer_ui_primary_text));
        this.A01 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_1);
        this.A02 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_2);
        this.A03 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_3);
        this.A04 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_4);
        setPrimaryTextStyle(rh2);
        C11409SSh.A01(this, 2);
        ShimmerFrameLayout shimmerFrameLayout = this.A01;
        if (shimmerFrameLayout != null) {
            C11409SSh.A05(shimmerFrameLayout, 2132017644, false);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
            if (shimmerFrameLayout2 != null) {
                C11409SSh.A05(shimmerFrameLayout2, 2132017644, false);
                ShimmerFrameLayout shimmerFrameLayout3 = this.A03;
                if (shimmerFrameLayout3 != null) {
                    C11409SSh.A05(shimmerFrameLayout3, 2132017644, false);
                    ShimmerFrameLayout shimmerFrameLayout4 = this.A04;
                    if (shimmerFrameLayout4 != null) {
                        C11409SSh.A05(shimmerFrameLayout4, 2132017644, false);
                        ShimmerFrameLayout shimmerFrameLayout5 = this.A01;
                        if (shimmerFrameLayout5 != null) {
                            AnonymousClass2E0.A0A();
                            Context A0S = AnonymousClass7TE.A0S(this);
                            Drawable drawable = A0S.getDrawable(R.drawable.fbpay_shimmer_background);
                            if (drawable != null) {
                                AnonymousClass2E0.A0A();
                                Pxi.A0u(A0S, drawable, shimmerFrameLayout5, R.color.igds_primary_text);
                                ShimmerFrameLayout shimmerFrameLayout6 = this.A02;
                                if (shimmerFrameLayout6 != null) {
                                    AnonymousClass2E0.A0A();
                                    Drawable drawable2 = A0S.getDrawable(R.drawable.fbpay_shimmer_background);
                                    if (drawable2 != null) {
                                        AnonymousClass2E0.A0A();
                                        Pxi.A0u(A0S, drawable2, shimmerFrameLayout6, R.color.igds_primary_text);
                                        ShimmerFrameLayout shimmerFrameLayout7 = this.A03;
                                        if (shimmerFrameLayout7 != null) {
                                            AnonymousClass2E0.A0A();
                                            Drawable drawable3 = A0S.getDrawable(R.drawable.fbpay_shimmer_background);
                                            if (drawable3 != null) {
                                                AnonymousClass2E0.A0A();
                                                Pxi.A0u(A0S, drawable3, shimmerFrameLayout7, R.color.igds_primary_text);
                                                ShimmerFrameLayout shimmerFrameLayout8 = this.A04;
                                                if (shimmerFrameLayout8 != null) {
                                                    AnonymousClass2E0.A0A();
                                                    Drawable drawable4 = A0S.getDrawable(R.drawable.fbpay_shimmer_background);
                                                    if (drawable4 != null) {
                                                        AnonymousClass2E0.A0A();
                                                        Pxi.A0u(A0S, drawable4, shimmerFrameLayout8, R.color.igds_primary_text);
                                                        ShimmerFrameLayout shimmerFrameLayout9 = this.A01;
                                                        if (shimmerFrameLayout9 != null) {
                                                            C54770HSc.A00(shimmerFrameLayout9, AnonymousClass05K.A0Y);
                                                            ShimmerFrameLayout shimmerFrameLayout10 = this.A02;
                                                            if (shimmerFrameLayout10 != null) {
                                                                Integer num = AnonymousClass05K.A0C;
                                                                C54770HSc.A00(shimmerFrameLayout10, num);
                                                                ShimmerFrameLayout shimmerFrameLayout11 = this.A03;
                                                                if (shimmerFrameLayout11 != null) {
                                                                    C54770HSc.A00(shimmerFrameLayout11, num);
                                                                    ShimmerFrameLayout shimmerFrameLayout12 = this.A04;
                                                                    if (shimmerFrameLayout12 != null) {
                                                                        C54770HSc.A00(shimmerFrameLayout12, AnonymousClass05K.A00);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                    }
                                                }
                                            } else {
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                    0qQ.A0F("shimmerRow4");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("shimmerRow3");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("shimmerRow2");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("shimmerRow1");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setDisclaimerType(C8869RDl rDl) {
        0qQ.A0B(rDl, 0);
        DbS.A1a(this, rDl, this.A06, A0A, 3);
    }

    public final void setPrimaryTextStyle(RH2 rh2) {
        0qQ.A0B(rh2, 0);
        DbS.A1a(this, rh2, this.A09, A0A, 2);
    }

    public final void setPrimaryTextView(AccessibleTextView accessibleTextView) {
        0qQ.A0B(accessibleTextView, 0);
        this.A05 = accessibleTextView;
    }

    static {
        Class<DisclaimerLayout> cls = DisclaimerLayout.class;
        A0A = new AnonymousClass0YZ[]{Pxh.A0y(cls, "primaryText", "getPrimaryText()Ljava/lang/String;"), Pxh.A0y(cls, "primaryLinkableText", "getPrimaryLinkableText()Ljava/lang/CharSequence;"), Pxh.A0y(cls, "primaryTextStyle", "getPrimaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), Pxh.A0y(cls, "disclaimerType", "getDisclaimerType()Lcom/facebookpay/widget/disclaimer/DisclaimerWidgetStyleType;")};
    }

    public final C8869RDl getDisclaimerType() {
        return (C8869RDl) Pxe.A0s(this, this.A06, A0A, 3);
    }

    public final CharSequence getPrimaryLinkableText() {
        return (CharSequence) Pxe.A0s(this, this.A07, A0A, 1);
    }

    public final String getPrimaryText() {
        return DbV.A13(this, this.A08, A0A, 0);
    }

    public final RH2 getPrimaryTextStyle() {
        return (RH2) Pxe.A0s(this, this.A09, A0A, 2);
    }

    public final AccessibleTextView getPrimaryTextView() {
        AccessibleTextView accessibleTextView = this.A05;
        if (accessibleTextView != null) {
            return accessibleTextView;
        }
        0qQ.A0F("primaryTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setPrimaryLinkableText(CharSequence charSequence) {
        DbS.A1a(this, charSequence, this.A07, A0A, 1);
    }

    public final void setPrimaryText(String str) {
        DbS.A1a(this, str, this.A08, A0A, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
