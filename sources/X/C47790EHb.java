package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.EHb  reason: case insensitive filesystem */
public final class C47790EHb extends ColorFilterAlphaImageView implements AnonymousClass3Z5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47790EHb(Context context, View.OnClickListener onClickListener, Integer num, Integer num2, int i) {
        super(context);
        int i2;
        Bitmap A00;
        0qQ.A0B(context, 1);
        int intValue = num.intValue();
        int i3 = 0;
        if (intValue != 2) {
            Integer num3 = AnonymousClass05K.A00;
            if (intValue == 0) {
                i3 = R.drawable.instagram_x_pano_outline_24;
                if (num2 == num3) {
                    i3 = R.drawable.instagram_x_pano_outline_12;
                }
            } else if (num2 != num3) {
                i3 = R.drawable.instagram_more_horizontal_pano_outline_24;
            }
        } else if (num2 == AnonymousClass05K.A0C) {
            i3 = R.drawable.instagram_chevron_right_pano_outline_24;
        }
        Integer num4 = AnonymousClass05K.A01;
        2eS.A04(this, num4);
        Resources resources = context.getResources();
        switch (intValue) {
            case 0:
                i2 = 2131954722;
                break;
            case 1:
                i2 = 2131966173;
                break;
            default:
                i2 = 2131972993;
                break;
        }
        DbT.A1A(resources, this, i2);
        if (i3 != 0) {
            setImageResource(i3);
            int color = context.getColor(i);
            A04(color, color);
        } else if (intValue == 2 && num2 == num4) {
            Context A0S = AnonymousClass7TE.A0S(this);
            int A02 = DbS.A02(A0S, 16);
            Drawable A01 = AnonymousClass4Ed.A01(A0S, R.drawable.instagram_chevron_right_pano_outline_24, i);
            if (!(A01 == null || (A00 = C62953Kp5.A00(A01, A02, A02)) == null)) {
                setImageDrawable(new BitmapDrawable(AnonymousClass7TF.A0A(A0S), A00));
            }
        }
        int A022 = DbS.A02(context, 10);
        0nA.A0i(this, A022, A022);
        setOnClickListener(onClickListener);
    }
}
