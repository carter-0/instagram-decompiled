package X;

/* renamed from: X.Sim  reason: case insensitive filesystem */
public final class C11913Sim implements C13796ThF, C13543TcF {
    public static final 02U A04 = new C11608SdB(new 0l2(20), new C12002SkL(0), C9912RjR.A00);
    public C13796ThF A00;
    public boolean A01;
    public boolean A02;
    public final S0B A03 = new Object();

    public final synchronized void A00() {
        this.A03.A00();
        if (this.A01) {
            this.A01 = false;
            if (this.A02) {
                recycle();
            }
        } else {
            throw AnonymousClass7TE.A0z("Already unlocked");
        }
    }

    public final synchronized void recycle() {
        this.A03.A00();
        this.A02 = true;
        if (!this.A01) {
            this.A00.recycle();
            this.A00 = null;
            A04.ECR(this);
        }
    }

    public final Class Bne() {
        return this.A00.Bne();
    }

    public final S0B CDi() {
        return this.A03;
    }

    public final Object get() {
        return this.A00.get();
    }

    public final int getSize() {
        return this.A00.getSize();
    }
}
