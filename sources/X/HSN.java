package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

public abstract class HSN {
    public static Drawable A00(2V1 r7, int i) {
        TypedArray A02 = r7.A02(i, C55417HhN.A03);
        int indexCount = A02.getIndexCount();
        Drawable drawable = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = A02.getIndex(i2);
            if (index == 0) {
                drawable = r7.A0C.getDrawable(A02.getResourceId(index, 0));
            }
        }
        A02.recycle();
        return drawable;
    }
}
