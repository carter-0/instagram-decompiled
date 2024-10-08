package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;

/* renamed from: X.H2j  reason: case insensitive filesystem */
public final class C54189H2j extends AnonymousClass4O0 {
    public IntentAwareAdsInfoIntf A00;
    public Integer A01;

    public final void A0A(0xI r3, C263934Nx r4) {
        AnonymousClass4OC r1;
        0qQ.A0B(r3, 0);
        super.A0A(r3, r4);
        if (r4 != null && (r1 = r4.A07) != null) {
            r1.A00 = this.A00;
            r1.A0I = this.A01;
        }
    }

    public final C263844No A0C(C267324bN r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2.A00();
        this.A01 = r2.A0A();
        return super.A0C(r2);
    }
}
