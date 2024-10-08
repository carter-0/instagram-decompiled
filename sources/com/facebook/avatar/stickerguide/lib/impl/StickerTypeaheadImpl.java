package com.facebook.avatar.stickerguide.lib.impl;

import X.0sn;
import X.136;
import X.AnonymousClass7TG;
import X.C62919KoX;
import X.C63571KzK;
import X.C64121LOo;
import X.C66557MWl;
import X.LFu;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class StickerTypeaheadImpl {
    public List A00;
    public final LFu A01;
    public final C64121LOo A02;
    public final C62919KoX A03;
    public final C66557MWl A04;
    public final C63571KzK A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;
    public final 136 A08 = new 136();
    public volatile boolean A09;

    /* JADX WARNING: type inference failed for: r11v1, types: [X.MDi, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r16, java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r15 = this;
            r13 = r17
            r12 = 0
            r3 = r18
            boolean r0 = X.C66130MDi.A01(r12, r3)
            if (r0 == 0) goto L_0x002c
            r11 = r3
            X.MDi r11 = (X.C66130MDi) r11
            int r2 = r11.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r11.A01 = r2
        L_0x0019:
            java.lang.Object r4 = r11.A03
            X.1Hj r10 = X.1Hj.A02
            int r0 = r11.A01
            r9 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r9) goto L_0x0032
            int r8 = r11.A00
            java.lang.Object r7 = r11.A02
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r7 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r7
            goto L_0x00f7
        L_0x002c:
            X.MDi r11 = new X.MDi
            r11.<init>(r15, r3, r12)
            goto L_0x0019
        L_0x0032:
            java.lang.IllegalStateException r6 = X.AnonymousClass7TE.A0x()
            throw r6
        L_0x0037:
            X.0eS.A00(r4)
            if (r16 == 0) goto L_0x0144
            int r0 = r16.length()
            if (r0 == 0) goto L_0x0144
            X.2SP r0 = X.2SP.A01
            int r8 = r0.A03()
            X.KoX r7 = r15.A03
            com.facebook.quicklog.QuickPerformanceLogger r0 = r7.A00
            r6 = 192480909(0xb79068d, float:4.7960584E-32)
            r0.markerStart(r6, r8)
            java.lang.String r14 = X.DbV.A12(r16)
            X.LFu r0 = r15.A01
            java.lang.String r1 = r0.A02
            java.util.List r1 = X.DbX.A0x(r1)
            java.util.Set r5 = X.00k.A0k(r1)
            X.KzK r4 = r15.A05
            java.lang.String r1 = "text"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r14)
            long r1 = r0.A01
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "minLen"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r2)
            long r0 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "maxWords"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            if (r17 != 0) goto L_0x0086
            java.lang.String r13 = ""
        L_0x0086:
            java.lang.String r0 = "thread_id"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r13, r3, r2, r1)
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)
            X.0qQ.A0B(r1, r12)
            java.util.List r0 = r4.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0099:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r2 = r3.next()
            X.MTJ r2 = (X.MTJ) r2
            java.lang.String r0 = r2.Bou()
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0099
            boolean r0 = r2.Eta(r1)
            if (r0 != 0) goto L_0x0099
            java.lang.String r1 = "do_not_trigger_suggestion"
            com.facebook.quicklog.QuickPerformanceLogger r0 = r7.A00
            r0.markerPoint(r6, r8, r1)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r7.A00
            java.lang.String r0 = "result_size"
            r1.markerAnnotate(r6, r8, r0, r12)
            r0 = 2
            r1.markerEnd(r6, r8, r0)
            X.LOo r10 = new X.LOo
            r10.<init>((X.MTJ) r2)
        L_0x00cc:
            return r10
        L_0x00cd:
            java.lang.String r1 = "trigger_suggestion"
            com.facebook.quicklog.QuickPerformanceLogger r0 = r7.A00
            r0.markerPoint(r6, r8, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            X.0qQ.A08(r0)
            java.lang.String r3 = X.DbT.A12(r0, r14)
            X.MWl r2 = r15.A04     // Catch:{ all -> 0x011e }
            r11.A02 = r15     // Catch:{ all -> 0x011e }
            r11.A00 = r8     // Catch:{ all -> 0x011e }
            r11.A01 = r9     // Catch:{ all -> 0x011e }
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r2 = (com.instagram.avatars.suggestions.LexiconRecommendationProvider) r2     // Catch:{ all -> 0x011e }
            com.facebook.mantle.ig.IGMantle r1 = r2.A00     // Catch:{ all -> 0x011e }
            boolean r0 = r2.A01     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x0118
            if (r1 == 0) goto L_0x0118
            java.lang.Object r4 = com.instagram.avatars.suggestions.LexiconRecommendationProvider.A00(r1, r2, r3, r11)     // Catch:{ all -> 0x011e }
            if (r4 == r10) goto L_0x00cc
            r7 = r15
            goto L_0x00fa
        L_0x00f7:
            X.0eS.A00(r4)     // Catch:{ all -> 0x0116 }
        L_0x00fa:
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0116 }
            X.KoX r0 = r7.A03     // Catch:{ all -> 0x0116 }
            int r3 = r4.size()     // Catch:{ all -> 0x0116 }
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A00     // Catch:{ all -> 0x0116 }
            r1 = 192480909(0xb79068d, float:4.7960584E-32)
            java.lang.String r0 = "result_size"
            r2.markerAnnotate(r1, r8, r0, r3)     // Catch:{ all -> 0x0116 }
            r0 = 2
            r2.markerEnd(r1, r8, r0)     // Catch:{ all -> 0x0116 }
            X.LOo r10 = new X.LOo     // Catch:{ all -> 0x0116 }
            r10.<init>((java.util.List) r4)     // Catch:{ all -> 0x0116 }
            return r10
        L_0x0116:
            r6 = move-exception
            goto L_0x0120
        L_0x0118:
            X.Kkh r0 = new X.Kkh     // Catch:{ all -> 0x011e }
            r0.<init>()     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x011e }
        L_0x011e:
            r6 = move-exception
            r7 = r15
        L_0x0120:
            java.lang.String r5 = r6.getMessage()
            if (r5 != 0) goto L_0x0128
            java.lang.String r5 = "Failed to get inference from Mantle"
        L_0x0128:
            X.KoX r4 = r7.A03
            java.lang.String r3 = X.2Og.A00(r6)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r4.A00
            r2 = 192480909(0xb79068d, float:4.7960584E-32)
            java.lang.String r0 = "fail_stacktrace"
            r1.markerAnnotate(r2, r8, r0, r3)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r4.A00
            java.lang.String r0 = "fail_reason"
            r1.markerAnnotate(r2, r8, r0, r5)
            r0 = 3
            r1.markerEnd(r2, r8, r0)
            throw r6
        L_0x0144:
            X.LOo r10 = r15.A02
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDl, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            java.lang.String r9 = "Failed to make first initialization call to Mantle"
            r8 = 3
            boolean r0 = X.C66133MDl.A01(r8, r13)
            if (r0 == 0) goto L_0x0035
            r4 = r13
            X.MDl r4 = (X.C66133MDl) r4
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0035
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0017:
            java.lang.Object r0 = r4.A05
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A01
            r3 = 2
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r2) goto L_0x0040
            if (r1 != r3) goto L_0x003b
            int r10 = r4.A00
            java.lang.Object r11 = r4.A04
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r11 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r11
            java.lang.Object r6 = r4.A03
            X.136 r6 = (X.136) r6
            java.lang.Object r4 = r4.A02
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r4 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r4
            goto L_0x008c
        L_0x0035:
            X.MDl r4 = new X.MDl
            r4.<init>(r12, r13, r8)
            goto L_0x0017
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0040:
            java.lang.Object r6 = r4.A03
            X.136 r6 = (X.136) r6
            java.lang.Object r11 = r4.A02
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r11 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r11
            X.0eS.A00(r0)
            goto L_0x0062
        L_0x004c:
            X.0eS.A00(r0)
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x00d1
            X.136 r6 = r12.A08
            r4.A02 = r12
            r4.A03 = r6
            r4.A01 = r2
            java.lang.Object r0 = X.136.A00(r4, r6)
            if (r0 == r5) goto L_0x00d0
            r11 = r12
        L_0x0062:
            X.2SP r0 = X.2SP.A01     // Catch:{ all -> 0x00cb }
            int r10 = r0.A03()     // Catch:{ all -> 0x00cb }
            boolean r0 = r11.A09     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x00d4
            X.KoX r0 = r11.A03     // Catch:{ all -> 0x00a2 }
            com.facebook.quicklog.QuickPerformanceLogger r1 = r0.A00     // Catch:{ all -> 0x00a2 }
            r0 = 192482012(0xb790adc, float:4.7963825E-32)
            r1.markerStart(r0, r10)     // Catch:{ all -> 0x00a2 }
            X.MWl r1 = r11.A04     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "3aacfcfd-2636-23ab-b649-bc484s93d30s"
            r4.A02 = r11     // Catch:{ all -> 0x00a2 }
            r4.A03 = r6     // Catch:{ all -> 0x00a2 }
            r4.A04 = r11     // Catch:{ all -> 0x00a2 }
            r4.A00 = r10     // Catch:{ all -> 0x00a2 }
            r4.A01 = r3     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = r1.CN0(r0, r4)     // Catch:{ all -> 0x00a2 }
            if (r0 == r5) goto L_0x00d0
            r4 = r11
            goto L_0x008f
        L_0x008c:
            X.0eS.A00(r0)     // Catch:{ all -> 0x00a0 }
        L_0x008f:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00a0 }
            r11.A00 = r0     // Catch:{ all -> 0x00a0 }
            X.KoX r0 = r4.A03     // Catch:{ all -> 0x00a0 }
            com.facebook.quicklog.QuickPerformanceLogger r1 = r0.A00     // Catch:{ all -> 0x00a0 }
            r0 = 192482012(0xb790adc, float:4.7963825E-32)
            r1.markerEnd(r0, r10, r3)     // Catch:{ all -> 0x00a0 }
            r4.A09 = r2     // Catch:{ all -> 0x00a0 }
            goto L_0x00d3
        L_0x00a0:
            r5 = move-exception
            goto L_0x00a4
        L_0x00a2:
            r5 = move-exception
            r4 = r11
        L_0x00a4:
            java.lang.String r0 = "StickerTypeaheadImpl"
            X.0KC.A0G(r0, r9, r5)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00b0
            r9 = r0
        L_0x00b0:
            X.KoX r4 = r4.A03     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = X.2Og.A00(r5)     // Catch:{ all -> 0x00cb }
            com.facebook.quicklog.QuickPerformanceLogger r1 = r4.A00     // Catch:{ all -> 0x00cb }
            r2 = 192482012(0xb790adc, float:4.7963825E-32)
            java.lang.String r0 = "fail_stacktrace"
            r1.markerAnnotate(r2, r10, r0, r3)     // Catch:{ all -> 0x00cb }
            com.facebook.quicklog.QuickPerformanceLogger r1 = r4.A00     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "fail_reason"
            r1.markerAnnotate(r2, r10, r0, r9)     // Catch:{ all -> 0x00cb }
            r1.markerEnd(r2, r10, r8)     // Catch:{ all -> 0x00cb }
            throw r5     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            r6.A05(r7)
            throw r0
        L_0x00d0:
            return r5
        L_0x00d1:
            r11 = r12
            goto L_0x00d7
        L_0x00d3:
            r11 = r4
        L_0x00d4:
            r6.A05(r7)
        L_0x00d7:
            java.util.List r0 = r11.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl.A01(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.KoX, java.lang.Object] */
    public StickerTypeaheadImpl(LFu lFu, C66557MWl mWl, QuickPerformanceLogger quickPerformanceLogger, List list) {
        AnonymousClass7TG.A1P(mWl, quickPerformanceLogger);
        this.A04 = mWl;
        this.A01 = lFu;
        C63571KzK kzK = new C63571KzK();
        this.A05 = kzK;
        List list2 = 0sn.A00;
        this.A02 = new C64121LOo(list2);
        ? obj = new Object();
        obj.A00 = quickPerformanceLogger;
        this.A03 = obj;
        this.A06 = new AtomicBoolean(false);
        this.A07 = new AtomicBoolean(false);
        kzK.A00.addAll(list == null ? list2 : list);
    }
}
