package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.Deprecated;

@Deprecated(message = "You should NOT use this directly and should only use [IgdsBottomButtonLayout] instead.")
/* renamed from: X.61v  reason: invalid class name and case insensitive filesystem */
public final class C3021561v extends C3021461u {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public SpinnerImageView A07;

    public static final void A01(Context context, TypedArray typedArray, View view, TextView textView, C3021561v r7, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            textView.setText(context.getText(resourceId));
            view.setContentDescription(context.getText(resourceId));
            view.setVisibility(0);
            textView.setVisibility(0);
        } else {
            A02(view, textView, r7, typedArray.getText(i));
        }
        r7.A00();
    }

    public static final void A02(View view, TextView textView, C3021561v r4, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            view.setVisibility(8);
        } else {
            textView.setText(charSequence);
            view.setVisibility(0);
            view.setContentDescription(charSequence);
        }
        r4.A00();
    }

    public void setButtonType(C3021661w r3) {
        boolean z = false;
        0qQ.A0B(r3, 0);
        if (this.A06 == null) {
            z = true;
        }
        A03(r3, this, z);
    }

    private final void A00() {
        TextView textView;
        TextView textView2;
        CharSequence text;
        CharSequence text2;
        TextView textView3 = this.A05;
        if (textView3 == null) {
            0qQ.A0F("primaryAction");
            throw AnonymousClass00P.createAndThrow();
        }
        CharSequence text3 = textView3.getText();
        int i = 0;
        if ((text3 == null || text3.length() == 0) && (((textView = this.A06) == null || (text2 = textView.getText()) == null || text2.length() == 0) && ((textView2 = this.A03) == null || (text = textView2.getText()) == null || text.length() == 0))) {
            i = 8;
        }
        setVisibility(i);
    }

    public static final void A03(C3021661w r4, C3021561v r5, boolean z) {
        if (r4 == C3021661w.ON_MEDIA) {
            String str = "primaryAction";
            TextView textView = r5.A05;
            if (z) {
                if (textView != null) {
                    textView.setTextAppearance(2132017818);
                    TextView textView2 = r5.A05;
                    if (textView2 != null) {
                        textView2.setBackground(r5.getContext().getDrawable(R.drawable.primary_media_bottom_button_full_width_selector));
                        return;
                    }
                }
            } else if (textView != null) {
                textView.setTextAppearance(2132017791);
                Context context = r5.getContext();
                Drawable drawable = context.getDrawable(R.drawable.primary_media_bottom_button_selector);
                View view = r5.A02;
                if (view == null) {
                    str = "primaryActionContainer";
                } else {
                    view.setBackground(drawable);
                    TextView textView3 = r5.A06;
                    if (textView3 != null) {
                        textView3.setTextAppearance(2132017790);
                    }
                    int dimensionPixelSize = r5.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                    TextView textView4 = r5.A03;
                    if (textView4 != null) {
                        textView4.setShadowLayer((float) dimensionPixelSize, 0.0f, 0.0f, context.getColor(2Yu.A0H(context, R.attr.igds_color_shadow_on_media)));
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.getVisibility() != 8) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.A06
            r3 = 1
            r2 = 8
            if (r0 == 0) goto L_0x000e
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == r2) goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            android.widget.TextView r0 = r4.A03
            if (r0 == 0) goto L_0x0026
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L_0x0026
        L_0x0019:
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0022
            if (r3 == 0) goto L_0x0022
            r2 = 0
        L_0x0022:
            r0.setVisibility(r2)
        L_0x0025:
            return
        L_0x0026:
            r3 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3021561v.A07():void");
    }

    public final View getExtraBottomPadding() {
        return this.A01;
    }

    public void setDividerVisible(boolean z) {
        View view = this.A00;
        if (view != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public void setPrimaryActionIsLoading(boolean z) {
        SpinnerImageView spinnerImageView = this.A07;
        if (spinnerImageView != null) {
            int i = 0;
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            spinnerImageView.setVisibility(i2);
            TextView textView = this.A05;
            if (textView == null) {
                0qQ.A0F("primaryAction");
                throw AnonymousClass00P.createAndThrow();
            }
            if (z) {
                i = 8;
            }
            textView.setVisibility(i);
            setPrimaryButtonEnabled(!z);
        }
    }

    public void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        View view = this.A02;
        if (view == null) {
            0qQ.A0F("primaryActionContainer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setPrimaryActionText(CharSequence charSequence) {
        String str;
        TextView textView = this.A05;
        if (textView == null) {
            str = "primaryAction";
        } else {
            View view = this.A02;
            if (view == null) {
                str = "primaryActionContainer";
            } else {
                A02(view, textView, this, charSequence);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void setPrimaryButtonEnabled(boolean z) {
        View view = this.A02;
        if (view != null) {
            view.setEnabled(z);
            View view2 = this.A02;
            if (view2 != null) {
                Drawable background = view2.getBackground();
                if (background != null) {
                    int i = 77;
                    if (z) {
                        i = 255;
                    }
                    background.setAlpha(i);
                    return;
                }
                return;
            }
        }
        0qQ.A0F("primaryActionContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setSecondaryActionText(CharSequence charSequence) {
        TextView textView = this.A06;
        if (textView != null) {
            A02(textView, textView, this, charSequence);
            A07();
        }
    }

    public void setSecondaryButtonEnabled(boolean z) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setEnabled(z);
        }
        TextView textView2 = this.A06;
        if (textView2 != null) {
            float f = 0.25f;
            if (z) {
                f = 1.0f;
            }
            textView2.setAlpha(f);
        }
    }

    public final void setExtraBottomPadding(View view) {
        this.A01 = view;
    }
}
