package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.Ox3  reason: case insensitive filesystem */
public final /* synthetic */ class C72143Ox3 implements AnonymousClass67Q {
    public final /* synthetic */ NAE A00;
    public final /* synthetic */ MYb A01;
    public final /* synthetic */ OMq A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C72143Ox3(NAE nae, MYb mYb, OMq oMq, List list) {
        this.A01 = mYb;
        this.A00 = nae;
        this.A03 = list;
        this.A02 = oMq;
    }

    public final void Eyr(AnonymousClass67Z r10) {
        MYb mYb = this.A01;
        NAE nae = this.A00;
        List list = this.A03;
        OMq oMq = this.A02;
        AnonymousClass68L ASa = nae.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        C66582MXn.A1E(ASa, new C71651OoW(12, list, A0G, nae), A0G);
        A0G.addResultCallback(new C71664Ooj(3, mYb, oMq, r10, list));
    }
}
