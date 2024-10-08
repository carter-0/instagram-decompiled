package X;

/* renamed from: X.WVj  reason: case insensitive filesystem */
public final class C19342WVj implements X8P {
    public final /* synthetic */ C16672Uz8 A00;
    public final /* synthetic */ C17694VcP A01;
    public final /* synthetic */ C15381Ube A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C19342WVj(C16672Uz8 uz8, C17694VcP vcP, C15381Ube ube, boolean z, boolean z2) {
        this.A02 = ube;
        this.A01 = vcP;
        this.A00 = uz8;
        this.A04 = z;
        this.A03 = z2;
    }

    public final void D0R() {
        this.A02.getParentFragmentManager().A13();
    }

    public final void D5V() {
        C15381Ube ube = this.A02;
        C15381Ube.A02(this.A00, this.A01, ube, this.A04, this.A03);
    }

    public final void D9G() {
        C14074TpO tpO = this.A02.A07;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        C3251871j r0 = tpO.A05;
        if (r0 != null) {
            r0.A05 = true;
        }
    }

    public final void DkP() {
        C14074TpO tpO = this.A02.A07;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        C3251871j r0 = tpO.A05;
        if (r0 != null) {
            r0.A05 = false;
        }
    }
}
