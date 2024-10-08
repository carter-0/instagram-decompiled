package X;

import android.content.Context;
import android.util.Base64;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import com.instagram.rtc.signaling.processor.RtcRealtimeEventHandler$onRealtimeEventPayload$1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.42t  reason: invalid class name and case insensitive filesystem */
public final class C2597042t extends RealtimeEventHandler {
    public final Context A00;
    public final UserSession A01;
    public final 1XK A02;
    public final C262224Cq A03 = 19E.A01();

    public C2597042t(Context context, UserSession userSession, 1XK r4) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r4;
    }

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        0qQ.A0B(str, 0);
        if ((RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str) && "4".equals(str2)) || RealtimeConstants.MQTT_TOPIC_RTC_MULTI.equals(str)) {
            return true;
        }
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || !GraphQLSubscriptionID.VIDEO_CALL_IN_CALL_ALERT_QUERY_ID.equals(str2)) {
            return false;
        }
        return true;
    }

    public final boolean handleRealtimeEvent(C291065gS r16, RealtimePayload realtimePayload) {
        0sL r9;
        C262224Cq r2;
        0sn r22;
        C291065gS r4 = r16;
        0qQ.A0B(r4, 0);
        String str = r4.A00;
        String A002 = Pxd.A00(26);
        RealtimePayload realtimePayload2 = realtimePayload;
        if (realtimePayload != null) {
            0qQ.A07(str);
            if (canHandleRealtimeEvent(str, realtimePayload2.subTopic)) {
                UserSession userSession = this.A01;
                if (182.A06(0Tu.A05, userSession, 36317496131065021L)) {
                    String str2 = realtimePayload2.subTopic;
                    if (!RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str) || !"4".equals(str2)) {
                        if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && GraphQLSubscriptionID.VIDEO_CALL_IN_CALL_ALERT_QUERY_ID.equals(str2)) {
                            1XK r1 = this.A02;
                            String str3 = realtimePayload2.stringPayload;
                            0qQ.A06(str3);
                            r1.A00(userSession, str3);
                        }
                        return true;
                    }
                    String str4 = realtimePayload2.stringPayload;
                    0qQ.A06(str4);
                    try {
                        C45321CuP parseFromJson = C45146Cr7.parseFromJson(16P.A00(str4));
                        0qQ.A07(parseFromJson);
                        String str5 = parseFromJson.A01;
                        if (str5 != null) {
                            byte[] decode = Base64.decode(str5, 0);
                            1XK r0 = this.A02;
                            0qQ.A0A(decode);
                            int length = decode.length;
                            0qQ.A0B(userSession, 0);
                            r0.A00.A05.A0F(userSession, decode, 4, length);
                            return true;
                        }
                    } catch (IOException unused) {
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("handleRealtimeEvent(topic=");
                    sb.append(str);
                    sb.append(", subTopic=");
                    sb.append(realtimePayload2.subTopic);
                    sb.append(A002);
                    sb.append(realtimePayload2);
                    sb.append(") unable to extract base64 payload");
                    0KC.A0C("RtcRealtimeEventHandler", sb.toString());
                    return true;
                }
                String str6 = realtimePayload2.subTopic;
                String str7 = realtimePayload2.stringPayload;
                0qQ.A06(str7);
                r2 = this.A03;
                r9 = new RtcRealtimeEventHandler$onRealtimeEventPayload$1(this, str, str6, str7, (AnonymousClass4D7) null);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r9, r2);
                return true;
            }
        }
        0qQ.A07(str);
        if (!RealtimeConstants.MQTT_TOPIC_RTC_MULTI.equals(str)) {
            return false;
        }
        boolean z = false;
        if (realtimePayload != null) {
            Context context = this.A00;
            String str8 = realtimePayload2.stringPayload;
            0qQ.A06(str8);
            C71092OcE A012 = C71120OdE.A01(context, str8);
            if (!(A012 == null || A012.A0A.getValue() == C69277Nid.NO_E2EE)) {
                z = true;
            }
        }
        byte[] bArr = r4.A01;
        0qQ.A07(bArr);
        int length2 = bArr.length;
        int i = length2 - 1;
        if (i < 0 || i == 0) {
            r22 = 0sn.A00;
        } else if (i >= length2) {
            r22 = 03t.A0E(bArr);
        } else if (i == 1) {
            r22 = Collections.singletonList(Byte.valueOf(bArr[i]));
            0qQ.A07(r22);
        } else {
            r22 = new ArrayList(i);
            for (int i2 = length2 - i; i2 < length2; i2++) {
                r22.add(Byte.valueOf(bArr[i2]));
            }
        }
        byte[] A0v = 00k.A0v(r22);
        r2 = this.A03;
        r9 = new C59672JTc(this, A0v, (AnonymousClass4D7) null, 6, z);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r9, r2);
        return true;
    }

    public final List getMqttTopicsToHandle() {
        ArrayList A1M = 0sr.A1M(new String[]{RealtimeConstants.MQTT_TOPIC_SKYWALKER, RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE});
        if (182.A06(0Tu.A05, this.A01, 36322375214901379L)) {
            A1M.add(RealtimeConstants.MQTT_TOPIC_RTC_MULTI);
        }
        return A1M;
    }
}
