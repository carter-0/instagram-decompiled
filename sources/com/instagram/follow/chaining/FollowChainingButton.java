package com.instagram.follow.chaining;

import X.02K;
import X.0qQ;
import X.1QE;
import X.1QG;
import X.2Yu;
import X.2eQ;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass37O;
import X.C320186rv;
import X.C322496vv;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.instagram.android.R;

public final class FollowChainingButton extends FrameLayout {
    public ImageView A00;
    public C320186rv A01 = new C320186rv(R.drawable.follow_chaining_button_following_selector, R.drawable.follow_chaining_button_not_following_selector, R.color.grey_9, R.color.design_dark_default_color_on_background);
    public int A02;
    public ProgressBar A03;
    public C322496vv A04 = C322496vv.Closed;
    public boolean A05;
    public final 1QG A06 = 1QE.A0E();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowChainingButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00();
    }

    public final void A01(C322496vv r7, boolean z) {
        int i;
        ColorStateList A022;
        0qQ.A0B(r7, 0);
        C322496vv r2 = this.A04;
        this.A04 = r7;
        this.A05 = z;
        ProgressBar progressBar = this.A03;
        if (progressBar != null) {
            int i2 = 4;
            if (r7 == C322496vv.Loading) {
                i2 = 0;
            }
            progressBar.setVisibility(i2);
            setBackgroundColor(z);
            C320186rv r0 = this.A01;
            if (z) {
                i = r0.A01;
            } else {
                i = r0.A03;
            }
            if (this.A06.A00) {
                Context context = getContext();
                0qQ.A07(context);
                A022 = 02K.A02(context, 1QE.A07(context, 1QE.A0E()));
                if (A022 == null) {
                    A022 = ColorStateList.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)));
                    0qQ.A07(A022);
                }
            } else {
                A022 = 02K.A02(getContext(), i);
                if (A022 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            ColorFilter A002 = AnonymousClass37O.A00(A022.getColorForState(getDrawableState(), 0));
            setImageButtonContent(r7, A002);
            ProgressBar progressBar2 = this.A03;
            if (progressBar2 != null) {
                Drawable indeterminateDrawable = progressBar2.getIndeterminateDrawable();
                if (indeterminateDrawable != null) {
                    indeterminateDrawable.setColorFilter(A002);
                    if (r2 != r7 && !isFocused()) {
                        2eQ.A06(this, 500);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        0qQ.A0F("progressBar");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setCustomButtonStyle(C320186rv r3) {
        0qQ.A0B(r3, 0);
        this.A01 = r3;
        A01(this.A04, this.A05);
    }

    private final void setBackgroundColor(boolean z) {
        int i;
        1QG r4 = this.A06;
        if (r4.A00) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Context context = getContext();
            0qQ.A07(context);
            gradientDrawable.setColor(1QE.A09(context));
            Resources resources = getResources();
            gradientDrawable.setCornerRadius((float) resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            if (r4 == 1QG.A04) {
                gradientDrawable.setStroke(resources.getDimensionPixelSize(R.dimen.afi_segmented_pill_border_width), 02K.A02(context, R.color.igds_prism_secondary_button_border_A));
            }
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setBackground(gradientDrawable);
                return;
            }
        } else {
            C320186rv r0 = this.A01;
            if (z) {
                i = r0.A00;
            } else {
                i = r0.A02;
            }
            ImageView imageView2 = this.A00;
            if (imageView2 != null) {
                imageView2.setBackgroundResource(i);
                return;
            }
        }
        0qQ.A0F("buttonImageView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void setButtonIcon(C322496vv r3, ColorFilter colorFilter) {
        Drawable mutate;
        C322496vv r0 = C322496vv.Closed;
        int i = R.drawable.instagram_user_follow_pano_filled_24;
        if (r3 == r0) {
            i = R.drawable.instagram_user_follow_pano_outline_24;
        }
        Drawable drawable = getContext().getDrawable(i);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            mutate.setColorFilter(colorFilter);
        }
        ImageView imageView = this.A00;
        if (imageView == null) {
            0qQ.A0F("buttonImageView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    private final void setImageButtonContent(C322496vv r5, ColorFilter colorFilter) {
        ImageView imageView = this.A00;
        if (imageView != null) {
            int i = this.A02;
            imageView.setPadding(i, i, i, i);
            if (r5 == C322496vv.Loading) {
                ImageView imageView2 = this.A00;
                if (imageView2 != null) {
                    imageView2.setImageDrawable((Drawable) null);
                    return;
                }
            } else {
                setButtonIcon(r5, colorFilter);
                return;
            }
        }
        0qQ.A0F("buttonImageView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00() {
        Context context = getContext();
        LayoutInflater.from(context).inflate(R.layout.chaining_button, this, true);
        this.A03 = (ProgressBar) requireViewById(R.id.chaining_button_progress_bar);
        this.A00 = (ImageView) requireViewById(R.id.chaining_button_image);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        2eS.A04(this, AnonymousClass05K.A01);
    }

    public final void setCustomImagePadding(int i) {
        this.A02 = getContext().getResources().getDimensionPixelSize(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowChainingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowChainingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00();
    }
}
