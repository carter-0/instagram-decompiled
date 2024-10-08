package com.facebookpay.widget.banner;

import X.0qQ;
import X.0s0;
import X.AnonymousClass00P;
import X.AnonymousClass0YZ;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C11386SQz;
import X.C11409SSh;
import X.C13408TYs;
import X.DbS;
import X.DbU;
import X.DbV;
import X.Pxe;
import X.Pxh;
import X.REP;
import X.RH2;
import X.SRn;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.widget.accessibility.AccessibleTextView;
import com.instagram.android.R;

public final class FBPayBanner extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A08;
    public ImageView A00;
    public TextView A01;
    public ConstraintLayout A02;
    public AccessibleTextView A03;
    public final 0s0 A04;
    public final 0s0 A05;
    public final 0s0 A06;
    public final 0s0 A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A05 = new C13408TYs((Object) this, 1);
        this.A06 = new C13408TYs((Object) this, 2);
        this.A07 = new C13408TYs((Object) this, 3);
        this.A04 = new C13408TYs((Object) this, 4);
        View.inflate(context, R.layout.fbpay_banner, this);
        this.A00 = DbU.A0F(this, R.id.icon);
        this.A01 = DbU.A0G(this, R.id.primary_text);
        this.A03 = (AccessibleTextView) requireViewById(R.id.secondary_text);
        this.A02 = (ConstraintLayout) requireViewById(R.id.banner_view_container);
        TextView textView = this.A01;
        String str = "primaryTextView";
        if (textView != null) {
            AnonymousClass2E0.A0A();
            C11409SSh.A05(textView, R.style.FbpayBannerPrimaryTextStyle, false);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                SRn.A02(textView2, RH2.A08);
                AccessibleTextView accessibleTextView = this.A03;
                str = "secondaryTextView";
                if (accessibleTextView != null) {
                    SRn.A02(accessibleTextView, RH2.A09);
                    AccessibleTextView accessibleTextView2 = this.A03;
                    if (accessibleTextView2 != null) {
                        accessibleTextView2.setMovementMethod(new LinkMovementMethod());
                        Context A0S = AnonymousClass7TE.A0S(this);
                        ConstraintLayout constraintLayout = this.A02;
                        str = "bannerContainer";
                        if (constraintLayout != null) {
                            C11386SQz.A02(A0S, constraintLayout, REP.ALL_BORDERED_ALL_ROUNDED, 59, 60);
                            ConstraintLayout constraintLayout2 = this.A02;
                            if (constraintLayout2 != null) {
                                C11409SSh.A04(constraintLayout2, 32, false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    static {
        Class<FBPayBanner> cls = FBPayBanner.class;
        A08 = new AnonymousClass0YZ[]{Pxh.A0y(cls, "primaryText", "getPrimaryText()Ljava/lang/CharSequence;"), Pxh.A0y(cls, "secondaryText", "getSecondaryText()Ljava/lang/CharSequence;"), Pxh.A0y(cls, "secondaryTextClickHint", "getSecondaryTextClickHint()Ljava/lang/String;"), Pxh.A0y(cls, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Landroid/graphics/drawable/Drawable;")};
    }

    public final Drawable getIcon() {
        return (Drawable) Pxe.A0s(this, this.A04, A08, 3);
    }

    public final CharSequence getPrimaryText() {
        return (CharSequence) Pxe.A0s(this, this.A05, A08, 0);
    }

    public final CharSequence getSecondaryText() {
        return (CharSequence) Pxe.A0s(this, this.A06, A08, 1);
    }

    public final String getSecondaryTextClickHint() {
        return DbV.A13(this, this.A07, A08, 2);
    }

    public final void setIcon(Drawable drawable) {
        DbS.A1a(this, drawable, this.A04, A08, 3);
    }

    public final void setPrimaryText(CharSequence charSequence) {
        DbS.A1a(this, charSequence, this.A05, A08, 0);
    }

    public final void setSecondaryText(CharSequence charSequence) {
        DbS.A1a(this, charSequence, this.A06, A08, 1);
    }

    public final void setSecondaryTextClickHint(String str) {
        DbS.A1a(this, str, this.A07, A08, 2);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ConstraintLayout constraintLayout = this.A02;
        if (constraintLayout == null) {
            0qQ.A0F("bannerContainer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            constraintLayout.setVisibility(i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
