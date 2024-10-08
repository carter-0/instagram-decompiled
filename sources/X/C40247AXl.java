package X;

/* renamed from: X.AXl  reason: case insensitive filesystem */
public final class C40247AXl implements AnonymousClass1GR {
    public boolean A00;
    public final /* synthetic */ 1Ga A01;
    public final /* synthetic */ AnonymousClass1DK A02;
    public final /* synthetic */ 11W A03;
    public final /* synthetic */ AnonymousClass1GR A04;
    public final /* synthetic */ AnonymousClass1GR A05;
    public final /* synthetic */ 1GP A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public final /* synthetic */ void D58(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DTy(1XR r1, AnonymousClass1QW r2, AnonymousClass2ZK r3) {
    }

    public final /* synthetic */ void Den() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public C40247AXl(1Ga r1, AnonymousClass1DK r2, 11W r3, AnonymousClass1GR r4, AnonymousClass1GR r5, 1GP r6, String str, boolean z) {
        this.A03 = r3;
        this.A01 = r1;
        this.A07 = str;
        this.A04 = r4;
        this.A06 = r6;
        this.A08 = z;
        this.A05 = r5;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r8, AnonymousClass1QW r9, AnonymousClass2ZK r10) {
        1XU r82 = (1XU) r8;
        0qQ.A0B(r9, 0);
        AnonymousClass7TF.A1B(r10, 1, r82);
        if (r82.AjP() == -1) {
            0wb.A03("IgApiPrefetchStreamingScheduler", "invalid cache responseObject");
        }
        this.A01.A00.put(this.A07, new C228862mS(this.A03, r82.AjP()));
        if (!this.A00) {
            this.A00 = true;
        }
        AnonymousClass1GR r0 = this.A04;
        if (r0 != null) {
            r0.DTw(r82, r9, r10);
        }
    }

    public final void DeX() {
        AnonymousClass1GR r0 = this.A04;
        if (r0 != null) {
            r0.DeX();
        }
    }

    public final void DEO(C268654dm r7, AnonymousClass1QW r8) {
        AnonymousClass7TG.A1N(r8, r7);
        1GP r4 = this.A06;
        if (r4 != null && (!this.A08 || this.A01.A02())) {
            1Ga r0 = this.A01;
            String str = this.A07;
            1Ga.A01(r0, this.A02, this.A05, this.A04, r4, str);
        }
        AnonymousClass1GR r02 = this.A04;
        if (r02 != null) {
            r02.DEO(r7, r8);
        }
    }
}
