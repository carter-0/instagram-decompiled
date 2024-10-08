package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Ssl  reason: case insensitive filesystem */
public final class C12397Ssl implements C13889TjC {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12397Ssl) {
                C12397Ssl ssl = (C12397Ssl) obj;
                if (this.A00 != ssl.A00 || !0qQ.A0K(this.A02, ssl.A02) || !0qQ.A0K(this.A03, ssl.A03) || this.A01 != ssl.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private final Drawable A00(Context context) {
        Integer num;
        Integer num2;
        Drawable drawable = context.getDrawable(this.A00);
        if (!(drawable == null || (num2 = this.A02) == null)) {
            drawable.setTint(C11426STk.A03().A00(context, num2.intValue()));
        }
        if ((drawable instanceof GradientDrawable) && (num = this.A03) != null) {
            ((GradientDrawable) drawable).setStroke((int) context.getResources().getDimension(this.A01), C11426STk.A03().A00(context, num.intValue()));
        }
        return drawable;
    }

    public final void CgH(ImageView imageView) {
        Drawable drawable;
        if (this.A00 != 0) {
            drawable = A00(AnonymousClass7TE.A0S(imageView));
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void EOw(View view) {
        Drawable drawable;
        if (this.A00 != 0) {
            drawable = A00(AnonymousClass7TE.A0S(view));
        } else {
            drawable = null;
        }
        view.setBackground(drawable);
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31) + this.A01;
    }

    public C12397Ssl(Integer num, Integer num2, int i, int i2) {
        this.A00 = i;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DrawableResImageResource(drawableRes=");
        A1A.append(this.A00);
        A1A.append(", colorType=");
        A1A.append(this.A02);
        A1A.append(", strokeColorType=");
        A1A.append(this.A03);
        A1A.append(", strokeWidthRes=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
