package X;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbap;

public final /* synthetic */ class SxO implements C13636Te2 {
    public final /* synthetic */ AuthorizationRequest A00;
    public final /* synthetic */ C8365QpN A01;

    public /* synthetic */ SxO(AuthorizationRequest authorizationRequest, C8365QpN qpN) {
        this.A01 = qpN;
        this.A00 = authorizationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        AuthorizationRequest authorizationRequest = this.A00;
        zbap zbap = new zbap((C365498nD) obj2);
        zba zba = (zba) ((BaseGmsClient) obj).A03();
        AnonymousClass3Qk.A02(authorizationRequest);
        int A03 = AnonymousClass0fD.A03(2126270007);
        zba.A01(zba.A00(zbap, authorizationRequest, zba), 1);
        AnonymousClass0fD.A0A(-2061165377, A03);
    }
}
