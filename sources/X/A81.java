package X;

import java.util.ArrayList;
import java.util.HashMap;

public final class A81 {
    public int A00;
    public int A01;
    public C369008tg A02;
    public C361248fu A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final C345997uQ A07;
    public final C345557ti A08;
    public final boolean A09;

    public A81(C345557ti r6, int i, int i2, boolean z) {
        this.A08 = r6;
        this.A06 = i;
        this.A05 = i2;
        this.A09 = z;
        this.A03 = r6.A02(i, i2, this.A04);
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        A1C.add("aPosition");
        A1E.put("aTextureCoord", new C345987uP(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1C.add("aTextureCoord");
        this.A07 = new C345997uQ(A1C, A1E);
    }
}
