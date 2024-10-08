package X;

import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.rtc.rsys.models.HttpRequest;
import com.instagram.rtc.rsys.models.HttpRequestFile;
import com.instagram.rtc.rsys.proxies.SignalingHttpSenderCallback;
import com.instagram.rtc.rsys.proxies.SignalingSenderProxy;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.NfT  reason: case insensitive filesystem */
public final class C69144NfT extends SignalingSenderProxy {
    public final /* synthetic */ C71143Odx A00;

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.1NU] */
    public final void sendHttpSignalingMessage(HttpRequest httpRequest, SignalingHttpSenderCallback signalingHttpSenderCallback, boolean z) {
        Integer num;
        HttpRequestFile httpRequestFile;
        int A1U = AnonymousClass7TF.A1U(0, httpRequest, signalingHttpSenderCallback);
        C71143Odx odx = this.A00;
        if (!182.A06(0Tu.A05, odx.A0H, 36322375214901379L) || !z) {
            OK8 ok8 = odx.A0Q;
            C59343JFv jFv = new C59343JFv(signalingHttpSenderCallback, 26);
            1NY A0M = DbU.A0M(ok8.A00);
            if (httpRequest.requestMethod == A1U) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A01;
            }
            A0M.A08(num);
            A0M.A0P(new Object());
            String str = httpRequest.path;
            0qQ.A06(str);
            A0M.A0E = str;
            A0M.A06 = 1CE.A0B;
            Map map = httpRequest.payload;
            0qQ.A06(map);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                0qQ.A0A(A13);
                A0M.A0G(A13, (String) A1J.getValue());
            }
            Map map2 = httpRequest.files;
            0qQ.A06(map2);
            Iterator A0u2 = AnonymousClass7TF.A0u(map2);
            while (A0u2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                String A132 = DbT.A13(A1J2);
                0qQ.A0A(A132);
                byte[] bArr = ((HttpRequestFile) A1J2.getValue()).data;
                0qQ.A06(bArr);
                A0M.A0J(A132, bArr);
            }
            1OC A0M2 = A0M.A0M();
            A0M2.A00 = new C68524NLv(jFv);
            1ES.A03(A0M2);
            return;
        }
        Map map3 = httpRequest.files;
        if (map3 != null && (httpRequestFile = (HttpRequestFile) map3.get("rtc_message")) != null) {
            RealtimeClientManager realtimeClientManager = odx.A0I;
            byte[] bArr2 = httpRequestFile.data;
            0qQ.A06(bArr2);
            byte[] bArr3 = new byte[A1U];
            bArr3[0] = 0;
            realtimeClientManager.publish(RealtimeConstants.MQTT_TOPIC_RTC_MULTI, 0Yw.A0X(bArr3, bArr2), AnonymousClass46Y.ACKNOWLEDGED_DELIVERY, new C71776Oqc(signalingHttpSenderCallback));
        }
    }

    public C69144NfT(C71143Odx odx) {
        this.A00 = odx;
    }
}
