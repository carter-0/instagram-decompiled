package X;

/* renamed from: X.SwT  reason: case insensitive filesystem */
public final class C12532SwT implements C13784Tgz {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass4XV A04;

    public final int B6R() {
        return -1;
    }

    public final int BpA() {
        return this.A03;
    }

    public final int E6b() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A02();
        }
        if (i == 16) {
            return this.A04.A05();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A022 = this.A04.A02();
        this.A00 = A022;
        return (A022 & 240) >> 4;
    }

    public C12532SwT(AnonymousClass4YA r3) {
        AnonymousClass4XV r1 = r3.A00;
        this.A04 = r1;
        r1.A0G(12);
        this.A02 = r1.A04() & 255;
        this.A03 = r1.A04();
    }
}
