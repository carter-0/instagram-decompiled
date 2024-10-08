package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class T7M implements AnonymousClass0lh {
    public final C367968rr A00;

    public final void onSessionWillEnd() {
        C367698rQ r2 = ((C367958rq) this.A00).A00;
        0qQ.A07(r2);
        Iterator A0s = AnonymousClass7TF.A0s(r2);
        while (A0s.hasNext()) {
            Bitmap bitmap = (Bitmap) C51971G9r.A0p(A0s);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        r2.clear();
    }

    public T7M() {
        C367658rM r3 = new C367658rM();
        r3.A01(25);
        r3.A02(10, TimeUnit.MINUTES);
        T0D t0d = T0D.A00;
        17k.A0F(DbW.A1a(r3.A05));
        t0d.getClass();
        r3.A05 = t0d;
        this.A00 = r3.A00();
    }
}
