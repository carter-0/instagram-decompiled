package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OxA  reason: case insensitive filesystem */
public final class C72150OxA implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NAT A02;
    public final /* synthetic */ String A03;

    public C72150OxA(NAT nat, String str, int i, int i2) {
        this.A02 = nat;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    public final void Eyr(AnonymousClass67Z r8) {
        0qQ.A0B(r8, 0);
        NAT nat = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        String str = this.A03;
        AnonymousClass68L ASa = nat.mMailboxApiHandleMetaProvider.ASa(3);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        C66582MXn.A1E(ASa, new C71667Oom(A0G, nat, str, i, i2), A0G);
        A0G.addResultCallback(new C71721Opf(r8, 29));
    }
}
