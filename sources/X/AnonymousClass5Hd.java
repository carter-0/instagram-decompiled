package X;

import android.net.Uri;
import android.os.Handler;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;

/* renamed from: X.5Hd  reason: invalid class name */
public final class AnonymousClass5Hd implements C256453vn {
    public final C256243vS A00;
    public final int A01;
    public final Handler A02;
    public final AnonymousClass27J A03;
    public final VpsEventCallback A04;
    public final 28W A05;
    public final HeroPlayerSetting A06;
    public final Map A07;
    public final boolean A08;

    public final void AE0() {
    }

    private void A00(String str) {
        String str2;
        if (this.A08) {
            VpsEventCallback vpsEventCallback = this.A04;
            C256243vS r1 = this.A00;
            C255653uU r0 = r1.A0D;
            if (r0 != null && (str2 = r0.A0G) != null) {
                vpsEventCallback.callback(new C305706Jf(str2, String.valueOf(r1.A0L), str, true));
            }
        }
    }

    public final void AG6(String str) {
        A00(AnonymousClass000.A00(2118));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.5fP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.5fO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.5fO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: X.5fO} */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent, com.facebook.exoplayer.ipc.VideoPlayerServiceEvent, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0077, code lost:
        if (r1 == X.AnonymousClass05K.A0Y) goto L_0x0079;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void APw() {
        /*
            r37 = this;
            r12 = r37
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x0012
            com.facebook.exoplayer.monitor.VpsEventCallback r2 = r12.A04
            X.3vS r1 = r12.A00
            X.3xF r0 = new X.3xF
            r0.<init>(r1)
            r2.callback(r0)
        L_0x0012:
            X.28W r11 = r12.A05
            X.3vS r6 = r12.A00
            X.3uU r13 = r6.A0D
            android.net.Uri r10 = r13.A05
            android.os.Handler r0 = r12.A02
            r36 = r0
            java.lang.String r5 = r13.A0G
            java.lang.String r4 = r13.A0A
            java.lang.String r3 = r13.A0B
            X.28e r2 = r6.A0B
            X.3uT r1 = r13.A06
            boolean r0 = r6.A0W
            X.3wn r9 = new X.3wn
            r16 = r1
            r17 = r5
            r18 = r4
            r19 = r3
            r20 = r0
            r14 = r9
            r15 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.util.Map r8 = r12.A07
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r7 = r12.A06
            com.facebook.exoplayer.monitor.VpsEventCallback r6 = r12.A04
            java.lang.String r1 = r13.A09
            int r0 = r12.A01
            r17 = r0
            X.27J r0 = r12.A03
            r16 = r0
            java.lang.String r27 = "DashLivePrefetchTask"
            r32 = 0
            monitor-enter(r11)
            r11.A00(r7, r8)     // Catch:{ all -> 0x0107 }
            r5 = 0
            r4 = 1
            java.util.concurrent.atomic.AtomicReference r15 = r11.A03     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r15.get()     // Catch:{ all -> 0x0107 }
            android.util.LruCache r0 = (android.util.LruCache) r0     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r9.A07     // Catch:{ all -> 0x0107 }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x0107 }
            X.5fP r2 = (X.C290495fP) r2     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x0086
            java.lang.Integer r1 = r2.A0K     // Catch:{ all -> 0x0107 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0107 }
            if (r1 == r0) goto L_0x0079
            java.lang.Integer r1 = r2.A0K     // Catch:{ all -> 0x0107 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0107 }
            if (r1 == r0) goto L_0x0079
            java.lang.Integer r1 = r2.A0K     // Catch:{ all -> 0x0107 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0107 }
            if (r1 != r0) goto L_0x00ce
        L_0x0079:
            java.lang.String r2 = "DashLiveChunkSourceCache"
            java.lang.String r1 = "Video has been prefetched or currently prefetching %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0107 }
            X.27B.A01(r2, r1, r0)     // Catch:{ all -> 0x0107 }
            goto L_0x0105
        L_0x0086:
            r2 = 0
            X.3vc r0 = new X.3vc     // Catch:{ 2A6 -> 0x00f6 }
            r0.<init>(r2, r7, r2, r4)     // Catch:{ 2A6 -> 0x00f6 }
            X.3w6 r26 = X.C256373vf.A02(r10, r0, r1)     // Catch:{ 2A6 -> 0x00f6 }
            android.content.Context r14 = r11.A00     // Catch:{ all -> 0x0107 }
            X.28Y r13 = r11.A02     // Catch:{ all -> 0x0107 }
            X.28X r12 = r11.A01     // Catch:{ all -> 0x0107 }
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0107 }
            r1.<init>(r5)     // Catch:{ all -> 0x0107 }
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0107 }
            r0.<init>(r5)     // Catch:{ all -> 0x0107 }
            X.5fO r2 = new X.5fO     // Catch:{ all -> 0x0107 }
            r25 = r7
            r28 = r8
            r29 = r1
            r30 = r0
            r31 = r17
            r34 = r4
            r35 = r4
            r21 = r16
            r22 = r6
            r23 = r9
            r24 = r13
            r18 = r10
            r19 = r36
            r20 = r12
            r16 = r2
            r17 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35)     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r15.get()     // Catch:{ all -> 0x0107 }
            android.util.LruCache r0 = (android.util.LruCache) r0     // Catch:{ all -> 0x0107 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0107 }
        L_0x00ce:
            java.lang.String r5 = "DashLiveChunkSourceCache"
            java.lang.String r1 = "Start loading dash live manifest: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0107 }
            X.27B.A01(r5, r1, r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = "dash.live_prefetch_max_retries"
            boolean r0 = r8.containsKey(r1)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r8.get(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0107 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0107 }
            if (r1 <= 0) goto L_0x00f2
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0G     // Catch:{ all -> 0x0107 }
            r0.set(r1)     // Catch:{ all -> 0x0107 }
        L_0x00f2:
            r2.A02(r4)     // Catch:{ all -> 0x0107 }
            goto L_0x0105
        L_0x00f6:
            r3 = move-exception
            X.RFX r2 = X.RFX.MANIFEST_PARSE_ERROR     // Catch:{ all -> 0x0107 }
            com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent r0 = new com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent     // Catch:{ all -> 0x0107 }
            r0.<init>()     // Catch:{ all -> 0x0107 }
            r0.A01 = r1     // Catch:{ all -> 0x0107 }
            r0.A00 = r3     // Catch:{ all -> 0x0107 }
            r6.callback(r2, r0)     // Catch:{ all -> 0x0107 }
        L_0x0105:
            monitor-exit(r11)
            return
        L_0x0107:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Hd.APw():void");
    }

    public final C256423vk Bff() {
        return C256423vk.HIGH;
    }

    public final void DED() {
        if (this.A06.A2n) {
            this.A04.callback(new C257353xG(this.A00, "FAIL", "", "", -1.0f, -1, -1, -1, -1));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5Hd) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public final void onComplete() {
        if (this.A06.A2n) {
            this.A04.callback(new C257353xG(this.A00, "SUCCESS", "", "", -1.0f, -1, -1, -1, -1));
        }
    }

    public final String toString() {
        Uri uri = this.A00.A0D.A05;
        if (uri == null) {
            return "";
        }
        return uri.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r8.A2p != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5Hd(android.os.Handler r3, X.AnonymousClass27J r4, com.facebook.exoplayer.monitor.VpsEventCallback r5, X.28W r6, X.C256243vS r7, com.facebook.video.heroplayer.setting.HeroPlayerSetting r8, java.util.Map r9, int r10) {
        /*
            r2 = this;
            r2.<init>()
            r2.A05 = r6
            r2.A07 = r9
            r2.A06 = r8
            r2.A02 = r3
            r2.A01 = r10
            r2.A04 = r5
            r2.A00 = r7
            r2.A03 = r4
            boolean r0 = r8.A2n
            if (r0 != 0) goto L_0x001c
            boolean r1 = r8.A2p
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Hd.<init>(android.os.Handler, X.27J, com.facebook.exoplayer.monitor.VpsEventCallback, X.28W, X.3vS, com.facebook.video.heroplayer.setting.HeroPlayerSetting, java.util.Map, int):void");
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final void Ddg(String str) {
        A00(str);
    }
}
