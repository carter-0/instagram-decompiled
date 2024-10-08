package X;

import android.content.res.TypedArray;
import android.widget.LinearLayout;

public final class Q9l extends LinearLayout.LayoutParams {
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(i)) {
            this.width = typedArray.getLayoutDimension(i, "layout_width");
        } else {
            this.width = -2;
        }
        if (typedArray.hasValue(i2)) {
            this.height = typedArray.getLayoutDimension(i2, "layout_height");
        } else {
            this.height = -2;
        }
    }
}
