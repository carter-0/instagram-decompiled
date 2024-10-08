package X;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.traffic.knob.DebugStrOptions;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckStartEvent;
import com.facebook.video.heroplayer.ipc.HttpTransferRequestedEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3wy  reason: invalid class name and case insensitive filesystem */
public final class C257173wy implements C250813m6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = -1;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E = 0;
    public long A0F = 0;
    public long A0G;
    public long A0H;
    public long A0I = -1;
    public long A0J = -1;
    public long A0K = -1;
    public long A0L = -1;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public long A0S;
    public long A0T;
    public long A0U = -1;
    public C257183wz A0V;
    public C252463p9 A0W;
    public IOException A0X;
    public Long A0Y = null;
    public Long A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public int A17 = -2;
    public long A18 = 0;
    public 28e A19;
    public final long A1A;
    public final 28m A1B;
    public final VpsEventCallback A1C;
    public final String A1D;
    public final String A1E;
    public final AtomicBoolean A1F;
    public final AtomicBoolean A1G;
    public final boolean A1H;
    public final C257163wx A1I;
    public final AnonymousClass27W A1J;
    public final C697227w A1K;
    public final boolean A1L;

    public static HashMap A00(C257173wy r3) {
        HashMap hashMap = new HashMap();
        String str = r3.A0s;
        if (str == null) {
            str = "<null>";
        }
        hashMap.put("url", str);
        hashMap.put("predicted_number", Integer.valueOf(r3.A04));
        hashMap.put("tigon_transaction_id", 0);
        return hashMap;
    }

    public static void A01(C257173wy r111, long j, boolean z) {
        String str;
        C257173wy r2 = r111;
        VpsEventCallback vpsEventCallback = r2.A1C;
        if (vpsEventCallback != null) {
            long j2 = r2.A0M;
            if (j2 <= 0) {
                j2 = r2.A0R;
            }
            IOException iOException = r2.A0X;
            C252463p9 r7 = r2.A0W;
            if (iOException != null) {
                str = iOException.getMessage();
            } else {
                str = "";
            }
            String str2 = r2.A1E;
            long j3 = r2.A1A;
            String A002 = 1Qm.A00(r2.A0s);
            boolean z2 = r2.A11;
            long j4 = r2.A0R;
            long max = Math.max(j2 - j4, -1);
            long max2 = Math.max(r2.A0S - j4, -1);
            long max3 = Math.max(j - j4, -1);
            int i = r2.A0B;
            C257183wz r110 = r2.A0V;
            boolean z3 = r2.A1F.get();
            boolean z4 = r2.A1G.get();
            String str3 = r2.A0n;
            long j5 = r2.A0D;
            long j6 = r2.A0E;
            int i2 = r7.A00;
            int i3 = r2.A17;
            long j7 = r2.A0N;
            int i4 = r2.A0A;
            String str4 = r2.A0f;
            String str5 = r2.A0r;
            String str6 = r2.A0d;
            int i5 = r2.A08;
            long j8 = r2.A0C;
            boolean z5 = r2.A0y;
            int i6 = r2.A00;
            long j9 = r2.A0O;
            long j10 = r2.A0P;
            boolean z6 = r2.A13;
            boolean z7 = r2.A14;
            boolean z8 = r2.A15;
            String str7 = r2.A0b;
            long j11 = r2.A0T;
            String str8 = r2.A0a;
            long j12 = r2.A0I;
            long j13 = r2.A0J;
            long j14 = r2.A0K;
            int i7 = r2.A01;
            long j15 = r2.A0H;
            String str9 = r2.A0o;
            boolean z9 = r2.A0w;
            boolean z10 = r2.A0x;
            boolean z11 = r2.A12;
            boolean z12 = r2.A0u;
            boolean z13 = r2.A0z;
            boolean z14 = r2.A0v;
            boolean z15 = r2.A10;
            int i8 = r2.A09;
            int i9 = r2.A04;
            long j16 = r2.A0L;
            String str10 = r2.A0h;
            String str11 = r2.A0m;
            String str12 = r2.A0c;
            long j17 = r2.A0F;
            String str13 = r2.A0e;
            int i10 = r2.A06;
            long j18 = r2.A0G;
            int i11 = r2.A03;
            int i12 = r2.A07;
            String str14 = r2.A0j;
            String str15 = r2.A0k;
            String str16 = r2.A0i;
            String str17 = r2.A0l;
            String str18 = r2.A0q;
            String str19 = r2.A0t;
            int i13 = r2.A05;
            long max4 = Math.max(r2.A18 - r2.A0R, -1);
            Long l = r2.A0Y;
            Long l2 = r2.A0Z;
            28e r5 = r2.A19;
            String str20 = r2.A0p;
            C257183wz r12 = r110;
            28e r13 = r5;
            Long l3 = l;
            Long l4 = l2;
            String str21 = str2;
            vpsEventCallback.callback(new C257293xA(r12, r13, l3, l4, str21, A002, str, r2.A1D, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, r2.A0g, r2.A02, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, j, j3, max, max2, max3, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, max4, r2.A0U, z2, z3, z4, z5, z6, z7, z8, z, z9, z10, z11, z12, z13, z14, z15));
        }
    }

    public static void A02(C257173wy r5, HashMap hashMap) {
        if (r5.A0Q == 0) {
            r5.A0Q = SystemClock.elapsedRealtime();
        }
        hashMap.put("transfer_start_time_ms", Long.valueOf(r5.A0S));
        hashMap.put("request_start_time_ms", Long.valueOf(r5.A0M));
        hashMap.put("transfer_end_time_ms", Long.valueOf(r5.A0Q));
        hashMap.put("transfer_end_lastcall_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        hashMap.put("first_chunk_transfer_end_time_ms", Long.valueOf(r5.A18));
        hashMap.put("total_bytes", Integer.valueOf(r5.A02));
    }

    public final void Czk(C257113ws r4, C257263x7 r5, int i, boolean z) {
        int i2;
        this.A02 += i;
        VpsEventCallback vpsEventCallback = this.A1C;
        if (vpsEventCallback != null && this.A0W == C252463p9.LIVE_VIDEO && this.A16) {
            vpsEventCallback.callback(new C7941Qde(this.A1E, i));
        }
        if (this.A0v && (i2 = this.A05) > 0 && this.A02 >= i2) {
            this.A18 = SystemClock.elapsedRealtime();
        }
    }

    public final void DFs(C257183wz r15, long j, long j2, long j3) {
        VpsEventCallback vpsEventCallback = this.A1C;
        if (vpsEventCallback != null) {
            C252463p9 r0 = this.A0W;
            C257183wz r3 = r15;
            vpsEventCallback.callback(new FirstDataSegmentCacheCheckEndEvent(r3, this.A1E, r0.A00, this.A1A, j, j2, j3));
        }
    }

    public final void DFt(long j, long j2) {
        VpsEventCallback vpsEventCallback = this.A1C;
        if (vpsEventCallback != null) {
            long j3 = j;
            long j4 = j2;
            vpsEventCallback.callback(new FirstDataSegmentCacheCheckStartEvent(this.A1E, this.A1A, j3, j4, this.A0W.A00));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DtY(java.io.IOException r5) {
        /*
            r4 = this;
            r4.A0X = r5
            boolean r0 = r5 instanceof X.C2609447q
            r2 = 0
            if (r0 == 0) goto L_0x0044
            r1 = r5
            X.47q r1 = (X.C2609447q) r1
            java.util.Map r3 = r1.A01
            java.lang.String r0 = "x-fb-one"
            java.lang.String r0 = X.C21993XpG.A01(r0, r3)
            if (r0 == 0) goto L_0x0019
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x001c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.A0k = r0
            boolean r0 = X.C21993XpG.A02(r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.A0i = r0
            java.lang.String r0 = "x-fb-one-variant"
            java.lang.String r0 = X.C21993XpG.A01(r0, r3)
            r4.A0l = r0
            int r1 = r1.A00
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x0044
            long r0 = X.C2607847a.A00(r3, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0Z = r0
        L_0x0044:
            long r0 = android.os.SystemClock.elapsedRealtime()
            A01(r4, r0, r2)
            java.util.HashMap r2 = A00(r4)
            java.lang.String r1 = r5.getLocalizedMessage()
            java.lang.String r0 = "error_message"
            r2.put(r0, r1)
            A02(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257173wy.DtY(java.io.IOException):void");
    }

    public final void Dtb(String str, Object obj) {
        try {
            if ("X-FB-Connection-Quality".equals(str)) {
                this.A0d = (String) obj;
            } else if ("up-ttfb".equals(str) && obj != null) {
                this.A0T = Long.parseLong((String) obj);
            } else if ("x-fb-session-id".equals(str) && obj != null) {
                this.A0a = (String) obj;
            } else if ("x-fb-edge-hit".equals(str) && obj != null) {
                this.A0h = (String) obj;
            } else if ("x-fb-origin-hit".equals(str) && obj != null) {
                this.A0m = (String) obj;
            } else if ("x-fb-response-time-ms".equals(str) && obj != null) {
                this.A0F = Long.parseLong((String) obj);
            } else if ("x-fb-dynamic-latest-segment-id".equals(str) && obj != null) {
                this.A06 = Integer.parseInt((String) obj);
            } else if ("x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) && obj != null) {
                this.A05 = Integer.parseInt((String) obj);
            } else if ("x-fb-dynamic-client-wallclock-offset-ms".equalsIgnoreCase(str) && obj != null) {
                this.A0Y = Long.valueOf(Long.parseLong((String) obj));
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: finally extract failed */
    public final void Dtd(C257183wz r102, C257263x7 r103) {
        VpsEventCallback vpsEventCallback;
        String str;
        C252463p9 A002;
        28u r6;
        C257263x7 r4 = r103;
        Uri uri = r4.A06;
        String obj = uri.toString();
        uri.getHost();
        C257253x6 r8 = r4.A07;
        long j = (long) r8.A08;
        int i = r8.A07;
        long j2 = r4.A04;
        long j3 = r4.A03;
        String str2 = r8.A0M;
        int i2 = r8.A05;
        long j4 = r8.A0A;
        boolean z = r8.A0T;
        int i3 = r8.A00;
        C257223x3 r28 = r8.A0I;
        long j5 = r8.A0C;
        int i4 = r8.A09;
        boolean z2 = r8.A0V;
        boolean z3 = r8.A0S;
        boolean z4 = r8.A0U;
        int i5 = r8.A06;
        int i6 = r8.A02;
        long j6 = r8.A0E;
        long j7 = r8.A0B;
        int i7 = r8.A01;
        int i8 = r8.A04;
        long j8 = r8.A0G;
        Map map = r8.A0Q;
        try {
            27d.A01("HttpTransferEventTracker.onTransferRequested");
            this.A0s = obj;
            this.A0R = SystemClock.elapsedRealtime();
            this.A0U = j8;
            if (j3 >= 0) {
                this.A0E = j3;
            } else {
                this.A0E = 0;
            }
            if (this.A0W == C252463p9.DASH_UNKNOWN && i4 != -1) {
                this.A0W = C252463p9.A00(i4);
            }
            this.A0S = 0;
            this.A0M = -1;
            this.A0Q = 0;
            this.A02 = 0;
            this.A0N = j;
            this.A0A = i;
            this.A0B++;
            this.A0X = null;
            this.A0Z = null;
            this.A0V = r102;
            this.A0D = j2;
            this.A0r = str2;
            this.A08 = i2;
            this.A0C = j4;
            this.A0y = z;
            this.A12 = z2;
            this.A0u = z3;
            this.A10 = z4;
            this.A09 = i5;
            this.A04 = i6;
            this.A0L = j6;
            this.A0G = j7;
            this.A03 = i7;
            this.A07 = i8;
            if (j5 < 0) {
                this.A00 = i3;
            } else {
                int i9 = i3 - ((int) (this.A0R - j5));
                this.A00 = i9;
                if (i9 < 0) {
                    this.A00 = 0;
                }
            }
            this.A01 = i3;
            this.A0H = j5;
            28m r62 = this.A1B;
            if (r62 != null) {
                VideoBandwidthEstimate A003 = r62.A00();
                this.A0b = A003.toString();
                this.A0O = A003.bandwidthBps;
                this.A0P = A003.ttfbMs;
                if (this.A1H && ((A002 = C252463p9.A00(i4)) == C252463p9.DASH_VIDEO || A002 == C252463p9.PROGRESSIVE || A002 == C252463p9.LIVE_VIDEO)) {
                    if (r62.A03 == null) {
                        r6 = 28m.A04;
                    } else {
                        r6 = new 28u(new InbandTelemetryBweEstimate(new InbandTelemetryBweEstimate.Builder()));
                    }
                    this.A0b = 002.A0R(this.A0b, 002.A0R(", itbe=", r6.A00.getDebugStr(new DebugStrOptions(new DebugStrOptions.Builder()))));
                }
            } else {
                this.A0O = -1;
                this.A0P = -1;
                this.A0b = "";
            }
            this.A11 = r28.A02;
            this.A0T = 0;
            this.A0a = null;
            this.A0I = -1;
            this.A0J = -1;
            this.A0K = -1;
            this.A0j = null;
            this.A0k = null;
            this.A0i = null;
            this.A0l = null;
            this.A0g = null;
            this.A0p = null;
            if (map.containsKey("os_param")) {
                this.A0j = (String) map.get("os_param");
                if (!this.A0s.contains("os_param") && !TextUtils.isEmpty(this.A0j)) {
                    this.A0s = 002.A0g(this.A0s, "&os_param=", this.A0j);
                }
            }
            if (map.containsKey("x-fb-psid")) {
                this.A0p = (String) map.get("x-fb-psid");
            }
            A00(this);
            27d.A00();
            if (this.A1L && this.A0N == 0 && (vpsEventCallback = this.A1C) != null) {
                IOException iOException = this.A0X;
                C252463p9 r2 = this.A0W;
                if (iOException != null) {
                    str = iOException.getMessage();
                } else {
                    str = "";
                }
                long j9 = this.A0R;
                String str3 = this.A1E;
                long j10 = this.A1A;
                String A004 = 1Qm.A00(this.A0s);
                boolean z5 = this.A11;
                String str4 = this.A1D;
                int i10 = this.A0B;
                C257183wz r98 = this.A0V;
                boolean z6 = this.A1F.get();
                boolean z7 = this.A1G.get();
                String str5 = this.A0n;
                long j11 = this.A0D;
                long j12 = this.A0E;
                int i11 = r2.A00;
                long j13 = this.A0N;
                int i12 = this.A0A;
                String str6 = this.A0f;
                String str7 = this.A0r;
                int i13 = this.A08;
                long j14 = this.A0C;
                boolean z8 = this.A0y;
                int i14 = this.A00;
                long j15 = this.A0O;
                long j16 = this.A0P;
                boolean z9 = this.A13;
                boolean z10 = this.A14;
                boolean z11 = this.A15;
                String str8 = this.A0b;
                long j17 = this.A0T;
                long j18 = this.A0I;
                long j19 = this.A0J;
                long j20 = this.A0K;
                int i15 = this.A01;
                long j21 = this.A0H;
                String str9 = this.A0o;
                boolean z12 = this.A0w;
                boolean z13 = this.A0x;
                boolean z14 = this.A12;
                boolean z15 = this.A0u;
                boolean z16 = this.A0z;
                boolean z17 = this.A0v;
                boolean z18 = this.A10;
                int i16 = this.A09;
                int i17 = this.A04;
                long j22 = this.A0L;
                String str10 = this.A0c;
                long j23 = this.A0F;
                String str11 = this.A0e;
                int i18 = this.A06;
                long j24 = this.A0G;
                C257183wz r15 = r98;
                String str12 = str3;
                String str13 = str4;
                String str14 = str5;
                String str15 = str6;
                String str16 = str7;
                String str17 = str8;
                String str18 = str9;
                String str19 = str10;
                String str20 = str11;
                vpsEventCallback.callback(new HttpTransferRequestedEvent(r15, str12, A004, str, str13, str14, str15, str16, str17, str18, str19, str20, this.A0j, this.A0k, this.A0i, this.A0l, this.A0q, this.A0t, i10, i11, i12, i13, i14, i15, i16, i17, i18, this.A03, this.A07, this.A05, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18));
            }
        } catch (Throwable th) {
            27d.A00();
            throw th;
        }
    }

    public final void Dtf(C257113ws r101, C257263x7 r102, boolean z, boolean z2) {
        VpsEventCallback vpsEventCallback;
        String str;
        this.A0v = z2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A0S = elapsedRealtime;
        C257253x6 r0 = r102.A07;
        if (r0 != null) {
            this.A17 = r0.A09;
        }
        if (this.A1L && this.A0N == 0 && (vpsEventCallback = this.A1C) != null) {
            long j = this.A0M;
            if (j <= 0) {
                j = this.A0R;
            }
            IOException iOException = this.A0X;
            C252463p9 r7 = this.A0W;
            if (iOException != null) {
                str = iOException.getMessage();
            } else {
                str = "";
            }
            String str2 = this.A1E;
            long j2 = this.A1A;
            String A002 = 1Qm.A00(this.A0s);
            boolean z3 = this.A11;
            String str3 = this.A1D;
            long j3 = this.A0R;
            long max = Math.max(j - j3, -1);
            long max2 = Math.max(this.A0S - j3, -1);
            int i = this.A0B;
            C257183wz r15 = this.A0V;
            boolean z4 = this.A1F.get();
            boolean z5 = this.A1G.get();
            String str4 = this.A0n;
            long j4 = this.A0D;
            long j5 = this.A0E;
            int i2 = r7.A00;
            long j6 = this.A0N;
            int i3 = this.A0A;
            String str5 = this.A0f;
            String str6 = this.A0r;
            String str7 = this.A0d;
            int i4 = this.A08;
            long j7 = this.A0C;
            boolean z6 = this.A0y;
            int i5 = this.A00;
            long j8 = this.A0O;
            long j9 = this.A0P;
            boolean z7 = this.A13;
            boolean z8 = this.A14;
            boolean z9 = this.A15;
            String str8 = this.A0b;
            long j10 = this.A0T;
            String str9 = this.A0a;
            long j11 = this.A0I;
            long j12 = this.A0J;
            long j13 = this.A0K;
            int i6 = this.A01;
            long j14 = this.A0H;
            String str10 = this.A0o;
            boolean z10 = this.A0w;
            boolean z11 = this.A0x;
            boolean z12 = this.A12;
            boolean z13 = this.A0u;
            boolean z14 = this.A0z;
            boolean z15 = this.A0v;
            boolean z16 = this.A10;
            int i7 = this.A09;
            int i8 = this.A04;
            long j15 = this.A0L;
            String str11 = this.A0h;
            String str12 = this.A0m;
            String str13 = this.A0c;
            long j16 = this.A0F;
            String str14 = this.A0e;
            int i9 = this.A06;
            long j17 = this.A0G;
            int i10 = this.A03;
            int i11 = this.A07;
            vpsEventCallback.callback(new AnonymousClass5H3(r15, this.A0Y, this.A0Z, str2, A002, str, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, this.A0j, this.A0k, this.A0i, this.A0l, this.A0q, this.A0t, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, this.A05, elapsedRealtime, j2, max, max2, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16));
        }
        VpsEventCallback vpsEventCallback2 = this.A1C;
        if (vpsEventCallback2 != null && this.A0W == C252463p9.LIVE_MANIFEST && this.A16) {
            vpsEventCallback2.callback(new C7940Qdd(this.A1E, System.currentTimeMillis()));
        }
        A00(this);
    }

    public C257173wy(28m r4, VpsEventCallback vpsEventCallback, C252463p9 r6, C257163wx r7, C257063wn r8, AnonymousClass27W r9, String str, String str2, String str3, String str4, String str5, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A1C = vpsEventCallback;
        this.A1K = C697227w.A00;
        this.A1E = r8.A07;
        this.A1A = j;
        this.A11 = z;
        this.A1D = str2;
        this.A1F = atomicBoolean;
        this.A1G = atomicBoolean2;
        String str6 = r8.A03;
        this.A0n = str6 == null ? "" : str6;
        this.A0o = r8.A04;
        this.A0q = str;
        this.A0f = str3;
        this.A1B = r4;
        this.A0V = C257183wz.NOT_APPLY;
        this.A0W = r6;
        this.A13 = z2;
        this.A14 = z3;
        this.A15 = z4;
        this.A1J = r9;
        this.A0w = z5;
        this.A0x = z6;
        this.A0z = z7;
        this.A1H = z8;
        this.A1L = z9;
        this.A0c = str4;
        this.A0e = r8.A02.name();
        this.A0t = str5;
        this.A1I = r7;
        this.A19 = r8.A00;
    }

    public final void DtW() {
        A01(this, SystemClock.elapsedRealtime(), true);
        A02(this, A00(this));
    }

    public final void DtX(C257113ws r4, C257263x7 r5, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A0X == null) {
            A01(this, elapsedRealtime, false);
        }
        A02(this, A00(this));
    }

    public final void EUi(String str) {
        this.A0g = str;
    }
}
