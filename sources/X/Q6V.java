package X;

import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.os.LocaleList;

public final class Q6V extends Paint {
    public final void setTextLocales(LocaleList localeList) {
    }

    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = SQL.A00;
            setColor((Pxf.A01(255, i, 0) << 24) | (color & 16777215));
            return;
        }
        PointF pointF2 = SQL.A00;
        super.setAlpha(Pxf.A01(255, i, 0));
    }
}
