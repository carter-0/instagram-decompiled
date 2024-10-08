package X;

/* renamed from: X.Ghw  reason: case insensitive filesystem */
public final class C53064Ghw extends C320806sz {
    public final /* synthetic */ C56936IIf A00;

    public C53064Ghw(C56936IIf iIf) {
        this.A00 = iIf;
    }

    public final int A00(int i) {
        C338367hq A02;
        C56936IIf iIf = this.A00;
        2We r2 = iIf.A00;
        if (r2 == null) {
            return 1;
        }
        synchronized (r2) {
            AnonymousClass2VL.A00();
            A02 = ((C295015nP) r2.A0i.get(i)).A02();
        }
        if (A02.CU5()) {
            return iIf.A01.A00;
        }
        return A02.By5();
    }
}
