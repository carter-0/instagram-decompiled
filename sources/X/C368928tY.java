package X;

/* renamed from: X.8tY  reason: invalid class name and case insensitive filesystem */
public final class C368928tY implements C344747sM, C344827sU {
    public int A00;
    public int A01;
    public C345897uG A02;
    public C361868gx A03;
    public boolean A04;
    public final C368918tX A05;
    public final C368538so A06;
    public final C368798tL A07;
    public final C368938tZ A08;

    public C368928tY(C368918tX r3) {
        this.A05 = r3;
        this.A06 = new C368538so();
        this.A08 = new C368938tZ(true);
        this.A07 = new C368798tL();
    }

    public final void ACn(C345897uG r3) {
        0qQ.A0B(r3, 0);
        this.A02 = r3;
        C361868gx r1 = this.A03;
        if (r1 != null) {
            r1.DpY(r3.BhQ());
        }
        this.A08.A00 = r3.BhQ();
    }

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    public final void detach() {
        C361868gx r0 = this.A03;
        if (r0 != null) {
            r0.Dpb();
        }
        this.A08.Dpb();
        this.A02 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        C361868gx r1 = this.A03;
        C361868gx r0 = ((C368928tY) obj).A03;
        if (r1 == r0) {
            return true;
        }
        if (r1 == null || !r1.equals(r0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C361868gx r1 = this.A03;
        if (r1 != null) {
            return r1.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GlLegacyRenderer(");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C368928tY() {
        this(new C368908tW());
    }
}
