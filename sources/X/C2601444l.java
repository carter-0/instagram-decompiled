package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$ASYNC_ADS;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.44l  reason: invalid class name and case insensitive filesystem */
public final class C2601444l extends GraphQLSubscriptionHandler {
    public final 1Ng A00;
    public final UserSession A01;

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return false;
    }

    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        IllegalStateException illegalStateException;
        String str4;
        0xI r1;
        0qQ.A0B(str3, 2);
        try {
            C55445Hhp hhp = HUO.parseFromJson(16P.A00(str3)).A00;
            if (hhp == null || (str4 = hhp.A00) == null) {
                illegalStateException = new IllegalStateException("Required value was null.");
            } else {
                0c5 r0 = 0c9.A04;
                UserSession userSession = this.A01;
                C43846CFm parseFromJson = C44595ChT.parseFromJson(r0.A01(userSession, str4));
                0qQ.A0A(parseFromJson);
                List list = parseFromJson.A01;
                if (list == null || list.isEmpty()) {
                    DLog.e(DLogTag$ASYNC_ADS.INSTANCE, "[AA] Empty response", new Object[0]);
                    r1 = new C254523sc(XYF.A00, 002.A0R("instagram_ad_async_ad_", AnonymousClass000.A00(1298))).A00();
                    if (userSession == null) {
                        illegalStateException = new IllegalStateException("Required value was null.");
                    }
                } else {
                    String str5 = parseFromJson.A00;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    1Ng r12 = this.A00;
                    if (str5 != null) {
                        r12.A00(new C45958DGn(list));
                        r1 = new C254523sc(XYF.A00, 002.A0R("instagram_ad_async_ad_", Pxd.A00(740))).A00();
                        if (userSession == null) {
                            illegalStateException = new IllegalStateException("Required value was null.");
                        }
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                    }
                }
                C60510iO.A00(userSession).EHF(r1);
                return;
            }
            throw illegalStateException;
        } catch (IOException unused) {
            DLog.e(DLogTag$ASYNC_ADS.INSTANCE, "[AA] Can't parse realtime response", new Object[0]);
        }
    }

    public C2601444l(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }
}
