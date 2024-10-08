package X;

/* renamed from: X.Gvu  reason: case insensitive filesystem */
public final class C53889Gvu extends C251343mx {
    public final long A00;
    public final long A01;
    public final boolean A02;

    public static final JLY A00(C70832Wc r9, C53889Gvu gvu) {
        if (gvu.A02) {
            long j = gvu.A01;
            return new C53419GoB(C56192HuL.A00(((float) C51969G9p.A09(r9, j)) / 2.0f, ((float) C51969G9p.A09(r9, gvu.A00)) / 2.0f), ((float) C51969G9p.A09(r9, j)) / 2.0f);
        }
        return new C53420GoC(0nA.A00(C51969G9p.A0K(r9), 14.0f), C56192HuL.A00(0.0f, 0.0f), HSV.A00((float) C51969G9p.A09(r9, gvu.A01), (float) C51969G9p.A09(r9, gvu.A00)));
    }

    public C53889Gvu(long j, long j2, boolean z) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = z;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r6) {
        boolean A1Z = C51966G9m.A1Z(r6);
        2WX A0B = C51974G9v.A0B(C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, A1Z ? 1 : 0, this.A01), A1Z, this.A00));
        long A0D = C51969G9p.A0D();
        return new C53945Gwp(AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0B, AnonymousClass05K.A0C, 1, A0D), AnonymousClass05K.A0N, 1, A0D), new C66312MMv(8, r6, this));
    }
}
