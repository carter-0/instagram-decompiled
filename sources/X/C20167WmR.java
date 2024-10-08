package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.WmR  reason: case insensitive filesystem */
public final class C20167WmR implements Runnable {
    public final /* synthetic */ C16491Uvm A00;
    public final /* synthetic */ AnonymousClass7N9 A01;

    public C20167WmR(C16491Uvm uvm, AnonymousClass7N9 r2) {
        this.A01 = r2;
        this.A00 = uvm;
    }

    public final void run() {
        AtomicReference atomicReference;
        C239973Ja r3;
        AnonymousClass7N9 r6 = this.A01;
        C226442gp r7 = r6.A01;
        C16491Uvm uvm = this.A00;
        int ordinal = uvm.ordinal();
        if (ordinal == 0) {
            atomicReference = r6.A07;
        } else if (ordinal == 1) {
            atomicReference = r6.A06;
        } else {
            throw new RuntimeException();
        }
        if (uvm == C16491Uvm.LARGE) {
            r3 = VKX.A00;
        } else {
            r3 = VKX.A01;
        }
        AnonymousClass2h0 r2 = r6.A00;
        C64383Lb0 lb0 = new C64383Lb0(0, uvm, r6);
        AnonymousClass9DH r1 = (AnonymousClass9DH) atomicReference.get();
        if (r1 == null) {
            r1 = r7.A01(r3, r2, lb0);
            if (!1FH.A00((Object) null, r1, atomicReference)) {
                r1 = (AnonymousClass9DH) atomicReference.get();
            }
        }
        C71532dv r22 = (C71532dv) r1.A00();
        if (r22 != null) {
            r6.A04.execute(new C20281WoW(r22, uvm, r6));
        }
    }
}
