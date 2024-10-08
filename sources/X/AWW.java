package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

public final class AWW implements 2IR {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ C381779cJ A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ String A05;

    public final void onFailure(Throwable th) {
    }

    public AWW(Context context, UserSession userSession, DirectShareTarget directShareTarget, C381779cJ r4, AnonymousClass3Q2 r5, String str) {
        this.A04 = r5;
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = str;
        this.A02 = directShareTarget;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Boolean bool = (Boolean) obj;
        String str = this.A04.A3V;
        if (bool == null || !bool.booleanValue() || str == null) {
            C59689JTv.A0A(this.A00, "error");
            0wb.A03(this.A05, "sendVideoToMsys saveTask failed.");
            return;
        }
        AGu aGu = C39622A2m.A02;
        AGu.A01(this.A00, this.A01, this.A02, this.A03, this.A05, str);
    }
}
