package X;

import android.graphics.Point;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.LDk  reason: case insensitive filesystem */
public final class C63927LDk {
    public final /* synthetic */ C364988mL A00;
    public final /* synthetic */ LAM A01;
    public final /* synthetic */ C64149LQm A02;
    public final /* synthetic */ CountDownLatch A03;
    public final /* synthetic */ AtomicReference A04;

    public final void A00(Exception exc) {
        C364988mL r4 = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Render single config failure: ");
        LAM lam = this.A01;
        C62461KgB kgB = lam.A02;
        String A0i = AnonymousClass7TF.A0i(kgB, A1A);
        C64149LQm lQm = this.A02;
        r4.A0D(A0i, "OneCameraImageRenderer", exc);
        0KC.A0L("OneCameraImageRenderer", "IO exception for %s", exc, new Object[]{kgB});
        this.A04.set(new LEA((Point) null, (Point) null, lam, (Double) null, (Double) null, exc, AnonymousClass05K.A01, 0));
        JW1.A00(lQm.A09).A0B(false, exc.getMessage());
        this.A03.countDown();
    }

    public C63927LDk(C364988mL r1, LAM lam, C64149LQm lQm, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A04 = atomicReference;
        this.A03 = countDownLatch;
        this.A00 = r1;
        this.A01 = lam;
        this.A02 = lQm;
    }
}
