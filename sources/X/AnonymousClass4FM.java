package X;

import java.io.IOException;

/* renamed from: X.4FM  reason: invalid class name */
public final class AnonymousClass4FM extends 0ng {
    public final /* synthetic */ 2O6 A00;
    public final /* synthetic */ 2O3 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4FM(2O6 r2, 2O3 r3) {
        super(321);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        2O3 r1 = this.A01;
        try {
            String A002 = AnonymousClass2O5.A00(this.A00);
            1Av A003 = 1Au.A00(r1.A00);
            A003.A7d.Epx(A003, A002, 1Av.A8a[65]);
        } catch (IOException e) {
            0KC.A05(2O3.class, "failed to save LocalReelSeenState json", e);
        }
    }
}
