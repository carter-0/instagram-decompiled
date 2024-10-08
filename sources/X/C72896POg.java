package X;

import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import java.util.Arrays;

/* renamed from: X.POg  reason: case insensitive filesystem */
public final class C72896POg implements C13760TgW {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ RtcCallIntentHandlerActivity A01;

    public C72896POg(UserSession userSession, RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity) {
        this.A01 = rtcCallIntentHandlerActivity;
        this.A00 = userSession;
    }

    public final void DWo() {
        C72767PJf pJf;
        C71004OWb.A00.A00("RtcCallIntentHandlerActivity", "Required permission was denied");
        RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity = this.A01;
        C74496Pvq pvq = rtcCallIntentHandlerActivity.A00;
        if ((pvq instanceof C72767PJf) && (pJf = (C72767PJf) pvq) != null && pJf.A08 != null && pJf.A0U) {
            SJD sjd = rtcCallIntentHandlerActivity.A01;
            if (sjd == null) {
                0qQ.A0F("permissionsPresenter");
                throw AnonymousClass00P.createAndThrow();
            } else if (1DL.A08(sjd.A04.A01, (String[]) Arrays.copyOf(new String[]{"android.permission.RECORD_AUDIO"}, 1))) {
                UserSession userSession = this.A00;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36323667998879086L) && !182.A06(r2, userSession, 36323667999599991L)) {
                    C70902OQu.A00(pJf);
                }
            }
        }
    }

    public final void DWp() {
        C74496Pvq pvq = this.A01.A00;
        if (pvq != null) {
            C70902OQu.A00(pvq);
        }
    }
}
