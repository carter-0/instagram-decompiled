package X;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbav;

public final /* synthetic */ class SxP implements C13636Te2 {
    public final /* synthetic */ SavePasswordRequest A00;
    public final /* synthetic */ QpQ A01;

    public /* synthetic */ SxP(SavePasswordRequest savePasswordRequest, QpQ qpQ) {
        this.A01 = qpQ;
        this.A00 = savePasswordRequest;
    }

    public final void accept(Object obj, Object obj2) {
        SavePasswordRequest savePasswordRequest = this.A00;
        zbav zbav = new zbav((C365498nD) obj2);
        zba zba = (zba) ((BaseGmsClient) obj).A03();
        AnonymousClass3Qk.A02(savePasswordRequest);
        int A03 = AnonymousClass0fD.A03(-2047719763);
        zba.A01(zba.A00(zbav, savePasswordRequest, zba), 2);
        AnonymousClass0fD.A0A(1276285557, A03);
    }
}
