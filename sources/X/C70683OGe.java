package X;

import java.util.Comparator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.OGe  reason: case insensitive filesystem */
public final class C70683OGe {
    public GAX A00;
    public C69667Npp A01;
    public final OJM A02 = new OJM();
    public final Comparator A03 = new Object();
    public final Lock A04;
    public final Lock A05;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    public C70683OGe() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A05 = reentrantReadWriteLock.readLock();
        this.A04 = reentrantReadWriteLock.writeLock();
    }
}
