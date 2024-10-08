package X;

/* renamed from: X.TAm  reason: case insensitive filesystem */
public final /* synthetic */ class C12847TAm implements Runnable {
    public final /* synthetic */ Sg7 A00;

    public /* synthetic */ C12847TAm(Sg7 sg7) {
        this.A00 = sg7;
    }

    public final void run() {
        Sg7 sg7 = this.A00;
        if (sg7.A00 == 0) {
            sg7.A00 = 1;
            AnonymousClass389.A00();
            C255373u1 r6 = sg7.A08;
            Sg6 sg6 = sg7.A06;
            if (sg6.A04.A04((C282915Fg) null, sg7.A05)) {
                SHJ shj = sg6.A08;
                synchronized (shj.A01) {
                    AnonymousClass389.A00();
                    shj.A00(r6);
                    TEu tEu = new TEu(r6, shj);
                    shj.A03.put(r6, tEu);
                    shj.A02.put(r6, sg7);
                    ((AnonymousClass38K) shj.A00).A00.postDelayed(tEu, 600000);
                }
                return;
            }
            Sg7.A00(sg7);
            return;
        }
        AnonymousClass389.A00();
    }
}
