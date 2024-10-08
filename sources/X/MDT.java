package X;

import com.instagram.genai.imageutils.MaskUtilsKt;

public final class MDT extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDT(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A0B = i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MDT, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A0B;
        this.A09 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i != 0) {
            return MaskUtilsKt.A0D(this, (int[]) null, 0, 0, 0);
        }
        return MaskUtilsKt.A0C(this, (int[]) null, 0, 0, 0);
    }
}
