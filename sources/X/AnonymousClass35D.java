package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.35D  reason: invalid class name */
public final class AnonymousClass35D {
    public final UserSession A00;
    public final AnonymousClass2xS A01;
    public final AnonymousClass2l3 A02;
    public final C2357130x A03;
    public final Map A04;
    public final Map A05;

    public AnonymousClass35D(UserSession userSession, AnonymousClass2xS r3, AnonymousClass2l3 r4, C2357130x r5) {
        0qQ.A0B(userSession, 4);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = userSession;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        0qQ.A07(synchronizedMap);
        this.A05 = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        0qQ.A07(synchronizedMap2);
        this.A04 = synchronizedMap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (X.AnonymousClass3OE.A00(r11.A00).A00() == false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r12) {
        /*
            r11 = this;
            r10 = 0
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x012a
            java.util.Iterator r2 = r12.iterator()
        L_0x000b:
            boolean r0 = r2.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x009c
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x000b
        L_0x0021:
            X.1Xg r1 = (X.1Xg) r1
            if (r1 == 0) goto L_0x012a
            X.1Xn r0 = r1.A05
            X.1Xj r3 = X.1Xi.A02(r0)
            if (r3 == 0) goto L_0x012a
            int r0 = r3.A0w()
            X.1Xj r0 = r3.A1c(r0)
            if (r0 == 0) goto L_0x0038
            r3 = r0
        L_0x0038:
            java.util.Map r2 = r11.A05
            java.lang.String r0 = r3.A30()
            java.lang.Object r1 = r2.get(r0)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "cache"
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = r3.A30()
            if (r1 == 0) goto L_0x00fe
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            X.0qQ.A07(r0)
            r2.put(r1, r0)
            r4 = r3
            int r0 = r3.A0w()
            X.1Xj r0 = r3.A1c(r0)
            if (r0 == 0) goto L_0x006c
            r4 = r0
        L_0x006c:
            boolean r0 = r4.A50()
            if (r0 == 0) goto L_0x0085
            boolean r0 = r4.A5h()
            if (r0 != 0) goto L_0x0085
            com.instagram.common.session.UserSession r0 = r11.A00
            X.3OF r0 = X.AnonymousClass3OE.A00(r0)
            boolean r0 = r0.A00()
            r9 = 1
            if (r0 != 0) goto L_0x0086
        L_0x0085:
            r9 = 0
        L_0x0086:
            X.2l3 r5 = r11.A02
            X.1iA r2 = r4.BR7()
            boolean r8 = r4.CeS()
            boolean r7 = r3.A5D()
            boolean r3 = r3.CcK()
            monitor-enter(r5)
            if (r9 == 0) goto L_0x00a7
            goto L_0x009e
        L_0x009c:
            r1 = 0
            goto L_0x0021
        L_0x009e:
            X.18g r0 = r5.A0I     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "is_first_media_from_cache_content_video_with_autoplay"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r0.A02     // Catch:{ all -> 0x00fb }
            X.18g.A06(r0, r1, r6)     // Catch:{ all -> 0x00fb }
        L_0x00a7:
            X.1Gs r0 = r5.A0H     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = r2.name()     // Catch:{ all -> 0x00fb }
            X.0qQ.A0B(r6, r10)     // Catch:{ all -> 0x00fb }
            X.1H4 r0 = r0.A01     // Catch:{ all -> 0x00fb }
            X.1H6 r2 = r0.A01     // Catch:{ all -> 0x00fb }
            X.1Gq r1 = r2.A01     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_START"
            r1.A03(r0, r6)     // Catch:{ all -> 0x00fb }
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r2.A00()     // Catch:{ all -> 0x00fb }
            X.1Gx r0 = X.1Gx.A07     // Catch:{ all -> 0x00fb }
            r1.A00(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "first_cache_media_is_video"
            X.0rq r0 = r5.A00     // Catch:{ all -> 0x00fb }
            X.18g.A06(r0, r1, r8)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "feed_first_media_item_from_cache_is_carousel"
            X.0rq r0 = r5.A00     // Catch:{ all -> 0x00fb }
            X.18g.A06(r0, r1, r7)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "feed_first_media_item_from_cache_is_sponsored"
            X.0rq r0 = r5.A00     // Catch:{ all -> 0x00fb }
            X.18g.A06(r0, r1, r3)     // Catch:{ all -> 0x00fb }
            android.os.Handler r3 = r5.A0B     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r2 = r5.A0J     // Catch:{ all -> 0x00fb }
            r0 = 20000(0x4e20, double:9.8813E-320)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x00fb }
            monitor-exit(r5)
            if (r9 == 0) goto L_0x00f0
            X.2xS r1 = r11.A01
            X.4WS r0 = new X.4WS
            r0.<init>(r11)
            r1.A0B(r4, r0)
            return
        L_0x00f0:
            X.30x r1 = r11.A03
            X.3VH r0 = new X.3VH
            r0.<init>(r4, r11)
            r1.A03(r4, r0)
            return
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00fe:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0106:
            r1.add(r0)
            X.2l3 r2 = r11.A02
            java.lang.String r1 = "are_network_and_cache_first_media_same"
            X.0rq r0 = r2.A00
            X.18g.A06(r0, r1, r6)
            r2.A02 = r6
            java.util.Map r1 = r11.A04
            java.lang.String r0 = r3.A30()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x012a
            boolean r1 = r0.booleanValue()
            r0 = 0
            r2.A04(r0, r0, r0, r1)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35D.A02(java.util.List):void");
    }

    public static final void A00(C257183wz r5, AnonymousClass35D r6, String str, String str2, String str3, boolean z) {
        List list = (List) r6.A05.get(str);
        if (list != null) {
            if (list.contains("network")) {
                r6.A02.A04(r5, str2, str3, z);
            }
            if (list.contains("cache")) {
                AnonymousClass2l3 r3 = r6.A02;
                synchronized (r3) {
                    r3.A05 = true;
                    r3.A0B.removeCallbacks(r3.A0J);
                    if (182.A06(0Tu.A05, r3.A0F, 2342160629899531639L)) {
                        r3.A01 = Boolean.valueOf(z);
                    }
                    if (z) {
                        AnonymousClass1H6 r2 = r3.A0H.A01.A01;
                        r2.A01.A02("FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_END");
                        r2.A00().A00(1Gx.A08);
                        if (str2 != null) {
                            18g.A05(r3.A00, "first_media_network_content_image_load_source", str2);
                        }
                        if (r5 != null) {
                            18g.A05(r3.A00, "first_media_network_content_video_cache_type", r5.name());
                        }
                    } else {
                        1Gs r0 = r3.A0H;
                        if (str3 == null) {
                            str3 = "unknown";
                        }
                        AnonymousClass1H6 r22 = r0.A01.A01;
                        r22.A01.A03("FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_FAILED", str3);
                        r22.A00().A00(1Gx.A03);
                    }
                    AnonymousClass2l3.A01(r3);
                }
            }
        }
        r6.A04.put(str, Boolean.valueOf(z));
    }

    public static final void A01(1Xj r5, 1Xj r6, AnonymousClass35D r7, boolean z) {
        AnonymousClass2l3 r4 = r7.A02;
        r6.BR7();
        boolean CeS = r6.CeS();
        boolean A5D = r5.A5D();
        boolean CcK = r5.CcK();
        synchronized (r4) {
            if (z) {
                18g.A06(r4.A00, "is_first_media_from_network_content_video_with_autoplay", true);
                r4.A06 = true;
            }
            1H1 r2 = r4.A0H.A02.A02;
            r2.A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_START", (Long) null);
            r2.A00().A00(1Gx.A07);
            18g.A06(r4.A00, "first_network_media_is_video", CeS);
            18g.A06(r4.A00, "feed_first_media_item_from_network_is_carousel", A5D);
            18g.A06(r4.A00, "feed_first_media_item_from_network_is_sponsored", CcK);
            r4.A0Q = true;
        }
    }
}
