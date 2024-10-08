package X;

import android.view.Surface;

/* renamed from: X.8mi  reason: invalid class name and case insensitive filesystem */
public class C365208mi extends AnonymousClass8KT implements C365188mg {
    public int A00;
    public int A01;
    public long A02;
    public Surface A03;
    public C365228mk A04;
    public final C346057uW A05;
    public final AnonymousClass8KV A06;

    public final C365468nA BHU() {
        return null;
    }

    public final String BO5() {
        return "SurfaceOutput";
    }

    public void A00(long j) {
        AnonymousClass8KV r1 = this.A06;
        if (r1 == AnonymousClass8KV.CAPTURE || r1 == AnonymousClass8KV.PEER) {
            j = this.A05.A00(j);
        }
        this.A02 = j;
        C345937uK r0 = this.A00;
        if (r0 != null) {
            r0.A04(j);
        }
    }

    public final void A01(Surface surface, int i, int i2) {
        if (surface == null) {
            throw new IllegalArgumentException("surface cannot be null");
        } else if (surface != this.A03 || !this.A02.get()) {
            if (this.A03 != null) {
                C365228mk r0 = this.A04;
                if (r0 != null) {
                    r0.EzD(this);
                }
                this.A03 = null;
            }
            this.A03 = surface;
            this.A01 = i;
            this.A00 = i2;
            C365228mk r02 = this.A04;
            if (r02 != null) {
                r02.EzB(surface, this);
            }
        } else if (i != this.A01 || i2 != this.A00) {
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public final int Bpb() {
        return 0;
    }

    public final AnonymousClass8KV CED() {
        return this.A06;
    }

    public final void CMW(C365228mk r2, C365248mm r3) {
        this.A04 = r2;
        Surface surface = this.A03;
        if (surface != null) {
            r2.EzB(surface, this);
        }
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public C365208mi(Surface surface, AnonymousClass8KV r4, int i, int i2) {
        if (surface != null) {
            this.A03 = surface;
            this.A01 = i;
            this.A00 = i2;
            this.A06 = r4;
            this.A05 = new C346057uW();
            return;
        }
        throw new IllegalArgumentException("surface cannot be null");
    }

    public boolean AFP() {
        Surface surface;
        if (!super.AFP() || (surface = this.A03) == null || !surface.isValid()) {
            return false;
        }
        return true;
    }

    public final void destroy() {
        release();
    }
}
