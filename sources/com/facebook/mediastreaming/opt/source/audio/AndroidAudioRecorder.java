package com.facebook.mediastreaming.opt.source.audio;

import X.0J4;
import X.0dV;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0JR;
import X.AnonymousClass7TF;
import X.C16591Uxl;
import X.C17159VKl;
import X.C19941WiE;
import X.C20138Wly;
import X.C249703kE;
import X.Pxf;
import X.V65;
import X.W3b;
import X.X0Z;
import android.media.AudioRecord;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AndroidAudioRecorder implements AndroidAudioInput {
    public static final V65 Companion = new Object();
    public Pair audioRecorderWithSize;
    public final int audioSource = 5;
    public final int audioThreadPriority;
    public final int bufferSize;
    public final boolean enableStereo;
    public final Executor executor;
    public volatile AndroidAudioInputHost host;
    public final AtomicBoolean isRecordingAudioData;
    public final AtomicBoolean isStreamingAudioData;
    public final AnonymousClass0JR monotonicClock;
    public ByteBuffer muteData;
    public final AtomicBoolean muteOn;
    public final boolean retryOnRecorderPrepareFail;
    public final int sampleRate;
    public final int startRecordingRetries;
    public Thread thread;

    public AndroidAudioRecorder(AnonymousClass0JR r3, int i, int i2, boolean z, int i3, int i4, X0Z x0z, boolean z2) {
        this.monotonicClock = r3;
        this.audioThreadPriority = i2;
        this.enableStereo = z;
        this.sampleRate = i3;
        this.retryOnRecorderPrepareFail = z2;
        this.bufferSize = C249703kE.FLAG_MOVED;
        this.isRecordingAudioData = new AtomicBoolean(false);
        this.isStreamingAudioData = new AtomicBoolean(false);
        this.muteOn = new AtomicBoolean(false);
        this.startRecordingRetries = 2;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new 0J4());
        0qQ.A07(newSingleThreadExecutor);
        this.executor = newSingleThreadExecutor;
    }

    public static final /* synthetic */ void access$startAudioRecordingInternal(AndroidAudioRecorder androidAudioRecorder) {
        AudioRecord audioRecord;
        W3b.A03("mss:AndroidAudioRecorder", AnonymousClass000.A00(1837), new Object[0]);
        if (androidAudioRecorder.isRecordingAudioData.compareAndSet(false, true)) {
            androidAudioRecorder.prepare();
            int i = androidAudioRecorder.startRecordingRetries;
            int i2 = 0;
            while (i2 < i) {
                if (androidAudioRecorder.audioRecorderWithSize == null || i2 != 0) {
                    androidAudioRecorder.release();
                    androidAudioRecorder.isRecordingAudioData.set(true);
                    androidAudioRecorder.prepare();
                }
                try {
                    Pair pair = androidAudioRecorder.audioRecorderWithSize;
                    if (pair != null) {
                        AudioRecord audioRecord2 = (AudioRecord) pair.first;
                        if (audioRecord2 != null) {
                            audioRecord2.startRecording();
                        }
                    } else if (!androidAudioRecorder.retryOnRecorderPrepareFail || i2 == androidAudioRecorder.startRecordingRetries - 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AudioRecorder could not be opened, is stereo = ");
                        sb.append(androidAudioRecorder);
                        throw new IllegalStateException(AnonymousClass7TF.A0l(".enableStereo", sb));
                    }
                    Pair pair2 = androidAudioRecorder.audioRecorderWithSize;
                    if (pair2 != null && (audioRecord = (AudioRecord) pair2.first) != null && audioRecord.getRecordingState() == 3) {
                        break;
                    }
                    try {
                        W3b.A02("mss:AndroidAudioRecorder", "AndroidAudioRecorder.startRecording sleep %d ms for retry, attempt %d", (Throwable) null, Arrays.copyOf(new Object[]{100, Integer.valueOf(i2)}, 2));
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                    i2++;
                } catch (IllegalStateException e) {
                    androidAudioRecorder.release();
                    AndroidAudioInputHost androidAudioInputHost = androidAudioRecorder.host;
                    if (androidAudioInputHost != null) {
                        androidAudioInputHost.fireError(C16591Uxl.AudioSourceError, "Audio recording failed", e);
                    }
                }
            }
            Pair pair3 = androidAudioRecorder.audioRecorderWithSize;
            if (pair3 != null) {
                Thread thread2 = new Thread(new C20138Wly(pair3, androidAudioRecorder), "live_audio_recording");
                androidAudioRecorder.thread = thread2;
                thread2.start();
            }
        }
    }

    public static final native double calculateVolume(Object obj, int i);

    /* access modifiers changed from: private */
    public final void prepare() {
        Pair pair;
        String str;
        AtomicInteger atomicInteger = C17159VKl.A01;
        W3b.A03("mss:AndroidAudioRecorder", "prepare refCount %d", Integer.valueOf(atomicInteger.get()));
        if (this.audioRecorderWithSize == null) {
            try {
                boolean z = this.enableStereo;
                int i = this.sampleRate;
                int i2 = this.audioSource;
                int i3 = 16;
                if (z) {
                    i3 = 12;
                }
                AtomicInteger atomicInteger2 = C17159VKl.A02;
                int i4 = atomicInteger2.get();
                int minBufferSize = AudioRecord.getMinBufferSize(i, i3, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 4096;
                }
                int[] iArr = {i4, i4 / 10, minBufferSize * 2, minBufferSize};
                int i5 = 0;
                while (true) {
                    int max = Math.max(iArr[i5], minBufferSize);
                    try {
                        str = C17159VKl.A00;
                        W3b.A05(str, "New AudioRecord: buffer size: %d, channel type: %d, sample rate: %d, audio source: %d", Integer.valueOf(max), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2));
                        AudioRecord audioRecord = new AudioRecord(i2, i, i3, 2, max);
                        if (audioRecord.getState() == 1) {
                            atomicInteger2.set(max);
                            atomicInteger.addAndGet(1);
                            W3b.A05(str, "Successfully opened mic for LiveStreaming", new Object[0]);
                            pair = Pxf.A0K(audioRecord, max);
                            break;
                        }
                        W3b.A04(str, "Unexpected new audio recorder state: %d", Integer.valueOf(audioRecord.getState()));
                        audioRecord.release();
                        if (max == minBufferSize || (i5 = i5 + 1) >= 4) {
                            W3b.A04(str, "Failed to opened Mic for LiveStreaming", new Object[0]);
                            pair = null;
                        }
                    } catch (IllegalArgumentException e) {
                        str = C17159VKl.A00;
                        W3b.A04(str, "Failed attempt to create audio record", e);
                    }
                }
                W3b.A04(str, "Failed to opened Mic for LiveStreaming", new Object[0]);
                pair = null;
                this.audioRecorderWithSize = pair;
            } catch (IllegalArgumentException e2) {
                W3b.A01("mss:AndroidAudioRecorder", "MicrophoneSetup.openMic failed refCount %d", e2, AnonymousClass7TF.A1b(atomicInteger.get()));
            }
        }
    }

    public void startAudioStreaming() {
        W3b.A03("mss:AndroidAudioRecorder", "startAudioStreaming", new Object[0]);
        this.isStreamingAudioData.set(true);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V65, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming");
    }

    public static final /* synthetic */ void access$restartRecorder(AndroidAudioRecorder androidAudioRecorder) {
        if (androidAudioRecorder.isRecordingAudioData.get()) {
            androidAudioRecorder.release();
            androidAudioRecorder.prepare();
            W3b.A03("mss:AndroidAudioRecorder", AnonymousClass000.A00(1837), new Object[0]);
            androidAudioRecorder.executor.execute(new C19941WiE(androidAudioRecorder));
        }
    }

    /* access modifiers changed from: private */
    public final void release() {
        AtomicInteger atomicInteger = C17159VKl.A01;
        W3b.A03("mss:AndroidAudioRecorder", "release refCount %d", Integer.valueOf(atomicInteger.get()));
        this.isRecordingAudioData.set(false);
        try {
            Thread thread2 = this.thread;
            if (thread2 != null) {
                thread2.join();
            }
        } catch (InterruptedException e) {
            W3b.A01("mss:AndroidAudioRecorder", "Ran into an exception while draining audio", e, new Object[0]);
        }
        this.thread = null;
        Pair pair = this.audioRecorderWithSize;
        if (pair != null) {
            AudioRecord audioRecord = (AudioRecord) pair.first;
            if (audioRecord != null) {
                audioRecord.release();
                atomicInteger.addAndGet(-1);
            }
            this.audioRecorderWithSize = null;
        }
        W3b.A03("mss:AndroidAudioRecorder", "release done refCount %d", AnonymousClass7TF.A1b(atomicInteger.get()));
    }

    public boolean isMuted() {
        return this.muteOn.get();
    }

    public void setHost(AndroidAudioInputHost androidAudioInputHost) {
        this.host = androidAudioInputHost;
    }

    public void setMute(boolean z) {
        this.muteOn.set(z);
    }

    public void stopAudioStreaming() {
        this.isStreamingAudioData.set(false);
    }
}
