package X;

import android.util.Pair;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceEvent;
import com.facebook.proxygen.TraceEventType;
import com.facebook.proxygen.TraceFieldType;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;

/* renamed from: X.SSi  reason: case insensitive filesystem */
public abstract class C11410SSi {
    public static 1QS A01(1Qb r11, 1QS r12, 1Fn r13) {
        String host;
        try {
            URI create = URI.create(r13.A01);
            if (!create.isAbsolute()) {
                create = r12.A09.resolve(create);
            }
            if (r11 != null) {
                r11.close();
            }
            List<1Fn> list = r12.A01;
            String scheme = create.getScheme();
            if (scheme == null || !scheme.equals("https") || (host = create.getHost()) == null || (!host.equals(IGPixelRequestBuffer.URL_PREFIX) && !host.equals("instagram.com") && !host.endsWith(".facebook.com") && !host.endsWith(".instagram.com"))) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                List asList = Arrays.asList(C64151Gy.A00);
                for (1Fn r1 : list) {
                    if (asList.contains(r1.A00)) {
                        A1C.add(r1);
                    }
                }
                list = A1C;
            }
            String A10 = DbT.A10(create);
            Integer num = r12.A07;
            return new 1QS(r12.A05, r12.A06, num, A10, list, (Map) null, r12.A04, 192, true, false, r12.A02);
        } catch (IllegalArgumentException unused) {
            throw Pxg.A0Z("Invalid redirect URI: ", r13.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r9 == X.AnonymousClass05K.A00) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.http.client.methods.HttpUriRequest A02(X.1QS r10, java.util.ArrayList r11) {
        /*
            java.lang.Integer r9 = r10.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r5 = 0
            r2 = 3
            if (r9 == r0) goto L_0x000d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 0
            if (r9 != r0) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x0018
            if (r1 == 0) goto L_0x0061
            X.1Px r0 = r10.A06
            if (r0 != 0) goto L_0x0061
        L_0x0018:
            r4 = 1
        L_0x0019:
            int r1 = r9.intValue()
            if (r1 == r2) goto L_0x0059
            r0 = 1
            if (r1 == r0) goto L_0x0051
            r0 = 4
            if (r1 == r0) goto L_0x0049
            if (r1 != r5) goto L_0x0106
            java.net.URI r8 = r10.A09
            org.apache.http.client.methods.HttpHead r3 = new org.apache.http.client.methods.HttpHead
            r3.<init>(r8)
        L_0x002e:
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x0063
            java.lang.Object r0 = r11.get(r5)
            X.1Fn r0 = (X.1Fn) r0
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A01
            org.apache.http.message.BasicHeader r0 = new org.apache.http.message.BasicHeader
            r0.<init>(r2, r1)
            r3.addHeader(r0)
            int r5 = r5 + 1
            goto L_0x002e
        L_0x0049:
            java.net.URI r8 = r10.A09
            org.apache.http.client.methods.HttpDelete r3 = new org.apache.http.client.methods.HttpDelete
            r3.<init>(r8)
            goto L_0x002e
        L_0x0051:
            java.net.URI r8 = r10.A09
            org.apache.http.client.methods.HttpPost r3 = new org.apache.http.client.methods.HttpPost
            r3.<init>(r8)
            goto L_0x002e
        L_0x0059:
            java.net.URI r8 = r10.A09
            org.apache.http.client.methods.HttpGet r3 = new org.apache.http.client.methods.HttpGet
            r3.<init>(r8)
            goto L_0x002e
        L_0x0061:
            r4 = 0
            goto L_0x0019
        L_0x0063:
            if (r4 == 0) goto L_0x0072
            org.apache.http.params.HttpParams r2 = r3.getParams()
            if (r2 == 0) goto L_0x0072
            r1 = 1
            java.lang.String r0 = "replay_safe"
            r2.setBooleanParameter(r0, r1)
        L_0x0072:
            org.apache.http.params.HttpParams r2 = r3.getParams()
            if (r2 == 0) goto L_0x0086
            boolean r1 = r10.A03
            java.lang.String r0 = "h3pri_incremental"
            r2.setBooleanParameter(r0, r1)
            int r1 = r10.A00
            java.lang.String r0 = "h3pri_urgency"
            r2.setIntParameter(r0, r1)
        L_0x0086:
            X.1Px r7 = r10.A06
            if (r7 == 0) goto L_0x0105
            r5 = r3
            org.apache.http.HttpEntityEnclosingRequest r5 = (org.apache.http.HttpEntityEnclosingRequest) r5
            java.io.InputStream r4 = r7.E15()
            long r0 = r7.getContentLength()
            org.apache.http.entity.InputStreamEntity r2 = new org.apache.http.entity.InputStreamEntity
            r2.<init>(r4, r0)
            r5.setEntity(r2)
            X.1Fn r0 = r7.Aql()
            if (r0 == 0) goto L_0x00b2
            X.1Fn r0 = r7.Aql()
            java.lang.String r1 = r0.A00
            X.1Fn r0 = r7.Aql()
            java.lang.String r0 = r0.A01
            r3.addHeader(r1, r0)
        L_0x00b2:
            X.1Fn r0 = r7.Aqb()
            if (r0 == 0) goto L_0x00bf
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            r3.addHeader(r1, r0)
        L_0x00bf:
            long r0 = r7.getContentLength()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "Content-Length"
            r3.addHeader(r4, r0)
            long r5 = r7.getContentLength()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0105
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r9 != r0) goto L_0x0102
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "phase=transfer"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0102
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "class:"
            X.Pxg.A1R(r2, r0, r7)
            java.lang.String r0 = " len:"
            r2.append(r0)
            long r0 = r7.getContentLength()
            java.lang.String r1 = X.Pxe.A10(r2, r0)
            java.lang.String r0 = "igtv_header_missing_content_length"
            X.0wb.A03(r0, r1)
        L_0x0102:
            r3.removeHeaders(r4)
        L_0x0105:
            return r3
        L_0x0106:
            java.lang.UnsupportedOperationException r0 = X.C66580MXl.A11()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11410SSi.A02(X.1QS, java.util.ArrayList):org.apache.http.client.methods.HttpUriRequest");
    }

    public static boolean A05(C8838RCa rCa) {
        HTTPRequestError.ProxygenError proxygenError;
        HTTPRequestError hTTPRequestError = rCa.A00;
        if (hTTPRequestError == null || (proxygenError = hTTPRequestError.mErrCode) == null) {
            proxygenError = null;
        }
        if (proxygenError == HTTPRequestError.ProxygenError.Canceled) {
            return false;
        }
        HTTPRequestError.HTTPRequestStage hTTPRequestStage = hTTPRequestError.mErrStage;
        if (hTTPRequestStage == HTTPRequestError.HTTPRequestStage.ProcessRequest || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.DNSResolution || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.TCPConnection || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.TLSSetup || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.ZeroRttSent || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.SendRequest) {
            return true;
        }
        return false;
    }

    public static 2ZL A00(1QS r9, InputStream inputStream, String str, Map map, Header[] headerArr, int i) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        long j = -1;
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
                if (name.equalsIgnoreCase("Content-Length") && value != null) {
                    j = Long.parseLong(value.trim());
                }
            }
        }
        2ZL r4 = new 2ZL(str, A1C, i, r9.A04);
        if (r9.A07 != AnonymousClass05K.A00 && (100 > i || !(i < 200 || i == 204 || i == 304))) {
            r4.A00 = new C296015pJ(inputStream, j);
        }
        return r4;
    }

    public static void A03(HTTPRequestError hTTPRequestError, RequestStatsObserver requestStatsObserver, 1QS r9) {
        Map map = r9.A0A;
        if (map.get("ta_enabled") != null) {
            map.get(AnonymousClass000.A00(1766));
            RequestStats requestStats = requestStatsObserver.getRequestStats();
            if (requestStats == null) {
                AnonymousClass20W.A00();
                return;
            }
            TraceEvent[] traceEventArr = requestStats.mEvents;
            int length = traceEventArr.length;
            int i = 0;
            while (i < length && !TraceEventType.TotalRequest.equals(traceEventArr[i].mName)) {
                i++;
            }
            map.get("enqueue_time");
            HashMap A1E = AnonymousClass7TE.A1E();
            String str = null;
            for (1Fn r2 : r9.A01) {
                String str2 = r2.A00;
                if (str2.equals("Range")) {
                    str = r2.A01;
                } else if (AnonymousClass20W.A05.containsValue(str2)) {
                    A1E.put(r2.A00, r2.A01);
                }
            }
            Pair A0K = Pxe.A0K(str, A1E);
            Object obj = A0K.first;
            Map map2 = (Map) A0K.second;
            Map flowTimeData = requestStats.getFlowTimeData();
            if (obj == null) {
                flowTimeData.get(AnonymousClass000.A00(5165));
            }
            flowTimeData.get("uri");
            if (hTTPRequestError == null) {
                flowTimeData.get(TraceFieldType.Error);
            }
            A04(TraceFieldType.RequestSendTime, flowTimeData);
            A04(TraceFieldType.TTFB, flowTimeData);
            A04(TraceFieldType.TTLB, flowTimeData);
            String A11 = DbT.A11(TraceFieldType.LocalPort, flowTimeData);
            if (A11 != null) {
                try {
                    Integer.parseInt(A11);
                } catch (NumberFormatException unused) {
                }
            }
            String A112 = DbT.A11(AnonymousClass000.A00(3884), flowTimeData);
            if (A112 != null) {
                try {
                    Integer.parseInt(A112);
                } catch (NumberFormatException unused2) {
                }
            }
            String A113 = DbT.A11(TraceFieldType.ReqBodySize, flowTimeData);
            if (A113 != null) {
                try {
                    Integer.parseInt(A113);
                } catch (NumberFormatException unused3) {
                }
            }
            String A114 = DbT.A11(AnonymousClass000.A00(3891), flowTimeData);
            if (A114 != null) {
                try {
                    Integer.parseInt(A114);
                } catch (NumberFormatException unused4) {
                }
            }
            String A115 = DbT.A11(AnonymousClass000.A00(3889), flowTimeData);
            if (A115 != null) {
                try {
                    Integer.parseInt(A115);
                } catch (NumberFormatException unused5) {
                }
            }
            flowTimeData.get(TraceFieldType.NewSession);
            A04(TraceFieldType.ServerRtx, flowTimeData);
            A04(AnonymousClass000.A00(5359), flowTimeData);
            A04(AnonymousClass000.A00(4784), flowTimeData);
            A04(AnonymousClass000.A00(4990), flowTimeData);
            String A116 = DbT.A11(TraceFieldType.StatusCode, flowTimeData);
            if (A116 != null) {
                try {
                    Integer.parseInt(A116);
                } catch (NumberFormatException unused6) {
                }
            }
            AnonymousClass20W.A01(new AnonymousClass3J8((ArrayList) null, map2));
        }
    }

    public static void A04(String str, Map map) {
        String A11 = DbT.A11(str, map);
        if (A11 != null) {
            try {
                Long.parseLong(A11);
            } catch (NumberFormatException unused) {
            }
        }
    }
}
