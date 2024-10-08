package X;

import android.media.MediaFormat;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mediastreaming.opt.muxer.AndroidPlatformMediaMuxerHybrid;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import java.io.File;
import java.util.Arrays;

public final class W1Q {
    public int A00;
    public long A01 = Long.MIN_VALUE;
    public long A02;
    public long A03;
    public long A04 = Long.MIN_VALUE;
    public MediaFormat A05;
    public MediaFormat A06;
    public Object A07;
    public Object A08;
    public long A09;
    public final AnonymousClass0JR A0A;
    public final AndroidPlatformMediaMuxerHybrid A0B;
    public final C17412VUr A0C;
    public final TempFileCreator A0D;
    public volatile long A0E;
    public volatile File A0F;
    public volatile Exception A0G;
    public volatile Integer A0H = AnonymousClass05K.A00;
    public volatile boolean A0I;
    public volatile boolean A0J;
    public volatile boolean A0K;
    public volatile boolean A0L;
    public volatile boolean A0M;

    public W1Q(AnonymousClass0JR r3, AndroidPlatformMediaMuxerHybrid androidPlatformMediaMuxerHybrid, C17412VUr vUr, TempFileCreator tempFileCreator) {
        0qQ.A0B(vUr, 3);
        this.A0A = r3;
        this.A0D = tempFileCreator;
        this.A0C = vUr;
        this.A0B = androidPlatformMediaMuxerHybrid;
    }

