package X;

public final class WTA implements AnonymousClass11X {
    public final /* synthetic */ C61082JwK A00;
    public final /* synthetic */ AnonymousClass3JC A01;
    public final /* synthetic */ C19138WMu A02;
    public final /* synthetic */ C273664mz A03;

    public final String getName() {
        return AnonymousClass000.A00(2406);
    }

    public final int getRunnableId() {
        return 715233643;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public final void run() {
    }

    public WTA(C61082JwK jwK, AnonymousClass3JC r2, C19138WMu wMu, C273664mz r4) {
        this.A02 = wMu;
        this.A03 = r4;
        this.A00 = jwK;
        this.A01 = r2;
    }

    public final void onFinish() {
        AnonymousClass2mA r0;
        C19138WMu wMu = this.A02;
        C321636uV r5 = wMu.A06;
        r5.DQ7("profile_on_data", (Long) null);
        Integer num = wMu.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            C324366zA r4 = wMu.A04.A03;
            C273664mz r3 = this.A03;
            r4.A07 = r3.A04;
            r4.A0A = r3.A07;
            r4.A09 = r3.A02;
            r4.A08 = r3.A01;
        }
        C273664mz r8 = this.A03;
        boolean z = wMu.A08;
        boolean z2 = wMu.A09;
        C294265mA r9 = wMu.A07;
        r5.DQA(wMu.A01, this.A00, r8, r9, z, z2);
        if (wMu.A00 == num2 && !z && (r0 = wMu.A05) != null) {
            r0.A02();
        }
        if (wMu.A00 == num2) {
            wMu.A00 = AnonymousClass05K.A01;
        }
        if (this.A01.A00.isFinal) {
            wMu.A04.A03.A00(AnonymousClass05K.A0C);
            r5.DQ6(r9);
        }
    }
}
