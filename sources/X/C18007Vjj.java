package X;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: X.Vjj  reason: case insensitive filesystem */
public final class C18007Vjj {
    public W0Q A00;
    public WeakReference A01 = new WeakReference((Object) null);
    public boolean A02 = true;
    public float A03;
    public final TextPaint A04 = new TextPaint(1);
    public final V4P A05 = new UWP(this);

    public final float A00(String str) {
        float measureText;
        if (!this.A02) {
            return this.A03;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.A04.measureText(str, 0, str.length());
        }
        this.A03 = measureText;
        this.A02 = false;
        return measureText;
    }

    public final void A01(Context context, W0Q w0q) {
        if (this.A00 != w0q) {
            this.A00 = w0q;
            if (w0q != null) {
                TextPaint textPaint = this.A04;
                V4P v4p = this.A05;
                w0q.A04(context, textPaint, v4p);
                C20973X7d x7d = (C20973X7d) this.A01.get();
                if (x7d != null) {
                    textPaint.drawableState = x7d.getState();
                }
                w0q.A03(context, textPaint, v4p);
                this.A02 = true;
            }
            C20973X7d x7d2 = (C20973X7d) this.A01.get();
            if (x7d2 != null) {
                x7d2.Dr7();
                x7d2.onStateChange(x7d2.getState());
            }
        }
    }

    public C18007Vjj(C20973X7d x7d) {
        this.A01 = new WeakReference(x7d);
    }
}
