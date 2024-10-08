package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.591  reason: invalid class name */
public final class AnonymousClass591 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass592 A03 = new Object();
    public final float A04;
    public final AnonymousClass592 A05 = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [X.592, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.592, java.lang.Object] */
    public AnonymousClass591(float f) {
        this.A04 = ((float) TimeUnit.SECONDS.toNanos(1)) / f;
    }
}
