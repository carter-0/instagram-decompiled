package X;

import android.content.Context;

public final class PSI implements 1aV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass7L7 A01;

    public PSI(Context context, AnonymousClass7L7 r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C72176Oxl) {
            0wb.A07("DirectSendController_sendMediaForSharedAlbum", (Throwable) C66996MgU.A01(prM));
            this.A01.A06.invoke();
            return;
        }
        C310336ap A0a = DbS.A0a();
        DbS.A19(this.A00, A0a, 2131973636);
        A0a.A06();
        DbY.A1N(A0a);
    }
}
