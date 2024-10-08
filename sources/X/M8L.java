package X;

import android.graphics.Point;

public final /* synthetic */ class M8L implements Runnable {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ C365938nv A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ M8L(Point point, C365938nv r2, Integer num) {
        this.A01 = r2;
        this.A02 = num;
        this.A00 = point;
    }

    public final void run() {
        this.A01.DGA(this.A00, this.A02);
    }
}
