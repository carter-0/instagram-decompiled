package X;

/* renamed from: X.4RD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4RD implements Runnable {
    public final /* synthetic */ AnonymousClass4RC A00;
    public final /* synthetic */ AnonymousClass4R9 A01;

    public /* synthetic */ AnonymousClass4RD(AnonymousClass4RC r1, AnonymousClass4R9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        int i;
        AnonymousClass4R9 r0 = this.A01;
        AnonymousClass4RC r2 = this.A00;
        synchronized (r0.A02) {
            i = r0.A00;
        }
        r2.DTs(i);
    }
}
