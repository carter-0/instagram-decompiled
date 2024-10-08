package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.EqS  reason: case insensitive filesystem */
public abstract class C49161EqS {
    public static int A00(Context context, FAT fat) {
        int i;
        boolean z = fat.A02;
        boolean z2 = fat.A03;
        boolean z3 = fat.A00;
        if (z2) {
            if (z3) {
                i = R.attr.backgroundDrawableSingle;
                if (z) {
                    i = R.attr.backgroundElevatedDrawableSingle;
                }
            } else {
                i = R.attr.backgroundDrawableTop;
                if (z) {
                    i = R.attr.backgroundElevatedDrawableTop;
                }
            }
        } else if (z3) {
            i = R.attr.backgroundDrawableBottom;
            if (z) {
                i = R.attr.backgroundElevatedDrawableBottom;
            }
        } else {
            i = R.attr.backgroundDrawable;
            if (z) {
                i = R.attr.elevatedBackgroundDrawable;
            }
        }
        return 2Yu.A0H(context, i);
    }
}
