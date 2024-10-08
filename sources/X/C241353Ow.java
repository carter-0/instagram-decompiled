package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Ow  reason: invalid class name and case insensitive filesystem */
public final class C241353Ow extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C241353Ow(UserSession userSession, Context context) {
        super(1927308600, 3, false, false);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void run() {
        long j;
        try {
            UserSession userSession = this.A01;
            C2604745u r5 = (C2604745u) C2604645t.A00(userSession).A02.getValue();
            C258843zj A002 = AnonymousClass4Iw.A00(this.A00, userSession);
            AnonymousClass0JP A003 = A002.A00();
            AnonymousClass0eM r3 = A002.A01;
            C60400gq r2 = ((C258733zY) r3.getValue()).A00;
            if (r2 != null) {
                j = r2.BON(36599254578564574L);
            } else {
                j = 0;
            }
            if (AnonymousClass463.A00(A003, r5, j)) {
                ((AnonymousClass400) A002.A04.getValue()).A00((OdinContext) null);
                C60400gq r22 = ((C258733zY) r3.getValue()).A00;
                if (r22 != null && r22.BON(36599254578564574L) > 0) {
                    r5.A05("last_warm_up_ts", A002.A00().now());
                }
            }
        } catch (Exception e) {
            0f9 AEf = 0wj.A01.AEf(AnonymousClass000.A00(937), 1011495295);
            AEf.ERJ(e);
            AEf.report();
        }
    }
}
