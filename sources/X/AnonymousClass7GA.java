package X;

/* renamed from: X.7GA  reason: invalid class name */
public final class AnonymousClass7GA implements Runnable {
    public final /* synthetic */ AnonymousClass7DR A00;
    public final /* synthetic */ C328607Fl A01;
    public final /* synthetic */ AnonymousClass7ES A02;

    public AnonymousClass7GA(AnonymousClass7DR r1, C328607Fl r2, AnonymousClass7ES r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        C376679Ix r1 = this.A01.A02;
        if (r1 != null) {
            this.A02.A01(r1);
            return;
        }
        AnonymousClass7ES r12 = this.A02;
        11Z.A02(new C331557Rl(r12));
        r12.A02 = null;
    }
}
