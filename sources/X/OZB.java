package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import com.instagram.rtc.activity.RtcIncomingParams;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import org.json.JSONArray;

public final class OZB {
    public static final OZB A00 = new Object();

    public final Intent A01(Context context, C74562PxB pxB, UserSession userSession, 1X9 r25, RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity) {
        RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity2 = rtcCallConnectionEntity;
        0qQ.A0B(rtcCallConnectionEntity2, 3);
        AnonymousClass38Y A002 = r25.A00(context, userSession);
        String A003 = C70907OQz.A00(rtcCallConnectionEntity2);
        C69277Nid nid = rtcCallConnectionEntity2.A01;
        String A004 = rtcCallConnectionEntity2.A00();
        if (A004 == null) {
            A004 = "";
        }
        RtcCallSource rtcCallSource = new RtcCallSource((C69465Nm9) null, C331537Rj.RING_SCREEN, new RtcThreadKey(A004, (String) null, (String) null, (String) null, (String) null));
        1oz r13 = AnonymousClass386.A00().A00;
        String str = rtcCallConnectionEntity2.A0D;
        if (str == null) {
            str = "";
        }
        boolean z = rtcCallConnectionEntity2.A0N;
        String str2 = rtcCallConnectionEntity2.A0A;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = rtcCallConnectionEntity2.A0C;
        if (str3 == null) {
            str3 = "";
        }
        RtcCallAudience A01 = r13.A01(str, str2, str3, rtcCallConnectionEntity2.A0B, z);
        boolean z2 = rtcCallConnectionEntity2.A0L;
        String A012 = C70907OQz.A01(rtcCallConnectionEntity2);
        AnonymousClass7TG.A1N(A003, nid);
        RtcCallKey rtcCallKey = rtcCallConnectionEntity2.A03;
        AnonymousClass38Y.A03(rtcCallKey, rtcCallSource, A002);
        UserSession userSession2 = A002.A06;
        Context context2 = A002.A04;
        C72192OyC A005 = C66953Mfm.A00(context2, userSession2);
        RtcIncomingParams rtcIncomingParams = new RtcIncomingParams(rtcCallKey.A00, (String) null, z, z2);
        String str4 = rtcCallSource.A02.A02;
        String str5 = A01.A02;
        String str6 = A01.A01;
        String A0o = JTP.A0o(A01.A00);
        DbY.A1S(str4, str5);
        C71080Oaz oaz = A005.A09.A0K;
        Integer num = AnonymousClass05K.A01;
        C74562PxB pxB2 = pxB;
        C68160N3a n3a = new C68160N3a(pxB2, nid, rtcCallConnectionEntity2, num, str4, str5, str6, A0o, A012, z2, z);
        if (182.A06(0Tu.A05, oaz.A08, 36328083225131958L)) {
            oaz.A03 = n3a;
        }
        if (!((N9J) oaz.A00.A00).A00()) {
            oaz.A02 = null;
            oaz.A04 = null;
            boolean z3 = false;
            oaz.A06 = false;
            oaz.A03 = n3a;
            if (n3a.A02 != C69277Nid.NO_E2EE) {
                z3 = true;
            }
            oaz.A06 = z3;
            RtcCallKey rtcCallKey2 = n3a.A03.A03;
            C71080Oaz.A02(new N4R(new N9J(rtcCallKey2, num, num), AnonymousClass05K.A00), oaz);
        }
        Intent A0A = C66580MXl.A0A(context2, RtcCallIntentHandlerActivity.class);
        A0A.setAction("rtc_call_activity_intent_action_incoming_call");
        A0A.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
        A0A.putExtra("rtc_call_activity_arguments_key_notification_trace_id", Long.valueOf(pxB2.C8y()));
        Parcel obtain = Parcel.obtain();
        0qQ.A07(obtain);
        rtcIncomingParams.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        A0A.putExtra("rtc_call_activity_arguments_key_incoming_param", marshall);
        A0A.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
        return A0A;
    }

    public static final String A00(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            0qQ.A07(string);
            strArr[i] = string;
        }
        return 03t.A07(", ", "", "", C74153Ppu.A00, strArr);
    }
}
