package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Callback;

public final class WIy implements C20876X2c {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Callback A03;
    public final /* synthetic */ C18592Vuj A04;

    public final void AT8() {
        int A002;
        try {
            C18592Vuj vuj = this.A04;
            W0R w0r = vuj.A0L;
            int i = this.A02;
            int[] iArr = vuj.A0P;
            w0r.A06(i, iArr);
            float f = (float) iArr[0];
            float f2 = (float) iArr[1];
            float f3 = this.A00;
            float f4 = this.A01;
            synchronized (w0r) {
                View view = (View) w0r.A03.get(i);
                if (view != null) {
                    A002 = C18797W2f.A00((ViewGroup) view, C18797W2f.A01, f3, f4);
                } else {
                    throw new RuntimeException(002.A0O("Could not find view with tag ", i));
                }
            }
            w0r.A06(A002, iArr);
            this.A03.invoke(Integer.valueOf(A002), Float.valueOf(W2U.A00(((float) iArr[0]) - f)), Float.valueOf(W2U.A00(((float) iArr[1]) - f2)), Float.valueOf(W2U.A00((float) iArr[2])), Float.valueOf(W2U.A00((float) iArr[3])));
        } catch (QZA unused) {
            this.A03.invoke(new Object[0]);
        }
    }

    public WIy(Callback callback, C18592Vuj vuj, float f, float f2, int i) {
        this.A04 = vuj;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = callback;
    }
}
