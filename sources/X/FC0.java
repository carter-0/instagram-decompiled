package X;

import android.content.Context;
import android.widget.EditText;

public abstract class FC0 {
    public static final void A00(Context context, EditText editText, int i, boolean z) {
        String str;
        int i2;
        0qQ.A0B(editText, 1);
        if (i == 0) {
            i2 = 2131969541;
        } else if (i == 1) {
            i2 = 2131969542;
        } else if (!z) {
            i2 = 2131969544;
        } else {
            str = null;
            editText.setHint(str);
        }
        str = context.getString(i2);
        editText.setHint(str);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r5, com.instagram.common.ui.widget.imageview.CircularImageView r6, int r7) {
        /*
            r0 = 0
            r4 = 2
            X.0qQ.A0B(r6, r4)
            r6.setVisibility(r0)
            android.graphics.drawable.Drawable r3 = r6.getBackground()
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r3, r0)
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            r3.mutate()
            int r1 = X.AnonymousClass7TG.A04(r5)     // Catch:{ NotFoundException -> 0x001d }
            goto L_0x002b
        L_0x001d:
            X.0wj r2 = X.0wj.A01
            r1 = 817896325(0x30c01b85, float:1.397766E-9)
            java.lang.String r0 = "Resource.NotFoundException when getting R.dimen.color_stroke_size"
            X.DbT.A1Q(r2, r0, r1)
            int r1 = X.DbS.A02(r5, r4)
        L_0x002b:
            int r0 = r5.getColor(r7)
            r3.setStroke(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FC0.A01(android.content.Context, com.instagram.common.ui.widget.imageview.CircularImageView, int):void");
    }

    public static final boolean A02(EditText editText) {
        0qQ.A0B(editText, 0);
        return AnonymousClass7TF.A1Q(DbV.A12(AnonymousClass7TF.A0f(editText)).length());
    }
}
