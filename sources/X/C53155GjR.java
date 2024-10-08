package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;
import java.util.List;

/* renamed from: X.GjR  reason: case insensitive filesystem */
public final class C53155GjR extends C249703kE implements AnonymousClass3V3, AnonymousClass2xU {
    public 1Xj A00;
    public AnonymousClass3W1 A01;
    public final int A02;
    public final View A03;
    public final ConstraintLayout A04;
    public final IgFrameLayout A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgLinearLayout A08;
    public final IgSimpleImageView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final CircularImageView A0D;
    public final IgImageView A0E;
    public final IgImageView A0F;
    public final IgdsButton A0G;
    public final SimpleVideoLayout A0H;
    public final RoundedCornerLinearLayout A0I;
    public final Context A0J;
    public final UserSession A0K;
    public final IgTextView A0L;
    public final IgView A0M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53155GjR(Context context, View view, UserSession userSession) {
        super(view);
        0qQ.A0B(view, 2);
        this.A0K = userSession;
        this.A03 = view;
        this.A0J = context;
        this.A0I = (RoundedCornerLinearLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_container);
        this.A04 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_profile_header_row);
        this.A0D = DbX.A0a(view, R.id.intent_aware_ad_pivot_profile_header_image_view);
        this.A0C = DbX.A0Z(view, R.id.intent_aware_ad_pivot_profile_name);
        this.A0F = DbX.A0b(view, R.id.intent_aware_ad_pivot_profile_header_row_media_options);
        this.A0E = DbX.A0b(view, R.id.intent_aware_ad_pivot_card_preview_image);
        this.A0G = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_cta);
        this.A0H = (SimpleVideoLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_preview_video);
        this.A08 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_name_cta_container);
        this.A0B = DbX.A0Z(view, R.id.intent_aware_ad_pivot_card_contextual_cta_text);
        this.A0L = DbX.A0Z(view, R.id.intent_aware_ad_pivot_card_contextual_caption_text);
        this.A09 = DbX.A0Y(view, R.id.intent_aware_ad_pivot_card_contextual_cta_chevron);
        this.A07 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_name_contextual_cta_container);
        this.A06 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_caption_container);
        this.A0A = DbX.A0Z(view, R.id.intent_aware_ad_pivot_card_caption_text);
        this.A0M = (IgView) AnonymousClass7TF.A0F(view, R.id.divider);
        this.A05 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_pivot_card_preview_image_container);
        this.A02 = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_button_on_media);
    }

    public final AnonymousClass3TS Adf() {
        return null;
    }

    public final C256043v8 B5X() {
        return null;
    }

    public final View BQB() {
        return null;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final void DQp(AnonymousClass3W1 r7, int i) {
        1Xy r0;
        String str;
        1Xj r1;
        1Xj r12;
        0qQ.A0B(r7, 0);
        if (i == 5) {
            Context context = this.A0J;
            int color = context.getColor(2Yu.A0C(context));
            1Xj r5 = this.A00;
            int color2 = context.getColor(R.color.badge_color);
            if (r5 != null) {
                if (r5.A5D()) {
                    str = null;
                    List A1I = C51966G9m.A1I(r5);
                    if (!(A1I == null || (r1 = (1Xj) 00k.A0J(A1I)) == null || r1.A0C.getDominantColor() == null)) {
                        List A1I2 = C51966G9m.A1I(r5);
                        if (!(A1I2 == null || (r12 = (1Xj) 00k.A0J(A1I2)) == null)) {
                            r0 = r12.A0C;
                            str = r0.getDominantColor();
                        }
                        color2 = Color.parseColor(str);
                    }
                }
                if (r5.A0C.getDominantColor() != null) {
                    r0 = r5.A0C;
                    str = r0.getDominantColor();
                    color2 = Color.parseColor(str);
                }
            }
            int A042 = C51968G9o.A04(context);
            if (r7.A29) {
                float[] A1b = C51965G9l.A1b();
                // fill-array-data instruction
                A1b[0] = 1065353216;
                A1b[1] = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                ofFloat.addUpdateListener(new C56691I7x(this, A042, color2, color));
                ofFloat.setDuration(200).start();
                return;
            }
            this.A0B.setTextColor(A042);
            this.A09.setColorFilter(A042);
            this.A07.setBackgroundColor(color);
        }
    }

    public final void EEI(int i) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3TN] */
    public final AnonymousClass3TN B5Y() {
        return new Object();
    }

    public final View BG1() {
        return this.A0E;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A01;
    }

    public final C242423Ua C5r() {
        return this.A0H;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A0H.getWidth();
    }

    public final void Epi(AnonymousClass0iw r3, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1N(imageUrl, r3);
        this.A0E.A0D(r3, (0lg) null, imageUrl, z);
    }
}
