package X;

import android.net.Uri;
import android.util.Pair;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3x0  reason: invalid class name and case insensitive filesystem */
public final class C257193x0 implements C257133wu {
    public long A00;
    public long A01 = -1;
    public long A02;
    public C257283x9 A03;
    public AnonymousClass5AJ A04;
    public AnonymousClass47P A05;
    public C257113ws A06;
    public C257103wr A07;
    public 2R9 A08;
    public boolean A09;
    public boolean A0A;
    public long A0B;
    public long A0C;
    public C250813m6 A0D;
    public boolean A0E;
    public boolean A0F = false;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final 29t A0J;
    public final C252463p9 A0K;
    public final C257063wn A0L;
    public final HeroPlayerSetting A0M;
    public final C257203x1 A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final AnonymousClass29r A0Q;
    public final AtomicBoolean A0R;

    /* JADX WARNING: Removed duplicated region for block: B:44:0x009e A[SYNTHETIC, Splitter:B:44:0x009e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r8 = this;
            r3 = 0
            java.lang.String r0 = "exo-closecurrentstream"
            X.27d.A01(r0)     // Catch:{ all -> 0x00b4 }
            X.2R9 r0 = r8.A08     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x0032
            r8.hashCode()     // Catch:{ all -> 0x00b4 }
        L_0x000d:
            X.3ws r0 = r8.A06     // Catch:{ all -> 0x00b4 }
            r2 = 1
            if (r0 == 0) goto L_0x0071
            X.3m6 r1 = r8.A0D     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x001d
            boolean r0 = r8.A0E     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x002a
            r1.DtW()     // Catch:{ all -> 0x00b4 }
        L_0x001d:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r8.A0M     // Catch:{ all -> 0x00b4 }
            boolean r0 = r0.A1k     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r4 = "DataSource Close has been interrupted by loadable.cancel: %s"
            X.3ws r0 = r8.A06     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0071
            goto L_0x003d
        L_0x002a:
            X.3x7 r0 = r8.A00()     // Catch:{ all -> 0x00b4 }
            r1.DtX(r8, r0, r2)     // Catch:{ all -> 0x00b4 }
            goto L_0x001d
        L_0x0032:
            r8.hashCode()     // Catch:{ all -> 0x00b4 }
            java.io.File r0 = r0.A05     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x000d
            r0.getPath()     // Catch:{ all -> 0x00b4 }
            goto L_0x000d
        L_0x003d:
            r0.close()     // Catch:{ 47r -> 0x0043, InterruptedIOException -> 0x0041 }
            goto L_0x006f
        L_0x0041:
            r0 = move-exception
            goto L_0x0057
        L_0x0043:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0066 }
            boolean r0 = r0 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = "FbHttpCacheDataSource"
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0066 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0066 }
            goto L_0x0061
        L_0x0057:
            java.lang.String r1 = "FbHttpCacheDataSource"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0066 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0066 }
        L_0x0061:
            X.27B.A01(r1, r4, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x006f
        L_0x0065:
            throw r2     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            r8.A06 = r3     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x006a:
            X.3ws r0 = r8.A06     // Catch:{ all -> 0x00b4 }
            r0.close()     // Catch:{ all -> 0x00b4 }
        L_0x006f:
            r8.A06 = r3     // Catch:{ all -> 0x00b4 }
        L_0x0071:
            X.2R9 r2 = r8.A08     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00a3
            boolean r0 = r2.A07     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00a3
            java.lang.String r7 = "FbHttpCacheDataSource"
            java.lang.String r6 = "Cache data sink close stream. Type:%s, Offset:%d, FileSize:%d, Vid:%s, Key:%s"
            X.3p9 r5 = r8.A0K     // Catch:{ all -> 0x00b4 }
            long r0 = r2.A04     // Catch:{ all -> 0x00b4 }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b4 }
            long r0 = r2.A03     // Catch:{ all -> 0x00b4 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b4 }
            X.3wn r0 = r8.A0L     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = r0.A07     // Catch:{ all -> 0x00b4 }
            X.3x9 r0 = r8.A03     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x00b4 }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4, r2, r1, r0}     // Catch:{ all -> 0x00b4 }
            X.27B.A01(r7, r6, r0)     // Catch:{ all -> 0x00b4 }
            X.47P r0 = r8.A05     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ 47t -> 0x00a3 }
            r8.A05 = r3     // Catch:{ 47t -> 0x00a3 }
        L_0x00a3:
            X.2R9 r1 = r8.A08
            if (r1 == 0) goto L_0x00ae
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x00ae
            r8.A03(r1)
        L_0x00ae:
            r8.A08 = r3
            X.27d.A00()
            return
        L_0x00b4:
            r2 = move-exception
            X.2R9 r1 = r8.A08
            if (r1 == 0) goto L_0x00c0
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x00c0
            r8.A03(r1)
        L_0x00c0:
            r8.A08 = r3
            X.27d.A00()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257193x0.A02():void");
    }

    public final void cancel() {
        this.A09 = false;
        this.A01 = -1;
        this.A0E = true;
    }

    public final Uri getUri() {
        return null;
    }

    public final long open(C257263x7 r23) {
        Boolean valueOf;
        long j;
        C257283x9 r11;
        Uri uri;
        this.A0E = false;
        C257263x7 r5 = r23;
        try {
            String str = r5.A08;
            C257063wn r9 = this.A0L;
            String str2 = r9.A07;
            Uri uri2 = r5.A06;
            boolean z = r9.A01;
            HeroPlayerSetting heroPlayerSetting = this.A0M;
            boolean z2 = heroPlayerSetting.A3G;
            String A002 = 27B.A00(uri2, str, str2, z, z2);
            if (heroPlayerSetting.A1Q) {
                2OG A032 = this.A0J.A03();
                long j2 = r5.A04;
                long j3 = r5.A03;
                long j4 = j2;
                if (!A032.CPu(A002, j4, j3)) {
                    boolean z3 = false;
                    if (!z) {
                        z3 = true;
                    }
                    String A003 = 27B.A00(uri2, str, str2, z3, z2);
                    if (A032.CPu(A003, j4, j3 / 2)) {
                        A002 = A003;
                    }
                }
            }
            if (this.A09 && (r11 = this.A03) != null) {
                long j5 = r5.A04;
                if (j5 == this.A01 && (uri = r11.A04) != null && uri.equals(uri2)) {
                    Long valueOf2 = Long.valueOf(j5);
                    long j6 = r5.A03;
                    27B.A01("FbHttpCacheDataSource", "[overfetch] datasource is already open for position: %d length: %d", new Object[]{valueOf2, Long.valueOf(j6)});
                    this.A03 = new C257283x9(r5, A002);
                    this.A09 = false;
                    this.A01 = -1;
                    return j6;
                }
            }
            if (this.A09) {
                27B.A01("FbHttpCacheDataSource", "[overfetch] unexpected position in open: ds.pos:%d of-pos:%d", new Object[]{Long.valueOf(r5.A04), Long.valueOf(this.A01)});
                A02();
                this.A09 = false;
                this.A01 = -1;
                this.A03 = null;
            } else {
                boolean z4 = false;
                if (this.A03 == null) {
                    z4 = true;
                }
                C256703wD.A04(z4);
            }
            this.A03 = new C257283x9(r5, A002);
            if (heroPlayerSetting.A0y.A0K) {
                AnonymousClass5AJ r112 = new AnonymousClass5AJ(r9, uri2.toString());
                this.A04 = r112;
                2OG A033 = this.A0J.A03();
                C257283x9 r14 = this.A03;
                long j7 = r14.A02;
                r112.A05 = j7;
                long j8 = r14.A01;
                long j9 = -1;
                if (j8 != -1) {
                    j9 = j8 + j7;
                }
                r112.A04 = j9;
                String str3 = r14.A06;
                r112.A07 = str3;
                NavigableSet AjR = A033.AjR(str3);
                boolean z5 = false;
                if (!AjR.isEmpty()) {
                    z5 = true;
                }
                r112.A09 = z5;
                long j10 = -1;
                if (!AjR.isEmpty()) {
                    long j11 = ((2R9) AjR.first()).A04;
                    2R9 r142 = (2R9) AjR.last();
                    long j12 = r142.A03;
                    if (j12 != -1) {
                        j10 = r142.A04 + j12;
                    }
                    j = j10;
                    j10 = j11;
                } else {
                    j = -1;
                }
                r112.A06 = Pair.create(Long.valueOf(j10), Long.valueOf(j));
            }
            C257253x6 r8 = r5.A07;
            A04();
            String obj = r9.A00.toString();
            C252463p9 r7 = this.A0K;
            Long valueOf3 = Long.valueOf(r5.A04);
            Long valueOf4 = Long.valueOf(r5.A02);
            long j13 = r5.A03;
            String str4 = A002;
            27B.A01("FbHttpCacheDataSource", "Cache data source open spec. RequestType: %s, StreamType:%s, Position:%d/%d, Length:%d, Vid:%s, Key:%s", new Object[]{obj, r7, valueOf3, valueOf4, Long.valueOf(j13), str2, str4});
            if (heroPlayerSetting.A0z.enableSloHttpHeaderLogging) {
                if (str2 != null) {
                    C56499HzV hzV = C56499HzV.A01;
                    synchronized (hzV) {
                        try {
                            boolean z6 = false;
                            if (hzV.A00.get(str2) != null) {
                                z6 = true;
                            }
                            valueOf = Boolean.valueOf(z6);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (valueOf.booleanValue()) {
                    }
                }
                if (r8 == null || !r8.A0Q.containsKey("x-fb-qpl-ec")) {
                    C2607847a.A02(r5);
                    if (r8 != null) {
                    }
                }
                Map map = r8.A0Q;
                Object obj2 = map.get("x-fb-qpl-ec");
                if (obj2 != null) {
                    r5.A01(map);
                    C56499HzV hzV2 = C56499HzV.A01;
                    synchronized (hzV2) {
                        try {
                            hzV2.A00.put(str2, obj2);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
            if (j13 == -1) {
                long j14 = this.A02;
                if (j14 > 0) {
                    return j14;
                }
            }
            String str5 = r9.A04;
            List asList = Arrays.asList("".split(";"));
            if (str5 != null && !str5.isEmpty() && asList.contains(str5) && j13 == -1 && r7 == C252463p9.PROGRESSIVE) {
                long j15 = this.A00;
                if (j15 > 0) {
                    return j15;
                }
            }
            return j13;
        } catch (IOException e) {
            this.A09 = false;
            this.A01 = -1;
            if (this.A0M.A0y.A0K) {
                this.A04.A08 = true;
            }
            C250813m6 r1 = this.A0D;
            if (r1 != null) {
                if (this.A0E) {
                    r1.DtW();
                } else {
                    r1.DtY(e);
                    throw e;
                }
            }
            throw e;
        }
    }

    private C257263x7 A00() {
        File file;
        C257283x9 r0 = this.A03;
        long j = r0.A02;
        long j2 = r0.A01;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        2R9 r4 = this.A08;
        if (r4 != null && r4.A07) {
            j -= r4.A04;
            j2 = Math.min(r4.A03 - j, j2);
        }
        Uri uri = Uri.EMPTY;
        if (!(r4 == null || (file = r4.A05) == null)) {
            uri = Uri.fromFile(file);
        }
        Map emptyMap = Collections.emptyMap();
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        C257283x9 r5 = this.A03;
        long j3 = r5.A00 - j;
        if (j2 <= 0) {
            j2 = -1;
        }
        String str = r5.A06;
        int i = r5.A03;
        C257253x6 r7 = r5.A05;
        C256703wD.A02(uri);
        C257263x7 r2 = C257263x7.A0B;
        if (r7 == null) {
            r7 = new C257253x6();
        }
        return new C257263x7(uri, r7, str, emptyMap, (byte[]) null, 1, i, j3, j, j2);
    }

    private 2R9 A01(C251073mW r8) {
        for (2R9 r5 : r8.AjR(this.A03.A06)) {
            if (this.A03.A02 < r5.A04) {
                return r5;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.4yF, java.lang.Object] */
    private void A03(2R9 r5) {
        29t r3 = this.A0J;
        if (r3.A03() != null) {
            if (this.A0M.A0y.A0K) {
                C279204yF r0 = C279204yF.A04;
                C279204yF r02 = r0;
                if (r0 == null) {
                    ? obj = new Object();
                    C279204yF.A04 = obj;
                    r02 = obj;
                }
                2R9 r2 = this.A08;
                C279234yI r1 = r02.A00;
                synchronized (r1) {
                    r1.A01.remove(r2);
                    r1.A00.remove(r2);
                }
            }
            r3.A03().ECd(r5);
        }
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [X.Oqt] */
    /* JADX WARNING: type inference failed for: r2v13, types: [X.4yF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0155 A[Catch:{ all -> 0x0584, all -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0160 A[SYNTHETIC, Splitter:B:113:0x0160] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0208 A[Catch:{ IOException -> 0x0275, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x024f A[Catch:{ IOException -> 0x0275, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0126 A[SYNTHETIC, Splitter:B:94:0x0126] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:263:0x0411=Splitter:B:263:0x0411, B:300:0x050c=Splitter:B:300:0x050c, B:321:0x054d=Splitter:B:321:0x054d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A04() {
        /*
            r39 = this;
            java.lang.String r0 = "exo-opennextdatasource"
            X.27d.A01(r0)     // Catch:{ all -> 0x058f }
            r0 = r39
            X.3ws r1 = r0.A06     // Catch:{ all -> 0x058f }
            r17 = 1
            r20 = 0
            r16 = 0
            if (r1 == 0) goto L_0x0013
            r16 = 1
        L_0x0013:
            r0.A02()     // Catch:{ all -> 0x058f }
            X.3x9 r1 = r0.A03     // Catch:{ all -> 0x058f }
            long r2 = r1.A01     // Catch:{ all -> 0x058f }
            r4 = -1
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0025
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0025:
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x058b
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r13 = r0.A0M     // Catch:{ all -> 0x058f }
            X.29t r1 = r0.A0J     // Catch:{ all -> 0x058f }
            r38 = r1
            X.2OG r6 = r38.A03()     // Catch:{ all -> 0x058f }
            X.3wz r5 = X.C257183wz.NOT_CACHED     // Catch:{ all -> 0x058f }
            if (r6 == 0) goto L_0x016d
            boolean r8 = r13.A2U     // Catch:{ all -> 0x058f }
            if (r8 == 0) goto L_0x0058
            X.3m6 r7 = r0.A0D     // Catch:{ all -> 0x058f }
            if (r7 == 0) goto L_0x0058
            boolean r1 = r0.A0P     // Catch:{ all -> 0x058f }
            if (r1 != 0) goto L_0x0058
            X.3x9 r2 = r0.A03     // Catch:{ all -> 0x058f }
            long r3 = r2.A00     // Catch:{ all -> 0x058f }
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x0058
            X.3x6 r1 = r2.A05     // Catch:{ all -> 0x058f }
            int r1 = r1.A08     // Catch:{ all -> 0x058f }
            if (r1 > 0) goto L_0x0058
            long r1 = r2.A01     // Catch:{ all -> 0x058f }
            r7.DFt(r3, r1)     // Catch:{ all -> 0x058f }
        L_0x0058:
            boolean r7 = r0.A0P     // Catch:{ InterruptedException -> 0x015c }
            if (r7 == 0) goto L_0x006c
            java.lang.Integer r22 = X.AnonymousClass05K.A00     // Catch:{ InterruptedException -> 0x015c }
        L_0x005e:
            boolean r1 = r13.A2B     // Catch:{ InterruptedException -> 0x015c }
            if (r1 == 0) goto L_0x00bf
            X.3x9 r1 = r0.A03     // Catch:{ InterruptedException -> 0x015c }
            java.lang.String r9 = r1.A06     // Catch:{ InterruptedException -> 0x015c }
            long r1 = r1.A02     // Catch:{ InterruptedException -> 0x015c }
            java.lang.Object r3 = r6.A01     // Catch:{ InterruptedException -> 0x015c }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x015c }
            goto L_0x006f
        L_0x006c:
            java.lang.Integer r22 = X.AnonymousClass05K.A01     // Catch:{ InterruptedException -> 0x015c }
            goto L_0x005e
        L_0x006f:
            X.3mY r4 = r6.A00     // Catch:{ all -> 0x00bc }
            r26 = -1
            r21 = r4
            r23 = r9
            r24 = r1
            X.2R9 r1 = r21.ExR(r22, r23, r24, r26)     // Catch:{ all -> 0x00bc }
            monitor-exit(r3)     // Catch:{ all -> 0x00bc }
            r0.A08 = r1     // Catch:{ InterruptedException -> 0x015c }
            if (r1 != 0) goto L_0x00b5
            X.3wz r5 = X.C257183wz.SEMI_CACHED     // Catch:{ InterruptedException -> 0x015c }
            boolean r2 = r0.A0A     // Catch:{ InterruptedException -> 0x015c }
            if (r2 != 0) goto L_0x0118
            boolean r2 = r13.A1j     // Catch:{ InterruptedException -> 0x015c }
            X.3x9 r1 = r0.A03     // Catch:{ InterruptedException -> 0x015c }
            if (r2 == 0) goto L_0x00a1
            java.lang.String r9 = r1.A06     // Catch:{ InterruptedException -> 0x015c }
            long r1 = r1.A02     // Catch:{ InterruptedException -> 0x015c }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x015c }
            r23 = r9
            r24 = r1
            X.2R9 r1 = r21.ExQ(r22, r23, r24, r26)     // Catch:{ all -> 0x009d }
            monitor-exit(r3)     // Catch:{ all -> 0x009d }
            goto L_0x0116
        L_0x009d:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009d }
            goto L_0x0123
        L_0x00a1:
            java.lang.String r9 = r1.A06     // Catch:{ InterruptedException -> 0x015c }
            long r3 = r1.A02     // Catch:{ InterruptedException -> 0x015c }
            int r1 = r0.A0G     // Catch:{ InterruptedException -> 0x015c }
            long r1 = (long) r1     // Catch:{ InterruptedException -> 0x015c }
            r21 = r6
            r23 = r9
            r24 = r3
            r26 = r1
            X.2R9 r1 = r21.ExQ(r22, r23, r24, r26)     // Catch:{ InterruptedException -> 0x015c }
            goto L_0x0116
        L_0x00b5:
            boolean r2 = r1.A07     // Catch:{ InterruptedException -> 0x015c }
            if (r2 == 0) goto L_0x0118
            X.3wz r5 = X.C257183wz.CACHED     // Catch:{ InterruptedException -> 0x015c }
            goto L_0x0118
        L_0x00bc:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00bc }
            goto L_0x0123
        L_0x00bf:
            X.3wz r5 = X.C257183wz.CACHED     // Catch:{ InterruptedException -> 0x015c }
            boolean r1 = r0.A0A     // Catch:{ InterruptedException -> 0x015c }
            if (r1 == 0) goto L_0x00e1
            X.3x9 r1 = r0.A03     // Catch:{ InterruptedException -> 0x015c }
            java.lang.String r9 = r1.A06     // Catch:{ InterruptedException -> 0x015c }
            long r1 = r1.A02     // Catch:{ InterruptedException -> 0x015c }
            java.lang.Object r3 = r6.A01     // Catch:{ InterruptedException -> 0x015c }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x015c }
            X.3mY r4 = r6.A00     // Catch:{ all -> 0x00de }
            r26 = -1
            r21 = r4
            r23 = r9
            r24 = r1
            X.2R9 r1 = r21.ExR(r22, r23, r24, r26)     // Catch:{ all -> 0x00de }
            monitor-exit(r3)     // Catch:{ all -> 0x00de }
            goto L_0x0116
        L_0x00de:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00de }
            goto L_0x0123
        L_0x00e1:
            boolean r1 = r13.A1j     // Catch:{ InterruptedException -> 0x015c }
            if (r1 == 0) goto L_0x0101
            X.3x9 r1 = r0.A03     // Catch:{ InterruptedException -> 0x015c }
            java.lang.String r9 = r1.A06     // Catch:{ InterruptedException -> 0x015c }
            long r1 = r1.A02     // Catch:{ InterruptedException -> 0x015c }
            java.lang.Object r3 = r6.A01     // Catch:{ InterruptedException -> 0x015c }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x015c }
            X.3mY r4 = r6.A00     // Catch:{ all -> 0x00fe }
            r26 = -1
            r21 = r4
            r23 = r9
            r24 = r1
            X.2R9 r1 = r21.ExQ(r22, r23, r24, r26)     // Catch:{ all -> 0x00fe }
            monitor-exit(r3)     // Catch:{ all -> 0x00fe }
            goto L_0x0116
        L_0x00fe:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fe }
            goto L_0x0123
        L_0x0101:
            X.3x9 r1 = r0.A03     // Catch:{ InterruptedException -> 0x015c }
            java.lang.String r9 = r1.A06     // Catch:{ InterruptedException -> 0x015c }
            long r3 = r1.A02     // Catch:{ InterruptedException -> 0x015c }
            int r1 = r0.A0G     // Catch:{ InterruptedException -> 0x015c }
            long r1 = (long) r1     // Catch:{ InterruptedException -> 0x015c }
            r21 = r6
            r23 = r9
            r24 = r3
            r26 = r1
            X.2R9 r1 = r21.ExQ(r22, r23, r24, r26)     // Catch:{ InterruptedException -> 0x015c }
        L_0x0116:
            r0.A08 = r1     // Catch:{ InterruptedException -> 0x015c }
        L_0x0118:
            if (r1 != 0) goto L_0x0124
            if (r7 == 0) goto L_0x0124
            java.lang.String r0 = "Timeout when obtain cache span lock"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ InterruptedException -> 0x015c }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x015c }
        L_0x0123:
            throw r1     // Catch:{ InterruptedException -> 0x015c }
        L_0x0124:
            if (r8 == 0) goto L_0x014d
            X.3m6 r9 = r0.A0D     // Catch:{ all -> 0x058f }
            if (r9 == 0) goto L_0x014d
            if (r7 != 0) goto L_0x014d
            X.3x9 r3 = r0.A03     // Catch:{ all -> 0x058f }
            long r7 = r3.A00     // Catch:{ all -> 0x058f }
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x014d
            X.3x6 r2 = r3.A05     // Catch:{ all -> 0x058f }
            int r2 = r2.A08     // Catch:{ all -> 0x058f }
            if (r2 > 0) goto L_0x014d
            long r3 = r3.A01     // Catch:{ all -> 0x058f }
            if (r1 == 0) goto L_0x0150
            long r1 = r1.A03     // Catch:{ all -> 0x058f }
        L_0x0140:
            r21 = r9
            r22 = r5
            r23 = r7
            r25 = r3
            r27 = r1
            r21.DFs(r22, r23, r25, r27)     // Catch:{ all -> 0x058f }
        L_0x014d:
            X.2R9 r1 = r0.A08     // Catch:{ all -> 0x058f }
            goto L_0x0153
        L_0x0150:
            r1 = -1
            goto L_0x0140
        L_0x0153:
            if (r1 != 0) goto L_0x0160
            r6.hashCode()     // Catch:{ all -> 0x058f }
            r0.hashCode()     // Catch:{ all -> 0x058f }
            goto L_0x016d
        L_0x015c:
            X.27d.A00()
            return r20
        L_0x0160:
            r6.hashCode()     // Catch:{ all -> 0x058f }
            r0.hashCode()     // Catch:{ all -> 0x058f }
            java.io.File r1 = r1.A05     // Catch:{ all -> 0x058f }
            if (r1 == 0) goto L_0x016d
            r1.getPath()     // Catch:{ all -> 0x058f }
        L_0x016d:
            r1 = r20
            r0.A0F = r1     // Catch:{ all -> 0x058f }
            X.2R9 r2 = r0.A08     // Catch:{ all -> 0x058f }
            if (r2 == 0) goto L_0x027c
            boolean r1 = r2.A07     // Catch:{ all -> 0x058f }
            if (r1 == 0) goto L_0x027c
            long r1 = r2.A03     // Catch:{ all -> 0x058f }
            r18 = -1
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            r1 = 1
            if (r3 != 0) goto L_0x0183
            r1 = 0
        L_0x0183:
            X.C256703wD.A04(r1)     // Catch:{ all -> 0x058f }
            X.3m6 r11 = r0.A0D     // Catch:{ all -> 0x058f }
            if (r11 == 0) goto L_0x01d3
            X.3x9 r8 = r0.A03     // Catch:{ all -> 0x058f }
            java.util.Map r25 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x058f }
            android.net.Uri r10 = r8.A04     // Catch:{ all -> 0x058f }
            if (r10 != 0) goto L_0x0196
            android.net.Uri r10 = android.net.Uri.EMPTY     // Catch:{ all -> 0x058f }
        L_0x0196:
            byte[] r1 = r8.A07     // Catch:{ all -> 0x058f }
            r26 = r1
            long r6 = r8.A00     // Catch:{ all -> 0x058f }
            long r3 = r8.A02     // Catch:{ all -> 0x058f }
            long r6 = r6 - r3
            long r1 = r8.A01     // Catch:{ all -> 0x058f }
            int r9 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x01a7
            r1 = -1
        L_0x01a7:
            java.lang.String r9 = r8.A06     // Catch:{ all -> 0x058f }
            r24 = r9
            int r12 = r8.A03     // Catch:{ all -> 0x058f }
            X.3x6 r9 = r8.A05     // Catch:{ all -> 0x058f }
            X.C256703wD.A02(r10)     // Catch:{ all -> 0x058f }
            X.3x7 r8 = X.C257263x7.A0B     // Catch:{ all -> 0x058f }
            if (r9 != 0) goto L_0x01bb
            X.3x6 r9 = new X.3x6     // Catch:{ all -> 0x058f }
            r9.<init>()     // Catch:{ all -> 0x058f }
        L_0x01bb:
            X.3x7 r8 = new X.3x7     // Catch:{ all -> 0x058f }
            r21 = r8
            r22 = r10
            r23 = r9
            r27 = r17
            r28 = r12
            r29 = r6
            r31 = r3
            r33 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x058f }
            r11.Dtd(r5, r8)     // Catch:{ all -> 0x058f }
        L_0x01d3:
            java.lang.String r1 = "exo-opencachedatasource"
            X.27d.A01(r1)     // Catch:{ all -> 0x057f }
            X.2R9 r1 = r0.A08     // Catch:{ all -> 0x057f }
            if (r1 != 0) goto L_0x01e9
            r0.hashCode()     // Catch:{ all -> 0x057f }
        L_0x01df:
            X.2R9 r3 = r0.A08     // Catch:{ all -> 0x057f }
            if (r3 == 0) goto L_0x01f4
            boolean r2 = r3.A07     // Catch:{ all -> 0x057f }
            r1 = 1
            if (r2 != 0) goto L_0x01f5
            goto L_0x01f4
        L_0x01e9:
            r0.hashCode()     // Catch:{ all -> 0x057f }
            java.io.File r1 = r1.A05     // Catch:{ all -> 0x057f }
            if (r1 == 0) goto L_0x01df
            r1.getPath()     // Catch:{ all -> 0x057f }
            goto L_0x01df
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            X.C256703wD.A04(r1)     // Catch:{ all -> 0x057f }
            X.3x9 r7 = r0.A03     // Catch:{ all -> 0x057f }
            long r5 = r7.A02     // Catch:{ all -> 0x057f }
            long r1 = r3.A04     // Catch:{ all -> 0x057f }
            long r5 = r5 - r1
            long r3 = r3.A03     // Catch:{ all -> 0x057f }
            long r3 = r3 - r5
            long r1 = r7.A01     // Catch:{ all -> 0x057f }
            int r7 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x020d
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x020d:
            long r1 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x057f }
            X.3x7 r11 = r0.A00()     // Catch:{ all -> 0x057f }
            java.lang.String r10 = "FbHttpCacheDataSource"
            java.lang.String r9 = "Cache data source open spec(Cached). RequestType: %s, StreamType:%s, Offset:%d, FilePos:%d, Length:%d, Vid:%s, Key:%s"
            X.3wn r8 = r0.A0L     // Catch:{ all -> 0x057f }
            X.28e r3 = r8.A00     // Catch:{ all -> 0x057f }
            java.lang.String r21 = r3.toString()     // Catch:{ all -> 0x057f }
            X.3p9 r12 = r0.A0K     // Catch:{ all -> 0x057f }
            X.3x9 r7 = r0.A03     // Catch:{ all -> 0x057f }
            long r3 = r7.A00     // Catch:{ all -> 0x057f }
            java.lang.Long r23 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x057f }
            java.lang.Long r24 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x057f }
            java.lang.Long r25 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x057f }
            java.lang.String r3 = r8.A07     // Catch:{ all -> 0x057f }
            java.lang.String r4 = r7.A06     // Catch:{ all -> 0x057f }
            r22 = r12
            r26 = r3
            r27 = r4
            java.lang.Object[] r3 = new java.lang.Object[]{r21, r22, r23, r24, r25, r26, r27}     // Catch:{ all -> 0x057f }
            X.27B.A01(r10, r9, r3)     // Catch:{ all -> 0x057f }
            X.3x1 r8 = r0.A0N     // Catch:{ IOException -> 0x0275 }
            r8.open(r11)     // Catch:{ IOException -> 0x0275 }
            X.1xT r3 = r13.A0y     // Catch:{ all -> 0x057f }
            boolean r3 = r3.A0K     // Catch:{ all -> 0x057f }
            if (r3 == 0) goto L_0x026c
            X.5AJ r9 = r0.A04     // Catch:{ all -> 0x057f }
            X.3x9 r3 = r0.A03     // Catch:{ all -> 0x057f }
            long r5 = r3.A00     // Catch:{ all -> 0x057f }
            int r3 = r9.A00     // Catch:{ all -> 0x057f }
            int r3 = r3 + 1
            r9.A00 = r3     // Catch:{ all -> 0x057f }
            long r3 = r9.A03     // Catch:{ all -> 0x057f }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0263
            r9.A03 = r5     // Catch:{ all -> 0x057f }
        L_0x0263:
            long r3 = r9.A02     // Catch:{ all -> 0x057f }
            long r5 = r5 + r1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x026c
            r9.A02 = r5     // Catch:{ all -> 0x057f }
        L_0x026c:
            r0.A00 = r1     // Catch:{ all -> 0x057f }
            r0.A06 = r8     // Catch:{ all -> 0x057f }
            X.27d.A00()     // Catch:{ all -> 0x058f }
            r8 = 0
            goto L_0x027d
        L_0x0275:
            r1 = move-exception
            X.3x1 r0 = r0.A0N     // Catch:{ all -> 0x057f }
            r0.close()     // Catch:{ all -> 0x057f }
            throw r1     // Catch:{ all -> 0x057f }
        L_0x027c:
            r8 = 1
        L_0x027d:
            X.1xT r1 = r13.A0y     // Catch:{ all -> 0x058f }
            r37 = r1
            boolean r1 = r1.A0K     // Catch:{ all -> 0x058f }
            r18 = r1
            if (r1 == 0) goto L_0x02bd
            X.4yF r2 = X.C279204yF.A04     // Catch:{ all -> 0x058f }
            if (r2 != 0) goto L_0x0292
            X.4yF r2 = new X.4yF     // Catch:{ all -> 0x058f }
            r2.<init>()     // Catch:{ all -> 0x058f }
            X.C279204yF.A04 = r2     // Catch:{ all -> 0x058f }
        L_0x0292:
            X.2R9 r7 = r0.A08     // Catch:{ all -> 0x058f }
            X.3wn r6 = r0.A0L     // Catch:{ all -> 0x058f }
            X.3x9 r1 = r0.A03     // Catch:{ all -> 0x058f }
            android.net.Uri r1 = r1.A04     // Catch:{ all -> 0x058f }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x058f }
            X.3p9 r1 = r0.A0K     // Catch:{ all -> 0x058f }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x058f }
            if (r7 == 0) goto L_0x02bd
            boolean r1 = r7.A07     // Catch:{ all -> 0x058f }
            if (r1 != 0) goto L_0x02bd
            X.4yI r3 = r2.A00     // Catch:{ all -> 0x058f }
            monitor-enter(r3)     // Catch:{ all -> 0x058f }
            java.util.TreeSet r1 = r3.A01     // Catch:{ all -> 0x0584 }
            r1.add(r7)     // Catch:{ all -> 0x0584 }
            java.util.Map r2 = r3.A00     // Catch:{ all -> 0x0584 }
            X.5AA r1 = new X.5AA     // Catch:{ all -> 0x0584 }
            r1.<init>(r6, r5, r4)     // Catch:{ all -> 0x0584 }
            r2.put(r7, r1)     // Catch:{ all -> 0x0584 }
            monitor-exit(r3)     // Catch:{ all -> 0x058f }
        L_0x02bd:
            if (r8 == 0) goto L_0x0587
            boolean r1 = r0.A0A     // Catch:{ all -> 0x058f }
            if (r1 == 0) goto L_0x02d4
            java.lang.String r2 = "FbHttpCacheDataSource"
            java.lang.String r1 = "shouldOpenHttp source, but read from cache only is true: %s"
            X.3wn r0 = r0.A0L     // Catch:{ all -> 0x058f }
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x058f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x058f }
            X.27B.A01(r2, r1, r0)     // Catch:{ all -> 0x058f }
            goto L_0x058b
        L_0x02d4:
            if (r16 == 0) goto L_0x02dc
            boolean r1 = r0.A0P     // Catch:{ all -> 0x058f }
            if (r1 == 0) goto L_0x02dc
            goto L_0x058b
        L_0x02dc:
            X.2R9 r1 = r0.A08     // Catch:{ all -> 0x058f }
            if (r1 != 0) goto L_0x02ef
            java.lang.String r3 = "FbHttpCacheDataSource"
            java.lang.String r2 = "Cache span locked. Skipping caching %s"
            X.3wn r1 = r0.A0L     // Catch:{ all -> 0x058f }
            java.lang.String r1 = r1.A07     // Catch:{ all -> 0x058f }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ all -> 0x058f }
            X.27B.A01(r3, r2, r1)     // Catch:{ all -> 0x058f }
        L_0x02ef:
            java.lang.String r1 = "exo-openhttpdatastream"
            X.27d.A01(r1)     // Catch:{ all -> 0x057f }
            X.2OG r1 = r38.A03()     // Catch:{ all -> 0x057f }
            X.2R9 r12 = r0.A01(r1)     // Catch:{ all -> 0x057f }
            if (r12 != 0) goto L_0x0306
            X.2OG r1 = r38.A03()     // Catch:{ all -> 0x057f }
            X.2R9 r12 = r0.A01(r1)     // Catch:{ all -> 0x057f }
        L_0x0306:
            X.3x9 r1 = r0.A03     // Catch:{ all -> 0x057f }
            long r1 = r1.A01     // Catch:{ all -> 0x057f }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0312
            r1 = -1
        L_0x0312:
            X.2OG r11 = r38.A03()     // Catch:{ all -> 0x057f }
            X.3x9 r5 = r0.A03     // Catch:{ all -> 0x057f }
            java.lang.String r5 = r5.A06     // Catch:{ all -> 0x057f }
            r35 = r5
            if (r11 == 0) goto L_0x034d
            java.lang.Object r7 = r11.A01     // Catch:{ all -> 0x057f }
            monitor-enter(r7)     // Catch:{ all -> 0x057f }
            X.3mY r6 = r11.A00     // Catch:{ all -> 0x0349 }
            long r8 = r6.A06(r5)     // Catch:{ all -> 0x0349 }
            monitor-exit(r7)     // Catch:{ all -> 0x0349 }
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x034d
            X.3x9 r5 = r0.A03     // Catch:{ all -> 0x057f }
            long r5 = r5.A02     // Catch:{ all -> 0x057f }
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x034d
            java.lang.String r3 = "FbHttpCacheDataSource"
            java.lang.String r2 = "Skip Http request because content length is %s and position is %s"
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x057f }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x057f }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x057f }
            X.27B.A02(r3, r2, r0)     // Catch:{ all -> 0x057f }
            goto L_0x056d
        L_0x0349:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0349 }
            goto L_0x054d
        L_0x034d:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0383
            X.3x9 r6 = r0.A03     // Catch:{ all -> 0x057f }
            X.3x6 r5 = r6.A05     // Catch:{ all -> 0x057f }
            long r9 = r5.A0D     // Catch:{ all -> 0x057f }
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0383
            long r1 = r1 + r9
            r5 = r17
            r0.A09 = r5     // Catch:{ all -> 0x057f }
            long r7 = r6.A02     // Catch:{ all -> 0x057f }
            long r5 = r6.A01     // Catch:{ all -> 0x057f }
            int r16 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x036d
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x036d:
            long r7 = r7 + r5
            r0.A01 = r7     // Catch:{ all -> 0x057f }
            java.lang.String r8 = "FbHttpCacheDataSource"
            java.lang.String r7 = "[overfetch] Going to overfetch with length: %d orig len:%d"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x057f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x057f }
            java.lang.Object[] r5 = new java.lang.Object[]{r9, r5}     // Catch:{ all -> 0x057f }
            X.27B.A01(r8, r7, r5)     // Catch:{ all -> 0x057f }
        L_0x0383:
            if (r12 == 0) goto L_0x0390
            long r5 = r12.A04     // Catch:{ all -> 0x057f }
            X.3x9 r7 = r0.A03     // Catch:{ all -> 0x057f }
            long r7 = r7.A02     // Catch:{ all -> 0x057f }
            long r5 = r5 - r7
            long r1 = java.lang.Math.min(r5, r1)     // Catch:{ all -> 0x057f }
        L_0x0390:
            r16 = 0
            java.util.Map r25 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x057f }
            X.3x9 r12 = r0.A03     // Catch:{ all -> 0x057f }
            android.net.Uri r10 = r12.A04     // Catch:{ all -> 0x057f }
            if (r10 != 0) goto L_0x039e
            android.net.Uri r10 = android.net.Uri.EMPTY     // Catch:{ all -> 0x057f }
        L_0x039e:
            long r5 = r12.A00     // Catch:{ all -> 0x057f }
            long r7 = r12.A02     // Catch:{ all -> 0x057f }
            long r5 = r5 - r7
            int r9 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x03aa
            r33 = r1
            goto L_0x03ac
        L_0x03aa:
            r33 = -1
        L_0x03ac:
            java.lang.String r9 = r12.A06     // Catch:{ all -> 0x057f }
            r24 = r9
            int r9 = r12.A03     // Catch:{ all -> 0x057f }
            r19 = r9
            X.3x6 r12 = r12.A05     // Catch:{ all -> 0x057f }
            X.C256703wD.A02(r10)     // Catch:{ all -> 0x057f }
            X.3x7 r9 = X.C257263x7.A0B     // Catch:{ all -> 0x057f }
            if (r12 != 0) goto L_0x03c2
            X.3x6 r12 = new X.3x6     // Catch:{ all -> 0x057f }
            r12.<init>()     // Catch:{ all -> 0x057f }
        L_0x03c2:
            X.3x7 r9 = new X.3x7     // Catch:{ all -> 0x057f }
            r21 = r9
            r22 = r10
            r23 = r12
            r26 = r16
            r27 = r17
            r28 = r19
            r29 = r5
            r31 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x057f }
            X.3x6 r10 = r9.A07     // Catch:{ all -> 0x057f }
            X.3x3 r7 = r10.A0I     // Catch:{ all -> 0x057f }
            if (r7 == 0) goto L_0x03e7
            X.3wn r6 = r0.A0L     // Catch:{ all -> 0x057f }
            java.lang.String r5 = r6.A03     // Catch:{ all -> 0x057f }
            r7.A00 = r5     // Catch:{ all -> 0x057f }
            java.lang.String r5 = r6.A04     // Catch:{ all -> 0x057f }
            r7.A01 = r5     // Catch:{ all -> 0x057f }
        L_0x03e7:
            X.3wr r12 = r0.A07     // Catch:{ IOException -> 0x0518 }
            long r21 = r12.open(r9)     // Catch:{ IOException -> 0x0518 }
            java.util.Map r6 = r12.getResponseHeaders()     // Catch:{ all -> 0x057f }
            X.3wn r8 = r0.A0L     // Catch:{ all -> 0x057f }
            java.lang.String r5 = r8.A07     // Catch:{ all -> 0x057f }
            r36 = r5
            boolean r5 = r13.A1p     // Catch:{ all -> 0x057f }
            long r5 = X.C2607847a.A00(r6, r5)     // Catch:{ all -> 0x057f }
            r0.A02 = r5     // Catch:{ all -> 0x057f }
            if (r11 == 0) goto L_0x0411
            java.lang.Object r13 = r11.A01     // Catch:{ all -> 0x057f }
            monitor-enter(r13)     // Catch:{ all -> 0x057f }
            X.3mY r11 = r11.A00     // Catch:{ all -> 0x040d }
            r7 = r35
            r11.A0B(r7, r5)     // Catch:{ all -> 0x040d }
            monitor-exit(r13)     // Catch:{ all -> 0x040d }
            goto L_0x0411
        L_0x040d:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x040d }
            goto L_0x054d
        L_0x0411:
            X.3x9 r7 = r0.A03     // Catch:{ all -> 0x057f }
            long r5 = r7.A01     // Catch:{ all -> 0x057f }
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x041d
            long r3 = r0.A02     // Catch:{ all -> 0x057f }
            r7.A01 = r3     // Catch:{ all -> 0x057f }
        L_0x041d:
            java.lang.String r6 = "FbHttpCacheDataSource"
            java.lang.String r5 = "Cache data source open spec(HTTP). RequestType: %s, StreamType:%s, Offset:%d, Length:%d, OpenLength:%d, Vid:%s, Key:%s, seq:%d"
            X.28e r3 = r8.A00     // Catch:{ all -> 0x057f }
            java.lang.String r23 = r3.toString()     // Catch:{ all -> 0x057f }
            X.3p9 r8 = r0.A0K     // Catch:{ all -> 0x057f }
            long r3 = r9.A02     // Catch:{ all -> 0x057f }
            java.lang.Long r25 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x057f }
            java.lang.Long r26 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x057f }
            java.lang.Long r27 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x057f }
            java.lang.String r1 = r7.A06     // Catch:{ all -> 0x057f }
            int r2 = r10.A08     // Catch:{ all -> 0x057f }
            java.lang.Integer r30 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x057f }
            r24 = r8
            r28 = r36
            r29 = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r23, r24, r25, r26, r27, r28, r29, r30}     // Catch:{ all -> 0x057f }
            X.27B.A01(r6, r5, r1)     // Catch:{ all -> 0x057f }
            r0.A06 = r12     // Catch:{ all -> 0x057f }
            if (r18 == 0) goto L_0x046e
            X.5AJ r5 = r0.A04     // Catch:{ all -> 0x057f }
            X.3x9 r1 = r0.A03     // Catch:{ all -> 0x057f }
            long r3 = r1.A00     // Catch:{ all -> 0x057f }
            int r1 = r5.A01     // Catch:{ all -> 0x057f }
            int r1 = r1 + 1
            r5.A01 = r1     // Catch:{ all -> 0x057f }
            long r1 = r5.A03     // Catch:{ all -> 0x057f }
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0464
            r5.A03 = r3     // Catch:{ all -> 0x057f }
        L_0x0464:
            long r1 = r5.A02     // Catch:{ all -> 0x057f }
            long r3 = r3 + r21
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x046e
            r5.A02 = r3     // Catch:{ all -> 0x057f }
        L_0x046e:
            X.2R9 r4 = r0.A08     // Catch:{ all -> 0x057f }
            if (r4 == 0) goto L_0x0513
            boolean r1 = r4.A07     // Catch:{ all -> 0x057f }
            if (r1 != 0) goto L_0x0513
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x050c
            boolean r1 = r0.A0P     // Catch:{ all -> 0x057f }
            if (r1 != 0) goto L_0x048d
            r1 = r38
            int r1 = r1.A04     // Catch:{ all -> 0x057f }
            long r1 = (long) r1     // Catch:{ all -> 0x057f }
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x050c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x048f
        L_0x048d:
            long r1 = r0.A0H     // Catch:{ 47t -> 0x050a }
        L_0x048f:
            boolean r9 = r0.A0O     // Catch:{ 47t -> 0x050a }
            r3 = r37
            boolean r3 = r3.A0P     // Catch:{ 47t -> 0x050a }
            if (r3 == 0) goto L_0x04bf
            X.2OG r3 = r38.A03()     // Catch:{ 47t -> 0x050a }
            X.Oqt r7 = new X.Oqt     // Catch:{ 47t -> 0x050a }
            r7.<init>(r3, r1)     // Catch:{ 47t -> 0x050a }
        L_0x04a0:
            r0.A05 = r7     // Catch:{ 47t -> 0x050a }
            X.3x9 r1 = r0.A03     // Catch:{ 47t -> 0x050a }
            int r5 = r1.A03     // Catch:{ 47t -> 0x050a }
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ 47t -> 0x050a }
            X.3x9 r7 = r0.A03     // Catch:{ 47t -> 0x050a }
            android.net.Uri r10 = r7.A04     // Catch:{ 47t -> 0x050a }
            if (r10 != 0) goto L_0x04b2
            android.net.Uri r10 = android.net.Uri.EMPTY     // Catch:{ 47t -> 0x050a }
        L_0x04b2:
            long r1 = r7.A00     // Catch:{ 47t -> 0x050a }
            long r3 = r7.A02     // Catch:{ 47t -> 0x050a }
            long r1 = r1 - r3
            java.lang.String r12 = r7.A06     // Catch:{ 47t -> 0x050a }
            X.3x6 r11 = r7.A05     // Catch:{ 47t -> 0x050a }
            X.C256703wD.A02(r10)     // Catch:{ 47t -> 0x050a }
            goto L_0x04d7
        L_0x04bf:
            X.2OG r29 = r38.A03()     // Catch:{ 47t -> 0x050a }
            X.2R9 r5 = r0.A08     // Catch:{ 47t -> 0x050a }
            long r3 = r0.A0I     // Catch:{ 47t -> 0x050a }
            X.47b r7 = new X.47b     // Catch:{ 47t -> 0x050a }
            r35 = r9
            r28 = r7
            r30 = r5
            r31 = r1
            r33 = r3
            r28.<init>(r29, r30, r31, r33, r35)     // Catch:{ 47t -> 0x050a }
            goto L_0x04a0
        L_0x04d7:
            if (r11 != 0) goto L_0x04de
            X.3x6 r11 = new X.3x6     // Catch:{ 47t -> 0x050a }
            r11.<init>()     // Catch:{ 47t -> 0x050a }
        L_0x04de:
            X.3x7 r9 = new X.3x7     // Catch:{ 47t -> 0x050a }
            r14 = r16
            r15 = r17
            r16 = r5
            r17 = r1
            r19 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21)     // Catch:{ 47t -> 0x050a }
            X.47P r1 = r0.A05     // Catch:{ 47t -> 0x050a }
            r1.E0i(r9)     // Catch:{ 47t -> 0x050a }
            java.lang.String r3 = "Cache data sink open spec. Type:%s, Offset:%d, Length:%d, OpenLength:%d Vid:%s, Key:%s"
            long r1 = r9.A02     // Catch:{ 47t -> 0x050a }
            java.lang.Long r25 = java.lang.Long.valueOf(r1)     // Catch:{ 47t -> 0x050a }
            X.3x9 r0 = r0.A03     // Catch:{ 47t -> 0x050a }
            java.lang.String r0 = r0.A06     // Catch:{ 47t -> 0x050a }
            r28 = r36
            r29 = r0
            java.lang.Object[] r0 = new java.lang.Object[]{r24, r25, r26, r27, r28, r29}     // Catch:{ 47t -> 0x050a }
            X.27B.A01(r6, r3, r0)     // Catch:{ 47t -> 0x050a }
            goto L_0x0513
        L_0x050a:
            r0 = move-exception
            goto L_0x0575
        L_0x050c:
            r0.A03(r4)     // Catch:{ all -> 0x057f }
            r1 = r16
            r0.A08 = r1     // Catch:{ all -> 0x057f }
        L_0x0513:
            X.27d.A00()     // Catch:{ all -> 0x058f }
            r0 = 1
            goto L_0x0571
        L_0x0518:
            r6 = move-exception
            r1 = r20
            r0.A09 = r1     // Catch:{ all -> 0x057f }
            r0.A01 = r3     // Catch:{ all -> 0x057f }
            X.3wr r5 = r0.A07     // Catch:{ all -> 0x057f }
            r5.close()     // Catch:{ all -> 0x057f }
            boolean r1 = r6 instanceof X.C2609447q     // Catch:{ all -> 0x057f }
            if (r1 == 0) goto L_0x057e
            r1 = r6
            X.47q r1 = (X.C2609447q) r1     // Catch:{ all -> 0x057f }
            int r2 = r1.A00     // Catch:{ all -> 0x057f }
            r1 = 416(0x1a0, float:5.83E-43)
            if (r2 != r1) goto L_0x057e
            java.util.Map r2 = r5.getResponseHeaders()     // Catch:{ all -> 0x057f }
            boolean r1 = r13.A1p     // Catch:{ all -> 0x057f }
            long r1 = X.C2607847a.A00(r2, r1)     // Catch:{ all -> 0x057f }
            r0.A02 = r1     // Catch:{ all -> 0x057f }
            if (r11 == 0) goto L_0x054e
            java.lang.Object r7 = r11.A01     // Catch:{ all -> 0x057f }
            monitor-enter(r7)     // Catch:{ all -> 0x057f }
            X.3mY r6 = r11.A00     // Catch:{ all -> 0x054b }
            r5 = r35
            r6.A0B(r5, r1)     // Catch:{ all -> 0x054b }
            monitor-exit(r7)     // Catch:{ all -> 0x054b }
            goto L_0x054e
        L_0x054b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x054b }
        L_0x054d:
            throw r0     // Catch:{ all -> 0x057f }
        L_0x054e:
            X.3x9 r7 = r0.A03     // Catch:{ all -> 0x057f }
            long r5 = r7.A01     // Catch:{ all -> 0x057f }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x055e
            long r1 = r0.A02     // Catch:{ all -> 0x057f }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x055e
            r7.A01 = r1     // Catch:{ all -> 0x057f }
        L_0x055e:
            java.lang.String r2 = "FbHttpCacheDataSource"
            java.lang.String r1 = "Returning length 0 after 416 response"
            r0 = r20
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x057f }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x057f }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x057f }
        L_0x056d:
            X.27d.A00()     // Catch:{ all -> 0x058f }
            r0 = 0
        L_0x0571:
            X.27d.A00()
            return r0
        L_0x0575:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x057f }
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x057f }
            r6.<init>(r0)     // Catch:{ all -> 0x057f }
        L_0x057e:
            throw r6     // Catch:{ all -> 0x057f }
        L_0x057f:
            r0 = move-exception
            X.27d.A00()     // Catch:{ all -> 0x058f }
            goto L_0x0586
        L_0x0584:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x058f }
        L_0x0586:
            throw r0     // Catch:{ all -> 0x058f }
        L_0x0587:
            X.27d.A00()
            return r17
        L_0x058b:
            X.27d.A00()
            return r20
        L_0x058f:
            r0 = move-exception
            X.27d.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257193x0.A04():boolean");
    }

    public final void changeHttpPriority(byte b, boolean z) {
        this.A07.changeHttpPriority(b, z);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.4yF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.4yF, java.lang.Object] */
    public final void close() {
        C257283x9 r2;
        if (!this.A09) {
            HeroPlayerSetting heroPlayerSetting = this.A0M;
            if (heroPlayerSetting.A1k) {
                r2 = null;
                try {
                    if (heroPlayerSetting.A0y.A0K) {
                        C279204yF r1 = C279204yF.A04;
                        C279204yF r12 = r1;
                        if (r1 == null) {
                            ? obj = new Object();
                            C279204yF.A04 = obj;
                            r12 = obj;
                        }
                        r12.A00(this.A04);
                    }
                    A02();
                } catch (Throwable th) {
                    this.A03 = null;
                    throw th;
                }
            } else {
                if (heroPlayerSetting.A0y.A0K) {
                    C279204yF r13 = C279204yF.A04;
                    C279204yF r14 = r13;
                    if (r13 == null) {
                        ? obj2 = new Object();
                        C279204yF.A04 = obj2;
                        r14 = obj2;
                    }
                    r14.A00(this.A04);
                }
                A02();
                r2 = null;
            }
            this.A03 = r2;
            return;
        }
        C257283x9 r3 = this.A03;
        27B.A01("FbHttpCacheDataSource", "[overfetch] datasource is attempted to call close, but continue for position: %d length: %d", new Object[]{Long.valueOf(r3.A02), Long.valueOf(r3.A01)});
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3x2, X.3x1] */
    public C257193x0(C250813m6 r4, 29t r5, C252463p9 r6, C257063wn r7, AnonymousClass29r r8, HeroPlayerSetting heroPlayerSetting, C257103wr r10, AtomicBoolean atomicBoolean, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A0J = r5;
        this.A0L = r7;
        this.A07 = r10;
        this.A0N = new C257213x2(false);
        this.A05 = null;
        this.A0P = z;
        this.A0D = r4;
        this.A0Q = r8;
        this.A02 = 0;
        this.A00 = 0;
        this.A0G = i;
        this.A0H = j;
        this.A0E = false;
        this.A0A = z2;
        this.A0M = heroPlayerSetting;
        this.A0R = atomicBoolean;
        this.A0K = r6;
        this.A0O = z3;
        this.A0I = j2;
    }

    public final void addTransferListener(C250823m7 r2) {
        C250813m6 xx0;
        r2.getClass();
        if (r2 instanceof C250813m6) {
            xx0 = (C250813m6) r2;
        } else {
            xx0 = new C22189Xx0(r2);
        }
        this.A0D = xx0;
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        if (r4 != -1) goto L_0x00a5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00e2 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e6 A[Catch:{ IOException -> 0x00ef }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            X.3x7 r7 = r12.A00()     // Catch:{ IOException -> 0x00ef }
            boolean r0 = r12.A0F     // Catch:{ IOException -> 0x00ef }
            r5 = 0
            r8 = 1
            if (r0 != 0) goto L_0x001d
            X.3m6 r6 = r12.A0D     // Catch:{ IOException -> 0x00ef }
            if (r6 == 0) goto L_0x001b
            long r0 = r12.A02     // Catch:{ IOException -> 0x00ef }
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r0 = 0
            if (r2 != 0) goto L_0x0018
            r0 = 1
        L_0x0018:
            r6.Dtf(r12, r7, r8, r0)     // Catch:{ IOException -> 0x00ef }
        L_0x001b:
            r12.A0F = r8     // Catch:{ IOException -> 0x00ef }
        L_0x001d:
            X.3ws r8 = r12.A06     // Catch:{ IOException -> 0x00ef }
            r6 = -1
            if (r8 != 0) goto L_0x0034
            java.lang.String r5 = "FbHttpCacheDataSource"
            java.lang.String r4 = "Trying to read when datasource isn't set. cache-only: %b"
            boolean r0 = r12.A0A     // Catch:{ IOException -> 0x00ef }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x00ef }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x00ef }
        L_0x0030:
            X.27B.A01(r5, r4, r0)     // Catch:{ IOException -> 0x00ef }
            goto L_0x005d
        L_0x0034:
            boolean r0 = r12.A09     // Catch:{ IOException -> 0x00ef }
            r9 = 0
            if (r0 == 0) goto L_0x005e
            X.3x9 r3 = r12.A03     // Catch:{ IOException -> 0x00ef }
            if (r3 == 0) goto L_0x005e
            long r0 = r3.A01     // Catch:{ IOException -> 0x00ef }
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x005e
            long r2 = r3.A02     // Catch:{ IOException -> 0x00ef }
            long r0 = r12.A01     // Catch:{ IOException -> 0x00ef }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x005e
            java.lang.String r5 = "FbHttpCacheDataSource"
            java.lang.String r4 = "Done with player requested length: %d. Continuing to fetch. Start [overfetch] position: %d"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x00ef }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00ef }
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch:{ IOException -> 0x00ef }
            goto L_0x0030
        L_0x005d:
            return r6
        L_0x005e:
            int r4 = r8.read(r13, r14, r15)     // Catch:{ IOException -> 0x00ef }
            if (r4 <= 0) goto L_0x0091
            long r2 = r12.A0C     // Catch:{ IOException -> 0x00ef }
            long r0 = (long) r4     // Catch:{ IOException -> 0x00ef }
            long r2 = r2 + r0
            r12.A0C = r2     // Catch:{ IOException -> 0x00ef }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r12.A0M     // Catch:{ IOException -> 0x00ef }
            X.1xT r0 = r0.A0y     // Catch:{ IOException -> 0x00ef }
            long r0 = r0.A0A     // Catch:{ IOException -> 0x00ef }
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a5
            X.3ws r1 = r12.A06     // Catch:{ IOException -> 0x00ef }
            X.3wr r0 = r12.A07     // Catch:{ IOException -> 0x00ef }
            if (r1 != r0) goto L_0x00a5
            X.2R9 r6 = r12.A08     // Catch:{ IOException -> 0x00ef }
            if (r6 == 0) goto L_0x00a5
            long r0 = r12.A0B     // Catch:{ IOException -> 0x00ef }
            long r10 = r2 - r0
            r8 = 5120(0x1400, double:2.5296E-320)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            r12.A0B = r2     // Catch:{ IOException -> 0x00ef }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00ef }
            r6.A08 = r0     // Catch:{ IOException -> 0x00ef }
            goto L_0x00a5
        L_0x0091:
            if (r4 != r6) goto L_0x00a2
            boolean r0 = r12.A04()     // Catch:{ IOException -> 0x00ef }
            if (r0 == 0) goto L_0x00ee
            X.3ws r0 = r12.A06     // Catch:{ IOException -> 0x00ef }
            int r4 = r0.read(r13, r14, r15)     // Catch:{ IOException -> 0x00ef }
            if (r4 != r6) goto L_0x00a2
            return r4
        L_0x00a2:
            r0 = 0
            if (r4 == r6) goto L_0x00a6
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            X.C256703wD.A04(r0)     // Catch:{ IOException -> 0x00ef }
            X.3x9 r6 = r12.A03     // Catch:{ IOException -> 0x00ef }
            long r2 = r6.A01     // Catch:{ IOException -> 0x00ef }
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            long r0 = (long) r4     // Catch:{ IOException -> 0x00ef }
            long r2 = r2 - r0
            r8 = 0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x00bd
            r0 = 1
        L_0x00bd:
            X.C256703wD.A04(r0)     // Catch:{ IOException -> 0x00ef }
            r6.A01 = r2     // Catch:{ IOException -> 0x00ef }
        L_0x00c2:
            long r0 = r6.A00     // Catch:{ IOException -> 0x00ef }
            long r2 = (long) r4     // Catch:{ IOException -> 0x00ef }
            long r0 = r0 + r2
            r6.A00 = r0     // Catch:{ IOException -> 0x00ef }
            long r0 = r6.A02     // Catch:{ IOException -> 0x00ef }
            long r0 = r0 + r2
            r6.A02 = r0     // Catch:{ IOException -> 0x00ef }
            X.3ws r0 = r12.A06     // Catch:{ IOException -> 0x00ef }
            X.3wr r2 = r12.A07     // Catch:{ IOException -> 0x00ef }
            if (r0 != r2) goto L_0x00e2
            X.47P r1 = r12.A05     // Catch:{ IOException -> 0x00ef }
            if (r1 == 0) goto L_0x00e2
            X.2R9 r0 = r12.A08     // Catch:{ IOException -> 0x00ef }
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.A07     // Catch:{ IOException -> 0x00ef }
            if (r0 != 0) goto L_0x00e2
            r1.write(r13, r14, r4)     // Catch:{ IOException -> 0x00e2 }
        L_0x00e2:
            X.3m6 r1 = r12.A0D     // Catch:{ IOException -> 0x00ef }
            if (r1 == 0) goto L_0x00ee
            X.3ws r0 = r12.A06     // Catch:{ IOException -> 0x00ef }
            if (r0 != r2) goto L_0x00eb
            r5 = 1
        L_0x00eb:
            r1.Czk(r12, r7, r4, r5)     // Catch:{ IOException -> 0x00ef }
        L_0x00ee:
            return r4
        L_0x00ef:
            r2 = move-exception
            r0 = 0
            r12.A09 = r0
            r0 = -1
            r12.A01 = r0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r12.A0M
            X.1xT r0 = r0.A0y
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0104
            X.5AJ r1 = r12.A04
            r0 = 1
            r1.A08 = r0
        L_0x0104:
            X.3m6 r0 = r12.A0D
            if (r0 == 0) goto L_0x010b
            r0.DtY(r2)
        L_0x010b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257193x0.read(byte[], int, int):int");
    }
}
