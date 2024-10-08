package X;

/* renamed from: X.64f  reason: invalid class name and case insensitive filesystem */
public final class C3025864f implements C3025964g {
    public long A00;
    public C287725af A01;
    public C287725af A02;
    public C287725af A03;
    public Object A04;
    public Object A05;
    public final C287725af A06;
    public final C287805an A07;
    public final C3026164i A08;

    public final Object CDQ(long j) {
        long j2 = j;
        if (CTe(j)) {
            return this.A05;
        }
        C287725af CDS = this.A08.CDS(this.A02, this.A03, this.A06, j2);
        int A012 = CDS.A01();
        for (int i = 0; i < A012; i++) {
            if (!(!Float.isNaN(CDS.A00(i)))) {
                StringBuilder sb = new StringBuilder();
                sb.append("AnimationVector cannot contain a NaN. ");
                sb.append(CDS);
                sb.append(". Animation: ");
                sb.append(this);
                sb.append(", playTimeNanos: ");
                sb.append(j);
                throw new IllegalStateException(sb.toString());
            }
        }
        return ((C287795am) this.A07).A00.invoke(CDS);
    }

    public final C287725af CDf(long j) {
        long j2 = j;
        if (!CTe(j)) {
            return this.A08.CDd(this.A02, this.A03, this.A06, j2);
        }
        C287725af r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C287725af B1n = this.A08.B1n(this.A02, this.A03, this.A06);
        this.A01 = B1n;
        return B1n;
    }

    public final long AzP() {
        long j = this.A00;
        if (j >= 0) {
            return j;
        }
        long AzR = this.A08.AzR(this.A02, this.A03, this.A06);
        this.A00 = AzR;
        return AzR;
    }

    public final Object C4T() {
        return this.A05;
    }

    public final C287805an CAq() {
        return this.A07;
    }

    public final boolean CVL() {
        return this.A08.CVL();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TargetBasedAnimation: ");
        sb.append(this.A04);
        sb.append(" -> ");
        sb.append(this.A05);
        sb.append(",initial velocity: ");
        sb.append(this.A06);
        sb.append(", duration: ");
        sb.append(AzP() / 1000000);
        sb.append(" ms,animationSpec: ");
        sb.append(this.A08);
        return sb.toString();
    }

    public C3025864f(AnonymousClass5b9 r3, C287725af r4, C287805an r5, Object obj, Object obj2) {
        C287725af A012;
        this.A08 = r3.FMw(r5);
        this.A07 = r5;
        this.A05 = obj2;
        this.A04 = obj;
        this.A02 = (C287725af) ((C287795am) r5).A01.invoke(obj);
        this.A03 = (C287725af) ((C287795am) this.A07).A01.invoke(obj2);
        if (r4 != null) {
            A012 = AnonymousClass6GZ.A00(r4);
        } else {
            A012 = AnonymousClass6GZ.A01((C287725af) ((C287795am) this.A07).A01.invoke(obj));
        }
        this.A06 = A012;
        this.A00 = -1;
    }

    public final /* synthetic */ boolean CTe(long j) {
        if (j >= AzP()) {
            return true;
        }
        return false;
    }
}
