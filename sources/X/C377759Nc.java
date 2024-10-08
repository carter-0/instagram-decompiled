package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Nc  reason: invalid class name and case insensitive filesystem */
public final class C377759Nc extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377759Nc(Context context, UserSession userSession) {
        super(1927308600, 3, false, false);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void run() {
        long j;
        try {
            UserSession userSession = this.A01;
            C10858RzJ rzJ = (C10858RzJ) userSession.A01(C10858RzJ.class, new TTP(12, this.A00, userSession));
            C2604745u r5 = rzJ.A07;
            AnonymousClass0eM r6 = rzJ.A0A;
            AnonymousClass0JP r4 = (AnonymousClass0JP) AnonymousClass7TE.A14(r6);
            AnonymousClass0eM r3 = rzJ.A08;
            C60400gq r2 = ((C258733zY) r3.getValue()).A00;
            if (r2 != null) {
                j = r2.BON(36599254578564574L);
            } else {
                j = 0;
            }
            if (AnonymousClass463.A00(r4, r5, j)) {
                ((AnonymousClass400) rzJ.A09.getValue()).A00((OdinContext) null);
                C60400gq r22 = ((C258733zY) r3.getValue()).A00;
                if (r22 != null && r22.BON(36599254578564574L) > 0) {
                    r5.A05("last_warm_up_ts", ((AnonymousClass0JP) AnonymousClass7TE.A14(r6)).now());
                }
            }
        } catch (Exception e) {
            AnonymousClass7TG.A1I(0wj.A01, AnonymousClass000.A00(937), e, 1011495295);
        }
    }
}
