package X;

/* renamed from: X.DHz  reason: case insensitive filesystem */
public final class C45995DHz implements Runnable {
    public final /* synthetic */ C70834ONg A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ 0sP A02;

    public C45995DHz(C70834ONg oNg, C62320sa r2, 0sP r3) {
        this.A00 = oNg;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        C70834ONg oNg = this.A00;
        oNg.A01();
        String string = oNg.A04.getString(2131958804);
        0qQ.A07(string);
        this.A02.invoke(string);
        this.A01.invoke();
    }
}
