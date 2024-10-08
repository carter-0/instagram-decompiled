package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

public class U47 extends AutoCompleteTextView {
    public static final int[] A03 = {16843126};
    public final C242403Tx A00;
    public final C18060Vkj A01;
    public final C242413Ty A02;

    public ColorStateList getSupportBackgroundTintList() {
        return C13991Tnr.A02(this.A00);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return C13991Tnr.A03(this.A00);
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

    public void setEmojiCompatEnabled(boolean z) {
        this.A01.A03(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A01.A00(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C242403Tx r0 = this.A00;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C242403Tx r0 = this.A00;
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
    public U47(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        Context context2 = getContext();
        C242363Tt.A03(this, context2);
        2Yi A002 = 2Yi.A00(context2, attributeSet, A03, i, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(A002.A02(0));
        }
        typedArray.recycle();
        C242403Tx r0 = new C242403Tx(this);
        this.A00 = r0;
        r0.A07(attributeSet, i);
        C242413Ty r02 = new C242413Ty(this);
        this.A02 = r02;
        r02.A08(attributeSet, i);
        r02.A04();
        C18060Vkj vkj = new C18060Vkj(this);
        this.A01 = vkj;
        vkj.A02(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener A003 = vkj.A00(keyListener);
            if (A003 != keyListener) {
                super.setKeyListener(A003);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C242403Tx r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        C242413Ty r02 = this.A02;
        if (r02 != null) {
            r02.A04();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C16749V4i.A00(this, editorInfo, onCreateInputConnection);
        return this.A01.A01(editorInfo, onCreateInputConnection);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C242403Tx r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C242403Tx r0 = this.A00;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A02;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A02;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C13990Tnq.A0E(this, i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C242413Ty r0 = this.A02;
        if (r0 != null) {
            r0.A05(context, i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }
}
