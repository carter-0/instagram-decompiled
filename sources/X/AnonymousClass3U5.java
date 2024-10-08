package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* renamed from: X.3U5  reason: invalid class name */
public class AnonymousClass3U5 extends EditText implements AnonymousClass03S {
    public C17170VKz A00;
    public final C242403Tx A01;
    public final C18060Vkj A02;
    public final AnonymousClass3U7 A03;
    public final C242413Ty A04;
    public final C11612SdF A05 = new Object();

    private C17170VKz getSuperCaller() {
        C17170VKz vKz = this.A00;
        if (vKz != null) {
            return vKz;
        }
        C17170VKz vKz2 = new C17170VKz(this);
        this.A00 = vKz2;
        return vKz2;
    }

    public final AnonymousClass02h Dbe(AnonymousClass02h r2) {
        return this.A05.Dbd(this, r2);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        VXS vxs = this.A04.A08;
        if (vxs != null) {
            return vxs.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        VXS vxs = this.A04.A08;
        if (vxs != null) {
            return vxs.A01;
        }
        return null;
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.A02.A03(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A02.A00(keyListener));
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
        C242413Ty r0 = this.A04;
        r0.A06(colorStateList);
        r0.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C242413Ty r0 = this.A04;
        r0.A07(mode);
        r0.A04();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.3U7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.SdF, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3U5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C242363Tt.A03(this, getContext());
        C242403Tx r0 = new C242403Tx(this);
        this.A01 = r0;
        r0.A07(attributeSet, i);
        C242413Ty r02 = new C242413Ty(this);
        this.A04 = r02;
        r02.A08(attributeSet, i);
        r02.A04();
        ? obj = new Object();
        obj.A00 = this;
        this.A03 = obj;
        C18060Vkj vkj = new C18060Vkj(this);
        this.A02 = vkj;
        vkj.A02(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener A002 = vkj.A00(keyListener);
            if (A002 != keyListener) {
                super.setKeyListener(A002);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        C242413Ty r02 = this.A04;
        if (r02 != null) {
            r02.A04();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] A0M;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C242413Ty.A03(editorInfo, onCreateInputConnection, this);
        C16749V4i.A00(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (A0M = 03v.A0M(this)) == null)) {
            editorInfo.contentMimeTypes = A0M;
            onCreateInputConnection = new 05Q(onCreateInputConnection, new AnonymousClass0u3(this));
        }
        return this.A02.A01(editorInfo, onCreateInputConnection);
    }

    public void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(338090376);
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
        AnonymousClass0fD.A0D(-684443196, A06);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        if (C11045S7o.A00(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C11045S7o.A01(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C242413Ty r0 = this.A04;
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

    public Editable getText() {
        return super.getText();
    }
}
