package X;

/* renamed from: X.4Q3  reason: invalid class name */
public final class AnonymousClass4Q3 {
    public boolean A00;
    public final C697227w A01;

    public final synchronized void A00() {
        boolean z = false;
        while (!this.A00) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void A01() {
        this.A00 = false;
    }

    public final synchronized boolean A02() {
        boolean z;
        z = false;
        if (!this.A00) {
            z = true;
            this.A00 = true;
            notifyAll();
        }
        return z;
    }

    public AnonymousClass4Q3(C697227w r1) {
        this.A01 = r1;
    }

    public AnonymousClass4Q3() {
        this(C697227w.A00);
    }
}
