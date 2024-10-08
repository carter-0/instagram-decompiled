package X;

/* renamed from: X.9T1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9T1 implements Runnable {
    public final /* synthetic */ C378369Pn A00;

    public /* synthetic */ AnonymousClass9T1(C378369Pn r1) {
        this.A00 = r1;
    }

    public final void run() {
        Runnable runnable;
        C378459Pw r0;
        C378369Pn r3 = this.A00;
        AnonymousClass3Q2 r1 = r3.A09;
        if (r1 != null) {
            r3.A08(r1, r3.A04);
        }
        C41838B2t b2t = r3.A07;
        if (b2t != null) {
            r3.A06(b2t);
        } else {
            Runnable runnable2 = r3.A0C;
            if (!(runnable2 == null || (runnable = r3.A0D) == null)) {
                r3.A05((A67) null, runnable2, runnable, (Runnable) null, (Runnable) null);
            }
        }
        for (C352278Cs A07 : r3.A0N) {
            r3.A07(A07);
        }
        Runnable runnable3 = r3.A0B;
        if (runnable3 != null) {
            r3.A0B = runnable3;
            C378459Pw r12 = r3.A08;
            if (r12 != null) {
                r12.A06 = new AnonymousClass9T2(r3, runnable3);
            }
        }
        C359318cb r13 = r3.A06;
        if (r13 != null) {
            r3.A06 = r13;
            C378459Pw r02 = r3.A08;
            if (r02 != null) {
                r02.A03 = r13;
            }
        }
        C379139Sq r14 = r3.A05;
        if (r14 != null) {
            r3.A05 = r14;
            C378459Pw r03 = r3.A08;
            if (r03 != null) {
                r03.A02 = r14;
            }
        }
        if (r3.A0E && (r0 = r3.A08) != null) {
            r0.A0O();
        }
    }
}
