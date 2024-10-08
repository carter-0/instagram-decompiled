package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.XGp  reason: case insensitive filesystem */
public final class C21148XGp extends C21145XGm {
    public int A00 = -1000;
    public boolean A01;
    public final C21373XZg A02;
    public final Y90 A03;
    public final Context A04;

    public C21148XGp(Context context, Handler handler, Y84 y84, Y90 y90, Y88 y88, YBA yba) {
        super(y88, yba, 44100.0f, 1);
        this.A04 = context.getApplicationContext();
        this.A03 = y90;
        this.A02 = new C21373XZg(handler, y84);
        ((C22084XvA) y90).A07 = new C22083Xv9(this);
    }

    public final void A01() {
        try {
            super.A01();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A03.reset();
            }
        }
    }
}
