package com.instagram.ui.widget.edittext;

import X.0oh;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.C20857X1j;
import X.C3020161e;
import X.C3020261f;
import X.C3020361g;
import X.C3020461h;
import X.C3020561i;
import X.C3020661j;
import X.C3020861m;
import X.C3020961n;
import X.X5C;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AnimatedHintsTextLayout extends FrameLayout {
    public static int A0H;
    public float A00;
    public float A01;
    public int A02;
    public long A03 = 3000;
    public ValueAnimator A04;
    public ValueAnimator A05;
    public ValueAnimator A06;
    public EditText A07;
    public TextView A08;
    public TextView A09;
    public X5C A0A;
    public C20857X1j A0B;
    public boolean A0C = true;
    public TextView A0D;
    public final AnimatorListenerAdapter A0E = new C3020261f(this);
    public final Handler A0F = new Handler(Looper.getMainLooper(), new C3020161e(this));
    public final List A0G = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        String str;
        0qQ.A0B(view, 0);
        0qQ.A0B(layoutParams, 2);
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            if (this.A07 == null) {
                setEditText(editText);
                editText.addTextChangedListener(new C3020861m(this));
                editText.addOnLayoutChangeListener(new C3020961n(this));
                if (this.A0G.isEmpty()) {
                    CharSequence hint = editText.getHint();
                    if (hint != null) {
                        List singletonList = Collections.singletonList(hint);
                        0qQ.A07(singletonList);
                        setHints(singletonList);
                    }
                    editText.setHint((CharSequence) null);
                }
                super.addView(view, 0, layoutParams);
                TextView textView = this.A08;
                if (textView == null) {
                    str = "currentHintTextView";
                } else {
                    super.addView(textView, -1, layoutParams);
                    TextView textView2 = this.A09;
                    if (textView2 == null) {
                        str = "nextHintTextView";
                    } else {
                        super.addView(textView2, -1, layoutParams);
                        TextView textView3 = this.A0D;
                        if (textView3 == null) {
                            str = "emojiHintTextView";
                        } else {
                            super.addView(textView3, -1, new FrameLayout.LayoutParams(-2, -2, 8388629));
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        throw new IllegalArgumentException("Only accepting EditTexts");
    }

    public final void setEditText(EditText editText) {
        0qQ.A0B(editText, 0);
        this.A07 = editText;
    }

    public final void setHints(List list) {
        0qQ.A0B(list, 0);
        List list2 = this.A0G;
        list2.clear();
        list2.addAll(list);
        A03();
    }

    private final void A00(Context context) {
        String str;
        this.A08 = new TextView(context);
        this.A09 = new TextView(context);
        TextView textView = this.A08;
        if (textView == null) {
            str = "currentHintTextView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A09;
            if (textView2 == null) {
                str = "nextHintTextView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = new TextView(context);
                this.A0D = textView3;
                textView3.setVisibility(8);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new C3020361g(this));
                ofFloat.addListener(this.A0E);
                ofFloat.setDuration(300);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                this.A06 = ofFloat;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat2.addUpdateListener(new C3020461h(this));
                ofFloat2.setDuration(300);
                ofFloat2.setInterpolator(new C3020561i());
                this.A04 = ofFloat2;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat3.addUpdateListener(new C3020661j(this));
                ofFloat3.setDuration(300);
                ofFloat3.setInterpolator(new AccelerateInterpolator());
                this.A05 = ofFloat3;
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03() {
        this.A02 = A0H;
        Handler handler = this.A0F;
        handler.sendEmptyMessage(1);
        handler.sendEmptyMessage(0);
    }

    public final void A04() {
        this.A0F.removeMessages(2);
        ValueAnimator valueAnimator = this.A06;
        String str = "translationAnimator";
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.A06;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
            }
            ValueAnimator valueAnimator3 = this.A04;
            str = "fadeInAnimator";
            if (valueAnimator3 != null) {
                if (valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = this.A04;
                    if (valueAnimator4 != null) {
                        valueAnimator4.end();
                    }
                }
                ValueAnimator valueAnimator5 = this.A05;
                str = "fadeOutAnimator";
                if (valueAnimator5 != null) {
                    if (valueAnimator5.isRunning()) {
                        ValueAnimator valueAnimator6 = this.A05;
                        if (valueAnimator6 != null) {
                            valueAnimator6.end();
                        }
                    }
                    A0H = this.A02;
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final long getAnimationDelayMillis() {
        return this.A03;
    }

    public final EditText getEditText() {
        EditText editText = this.A07;
        if (editText != null) {
            return editText;
        }
        0qQ.A0F("editText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView getEmojiTextView() {
        TextView textView = this.A0D;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("emojiHintTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView getHintTextView() {
        TextView textView = this.A08;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("currentHintTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final X5C getListener() {
        return this.A0A;
    }

    public final C20857X1j getRotationHintIndexListener() {
        return this.A0B;
    }

    public static final void A01(TextView textView, AnimatedHintsTextLayout animatedHintsTextLayout) {
        textView.setBackgroundResource(R.color.fds_transparent);
        0oh.A07(textView.getContext(), (Typeface) null, textView, AnonymousClass05K.A00);
        textView.setHintTextColor(animatedHintsTextLayout.getEditText().getHintTextColors());
        textView.setTextSize(0, animatedHintsTextLayout.getEditText().getTextSize());
        textView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setPaddingRelative(animatedHintsTextLayout.getEditText().getCompoundPaddingLeft(), animatedHintsTextLayout.getEditText().getCompoundPaddingTop(), animatedHintsTextLayout.getEditText().getCompoundPaddingRight(), animatedHintsTextLayout.getEditText().getCompoundPaddingBottom());
        textView.setCompoundDrawablePadding(animatedHintsTextLayout.getEditText().getCompoundDrawablePadding());
        textView.setSingleLine();
        textView.setGravity(animatedHintsTextLayout.getEditText().getGravity());
        textView.setLineSpacing(animatedHintsTextLayout.getEditText().getLineSpacingExtra(), animatedHintsTextLayout.getEditText().getLineSpacingMultiplier());
        textView.setGravity(animatedHintsTextLayout.getEditText().getGravity());
        textView.setIncludeFontPadding(animatedHintsTextLayout.getEditText().getIncludeFontPadding());
    }

    public static final void A02(AnimatedHintsTextLayout animatedHintsTextLayout) {
        String str;
        int height = animatedHintsTextLayout.getEditText().getHeight() / 2;
        TextView textView = animatedHintsTextLayout.A08;
        if (textView == null) {
            str = "currentHintTextView";
        } else {
            float f = (float) height;
            textView.setTranslationY(animatedHintsTextLayout.A00 * f);
            TextView textView2 = animatedHintsTextLayout.A09;
            if (textView2 == null) {
                str = "nextHintTextView";
            } else {
                textView2.setTranslationY(animatedHintsTextLayout.A01 * f);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1598630265);
        super.onDetachedFromWindow();
        A04();
        this.A0F.removeCallbacksAndMessages((Object) null);
        AnonymousClass0fD.A0D(1627322045, A062);
    }

    public final void setAnimationDelayMillis(long j) {
        this.A03 = j;
    }

    public final void setHintIndex(int i) {
        this.A02 = i;
    }

    public final void setListener(X5C x5c) {
        this.A0A = x5c;
    }

    public final void setRotationHintIndexListener(C20857X1j x1j) {
        this.A0B = x1j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context);
    }
}
