package X;

/* renamed from: X.WiC  reason: case insensitive filesystem */
public final class C19939WiC implements Runnable {
    public final /* synthetic */ C17680VcB A00;

    public C19939WiC(C17680VcB vcB) {
        this.A00 = vcB;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        if (r0 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r0.hasRemaining() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        r6.A06.onPlaybackPlayCompleted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r5 = "mss:AndroidAudioEnhancementPlaybackImpl"
            r0 = -19
            android.os.Process.setThreadPriority(r0)
            X.VcB r6 = r13.A00     // Catch:{ InterruptedException -> 0x00c9 }
            int r1 = r6.A00     // Catch:{ InterruptedException -> 0x00c9 }
            int r0 = r6.A01     // Catch:{ InterruptedException -> 0x00c9 }
            r7 = 2048000(0x1f4000, float:2.869859E-39)
            int r0 = r0 * 2
            int r0 = r0 * r1
            int r7 = r7 / r0
        L_0x0014:
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            java.lang.String r12 = "fileData"
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r0.hasRemaining()     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00b1
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A09     // Catch:{ InterruptedException -> 0x00c9 }
            boolean r0 = r0.get()     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00b1
            java.nio.ByteBuffer r8 = r6.A08     // Catch:{ InterruptedException -> 0x00c9 }
            r8.clear()     // Catch:{ InterruptedException -> 0x00c9 }
            X.0JR r4 = r6.A05     // Catch:{ InterruptedException -> 0x00c9 }
            long r10 = r4.now()     // Catch:{ InterruptedException -> 0x00c9 }
            r2 = 2048(0x800, float:2.87E-42)
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c1
            int r1 = r0.position()     // Catch:{ InterruptedException -> 0x00c9 }
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.limit()     // Catch:{ InterruptedException -> 0x00c9 }
            if (r1 < r0) goto L_0x0059
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c1
            int r2 = r0.limit()     // Catch:{ InterruptedException -> 0x00c9 }
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.position()     // Catch:{ InterruptedException -> 0x00c9 }
            int r2 = r2 - r0
        L_0x0059:
            r3 = 0
            r9 = 0
        L_0x005b:
            if (r9 >= r2) goto L_0x0083
            java.nio.ByteBuffer r1 = r6.A04     // Catch:{ IndexOutOfBoundsException -> 0x0076 }
            if (r1 != 0) goto L_0x0069
            X.0qQ.A0F(r12)     // Catch:{ IndexOutOfBoundsException -> 0x0076 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IndexOutOfBoundsException -> 0x0076 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0076 }
        L_0x0069:
            int r0 = r1.position()     // Catch:{ IndexOutOfBoundsException -> 0x0076 }
            int r0 = r0 + r9
            byte r0 = r1.get(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0076 }
            r8.put(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0076 }
            goto L_0x0080
        L_0x0076:
            r1 = move-exception
            r0 = 1286(0x506, float:1.802E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ InterruptedException -> 0x00c9 }
            X.0KC.A0G(r5, r0, r1)     // Catch:{ InterruptedException -> 0x00c9 }
        L_0x0080:
            int r9 = r9 + 1
            goto L_0x005b
        L_0x0083:
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c1
            X.C13988Tno.A1S(r0, r2)     // Catch:{ InterruptedException -> 0x00c9 }
            r8.flip()     // Catch:{ InterruptedException -> 0x00c9 }
            com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid r2 = r6.A06     // Catch:{ InterruptedException -> 0x00c9 }
            int r1 = r8.limit()     // Catch:{ InterruptedException -> 0x00c9 }
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r0.hasRemaining()     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 != 0) goto L_0x009e
            r3 = 1
        L_0x009e:
            r2.onPlaybackData(r8, r1, r3)     // Catch:{ InterruptedException -> 0x00c9 }
            long r3 = r4.now()     // Catch:{ InterruptedException -> 0x00c9 }
            long r3 = r3 - r10
            long r1 = (long) r7     // Catch:{ InterruptedException -> 0x00c9 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00c9 }
            goto L_0x0014
        L_0x00b1:
            java.nio.ByteBuffer r0 = r6.A04     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r0.hasRemaining()     // Catch:{ InterruptedException -> 0x00c9 }
            if (r0 != 0) goto L_0x00cf
            com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid r0 = r6.A06     // Catch:{ InterruptedException -> 0x00c9 }
            r0.onPlaybackPlayCompleted()     // Catch:{ InterruptedException -> 0x00c9 }
            return
        L_0x00c1:
            X.0qQ.A0F(r12)     // Catch:{ InterruptedException -> 0x00c9 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ InterruptedException -> 0x00c9 }
            throw r0     // Catch:{ InterruptedException -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
            java.lang.String r0 = "Audio file reading thread interrupted"
            X.0KC.A0G(r5, r0, r1)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19939WiC.run():void");
    }
}
