package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.Ox4  reason: case insensitive filesystem */
public final /* synthetic */ class C72144Ox4 implements AnonymousClass67Q {
    public final /* synthetic */ C68313NAa A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C72144Ox4(C68313NAa nAa, Long l, Long l2, List list) {
        this.A00 = nAa;
        this.A01 = l;
        this.A02 = l2;
        this.A03 = list;
    }

    public final void Eyr(AnonymousClass67Z r11) {
        C68313NAa nAa = this.A00;
        Long l = this.A01;
        Long l2 = this.A02;
        List list = this.A03;
        MYb mYb = MYb.A0M;
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        C71722Opg A002 = C71722Opg.A00(r11, 69);
        AnonymousClass68L ASa = nAa.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0J = C66581MXm.A0J(ASa, A002);
        C66582MXn.A1E(ASa, new C71678Oox(2, longValue, longValue2, list, A0J, nAa), A0J);
    }
}
