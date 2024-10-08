package X;

import android.content.Context;

/* renamed from: X.VaS  reason: case insensitive filesystem */
public final class C17574VaS {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public U4V A04;
    public final /* synthetic */ C17937ViS A05;

    public C17574VaS(C17937ViS viS, float f, float f2, int i, int i2, int i3) {
        this.A05 = viS;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = i2;
        Context context = viS.A04;
        int i4 = viS.A02;
        boolean z = viS.A0A;
        U4V u4v = new U4V(context);
        u4v.A00 = i4;
        u4v.A01 = z;
        if (i3 != 0) {
            DbU.A12(context, u4v, i3);
            2eS.A01(u4v);
        }
        this.A04 = u4v;
        WBG.A01(u4v, 0, this, viS);
    }
}
