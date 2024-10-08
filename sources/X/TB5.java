package X;

public final class TB5 implements Runnable {
    public final /* synthetic */ C10374RrB A00;

    public TB5(C10374RrB rrB) {
        this.A00 = rrB;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a0 A[Catch:{ IOException | IllegalStateException -> 0x01b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = -19
            android.os.Process.setThreadPriority(r0)
            r0 = r19
            X.RrB r0 = r0.A00
            X.SEO r2 = r0.A00
        L_0x000b:
            java.util.LinkedList r7 = r2.A00
            int r1 = r7.size()
            int r0 = X.SEO.A02
            if (r1 >= r0) goto L_0x00cb
            monitor-enter(r2)
            java.util.LinkedList r0 = r2.A01     // Catch:{ all -> 0x01db }
            java.lang.Object r5 = r0.poll()     // Catch:{ all -> 0x01db }
            X.S37 r5 = (X.S37) r5     // Catch:{ all -> 0x01db }
            monitor-exit(r2)
            if (r5 == 0) goto L_0x00cb
            android.media.MediaExtractor r4 = r5.A04     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r6 = r5.A06     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r4.setDataSource(r6)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r12 = 0
            r8 = 0
        L_0x002a:
            int r0 = r4.getTrackCount()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            if (r8 >= r0) goto L_0x00a2
            android.media.MediaFormat r10 = r4.getTrackFormat(r8)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r3 = "mime"
            java.lang.String r1 = r10.getString(r3)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r0 = "audio/alac"
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "audio/"
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            if (r0 == 0) goto L_0x0096
            r4.selectTrack(r8)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r0 = 0
            r4.seekTo(r0, r12)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r5.A02 = r12     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r5.A00 = r12     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r1 = r10.getString(r3)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r0 = -702912177(0xffffffffd61a694f, float:-4.2444272E13)
            android.media.MediaCodec r8 = X.0fX.A01(r1, r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r5.A01 = r8     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r9 = 0
            r13 = -163199770(0xfffffffff645c4e6, float:-1.00280865E33)
            r11 = r9
            X.0fX.A07(r8, r9, r10, r11, r12, r13)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            android.media.MediaCodec r1 = r5.A01     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r0 = -1335092709(0xffffffffb06c1a1b, float:-8.58934E-10)
            X.0fX.A05(r1, r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r0 = "sample-rate"
            int r3 = r10.getInteger(r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r0 = "channel-count"
            int r8 = r10.getInteger(r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            X.Rts r1 = r5.A05     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl r6 = r1.A01     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            boolean r0 = r6.mIsEffectLoaded     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = r1.A02     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            double r3 = (double) r3     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            r0 = 1
            if (r8 > r0) goto L_0x009a
            goto L_0x0099
        L_0x0096:
            int r8 = r8 + 1
            goto L_0x002a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r6.readAudioFileStarted(r1, r3, r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
        L_0x009d:
            r7.add(r5)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            goto L_0x000b
        L_0x00a2:
            r4.release()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            java.lang.String r0 = "No audio track found in file "
            java.io.IOException r0 = X.Pxg.A0Z(r0, r6)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
            throw r0     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()
            java.lang.String r3 = "Error decoding file "
            java.lang.String r1 = r5.A06
            java.lang.String r0 = ": "
            java.lang.String r0 = X.002.A0u(r3, r1, r0, r4)
            java.lang.Class<com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl> r3 = com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.class
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Fail to decode audio file: %s"
            X.0KC.A09(r3, r0, r1)
            r5.A00()
            goto L_0x000b
        L_0x00cb:
            boolean r0 = X.DbT.A1b(r7)
            if (r0 == 0) goto L_0x01e6
            java.util.Iterator r11 = r7.iterator()
        L_0x00d5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r3 = r11.next()
            X.S37 r3 = (X.S37) r3
            android.media.MediaCodec r5 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            if (r5 == 0) goto L_0x01a6
            boolean r4 = r3.A02     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r0 = 50000(0xc350, double:2.47033E-319)
            if (r4 != 0) goto L_0x0131
            int r13 = r5.dequeueInputBuffer(r0)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            if (r13 < 0) goto L_0x0131
            android.media.MediaCodec r4 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            java.nio.ByteBuffer r5 = r4.getInputBuffer(r13)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            android.media.MediaExtractor r6 = r3.A04     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            android.media.MediaCodec r4 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            if (r4 == 0) goto L_0x011c
            r5.clear()     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r14 = 0
            int r15 = r6.readSampleData(r5, r14)     // Catch:{ Exception -> 0x01ad, IOException | IllegalStateException -> 0x01b9 }
            r5 = 1
            if (r15 >= 0) goto L_0x010a
            goto L_0x0124
        L_0x010a:
            android.media.MediaCodec r12 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            long r16 = r6.getSampleTime()     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r18 = r14
            r12.queueInputBuffer(r13, r14, r15, r16, r18)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            boolean r4 = r6.advance()     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r5 = r4 ^ 1
            goto L_0x012f
        L_0x011c:
            java.lang.String r0 = "Codec is null"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            goto L_0x01b8
        L_0x0124:
            android.media.MediaCodec r4 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r16 = 0
            r18 = 4
            r12 = r4
            r15 = r14
            r12.queueInputBuffer(r13, r14, r15, r16, r18)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
        L_0x012f:
            r3.A02 = r5     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
        L_0x0131:
            android.media.MediaCodec r5 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            android.media.MediaCodec$BufferInfo r4 = r3.A03     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            int r6 = r5.dequeueOutputBuffer(r4, r0)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r7 = 0
            if (r6 < 0) goto L_0x0178
            android.media.MediaCodec r0 = r3.A01     // Catch:{ all -> 0x0171 }
            java.nio.ByteBuffer r10 = r0.getOutputBuffer(r6)     // Catch:{ all -> 0x0171 }
            X.Rts r9 = r3.A05     // Catch:{ all -> 0x0171 }
            int r1 = r4.size     // Catch:{ all -> 0x0171 }
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl r8 = r9.A01     // Catch:{ all -> 0x0171 }
            boolean r0 = r8.mIsEffectLoaded     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x016d
            int r5 = r1 / 2
            if (r5 == 0) goto L_0x016d
            short[] r0 = r9.A00     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x0157
            int r0 = r0.length     // Catch:{ all -> 0x0171 }
            if (r0 >= r5) goto L_0x015d
        L_0x0157:
            int r0 = r5 * 2
            short[] r0 = new short[r0]     // Catch:{ all -> 0x0171 }
            r9.A00 = r0     // Catch:{ all -> 0x0171 }
        L_0x015d:
            java.nio.ShortBuffer r1 = r10.asShortBuffer()     // Catch:{ all -> 0x0171 }
            short[] r0 = r9.A00     // Catch:{ all -> 0x0171 }
            r1.get(r0, r7, r5)     // Catch:{ all -> 0x0171 }
            java.lang.String r1 = r9.A02     // Catch:{ all -> 0x0171 }
            short[] r0 = r9.A00     // Catch:{ all -> 0x0171 }
            r8.readAudioFileReady(r1, r0, r5)     // Catch:{ all -> 0x0171 }
        L_0x016d:
            r10.clear()     // Catch:{ all -> 0x0171 }
            goto L_0x0189
        L_0x0171:
            r1 = move-exception
            android.media.MediaCodec r0 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r0.releaseOutputBuffer(r6, r7)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            goto L_0x01b8
        L_0x0178:
            r0 = -1
            if (r6 != r0) goto L_0x018e
            boolean r0 = r3.A02     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            if (r0 == 0) goto L_0x018e
            int r0 = r3.A00     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            int r1 = r0 + 1
            r3.A00 = r1     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r0 = 3
            if (r1 < r0) goto L_0x018e
            goto L_0x0198
        L_0x0189:
            android.media.MediaCodec r0 = r3.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r0.releaseOutputBuffer(r6, r7)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
        L_0x018e:
            boolean r0 = r3.A02     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            if (r0 == 0) goto L_0x00d5
            int r0 = r4.flags     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00d5
        L_0x0198:
            X.Rts r4 = r3.A05     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl r1 = r4.A01     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            boolean r0 = r1.mIsEffectLoaded     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            if (r0 == 0) goto L_0x01d3
            java.lang.String r0 = r4.A02     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            r1.readAudioFileFinished(r0)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            goto L_0x01d3
        L_0x01a6:
            java.lang.String r0 = "Codec is null"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            goto L_0x01b8
        L_0x01ad:
            r1 = move-exception
            java.lang.String r0 = "Extraction failed: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r1)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
        L_0x01b8:
            throw r1     // Catch:{ IOException | IllegalStateException -> 0x01b9 }
        L_0x01b9:
            r0 = move-exception
            java.lang.String r5 = r0.getMessage()     // Catch:{ all -> 0x01de }
            java.lang.String r4 = "Error decoding file "
            java.lang.String r1 = r3.A06     // Catch:{ all -> 0x01de }
            java.lang.String r0 = ": "
            java.lang.String r0 = X.002.A0u(r4, r1, r0, r5)     // Catch:{ all -> 0x01de }
            java.lang.Class<com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl> r4 = com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.class
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x01de }
            java.lang.String r0 = "Fail to decode audio file: %s"
            X.0KC.A09(r4, r0, r1)     // Catch:{ all -> 0x01de }
        L_0x01d3:
            r3.A00()
            r11.remove()
            goto L_0x00d5
        L_0x01db:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01de:
            r0 = move-exception
            r3.A00()
            r11.remove()
            throw r0
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TB5.run():void");
    }
}
