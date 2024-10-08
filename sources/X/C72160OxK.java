package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OxK  reason: case insensitive filesystem */
public final /* synthetic */ class C72160OxK implements AnonymousClass67Q {
    public final /* synthetic */ NAE A00;
    public final /* synthetic */ OMq A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C72160OxK(NAE nae, OMq oMq, String str, String str2, boolean z, boolean z2) {
        this.A00 = nae;
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A05 = z2;
        this.A01 = oMq;
    }

    public final void Eyr(AnonymousClass67Z r13) {
        NAE nae = this.A00;
        String str = this.A02;
        boolean z = this.A04;
        String str2 = this.A03;
        boolean z2 = this.A05;
        OMq oMq = this.A01;
        MYb mYb = MYb.A0M;
        String obj = AnonymousClass1Q2.A02().toString();
        String A022 = 0kS.A02(C60960kU.A00, z2);
        AnonymousClass68L ASa = nae.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        MailboxFutureImpl A0G2 = C66580MXl.A0G(ASa);
        if (!ASa.EJd(new C71691OpB(nae, A0G2, A0G, str, obj, str2, A022, z))) {
            A0G.cancel(false);
            A0G2.cancel(false);
        }
        A0G2.addResultCallback(new C71723Oph(45, (Object) oMq, (Object) r13));
    }
}
