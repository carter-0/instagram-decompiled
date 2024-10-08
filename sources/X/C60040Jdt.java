package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.List;

/* renamed from: X.Jdt  reason: case insensitive filesystem */
public final class C60040Jdt extends View {
    public float A00;
    public int A01;
    public int A02;
    public List A03;
    public boolean A04;

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        LSI lsi = LSI.A05;
        Context A0S = AnonymousClass7TE.A0S(this);
        boolean z = this.A04;
        List list = this.A03;
        int i = this.A01;
        int i2 = this.A02;
        float f3 = this.A00;
        synchronized (lsi) {
            LAK lak = LSI.A02;
            if (lak != null) {
                if (z) {
                    f = lak.A05;
                } else {
                    f = lak.A03;
                }
                if (z) {
                    f2 = lak.A04;
                } else {
                    f2 = lak.A00;
                }
                if (list != null) {
                    int i3 = 0;
                    for (Object next : LSI.A00((Float) null, list, ((JTS.A01(A0S, LQO.A00) * 1000.0f) / lak.A01) / f3, f3, i, i2, false)) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        } else {
                            LSI.A01(canvas, AnonymousClass7TE.A04(next), f2, f, i3);
                            i3 = i4;
                        }
                    }
                }
            }
        }
    }
}
