package X;

public final class CHE extends 1P0 {
    public final DQq A00;
    public final C228742mF A01;

    public CHE(DQq dQq, C228742mF r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = dQq;
    }

    public final void A00(CFN cfn) {
        int A03 = AnonymousClass0fD.A03(1772782354);
        0qQ.A0B(cfn, 0);
        C228742mF r2 = this.A01;
        r2.A01 = cfn;
        r2.A02 = Long.valueOf(System.currentTimeMillis());
        this.A00.DoQ(cfn);
        if (!cfn.A00) {
            r2.A00++;
        } else {
            r2.A00 = 0;
        }
        AnonymousClass0fD.A0A(1861782810, A03);
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -629089644);
        this.A00.onFail(r4);
        this.A01.A00++;
        AnonymousClass0fD.A0A(775682965, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1949452005);
        this.A01.A03 = false;
        AnonymousClass0fD.A0A(-1546073858, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1257410399);
        A00((CFN) obj);
        AnonymousClass0fD.A0A(-588531961, A03);
    }
}
