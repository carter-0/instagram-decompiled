package com.facebook.mediastreaming.opt.audioenhancement;

import X.0KC;
import X.0dV;
import X.0qQ;
import X.AnonymousClass00P;
import X.C16789V5w;
import X.C17174VLd;
import X.C17680VcB;
import X.C17688VcJ;
import X.C19939WiC;
import X.C19940WiD;
import X.C249703kE;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTrack;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class AndroidAudioEnhancementHybrid extends StreamingHybridClassBase {
    public static final C16789V5w Companion = new Object();
    public final C17680VcB playbackImpl;
    public final C17688VcJ recordingImpl;
    public final C17174VLd tempFileManager;

    public native void onPlaybackData(ByteBuffer byteBuffer, int i, boolean z);

    public native void onPlaybackPlayCompleted();

    public native void onRecordingCompleted();

    public final void playbackPlay(ByteBuffer byteBuffer, int i, boolean z) {
        AudioTrack audioTrack;
        0qQ.A0B(byteBuffer, 0);
        C17680VcB vcB = this.playbackImpl;
        AudioTrack audioTrack2 = vcB.A02;
        if (audioTrack2 != null) {
            audioTrack2.write(byteBuffer, i, 0);
        }
        if (z && (audioTrack = vcB.A02) != null) {
            audioTrack.stop();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V5w] */
    static {
        0dV.A0C("mediastreaming");
    }

    public final void playbackReset() {
        ByteBuffer byteBuffer = this.playbackImpl.A04;
        if (byteBuffer == null) {
            0qQ.A0F("fileData");
            throw AnonymousClass00P.createAndThrow();
        } else {
            byteBuffer.position(0);
        }
    }

    public final void playbackSetup(int i, boolean z) {
        C17680VcB vcB = this.playbackImpl;
        vcB.A01 = i;
        int i2 = 1;
        if (z) {
            i2 = 2;
        }
        vcB.A00 = i2;
        try {
            AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
            AudioFormat.Builder encoding = new AudioFormat.Builder().setSampleRate(vcB.A01).setEncoding(2);
            int i3 = 4;
            if (z) {
                i3 = 12;
            }
            vcB.A02 = new AudioTrack(build, encoding.setChannelMask(i3).build(), C249703kE.FLAG_MOVED, 1, 0);
        } catch (IllegalArgumentException e) {
            0KC.A0G("mss:AndroidAudioEnhancementPlaybackImpl", "AudioTrack creation fails", e);
        }
        try {
            File file = vcB.A07.A00;
            if (file != null) {
                byte[] bArr = new byte[((int) file.length())];
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
                vcB.A04 = ByteBuffer.wrap(bArr);
                return;
            }
            throw new IOException();
        } catch (IOException | NullPointerException e2) {
            0KC.A0G("mss:AndroidAudioEnhancementPlaybackImpl", "File does not exist", e2);
        } catch (FileNotFoundException e3) {
            0KC.A0G("mss:AndroidAudioEnhancementPlaybackImpl", "File not found", e3);
        }
    }

    public final void playbackStart() {
        C17680VcB vcB = this.playbackImpl;
        if (vcB.A04 == null) {
            0KC.A0C("mss:AndroidAudioEnhancementPlaybackImpl", "File data buffer is not initialized");
        } else if (vcB.A09.compareAndSet(false, true)) {
            AudioTrack audioTrack = vcB.A02;
            if (audioTrack != null) {
                audioTrack.play();
            }
            Thread thread = new Thread(new C19939WiC(vcB), "prelive_audio_file_reading");
            vcB.A03 = thread;
            thread.start();
        }
    }

    public final void playbackStop() {
        C17680VcB vcB = this.playbackImpl;
        vcB.A09.set(false);
        Thread thread = vcB.A03;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                0KC.A0G("mss:AndroidAudioEnhancementPlaybackImpl", "Ran into an exception while draining audio", e);
            }
        }
        vcB.A03 = null;
        AudioTrack audioTrack = vcB.A02;
        if (audioTrack != null) {
            audioTrack.stop();
        }
    }

    public final void recordingReset() {
        C17174VLd vLd = this.tempFileManager;
        try {
            File file = vLd.A00;
            if (file != null) {
                file.delete();
            }
        } catch (SecurityException e) {
            0KC.A0G("mss:AudioEnhancementTempFileManager", "Security manager does not allow a file to be deleted", e);
        }
        vLd.A00 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[Catch:{ IOException -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC, Splitter:B:23:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void recordingSetup(int r11, boolean r12, double r13) {
        /*
            r10 = this;
            X.VcJ r3 = r10.recordingImpl
            java.lang.String r2 = "mss:AndroidAudioEnhancementRecordingImpl"
            r3.A03 = r11
            r0 = 16
            if (r12 == 0) goto L_0x000c
            r0 = 12
        L_0x000c:
            r3.A02 = r0
            r8 = 2
            int r0 = android.media.AudioRecord.getMinBufferSize(r11, r0, r8)
            int r0 = r0 * 2
            r3.A01 = r0
            r3.A00 = r13
            X.VLd r5 = r3.A09     // Catch:{ IOException -> 0x0056 }
            java.lang.String r4 = "mss:AudioEnhancementTempFileManager"
            java.lang.String r1 = ".ae_pre_live_rec_"
            java.lang.String r0 = ".pcm"
            java.io.File r0 = java.io.File.createTempFile(r1, r0)     // Catch:{ SecurityException -> 0x002c, IOException -> 0x0028 }
            r5.A00 = r0     // Catch:{ SecurityException -> 0x002c, IOException -> 0x0028 }
            goto L_0x0032
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "File could not be created"
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            java.lang.String r0 = "Security manager does not allow a file to be created"
        L_0x002f:
            X.0KC.A0G(r4, r0, r1)     // Catch:{ IOException -> 0x0056 }
        L_0x0032:
            java.io.File r1 = r5.A00     // Catch:{ IOException -> 0x0056 }
            if (r1 == 0) goto L_0x0050
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0056 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0056 }
            r3.A05 = r0     // Catch:{ IOException -> 0x0056 }
            r5 = 1
            int r6 = r3.A03     // Catch:{ IllegalArgumentException -> 0x004c }
            int r7 = r3.A02     // Catch:{ IllegalArgumentException -> 0x004c }
            int r9 = r3.A01     // Catch:{ IllegalArgumentException -> 0x004c }
            android.media.AudioRecord r4 = new android.media.AudioRecord     // Catch:{ IllegalArgumentException -> 0x004c }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ IllegalArgumentException -> 0x004c }
            r3.A04 = r4     // Catch:{ IllegalArgumentException -> 0x004c }
            return
        L_0x004c:
            r1 = move-exception
            java.lang.String r0 = "Audio Record setup illegal argument exception"
            goto L_0x0059
        L_0x0050:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0056 }
            r0.<init>()     // Catch:{ IOException -> 0x0056 }
            throw r0     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "File is not created"
        L_0x0059:
            X.0KC.A0G(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid.recordingSetup(int, boolean, double):void");
    }

    public final void recordingStart() {
        C17688VcJ vcJ = this.recordingImpl;
        if (vcJ.A05 == null) {
            0KC.A0C("mss:AndroidAudioEnhancementRecordingImpl", "Output stream is not initialized");
        } else if (vcJ.A0A.compareAndSet(false, true)) {
            Thread thread = new Thread(new C19940WiD(vcJ), "prelive_audio_recording");
            vcJ.A06 = thread;
            thread.start();
        }
    }

    public final void recordingStop() {
        C17688VcJ vcJ = this.recordingImpl;
        AudioRecord audioRecord = vcJ.A04;
        if (audioRecord != null) {
            audioRecord.release();
        }
        vcJ.A0A.set(false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.VLd, java.lang.Object] */
    public AndroidAudioEnhancementHybrid(HybridData hybridData) {
        super(hybridData);
        ? obj = new Object();
        this.tempFileManager = obj;
        this.playbackImpl = new C17680VcB(this, obj);
        this.recordingImpl = new C17688VcJ(this, obj);
    }
}
