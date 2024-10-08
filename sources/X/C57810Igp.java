package X;

/* renamed from: X.Igp  reason: case insensitive filesystem */
public final class C57810Igp implements Runnable {
    public final /* synthetic */ GJT A00;
    public final /* synthetic */ AnonymousClass3W1 A01;

    public C57810Igp(GJT gjt, AnonymousClass3W1 r2) {
        this.A01 = r2;
        this.A00 = gjt;
    }

    public final void run() {
        AnonymousClass3W1 r3 = this.A01;
        if (!r3.A2A) {
            GJT gjt = this.A00;
            gjt.A02 = true;
            r3.A2A = true;
            AnonymousClass3W1.A00(r3, 49);
            r3.A1L = "ad_feedback_interface";
            gjt.A05.remove(C51969G9p.A0q(r3));
            gjt.A00.Cis();
        }
    }
}
