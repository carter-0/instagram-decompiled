package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.2go  reason: invalid class name and case insensitive filesystem */
public final class C226432go {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final View A03;
    public final C226462gr A04;
    public final C226462gr A05;
    public final ColorFilterAlphaImageView A06;
    public final 1Av A07;
    public final Runnable A08;
    public final int A09;
    public final UserSession A0A;
    public final Runnable A0B;

    public final void A00() {
        1Av r3 = this.A07;
        if (((Number) r3.A6p.CDM(r3, 1Av.A8a[522])).intValue() < 2) {
            UserSession userSession = this.A0A;
            if (AnonymousClass39U.A02(userSession) && 182.A06(0Tu.A05, userSession, 36325557785343023L)) {
                this.A00 = true;
                11Z.A04(this.A0B, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    }

    public final void A01() {
        int i;
        int i2;
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A06;
        if (colorFilterAlphaImageView != null && (i = this.A02) != 0 && (i2 = this.A01) != 0 && this.A00) {
            C226462gr r1 = this.A04;
            if (r1 != null && r1.isPlaying()) {
                r1.stop();
            }
            C226462gr r12 = this.A05;
            if (r12 != null && r12.isPlaying()) {
                r12.stop();
            }
            colorFilterAlphaImageView.getLayoutParams().width = i;
            colorFilterAlphaImageView.getLayoutParams().height = i2;
            colorFilterAlphaImageView.setImageResource(this.A09);
            11Z.A01(this.A0B);
            11Z.A01(this.A08);
            this.A00 = false;
        }
    }

    public C226432go(Context context, View view, UserSession userSession, int i) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.A0A = userSession;
        this.A03 = view;
        this.A09 = i;
        this.A07 = 1Au.A00(userSession);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.findViewById(R.id.tab_icon);
        this.A06 = colorFilterAlphaImageView;
        int i3 = 0;
        if (colorFilterAlphaImageView == null || (layoutParams2 = colorFilterAlphaImageView.getLayoutParams()) == null) {
            i2 = 0;
        } else {
            i2 = layoutParams2.width;
        }
        this.A02 = i2;
        if (!(colorFilterAlphaImageView == null || (layoutParams = colorFilterAlphaImageView.getLayoutParams()) == null)) {
            i3 = layoutParams.height;
        }
        this.A01 = i3;
        this.A04 = (C226462gr) context.getDrawable(R.drawable.qs_promo_qspromofeedintro);
        this.A05 = (C226462gr) context.getDrawable(R.drawable.qs_promo_qspromofeedoutro);
        this.A0B = new AnonymousClass2h5(this);
        this.A08 = new AnonymousClass2h6(this);
    }
}
