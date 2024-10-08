package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W1o  reason: case insensitive filesystem */
public final class C18786W1o {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Animator A04;
    public ColorStateList A05;
    public ColorStateList A06;
    public Typeface A07;
    public LinearLayout A08;
    public TextView A09;
    public TextView A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public FrameLayout A0H;
    public final float A0I;
    public final Context A0J;
    public final TextInputLayout A0K;

    public static void A01(C18786W1o w1o, int i, int i2, boolean z) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        int i3 = i;
        int i4 = i2;
        if (i != i2) {
            C18786W1o w1o2 = w1o;
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                w1o.A04 = animatorSet;
                ArrayList arrayList = new ArrayList();
                w1o2.A00(w1o.A0A, arrayList, 2, i3, i4, w1o.A0F);
                w1o2.A00(w1o.A09, arrayList, 1, i3, i4, w1o.A0E);
                C16813V6u.A00(animatorSet, arrayList);
                if (i == 1) {
                    textView3 = w1o.A09;
                } else if (i != 2) {
                    textView3 = null;
                } else {
                    textView3 = w1o.A0A;
                }
                if (i2 == 1) {
                    textView4 = w1o.A09;
                } else if (i2 != 2) {
                    textView4 = null;
                } else {
                    textView4 = w1o.A0A;
                }
                animatorSet.addListener(new U0K(textView3, textView4, w1o, i2, i3));
                animatorSet.start();
            } else {
                if (i2 != 0) {
                    if (i2 != 1) {
                        textView2 = w1o.A0A;
                    } else {
                        textView2 = w1o.A09;
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        textView2.setAlpha(1.0f);
                    }
                }
                if (i != 0) {
                    if (i != 1) {
                        textView = w1o.A0A;
                    } else {
                        textView = w1o.A09;
                    }
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i == 1) {
                            textView.setText((CharSequence) null);
                        }
                    }
                }
                w1o.A00 = i2;
            }
            TextInputLayout textInputLayout = w1o.A0K;
            textInputLayout.A0O();
            TextInputLayout.A0L(textInputLayout, z, false);
            textInputLayout.A0P();
        }
    }

    public final void A04() {
        this.A0B = null;
        Animator animator = this.A04;
        if (animator != null) {
            animator.cancel();
        }
        if (this.A00 == 1) {
            if (!this.A0F || TextUtils.isEmpty(this.A0D)) {
                this.A01 = 0;
            } else {
                this.A01 = 2;
            }
        }
        A01(this, this.A00, this.A01, A02(this.A09, this, (CharSequence) null));
    }

    private void A00(TextView textView, List list, int i, int i2, int i3, boolean z) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                float f = 0.0f;
                if (i3 == i) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(AnonymousClass6Y2.A03);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.A0I, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(AnonymousClass6Y2.A04);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public static boolean A02(TextView textView, C18786W1o w1o, CharSequence charSequence) {
        TextInputLayout textInputLayout = w1o.A0K;
        if (!textInputLayout.isLaidOut() || !textInputLayout.isEnabled()) {
            return false;
        }
        if (w1o.A01 != w1o.A00 || textView == null || !TextUtils.equals(textView.getText(), charSequence)) {
            return true;
        }
        return false;
    }

    public final void A03() {
        EditText editText;
        if (this.A08 != null && (editText = this.A0K.A0F) != null) {
            Context context = this.A0J;
            boolean A042 = C309286Xr.A04(context);
            LinearLayout linearLayout = this.A08;
            int paddingStart = editText.getPaddingStart();
            if (A042) {
                paddingStart = AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap);
            }
            int A032 = AnonymousClass7TG.A03(context);
            if (A042) {
                A032 = AnonymousClass7TF.A02(context, R.dimen.abc_button_padding_horizontal_material);
            }
            int paddingEnd = editText.getPaddingEnd();
            if (A042) {
                paddingEnd = AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap);
            }
            linearLayout.setPaddingRelative(paddingStart, A032, paddingEnd, 0);
        }
    }

    public final void A05(TextView textView, int i) {
        if (this.A08 == null && this.A0H == null) {
            Context context = this.A0J;
            LinearLayout linearLayout = new LinearLayout(context);
            this.A08 = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.A0K;
            textInputLayout.addView(this.A08, -1, -2);
            this.A0H = new FrameLayout(context);
            this.A08.addView(this.A0H, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.A0F != null) {
                A03();
            }
        }
        if (i == 0 || i == 1) {
            this.A0H.setVisibility(0);
            this.A0H.addView(textView);
        } else {
            this.A08.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.A08.setVisibility(0);
        this.A0G++;
    }

    public final void A06(TextView textView, int i) {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.A08;
        if (linearLayout != null) {
            if (!(i == 0 || i == 1) || (viewGroup = this.A0H) == null) {
                viewGroup = linearLayout;
            }
            viewGroup.removeView(textView);
            int i2 = this.A0G - 1;
            this.A0G = i2;
            LinearLayout linearLayout2 = this.A08;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean A07() {
        if (this.A01 != 1 || this.A09 == null || TextUtils.isEmpty(this.A0B)) {
            return false;
        }
        return true;
    }

    public C18786W1o(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.A0J = context;
        this.A0K = textInputLayout;
        this.A0I = (float) AnonymousClass7TG.A07(context);
    }
}
