package X;

import com.facebook.cameracore.audiograph.AudioPipelineImpl;

/* renamed from: X.Alj  reason: case insensitive filesystem */
public final class C40937Alj implements Runnable {
    public final /* synthetic */ A35 A00;
    public final /* synthetic */ AudioPipelineImpl A01;

    public C40937Alj(A35 a35, AudioPipelineImpl audioPipelineImpl) {
        this.A01 = audioPipelineImpl;
        this.A00 = a35;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [X.9tX, X.9dT] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r2 == 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.facebook.cameracore.audiograph.AudioPipelineImpl r5 = r10.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.mDestructed
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0017
            X.940 r2 = r5.mPlatformOutputErrorCallback
            java.lang.String r1 = "Executing player on dead JNI"
            X.9dT r0 = new X.9dT
            r0.<init>(r1)
            r2.A00(r0)
        L_0x0016:
            return
        L_0x0017:
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r3 = 0
            X.A35 r6 = r10.A00     // Catch:{ RuntimeException -> 0x0083 }
            boolean r0 = r6 instanceof X.C380679Zc     // Catch:{ RuntimeException -> 0x0083 }
            if (r0 == 0) goto L_0x0047
            X.9Zc r6 = (X.C380679Zc) r6     // Catch:{ RuntimeException -> 0x0083 }
            java.nio.ByteBuffer r4 = r6.A00     // Catch:{ RuntimeException -> 0x0083 }
            r4.clear()     // Catch:{ RuntimeException -> 0x0083 }
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x002f
            r2 = 0
            goto L_0x0039
        L_0x002f:
            com.facebook.cameracore.audiograph.AudioPipelineImpl r1 = r6.A01     // Catch:{ all -> 0x0042 }
            int r0 = r6.A00     // Catch:{ all -> 0x0042 }
            int r2 = r1.processAndPullSpeakerWithByteBuffer(r4, r0)     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x003e
        L_0x0039:
            int r0 = r6.A00     // Catch:{ all -> 0x0042 }
            r4.position(r0)     // Catch:{ all -> 0x0042 }
        L_0x003e:
            r4.flip()     // Catch:{ RuntimeException -> 0x0083 }
            goto L_0x0057
        L_0x0042:
            r0 = move-exception
            r4.flip()     // Catch:{ RuntimeException -> 0x0083 }
            throw r0     // Catch:{ RuntimeException -> 0x0083 }
        L_0x0047:
            X.9Zb r6 = (X.C380669Zb) r6     // Catch:{ RuntimeException -> 0x0083 }
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST     // Catch:{ RuntimeException -> 0x0083 }
            if (r0 != 0) goto L_0x0095
            com.facebook.cameracore.audiograph.AudioPipelineImpl r2 = r6.A01     // Catch:{ RuntimeException -> 0x0083 }
            byte[] r1 = r6.A00     // Catch:{ RuntimeException -> 0x0083 }
            int r0 = r6.A00     // Catch:{ RuntimeException -> 0x0083 }
            int r2 = r2.processAndPullSpeaker(r1, r0)     // Catch:{ RuntimeException -> 0x0083 }
        L_0x0057:
            if (r2 == 0) goto L_0x0095
            r0 = 14
            if (r2 == r0) goto L_0x0016
            r0 = 20
            java.lang.String r1 = "AudioPipeline"
            if (r2 != r0) goto L_0x0069
            java.lang.String r0 = "Empty data in Speaker Node"
        L_0x0065:
            X.0KC.A0D(r1, r0)
            goto L_0x00d9
        L_0x0069:
            r0 = 4
            if (r2 != r0) goto L_0x006f
            java.lang.String r0 = "Stop Output in progress, dropping audio"
            goto L_0x0065
        L_0x006f:
            X.940 r6 = r5.mPlatformOutputErrorCallback
            java.lang.String r4 = X.C392429un.A00(r2)
            java.lang.String r2 = "FBA error while requesting speaker data"
            java.lang.String r0 = "fba_error_code"
            X.9dT r1 = new X.9dT
            r1.<init>(r2)
            r1.A00(r0, r4)
            goto L_0x0107
        L_0x0083:
            r6 = move-exception
            X.940 r4 = r5.mPlatformOutputErrorCallback
            java.lang.String r2 = r6.getMessage()
            r1 = 40000(0x9c40, float:5.6052E-41)
            X.9dT r0 = new X.9dT
            r0.<init>(r2, r6, r1)
            r4.A00(r0)
        L_0x0095:
            android.media.AudioTrack r0 = r5.mAudioTrack
            if (r0 == 0) goto L_0x00fe
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            long r6 = r6 - r8
            X.ADz r2 = r5.mAudioRenderPerfStats
            long r0 = r2.A07
            long r0 = r0 + r6
            r2.A07 = r0
            X.C39897ADz.A00(r2)
            X.A35 r4 = r10.A00
            boolean r0 = r4 instanceof X.C380679Zc
            if (r0 == 0) goto L_0x00ea
            X.9Zc r4 = (X.C380679Zc) r4
            com.facebook.cameracore.audiograph.AudioPipelineImpl r1 = r4.A01
            android.media.AudioTrack r0 = r1.mAudioTrack
            r0.getClass()
            android.media.AudioTrack r2 = r1.mAudioTrack
            java.nio.ByteBuffer r1 = r4.A00
            int r0 = r4.A00
            int r0 = r2.write(r1, r0, r3)
        L_0x00c1:
            if (r0 >= 0) goto L_0x00d8
            X.940 r4 = r5.mPlatformOutputErrorCallback
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Audio Track write failed"
            java.lang.String r1 = "audio_track_error_code"
            X.9dT r0 = new X.9dT
            r0.<init>(r2)
            r0.A00(r1, r3)
            r4.A00(r0)
        L_0x00d8:
            r3 = 1
        L_0x00d9:
            android.os.Handler r0 = r5.mAudioPlayerThread
            if (r0 == 0) goto L_0x0016
            android.os.Handler r2 = r5.mAudioPlayerThread
            if (r3 == 0) goto L_0x00e7
            r0 = 0
        L_0x00e3:
            r2.postDelayed(r10, r0)
            return
        L_0x00e7:
            r0 = 10
            goto L_0x00e3
        L_0x00ea:
            X.9Zb r4 = (X.C380669Zb) r4
            com.facebook.cameracore.audiograph.AudioPipelineImpl r1 = r4.A01
            android.media.AudioTrack r0 = r1.mAudioTrack
            r0.getClass()
            android.media.AudioTrack r2 = r1.mAudioTrack
            byte[] r1 = r4.A00
            int r0 = r4.A00
            int r0 = r2.write(r1, r3, r0)
            goto L_0x00c1
        L_0x00fe:
            X.940 r6 = r5.mPlatformOutputErrorCallback
            java.lang.String r0 = "Audio Track is null"
            X.9dT r1 = new X.9dT
            r1.<init>(r0)
        L_0x0107:
            r6.A00(r1)
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40937Alj.run():void");
    }
}
