package X;

import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.7h7  reason: invalid class name and case insensitive filesystem */
public final class C337917h7 implements C338387hs {
    public final /* synthetic */ C337907h6 A00;
    public final /* synthetic */ C337587ga A01;
    public final /* synthetic */ C337657gh A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C337917h7(C337907h6 r1, C337587ga r2, C337657gh r3, boolean z, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = r2;
    }

    public final void D7k() {
        C337657gh r2 = this.A02;
        if (this.A03) {
            boolean z = this.A04;
            if (z) {
                ComponentsSystrace.A02("dataBound");
            }
            try {
                C337587ga r0 = this.A01;
                AnonymousClass2VL.A00();
                if (r0 != null) {
                    r2.A01 = r0;
                    C337657gh.A0C(r0, r2);
                }
            } finally {
                if (z) {
                    ComponentsSystrace.A01();
                }
            }
        }
    }

    public final void D7p(boolean z, long j) {
        C337657gh r2 = this.A02;
        C337587ga r1 = this.A01;
        boolean z2 = this.A03;
        C337907h6 r0 = this.A00;
        AnonymousClass2VL.A00();
        if (r1 != null) {
            C337657gh.A06(r0, r1, r2, 0, j, z2, z);
        }
    }
}
