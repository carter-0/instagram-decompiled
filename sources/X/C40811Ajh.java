package X;

/* renamed from: X.Ajh  reason: case insensitive filesystem */
public final class C40811Ajh implements Runnable {
    public final /* synthetic */ C353408Hm A00;

    public C40811Ajh(C353408Hm r1) {
        this.A00 = r1;
    }

    public final void run() {
        C353408Hm r3 = this.A00;
        C3498081w.A00(r3.A01);
        C3508086k r1 = r3.A02;
        r1.A00().CHo();
        AnonymousClass8DD r0 = r3.A03;
        if (r0 != null) {
            AnonymousClass8DM r02 = r0.A0O;
            if (r02 != null) {
                r02.ARV();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (r3.A00 != null) {
            r1.A00().EKb(r3.A00, true);
            r3.A00 = null;
        }
    }
}
