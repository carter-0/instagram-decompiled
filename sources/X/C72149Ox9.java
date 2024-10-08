package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Ox9  reason: case insensitive filesystem */
public final class C72149Ox9 implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NAT A02;
    public final /* synthetic */ boolean A03;

    public C72149Ox9(NAT nat, int i, int i2, boolean z) {
        this.A02 = nat;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    public final void Eyr(AnonymousClass67Z r9) {
        0qQ.A0B(r9, 0);
        NAT nat = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        AnonymousClass68L ASa = nat.mMailboxApiHandleMetaProvider.ASa(3);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        C66582MXn.A1E(ASa, new C71677Oow(i, i2, 1, A0G, nat, z), A0G);
        A0G.addResultCallback(new C71721Opf(r9, 28));
    }
}
