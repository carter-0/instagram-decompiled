package com.instagram.igds.components.search;

import X.0nA;
import X.0qQ;
import X.0sP;
import X.2Yu;
import X.2eS;
import X.AnonymousClass3NG;
import X.C15842UjS;
import X.C50115FPf;
import X.C51208FqP;
import X.C61682KHp;
import X.C62320sa;
import X.C71382cm;
import X.C71478OlP;
import X.FKm;
import X.FPJ;
import X.G77;
import X.MMJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgdsInlineSearchBox extends LinearLayout {
    public View.OnFocusChangeListener A00;
    public ColorFilterAlphaImageView A01;
    public G77 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public View A07;
    public InputMethodManager A08;
    public ColorFilterAlphaImageView A09;
    public ColorFilterAlphaImageView A0A;
    public AnimatedHintsTextLayout A0B;
    public boolean A0C;
    public boolean A0D;
    public final BackInterceptEditText A0E;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsInlineSearchBox(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A06(View.OnClickListener onClickListener, int i, int i2) {
        this.A04 = true;
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A01;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.setImageResource(i);
            AnonymousClass3NG r1 = new AnonymousClass3NG(colorFilterAlphaImageView);
            r1.A06 = false;
            r1.A04 = new C61682KHp(onClickListener);
            r1.A00();
            colorFilterAlphaImageView.setContentDescription(getContext().getString(i2));
        }
        A00(this, A07());
    }

    public final void setEditTextOnBackListener(C62320sa r4) {
        0qQ.A0B(r4, 0);
        this.A0E.setOnBackCallback(new MMJ(r4, 20));
    }

    public final void setEditTextOnClickListener(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        this.A0E.setOnClickListener(onClickListener);
    }

    public final void setHint(String str) {
        0qQ.A0B(str, 0);
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A0B;
        if (animatedHintsTextLayout != null) {
            List singletonList = Collections.singletonList(str);
            0qQ.A07(singletonList);
            animatedHintsTextLayout.setHints(singletonList);
        }
        this.A0E.setContentDescription(str);
    }

    public final void setHints(List list) {
        0qQ.A0B(list, 0);
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A0B;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.setHints(list);
        }
    }

    public final void setOnEditTextListener(0sP r3) {
        0qQ.A0B(r3, 0);
        this.A0E.setOnEditorActionListener(new C71478OlP(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r4 == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.igds.components.search.IgdsInlineSearchBox r3, boolean r4) {
        /*
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r3.A0E
            boolean r2 = r0.isFocused()
            r0 = r4 ^ 1
            r3.setVisibilityOfClearButton(r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x001f
            r3.setVisibilityOfCustomActionButton(r4)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r3.A01
            if (r1 == 0) goto L_0x001f
            if (r2 == 0) goto L_0x001b
            r0 = 1
            if (r4 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r1.setSelected(r0)
        L_0x001f:
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r3.A0A
            if (r0 == 0) goto L_0x0026
            r0.setEnabled(r2)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.search.IgdsInlineSearchBox.A00(com.instagram.igds.components.search.IgdsInlineSearchBox, boolean):void");
    }

    public final void A01() {
        G77 g77 = this.A02;
        if (g77 != null) {
            g77.onSearchCleared(getSearchString());
        }
        BackInterceptEditText backInterceptEditText = this.A0E;
        backInterceptEditText.setText("");
        backInterceptEditText.requestFocus();
        A04();
    }

    public final void A02() {
        BackInterceptEditText backInterceptEditText = this.A0E;
        backInterceptEditText.setTextIsSelectable(false);
        backInterceptEditText.setFocusable(false);
        backInterceptEditText.setFocusableInTouchMode(false);
        backInterceptEditText.setEnabled(false);
        backInterceptEditText.setClickable(false);
        backInterceptEditText.setLongClickable(false);
        backInterceptEditText.clearFocus();
    }

    public final void A04() {
        if (!this.A0C) {
            this.A0D = true;
            getViewTreeObserver().addOnGlobalLayoutListener(new C50115FPf(this));
            return;
        }
        BackInterceptEditText backInterceptEditText = this.A0E;
        backInterceptEditText.requestFocus();
        InputMethodManager inputMethodManager = this.A08;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(backInterceptEditText, 0);
        }
    }

    public final void clearFocus() {
        if (!this.A05) {
            BackInterceptEditText backInterceptEditText = this.A0E;
            backInterceptEditText.setFocusableInTouchMode(false);
            super.clearFocus();
            backInterceptEditText.clearFocus();
            backInterceptEditText.setFocusableInTouchMode(true);
        }
    }

    public final boolean getDoNotClearFocusDuringAnimationTransition() {
        return this.A05;
    }

    public final String getSearchString() {
        String obj = this.A0E.getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = 0qQ.A00(obj.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        return obj.subSequence(i, length + 1).toString();
    }

    public final Integer getSelectionEnd() {
        return Integer.valueOf(this.A0E.getSelectionEnd());
    }

    public final Integer getSelectionStart() {
        return Integer.valueOf(this.A0E.getSelectionStart());
    }

    public final void setClearButtonColor(int i) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A09;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.setColorFilter(i);
        }
    }

    public final void setEditTextAndCustomActionEnabled(boolean z) {
        this.A0E.setEnabled(z);
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A01;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.setEnabled(z);
        }
    }

    public final void setEndMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.A07;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginEnd(i);
        }
    }

    public final void setHintColor(int i) {
        this.A0E.setHintTextColor(i);
    }

    public final void setImeOptions(int i) {
        this.A0E.setImeOptions(i | 33554432);
    }

    public final void setSearchGlyphColor(int i) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A0A;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.setColorFilter(i);
        }
    }

    public final void setSearchRowBackgroundColor(int i) {
        View view = this.A07;
        if (view != null) {
            view.setBackgroundResource(i);
        }
    }

    public final void setSearchRowColor(int i) {
        Drawable background;
        View view = this.A07;
        if (view != null && (background = view.getBackground()) != null) {
            background.setTint(i);
        }
    }

    public final void setSearchRowHeight(int i) {
        View view = this.A07;
        if (view != null) {
            0nA.A0V(view, i);
        }
    }

    public final void setSelection(int i) {
        this.A0E.setSelection(i);
    }

    public final void setTextColor(int i) {
        this.A0E.setTextColor(i);
    }

    public final void setTextsize(float f) {
        this.A0E.setTextSize(0, f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setVisibilityOfClearButton(boolean r3) {
        /*
            r2 = this;
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r2.A09
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.search.IgdsInlineSearchBox.setVisibilityOfClearButton(boolean):void");
    }

    public final void setVisibilityOfCustomActionButton(boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        if (this.A04 && (colorFilterAlphaImageView = this.A01) != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            colorFilterAlphaImageView.setVisibility(i);
        }
    }

    public final void A03() {
        clearFocus();
        InputMethodManager inputMethodManager = this.A08;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        this.A0D = false;
    }

    @Deprecated(message = "Use setTextColor, setSearchGlyphColor, setClearButtonColor instead of themes.")
    public final void A05(int i) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
        View view = this.A07;
        if (view != null) {
            view.setBackgroundResource(2Yu.A0H(contextThemeWrapper, R.attr.inlineSearchBarBackground));
        }
        int A0F = 2Yu.A0F(contextThemeWrapper, R.attr.textColorPrimary);
        int A0F2 = 2Yu.A0F(contextThemeWrapper, R.attr.textColorSecondary);
        this.A0E.setTextColor(A0F);
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A0A;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.A04(A0F2, A0F);
        }
        ColorFilterAlphaImageView colorFilterAlphaImageView2 = this.A09;
        if (colorFilterAlphaImageView2 != null) {
            colorFilterAlphaImageView2.A04(A0F2, A0F);
        }
    }

    public final boolean A07() {
        if (getSearchString().length() == 0) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0C = true;
        if (this.A0D) {
            post(new C51208FqP(this));
            this.A0D = false;
        }
    }

    public final void setCustomActionEnabled(boolean z) {
        this.A04 = z;
    }

    public final void setDoNotClearFocusDuringAnimationTransition(boolean z) {
        this.A05 = z;
    }

    public final void setEditTextOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00 = onFocusChangeListener;
    }

    public final void setListener(G77 g77) {
        this.A02 = g77;
    }

    public final void setPermanentlyHideClearButton(boolean z) {
        this.A03 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsInlineSearchBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InputMethodManager inputMethodManager;
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        View view;
        0qQ.A0B(context, 1);
        this.A06 = true;
        View inflate = LayoutInflater.from(context).inflate(R.layout.igds_search_row, this);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        this.A07 = inflate.requireViewById(R.id.search_row);
        this.A0B = (AnimatedHintsTextLayout) inflate.requireViewById(R.id.animated_hints_text_layout);
        this.A0A = (ColorFilterAlphaImageView) inflate.requireViewById(R.id.search_bar_glyph);
        BackInterceptEditText backInterceptEditText = (BackInterceptEditText) inflate.requireViewById(R.id.search_edit_text);
        this.A0E = backInterceptEditText;
        backInterceptEditText.addTextChangedListener(new FKm(this));
        backInterceptEditText.setOnFocusChangeListener(new FPJ(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1T);
            0qQ.A07(obtainStyledAttributes);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setHint(resourceId);
            }
            if (!obtainStyledAttributes.getBoolean(3, true)) {
                A02();
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (!(resourceId2 == 0 || (view = this.A07) == null)) {
                view.setBackgroundResource(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (!(resourceId3 == 0 || (colorFilterAlphaImageView = this.A0A) == null)) {
                colorFilterAlphaImageView.setImageResource(resourceId3);
            }
            obtainStyledAttributes.recycle();
        }
        backInterceptEditText.setContentDescription(context.getString(2131972797));
        2eS.A02(backInterceptEditText, context.getString(2131972803));
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A0B;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.getHintTextView().setImportantForAccessibility(4);
        }
        ColorFilterAlphaImageView colorFilterAlphaImageView2 = (ColorFilterAlphaImageView) inflate.requireViewById(R.id.action_button);
        0qQ.A0A(colorFilterAlphaImageView2);
        AnonymousClass3NG r1 = new AnonymousClass3NG(colorFilterAlphaImageView2);
        r1.A06 = false;
        r1.A04 = new C15842UjS(this);
        r1.A00();
        colorFilterAlphaImageView2.setContentDescription(colorFilterAlphaImageView2.getResources().getString(2131955139));
        this.A09 = colorFilterAlphaImageView2;
        this.A01 = (ColorFilterAlphaImageView) inflate.requireViewById(R.id.custom_action_button);
        A00(this, A07());
        Object systemService = context.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        this.A08 = inputMethodManager;
    }

    public final void setHint(int i) {
        String string = getContext().getString(i);
        0qQ.A07(string);
        setHint(string);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsInlineSearchBox(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsInlineSearchBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsInlineSearchBox(Context context, boolean z) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        this.A06 = z;
    }
}
