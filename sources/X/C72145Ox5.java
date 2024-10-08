package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Ox5  reason: case insensitive filesystem */
public final /* synthetic */ class C72145Ox5 implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C68313NAa A03;

    public /* synthetic */ C72145Ox5(C68313NAa nAa, int i, int i2, long j) {
        this.A03 = nAa;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void Eyr(AnonymousClass67Z r10) {
        C68313NAa nAa = this.A03;
        long j = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        C71626Oo7 oo7 = new C71626Oo7(r10);
        AnonymousClass68L ASa = nAa.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0J = C66581MXm.A0J(ASa, oo7);
        C66582MXn.A1E(ASa, new C71680Ooz(0, j, A0J, nAa, valueOf, valueOf2), A0J);
    }
}
