package X;

import java.lang.ref.WeakReference;

public final class A7S {
    public final C341237mY A00 = new C40073AQd(this);
    public final C341277mc A01;
    public final C341177mS A02;
    public final C341187mT A03;
    public final A97 A04;
    public final WeakReference A05;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.7mS] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.7mT, java.lang.Object] */
    public A7S(C18660VwH vwH, A3V a3v, A97 a97) {
        WeakReference weakReference = new WeakReference(vwH);
        this.A05 = weakReference;
        ((C18660VwH) weakReference.get()).A06 = a3v;
        this.A01 = C341267mb.A00;
        this.A02 = new Object();
        this.A03 = new Object();
        this.A04 = a97;
    }
}
