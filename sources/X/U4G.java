package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class U4G extends Button {
    public AnonymousClass3Tm A00;
    public final C242403Tx A01;
    public final C242413Ty A02;

    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    private AnonymousClass3Tm getEmojiTextViewHelper() {
        AnonymousClass3Tm r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3Tm r02 = new AnonymousClass3Tm(this);
        this.A00 = r02;
        return r02;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return C13991Tnr.A02(this.A01);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return C13991Tnr.A03(this.A01);
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        VXS vxs = this.A02.A08;
        if (vxs != null) {
            return vxs.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        VXS vxs = this.A02.A08;
        if (vxs != null) {
            return vxs.A01;
        }
        return null;
    }

    public void setSupportAllCaps(boolean z) {
        C242413Ty r0 = this.A02;
        if (r0 != null) {
            r0.A0B.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C242413Ty r0 = this.A02;
        r0.A06(colorStateList);
        r0.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C242413Ty r0 = this.A02;
        r0.A07(mode);
        r0.A04();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U4G(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C13988Tno.A0z(this);
        C242403Tx r0 = new C242403Tx(this);
        this.A01 = r0;
        r0.A07(attributeSet, i);
        C242413Ty r02 = new C242413Ty(this);
        this.A02 = r02;
        r02.A08(attributeSet, i);
        r02.A04();
        getEmojiTextViewHelper().A00(attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        C242413Ty r02 = this.A02;
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A01(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A04(inputFilterArr));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C242413Ty r0 = this.A02;
        if (r0 != null) {
            r0.A05(context, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
