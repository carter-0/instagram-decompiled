package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Aaw  reason: case insensitive filesystem */
public final class C40363Aaw implements C41818B1y {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ C381779cJ A03;

    public final void Dgl(boolean z, String str) {
    }

    public C40363Aaw(Context context, UserSession userSession, DirectShareTarget directShareTarget, C381779cJ r4) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = directShareTarget;
        this.A03 = r4;
    }

    public final void Ddm(boolean z, String str) {
        if (z) {
            String str2 = str;
            if (str != null) {
                AGu aGu = C39622A2m.A02;
                AGu.A00(this.A00, this.A01, this.A02, this.A03, "MultiMediaEditController_sendMessageMsys", str2);
                return;
            }
        }
        C59689JTv.A0A(this.A00, "error");
    }
}
