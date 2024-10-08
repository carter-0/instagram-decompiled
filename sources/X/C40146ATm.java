package X;

/* renamed from: X.ATm  reason: case insensitive filesystem */
public final class C40146ATm implements C345137sz, C344747sM {
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04 = -1;
    public long A05;
    public C346337v0 A06;
    public C345067ss A07;
    public C361238ft A08;
    public boolean A09 = false;
    public boolean A0A;
    public boolean A0B;
    public final String A0C;

    public final void ACn(C345897uG r1) {
    }

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    public final int Ap3() {
        return this.A00;
    }

    public final int Awt() {
        return this.A01;
    }

    public final C361238ft BCa() {
        return this.A08;
    }

    public final int BZX() {
        return this.A03;
    }

    public final long C7X() {
        return this.A05;
    }

    public final C345067ss CFP() {
        return this.A07;
    }

    public final boolean CU4() {
        return this.A0A;
    }

    public final boolean Cc4() {
        return this.A0B;
    }

    public final void detach() {
        C346337v0 r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
        this.A06 = null;
        this.A04 = -1;
        this.A02 = -1;
        this.A09 = false;
    }

    public final C346337v0 getTexture() {
        C346337v0 r0 = this.A06;
        r0.getClass();
        return r0;
    }

    public C40146ATm(String str) {
        this.A0C = str;
    }

    public final void EZ2(C361238ft r1) {
        this.A08 = r1;
    }
}
