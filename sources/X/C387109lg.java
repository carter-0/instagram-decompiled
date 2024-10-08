package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.9lg  reason: invalid class name and case insensitive filesystem */
public final class C387109lg extends 0vM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C258943zt A01;
    public final /* synthetic */ OdinContext A02;
    public final /* synthetic */ UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387109lg(Context context, C258943zt r8, OdinContext odinContext, UserSession userSession) {
        super("ig_story_predict_and_cache", 1109658103, 5, false, false);
        this.A02 = odinContext;
        this.A01 = r8;
        this.A03 = userSession;
        this.A00 = context;
    }

    public final void loggedRun() {
        OdinContext odinContext = this.A02;
        C258943zt r8 = this.A01;
        UserSession userSession = this.A03;
        Context context = this.A00;
        AnonymousClass0Gt r11 = AnonymousClass0Gt.A00;
        0qQ.A07(r11);
        C2604745u r5 = (C2604745u) C2604645t.A00(userSession).A02.getValue();
        C258733zY r6 = new C258733zY(userSession);
        C60400gq r12 = r6.A00;
        if (r12 != null && r12.BON(36599254576795098L) > 0) {
            long A002 = r5.A00("last_prediction_time", -1);
            long now = r11.now() - A002;
            r12.BON(36599254576860635L);
            if (A002 == -1 || now > r12.BON(36599254576860635L) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                AnonymousClass40G E3W = C258753za.A00(context, r6, userSession).E3W(r8, odinContext);
                if (E3W.A02) {
                    Number number = (Number) E3W.A00;
                    number.doubleValue();
                    r5.A04("prediction_score", (float) number.doubleValue());
                    r5.A05("last_prediction_time", System.currentTimeMillis());
                }
            }
        }
    }
}
