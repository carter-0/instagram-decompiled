package X;

/* renamed from: X.IiJ  reason: case insensitive filesystem */
public final class C57902IiJ implements Runnable {
    public final /* synthetic */ C39752A7s A00;
    public final /* synthetic */ AnonymousClass7NI A01;
    public final /* synthetic */ String A02;

    public C57902IiJ(C39752A7s a7s, AnonymousClass7NI r2, String str) {
        this.A01 = r2;
        this.A00 = a7s;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass7NI r1 = this.A01;
        C39752A7s a7s = this.A00;
        String str = this.A02;
        r1.A02(a7s, str, new C58700Iw9(r1, a7s, AnonymousClass05K.A00, str, 3, false), C58372Iqr.A00, false);
    }
}
