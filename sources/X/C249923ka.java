package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3ka  reason: invalid class name and case insensitive filesystem */
public class C249923ka implements TigonCallbacks {
    public static final List A0M = 0sr.A1P(new String[]{"quic_destination_connection_id", "tcp_fallback_reason", TraceFieldType.H3PriorityChanges});
    public static final Map A0N = 0Yt.A06(new 0eP[]{new 0eP("latest_rtt_ms", "latest_rtt_ms"), new 0eP("connection_idle_duration_at_request_start_ms", "connection_idle_duration_at_request_start_ms"), new 0eP("host_session_id", "host_session_id"), new 0eP("smoothed_rtt_ms", TraceFieldType.RTT), new 0eP("stream_id", TraceFieldType.HTTPStreamId), new 0eP(TraceFieldType.StreamLossCount, TraceFieldType.StreamLossCount), new 0eP("quic_stream_bytes_sent", TraceFieldType.StreamBytesSent), new 0eP("quic_stream_bytes_received", TraceFieldType.StreamBytesReceived), new 0eP("using_in_app_proxy", TraceFieldType.UsingManualProxy)});
    public static final Map A0O = 0Yt.A06(new 0eP[]{new 0eP(TraceFieldType.DnsResolutionStart, TraceFieldType.DnsResolutionStart), new 0eP(TraceFieldType.DnsResolutionEnd, TraceFieldType.DnsResolutionEnd), new 0eP(TraceFieldType.TcpConnectStart, TraceFieldType.TcpConnectStart), new 0eP(TraceFieldType.TcpConnectEnd, TraceFieldType.TcpConnectEnd), new 0eP(TraceFieldType.CertificateVerifyStart, TraceFieldType.CertificateVerifyStart), new 0eP(TraceFieldType.CertificateVerifyEnd, TraceFieldType.CertificateVerifyEnd), new 0eP("connection_acquisition_start", TraceFieldType.ConnectionAcquisitionStart), new 0eP(TraceFieldType.ConnectionAcquisitionEnd, TraceFieldType.RequestSendTime)});
    public C8845RCl A00;
    public int A01;
    public int A02;
    public int A03;
    public TigonRequest A04;
    public boolean A05;
    public boolean A06;
    public final IGTigonQuickPerformanceLogger A07;
    public final 1QS A08;
    public final Integer A09;
    public final AnonymousClass1C6 A0A;
    public final 1C5 A0B;
    public final TigonXplatService A0C;
    public final TigonRequest A0D;
    public final CacheBehaviorLogger A0E;
    public final 1Qe A0F;
    public final 1QU A0G;
    public final 0lg A0H;
    public final AnonymousClass0vF A0I;
    public final ArrayList A0J;
    public final boolean A0K;
    public final AnonymousClass1D3[] A0L;

