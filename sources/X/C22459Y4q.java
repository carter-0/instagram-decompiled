package X;

/* renamed from: X.Y4q  reason: case insensitive filesystem */
public final class C22459Y4q implements C13972Tma {
    public boolean A00;
    public final Y7X A01;
    public final /* synthetic */ C22456Y4n A02;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Y7X] */
    public C22459Y4q(C22456Y4n y4n) {
        this.A02 = y4n;
        C11291SJy sJy = C11291SJy.A03;
        C11291SJy Ezn = y4n.A05.Ezn();
        ? obj = new Object();
        if (Ezn != null) {
            obj.A00 = Ezn;
            this.A01 = obj;
            return;
        }
        throw AnonymousClass7TE.A0w("delegate == null");
    }

    public final void FNi(C13198TPe tPe, long j) {
        if (!this.A00) {
            long j2 = tPe.A00;
            C22023Xt4 xt4 = SUS.A04;
            if (j < 0 || 0 > j2 || j2 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.A02.A05.FNi(tPe, j);
            return;
        }
        throw Pxh.A0a();
    }

    public final void close() {
        if (!this.A00) {
            this.A00 = true;
            C22456Y4n y4n = this.A02;
            Y7X y7x = this.A01;
            C11291SJy sJy = y7x.A00;
            y7x.A00 = C11291SJy.A03;
            sJy.A02();
            sJy.A03();
            y4n.A00 = 3;
        }
    }

    public final void flush() {
        if (!this.A00) {
            this.A02.A05.flush();
        }
    }

    public final C11291SJy Ezn() {
        return this.A01;
    }
}
