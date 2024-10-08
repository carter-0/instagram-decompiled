package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class U4J extends CheckBox {
    public AnonymousClass3Tm A00;
    public final C242403Tx A01;
    public final C18005Vjh A02;
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

    public ColorStateList getSupportButtonTintList() {
        C18005Vjh vjh = this.A02;
        if (vjh != null) {
            return vjh.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C18005Vjh vjh = this.A02;
        if (vjh != null) {
            return vjh.A01;
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C18005Vjh vjh = this.A02;
        if (vjh != null) {
            vjh.A00 = colorStateList;
            vjh.A02 = true;
            vjh.A00();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C18005Vjh vjh = this.A02;
        if (vjh != null) {
            vjh.A01 = mode;
            vjh.A03 = true;
            vjh.A00();
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U4J(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C13988Tno.A0z(this);
        C18005Vjh vjh = new C18005Vjh(this);
        this.A02 = vjh;
        vjh.A01(attributeSet, i);
        C242403Tx r0 = new C242403Tx(this);
        this.A01 = r0;
        r0.A07(attributeSet, i);
        C242413Ty r02 = new C242413Ty(this);
        this.A03 = r02;
        r02.A08(attributeSet, i);
        getEmojiTextViewHelper().A00(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        C242413Ty r02 = this.A03;
        if (r02 != null) {
            r02.A04();
        }
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

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C18005Vjh vjh = this.A02;
        if (vjh == null) {
            return;
        }
        if (vjh.A04) {
            vjh.A04 = false;
            return;
        }
        vjh.A04 = true;
        vjh.A00();
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

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A04(inputFilterArr));
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C13990Tnq.A0E(this, i));
    }
}
