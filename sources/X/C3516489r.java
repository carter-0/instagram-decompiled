package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.89r  reason: invalid class name and case insensitive filesystem */
public abstract class C3516489r {
    public static AnonymousClass89v A00;

    public static final ObjectAnimator A01(View view) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "rotation", new float[]{-0.5f, 0.5f}).setDuration(180);
        0qQ.A07(duration);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(2);
        duration.addListener(new AJE(view));
        return duration;
    }

    public static final AnonymousClass89v A02(Context context) {
        AnonymousClass89v r5 = A00;
        if (r5 != null) {
            return r5;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
        int ceil = (int) Math.ceil(((double) (i - dimensionPixelSize)) / ((double) dimensionPixelSize));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
        C377049Ki r7 = new C377049Ki(ceil, 1);
        C377039Kh r10 = new C377039Kh(ceil, 1);
        C3517089z r8 = C3517089z.A00;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        int i2 = dimensionPixelSize * dimensionPixelSize2;
        0qQ.A0B(config, 0);
        int i3 = C3516689t.A00[config.ordinal()];
        int i4 = 4;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 2;
            } else if (i3 == 3) {
                i4 = 1;
            }
        }
        AnonymousClass89v r52 = new AnonymousClass89v(config, r7, r8, new C3516789u(dimensionPixelSize, dimensionPixelSize2), r10, dimensionPixelSize, dimensionPixelSize2, i2 * i4);
        A00 = r52;
        return r52;
    }

    public static final AnonymousClass89v A03(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        C377049Ki r5 = new C377049Ki(i, 0);
        C377039Kh r8 = new C377039Kh(i, 0);
        C3516589s r6 = C3516589s.A00;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        int i2 = dimensionPixelSize * dimensionPixelSize2;
        0qQ.A0B(config, 0);
        int i3 = C3516689t.A00[config.ordinal()];
        int i4 = 4;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 2;
            } else if (i3 == 3) {
                i4 = 1;
            }
        }
        return new AnonymousClass89v(config, r5, r6, new C3516789u(dimensionPixelSize, dimensionPixelSize2), r8, dimensionPixelSize, dimensionPixelSize2, i2 * i4);
    }

    public static final int A00(Context context, int i) {
        return (((context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDisplayMetrics().widthPixels - i)) / 2) - context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) - context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }
}
