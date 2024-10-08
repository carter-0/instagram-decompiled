package X;

/* renamed from: X.TrP  reason: case insensitive filesystem */
public final class C14185TrP implements Runnable {
    public final /* synthetic */ AnonymousClass1XV A00;
    public final /* synthetic */ AnonymousClass73G A01;
    public final /* synthetic */ AnonymousClass3JC A02;

    public C14185TrP(AnonymousClass1XV r1, AnonymousClass73G r2, AnonymousClass3JC r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass73G r1 = this.A01;
        C324366zA r3 = r1.A01;
        AnonymousClass1XV r2 = this.A00;
        r3.A07 = r2.getNextMaxId();
        r3.A0A = r2.CP6();
        C324596za r12 = r1.A00;
        r12.onSuccess(r2);
        if (this.A02.A00.isFinal) {
            r3.A00(AnonymousClass05K.A0C);
            r12.onFinish();
        }
    }
}
