package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.3d4  reason: invalid class name and case insensitive filesystem */
public final class C245533d4 {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ ComponentHost A03;

    public C245533d4(ComponentHost componentHost) {
        this.A03 = componentHost;
    }

    public final void A00() {
        int i;
        if (this.A02 != null) {
            01s r6 = this.A03.A0M;
            int A002 = r6.A00();
            int i2 = this.A00;
            while (true) {
                if (i2 >= A002) {
                    i = this.A01;
                    break;
                }
                C246113e2 r7 = (C246113e2) r6.A04(i2);
                Object obj = r7.A04;
                if (obj instanceof View) {
                    i = i2 + 1;
                    break;
                }
                if (r7.A02) {
                    boolean isTracing = ComponentsSystrace.A00.isTracing();
                    if (isTracing) {
                        String A0J = C245543d5.A00(r7.A01).A03.A0J();
                        0qQ.A07(A0J);
                        ComponentsSystrace.A02(002.A0R("draw: ", A0J));
                    }
                    0qQ.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    Drawable drawable = (Drawable) obj;
                    Canvas canvas = this.A02;
                    if (canvas != null) {
                        drawable.draw(canvas);
                        if (isTracing) {
                            ComponentsSystrace.A01();
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                i2++;
            }
            this.A00 = i;
        }
    }
}
