package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.002;
import X.0JA;
import X.0KC;
import X.0qQ;
import X.AnonymousClass5He;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10212RoT;
import X.C10374RrB;
import X.C10538Rts;
import X.C10772Rxq;
import X.C357848Zx;
import X.C39897ADz;
import X.C7896QcO;
import X.C8859RDa;
import X.JTQ;
import X.OOC;
import X.Pxk;
import X.S37;
import X.SEO;
import X.SJI;
import X.TB5;
import android.content.Context;
import android.media.AudioManager;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import com.facebook.jni.HybridData;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import org.webrtc.MediaStreamTrack;

@Deprecated
public class AudioPlatformComponentHostImpl extends AudioPlatformComponentHost {
    public String mAssetsDirectory;
    public C10374RrB mAudioDecoder;
    public AudioInputPreview mAudioInputPreview;
    public C10212RoT mAudioLogger;
    public final AudioManager mAudioManager;
    public volatile SJI mAudioPlayer;
    public volatile AudioServiceController mAudioServiceController;
    public final int mDefaultSampleRate;
    public C357848Zx mExternalAudioProvider;
    public short[] mInputSamples;
    public boolean mIsCaptureEnabled = true;
    public boolean mIsEffectLoaded = false;
    public boolean mIsMuted = false;
    public boolean mIsRecording = false;
    public boolean mIsServiceCreated = false;
    public MicrophoneSink mMicrophoneSink;
    public final Semaphore mMicrophoneSinkSemaphore;
    public byte[] mOutputBytes;
    public short[] mOutputSamples;
    public AudioRenderCallback mRenderCallback;
    public C8859RDa mStreamType = C8859RDa.MUSIC;

    private native double getDefaultSampleRate();

    private native HybridData initHybrid();

    /* access modifiers changed from: private */
    public native void readAudioFileFinished(String str);

    /* access modifiers changed from: private */
    public native void readAudioFileReady(String str, short[] sArr, int i);

    /* access modifiers changed from: private */
    public native void readAudioFileStarted(String str, double d, boolean z);

    public void startRecording(boolean z) {
        C39897ADz aDz;
        C10212RoT roT;
        this.mIsRecording = true;
        SJI sji = this.mAudioPlayer;
        if (!(sji == null || (aDz = sji.A02) == null)) {
            float A01 = aDz.A01();
            float f = ((float) aDz.A0C) / 1000000.0f;
            long j = aDz.A0B;
            long j2 = aDz.A06;
            HashMap hashMap = new HashMap(6);
            if (j2 > 30 && (roT = sji.A03) != null) {
                hashMap.put("render_audio_avg_processing_time_ms", String.valueOf(A01));
                long j3 = aDz.A01;
                if (j3 > -1) {
                    hashMap.put("render_audio_num_deadline_missed", String.valueOf(j3));
                }
                Pxk.A0Y(aDz, hashMap, f, j);
                roT.A00.ChD((long) sji.hashCode(), "audio_pipeline_recording_started", "AudioPlayer", hashMap);
            }
            aDz.A02();
            aDz.A0A = true;
        }
        updateAudioState();
    }

