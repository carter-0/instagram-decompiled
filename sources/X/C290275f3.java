package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5f3  reason: invalid class name and case insensitive filesystem */
public final class C290275f3 implements C263574Mn {
    public C263634Mt A00;
    public AnonymousClass4Yf A01;
    public AnonymousClass4Yf A02;
    public C290285f4 A03;
    public final C290245f0 A04;
    public final AtomicReference A05 = new AtomicReference("Unset");
    public final AtomicReference A06 = new AtomicReference("Unset");

    public C290275f3(C290245f0 r3) {
        0qQ.A0B(r3, 1);
        this.A04 = r3;
    }

    public final void ADZ(C263634Mt r3) {
        if (this.A00 != r3) {
            this.A00 = r3;
            C290285f4 r1 = new C290285f4(this);
            this.A03 = r1;
            r3.A0G.A00.add(r1);
        }
    }

    public final void FIR() {
        C290285f4 r1;
        C263634Mt r0 = this.A00;
        if (!(r0 == null || (r1 = this.A03) == null)) {
            r0.A0G.A00.remove(r1);
        }
        this.A03 = null;
        this.A00 = null;
    }
}
