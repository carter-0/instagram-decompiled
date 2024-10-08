package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqf  reason: case insensitive filesystem */
public final class C65286Lqf implements C66486MTp {
    public final Context A00;
    public final UserSession A01;
    public final DirectShareTarget A02;
    public final C381779cJ A03;
    public final String A04;

    public C65286Lqf(Context context, UserSession userSession, DirectShareTarget directShareTarget, C381779cJ r5, String str) {
        0qQ.A0B(str, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = directShareTarget;
        this.A03 = r5;
    }

    public final void AIz(AnonymousClass3Q2 r7) {
        AGu aGu = C39622A2m.A02;
        Context context = this.A00;
        UserSession userSession = this.A01;
        String str = r7.A33;
        if (str != null) {
            AGu.A00(context, userSession, this.A02, this.A03, "MsysPostMediaConfigureInstruction_photo", str);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String BbR() {
        return this.A04;
    }
}
