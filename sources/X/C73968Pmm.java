package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.Pmm  reason: case insensitive filesystem */
public final class C73968Pmm extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TransportPayload A01;
    public final /* synthetic */ C74551Pwk A02;
    public final /* synthetic */ 1OS A03;
    public final /* synthetic */ C66638Ma7 A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73968Pmm(TransportPayload transportPayload, C74551Pwk pwk, 1OS r4, C66638Ma7 ma7, Long l, String str, int i) {
        super(1);
        this.A04 = ma7;
        this.A06 = str;
        this.A05 = l;
        this.A01 = transportPayload;
        this.A00 = i;
        this.A03 = r4;
        this.A02 = pwk;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MailboxFeature mailboxFeature = (MailboxFeature) obj;
        0qQ.A0B(mailboxFeature, 0);
        C66638Ma7 ma7 = this.A04;
        C70833ONf oNf = ma7.A02;
        String str = this.A06;
        oNf.A02(str);
        long longValue = this.A05.longValue();
        byte[] A0H = this.A01.A0H();
        int i = this.A00;
        C71651OoW ooW = new C71651OoW(19, ma7, this.A03, this.A02);
        AnonymousClass68L A0F = C66580MXl.A0F(mailboxFeature, 2);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0F, ooW);
        C66582MXn.A1E(A0F, new C71686Op5(mailboxFeature, A0J, A0H, str, i, 0, longValue), A0J);
        return C60340gF.A00;
    }
}
