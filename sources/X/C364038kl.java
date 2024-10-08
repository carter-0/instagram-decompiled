package X;

/* renamed from: X.8kl  reason: invalid class name and case insensitive filesystem */
public final class C364038kl implements C364018kj {
    public C341047mF A00;
    public boolean A01;
    public boolean A02;
    public final /* synthetic */ C364018kj A03;
    public final /* synthetic */ C363988kg A04;
    public final /* synthetic */ C340547lR A05;

    public C364038kl(C364018kj r4, C363988kg r5, C340547lR r6) {
        boolean z;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = Boolean.TRUE.equals(r5.A00(C363988kg.A06));
        C340167ko r1 = r6.A06;
        boolean z2 = false;
        if (r1 != null) {
            z = ((Boolean) r1.AXG(C340167ko.A04)).booleanValue();
        } else {
            z = false;
        }
        if (this.A01 && z) {
            z2 = true;
        }
        this.A02 = z2;
        this.A00 = r6.A0R.A00(r6.A0S);
    }

    public final void D16() {
        if (this.A02) {
            this.A00.EgZ(false);
        }
        this.A03.D16();
    }

    public final void DCn(Exception exc) {
        if (this.A02) {
            this.A00.EgZ(true);
        }
        this.A03.DCn(exc);
    }

    public final void DX5(C363858kS r3) {
        if (this.A02) {
            this.A00.EgZ(true);
        }
        this.A03.DX5(r3);
    }

    public final void DaE(float f) {
        this.A03.DaE(f);
    }

    public final void DsK(C363858kS r2) {
        this.A03.DsK(r2);
    }
}
