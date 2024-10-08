package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PEf  reason: case insensitive filesystem */
public final class C72652PEf implements C74416PuW {
    public final /* synthetic */ C67098MiI A00;
    public final /* synthetic */ C74396PuC A01;
    public final /* synthetic */ C254743sy A02;
    public final /* synthetic */ boolean A03;

    public C72652PEf(C67098MiI miI, C74396PuC puC, C254743sy r3, boolean z) {
        this.A00 = miI;
        this.A02 = r3;
        this.A03 = z;
        this.A01 = puC;
    }

    public final void D84() {
        C74396PuC puC;
        C67098MiI miI = this.A00;
        C254743sy r1 = this.A02;
        C67098MiI.A00(miI, r1, true);
        miI.AOc(r1);
        0sP r0 = miI.A00;
        UserSession userSession = miI.A02;
        AnonymousClass3U9 A022 = C66647MaG.A02((2Dm) r0.invoke(userSession), r1);
        if (A022 != null && A022.C6a() == 29) {
            C313756gx A002 = C313746gw.A00(userSession);
            int AdN = A022.AdN();
            A002.A0J(AnonymousClass05K.A00, A022.C6C(), A022.C6k(), AdN);
        }
        if (this.A03 && (puC = this.A01) != null) {
            puC.AOG();
        }
    }

    public final void onDismiss() {
        C67098MiI.A00(this.A00, this.A02, false);
    }
}
