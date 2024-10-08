package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.Ov0  reason: case insensitive filesystem */
public final class C72026Ov0 implements AnonymousClass68Z {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C72026Ov0(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        CompletableFuture completableFuture;
        GN2 gn2;
        int i;
        switch (this.A00) {
            case 0:
                0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications fetchingOtDevices");
                OUY ouy = OUY.A00;
                C67712MtR mtR = (C67712MtR) this.A01;
                completableFuture = ouy.A00(mtR.A04);
                gn2 = new GN2(10, mtR, obj, this.A02);
                i = 9;
                break;
            case 1:
                0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications fetchingOtDevices");
                OUY ouy2 = OUY.A00;
                C67711MtQ mtQ = (C67711MtQ) this.A01;
                completableFuture = ouy2.A00(mtQ.A06);
                gn2 = new GN2(11, mtQ, obj, this.A02);
                i = 10;
                break;
            default:
                OVP ovp = (OVP) this.A01;
                boolean z = this.A02;
                C257443xP r6 = (C257443xP) obj;
                if (!r6.A06() || !((1XR) r6.A03()).isOk()) {
                    User A0j = DbT.A0j(ovp.A04);
                    A0j.A03.Ept(DbT.A0l(z));
                    C72176Oxl oxl = new C72176Oxl("error");
                    ovp.A00.accept(OVP.A00(ovp));
                    return oxl;
                }
                17i r2 = ovp.A01;
                UserSession userSession = ovp.A04;
                r2.A03(DbT.A0j(userSession));
                FA1.A01.A02(userSession);
                return new C66990MgO(OVP.A00(ovp));
        }
        return completableFuture.thenAccept(new C73452Pcu(i, (0sP) gn2));
    }
}
