package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;

public abstract class LKL {
    public static final Integer A00(LiveUserPaySupportTier liveUserPaySupportTier, boolean z) {
        int i;
        0qQ.A0B(liveUserPaySupportTier, 0);
        int ordinal = liveUserPaySupportTier.ordinal();
        if (z) {
            if (ordinal == 1) {
                i = R.drawable.instagram_creator_experience_assets_badges1_12_android;
            } else if (ordinal == 2) {
                i = R.drawable.instagram_creator_experience_assets_badges2_12_android;
            } else if (ordinal == 3) {
                i = R.drawable.instagram_creator_experience_assets_badges3_12_android;
            } else if (ordinal == 0) {
                return null;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        } else if (ordinal == 1) {
            i = R.drawable.instagram_creator_experience_assets_badges1_24_android;
        } else if (ordinal == 2) {
            i = R.drawable.instagram_creator_experience_assets_badges2_24_android;
        } else if (ordinal == 3) {
            i = R.drawable.instagram_creator_experience_assets_badges3_24_android;
        } else if (ordinal == 0) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return Integer.valueOf(i);
    }

    public static final void A01(Context context, ImageView imageView, TextView textView, LiveUserPaySupportTier liveUserPaySupportTier, int i) {
        Drawable drawable;
        int[] iArr;
        int i2;
        int i3;
        int A02 = DbW.A02(1, imageView, textView);
        imageView.setVisibility(0);
        Integer A00 = A00(liveUserPaySupportTier, true);
        if (A00 != null) {
            drawable = JTP.A0E(context, A00);
        } else {
            drawable = null;
        }
        imageView.setBackground(drawable);
        if (i > 1) {
            textView.setVisibility(0);
            String A0O = 002.A0O("+", i - 1);
            0qQ.A07(A0O);
            textView.setText(A0O);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
            int ordinal = liveUserPaySupportTier.ordinal();
            if (ordinal == 1) {
                iArr = new int[A02];
                iArr[0] = context.getColor(R.color.activator_card_progress_bad);
                i3 = R.attr.igds_color_gradient_red;
                i2 = 2Yu.A0H(context, i3);
                iArr[1] = context.getColor(i2);
            } else if (ordinal == A02) {
                iArr = new int[A02];
                iArr[0] = AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_red);
                i3 = R.attr.igds_color_gradient_purple;
                i2 = 2Yu.A0H(context, i3);
                iArr[1] = context.getColor(i2);
            } else if (ordinal == 3) {
                iArr = new int[A02];
                iArr[0] = AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_purple);
                i2 = R.color.igds_sticker_text_vibrant_gradient_purple;
                iArr[1] = context.getColor(i2);
            } else if (ordinal == 0) {
                iArr = null;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            gradientDrawable.setColors(iArr);
            gradientDrawable.setCornerRadius((float) AnonymousClass7TE.A0H(textView.getResources()));
            textView.setBackground(gradientDrawable);
            return;
        }
        textView.setVisibility(8);
    }
}
