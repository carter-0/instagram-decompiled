package X;

/* renamed from: X.3Px  reason: invalid class name and case insensitive filesystem */
public abstract class C241623Px implements Runnable, Comparable, AnonymousClass19L, C241633Py {
    public int A00;
    public long A01;
    public volatile Object _heap;

    public final void dispose() {
        C241643Pz r3;
        synchronized (this) {
            Object obj = this._heap;
            0zk r2 = C67411tL.A01;
            if (obj != r2) {
                if ((obj instanceof C241643Pz) && (r3 = (C241643Pz) obj) != null) {
                    synchronized (r3) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C67401tJ) && ((C67401tJ) obj2) != null) {
                            r3.A02(this.A00);
                        }
                    }
                }
                this._heap = r2;
            }
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.A01 - ((C241623Px) obj).A01;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public String toString() {
        return 002.A0K("Delayed[nanos=", ']', this.A01);
    }
}
