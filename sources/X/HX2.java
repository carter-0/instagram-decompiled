package X;

import android.content.res.Resources;

public abstract class HX2 {
    public static final String A00(2V1 r2, C336617eu r3, int i, int i2, int i3) {
        String str;
        if (r3.A00 > 0) {
            try {
                str = r2.A0C.getResources().getQuantityString(i2, i, new Object[]{Integer.valueOf(i)});
            } catch (Resources.NotFoundException unused) {
                str = r2.A0C.getString(i3);
            }
        } else {
            str = r2.A0C.getString(i3);
        }
        0qQ.A0A(str);
        return str;
    }
}
