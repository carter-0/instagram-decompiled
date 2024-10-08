package X;

/* renamed from: X.Al7  reason: case insensitive filesystem */
public final class C40899Al7 implements Runnable {
    public final /* synthetic */ AnonymousClass8OO A00;

    public C40899Al7(AnonymousClass8OO r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass80W r1;
        Object obj;
        AnonymousClass8OO r5 = this.A00;
        AnonymousClass8OD r4 = r5.A07;
        AnonymousClass8OM r3 = r5.A08;
        C21006X9e ClP = r4.ClP(r5.A00, r5.A04, r3, r5.A03);
        r5.A02 = ClP;
        if (ClP == null || !ClP.isValid()) {
            r1 = r5.A05;
            obj = new Object();
        } else {
            r1 = r5.A05;
            obj = new Object();
        }
        r1.A04(obj);
    }
}
