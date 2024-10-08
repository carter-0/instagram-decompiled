package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.43d  reason: invalid class name and case insensitive filesystem */
public final class C2598043d extends RealtimeEventHandler {
    public static final Charset A03 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public final Map A00;
    public final UserSession A01;
    public final Map A02;

    public C2598043d(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = 0Yt.A06(new 0eP[]{new 0eP(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC, Boolean.valueOf(182.A06(0Tu.A05, userSession, 36315868341472896L))), new 0eP(RealtimeConstants.MQTT_TOPIC_MESSAGE_STREAMING, true)});
        this.A00 = 0Yt.A06(new 0eP[]{new 0eP(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC, new C2598143e(userSession)), new 0eP(RealtimeConstants.MQTT_TOPIC_MESSAGE_STREAMING, new C2598243f(userSession))});
    }

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        0qQ.A0B(str, 0);
        Boolean bool = (Boolean) this.A02.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean handleRealtimeEvent(C291065gS r5, RealtimePayload realtimePayload) {
        0qQ.A0B(r5, 0);
        String str = r5.A00;
        0qQ.A07(str);
        byte[] bArr = r5.A01;
        0qQ.A07(bArr);
        Charset charset = A03;
        0qQ.A08(charset);
        String str2 = new String(bArr, charset);
        C2598243f r0 = (C2598243f) this.A00.get(str);
        if (r0 == null) {
            return true;
        }
        try {
            r0.A02.obtainMessage(1, C3027164z.A00(str2)).sendToTarget();
            return true;
        } catch (IOException e) {
            2Og.A00(e);
            return true;
        }
    }

    public final List getMqttTopicsToHandle() {
        ArrayList arrayList = new ArrayList();
        if (182.A06(0Tu.A05, this.A01, 36315868341472896L)) {
            arrayList.add(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC);
        }
        arrayList.add(RealtimeConstants.MQTT_TOPIC_MESSAGE_STREAMING);
        return arrayList;
    }
}
