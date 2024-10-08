package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.PEh  reason: case insensitive filesystem */
public final class C72654PEh implements B2B {
    public final OIA A00;
    public final C62320sa A01;

    public C72654PEh(Activity activity, Context context, UserSession userSession, C331697Sa r17, C329067Hl r18, AnonymousClass7I2 r19, Integer num, String str, C62320sa r22, boolean z) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1P(userSession2, context);
        C331697Sa r4 = r17;
        AnonymousClass7I2 r7 = r19;
        AnonymousClass7TG.A1S(r7, r4);
        this.A01 = r22;
        this.A00 = new OIA(activity, context, userSession2, r4, (AnonymousClass7L0) null, r18, r7, num, str, z, false, false);
    }

    public final AnonymousClass4DH AM6(AnonymousClass37D r8) {
        OIA oia = this.A00;
        DirectShareTarget A002 = oia.A03.A00();
        if (A002 == null) {
            return null;
        }
        this.A01.invoke();
        return 1as.A04.A02.A05(oia.A02, A002, 0, 0, false, true);
    }

    public final OIA AcR() {
        return this.A00;
    }
}
