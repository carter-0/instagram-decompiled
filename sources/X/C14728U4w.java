package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: X.U4w  reason: case insensitive filesystem */
public class C14728U4w extends ImageButton {
    public boolean A00 = false;
    public final C242403Tx A01;
    public final C3021261r A02;

    public ColorStateList getSupportBackgroundTintList() {
        return C13991Tnr.A02(this.A01);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return C13991Tnr.A03(this.A01);
    }

    public ColorStateList getSupportImageTintList() {
        VXS vxs;
        C3021261r r0 = this.A02;
        if (r0 == null || (vxs = r0.A01) == null) {
            return null;
        }
        return vxs.A00;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        VXS vxs;
        C3021261r r0 = this.A02;
        if (r0 == null || (vxs = r0.A01) == null) {
            return null;
        }
        return vxs.A01;
    }

    public final boolean hasOverlappingRendering() {
        if ((this.A02.A02.getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setImageDrawable(Drawable drawable) {
        C3021261r r2 = this.A02;
        if (!(r2 == null || drawable == null || this.A00)) {
            r2.A00 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (r2 != null) {
            r2.A00();
            if (!this.A00) {
                ImageView imageView = r2.A02;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(r2.A00);
                }
            }
        }
    }

    public void setImageResource(int i) {
        this.A02.A01(i);
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

    /* JADX WARNING: type inference failed for: r1v2, types: [X.VXS, java.lang.Object] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C3021261r r2 = this.A02;
        if (r2 != null) {
            VXS vxs = r2.A01;
            VXS vxs2 = vxs;
            if (vxs == null) {
                ? obj = new Object();
                r2.A01 = obj;
                vxs2 = obj;
            }
            vxs2.A00 = colorStateList;
            vxs2.A02 = true;
            r2.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.VXS, java.lang.Object] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C3021261r r2 = this.A02;
        if (r2 != null) {
            VXS vxs = r2.A01;
            VXS vxs2 = vxs;
            if (vxs == null) {
                ? obj = new Object();
                r2.A01 = obj;
                vxs2 = obj;
            }
            vxs2.A01 = mode;
            vxs2.A03 = true;
            r2.A00();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14728U4w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C13988Tno.A0z(this);
        C242403Tx r0 = new C242403Tx(this);
        this.A01 = r0;
        r0.A07(attributeSet, i);
        C3021261r r02 = new C3021261r(this);
        this.A02 = r02;
        r02.A02(attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C242403Tx r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        C3021261r r02 = this.A02;
        if (r02 != null) {
            r02.A00();
        }
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

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C3021261r r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.A00 = true;
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C3021261r r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
    }
}
