package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class JWN {
    public static final View A01(View.OnClickListener onClickListener, View view, Integer num, boolean z) {
        0qQ.A0B(num, 3);
        Integer num2 = AnonymousClass05K.A00;
        int i = R.id.next_button_imageview;
        if (num != num2) {
            i = R.id.next_button_textview;
        }
        View requireViewById = view.requireViewById(i);
        0qQ.A0A(requireViewById);
        if (num != num2) {
            A03(onClickListener, (TextView) requireViewById, num, z);
            return requireViewById;
        }
        ImageView imageView = (ImageView) requireViewById;
        Resources resources = imageView.getResources();
        int i2 = 2131968361;
        if (z) {
            i2 = 2131960992;
        }
        String A0d = AnonymousClass7TF.A0d(resources, i2);
        int i3 = R.drawable.instagram_arrow_right_pano_outline_24;
        if (z) {
            i3 = R.drawable.instagram_check_pano_filled_24;
        }
        imageView.setImageResource(i3);
        imageView.setContentDescription(A0d);
        AnonymousClass0fU.A00(onClickListener, imageView);
        imageView.setVisibility(0);
        imageView.setEnabled(true);
        return requireViewById;
    }

    public static View A00(Activity activity, View.OnClickListener onClickListener, Integer num, boolean z) {
        View requireViewById = activity.requireViewById(R.id.next_button_textview);
        0qQ.A0A(requireViewById);
        A03(onClickListener, (TextView) requireViewById, num, z);
        return requireViewById;
    }

    public static final Integer A02(Context context) {
        Resources A0Q = JTR.A0Q(context);
        int A00 = AnonymousClass3D4.A00(context);
        int A01 = AnonymousClass0nB.A01(context);
        int A002 = AnonymousClass0nB.A00(context);
        int dimensionPixelSize = A0Q.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        int dimensionPixelSize2 = A0Q.getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        DisplayMetrics displayMetrics = A0Q.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        int applyDimension = (int) TypedValue.applyDimension(1, 124.0f, displayMetrics);
        int i = A00 + A01;
        boolean z = false;
        if (dimensionPixelSize + i + ((int) TypedValue.applyDimension(1, 112.0f, A0Q.getDisplayMetrics())) <= A002) {
            z = true;
        }
        int max = A002 / Math.max(A01, 1);
        if (z) {
            if (i + dimensionPixelSize2 + applyDimension <= A002) {
                return AnonymousClass05K.A00;
            }
            return AnonymousClass05K.A01;
        } else if (((float) max) < 1.4f) {
            return AnonymousClass05K.A0N;
        } else {
            return AnonymousClass05K.A0C;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r6 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.view.View.OnClickListener r3, android.widget.TextView r4, java.lang.Integer r5, boolean r6) {
        /*
            int r2 = r5.intValue()
            r0 = 2
            if (r2 == r0) goto L_0x0048
            r0 = 3
            if (r2 == r0) goto L_0x0040
            r0 = 4
            if (r2 == r0) goto L_0x0038
            r0 = 5
            android.content.res.Resources r1 = r4.getResources()
            if (r2 == r0) goto L_0x0019
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            if (r6 == 0) goto L_0x001c
        L_0x0019:
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
        L_0x001c:
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A0A(r1)
            r4.setText(r1)
            X.1QE.A0I(r4)
            r0 = 0
            r4.setContentDescription(r1)
            X.AnonymousClass0fU.A00(r3, r4)
            r4.setVisibility(r0)
            r0 = 1
            r4.setEnabled(r0)
            return
        L_0x0038:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            goto L_0x001c
        L_0x0040:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131961425(0x7f132651, float:1.9559547E38)
            goto L_0x001c
        L_0x0048:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWN.A03(android.view.View$OnClickListener, android.widget.TextView, java.lang.Integer, boolean):void");
    }

    public static final void A04(View view) {
        Resources resources = view.getResources();
        if (A02(AnonymousClass7TE.A0S(view)) == AnonymousClass05K.A0N) {
            DbT.A1B(resources, AnonymousClass7TF.A0G(view, R.id.creation_main_actions).getLayoutParams(), R.dimen.canvas_colour_wheel_offset_y);
        }
    }

    public static final boolean A05(Context context) {
        Integer A02 = A02(context);
        if (A02 == AnonymousClass05K.A00 || A02 == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }
}
