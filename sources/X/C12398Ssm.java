package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Ssm  reason: case insensitive filesystem */
public final class C12398Ssm implements C13889TjC {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12398Ssm) {
                C12398Ssm ssm = (C12398Ssm) obj;
                if (!0qQ.A0K(this.A01, ssm.A01) || !0qQ.A0K(this.A00, ssm.A00) || !0qQ.A0K(this.A02, ssm.A02) || !0qQ.A0K(this.A03, ssm.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private final Drawable A00(Context context) {
        Integer num;
        Drawable drawable;
        Integer num2 = this.A01;
        if (num2 == null || (num = this.A00) == null || this.A02 == null || this.A03 == null) {
            return null;
        }
        C10896Rzw A032 = C11426STk.A03();
        int intValue = num2.intValue();
        int intValue2 = num.intValue();
        if (intValue == 0) {
            drawable = context.getDrawable(R.drawable.instagram_circle_check_filled_16);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (intValue == 1) {
            drawable = context.getDrawable(R.drawable.instagram_error_pano_filled_24);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (intValue == 2) {
            drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_16);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (intValue == 4) {
            drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_16);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            throw DbW.A0a("Invalid icon type: ", intValue);
        }
        drawable.setTint(A032.A00(context, intValue2));
        return drawable;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C12398Ssm(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A03 = num4;
    }

    public final void CgH(ImageView imageView) {
        Drawable A002 = A00(AnonymousClass7TE.A0S(imageView));
        if (A002 != null) {
            imageView.setImageDrawable(A002);
        }
    }

    public final void EOw(View view) {
        Drawable A002 = A00(AnonymousClass7TE.A0S(view));
        if (A002 != null) {
            view.setBackground(A002);
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ThemedImageResource(iconName=");
        A1A.append(this.A01);
        A1A.append(", colorType=");
        A1A.append(this.A00);
        A1A.append(", iconSize=");
        A1A.append(this.A02);
        A1A.append(", iconVariant=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
