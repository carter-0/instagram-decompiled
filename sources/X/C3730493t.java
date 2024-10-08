package X;

import android.os.Handler;

/* renamed from: X.93t  reason: invalid class name and case insensitive filesystem */
public final class C3730493t implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341427mr A01;
    public final /* synthetic */ C341687nM A02;

    public C3730493t(Handler handler, C341427mr r2, C341687nM r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r7 == 4) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.7mr r5 = r0.A01
            X.7nM r1 = r0.A02
            android.os.Handler r0 = r0.A00
            X.7mv r3 = r5.A0I
            java.lang.String r2 = "rAS"
            X.7mw r6 = r3.A05
            r6.A01(r2)
            int r7 = X.C341427mr.A00(r5)
            if (r7 == 0) goto L_0x001a
            r2 = 4
            if (r7 != r2) goto L_0x00c3
        L_0x001a:
            X.93v r2 = r5.A03
            if (r2 == 0) goto L_0x00c3
            X.8xr r2 = r5.A04
            if (r2 == 0) goto L_0x00c3
            boolean r2 = r5.A07
            if (r2 != 0) goto L_0x00cd
            X.7rD r7 = r5.A0L
            int r2 = r5.hashCode()
            long r8 = (long) r2
            r12 = 0
            java.lang.String r10 = "audio_pipeline_resuming"
            java.lang.String r11 = "AudioPipelineController"
            r7.ChD(r8, r10, r11, r12)
            X.93v r2 = r5.A03
            int r7 = r2.resume()
            if (r7 == 0) goto L_0x0041
            r3 = 4
            r2 = 0
            if (r7 != r3) goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            r5.A07 = r2
            X.8xr r8 = r5.A04
            monitor-enter(r8)
            boolean r2 = r8.A05     // Catch:{ all -> 0x00c0 }
            if (r2 != 0) goto L_0x00cc
            android.content.Context r9 = r8.A01     // Catch:{ Exception -> 0x00b2 }
            android.content.BroadcastReceiver r4 = r8.A00     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r3 = "android.intent.action.HEADSET_PLUG"
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ Exception -> 0x00b2 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b2 }
            X.0DH.A00(r4, r9, r2)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r3 = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ Exception -> 0x00b2 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b2 }
            X.0DH.A00(r4, r9, r2)     // Catch:{ Exception -> 0x00b2 }
            android.media.AudioManager r12 = r8.A02     // Catch:{ Exception -> 0x00b2 }
            r11 = 2
            android.media.AudioDeviceInfo[] r13 = r12.getDevices(r11)     // Catch:{ Exception -> 0x00b2 }
            int r10 = r13.length     // Catch:{ Exception -> 0x00b2 }
            r14 = 0
            r9 = 0
        L_0x006d:
            if (r9 >= r10) goto L_0x0083
            r4 = r13[r9]     // Catch:{ Exception -> 0x00b2 }
            int r3 = r4.getType()     // Catch:{ Exception -> 0x00b2 }
            r2 = 4
            if (r3 == r2) goto L_0x0082
            int r3 = r4.getType()     // Catch:{ Exception -> 0x00b2 }
            r2 = 3
            if (r3 == r2) goto L_0x0082
            int r9 = r9 + 1
            goto L_0x006d
        L_0x0082:
            r14 = 1
        L_0x0083:
            r10 = 1
            if (r14 != 0) goto L_0x00a4
            android.media.AudioDeviceInfo[] r12 = r12.getDevices(r11)     // Catch:{ Exception -> 0x00b2 }
            int r11 = r12.length     // Catch:{ Exception -> 0x00b2 }
            r9 = 0
        L_0x008c:
            if (r9 >= r11) goto L_0x00a2
            r4 = r12[r9]     // Catch:{ Exception -> 0x00b2 }
            int r3 = r4.getType()     // Catch:{ Exception -> 0x00b2 }
            r2 = 8
            if (r3 == r2) goto L_0x00a4
            int r3 = r4.getType()     // Catch:{ Exception -> 0x00b2 }
            r2 = 7
            if (r3 == r2) goto L_0x00a4
            int r9 = r9 + 1
            goto L_0x008c
        L_0x00a2:
            r4 = 0
            goto L_0x00a5
        L_0x00a4:
            r4 = 1
        L_0x00a5:
            android.os.Handler r3 = r8.A03     // Catch:{ Exception -> 0x00b2 }
            X.8xu r2 = new X.8xu     // Catch:{ Exception -> 0x00b2 }
            r2.<init>(r8, r4)     // Catch:{ Exception -> 0x00b2 }
            r3.post(r2)     // Catch:{ Exception -> 0x00b2 }
            r8.A05 = r10     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00cc
        L_0x00b2:
            r4 = move-exception
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "DeadSystemException"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x00c0 }
            if (r2 != 0) goto L_0x00cc
            throw r4     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00c3:
            X.7rD r8 = r5.A0L
            int r4 = r5.hashCode()
            java.lang.String r3 = "Audio pipeline should not be null, nor headset detector or failed to init"
            goto L_0x00da
        L_0x00cc:
            monitor-exit(r8)
        L_0x00cd:
            java.lang.String r2 = "rAE"
            r6.A01(r2)
            X.7rD r8 = r5.A0L
            int r4 = r5.hashCode()
            java.lang.String r3 = "Failed to resume audio pipeline."
        L_0x00da:
            java.lang.String r11 = "AudioPipelineController"
            if (r7 == 0) goto L_0x0111
            r2 = 4
            if (r7 == r2) goto L_0x0111
            X.9dT r9 = new X.9dT
            r9.<init>(r3)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = "fba_error_code"
            r9.A00(r3, r2)
            long r15 = (long) r4
            java.util.Map r2 = r9.A00
            if (r2 == 0) goto L_0x010f
            java.lang.Object r14 = r2.get(r3)
            java.lang.String r14 = (java.lang.String) r14
        L_0x00fa:
            java.lang.String r10 = "audio_pipeline_resume_failed"
            java.lang.String r12 = "low"
            r13 = r11
            r8.ChC(r9, r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x010e
            if (r0 == 0) goto L_0x010e
            X.Alf r2 = new X.Alf
            r2.<init>(r9, r1)
        L_0x010b:
            r0.post(r2)
        L_0x010e:
            return
        L_0x010f:
            r14 = 0
            goto L_0x00fa
        L_0x0111:
            if (r1 == 0) goto L_0x010e
            if (r0 == 0) goto L_0x010e
            X.Ai8 r2 = new X.Ai8
            r2.<init>(r1)
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3730493t.run():void");
    }
}
