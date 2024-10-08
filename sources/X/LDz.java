package X;

import java.util.List;

public final class LDz {
    public int A00;
    public C63954LFa A01;
    public List A02 = 0sn.A00;
    public final float A03;
    public final int A04;
    public final int A05;
    public final List A06;

    public LDz(List list, float f, int i, int i2) {
        0qQ.A0B(list, 1);
        this.A06 = list;
        this.A04 = i;
        this.A05 = i2;
        this.A03 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BarViewModel(segments=");
        A1A.append(this.A06);
        A1A.append(", backgroundColor=");
        A1A.append(this.A04);
        A1A.append(", barHeight=");
        A1A.append(this.A05);
        A1A.append(", enableAnimations=");
        return G9t.A1C(A1A, false);
    }
}