    public void stopRecording() {
        this.mIsRecording = false;
        updateAudioState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        if (r5.mIsMuted != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006b, code lost:
        if (r0 != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1.isBluetoothA2dpOn() == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAudioPreviewState() {
        /*
            r5 = this;
            com.facebook.cameracore.mediapipeline.services.audio.implementation.MicrophoneSink r0 = r5.mMicrophoneSink
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r2 = 0
            if (r0 == 0) goto L_0x001b
            X.SJI r0 = r5.mAudioPlayer
            if (r0 == 0) goto L_0x0048
            android.media.AudioManager r1 = r0.A08
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r1.isBluetoothA2dpOn()
            if (r0 == 0) goto L_0x0048
        L_0x001b:
            r1 = 1
        L_0x001c:
            boolean r0 = r5.mIsEffectLoaded
            if (r0 == 0) goto L_0x0027
            boolean r0 = r5.mIsRecording
            if (r0 == 0) goto L_0x0026
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            X.SJI r3 = r5.mAudioPlayer
            if (r2 == 0) goto L_0x0032
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r5.mAudioServiceController
            if (r0 == 0) goto L_0x0032
            r4 = 1
            if (r3 != 0) goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r5.mAudioServiceController
            if (r0 == 0) goto L_0x003c
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r5.mAudioServiceController
            r0.setPreviewEnabled(r4)
        L_0x003c:
            if (r3 == 0) goto L_0x0084
            if (r4 == 0) goto L_0x0046
            boolean r0 = r5.mIsMuted
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x004a
        L_0x0046:
            r1 = 0
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x001c
        L_0x004a:
            android.media.AudioTrack r0 = r3.A00     // Catch:{ IllegalStateException -> 0x0050 }
            r0.setStereoVolume(r1, r1)     // Catch:{ IllegalStateException -> 0x0050 }
            goto L_0x0058
        L_0x0050:
            r2 = move-exception
            java.lang.String r1 = "AudioPlayer"
            java.lang.String r0 = "Failed to set volume for AudioPlayer"
            X.0KC.A0G(r1, r0, r2)
        L_0x0058:
            boolean r0 = r3.A05
            if (r0 == r4) goto L_0x0084
            if (r4 == 0) goto L_0x0081
            android.media.AudioManager r1 = r3.A08     // Catch:{ IllegalStateException -> 0x0078 }
            boolean r0 = r1.isWiredHeadsetOn()     // Catch:{ IllegalStateException -> 0x0078 }
            if (r0 != 0) goto L_0x006d
            boolean r0 = r1.isBluetoothA2dpOn()     // Catch:{ IllegalStateException -> 0x0078 }
            r1 = 0
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            r1 = 1
        L_0x006e:
            com.facebook.cameracore.mediapipeline.services.audio.implementation.MicrophoneSink r0 = r5.mMicrophoneSink     // Catch:{ IllegalStateException -> 0x0078 }
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r3.A03(r1, r0)     // Catch:{ IllegalStateException -> 0x0078 }
            return
        L_0x0078:
            r2 = move-exception
            java.lang.Class<com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl> r1 = com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.class
            java.lang.String r0 = "Exception"
            X.0KC.A05(r1, r0, r2)
            return
        L_0x0081:
            r3.A01()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.updateAudioPreviewState():void");
    }

    public AudioServiceController createAudioServiceController() {
        if (this.mAudioServiceController == null) {
            this.mAudioServiceController = new AudioServiceController();
        }
        return this.mAudioServiceController;
    }

    public MicrophoneSink createMicrophoneSink() {
        MicrophoneSink microphoneSink = this.mMicrophoneSink;
        if (microphoneSink != null) {
            return microphoneSink;
        }
        MicrophoneSink microphoneSink2 = new MicrophoneSink();
        this.mMicrophoneSink = microphoneSink2;
        return microphoneSink2;
    }

    public void onEffectLoaded(String str, boolean z) {
        Class<AudioPlatformComponentHostImpl> cls = AudioPlatformComponentHostImpl.class;
        0JA.A04(cls, "%s > onEffectLoaded() > service is not created yet", this.mIsServiceCreated);
        0JA.A04(cls, "%s > onEffectLoaded() > effect is already loaded", !this.mIsEffectLoaded);
        this.mAudioDecoder = new C10374RrB();
        0JA.A04(cls, "%s > isDirectoryPathExistsAndValid() > path is null or empty", !AnonymousClass5He.A00(str));
        if (!AnonymousClass7TE.A0t(str).isDirectory()) {
            0KC.A09(cls, "Could not set asset directory, path does not exist or valid: %s", new Object[]{str});
        } else {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = 002.A0R(str, str2);
            }
            this.mAssetsDirectory = str;
        }
        if (z) {
            this.mAudioInputPreview = new AudioInputPreview(this.mAudioServiceController, (int) getDefaultSampleRate());
            SJI sji = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (sji != null) {
                sji.A02();
                sji.A00.release();
            }
            0JA.A05(this.mAudioInputPreview, "%s > createPreviewPlayer() > mAudioInputPreview is null", new Object[]{cls});
            SJI sji2 = new SJI(this.mAudioManager, this.mStreamType, this.mAudioLogger);
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            int i = this.mDefaultSampleRate;
            audioInputPreview.getClass();
            sji2.A01 = audioInputPreview;
            try {
                sji2.A00.setPlaybackRate(i);
            } catch (IllegalStateException e) {
                0KC.A0G("AudioPlayer", "Failed to set playback rate for AudioPlayer in load()", e);
            }
            this.mAudioPlayer = sji2;
        }
        this.mIsEffectLoaded = true;
        updateAudioState();
    }

    public void onEffectReleased() {
        if (this.mIsEffectLoaded) {
            this.mIsEffectLoaded = false;
            this.mAssetsDirectory = null;
            updateAudioState();
            SJI sji = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (sji != null) {
                sji.A02();
                sji.A00.release();
            }
            C10374RrB rrB = this.mAudioDecoder;
            if (rrB != null) {
                synchronized (rrB) {
                    rrB.A01.shutdown();
                }
                this.mAudioDecoder = null;
            }
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            if (audioInputPreview != null) {
                audioInputPreview.close();
                this.mAudioInputPreview = null;
            }
            this.mMicrophoneSinkSemaphore.acquireUninterruptibly();
            MicrophoneSink microphoneSink = this.mMicrophoneSink;
            if (microphoneSink != null) {
                microphoneSink.mHybridData.resetNative();
                this.mMicrophoneSink = null;
            }
            this.mMicrophoneSinkSemaphore.release();
        }
    }

    public boolean onInputDataAvailable(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int readCaptureSamples;
        C10212RoT roT;
        int i5;
        int i6 = i4;
        if (this.mIsRecording) {
            if (this.mAudioServiceController == null) {
                0KC.A03(AudioPlatformComponentHostImpl.class, "Service is already destroyed but buffers are still being pumped through");
            } else if (i4 < 0) {
                0KC.A09(AudioPlatformComponentHostImpl.class, "Negative buffer size for input data: %d", AnonymousClass7TF.A1b(i6));
                return false;
            } else {
                if (i4 % 2 > 0) {
                    0KC.A09(AudioPlatformComponentHostImpl.class, "Odd buffer size for input data: %d", AnonymousClass7TF.A1b(i6));
                }
                int i7 = i3;
                int i8 = (i4 / 2) / i3;
                ByteBuffer byteBuffer2 = byteBuffer;
                int i9 = i;
                if (this.mMicrophoneSink != null) {
                    int i10 = i8 * i3;
                    if (this.mInputSamples.length < i10) {
                        this.mInputSamples = new short[(i8 * 2)];
                    }
                    byteBuffer2.order(ByteOrder.nativeOrder());
                    byteBuffer2.position(0);
                    byteBuffer2.asShortBuffer().get(this.mInputSamples, 0, i10);
                    if (i7 == 2) {
                        short[] sArr = this.mInputSamples;
                        int i11 = 0;
                        while (true) {
                            i5 = i10 / 2;
                            if (i11 >= i5) {
                                break;
                            }
                            sArr[i11] = sArr[i11 * 2];
                            i11++;
                        }
                        while (i5 < i10) {
                            sArr[i5] = 0;
                            i5++;
                        }
                    }
                    if (this.mMicrophoneSinkSemaphore.tryAcquire()) {
                        MicrophoneSink microphoneSink = this.mMicrophoneSink;
                        if (microphoneSink != null) {
                            microphoneSink.write(this.mInputSamples, i8, i9);
                        }
                        this.mMicrophoneSinkSemaphore.release();
                    }
                }
                0JA.A05(this.mRenderCallback, "%s > renderSamples() > mRenderCallback is null", new Object[]{AudioPlatformComponentHostImpl.class});
                if (this.mOutputSamples.length < i8 * i3) {
                    this.mOutputSamples = new short[(i8 * 2 * i3)];
                }
                if (this.mAudioServiceController == null || (readCaptureSamples = this.mAudioServiceController.readCaptureSamples(this.mOutputSamples, i8, i9)) == 0) {
                    return false;
                }
                int i12 = readCaptureSamples * 2;
                if (this.mOutputBytes.length < i12) {
                    this.mOutputBytes = new byte[(i12 * 2)];
                }
                if (i7 == 2) {
                    short[] sArr2 = this.mOutputSamples;
                    while (true) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        }
                        sArr2[i12] = sArr2[i12 / 2];
                    }
                }
                byteBuffer2.clear();
                byteBuffer2.order(ByteOrder.nativeOrder());
                ShortBuffer asShortBuffer = byteBuffer2.asShortBuffer();
                int min = Math.min(asShortBuffer.capacity(), readCaptureSamples * i3);
                if (min > asShortBuffer.capacity() && (roT = this.mAudioLogger) != null) {
                    roT.A00.ChD((long) hashCode(), "inprogress_recording_audio_failure", "AudioPlatformComponentHostImpl", AnonymousClass7TE.A1E());
                }
                asShortBuffer.put(this.mOutputSamples, 0, min);
                byteBuffer2.flip();
                this.mRenderCallback.onSamplesReady((byte[]) null, i9, i2, i7, min * 2);
                return true;
            }
        }
        return false;
    }

    public void onServiceCreated() {
        Class<AudioPlatformComponentHostImpl> cls = AudioPlatformComponentHostImpl.class;
        0JA.A04(cls, "%s > onServiceCreated() > service is already created", !this.mIsServiceCreated);
        0JA.A05(this.mAudioServiceController, "%s > onServiceCreated() > mAudioServiceController is null", new Object[]{cls});
        this.mIsServiceCreated = true;
    }

    public void onServiceDestroyed() {
        if (this.mIsServiceCreated) {
            0JA.A04(AudioPlatformComponentHostImpl.class, "%s > onServiceDestroyed() > effect is not released yet", !this.mIsEffectLoaded);
            if (this.mAudioServiceController != null) {
                this.mAudioServiceController.mHybridData.resetNative();
            }
            this.mAudioServiceController = null;
            this.mIsServiceCreated = false;
        }
    }

    public void readAudioFile(String str, String str2, String str3) {
        Class<AudioPlatformComponentHostImpl> cls = AudioPlatformComponentHostImpl.class;
        0JA.A05(this.mAudioDecoder, "%s > readAudioFile() > mAudioDecoder is null", new Object[]{cls});
        if ((str2 == null || str2.isEmpty()) && (str2 = findAssetPath(str)) == null) {
            0KC.A09(cls, "Failed to read audio file: %s", new Object[]{str});
            return;
        }
        C10374RrB rrB = this.mAudioDecoder;
        C10538Rts rts = new C10538Rts(this, str3);
        synchronized (rrB) {
            ExecutorService executorService = rrB.A01;
            if (executorService.isShutdown()) {
                0KC.A09(cls, "Fail to decode audio file: %s", new Object[]{002.A0g("Cannot decode file ", str2, ": executor shut down")});
            } else {
                SEO seo = rrB.A00;
                S37 s37 = new S37(rts, str2);
                synchronized (seo) {
                    seo.A01.add(s37);
                }
                executorService.execute(new TB5(rrB));
            }
        }
    }

    @Deprecated
    public void setMuted(boolean z) {
        this.mIsMuted = z;
        updateAudioPreviewState();
    }

    public AudioPlatformComponentHostImpl(Context context, C10772Rxq rxq) {
        HybridData initHybrid = initHybrid();
        this.mHybridData = initHybrid;
        0JA.A05(initHybrid, "%s > mHybridData is null", new Object[]{AudioPlatformComponentHostImpl.class});
        this.mAudioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int defaultSampleRate = (int) getDefaultSampleRate();
        this.mDefaultSampleRate = defaultSampleRate;
        this.mMicrophoneSinkSemaphore = new Semaphore(1, true);
        this.mInputSamples = new short[defaultSampleRate];
        this.mOutputSamples = new short[defaultSampleRate];
        this.mOutputBytes = new byte[(defaultSampleRate * 2)];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r2.mIsCaptureEnabled == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAudioState() {
        /*
            r2 = this;
            r2.updateAudioPreviewState()
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r2.mAudioServiceController
            if (r0 == 0) goto L_0x001a
            boolean r0 = r2.mIsEffectLoaded
            if (r0 == 0) goto L_0x0014
            boolean r0 = r2.mIsRecording
            if (r0 == 0) goto L_0x0014
            boolean r0 = r2.mIsCaptureEnabled
            r1 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r2.mAudioServiceController
            r0.setCaptureEnabled(r1)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.updateAudioState():void");
    }

    public String findAssetPath(String str) {
        String A0R;
        Class<AudioPlatformComponentHostImpl> cls = AudioPlatformComponentHostImpl.class;
        0JA.A04(cls, "%s > findAssetPath() > assetName is null or empty", !AnonymousClass5He.A00(str));
        String str2 = this.mAssetsDirectory;
        0JA.A05(str2, "%s > findAssetPath() > mAssetsDirectory is null", new Object[]{cls});
        String A0R2 = 002.A0R(str2, str);
        try {
            C7896QcO qcO = new C7896QcO(this, AnonymousClass7TE.A0t(str2).getCanonicalPath());
            try {
                OOC ooc = new OOC();
                0qQ.A0B(A0R2, 0);
                ooc.A05(qcO, A0R2);
                ooc.A00();
                return A0R2;
            } catch (SecurityException e) {
                if (e.getMessage() != null) {
                    A0R = e.getMessage();
                } else {
                    A0R = 002.A0R("Asset path does not exist or is invalid: ", A0R2);
                }
                0KC.A09(cls, A0R, new Object[]{e.getCause(), e});
                return null;
            }
        } catch (IOException unused) {
            0KC.A09(cls, "Assets directory path does not exist or is invalid: %s", new Object[]{this.mAssetsDirectory});
            return null;
        }
    }

    public int readExternalAudioStream(String str, short[] sArr, int i) {
        0JA.A04(AudioPlatformComponentHostImpl.class, "%s > readExternalAudioStream() > identifier is null or empty", !AnonymousClass5He.A00(str));
        C357848Zx r0 = this.mExternalAudioProvider;
        if (r0 == null) {
            return 0;
        }
        return r0.E6k(str, sArr, i);
    }

    public boolean onInputDataAvailable(byte[] bArr, int i, int i2, int i3, int i4) {
        int readCaptureSamples;
        int i5 = i4;
        if (this.mIsRecording) {
            if (this.mAudioServiceController == null) {
                0KC.A03(AudioPlatformComponentHostImpl.class, "Service is already destroyed but buffers are still being pumped through");
            } else if (i4 < 0) {
                0KC.A09(AudioPlatformComponentHostImpl.class, "Negative buffer size for input data: %d", AnonymousClass7TF.A1b(i5));
                return false;
            } else {
                if (i4 % 2 > 0) {
                    0KC.A09(AudioPlatformComponentHostImpl.class, "Odd buffer size for input data: %d", AnonymousClass7TF.A1b(i5));
                }
                int i6 = i3;
                int i7 = (i4 / 2) / i3;
                int i8 = i;
                if (this.mMicrophoneSink != null) {
                    short[] sArr = this.mInputSamples;
                    if (sArr.length < i7 * i3) {
                        sArr = new short[(i7 * 2)];
                        this.mInputSamples = sArr;
                    }
                    int i9 = i7 * 2 * i3;
                    boolean z = true;
                    0JA.A06(AnonymousClass7TF.A1Q(i9 % 2));
                    int i10 = i9 / 2;
                    if (sArr.length < i10) {
                        z = false;
                    }
                    0JA.A06(z);
                    ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, 0, i10);
                    if (i6 == 2) {
                        short[] sArr2 = this.mInputSamples;
                        for (int i11 = 0; i11 < i10; i11++) {
                            sArr2[i11] = sArr2[i11 * 2];
                        }
                        while (i10 < i9) {
                            sArr2[i10] = 0;
                            i10++;
                        }
                    }
                    if (this.mMicrophoneSinkSemaphore.tryAcquire()) {
                        MicrophoneSink microphoneSink = this.mMicrophoneSink;
                        if (microphoneSink != null) {
                            microphoneSink.write(this.mInputSamples, i7, i);
                        }
                        this.mMicrophoneSinkSemaphore.release();
                    }
                }
                0JA.A05(this.mRenderCallback, "%s > renderSamples() > mRenderCallback is null", new Object[]{AudioPlatformComponentHostImpl.class});
                if (this.mOutputSamples.length < i7 * i3) {
                    this.mOutputSamples = new short[(i7 * 2 * i3)];
                }
                if (this.mAudioServiceController == null || (readCaptureSamples = this.mAudioServiceController.readCaptureSamples(this.mOutputSamples, i7, i)) == 0) {
                    return false;
                }
                int i12 = readCaptureSamples * 2;
                int i13 = i12 * i3;
                byte[] bArr2 = this.mOutputBytes;
                if (bArr2.length < i13) {
                    bArr2 = new byte[(i13 * 2)];
                    this.mOutputBytes = bArr2;
                }
                if (i6 == 2) {
                    short[] sArr3 = this.mOutputSamples;
                    while (true) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        }
                        sArr3[i12] = sArr3[i12 / 2];
                    }
                }
                short[] sArr4 = this.mOutputSamples;
                int i14 = readCaptureSamples * i3;
                0JA.A06(JTQ.A1P(bArr2.length, i14 * 2));
                ByteBuffer.wrap(bArr2).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr4, 0, i14);
                this.mRenderCallback.onSamplesReady(this.mOutputBytes, i8, i2, i6, i13);
                return true;
            }
        }
        return false;
    }
}
