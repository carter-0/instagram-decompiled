package X;

/* renamed from: X.867  reason: invalid class name */
public final class AnonymousClass867 implements Runnable {
    public final /* synthetic */ AnonymousClass866 A00;

    public AnonymousClass867(AnonymousClass866 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass866 r3 = this.A00;
        r3.A02 = false;
        r3.A00 = System.currentTimeMillis();
        Object obj = r3.A01;
        if (obj != null) {
            r3.A04.A00.A03.A0B(new AnonymousClass88W(obj));
        }
    }
}
