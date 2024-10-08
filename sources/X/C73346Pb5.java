package X;

/* renamed from: X.Pb5  reason: case insensitive filesystem */
public final class C73346Pb5 implements Runnable {
    public final /* synthetic */ C71759OqL A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ 0sL A03;

    public C73346Pb5(C71759OqL oqL, Object obj, 0sP r3, 0sL r4) {
        this.A01 = obj;
        this.A03 = r4;
        this.A00 = oqL;
        this.A02 = r3;
    }

    public final void run() {
        Object obj;
        Object obj2 = this.A01;
        0sL r2 = this.A03;
        N4A n4a = this.A00.A04;
        if (obj2 != null) {
            obj = this.A02.invoke(obj2);
        } else {
            obj = null;
        }
        r2.invoke(n4a, obj);
    }
}
