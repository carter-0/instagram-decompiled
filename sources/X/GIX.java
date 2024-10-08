package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;

public abstract class GIX {
    public static final int A00(Context context, C66805Mcr mcr) {
        0qQ.A0B(context, 0);
        Paint paint = new Paint();
        paint.setTextSize(context.getResources().getDimension(mcr.A02));
        paint.setTypeface((Typeface) mcr.A04);
        return ((int) paint.measureText(mcr.A03.toString())) + 100;
    }

    public static final C306386Ly A01(Context context, C66805Mcr mcr, int i) {
        0qQ.A0B(context, 0);
        C306386Ly r2 = new C306386Ly(context, i);
        r2.A0A(context.getResources().getDimension(mcr.A02));
        r2.A0I((Typeface) mcr.A04);
        r2.A0F(mcr.A01);
        r2.A0L((Spannable) mcr.A03);
        return r2;
    }
}
