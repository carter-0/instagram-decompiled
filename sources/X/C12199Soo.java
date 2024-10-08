package X;

import android.text.TextUtils;
import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.HTTPResponseHandler;
import com.facebook.proxygen.ReadBuffer;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;

/* renamed from: X.Soo  reason: case insensitive filesystem */
public final class C12199Soo implements HTTPResponseHandler {
    public int A00 = 0;
    public C8838RCa A01;
    public C13846TiM A02;
    public Map A03;
    public final AnonymousClass1C6 A04;
    public final 1C5 A05;
    public final ReadBuffer A06;
    public final RequestStatsObserver A07;
    public final 1QS A08;
    public final S28 A09;
    public final S7W A0A;
    public final LightweightQuickPerformanceLogger A0B;
    public final AnonymousClass0vF A0C;

    public final void onResponse(int i, String str, Header[] headerArr) {
        String str2 = str;
        long currentMonotonicTimestampNanos = this.A0B.currentMonotonicTimestampNanos();
        if (str == null) {
            str2 = "empty";
        }
        this.A0C.ATE(new R96(this, str2, headerArr, i, currentMonotonicTimestampNanos));
    }

    public final void onBody() {
        this.A0C.ATE(new R90(this));
    }

    public final void onEOM() {
        this.A0C.ATE(new R91(this));
    }

    public final void onError(HTTPRequestError hTTPRequestError) {
        if (hTTPRequestError == null) {
            hTTPRequestError = new HTTPRequestError("Error is null", HTTPRequestError.HTTPRequestStage.Unknown, HTTPRequestError.ProxygenError.Unknown);
        }
        this.A0C.ATE(new R92(hTTPRequestError, this));
    }

    public C12199Soo(AnonymousClass1C6 r2, 1C5 r3, ReadBuffer readBuffer, RequestStatsObserver requestStatsObserver, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, 1QS r7, C13846TiM tiM, S28 s28, AnonymousClass0vF r10) {
        this.A0C = r10;
        this.A08 = r7;
        this.A06 = readBuffer;
        this.A07 = requestStatsObserver;
        this.A09 = s28;
        this.A03 = AnonymousClass7TE.A1E();
        this.A05 = r3;
        this.A04 = r2;
        this.A02 = tiM;
        this.A0A = new S7W(lightweightQuickPerformanceLogger);
        this.A0B = lightweightQuickPerformanceLogger;
    }

    public static ArrayList A00(Map map, Header[] headerArr) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (headerArr != null) {
            for (Header header : headerArr) {
                String name = header.getName();
                String value = header.getValue();
                Pxf.A1M(name, value, A1C);
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (map.containsKey(name)) {
                    A1C2.addAll((Collection) map.get(name));
                }
                A1C2.add(value);
                map.put(name, A1C2);
            }
        }
        return A1C;
    }

    public static void A01(C12199Soo soo, Map map) {
        String A11 = DbT.A11(TraceFieldType.NewSession, map);
        if (A11 != null) {
            S7W s7w = soo.A0A;
            1QS r3 = soo.A08;
            s7w.A04(r3, "liger_new_session", A11);
            String A112 = DbT.A11(AnonymousClass000.A00(4724), map);
            if (A112 != null) {
                s7w.A05(r3, "dns_persistent_cache_hit", A112.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION));
            }
            String A113 = DbT.A11(AnonymousClass000.A00(4186), map);
            if (A113 != null) {
                s7w.A05(r3, "tls_session_resumed", A113.equals(""));
            }
            soo.A02(map, TraceFieldType.CertificateVerifyStart, TraceFieldType.CertificateVerifyStart);
            soo.A02(map, TraceFieldType.CertificateVerifyEnd, TraceFieldType.CertificateVerifyEnd);
        }
        String A114 = DbT.A11(AnonymousClass000.A00(5215), map);
        if (A114 != null) {
            soo.A0A.A04(soo.A08, "server_ip_address", A114);
        }
        String A115 = DbT.A11(TraceFieldType.Protocol, map);
        if (!TextUtils.isEmpty(A115)) {
            if (A115.equals("hq")) {
                A115 = "HTTP/3";
            } else if (A115.equals("http/2")) {
                A115 = "HTTP/2";
            }
            soo.A0A.A04(soo.A08, "http_version", A115);
        }
        String A116 = DbT.A11(TraceFieldType.ReqBodySize, map);
        if (A116 != null) {
            try {
                soo.A0A.A01(soo.A08, TraceFieldType.ReqBodySize, Integer.parseInt(A116));
            } catch (NumberFormatException unused) {
            }
        }
        String A117 = DbT.A11(AnonymousClass000.A00(4851), map);
        if (A117 != null) {
            try {
                soo.A0A.A01(soo.A08, "stream_id", Integer.parseInt(A117));
            } catch (NumberFormatException unused2) {
            }
        }
        String A118 = DbT.A11(TraceFieldType.IsConnectionPreconnected, map);
        if (A118 != null) {
            soo.A0A.A05(soo.A08, TraceFieldType.IsConnectionPreconnected, A118.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION));
        }
        String A119 = DbT.A11(TraceFieldType.RTT, map);
        if (A119 != null) {
            try {
                soo.A0A.A02(soo.A08, "smoothed_rtt_ms", Long.parseLong(A119));
            } catch (NumberFormatException unused3) {
            }
        }
        String A1110 = DbT.A11(TraceFieldType.QuicResult, map);
        if (A1110 != null) {
            if (!A1110.equals("lost 0-rtt") && !A1110.equals("lost")) {
                if (A1110.equals("error")) {
                    String A1111 = DbT.A11(TraceFieldType.Error, map);
                    if (A1111 != null) {
                        soo.A0A.A04(soo.A08, "tcp_fallback_reason", A1111);
                    }
                }
            }
            soo.A0A.A04(soo.A08, "tcp_fallback_reason", A1110);
        }
        soo.A02(map, TraceFieldType.DnsResolutionStart, TraceFieldType.DnsResolutionStart);
        soo.A02(map, TraceFieldType.DnsResolutionEnd, TraceFieldType.DnsResolutionEnd);
        soo.A02(map, TraceFieldType.TcpConnectStart, TraceFieldType.TcpConnectStart);
        soo.A02(map, TraceFieldType.TcpConnectEnd, TraceFieldType.TcpConnectEnd);
        soo.A02(map, "handshake_start", TraceFieldType.QuicConnectStartTime);
        soo.A02(map, "handshake_end", TraceFieldType.QuicConnectEndTime);
        soo.A02(map, AnonymousClass000.A00(4640), TraceFieldType.RequestSendTime);
    }

    private void A02(Map map, String str, String str2) {
        String A11 = DbT.A11(str2, map);
        if (A11 != null) {
            try {
                this.A0A.A03(this.A08, str, Long.parseLong(A11), TimeUnit.MILLISECONDS);
            } catch (NumberFormatException unused) {
            }
        }
    }
}
