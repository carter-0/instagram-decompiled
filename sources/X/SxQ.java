package X;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbbc;

public final /* synthetic */ class SxQ implements C13636Te2 {
    public final /* synthetic */ BeginSignInRequest A00;
    public final /* synthetic */ QpS A01;

    public /* synthetic */ SxQ(BeginSignInRequest beginSignInRequest, QpS qpS) {
        this.A01 = qpS;
        this.A00 = beginSignInRequest;
    }

    public final void accept(Object obj, Object obj2) {
        BeginSignInRequest beginSignInRequest = this.A00;
        zbbc zbbc = new zbbc((C365498nD) obj2);
        zba zba = (zba) ((BaseGmsClient) obj).A03();
        AnonymousClass3Qk.A02(beginSignInRequest);
        int A03 = AnonymousClass0fD.A03(100747770);
        zba.A01(zba.A00(zbbc, beginSignInRequest, zba), 1);
        AnonymousClass0fD.A0A(895529720, A03);
    }
}
