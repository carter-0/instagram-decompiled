package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.5yG  reason: invalid class name and case insensitive filesystem */
public final class C300975yG {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ C273704n3 A03;

    public C300975yG(C273704n3 r1) {
        this.A03 = r1;
    }

    public final void A00() {
        int i;
        Canvas canvas;
        if (this.A02 != null) {
            int i2 = this.A00;
            C273704n3 r5 = this.A03;
            int length = r5.A04.length;
            while (true) {
                if (i2 >= length) {
                    i = this.A01;
                    break;
                }
                C246113e2 r3 = r5.A04[i2];
                if (r3 != null) {
                    if (r3.A01.A06.A04 == AnonymousClass05K.A01) {
                        i = i2 + 1;
                        break;
                    } else if (r3.A02 && (canvas = this.A02) != null) {
                        Object obj = r3.A04;
                        0qQ.A0C(obj, AnonymousClass000.A00(13));
                        ((Drawable) obj).draw(canvas);
                    }
                }
                i2++;
            }
            this.A00 = i;
        }
    }
}
