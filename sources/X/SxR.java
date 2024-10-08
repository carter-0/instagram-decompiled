package X;

import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbbe;

public final /* synthetic */ class SxR implements C13636Te2 {
    public final /* synthetic */ GetSignInIntentRequest A00;
    public final /* synthetic */ QpS A01;

    public /* synthetic */ SxR(GetSignInIntentRequest getSignInIntentRequest, QpS qpS) {
        this.A01 = qpS;
        this.A00 = getSignInIntentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        GetSignInIntentRequest getSignInIntentRequest = this.A00;
        zbbe zbbe = new zbbe((C365498nD) obj2);
        zba zba = (zba) ((BaseGmsClient) obj).A03();
        AnonymousClass3Qk.A02(getSignInIntentRequest);
        int A03 = AnonymousClass0fD.A03(-952634903);
        zba.A01(zba.A00(zbbe, getSignInIntentRequest, zba), 3);
        AnonymousClass0fD.A0A(-817663096, A03);
    }
}
