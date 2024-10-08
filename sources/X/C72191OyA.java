package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.OyA  reason: case insensitive filesystem */
public final class C72191OyA implements AnonymousClass0lh {
    public final UserSession A00;
    public final Map A01 = Collections.synchronizedMap(AnonymousClass7TE.A1E());
    public final Map A02 = Collections.synchronizedMap(AnonymousClass7TE.A1E());
    public final C74541Pwa A03;

    public C72191OyA(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        C74541Pwa pwa = C66608MYu.A01;
        this.A03 = C66607MYt.A00(userSession).A00(C254923tH.ACT);
    }

    public final void A00(MsysThreadId msysThreadId, String str, String str2, String str3) {
        String str4;
        Map A0y;
        MsysThreadId msysThreadId2 = msysThreadId;
        String str5 = str;
        AnonymousClass7TG.A1N(msysThreadId2, str5);
        C74541Pwa pwa = this.A03;
        String str6 = str2;
        if (pwa == null || (str4 = pwa.ARp(str6)) == null) {
            str4 = str6;
        }
        UserSession userSession = this.A00;
        String str7 = str3;
        C70728OHx oHx = new C70728OHx((OGA) null, str5, str4, userSession.A06, AnonymousClass7TF.A0Q(userSession).getUsername(), JTP.A0o(AnonymousClass7TF.A0Q(userSession).A0D()), str7, DbY.A04(AnonymousClass7TF.A0Q(userSession).BST()), System.currentTimeMillis());
        long j = msysThreadId2.A00;
        Map map = this.A02;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            A0y = (Map) map.get(valueOf);
            if (A0y != null) {
                A0y.put(str5, oHx);
            } else {
                return;
            }
        } else {
            A0y = C66582MXn.A0y(str5, oHx);
        }
        map.put(valueOf, A0y);
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
        this.A02.clear();
    }
}
