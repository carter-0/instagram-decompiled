package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Owo  reason: case insensitive filesystem */
public final /* synthetic */ class C72129Owo implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C68313NAa A01;
    public final /* synthetic */ Long A02;

    public /* synthetic */ C72129Owo(C68313NAa nAa, Long l, int i) {
        this.A02 = l;
        this.A01 = nAa;
        this.A00 = i;
    }

    public final void Eyr(AnonymousClass67Z r10) {
        Long l = this.A02;
        C68313NAa nAa = this.A01;
        int i = this.A00;
        MYb mYb = MYb.A0M;
        long longValue = l.longValue();
        if (longValue != 0) {
            Integer valueOf = Integer.valueOf(i);
            C71722Opg A002 = C71722Opg.A00(r10, 60);
            AnonymousClass68L ASa = nAa.mMailboxApiHandleMetaProvider.ASa(0);
            MailboxFutureImpl A0J = C66581MXm.A0J(ASa, A002);
            C66582MXn.A1E(ASa, new C71661Oog(2, longValue, nAa, valueOf, A0J), A0J);
        }
    }
}
