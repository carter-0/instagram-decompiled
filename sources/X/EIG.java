package X;

import com.instagram.registration.model.RegFlowExtras;

public final class EIG extends 0ng {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0aP A01;
    public final /* synthetic */ C47698EDh A02;
    public final /* synthetic */ RegFlowExtras A03;
    public final /* synthetic */ Integer A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIG(AnonymousClass4DH r2, AnonymousClass0aP r3, C47698EDh eDh, RegFlowExtras regFlowExtras, Integer num) {
        super(707);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = regFlowExtras;
        this.A04 = num;
        this.A02 = eDh;
    }

    public final void run() {
        AnonymousClass4DH r2 = this.A00;
        AnonymousClass0aP r4 = this.A01;
        RegFlowExtras regFlowExtras = this.A03;
        Integer num = this.A04;
        C47698EDh eDh = this.A02;
        1OC A002 = C49107EpW.A00(r2.requireContext(), r4, regFlowExtras, num, (String) null, (String) null);
        A002.A00 = eDh;
        r2.schedule(A002);
    }
}
