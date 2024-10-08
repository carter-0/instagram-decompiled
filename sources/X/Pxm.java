package X;

import android.os.Handler;

public final class Pxm implements AnonymousClass07Z {
    public static final Pxm A08 = new Pxm();
    public int A00;
    public int A01;
    public Handler A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public final 0h9 A05 = new 0h9(this);
    public final TZW A06 = new Pxq(this);
    public final Runnable A07 = new Pxp(this);

    public static final Pxm A00() {
        return A08;
    }

    public final void A01() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i != 1) {
            return;
        }
        if (this.A03) {
            this.A05.A0B(07T.ON_RESUME);
            this.A03 = false;
            return;
        }
        Handler handler = this.A02;
        0qQ.A0A(handler);
        handler.removeCallbacks(this.A07);
    }

    public final void A02() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 1 && this.A04) {
            this.A05.A0B(07T.ON_START);
            this.A04 = false;
        }
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A05;
    }
}
