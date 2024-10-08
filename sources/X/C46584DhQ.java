package X;

/* renamed from: X.DhQ  reason: case insensitive filesystem */
public final /* synthetic */ class C46584DhQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C46582DhO A01;

    public /* synthetic */ C46584DhQ(C46582DhO dhO, int i) {
        this.A01 = dhO;
        this.A00 = i;
    }

    public final void run() {
        C46582DhO dhO = this.A01;
        int i = this.A00;
        if (i != -1) {
            C46582DhO.A00(dhO, i);
        }
    }
}
