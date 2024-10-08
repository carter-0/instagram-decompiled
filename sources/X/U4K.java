package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class U4K extends CheckedTextView {
    public AnonymousClass3Tm A00;
    public final C242403Tx A01;
    public final C17891Vhi A02;
    public final C242413Ty A03;

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

    public ColorStateList getSupportCheckMarkTintList() {
        C17891Vhi vhi = this.A02;
        if (vhi != null) {
            return vhi.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C17891Vhi vhi = this.A02;
        if (vhi != null) {
            return vhi.A01;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        VXS vxs = this.A03.A08;
        if (vxs != null) {
            return vxs.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        VXS vxs = this.A03.A08;
        if (vxs != null) {
            return vxs.A01;
        }
        return null;
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C17891Vhi vhi = this.A02;
        if (vhi != null) {
            vhi.A00 = colorStateList;
            vhi.A02 = true;
            vhi.A00();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C17891Vhi vhi = this.A02;
        if (vhi != null) {
            vhi.A01 = mode;
            vhi.A03 = true;
            vhi.A00();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C242413Ty r0 = this.A03;
        r0.A06(colorStateList);
        r0.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C242413Ty r0 = this.A03;
        r0.A07(mode);
        r0.A04();
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|8|9|(1:13)|14|(1:16)|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U4K(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            r8 = 2130969022(0x7f0401be, float:1.7546714E38)
            r11.getResources()
            r11.getResources()
            r5 = r12
            r10.<init>(r11, r12, r8)
            X.C13988Tno.A0z(r10)
            X.3Ty r0 = new X.3Ty
            r0.<init>(r10)
            r10.A03 = r0
            r0.A08(r12, r8)
            r0.A04()
            X.3Tx r0 = new X.3Tx
            r0.<init>(r10)
            r10.A01 = r0
            r0.A07(r12, r8)
            X.Vhi r0 = new X.Vhi
            r0.<init>(r10)
            r10.A02 = r0
            android.widget.CheckedTextView r6 = r0.A05
            android.content.Context r3 = r6.getContext()
            int[] r7 = X.AnonymousClass2Z3.A0B
            r9 = 0
            X.2Yi r2 = X.2Yi.A00(r3, r12, r7, r8, r9)
            android.content.res.TypedArray r4 = r2.A02
            X.03v.A06(r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0055
            int r0 = r4.getResourceId(r1, r9)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0055
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r3, r0)     // Catch:{ NotFoundException -> 0x0055 }
            r6.setCheckMarkDrawable(r0)     // Catch:{ NotFoundException -> 0x0055 }
            goto L_0x0068
        L_0x0055:
            boolean r0 = r4.hasValue(r9)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0068
            int r0 = r4.getResourceId(r9, r9)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0068
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r3, r0)     // Catch:{ all -> 0x0095 }
            r6.setCheckMarkDrawable(r0)     // Catch:{ all -> 0x0095 }
        L_0x0068:
            r1 = 2
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0076
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch:{ all -> 0x0095 }
            r6.setCheckMarkTintList(r0)     // Catch:{ all -> 0x0095 }
        L_0x0076:
            r1 = 3
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x008a
            r0 = -1
            int r1 = r4.getInt(r1, r0)     // Catch:{ all -> 0x0095 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass3NX.A00(r0, r1)     // Catch:{ all -> 0x0095 }
            r6.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x0095 }
        L_0x008a:
            r4.recycle()
            X.3Tm r0 = r10.getEmojiTextViewHelper()
            r0.A00(r12, r8)
            return
        L_0x0095:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U4K.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C242413Ty r0 = this.A03;
        if (r0 != null) {
            r0.A04();
        }
        C242403Tx r02 = this.A01;
        if (r02 != null) {
            r02.A02();
        }
        C17891Vhi vhi = this.A02;
        if (vhi != null) {
            vhi.A00();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C16749V4i.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
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

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C17891Vhi vhi = this.A02;
        if (vhi == null) {
            return;
        }
        if (vhi.A04) {
            vhi.A04 = false;
            return;
        }
        vhi.A04 = true;
        vhi.A00();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A03;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C242413Ty r0 = this.A03;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C242413Ty r0 = this.A03;
        if (r0 != null) {
            r0.A05(context, i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C13990Tnq.A0E(this, i));
    }
}
