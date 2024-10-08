package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.357  reason: invalid class name */
public final class AnonymousClass357 implements C252203oj {
    public static final C71392co A0E = C71392co.A04(12.0d, 5.0d);
    public int A00 = -1;
    public Drawable A01;
    public View A02;
    public AnimationSet A03;
    public AnimationSet A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public 2cs A08;
    public final boolean A09;
    public final int A0A;
    public final Context A0B;
    public final View.OnClickListener A0C;
    public final String A0D;

    public AnonymousClass357(Context context, View.OnClickListener onClickListener, String str, int i, boolean z) {
        Context context2 = context;
        this.A0B = context2;
        this.A0D = str;
        this.A0C = onClickListener;
        this.A09 = z;
        this.A0A = i;
        Resources resources = context2.getResources();
        int integer = resources.getInteger(17694721);
        int integer2 = resources.getInteger(17694720);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f));
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setStartOffset((long) (integer / 3));
        animationSet.setDuration((long) integer);
        this.A03 = animationSet;
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet2.addAnimation(new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f));
        animationSet2.setDuration((long) integer2);
        this.A04 = animationSet2;
        if (z) {
            2cs A022 = C61340me.A00().A02();
            A022.A09(A0E);
            A022.A0A(this);
            this.A08 = A022;
        }
    }

    public final void A06(FrameLayout frameLayout) {
        0qQ.A0B(frameLayout, 0);
        Context context = this.A0B;
        int i = this.A0A;
        if (i != -1) {
            context = new ContextThemeWrapper(context, i);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.new_feed_pill, frameLayout, false);
        inflate.setVisibility(8);
        AnonymousClass0fU.A00(this.A0C, inflate);
        if (this.A00 != -1) {
            A00(inflate, this);
        }
        frameLayout.addView(inflate);
        this.A07 = (TextView) inflate.requireViewById(R.id.new_feed_pill_text);
        this.A06 = (TextView) inflate.requireViewById(R.id.new_feed_pill_badge);
        this.A05 = (ImageView) inflate.requireViewById(R.id.new_feed_pill_accessory);
        TextView textView = (TextView) inflate.requireViewById(R.id.new_feed_pill_text);
        textView.setText(this.A0D);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
        for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0B(context))));
            }
        }
        2eS.A04(textView, AnonymousClass05K.A01);
        TextView textView2 = this.A06;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView = this.A05;
        if (imageView != null) {
            if (this.A01 != null) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(this.A01);
            } else {
                imageView.setVisibility(8);
            }
        }
        this.A07 = textView;
        this.A02 = inflate;
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        View view = this.A02;
        if (view != null) {
            view.setTranslationY((float) r5.A09.A00);
        }
    }

    public static final void A00(View view, AnonymousClass357 r3) {
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        if (view != null) {
            int i = r3.A00;
            if (i == -1) {
                i = -2;
            }
            0nA.A0V(view, i);
            Drawable background = view.getBackground();
            Drawable drawable = null;
            if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
                drawable = layerDrawable.findDrawableByLayerId(R.id.background);
            }
            if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                gradientDrawable.setCornerRadius((float) (r3.A00 / 2));
            }
        }
    }

    public final void A01(int i) {
        FrameLayout.LayoutParams layoutParams;
        View view = this.A02;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                if (layoutParams != null) {
                    layoutParams.gravity = i;
                }
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public final void A02(int i) {
        FrameLayout.LayoutParams layoutParams;
        View view = this.A02;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                if ((layoutParams.gravity & 80) == 80 && layoutParams.bottomMargin != i) {
                    layoutParams.bottomMargin = i;
                } else if (layoutParams.topMargin != i) {
                    layoutParams.topMargin = i;
                } else {
                    return;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public final void A03(Drawable drawable) {
        this.A01 = drawable;
        ImageView imageView = this.A05;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(this.A01);
            return;
        }
        imageView.setVisibility(8);
    }

    public final void A04(Animation animation) {
        View view;
        View view2 = this.A02;
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = this.A02;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            if (animation != null && (view = this.A02) != null) {
                view.clearAnimation();
                view.startAnimation(animation);
            }
        }
    }

    public final void A05(Animation animation) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        2cs r4;
        double d;
        View view2 = this.A02;
        if (view2 != null && view2.getVisibility() == 8) {
            View view3 = this.A02;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            if (animation != null && (view = this.A02) != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = null;
                }
                if (!this.A09 || layoutParams == null || (r4 = this.A08) == null) {
                    view.clearAnimation();
                    view.startAnimation(animation);
                    return;
                }
                int i = layoutParams.gravity & 80;
                float translationY = view.getTranslationY();
                if (i == 80) {
                    view.setTranslationY(translationY);
                    d = (double) view.getTranslationY();
                } else {
                    view.setTranslationY(-translationY);
                    d = -((double) view.getTranslationY());
                }
                r4.A08(d, true);
                r4.A06(0.0d);
            }
        }
    }
}
