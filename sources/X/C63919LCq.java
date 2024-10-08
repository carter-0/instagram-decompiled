package X;

/* renamed from: X.LCq  reason: case insensitive filesystem */
public final class C63919LCq {
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(MLF.A00);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C51792G2b(this, 14));

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.KGC] */
    public final KGC A00(C66409MQp mQp) {
        C3253572b r2;
        C320156rr r1;
        if (mQp.equals(C65518Luh.A00)) {
            r2 = (C3253572b) this.A00.getValue();
            r1 = C320156rr.EMPTY;
        } else if (mQp instanceof Ff1) {
            AnonymousClass0eM r3 = this.A01;
            ((C3253572b) r3.getValue()).A05 = new FP3((Object) mQp, 64);
            r2 = (C3253572b) r3.getValue();
            r1 = C320156rr.ERROR;
        } else if (mQp.equals(C65519Lui.A00)) {
            r2 = (C3253572b) this.A00.getValue();
            r1 = C320156rr.LOADING;
        } else if (mQp.equals(C65520Luj.A00)) {
            r2 = (C3253572b) this.A00.getValue();
            r1 = C320156rr.NOT_LOADED;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        0qQ.A0B(r2, 1);
        ? obj = new Object();
        obj.A00 = r2;
        obj.A01 = r1;
        return obj;
    }
}
