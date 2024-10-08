package X;

import android.os.Handler;
import android.view.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class WH3 implements AnonymousClass2nZ {
    public static final long A0A;
    public static final long A0B;
    public double A00;
    public double A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public List A06 = new ArrayList();
    public final Handler A07;
    public final VUe A08;
    public final AnonymousClass0KJ A09;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0A = timeUnit.toMillis(30);
        A0B = timeUnit.toMillis(30);
    }

    public final void ARH() {
        this.A05 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A04 = System.nanoTime();
        this.A09.ARH();
        VUe vUe = this.A08;
        vUe.A00.markerStart(15990796, "module", vUe.A01);
    }

    public WH3(Window window, VUe vUe) {
        this.A08 = vUe;
        Handler A0D = AnonymousClass7TF.A0D();
        this.A07 = A0D;
        this.A09 = new WH4(A0D, new WCP(this), window);
    }

    public final void APC() {
        this.A03 = System.nanoTime();
        this.A09.APC();
        this.A07.post(new C19932Wi1(this));
    }
}
