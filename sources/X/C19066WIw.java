package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.Callback;

/* renamed from: X.WIw  reason: case insensitive filesystem */
public final class C19066WIw implements C20876X2c {
    public final int A00;
    public final Callback A01;
    public final /* synthetic */ C18592Vuj A02;

    public final void AT8() {
        try {
            C18592Vuj vuj = this.A02;
            W0R w0r = vuj.A0L;
            int i = this.A00;
            int[] iArr = vuj.A0P;
            synchronized (w0r) {
                View view = (View) w0r.A03.get(i);
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    view.getWindowVisibleDisplayFrame(rect);
                    iArr[0] = iArr[0] - rect.left;
                    iArr[1] = iArr[1] - rect.top;
                    iArr[2] = view.getWidth();
                    iArr[3] = view.getHeight();
                } else {
                    String A0c = 002.A0c("No native view for ", " currently exists", i);
                    0qQ.A0B(A0c, 1);
                    throw new RuntimeException(A0c);
                }
            }
            this.A01.invoke(Float.valueOf(W2U.A00((float) iArr[0])), Float.valueOf(W2U.A00((float) iArr[1])), Float.valueOf(W2U.A00((float) iArr[2])), Float.valueOf(W2U.A00((float) iArr[3])));
        } catch (USL unused) {
            this.A01.invoke(new Object[0]);
        }
    }

    public C19066WIw(Callback callback, C18592Vuj vuj, int i) {
        this.A02 = vuj;
        this.A00 = i;
        this.A01 = callback;
    }
}
