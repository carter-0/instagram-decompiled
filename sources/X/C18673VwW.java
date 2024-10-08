package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VwW  reason: case insensitive filesystem */
public abstract class C18673VwW {
    public static final ArrayList A01(Context context) {
        ArrayList arrayList = new ArrayList();
        C17476VXd A00 = A00(context, C16516UwL.A, R.drawable.powerup_confetti_1);
        if (A00 != null) {
            arrayList.add(A00);
        }
        C17476VXd A002 = A00(context, C16516UwL.B, R.drawable.powerup_confetti_2);
        if (A002 != null) {
            arrayList.add(A002);
        }
        C17476VXd A003 = A00(context, C16516UwL.C, R.drawable.powerup_confetti_3);
        if (A003 != null) {
            arrayList.add(A003);
        }
        C17476VXd A004 = A00(context, C16516UwL.D, R.drawable.powerup_confetti_4);
        if (A004 != null) {
            arrayList.add(A004);
        }
        C17476VXd A005 = A00(context, C16516UwL.E, R.drawable.powerup_confetti_5);
        if (A005 != null) {
            arrayList.add(A005);
        }
        return arrayList;
    }

    public static final List A02(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        List<ColorFilter> A1P = 0sr.A1P(new PorterDuffColorFilter[]{new PorterDuffColorFilter(Color.rgb(255, 215, 0), mode), new PorterDuffColorFilter(Color.rgb(255, 122, 0), mode), new PorterDuffColorFilter(Color.rgb(255, 0, 105), mode), new PorterDuffColorFilter(Color.rgb(211, 0, 197), mode), new PorterDuffColorFilter(Color.rgb(118, 56, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), mode)});
        ArrayList A0r = AnonymousClass7TG.A0r(A1P);
        for (ColorFilter colorFilter : A1P) {
            Paint paint = new Paint(6);
            paint.setColorFilter(colorFilter);
            paint.setAlpha(i);
            A0r.add(paint);
        }
        return A0r;
    }

    public static final C17476VXd A00(Context context, C16516UwL uwL, int i) {
        C17476VXd vXd;
        Resources resources = context.getResources();
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return null;
        }
        C16516UwL uwL2 = C16516UwL.A;
        0qQ.A0A(resources);
        VR2 vr2 = new VR2(C16808V6p.A00(resources, drawable, 1), new int[]{0});
        if (uwL == uwL2) {
            return vXd;
        }
        vXd = new C17476VXd(vr2, uwL);
        return vXd;
    }
}
