package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Mqj  reason: case insensitive filesystem */
public abstract class C67611Mqj {
    public static final int[] A00(Rect rect, Drawable drawable, Drawable drawable2) {
        int intrinsicHeight;
        int[] iArr = new int[2];
        if (IgdsSwitch.A0O) {
            iArr[0] = drawable.getIntrinsicWidth() + rect.left + rect.right;
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else {
            iArr[0] = drawable.getIntrinsicWidth() + ((drawable2.getIntrinsicWidth() * 2) / IgdsSwitch.A0M) + rect.left + rect.right;
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        iArr[1] = intrinsicHeight + rect.top + rect.bottom;
        return iArr;
    }
}
