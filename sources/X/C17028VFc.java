package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.VFc  reason: case insensitive filesystem */
public abstract class C17028VFc {
    public static void A00(Context context, AnonymousClass0iw r9, UserSession userSession, C17699VcU vcU, C17675Vc6 vc6) {
        TextView textView;
        CharSequence charSequence;
        int ordinal;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = vc6.A08;
        gradientSpinnerAvatarView.setVisibility(8);
        IgImageView igImageView = vc6.A03;
        igImageView.setVisibility(8);
        IgImageView igImageView2 = vc6.A04;
        igImageView2.setVisibility(8);
        C16728V3l v3l = vcU.A02;
        int intValue = v3l.A02.intValue();
        if (intValue == 0) {
            igImageView2.setVisibility(0);
            ImageUrl imageUrl = v3l.A01;
            if (imageUrl != null) {
                igImageView2.setUrl(imageUrl, r9);
            } else {
                igImageView2.setPlaceHolderColor(AnonymousClass7TF.A03(context, R.attr.igds_color_elevated_separator));
                igImageView2.A09();
            }
        } else if (intValue == 1) {
            igImageView.setVisibility(0);
            Drawable drawable = v3l.A00;
            if (drawable != null) {
                igImageView.setImageDrawable(drawable);
                DbX.A12(context, igImageView, 2Yu.A0B(context));
            } else {
                igImageView.A09();
            }
        } else if (intValue == 2) {
            gradientSpinnerAvatarView.setVisibility(0);
            ImageUrl imageUrl2 = v3l.A01;
            if (imageUrl2 != null) {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r9, imageUrl2);
            } else {
                gradientSpinnerAvatarView.A04();
            }
        }
        WBC.A00(vc6.A00, 5, vcU);
        Reel reel = vcU.A00;
        if (reel != null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
            gradientSpinnerAvatarView.setGradientColorRes(R.style.GradientPatternStyle);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(!reel.A16(userSession));
            1Ns r0 = reel.A0W;
            if (r0 != null && ((ordinal = r0.Aht().ordinal()) == 2 || ordinal == 3 || ordinal == 1)) {
                ReelBrandingBadgeView reelBrandingBadgeView = vc6.A07;
                reelBrandingBadgeView.setVisibility(0);
                reelBrandingBadgeView.A03(reel.A0W.Aht());
            }
            if (vcU.A03 != null) {
                gradientSpinnerAvatarView.setClickable(true);
                WBD.A00(gradientSpinnerAvatarView, 4, vc6, vcU);
            }
        } else {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            vc6.A07.setVisibility(8);
            gradientSpinnerAvatarView.setOnClickListener((View.OnClickListener) null);
            gradientSpinnerAvatarView.setClickable(false);
        }
        TextView textView2 = vc6.A02;
        CharSequence charSequence2 = vcU.A06;
        textView2.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            vc6.A01.setVisibility(0);
        }
        if (vcU.A08) {
            C71662eb r02 = vc6.A05;
            r02.A03(0);
            View A01 = r02.A01();
            textView = Dba.A05(A01);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) A01.requireViewById(R.id.subtitle_shimmer_container_one);
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) A01.requireViewById(R.id.subtitle_shimmer_container_two);
            textView.setVisibility(8);
            shimmerFrameLayout.setVisibility(8);
            shimmerFrameLayout2.setVisibility(8);
            if (vcU.A0A) {
                shimmerFrameLayout.setVisibility(0);
                shimmerFrameLayout.A02();
                shimmerFrameLayout2.setVisibility(0);
                shimmerFrameLayout2.A02();
                return;
            }
            charSequence = vcU.A07;
        } else {
            C71662eb r5 = vc6.A06;
            r5.A03(0);
            View A012 = r5.A01();
            TextView A0G = DbU.A0G(A012, R.id.subtitleOne);
            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) A012.requireViewById(R.id.subtitleOne_shimmer_container);
            A0G.setVisibility(8);
            shimmerFrameLayout3.setVisibility(8);
            if (vcU.A09) {
                shimmerFrameLayout3.setVisibility(0);
                shimmerFrameLayout3.A02();
            } else {
                CharSequence charSequence3 = vcU.A04;
                if (!TextUtils.isEmpty(charSequence3)) {
                    A0G.setVisibility(0);
                    A0G.setText(charSequence3);
                }
            }
            View A013 = r5.A01();
            textView = DbU.A0G(A013, R.id.subtitleTwo);
            View requireViewById = A013.requireViewById(R.id.subtitleTwo_shimmer_container);
            textView.setVisibility(8);
            requireViewById.setVisibility(8);
            charSequence = vcU.A05;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }
}
