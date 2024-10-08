package com.facebook.video.cache.igdatasource;

import X.00p;
import X.0lg;
import X.0qQ;
import X.0sr;
import X.16d;
import X.16e;
import X.1Fe;
import X.1Fn;
import X.AnonymousClass000;
import X.AnonymousClass47W;
import X.AnonymousClass47X;
import X.AnonymousClass47Y;
import X.AnonymousClass47Z;
import X.C241943Rz;
import X.C250823m7;
import X.C250883mD;
import X.C257063wn;
import X.C257103wr;
import X.C257133wu;
import X.C257143wv;
import X.C257223x3;
import X.C257233x4;
import X.C257253x6;
import X.C257263x7;
import android.net.Uri;
import android.util.Log;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class IgHttpDataSource implements C257103wr, C257133wu {
    public static final C257143wv Companion = new Object();
    public static final String TAG = "IgHttpDataSource";
    public static final String VIDEO_ID = "video_id";
    public static final AtomicInteger transactionId = new AtomicInteger();
    public long bytesToRead;
    public long bytesToSkip;
    public C257263x7 dataSpec;
    public final AtomicReference dynamicPlayerSettingsRef;
    public InputStream inputStream;
    public boolean isOpened;
    public final AtomicReference networkAwareSettings;
    public final HeroPlayerSetting playerSetting;
    public AnonymousClass47Z rangeResponse;
    public final Map requestProperties = new LinkedHashMap();
    public AnonymousClass47X requestToken;
    public int responseCode;
    public final 0lg session;
    public C250823m7 transferListener;
    public long ttfB;
    public final 16e uriParser;
    public final C257063wn videoMetaData;
    public final C241943Rz videoRequestPendingStore;

    /* JADX WARNING: type inference failed for: r0v12, types: [X.3mD, java.lang.Object] */
    public IgHttpDataSource(C250823m7 r3, int i, HeroPlayerSetting heroPlayerSetting, AtomicReference atomicReference, C257063wn r7, AtomicReference atomicReference2, 0lg r9) {
        C250883mD r0;
        C241943Rz r02;
        0qQ.A0B(heroPlayerSetting, 3);
        0qQ.A0B(atomicReference, 4);
        0qQ.A0B(r7, 5);
        0qQ.A0B(atomicReference2, 6);
        this.transferListener = r3;
        this.playerSetting = heroPlayerSetting;
        this.dynamicPlayerSettingsRef = atomicReference;
        this.videoMetaData = r7;
        this.networkAwareSettings = atomicReference2;
        this.session = r9;
        16d r03 = 16d.A06;
        0qQ.A08(r03);
        this.uriParser = r03;
        synchronized (C250883mD.A02) {
            C250883mD r04 = C250883mD.A01;
            r0 = r04;
            if (r04 == null) {
                ? obj = new Object();
                C250883mD.A01 = obj;
                r0 = obj;
            }
        }
        if (r0 != null) {
            r02 = r0.A00;
        } else {
            r02 = null;
        }
        this.videoRequestPendingStore = r02;
    }

    private final synchronized void closeDownloaderConnectionQuietly() {
        AnonymousClass47Z r1 = this.rangeResponse;
        if (r1 != null) {
            try {
                ((AnonymousClass47Y) r1).A03.A00();
                r1.close();
            } catch (IOException e) {
                Log.e(TAG, String.format("Unexpected error while disconnecting", new Object[0]), e);
            } catch (RuntimeException e2) {
                Log.e(TAG, String.format("Unexpected error while disconnecting", new Object[0]), e2);
            } catch (Throwable th) {
                this.rangeResponse = null;
                throw th;
            }
            this.rangeResponse = null;
        } else {
            AnonymousClass47X r12 = this.requestToken;
            if (r12 != null) {
                r12.cancel();
                AnonymousClass47W r13 = (AnonymousClass47W) r12;
                if (r13.A03) {
                    r13.A00.AI7();
                }
            }
        }
        this.requestToken = null;
    }

    public void addTransferListener(C250823m7 r2) {
        0qQ.A0B(r2, 0);
        this.transferListener = r2;
    }

    public synchronized void cancel() {
        AnonymousClass47Z r0 = this.rangeResponse;
        if (r0 != null) {
            ((AnonymousClass47Y) r0).A03.A00();
        }
    }

    public synchronized void changeHttpPriority(byte b, boolean z) {
        1Fe r0;
        boolean z2 = false;
        if (b == C257233x4.A02.A00.A00) {
            z2 = true;
        }
        AnonymousClass47X r1 = this.requestToken;
        if (r1 != null) {
            if (z2) {
                r0 = 1Fe.A03;
            } else {
                r0 = 1Fe.A02;
            }
            r1.FJj(r0);
        }
        C241943Rz r12 = this.videoRequestPendingStore;
        if (r12 != null) {
            String str = this.videoMetaData.A07;
            0qQ.A07(str);
            r12.FKv(str, z2);
        }
    }

    public void changePriority(int i) {
    }

    public void clearRequestProperty(String str) {
        0qQ.A0B(str, 0);
        synchronized (this.requestProperties) {
            this.requestProperties.remove(str);
        }
    }

    public int getNumUriRedirects() {
        return -1;
    }

    public synchronized Map getResponseHeaders() {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        AnonymousClass47Z r3 = this.rangeResponse;
        if (r3 != null) {
            linkedHashMap.put("up-ttfb", 0sr.A1M(new String[]{String.valueOf(this.ttfB)}));
            List list = ((AnonymousClass47Y) r3).A01.A04;
            for (1Fn r2 : (1Fn[]) list.toArray(new 1Fn[list.size()])) {
                String str = r2.A00;
                0qQ.A0A(str);
                if (!00p.A0k(str, "x-fb-video-livetrace-", false) || this.playerSetting.A2o) {
                    List singletonList = Collections.singletonList(r2.A01);
                    0qQ.A07(singletonList);
                    linkedHashMap.put(str, singletonList);
                }
            }
        }
        return linkedHashMap;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7 A[LOOP:0: B:39:0x00d1->B:41:0x00d7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0164 A[Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }] */
    public long open(X.C257263x7 r34) {
        /*
            r33 = this;
            r11 = 0
            r8 = r34
            X.0qQ.A0B(r8, r11)
            android.net.Uri r0 = r8.A06
            java.lang.String r23 = r0.toString()
            X.0qQ.A07(r23)
            android.net.Uri r0 = android.net.Uri.parse(r23)
            java.lang.String r1 = r0.getAuthority()
            r0 = 0
            if (r1 == 0) goto L_0x001b
            r0 = 1
        L_0x001b:
            r10 = 1
            if (r0 == 0) goto L_0x026a
            long r21 = android.os.SystemClock.elapsedRealtime()
            r9 = r33
            monitor-enter(r9)
            X.3x7 r2 = r9.dataSpec     // Catch:{ all -> 0x0267 }
            if (r2 != 0) goto L_0x0242
            r9.dataSpec = r8     // Catch:{ all -> 0x0267 }
            monitor-exit(r9)
            long r4 = r8.A04
            long r2 = r8.A03
            r19 = 0
            r17 = -1
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00f0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00f0
            r14 = -1
        L_0x003e:
            r31 = -1
        L_0x0040:
            X.3x7 r0 = r9.dataSpec
            if (r0 == 0) goto L_0x00ed
            X.3x6 r0 = r0.A07
            if (r0 == 0) goto L_0x00ed
            int r0 = r0.A05
        L_0x004a:
            int r16 = java.lang.Math.max(r0, r11)
            boolean r0 = r9.shouldLowerPriorityForLongBufferedPlayback(r8)
            if (r0 == 0) goto L_0x0056
            r16 = 1
        L_0x0056:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r1 = "video_id"
            X.3wn r0 = r9.videoMetaData
            java.lang.String r0 = r0.A07
            r6.put(r1, r0)
            if (r16 != 0) goto L_0x00e9
            X.1Fe r1 = X.1Fe.A03
        L_0x0068:
            X.1QT r7 = new X.1QT
            r7.<init>()
            X.1CE r0 = X.1CE.A0A
            r7.A04 = r0
            r7.A03 = r1
            r7.A0D = r6
            X.3wn r1 = r9.videoMetaData
            X.3uT r6 = r1.A02
            X.3uT r0 = X.C255643uT.SPONSORED
            r12 = 0
            if (r6 != r0) goto L_0x007f
            r12 = 1
        L_0x007f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r7.A06 = r0
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x008b
            r7.A0C = r0
        L_0x008b:
            java.lang.String r1 = r1.A07
            X.0qQ.A07(r1)
            X.3wn r0 = r9.videoMetaData
            boolean r0 = r0.A09
            X.3xX r6 = new X.3xX
            r6.<init>(r14, r1, r0)
            X.3x6 r13 = r8.A07
            int r0 = r13.A09
            X.3p9 r0 = X.C252463p9.A00(r0)
            java.lang.String r0 = r0.A01
            X.0qQ.A0B(r0, r11)
            r6.A04 = r0
            r6.A01 = r4
            int r0 = r13.A08
            long r0 = (long) r0
            r6.A00 = r0
            int r12 = r13.A00
            r7.A05 = r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r9.playerSetting
            boolean r0 = r0.A2L
            if (r0 == 0) goto L_0x00c7
            java.lang.String r1 = "X-FB-Request-Analytics-Tags"
            java.lang.String r0 = X.AnonymousClass47Q.A00(r13)
            r6.put(r1, r0)
        L_0x00c7:
            java.util.Map r0 = r13.A0Q
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x00d1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r6.put(r1, r0)
            goto L_0x00d1
        L_0x00e9:
            X.1Fe r1 = X.1Fe.A02
            goto L_0x0068
        L_0x00ed:
            r0 = 0
            goto L_0x004a
        L_0x00f0:
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x00fd
            long r31 = r2 + r4
            r0 = 1
            long r31 = r31 - r0
            r14 = r4
            goto L_0x0040
        L_0x00fd:
            r14 = r4
            goto L_0x003e
        L_0x0100:
            java.util.Map r1 = r9.requestProperties
            java.lang.String r0 = "x-fb-client-cdn-log-playback-session"
            r1.get(r0)
            X.3wn r0 = r9.videoMetaData
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0112
            java.lang.String r0 = "play_origin"
            r6.put(r0, r1)
        L_0x0112:
            java.lang.String r1 = r8.A08
            if (r1 == 0) goto L_0x011b
            java.lang.String r0 = "cache_key"
            r6.put(r0, r1)
        L_0x011b:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r9.playerSetting
            boolean r0 = r0.A2M
            if (r0 == 0) goto L_0x012e
            if (r16 != 0) goto L_0x012e
            if (r12 <= 0) goto L_0x012e
            java.lang.String r0 = "etd_ms"
            java.lang.String r1 = java.lang.String.valueOf(r12)
            r6.put(r0, r1)
        L_0x012e:
            java.util.Map r0 = r9.requestProperties
            r6.putAll(r0)
            X.16e r1 = r9.uriParser
            r0 = r23
            X.2hY r26 = r1.E1h(r0)
            X.1QU r1 = r7.A00()
            X.14G r23 = X.14G.A03()     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            X.47R r0 = new X.47R     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            r0.<init>(r9, r1)     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            X.0lg r7 = r9.session     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            r24 = r0
            r25 = r1
            r27 = r7
            r28 = r6
            r29 = r14
            X.47Y r12 = r23.A07(r24, r25, r26, r27, r28, r29, r31)     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            X.2ZL r0 = r12.A01     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            int r0 = r0.A02     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            r9.responseCode = r0     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            long r6 = r12.A00     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x016a
            X.1Qb r0 = r12.A02     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            long r6 = r0.AJg()     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
        L_0x016a:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            long r0 = r0 - r21
            r9.ttfB = r0     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            monitor-enter(r9)     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            r9.rangeResponse = r12     // Catch:{ all -> 0x01ff }
            monitor-exit(r9)     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            monitor-enter(r9)
            r12 = 0
            r9.requestToken = r12     // Catch:{ all -> 0x0267 }
            int r13 = r9.responseCode     // Catch:{ all -> 0x0267 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r13 < r1) goto L_0x01eb
            r0 = 299(0x12b, float:4.19E-43)
            if (r13 > r0) goto L_0x01eb
            r9.isOpened = r10     // Catch:{ all -> 0x0267 }
            if (r13 != r1) goto L_0x018d
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r4 = 0
        L_0x018f:
            r9.bytesToSkip = r4     // Catch:{ all -> 0x0267 }
            r0 = -1
            int r14 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            int r13 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r14 == 0) goto L_0x019e
            long r0 = r6 - r4
            if (r13 == 0) goto L_0x01a6
            goto L_0x01a2
        L_0x019e:
            if (r13 == 0) goto L_0x01a6
            r0 = r2
            goto L_0x01a6
        L_0x01a2:
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0267 }
        L_0x01a6:
            r9.bytesToRead = r0     // Catch:{ all -> 0x0267 }
            X.47Z r0 = r9.rangeResponse     // Catch:{ IOException -> 0x024e, RuntimeException -> 0x01c7 }
            if (r0 == 0) goto L_0x01b4
            X.47Y r0 = (X.AnonymousClass47Y) r0     // Catch:{ IOException -> 0x024e, RuntimeException -> 0x01c7 }
            X.1Qb r0 = r0.A02     // Catch:{ IOException -> 0x024e, RuntimeException -> 0x01c7 }
            java.io.InputStream r12 = r0.AjD()     // Catch:{ IOException -> 0x024e, RuntimeException -> 0x01c7 }
        L_0x01b4:
            r9.inputStream = r12     // Catch:{ all -> 0x0267 }
            monitor-exit(r9)
            X.3m7 r2 = r9.transferListener
            if (r2 == 0) goto L_0x01c4
            int r1 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x01c1
            r0 = 1
        L_0x01c1:
            r2.Dtf(r9, r8, r10, r0)
        L_0x01c4:
            long r0 = r9.bytesToRead
            return r0
        L_0x01c7:
            r3 = move-exception
            java.lang.String r2 = "IgHttpDataSource"
            java.lang.String r1 = "RuntimeException occurs when try to get InputStream"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0267 }
            android.util.Log.e(r2, r0, r3)     // Catch:{ all -> 0x0267 }
            r9.cancel()     // Catch:{ all -> 0x0267 }
            r9.closeDownloaderConnectionQuietly()     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "RuntimeException: "
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0267 }
            X.47r r1 = new X.47r     // Catch:{ all -> 0x0267 }
            r1.<init>(r8, r0, r10)     // Catch:{ all -> 0x0267 }
            goto L_0x0266
        L_0x01eb:
            r9.closeDownloaderConnectionQuietly()     // Catch:{ all -> 0x0267 }
            int r0 = r9.responseCode     // Catch:{ all -> 0x0267 }
            java.util.Map r4 = r9.getResponseHeaders()     // Catch:{ all -> 0x0267 }
            byte[] r5 = com.google.android.exoplayer2.util.Util.A06     // Catch:{ all -> 0x0267 }
            X.47q r1 = new X.47q     // Catch:{ all -> 0x0267 }
            r2 = r8
            r3 = r12
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0267 }
            goto L_0x0266
        L_0x01ff:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
            throw r0     // Catch:{ IOException -> 0x0226, RuntimeException -> 0x0202 }
        L_0x0202:
            r3 = move-exception
            java.lang.String r2 = "IgHttpDataSource"
            java.lang.String r1 = "runtime exception happens during downloadVideo request"
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0, r3)
            r9.cancel()
            r9.closeDownloaderConnectionQuietly()
            java.lang.String r1 = "RuntimeException: "
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.47r r1 = new X.47r
            r1.<init>(r8, r0, r10)
            throw r1
        L_0x0226:
            r3 = move-exception
            java.lang.String r2 = "IgHttpDataSource"
            java.lang.String r1 = "ioexception happens during downloadVideo request"
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0, r3)
            r9.cancel()
            r9.closeDownloaderConnectionQuietly()
            r0 = 2000(0x7d0, float:2.803E-42)
            X.47r r1 = new X.47r
            r1.<init>((X.C257263x7) r8, (java.io.IOException) r3, (int) r0, (int) r10)
            throw r1
        L_0x0242:
            r0 = 502(0x1f6, float:7.03E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0267 }
            X.47r r1 = new X.47r     // Catch:{ all -> 0x0267 }
            r1.<init>(r2, r0, r10)     // Catch:{ all -> 0x0267 }
            goto L_0x0266
        L_0x024e:
            r3 = move-exception
            java.lang.String r2 = "IgHttpDataSource"
            java.lang.String r1 = "IOException occurs when try to get InputStream"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0267 }
            android.util.Log.e(r2, r0, r3)     // Catch:{ all -> 0x0267 }
            r9.closeDownloaderConnectionQuietly()     // Catch:{ all -> 0x0267 }
            r0 = 2000(0x7d0, float:2.803E-42)
            X.47r r1 = new X.47r     // Catch:{ all -> 0x0267 }
            r1.<init>((X.C257263x7) r8, (java.io.IOException) r3, (int) r0, (int) r10)     // Catch:{ all -> 0x0267 }
        L_0x0266:
            throw r1     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x026a:
            java.lang.String r0 = "Invalid video url"
            X.47r r1 = new X.47r
            r1.<init>(r8, r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.igdatasource.IgHttpDataSource.open(X.3x7):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a8, code lost:
        android.util.Log.e(TAG, java.lang.String.format("RuntimeException occurs when try to get InputStream", new java.lang.Object[0]), r6);
        cancel();
        closeDownloaderConnectionQuietly();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        if (r5.dataSpec != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
        throw new X.C2609547r(r5.dataSpec, X.002.A0R("RuntimeException: ", r6.getMessage()), 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d1, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        android.util.Log.e(TAG, java.lang.String.format("Exception occurs when read data from inputSteam in read", new java.lang.Object[0]), r6);
        closeDownloaderConnectionQuietly();
        r1 = r5.dataSpec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        if (r1 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ed, code lost:
        throw new X.C2609547r(r1, r6, (int) org.webrtc.CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r26, int r27, int r28) {
        /*
            r25 = this;
            r10 = 0
            r11 = r26
            X.0qQ.A0B(r11, r10)
            r5 = r25
            monitor-enter(r5)
            X.3x7 r0 = r5.dataSpec     // Catch:{ all -> 0x00ef }
            r4 = 2
            if (r0 != 0) goto L_0x0044
            java.io.InputStream r0 = r5.inputStream     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x0044
            r0 = 503(0x1f7, float:7.05E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x00ef }
            r14 = 0
            java.util.Map r15 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = ""
            android.net.Uri r12 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00ef }
            X.C256703wD.A02(r12)     // Catch:{ all -> 0x00ef }
            X.3x7 r0 = X.C257263x7.A0B     // Catch:{ all -> 0x00ef }
            X.3x6 r13 = new X.3x6     // Catch:{ all -> 0x00ef }
            r13.<init>()     // Catch:{ all -> 0x00ef }
            r19 = 0
            r17 = 1
            r23 = -1
            X.3x7 r11 = new X.3x7     // Catch:{ all -> 0x00ef }
            r16 = r14
            r18 = r10
            r21 = r19
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r23)     // Catch:{ all -> 0x00ef }
            X.47r r0 = new X.47r     // Catch:{ all -> 0x00ef }
            r0.<init>(r11, r1, r4)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x0044:
            long r6 = r5.bytesToSkip     // Catch:{ all -> 0x00ef }
            r8 = 0
            r5.bytesToSkip = r8     // Catch:{ all -> 0x00ef }
            long r2 = r5.bytesToRead     // Catch:{ all -> 0x00ef }
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            r1 = r28
            if (r0 != 0) goto L_0x005c
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x00ef }
            goto L_0x0062
        L_0x005c:
            long r0 = (long) r1     // Catch:{ all -> 0x00ef }
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x00ef }
            int r2 = (int) r0     // Catch:{ all -> 0x00ef }
        L_0x0062:
            monitor-exit(r5)
            java.io.InputStream r0 = r5.inputStream
            r3 = 0
            if (r0 == 0) goto L_0x00ee
        L_0x0068:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0079
            java.io.InputStream r0 = r5.inputStream     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            if (r0 == 0) goto L_0x0075
            long r0 = r0.skip(r6)     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            goto L_0x0077
        L_0x0075:
            r0 = 0
        L_0x0077:
            long r6 = r6 - r0
            goto L_0x0068
        L_0x0079:
            if (r2 != 0) goto L_0x007d
            r3 = -1
            goto L_0x0093
        L_0x007d:
            java.io.InputStream r0 = r5.inputStream     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            if (r0 == 0) goto L_0x0087
            r1 = r27
            int r3 = r0.read(r11, r1, r2)     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
        L_0x0087:
            monitor-enter(r5)     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            long r6 = r5.bytesToRead     // Catch:{ all -> 0x00a4 }
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0092
            long r0 = (long) r3     // Catch:{ all -> 0x00a4 }
            long r6 = r6 - r0
            r5.bytesToRead = r6     // Catch:{ all -> 0x00a4 }
        L_0x0092:
            monitor-exit(r5)     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
        L_0x0093:
            X.3m7 r2 = r5.transferListener     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            if (r2 == 0) goto L_0x00ee
            X.3x7 r1 = r5.dataSpec     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            X.3x7 r0 = X.C257263x7.A0B     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            if (r1 != 0) goto L_0x009f
            X.3x7 r1 = X.C257263x7.A0B     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
        L_0x009f:
            r0 = 1
            r2.Czk(r5, r1, r3, r0)     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            return r3
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
            throw r0     // Catch:{ IOException -> 0x00d1, RuntimeException -> 0x00a7 }
        L_0x00a7:
            r6 = move-exception
            java.lang.String r2 = "IgHttpDataSource"
            java.lang.String r1 = "RuntimeException occurs when try to get InputStream"
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0, r6)
            r5.cancel()
            r5.closeDownloaderConnectionQuietly()
            X.3x7 r0 = r5.dataSpec
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = "RuntimeException: "
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.3x7 r0 = r5.dataSpec
            X.47r r2 = new X.47r
            r2.<init>(r0, r1, r4)
            throw r2
        L_0x00d1:
            r6 = move-exception
            java.lang.String r2 = "IgHttpDataSource"
            java.lang.String r1 = "Exception occurs when read data from inputSteam in read"
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0, r6)
            r5.closeDownloaderConnectionQuietly()
            X.3x7 r1 = r5.dataSpec
            if (r1 == 0) goto L_0x00ee
            r0 = 2000(0x7d0, float:2.803E-42)
            X.47r r2 = new X.47r
            r2.<init>((X.C257263x7) r1, (java.io.IOException) r6, (int) r0, (int) r4)
            throw r2
        L_0x00ee:
            return r3
        L_0x00ef:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.igdatasource.IgHttpDataSource.read(byte[], int, int):int");
    }

    public void setRequestProperty(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        synchronized (this.requestProperties) {
            this.requestProperties.put(str, str2);
        }
    }

    public synchronized void setVideoAsPlaying() {
    }

    private final void putAllTaParamsInHeader(Map map, C257263x7 r5) {
        C257253x6 r2 = r5.A07;
        map.put(AnonymousClass000.A00(1923), String.valueOf(r2.A0A));
        map.put("video_start_ms", String.valueOf(r2.A08));
        map.put(AnonymousClass000.A00(822), String.valueOf(r2.A07));
        map.put("bufferDurationMs", String.valueOf(r2.A00));
        C257223x3 r0 = r2.A0I;
        if (r0 != null) {
            map.put("video_is_prefetch", String.valueOf(r0.A02));
        }
    }

    private final boolean shouldLowerPriorityForLongBufferedPlayback(C257263x7 r4) {
        int i = this.playerSetting.A08;
        if (i <= 0 || r4.A07.A00 <= i) {
            return false;
        }
        return true;
    }

    public void clearAllRequestProperties() {
        synchronized (this.requestProperties) {
            this.requestProperties.clear();
        }
    }

    public void close() {
        C250823m7 r2;
        boolean z = this.isOpened;
        synchronized (this) {
            this.dataSpec = null;
            this.bytesToSkip = 0;
            this.bytesToRead = 0;
            this.ttfB = 0;
            this.isOpened = false;
        }
        InputStream inputStream2 = this.inputStream;
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e) {
                Log.e(TAG, String.format("Exceptions occurs when close current inputSteam", new Object[0]), e);
            } catch (RuntimeException e2) {
                Log.e(TAG, String.format("Exceptions occurs when close current inputSteam", new Object[0]), e2);
            } catch (Throwable th) {
                this.inputStream = null;
                closeDownloaderConnectionQuietly();
                throw th;
            }
            this.inputStream = null;
        }
        closeDownloaderConnectionQuietly();
        if (z && (r2 = this.transferListener) != null) {
            C257263x7 r1 = this.dataSpec;
            C257263x7 r0 = C257263x7.A0B;
            if (r1 == null) {
                r1 = C257263x7.A0B;
            }
            r2.DtX(this, r1, true);
        }
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public Uri getUri() {
        C257263x7 r0 = this.dataSpec;
        if (r0 != null) {
            return r0.A06;
        }
        return null;
    }

    public static final boolean isValidUri(String str) {
        if (Uri.parse(str).getAuthority() != null) {
            return true;
        }
        return false;
    }

    public void abortDataSource() {
        closeDownloaderConnectionQuietly();
    }
}
