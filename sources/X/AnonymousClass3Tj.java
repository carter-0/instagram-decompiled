package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.3Tj  reason: invalid class name */
public class AnonymousClass3Tj extends TextView {
    public Future A00;
    public AnonymousClass3Tm A01;
    public AnonymousClass5B5 A02;
    public boolean A03;
    public final C242403Tx A04;
    public final AnonymousClass3U7 A05;
    public final C242413Ty A06;

    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    private AnonymousClass3Tm getEmojiTextViewHelper() {
        AnonymousClass3Tm r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3Tm r02 = new AnonymousClass3Tm(this);
        this.A01 = r02;
        return r02;
    }

    public AnonymousClass5B5 getSuperCaller() {
        AnonymousClass5B5 r0 = this.A02;
        if (r0 == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                r0 = new U6F(this);
            } else {
                r0 = new U6G(this);
            }
            this.A02 = r0;
        }
        return r0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C242403Tx r0 = this.A04;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C242403Tx r0 = this.A04;
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        VXS vxs = this.A06.A08;
        if (vxs != null) {
            return vxs.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        VXS vxs = this.A06.A08;
        if (vxs != null) {
            return vxs.A01;
        }
        return null;
    }

    public CharSequence getText() {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                W0V.A00(this);
                throw AnonymousClass00P.createAndThrow();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C242403Tx r0 = this.A04;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C242403Tx r0 = this.A04;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C242413Ty r0 = this.A06;
        r0.A06(colorStateList);
        r0.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C242413Ty r0 = this.A06;
        r0.A07(mode);
        r0.A04();
    }

    public void setTextFuture(Future future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C18045VkT vkT) {
        TextDirectionHeuristic textDirectionHeuristic = vkT.A03;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            }
        }
        setTextDirection(i);
        getPaint().set(vkT.A04);
        setBreakStrategy(vkT.A00);
        setHyphenationFrequency(vkT.A01);
    }

    public final void setTypeface(Typeface typeface, int i) {
        if (!this.A03) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                01e r0 = 270.A00;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException(AnonymousClass000.A00(2181));
                }
            }
            this.A03 = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.A03 = false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.3U7, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Tj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        this.A03 = false;
        this.A02 = null;
        C242363Tt.A03(this, getContext());
        C242403Tx r0 = new C242403Tx(this);
        this.A04 = r0;
        r0.A07(attributeSet, i);
        C242413Ty r02 = new C242413Ty(this);
        this.A06 = r02;
        r02.A08(attributeSet, i);
        r02.A04();
        ? obj = new Object();
        obj.A00 = this;
        this.A05 = obj;
        getEmojiTextViewHelper().A00(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C242403Tx r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
        C242413Ty r02 = this.A06;
        if (r02 != null) {
            r02.A04();
        }
    }

    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public C18045VkT getTextMetricsParamsCompat() {
        return new C18045VkT(getTextMetricsParams());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C242413Ty.A03(editorInfo, onCreateInputConnection, this);
        C16749V4i.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(2110330815);
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
        AnonymousClass0fD.A0D(1160798384, A062);
    }

    public void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0fD.A06(-499772914);
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                W0V.A00(this);
                throw AnonymousClass00P.createAndThrow();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
        AnonymousClass0fD.A0D(1993939460, A062);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A01(z);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C242403Tx r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C242403Tx r0 = this.A04;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A06;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A06;
        if (r0 != null) {
            r0.A04();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C323656xt.A00(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C323656xt.A00(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C323656xt.A00(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C323656xt.A00(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A06;
        if (r0 != null) {
            r0.A04();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C323656xt.A00(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C323656xt.A00(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C323656xt.A00(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C323656xt.A00(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A06;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A04(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    public void setPrecomputedText(W7d w7d) {
        W0V.A00(this);
        throw AnonymousClass00P.createAndThrow();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C242413Ty r0 = this.A06;
        if (r0 != null) {
            r0.A05(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setLineHeight(int i) {
        W0V.A03(this, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public AnonymousClass3Tj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A06;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A06;
        if (r0 != null) {
            r0.A04();
        }
    }

    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().Ec7(i, f);
        } else {
            W0V.A01(this, f, i);
        }
    }
}
