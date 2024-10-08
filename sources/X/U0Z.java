package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public abstract class U0Z extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final Context A03;

    public U0Z(Context context) {
        0qQ.A0B(context, 1);
        this.A03 = context;
        this.A02 = 0nA.A04(context, 20);
        0nA.A04(context, 40);
        this.A00 = 0nA.A04(context, 50);
        this.A01 = 0nA.A04(context, 104);
    }

    public final int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final int A02() {
        if (!(this instanceof C16079Uo6)) {
            return 255;
        }
        C16079Uo6 uo6 = (C16079Uo6) this;
        if (!uo6.A0E) {
            return 255;
        }
        long j = uo6.A06;
        if (j == -1) {
            return 0;
        }
        float currentTimeMillis = (float) (System.currentTimeMillis() - j);
        if (currentTimeMillis >= 300.0f) {
            return uo6.A04;
        }
        return Math.round(0mi.A02(currentTimeMillis, 0.0f, 300.0f, 0.0f, (float) uo6.A04));
    }
}
