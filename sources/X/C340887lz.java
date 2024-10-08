package X;

/* renamed from: X.7lz  reason: invalid class name and case insensitive filesystem */
public final class C340887lz implements C340897m0 {
    public final C340877ly A00;
    public final C340627lZ A01;
    public final C340917m2 A02;
    public volatile int A03;
    public volatile C343297pz A04;
    public volatile Boolean A05;

    public final void ADv() {
        this.A01.A00();
    }

    public final /* bridge */ /* synthetic */ Object Bny() {
        if (this.A05 == null) {
            throw new IllegalStateException("Configure Preview operation hasn't completed yet.");
        } else if (this.A05.booleanValue()) {
            return this.A04;
        } else {
            throw new RuntimeException("Failed to configure preview.");
        }
    }

    public C340887lz(C340877ly r3) {
        this.A03 = 0;
        C340907m1 r1 = new C340907m1(this);
        this.A02 = r1;
        this.A00 = r3;
        C340627lZ r0 = new C340627lZ();
        this.A01 = r0;
        r0.A00 = r1;
    }

    public C340887lz() {
        this((C340877ly) null);
    }
}