    public C249923ka(AnonymousClass1C6 r3, 1C5 r4, TigonXplatService tigonXplatService, TigonRequest tigonRequest, IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, CacheBehaviorLogger cacheBehaviorLogger, 1Qe r9, 1QS r10, 1QU r11, 0lg r12, AnonymousClass1D3[] r13, boolean z) {
        int i;
        0qQ.A0B(cacheBehaviorLogger, 7);
        0qQ.A0B(r13, 8);
        this.A08 = r10;
        this.A0G = r11;
        this.A0D = tigonRequest;
        this.A0F = r9;
        this.A0C = tigonXplatService;
        this.A07 = iGTigonQuickPerformanceLogger;
        this.A0E = cacheBehaviorLogger;
        this.A0L = r13;
        this.A0B = r4;
        this.A0A = r3;
        this.A0K = z;
        this.A0H = r12;
        if (r11.A09 != 1CE.A04 || !0yU.A07(AnonymousClass0yP.A00(36325265726583598L))) {
            i = null;
        } else {
            i = -2;
        }
        this.A09 = i;
        this.A0J = new ArrayList();
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "TigonExecutor";
        this.A0I = new AnonymousClass0vF(A002);
        this.A03 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017b, code lost:
        if (r1.equals("") == false) goto L_0x0136;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C239923Iu r16) {
        /*
            r15 = this;
            r0 = 0
            r6 = r16
            X.0qQ.A0B(r6, r0)
            java.lang.String r1 = "tigon/"
            r0 = r6
            X.3It r0 = (X.C239913It) r0
            java.lang.String r0 = r0.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "http_stack"
            r15.A0B(r0, r1)
            int r1 = r15.A0D()
            java.lang.String r0 = "response_body_size"
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r9 = r15.A07
            X.1QS r10 = r15.A08
            r9.markerAnnotate(r10, r0, r1)
            int r1 = r15.A01
            java.lang.String r0 = "dispatch_new_data_count"
            r9.markerAnnotate(r10, r0, r1)
            java.util.ArrayList r0 = r15.A0J
            java.lang.String r1 = r0.toString()
            X.0qQ.A07(r1)
            java.lang.String r0 = "retried_ip_addresses"
            r15.A0B(r0, r1)
            X.3Iz r0 = X.C239953Iy.A0E
            java.lang.Object r0 = r6.BLk(r0)
            X.3Io r0 = (X.C239863Io) r0
            r7 = 0
            if (r0 == 0) goto L_0x008b
            int r1 = r0.A00
        L_0x0045:
            java.lang.String r0 = "retry_count"
            r9.markerAnnotate(r10, r0, r1)
            X.3Iz r1 = X.C239953Iy.A04
            java.lang.Object r0 = r6.BLk(r1)
            X.3Iq r0 = (X.C239883Iq) r0
            r2 = 0
            if (r0 == 0) goto L_0x0057
            java.util.Map r2 = r0.A01
        L_0x0057:
            X.3Iz r0 = X.C239953Iy.A07
            java.lang.Object r3 = r6.BLk(r0)
            X.3Ir r3 = (X.C239893Ir) r3
            if (r3 == 0) goto L_0x0109
            java.util.Map r0 = r3.A01
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x006b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r9.markerAnnotate(r10, r2, r0)
            goto L_0x006b
        L_0x008b:
            r1 = 0
            goto L_0x0045
        L_0x008d:
            java.util.Map r0 = r3.A02
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0097:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r15.A0B(r1, r0)
            goto L_0x0097
        L_0x00b3:
            java.util.Map r0 = r3.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x00bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r15.A0C(r1, r0)
            goto L_0x00bd
        L_0x00dd:
            java.util.Map r0 = r3.A03
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0317
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r11 = r0.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r12 = r0.longValue()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.markerPoint(r10, r11, r12, r14)
            goto L_0x00e7
        L_0x0109:
            java.lang.Object r0 = r6.BLk(r1)
            X.3Iq r0 = (X.C239883Iq) r0
            if (r0 == 0) goto L_0x013b
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "protocol"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x013b
            int r3 = r1.hashCode()
            r0 = -1206842261(0xffffffffb8110c6b, float:-3.458226E-5)
            if (r3 == r0) goto L_0x017e
            if (r3 == 0) goto L_0x0175
            r0 = 3337(0xd09, float:4.676E-42)
            if (r3 != r0) goto L_0x0136
            java.lang.String r0 = "hq"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0136
            java.lang.String r1 = "HTTP/3"
        L_0x0136:
            java.lang.String r0 = "http_version"
            r15.A0B(r0, r1)
        L_0x013b:
            if (r2 == 0) goto L_0x0317
            java.util.Map r0 = A0N
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0147:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0147
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x0147
            long r0 = r0.longValue()
            r9.markerAnnotate(r10, r3, r0)
            goto L_0x0147
        L_0x0175:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x013b
            goto L_0x0136
        L_0x017e:
            java.lang.String r0 = "http/2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0136
            java.lang.String r1 = "HTTP/2"
            goto L_0x0136
        L_0x0189:
            java.util.List r0 = A0M
            java.util.Iterator r8 = r0.iterator()
        L_0x018f:
            boolean r0 = r8.hasNext()
            java.lang.String r5 = ""
            r4 = 1
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x018f
            boolean r0 = r1.equals(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x018f
            r15.A0B(r3, r1)
            goto L_0x018f
        L_0x01b2:
            java.util.Map r0 = A0O
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x01bc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r11 = r0.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x01bc
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x01bc
            long r12 = r0.longValue()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.markerPoint(r10, r11, r12, r14)
            goto L_0x01bc
        L_0x01ec:
            java.lang.String r0 = "dns_cache_hit"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r3 = "1"
            if (r0 == 0) goto L_0x01ff
            boolean r1 = r0.equals(r3)
            java.lang.String r0 = "dns_persistent_cache_hit"
            r15.A0C(r0, r1)
        L_0x01ff:
            java.lang.String r1 = "is_connection_preconnected"
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x020e
            boolean r0 = r0.equals(r3)
            r15.A0C(r1, r0)
        L_0x020e:
            java.lang.String r0 = "waiting_for_new_connection"
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x021e
            if (r0 != r3) goto L_0x0219
            r7 = 1
        L_0x0219:
            java.lang.String r0 = "waited_for_connection"
            r15.A0C(r0, r7)
        L_0x021e:
            java.lang.String r0 = "new_session"
            java.lang.Object r7 = r2.get(r0)
            if (r7 == 0) goto L_0x0261
            boolean r1 = r7.equals(r3)
            java.lang.String r0 = "is_first_request_on_connection"
            r15.A0C(r0, r1)
            boolean r1 = r7.equals(r3)
            java.lang.String r0 = "liger_new_session"
            r15.A0C(r0, r1)
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0261
            X.3Iz r0 = X.C239953Iy.A02
            java.lang.Object r0 = r6.BLk(r0)
            X.3J5 r0 = (X.AnonymousClass3J5) r0
            if (r0 == 0) goto L_0x025c
            java.util.Map r1 = r0.A00
            r0 = 4186(0x105a, float:5.866E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x025c
            boolean r4 = r0.equals(r5)
        L_0x025c:
            java.lang.String r0 = "tls_session_resumed"
            r15.A0C(r0, r4)
        L_0x0261:
            java.lang.String r1 = "request_body_size"
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0272
            int r0 = java.lang.Integer.parseInt(r0)
            r9.markerAnnotate(r10, r1, r0)
        L_0x0272:
            java.lang.String r0 = "cwnd_bytes"
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r7 = 0
            if (r1 == 0) goto L_0x028f
            long r4 = java.lang.Long.parseLong(r1)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x028f
            long r0 = java.lang.Long.parseLong(r1)
            java.lang.String r4 = "client_cwnd"
            r9.markerAnnotate(r10, r4, r0)
        L_0x028f:
            java.lang.String r6 = "server_cwnd"
            java.lang.Object r1 = r2.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x02a8
            long r4 = java.lang.Long.parseLong(r1)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a8
            long r0 = java.lang.Long.parseLong(r1)
            r9.markerAnnotate(r10, r6, r0)
        L_0x02a8:
            java.lang.String r0 = "server_address"
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x02b7
            java.lang.String r0 = "server_ip_address"
            r15.A0B(r0, r1)
        L_0x02b7:
            java.lang.String r1 = "resolved_ip_addresses"
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x02c4
            r15.A0B(r1, r0)
        L_0x02c4:
            java.lang.String r0 = "quic_result"
            java.lang.Object r4 = r2.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x02f5
            java.lang.String r0 = "lost 0-rtt"
            boolean r0 = r4.equals(r0)
            java.lang.String r1 = "tcp_fallback_reason"
            if (r0 != 0) goto L_0x0318
            java.lang.String r0 = "lost"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0318
            java.lang.String r0 = "error"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x02f5
            java.lang.String r0 = "error_description"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0318
            r15.A0B(r1, r0)
        L_0x02f5:
            java.lang.String r0 = "replay_safe"
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0306
            boolean r1 = r0.equals(r3)
            java.lang.String r0 = "is_request_replay_safe"
            r15.A0C(r0, r1)
        L_0x0306:
            java.lang.String r0 = "quic_early_data_enabled"
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0317
            boolean r1 = r0.equals(r3)
            java.lang.String r0 = "quic_early_data_attempted"
            r15.A0C(r0, r1)
        L_0x0317:
            return
        L_0x0318:
            r15.A0B(r1, r4)
            goto L_0x02f5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249923ka.A0E(X.3Iu):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r5.A0C.releaseBodyBuffer(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBody(java.nio.ByteBuffer r6) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            boolean r0 = r5.A06     // Catch:{ all -> 0x0081 }
            r3 = 1
            if (r0 != 0) goto L_0x001f
            r0 = 3890(0xf32, float:5.451E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0081 }
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r1 = r5.A07     // Catch:{ all -> 0x0081 }
            X.1QS r2 = r5.A08     // Catch:{ all -> 0x0081 }
            r1.markerPoint(r2, r0)     // Catch:{ all -> 0x0081 }
            com.instagram.common.api.base.CacheBehaviorLogger r1 = r5.A0E     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "tigon_response_body_start"
            r1.markerPoint(r2, r0)     // Catch:{ all -> 0x0081 }
            r5.A06 = r3     // Catch:{ all -> 0x0081 }
        L_0x001f:
            int r1 = r5.A02     // Catch:{ all -> 0x0081 }
            int r0 = r6.remaining()     // Catch:{ all -> 0x0081 }
            int r1 = r1 + r0
            r5.A02 = r1     // Catch:{ all -> 0x0081 }
            boolean r0 = r5.A0K     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x004c
            int r3 = r6.remaining()     // Catch:{ all -> 0x0081 }
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x0081 }
            r6.get(r2)     // Catch:{ all -> 0x0081 }
            X.RCl r1 = r5.A00     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x007b
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.Queue r0 = r1.A03     // Catch:{ all -> 0x0049 }
            r0.add(r2)     // Catch:{ all -> 0x0049 }
            int r0 = r1.A00     // Catch:{ all -> 0x0049 }
            int r0 = r0 + r3
            r1.A00 = r0     // Catch:{ all -> 0x0049 }
            r1.notifyAll()     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            goto L_0x007b
        L_0x0049:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x004c:
            r3 = 4096(0x1000, float:5.74E-42)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ all -> 0x0081 }
        L_0x0052:
            boolean r0 = r6.hasRemaining()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x007b
            int r0 = r6.remaining()     // Catch:{ all -> 0x0081 }
            int r1 = java.lang.Math.min(r0, r3)     // Catch:{ all -> 0x0081 }
            r2.limit(r1)     // Catch:{ all -> 0x0081 }
            byte[] r0 = r2.array()     // Catch:{ all -> 0x0081 }
            r6.get(r0, r4, r1)     // Catch:{ all -> 0x0081 }
            X.1Qe r1 = r5.A0F     // Catch:{ all -> 0x0081 }
            X.1QS r0 = r5.A08     // Catch:{ all -> 0x0081 }
            r1.A05(r0, r2)     // Catch:{ all -> 0x0081 }
            r2.clear()     // Catch:{ all -> 0x0081 }
            int r0 = r5.A01     // Catch:{ all -> 0x0081 }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x0081 }
            goto L_0x0052
        L_0x007b:
            com.facebook.tigon.TigonXplatService r0 = r5.A0C
            r0.releaseBodyBuffer(r6)
            return
        L_0x0081:
            r1 = move-exception
            com.facebook.tigon.TigonXplatService r0 = r5.A0C
            r0.releaseBodyBuffer(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249923ka.onBody(java.nio.ByteBuffer):void");
    }

    public final void onBodyExperimental(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        0qQ.A0A(wrap);
        onBody(wrap);
    }

    public void onEOM(C239923Iu r8) {
        AnonymousClass1C6 r0;
        0qQ.A0B(r8, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("IGTigonCallbacks.onEOM", -1358048170);
        }
        try {
            C8845RCl rCl = this.A00;
            if (rCl != null) {
                synchronized (rCl) {
                    rCl.A04 = true;
                    rCl.notifyAll();
                }
            }
            if (this.A0K) {
                A0G(new MMZ(18, (Object) r8, (Object) this));
            } else {
                A0A(r8, this);
            }
            AnonymousClass3J4 A082 = A08(TigonError.None, r8);
            for (AnonymousClass1D3 Chz : this.A0L) {
                Chz.Chz(A082);
            }
            1C5 r1 = this.A0B;
            if (!(r1 == null || (r0 = this.A0A) == null)) {
                r1.A00(r0);
            }
            if (Systrace.A0E(1)) {
                0fS.A00(-360076596);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-218088093);
            }
            throw th;
        }
    }

    public void onError(TigonError tigonError, C239923Iu r10) {
        TigonError tigonError2 = tigonError;
        0qQ.A0B(tigonError, 0);
        C239923Iu r7 = r10;
        0qQ.A0B(r10, 1);
        IOException iOException = new IOException(002.A0g(002.A0b(002.A0g(tigonError.category.toString(), " domain: ", tigonError.errorDomain), " code: ", tigonError.domainErrorCode), " detail: ", tigonError.analyticsDetail));
        if (this.A0K) {
            C8845RCl rCl = this.A00;
            if (rCl != null) {
                synchronized (rCl) {
                    rCl.A02 = iOException;
                    rCl.notifyAll();
                }
            }
            A0G(new C58208IoC(12, tigonError2, this, iOException, r7));
        } else {
            A09(tigonError, r10, this, iOException);
        }
        AnonymousClass3J4 A082 = A08(tigonError, r10);
        for (AnonymousClass1D3 Chz : this.A0L) {
            Chz.Chz(A082);
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.2ZD] */
    public void onResponse(AnonymousClass9IM r11) {
        0qQ.A0B(r11, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("IGTigonCallbacks.onResponse", 1396341220);
        }
        try {
            IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.A07;
            1QS r5 = this.A08;
            iGTigonQuickPerformanceLogger.markerPoint(r5, "response_headers_received");
            Map map = (Map) r11.A01;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new 1Fn((String) entry.getKey(), (String) entry.getValue()));
            }
            this.A0E.markerPoint(r5, "tigon_on_response");
            1Qe r4 = this.A0F;
            int i = r11.A00;
            int i2 = r5.A04;
            ? obj = new Object();
            obj.A01 = i;
            obj.A02 = null;
            obj.A00 = i2;
            obj.A03 = arrayList;
            r4.A00(obj, r5);
            iGTigonQuickPerformanceLogger.markerAnnotate(r5, TraceFieldType.StatusCode, i);
            if (this.A0K) {
                this.A00 = new C8845RCl();
                A0G(new TTM(this));
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-149262503);
            }
        }
    }

    public final void onStarted(TigonRequest tigonRequest) {
        0qQ.A0B(tigonRequest, 0);
        this.A04 = tigonRequest;
        AnonymousClass1S0 r0 = C64641Rz.A06;
        0qQ.A08(r0);
        1SJ r02 = (1SJ) tigonRequest.getLayerInformation(r0);
        if (!(r02 == null || (r02.A03 & 8) == 0)) {
            this.A03 = AnonymousClass1D8.A00().A0Y();
        }
        this.A05 = AnonymousClass1Rn.A00.get();
    }

    public void onWillRetry(TigonError tigonError, C239923Iu r7) {
        Object obj;
        0qQ.A0B(tigonError, 0);
        0qQ.A0B(r7, 1);
        C239863Io r3 = (C239863Io) r7.BLk(C239953Iy.A0E);
        if (r3 != null) {
            A0B(Pxd.A00(868), 002.A0T(002.A0E(tigonError.errorDomain, '[', ']'), tigonError.analyticsDetail, ' '));
            A0B("retry_category", r3.A02);
            this.A07.markerPoint(this.A08, 002.A0O("tigon_send_request_retry_", r3.A00 + 1));
        }
        C239883Iq r0 = (C239883Iq) r7.BLk(C239953Iy.A04);
        if (!(r0 == null || (obj = r0.A01.get(TraceFieldType.ServerAddr)) == null)) {
            this.A0J.add(obj);
        }
        AnonymousClass3J4 A082 = A08(tigonError, r7);
        for (AnonymousClass1D3 Chz : this.A0L) {
            Chz.Chz(A082);
        }
    }

    private final AnonymousClass3J4 A08(TigonError tigonError, C239923Iu r8) {
        TigonRequest tigonRequest = this.A04;
        if (tigonRequest == null) {
            tigonRequest = this.A0D;
        }
        return new AnonymousClass3J4(tigonError, r8, tigonRequest, this.A03, this.A05);
    }

    public static final void A09(TigonError tigonError, C239923Iu r6, C249923ka r7, IOException iOException) {
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger;
        short s;
        CacheBehaviorLogger cacheBehaviorLogger = r7.A0E;
        1QS r3 = r7.A08;
        cacheBehaviorLogger.markerPoint(r3, "tigon_fail");
        r7.A0F.A04(r3, iOException);
        r7.A0E(r6);
        if (tigonError.category == TigonErrorCode.CANCEL) {
            iGTigonQuickPerformanceLogger = r7.A07;
            s = 4;
        } else {
            r7.A0B(TraceFieldType.FailureReason, 002.A0T(002.A0E(tigonError.errorDomain, '[', ']'), tigonError.analyticsDetail, ' '));
            iGTigonQuickPerformanceLogger = r7.A07;
            s = 3;
        }
        iGTigonQuickPerformanceLogger.markerEnd(r3, s);
        cacheBehaviorLogger.markerEnd(r3, s);
    }

    public static final void A0A(C239923Iu r5, C249923ka r6) {
        CacheBehaviorLogger cacheBehaviorLogger = r6.A0E;
        1QS r3 = r6.A08;
        cacheBehaviorLogger.markerPoint(r3, "tigon_success");
        r6.A0F.A03(r3);
        r6.A0E(r5);
        r6.A07.markerEnd(r3, 2);
        cacheBehaviorLogger.markerAnnotate(r3, "source", "network");
        cacheBehaviorLogger.markerEnd(r3, 2);
    }

    private final void A0B(String str, String str2) {
        this.A07.markerAnnotate(this.A08, str, str2);
    }

    private final void A0C(String str, boolean z) {
        this.A07.markerAnnotate(this.A08, str, z);
    }

    public int A0D() {
        return this.A02;
    }

    public final void A0F(ByteBuffer byteBuffer) {
        if (Systrace.A0E(1)) {
            0fS.A01("IGTigonCallbacks.dispatchChunk", 1069482436);
        }
        try {
            this.A0F.A05(this.A08, byteBuffer);
            this.A01++;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1545398571);
            }
        }
    }

    public final void A0G(C62320sa r3) {
        this.A0I.ATE(new AnonymousClass1TI(this, r3));
    }

    public void onFirstByteFlushed(long j) {
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.A07;
        1QS r3 = this.A08;
        iGTigonQuickPerformanceLogger.markerPoint(r3, "request_body_first_byte_flushed");
        ArrayList arrayList = this.A0F.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C262234Cr) arrayList.get(size)).onFirstByteFlushed(r3, j);
            } else {
                return;
            }
        }
    }

    public void onHeaderBytesReceived(long j, long j2) {
        String A002 = Pxd.A00(866);
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.A07;
        1QS r3 = this.A08;
        iGTigonQuickPerformanceLogger.markerPoint(r3, A002);
        ArrayList arrayList = this.A0F.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C262234Cr) arrayList.get(size)).onHeaderBytesReceived(r3, j, j2);
            } else {
                return;
            }
        }
    }

    public void onLastByteAcked(long j, long j2) {
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.A07;
        1QS r3 = this.A08;
        iGTigonQuickPerformanceLogger.markerPoint(r3, "request_body_last_byte_acked");
        ArrayList arrayList = this.A0F.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C262234Cr) arrayList.get(size)).onLastByteAcked(r3, j2, j);
            } else {
                return;
            }
        }
    }

    public void onUploadProgress(long j, long j2) {
        1Qe r0 = this.A0F;
        1QS r3 = this.A08;
        ArrayList arrayList = r0.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C262234Cr) arrayList.get(size)).onUploadProgress(r3, j, j2);
            } else {
                return;
            }
        }
    }
}
