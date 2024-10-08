package X;

/* renamed from: X.AnB  reason: case insensitive filesystem */
public final /* synthetic */ class C41027AnB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8AL A01;

    public /* synthetic */ C41027AnB(AnonymousClass8AL r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass8AL r3 = this.A01;
        int i = this.A00;
        if (r3.A0C) {
            if (r3.A0D) {
                i++;
            }
            int A02 = AnonymousClass8AL.A02(r3);
            if (A02 != i) {
                r3.A07 = true;
                r3.EKg(i, A02);
                r3.A07 = false;
            }
        }
    }
}
