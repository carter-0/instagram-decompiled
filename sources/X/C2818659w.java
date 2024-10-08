package X;

import java.util.Observable;

/* renamed from: X.59w  reason: invalid class name and case insensitive filesystem */
public class C2818659w implements C2818759x {
    public final Observable A00 = new Observable();

    public void A02(Object obj) {
        this.A00.notifyObservers(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Observer, java.lang.Object, X.5A9] */
    public void A9U(AnonymousClass5A7 r3) {
        Observable observable = this.A00;
        ? obj = new Object();
        obj.A00 = r3;
        observable.addObserver(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Observer, java.lang.Object, X.5A9] */
    public final void AOY(AnonymousClass5A7 r3) {
        Observable observable = this.A00;
        ? obj = new Object();
        obj.A00 = r3;
        observable.deleteObserver(obj);
    }
}
