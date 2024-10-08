package X;

import android.app.PendingIntent;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;

public abstract class O2H {
    public static final PendingIntent A00(Context context, UserSession userSession, RtcConnectionEntity rtcConnectionEntity) {
        RtcConnectionEntity.LiveInviteConnectionEntity liveInviteConnectionEntity;
        String str;
        RtcJoinCallArgs rtcJoinCallArgs;
        RtcConnectionEntity rtcConnectionEntity2 = rtcConnectionEntity;
        Context context2 = context;
        0qQ.A0B(context, 1);
        if (rtcConnectionEntity2 instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity2;
            C69277Nid nid = rtcCallConnectionEntity.A01;
            1oz r6 = AnonymousClass386.A00().A00;
            String str2 = rtcCallConnectionEntity.A0D;
            if (str2 == null) {
                str2 = "";
            }
            boolean z = rtcCallConnectionEntity.A0N;
            String str3 = rtcCallConnectionEntity.A0A;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = rtcCallConnectionEntity.A0C;
            if (str4 == null) {
                str4 = "";
            }
            RtcCallAudience A01 = r6.A01(str2, str3, str4, rtcCallConnectionEntity.A0B, z);
            C331537Rj r2 = C331537Rj.PUSH_NOTIFICATION;
            String A00 = rtcCallConnectionEntity.A00();
            if (A00 == null) {
                A00 = "";
            }
            RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
            String str5 = rtcCallConnectionEntity.A0G;
            String A012 = C70907OQz.A01(rtcCallConnectionEntity);
            rtcJoinCallArgs = new RtcJoinCallArgs(nid, rtcCallConnectionEntity.A02, A01, (RtcCallFunnelSessionId) null, rtcCallKey, new RtcCallSource((C69465Nm9) null, r2, new RtcThreadKey(A00, (String) null, (String) null, (String) null, (String) null)), (RtcIgNotification) null, str5, A012, 1910377639, !rtcCallConnectionEntity.A0L);
        } else {
            C69277Nid nid2 = C69277Nid.NO_E2EE;
            1oz r10 = AnonymousClass386.A00().A00;
            if (rtcConnectionEntity2 instanceof RtcConnectionEntity.LiveInviteConnectionEntity) {
                liveInviteConnectionEntity = (RtcConnectionEntity.LiveInviteConnectionEntity) rtcConnectionEntity2;
            } else {
                liveInviteConnectionEntity = null;
            }
            if (liveInviteConnectionEntity == null || (str = liveInviteConnectionEntity.A06) == null) {
                str = "";
            }
            RtcCallAudience A013 = r10.A01("", "", "", str, false);
            C331537Rj r22 = C331537Rj.PUSH_NOTIFICATION;
            String C6C = rtcConnectionEntity2.C6C();
            if (C6C == null) {
                C6C = "";
            }
            RtcCallSource rtcCallSource = new RtcCallSource((C69465Nm9) null, r22, new RtcThreadKey(C6C, (String) null, (String) null, (String) null, (String) null));
            RtcCallKey AjW = rtcConnectionEntity2.AjW();
            String BkA = rtcConnectionEntity2.BkA();
            String A014 = C70907OQz.A01(rtcConnectionEntity2);
            rtcJoinCallArgs = new RtcJoinCallArgs(nid2, C69278Nie.NOT_SET, A013, (RtcCallFunnelSessionId) null, AjW, rtcCallSource, rtcConnectionEntity2.Bot(), BkA, A014, 1910377639, false);
        }
        return C66582MXn.A0K(context2, C70319O1x.A00(context2, userSession, rtcJoinCallArgs)).A01(context2, 0, 134217728);
    }
}
