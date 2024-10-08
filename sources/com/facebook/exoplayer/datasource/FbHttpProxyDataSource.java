package com.facebook.exoplayer.datasource;

import X.27B;
import X.C22189Xx0;
import X.C250813m6;
import X.C250823m7;
import X.C256703wD;
import X.C257063wn;
import X.C257103wr;
import X.C257133wu;
import X.C257183wz;
import X.C257223x3;
import X.C257233x4;
import X.C257243x5;
import X.C257253x6;
import X.C257263x7;
import X.C2607847a;
import X.C56499HzV;
import android.net.Uri;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class FbHttpProxyDataSource implements C257103wr, C257133wu {
    public C257103wr A00;
    public int A01;
    public long A02 = 0;
    public C250813m6 A03;
    public final C257063wn A04;
    public final HeroPlayerSetting A05;

    public final synchronized void close() {
        this.A00.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.A02     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x000c
            monitor-exit(r6)
            return r5
        L_0x000c:
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0018
            long r2 = (long) r9
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0028 }
            int r9 = (int) r0     // Catch:{ all -> 0x0028 }
        L_0x0018:
            X.3wr r0 = r6.A00     // Catch:{ all -> 0x0028 }
            int r4 = r0.read(r7, r8, r9)     // Catch:{ all -> 0x0028 }
            if (r4 == r5) goto L_0x0026
            long r2 = r6.A02     // Catch:{ all -> 0x0028 }
            long r0 = (long) r4     // Catch:{ all -> 0x0028 }
            long r2 = r2 - r0
            r6.A02 = r2     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r6)
            return r4
        L_0x0028:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.read(byte[], int, int):int");
    }

    public final void cancel() {
    }

    public final void changeHttpPriority(byte b, boolean z) {
        this.A00.changeHttpPriority(b, z);
    }

    public final Map getResponseHeaders() {
        return this.A00.getResponseHeaders();
    }

    public final Uri getUri() {
        return this.A00.getUri();
    }

    public final synchronized long open(C257263x7 r34) {
        boolean z;
        String str;
        String str2;
        long max;
        Boolean valueOf;
        synchronized (this) {
            C257263x7 r6 = r34;
            Uri uri = r6.A06;
            C257253x6 r5 = r6.A07;
            C257223x3 r0 = r5.A0I;
            if (r0 != null) {
                z = r0.A02;
                str = r0.A00;
                str2 = r0.A01;
            } else {
                z = false;
                str = "";
                str2 = str;
            }
            String str3 = this.A04.A07;
            C257223x3 r02 = new C257223x3(str, z, str2);
            C257243x5 r10 = r5.A0H;
            if (r10 == null) {
                r10 = C257233x4.A01.A00;
            }
            if (z) {
                r10 = C257233x4.A03.A00;
            }
            String str4 = null;
            Map emptyMap = Collections.emptyMap();
            if (uri == null) {
                uri = Uri.EMPTY;
            }
            byte[] bArr = r6.A0A;
            long j = r6.A02;
            long j2 = r6.A04;
            long j3 = j - j2;
            long j4 = r6.A03;
            if (j4 <= 0) {
                j4 = -1;
            }
            int i = r6.A00;
            C257253x6 r23 = new C257253x6(r10, r02, r5, (String) null, this.A01, -1, false);
            String str5 = r6.A08;
            if (str5 != null) {
                str4 = str5;
            }
            C256703wD.A02(uri);
            C257263x7 r18 = new C257263x7(uri, r23, str4, emptyMap, bArr, 1, i, j3, j2, j4);
            HeroPlayerSetting heroPlayerSetting = this.A05;
            if (heroPlayerSetting.A0z.enableSloHttpHeaderLogging) {
                if (str3 != null) {
                    C56499HzV hzV = C56499HzV.A01;
                    synchronized (hzV) {
                        try {
                            boolean z2 = false;
                            if (hzV.A00.get(str3) != null) {
                                z2 = true;
                            }
                            valueOf = Boolean.valueOf(z2);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (valueOf.booleanValue()) {
                    }
                }
                Map map = r5.A0Q;
                if (!map.containsKey("x-fb-qpl-ec")) {
                    C2607847a.A02(r6);
                }
                String str6 = (String) map.get("x-fb-qpl-ec");
                if (str6 != null) {
                    r18.A01(map);
                    C56499HzV hzV2 = C56499HzV.A01;
                    synchronized (hzV2) {
                        try {
                            hzV2.A00.put(str3, str6);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
            try {
                C250813m6 r1 = this.A03;
                if (r1 != null) {
                    r1.Dtd(C257183wz.NOT_CACHED, r18);
                }
                C257103wr r12 = this.A00;
                long open = r12.open(r18);
                boolean z3 = false;
                if (heroPlayerSetting.A1p) {
                    z3 = true;
                }
                Map responseHeaders = r12.getResponseHeaders();
                if (!(responseHeaders == null || this.A03 == null)) {
                    List A012 = C2607847a.A01("X-FB-Connection-Quality", responseHeaders, z3);
                    if (A012 != null) {
                        this.A03.Dtb("X-FB-Connection-Quality", (String) A012.get(0));
                    }
                    List list = (List) responseHeaders.get("x-fb-cec-video-limit");
                    if (list != null) {
                        this.A03.Dtb("x-fb-cec-video-limit", (String) list.get(0));
                    }
                    List list2 = (List) responseHeaders.get("up-ttfb");
                    if (list2 != null) {
                        this.A03.Dtb("up-ttfb", list2.get(0));
                    }
                    List list3 = (List) responseHeaders.get("x-fb-session-id");
                    if (list3 != null) {
                        this.A03.Dtb("x-fb-session-id", list3.get(0));
                    }
                    List list4 = (List) responseHeaders.get("x-fb-response-time-ms");
                    if (list4 != null) {
                        this.A03.Dtb("x-fb-response-time-ms", list4.get(0));
                    }
                    List list5 = (List) responseHeaders.get("x-bwe-mean");
                    if (list5 != null) {
                        this.A03.Dtb("x-bwe-mean", list5.get(0));
                    }
                    List list6 = (List) responseHeaders.get("x-bwe-std-dev");
                    if (list6 != null) {
                        this.A03.Dtb("x-bwe-std-dev", list6.get(0));
                    }
                    List list7 = (List) responseHeaders.get("x-fb-dynamic-predictive-response-chunk-size");
                    if (list7 != null) {
                        this.A03.Dtb("x-fb-dynamic-predictive-response-chunk-size", list7.get(0));
                    }
                    for (Map.Entry entry : responseHeaders.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty() && ((String) entry.getKey()).startsWith("x-fb-ull-")) {
                            this.A03.Dtb((String) entry.getKey(), ((List) entry.getValue()).get(0));
                        }
                    }
                }
                long A002 = C2607847a.A00(responseHeaders, z3);
                long j5 = r18.A04;
                max = Math.max(0, A002 - j5);
                if (open == -1 || open > max) {
                    this.A02 = max;
                } else {
                    this.A02 = open;
                }
                Long valueOf2 = Long.valueOf(j5);
                long j6 = r18.A03;
                27B.A01("com.facebook.exoplayer.datasource.FbHttpProxyDataSource", "Opening data spec Offset: %d, Length %d Open Length %d Videoid %s Key %s", new Object[]{valueOf2, Long.valueOf(j6), Long.valueOf(max), str3, r18.A08});
                if (j6 != -1) {
                    max = Math.min(open, max);
                }
            } catch (IOException e) {
                th = e;
                throw th;
            }
        }
        return max;
    }

    public FbHttpProxyDataSource(C250813m6 r3, C257063wn r4, HeroPlayerSetting heroPlayerSetting, C257103wr r6, int i) {
        this.A04 = r4;
        this.A00 = r6;
        this.A01 = i;
        this.A03 = r3;
        this.A05 = heroPlayerSetting;
    }

    public final void addTransferListener(C250823m7 r2) {
        C250813m6 xx0;
        r2.getClass();
        if (r2 instanceof C250813m6) {
            xx0 = (C250813m6) r2;
        } else {
            xx0 = new C22189Xx0(r2);
        }
        this.A03 = xx0;
    }
}