    public static final synchronized void A01(W1Q w1q, Exception exc) {
        synchronized (w1q) {
            Class<W1Q> cls = W1Q.class;
            Object[] copyOf = Arrays.copyOf(new Object[]{exc.getClass(), exc.getMessage()}, 2);
            0qQ.A0B(copyOf, 3);
            W3b.A01(cls.getSimpleName(), "Muxing failed due to exception %s: %s", (Throwable) null, Arrays.copyOf(copyOf, copyOf.length));
            w1q.A0K = true;
            w1q.A0G = exc;
            File file = w1q.A0F;
            if (file != null) {
                file.delete();
            }
            w1q.A0F = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r11 == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
        if (r11 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void A02(boolean r11, boolean r12) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            boolean r0 = r10.A0M     // Catch:{ all -> 0x00c9 }
            r6 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r11 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r10.A0M = r0     // Catch:{ all -> 0x00c9 }
            boolean r0 = r10.A0I     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0015
            r0 = 0
            if (r11 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r10.A0I = r0     // Catch:{ all -> 0x00c9 }
            boolean r0 = r10.A0J     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0072
            boolean r0 = r10.A0M     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r10.A0I     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00ae
            X.0JR r0 = r10.A0A     // Catch:{ all -> 0x00c9 }
            long r4 = r0.now()     // Catch:{ all -> 0x00c9 }
            long r0 = r10.A0E     // Catch:{ all -> 0x00c9 }
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0034
            r10.A0E = r4     // Catch:{ all -> 0x00c9 }
        L_0x0034:
            if (r12 != 0) goto L_0x0044
            boolean r0 = r10.A0L     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00ae
            if (r11 == 0) goto L_0x00ae
            r10.A0L = r3     // Catch:{ all -> 0x00c9 }
            com.facebook.mediastreaming.opt.muxer.AndroidPlatformMediaMuxerHybrid r0 = r10.A0B     // Catch:{ all -> 0x00c9 }
            r0.requestRestartVideoEncoder()     // Catch:{ all -> 0x00c9 }
            goto L_0x00ae
        L_0x0044:
            r10.A0L = r6     // Catch:{ all -> 0x00c9 }
            long r1 = r10.A0E     // Catch:{ all -> 0x00c9 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0072
            long r0 = r10.A0E     // Catch:{ all -> 0x00c9 }
            long r7 = r4 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            java.lang.String r2 = "Frame/sample drop too high since a/v sync start:%d now:%d"
            long r0 = r10.A0E     // Catch:{ all -> 0x00c9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r1, r0)     // Catch:{ all -> 0x00c9 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x00c9 }
            X.0qQ.A0B(r1, r3)     // Catch:{ all -> 0x00c9 }
            X.V1d r0 = new X.V1d     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x0072:
            X.VUr r2 = r10.A0C     // Catch:{ all -> 0x00d0 }
            java.io.File r0 = r10.A0F     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x00d0 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00d0 }
            android.media.MediaMuxer r1 = new android.media.MediaMuxer     // Catch:{ all -> 0x00d0 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x00d0 }
            r2.A02 = r1     // Catch:{ all -> 0x00d0 }
            android.media.MediaFormat r0 = r10.A06     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00bf
            int r0 = r1.addTrack(r0)     // Catch:{ all -> 0x00d0 }
            r2.A01 = r0     // Catch:{ all -> 0x00d0 }
            android.media.MediaMuxer r0 = r2.A02     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00ba
            r0.setOrientationHint(r6)     // Catch:{ all -> 0x00d0 }
            android.media.MediaFormat r1 = r10.A05     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00b5
            android.media.MediaMuxer r0 = r2.A02     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00cb
            int r0 = r0.addTrack(r1)     // Catch:{ all -> 0x00d0 }
            r2.A00 = r0     // Catch:{ all -> 0x00d0 }
            android.media.MediaMuxer r0 = r2.A02     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00b0
            r0.start()     // Catch:{ all -> 0x00d0 }
            r10.A0J = r3     // Catch:{ all -> 0x00d0 }
        L_0x00ae:
            monitor-exit(r9)
            return
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x00d0 }
            goto L_0x00cf
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x00d0 }
            goto L_0x00cf
        L_0x00ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x00d0 }
            goto L_0x00cf
        L_0x00bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x00d0 }
            goto L_0x00cf
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x00d0 }
            goto L_0x00cf
        L_0x00c9:
            r0 = move-exception
            goto L_0x00cf
        L_0x00cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x00d0 }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1Q.A02(boolean, boolean):void");
    }

    public static final void A00(W1Q w1q) {
        int i;
        if (w1q.A02 != 0 && !w1q.A0K && w1q.A0F != null) {
            long now = w1q.A0A.now();
            long j = w1q.A09;
            if (j == 0 || ((i = w1q.A00) >= 0 && now - j >= ((long) (i * IgNetworkConsentStorage.MAX_ENTRIES)))) {
                w1q.A09 = now;
                File file = w1q.A0F;
                if (file != null && file.exists()) {
                    long usableSpace = file.getUsableSpace();
                    long length = file.length();
                    if (usableSpace >= w1q.A02 * 1024 * 1024) {
                        long j2 = w1q.A03;
                        if (j2 > 0 && length > j2 * 1024 * 1024) {
                            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("exceedMaxDvrFileSize size:%d", Long.valueOf(length));
                            0qQ.A07(formatStrLocaleSafe);
                            throw new Exception(formatStrLocaleSafe);
                        }
                        return;
                    }
                    throw new Exception(StringFormatUtil.formatStrLocaleSafe("lowDiskSpace size:%d, space:%d", Long.valueOf(length), Long.valueOf(usableSpace)));
                }
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    public final void A03(android.media.MediaFormat r18, java.lang.Integer r19, java.nio.ByteBuffer r20, int r21, int r22, int r23, int r24, long r25) {
        /*
            r17 = this;
            r4 = r17
            int r3 = r19.intValue()
            r2 = 0
            r1 = r18
            r0 = r20
            r12 = r21
            r13 = r22
            r8 = r23
            r16 = r24
            if (r3 == r2) goto L_0x009c
            r7 = 1
            boolean r5 = r4.A0K
            if (r5 != 0) goto L_0x013b
            java.lang.Integer r6 = r4.A0H
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            if (r6 != r5) goto L_0x013b
            A00(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.Object r11 = r4.A08     // Catch:{ Exception -> 0x0137 }
            if (r11 != 0) goto L_0x002e
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x0137 }
            r11.<init>()     // Catch:{ Exception -> 0x0137 }
            r4.A08 = r11     // Catch:{ Exception -> 0x0137 }
        L_0x002e:
            android.media.MediaCodec$BufferInfo r11 = (android.media.MediaCodec.BufferInfo) r11     // Catch:{ Exception -> 0x0137 }
            long r14 = (long) r8     // Catch:{ Exception -> 0x0137 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r5
            long r25 = r25 % r5
            long r14 = r14 + r25
            r11.set(r12, r13, r14, r16)     // Catch:{ Exception -> 0x0137 }
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0137 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0137 }
            r4.A06 = r1     // Catch:{ Exception -> 0x0137 }
            r0 = r24 & 2
            if (r0 != 0) goto L_0x0064
            long r5 = r11.presentationTimeUs     // Catch:{ Exception -> 0x0137 }
            long r0 = r4.A04     // Catch:{ Exception -> 0x0137 }
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x005d
            java.lang.Class<X.W1Q> r1 = X.W1Q.class
            java.lang.String r0 = "Incorrect pts for dvr video frame."
            X.0KC.A02(r1, r0)     // Catch:{ Exception -> 0x0137 }
            long r0 = r4.A04     // Catch:{ Exception -> 0x0137 }
            r9 = 1
            long r5 = r0 + r9
            r11.presentationTimeUs = r5     // Catch:{ Exception -> 0x0137 }
        L_0x005d:
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0062
            r5 = r0
        L_0x0062:
            r4.A04 = r5     // Catch:{ Exception -> 0x0137 }
        L_0x0064:
            int r0 = r11.flags     // Catch:{ Exception -> 0x0137 }
            r0 = r0 & 2
            if (r0 != 0) goto L_0x013b
            monitor-enter(r4)     // Catch:{ Exception -> 0x0137 }
            boolean r0 = r4.A0K     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x0129
            boolean r0 = r4.A0J     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x007d
            int r0 = r11.flags     // Catch:{ all -> 0x012b }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x007a
            r2 = 1
        L_0x007a:
            r4.A02(r7, r2)     // Catch:{ all -> 0x012b }
        L_0x007d:
            boolean r0 = r4.A0J     // Catch:{ all -> 0x012b }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0137 }
            if (r0 == 0) goto L_0x013b
            X.VUr r0 = r4.A0C     // Catch:{ Exception -> 0x012e }
            java.lang.Object r2 = r8.get()     // Catch:{ Exception -> 0x012e }
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ Exception -> 0x012e }
            if (r2 == 0) goto L_0x013b
            android.media.MediaMuxer r1 = r0.A02     // Catch:{ Exception -> 0x012e }
            if (r1 == 0) goto L_0x0097
            int r0 = r0.A01     // Catch:{ Exception -> 0x012e }
            r1.writeSampleData(r0, r2, r11)     // Catch:{ Exception -> 0x012e }
            goto L_0x013b
        L_0x0097:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x012e }
            throw r0     // Catch:{ Exception -> 0x012e }
        L_0x009c:
            boolean r5 = r4.A0K
            if (r5 != 0) goto L_0x013b
            java.lang.Integer r6 = r4.A0H
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            if (r6 != r5) goto L_0x013b
            A00(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.Object r11 = r4.A07     // Catch:{ Exception -> 0x0137 }
            if (r11 != 0) goto L_0x00b4
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x0137 }
            r11.<init>()     // Catch:{ Exception -> 0x0137 }
            r4.A07 = r11     // Catch:{ Exception -> 0x0137 }
        L_0x00b4:
            android.media.MediaCodec$BufferInfo r11 = (android.media.MediaCodec.BufferInfo) r11     // Catch:{ Exception -> 0x0137 }
            long r14 = (long) r8     // Catch:{ Exception -> 0x0137 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r5
            long r5 = r25 % r5
            long r14 = r14 + r5
            r11.set(r12, r13, r14, r16)     // Catch:{ Exception -> 0x0137 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0137 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0137 }
            r4.A05 = r1     // Catch:{ Exception -> 0x0137 }
            long r5 = r11.presentationTimeUs     // Catch:{ Exception -> 0x0137 }
            long r0 = r4.A01     // Catch:{ Exception -> 0x0137 }
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ee
            java.lang.Class<X.W1Q> r6 = X.W1Q.class
            java.lang.String r5 = "LiveStreamMux Audio PTS OutOfOrder CurPresentationTime %d LastPresentationTime %d "
            java.lang.Long r2 = java.lang.Long.valueOf(r25)     // Catch:{ Exception -> 0x0137 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0137 }
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch:{ Exception -> 0x0137 }
            X.0KC.A0A(r6, r5, r0)     // Catch:{ Exception -> 0x0137 }
            boolean r0 = r4.A0K     // Catch:{ Exception -> 0x0137 }
            r1 = r0 ^ 1
            java.lang.Exception r0 = r4.A0G     // Catch:{ Exception -> 0x0137 }
            X.VQu r5 = new X.VQu     // Catch:{ Exception -> 0x0137 }
            r5.<init>(r1, r0)     // Catch:{ Exception -> 0x0137 }
            goto L_0x0146
        L_0x00ee:
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x00f7
            r0 = 1
            long r5 = r5 + r0
            r11.presentationTimeUs = r5     // Catch:{ Exception -> 0x0137 }
        L_0x00f7:
            r4.A01 = r5     // Catch:{ Exception -> 0x0137 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0137 }
            boolean r0 = r4.A0K     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x0129
            boolean r0 = r4.A0J     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x0105
            r4.A02(r2, r2)     // Catch:{ all -> 0x012b }
        L_0x0105:
            boolean r0 = r4.A0J     // Catch:{ all -> 0x012b }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0137 }
            if (r0 == 0) goto L_0x013b
            int r0 = r11.flags     // Catch:{ Exception -> 0x0137 }
            r0 = r0 & 2
            if (r0 != 0) goto L_0x013b
            X.VUr r0 = r4.A0C     // Catch:{ Exception -> 0x0137 }
            java.lang.Object r2 = r7.get()     // Catch:{ Exception -> 0x0137 }
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ Exception -> 0x0137 }
            if (r2 == 0) goto L_0x013b
            android.media.MediaMuxer r1 = r0.A02     // Catch:{ Exception -> 0x0137 }
            if (r1 == 0) goto L_0x0124
            int r0 = r0.A00     // Catch:{ Exception -> 0x0137 }
            r1.writeSampleData(r0, r2, r11)     // Catch:{ Exception -> 0x0137 }
            goto L_0x013b
        L_0x0124:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0137 }
            goto L_0x0136
        L_0x0129:
            monitor-exit(r4)     // Catch:{ Exception -> 0x0137 }
            goto L_0x013b
        L_0x012b:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0137 }
            goto L_0x0136
        L_0x012e:
            r2 = move-exception
            java.lang.Class<X.W1Q> r1 = X.W1Q.class
            java.lang.String r0 = "LiveStreamMux Error writing Video samples "
            X.0KC.A05(r1, r0, r2)     // Catch:{ Exception -> 0x0137 }
        L_0x0136:
            throw r2     // Catch:{ Exception -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            A01(r4, r0)
        L_0x013b:
            boolean r0 = r4.A0K
            r1 = r0 ^ 1
            java.lang.Exception r0 = r4.A0G
            X.VQu r5 = new X.VQu
            r5.<init>(r1, r0)
        L_0x0146:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x015e
            com.facebook.mediastreaming.opt.muxer.AndroidPlatformMediaMuxerHybrid r2 = r4.A0B
            if (r3 == 0) goto L_0x015f
            java.lang.String r1 = "VIDEO"
        L_0x0150:
            java.lang.String r0 = "Failed to mux %s data"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            X.0qQ.A07(r1)
            java.lang.Throwable r0 = r5.A00
            r2.onFailed(r1, r0)
        L_0x015e:
            return
        L_0x015f:
            java.lang.String r1 = "AUDIO"
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1Q.A03(android.media.MediaFormat, java.lang.Integer, java.nio.ByteBuffer, int, int, int, int, long):void");
    }
}
