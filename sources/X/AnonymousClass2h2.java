package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.2h2  reason: invalid class name */
public abstract class AnonymousClass2h2 extends Drawable.ConstantState {
    public int A00;
    public final Paint A01;
    public final C226512gw A02;

    public AnonymousClass2h2(AnonymousClass2h2 r3) {
        0qQ.A0B(r3, 1);
        this.A02 = r3.A02;
        this.A01 = new Paint(r3.A01);
        this.A00 = r3.A00;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public AnonymousClass2h2(C226512gw r3) {
        this.A02 = r3;
        this.A01 = new Paint(6);
        this.A00 = 119;
    }
}
