package com.facebook.cameracore.audiograph;

import X.0KC;
import X.ATH;
import X.ATI;
import X.AnonymousClass05K;
import X.AnonymousClass940;
import X.B0T;
import X.C22018Xss;
import X.C341407mp;
import X.C341417mq;
import X.C341427mr;
import X.C341447mt;
import X.C341457mv;
import X.C341477mx;
import X.C341607nE;
import X.C341617nF;
import X.C341687nM;
import X.C343487qI;
import X.C343497qJ;
import X.C343967r6;
import X.C344037rD;
import X.C364358lI;
import X.C3730593v;
import X.C3730693w;
import X.C3730793x;
import X.C3730893y;
import X.C3730993z;
import X.C382299dT;
import X.C391719tX;
import X.C392429un;
import X.C39897ADz;
import X.C39902AIk;
import X.C40070AQa;
import X.Y1G;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class AudioPipelineImpl implements C3730593v {
    public static final boolean IS_UNIT_TEST = "robolectric".equals(Build.FINGERPRINT);
    public static final C341607nE sEmptyAudioPerfStatsProvider = new C3730793x();
    public static final C3730693w sEmptyStateCallback = new Object();
    public static boolean sIsNativeLibLoaded;
    public final C3730993z mAudioDebugCallback;
    public final C3730893y mAudioMixingCallback;
    public C341477mx mAudioOutputCallback;
    public final Handler mAudioPipelineHandler;
    public volatile Handler mAudioPlayerThread;
    public C22018Xss mAudioRecorder;
    public C40070AQa mAudioRecorderCallback;
    public volatile Handler mAudioRecorderThread;
    public C39897ADz mAudioRenderPerfStats;
    public volatile AudioTrack mAudioTrack;
    public final Object mAudioTrackLock = new Object();
    public final int mBufferSizeInSamples;
    public final AtomicBoolean mDestructed;
    public final int mGraphSampleRate;
    public HybridData mHybridData;
    public boolean mIsManuallyProcessingGraph;
    public final C343967r6 mMobileConfigComponent;
    public int mPlatformNumChannels;
    public final AnonymousClass940 mPlatformOutputErrorCallback;
    public int mPlatformSampleType;
    public volatile C341687nM mStartInputCallback;
    public volatile Handler mStartInputHandler;
    public volatile C341687nM mStopInputCallback;
    public volatile Handler mStopInputHandler;
    public final AtomicBoolean mStopped;
    public final C341417mq mThreadPool;
    public final boolean mXplatControlsStartInput;

    private native int createFbaProcessingGraphInternal(int i, int i2, boolean z);

    private native int createManualProcessingGraphInternal(int i, int i2);

    private native HybridData initHybrid(int i, float f, int i2, boolean z);

    private native int startInputInternal();

    /* access modifiers changed from: private */
    public native int stopInputInternal();

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native String getDebugInfo();

    public native String getFBAProfileInfo(int i);

    public native boolean isSubgraphInserted();

    public native void onReceivedAudioMixingMode(int i);

    public native int pause();

    public synchronized void prepareRecorder(C343487qI r14, C341607nE r15, Handler handler, C341687nM r17, Handler handler2) {
        C391719tX r3;
        C343487qI r6 = r14;
        C341687nM r2 = r17;
        if (r14.A04 != this.mGraphSampleRate) {
            r3 = new C391719tX(22002, "Requested sample rate does not match graph");
        } else {
            int i = r14.A02;
            int i2 = this.mPlatformSampleType;
            if (i != i2) {
                r3 = new C391719tX(22002, "Requested PCM encoding does not match graph callback");
            } else {
                int bitCount = Integer.bitCount(r14.A01);
                int i3 = this.mPlatformNumChannels;
                if (bitCount != i3) {
                    r3 = new C391719tX(22002, "Requested number of channels does not match graph callback");
                } else if (r14.A03 != this.mBufferSizeInSamples * i3 * C39902AIk.A00(i2)) {
                    r3 = new C391719tX(22002, "Requested samples per frame does not match graph");
                } else {
                    if (this.mIsManuallyProcessingGraph) {
                        if (this.mAudioRecorder == null) {
                            C40070AQa aQa = new C40070AQa(this);
                            this.mAudioRecorderCallback = aQa;
                            C341607nE r5 = r15;
                            Handler handler3 = handler;
                            this.mAudioRecorder = new C22018Xss(handler3, r5, r6, aQa, 5, this.mMobileConfigComponent.Ar5(1004), this.mMobileConfigComponent.B4o(21), this.mMobileConfigComponent.CTP(68));
                            if (!this.mMobileConfigComponent.CTP(65)) {
                                this.mMobileConfigComponent.CTO(65);
                            }
                        } else {
                            r14.toString();
                        }
                        if (this.mAudioRecorder.A0F == AnonymousClass05K.A00) {
                            this.mAudioRecorder.A04(r2, handler2);
                        }
                    }
                    r2.onSuccess();
                }
            }
        }
        r2.DCg(r3);
    }

    public native int processAndPullSpeaker(byte[] bArr, int i);

    public native int processAndPullSpeakerWithByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processData(byte[] bArr, int i);

    public native int pullCaptureSinkQueue(ByteBuffer byteBuffer, int i);

    public native int resume();

    public native void updateOutputRouteState(int i);

    public AudioPipelineImpl(int i, int i2, C343967r6 r7, int i3, C3730893y r9, C3730993z r10, AnonymousClass940 r11, B0T b0t, Handler handler, C341417mq r14) {
        this.mBufferSizeInSamples = i;
        this.mThreadPool = r14;
        this.mDestructed = new AtomicBoolean(false);
        this.mStopped = new AtomicBoolean(true);
        this.mGraphSampleRate = i2;
        this.mAudioPipelineHandler = handler;
        this.mAudioMixingCallback = r9;
        this.mAudioDebugCallback = r10;
        this.mMobileConfigComponent = r7;
        this.mPlatformOutputErrorCallback = r11;
        this.mXplatControlsStartInput = r7.CTO(72);
        if (!IS_UNIT_TEST) {
            if (r7.CTP(65)) {
                r7.CTO(65);
            }
            this.mHybridData = initHybrid(i, (float) i2, IgNetworkConsentStorage.MAX_ENTRIES, true);
        }
    }

    private void createAudioTrack(int i) {
        int i2;
        if (this.mAudioTrack != null) {
            this.mAudioTrack.release();
        }
        int i3 = this.mGraphSampleRate;
        int i4 = this.mPlatformNumChannels;
        if (i4 == 1) {
            i2 = 4;
        } else if (i4 == 2) {
            i2 = 12;
        } else {
            throw new RuntimeException("Out channel count not supported");
        }
        this.mAudioTrack = new AudioTrack(3, i3, i2, this.mPlatformSampleType, i, 1);
        if (!this.mMobileConfigComponent.CTP(65)) {
            this.mMobileConfigComponent.CTO(65);
        }
    }

    public static void reportException(int i, String str, C341687nM r5) {
        C382299dT r2 = new C382299dT(str);
        r2.A00("fba_error_code", C392429un.A00(i));
        r5.DCg(r2);
    }

    public int createFbaProcessingGraph(int i, int i2, C341477mx r6) {
        int i3;
        this.mPlatformSampleType = i;
        this.mPlatformNumChannels = i2;
        this.mIsManuallyProcessingGraph = false;
        this.mAudioOutputCallback = r6;
        if (IS_UNIT_TEST) {
            return 0;
        }
        if (i == 2) {
            i3 = 3;
        } else if (i == 4) {
            i3 = 8;
        } else {
            throw new RuntimeException("Unsupported PCM Encoding");
        }
        return createFbaProcessingGraphInternal(i3, i2, this.mMobileConfigComponent.CTP(68));
    }

    public int createManualProcessingGraph(int i, int i2, C341477mx r5) {
        int i3;
        this.mPlatformSampleType = i;
        this.mPlatformNumChannels = i2;
        this.mIsManuallyProcessingGraph = true;
        this.mAudioOutputCallback = r5;
        if (IS_UNIT_TEST) {
            return 0;
        }
        if (i == 2) {
            i3 = 3;
        } else if (i == 4) {
            i3 = 8;
        } else {
            throw new RuntimeException("Unsupported PCM Encoding");
        }
        return createManualProcessingGraphInternal(i3, i2);
    }

    public int fillAudioBuffer(Y1G y1g) {
        Y1G y1g2 = y1g;
        if (this.mIsManuallyProcessingGraph) {
            C22018Xss xss = this.mAudioRecorder;
            if (xss != null) {
                xss.A03(y1g);
            }
        } else {
            int A00 = this.mBufferSizeInSamples * this.mPlatformNumChannels * C39902AIk.A00(this.mPlatformSampleType);
            ByteBuffer byteBuffer = y1g.A02;
            if (byteBuffer.capacity() >= A00) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                int pullCaptureSinkQueue = pullCaptureSinkQueue(byteBuffer, A00);
                if (pullCaptureSinkQueue == 0) {
                    C341477mx r4 = this.mAudioOutputCallback;
                    if (r4 != null) {
                        r4.A00(y1g2, this.mGraphSampleRate, this.mPlatformSampleType, this.mPlatformNumChannels, (long) A00, elapsedRealtimeNanos);
                    }
                    return 0;
                } else if (pullCaptureSinkQueue != 20) {
                    0KC.A0O("AudioPipeline", "Error when pulling capture queue sink = %s", new Object[]{C392429un.A00(pullCaptureSinkQueue)});
                    return 1;
                }
            } else {
                0KC.A0C("AudioPipeline", "Error when filling capture buffer, not enough space in it");
                return 1;
            }
        }
        return 1;
    }

    public void handleAudioCallback(byte[] bArr, long j, long j2) {
        C341477mx r0 = this.mAudioOutputCallback;
        if (r0 != null) {
            r0.A01(bArr, this.mGraphSampleRate, this.mPlatformSampleType, this.mPlatformNumChannels, j, j2);
        }
    }

    public void handleDebugEvent(String str) {
        C341427mr r3 = this.mAudioDebugCallback.A00;
        HashMap A00 = C341457mv.A00(r3.A0A, r3.A0I, (C3730593v) null);
        A00.put("AP_FBADebugInfo", str);
        r3.A0L.ChD((long) r3.hashCode(), "audio_pipeline_method_exceeded_time", "AudioPipelineController", A00);
    }

    public void onSubgraphInserted() {
        String str;
        C341407mp r0 = this.mAudioDebugCallback.A00.A0K;
        if (r0 != null) {
            C344037rD r2 = r0.A00;
            List B1M = r2.Ajt().B1M();
            if (!B1M.isEmpty()) {
                str = (String) B1M.get(0);
            } else {
                str = "";
            }
            r2.BY6().updateAnnotation(str, "subgraph_inserted", String.valueOf(B1M.size()));
        }
    }

    public void release() {
        if (this.mDestructed.compareAndSet(false, true)) {
            C22018Xss xss = this.mAudioRecorder;
            if (xss != null) {
                xss.A06(sEmptyStateCallback, this.mAudioPipelineHandler);
                this.mAudioRecorder = null;
            }
            stopPlatformOutput();
            HybridData hybridData = this.mHybridData;
            if (hybridData != null) {
                hybridData.resetNative();
                this.mHybridData = null;
            }
            this.mAudioRecorderCallback = null;
            this.mAudioOutputCallback = null;
        }
    }

    public boolean setAudioMixing(int i) {
        C3730893y r1 = this.mAudioMixingCallback;
        r1.A00.A0B.postDelayed(new C364358lI(r1, i), 500);
        return true;
    }

    public String snapshot() {
        C22018Xss xss = this.mAudioRecorder;
        if (xss != null) {
            return xss.A09.A00();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r4 != 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r0 != 12) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startInput(X.C341687nM r7, android.os.Handler r8) {
        /*
            r6 = this;
            X.ADz r1 = r6.mAudioRenderPerfStats
            r5 = 0
            if (r1 == 0) goto L_0x001d
            r0 = 5
            java.lang.String r0 = r6.getFBAProfileInfo(r0)
            r1.A08 = r0
            X.ADz r2 = r6.mAudioRenderPerfStats
            r1 = 1
            X.93z r0 = r6.mAudioDebugCallback
            if (r0 == 0) goto L_0x0016
            r0.A01(r2, r1)
        L_0x0016:
            X.ADz r0 = r6.mAudioRenderPerfStats
            r0.A02()
            r0.A0A = r1
        L_0x001d:
            boolean r0 = r6.mXplatControlsStartInput
            if (r0 == 0) goto L_0x0069
            r6.mStartInputCallback = r7
            r6.mStartInputHandler = r8
            X.7r6 r0 = r6.mMobileConfigComponent
            r1 = 65
            boolean r0 = r0.CTP(r1)
            if (r0 != 0) goto L_0x0034
            X.7r6 r0 = r6.mMobileConfigComponent
            r0.CTO(r1)
        L_0x0034:
            X.7r6 r0 = r6.mMobileConfigComponent
            r1 = 66
            boolean r0 = r0.CTP(r1)
            if (r0 == 0) goto L_0x0043
            X.7r6 r0 = r6.mMobileConfigComponent
            r0.CTO(r1)
        L_0x0043:
            boolean r0 = IS_UNIT_TEST
            if (r0 == 0) goto L_0x0064
            r4 = 0
        L_0x0048:
            boolean r3 = r6.mIsManuallyProcessingGraph
            java.lang.String r2 = "startInputInternal failed"
            r1 = 12
            r0 = 0
            if (r3 == 0) goto L_0x005d
            if (r4 == 0) goto L_0x005c
            r6.mStartInputCallback = r0
            r6.mStartInputHandler = r0
        L_0x0057:
            if (r4 == r1) goto L_0x007d
            reportException(r4, r2, r7)
        L_0x005c:
            return
        L_0x005d:
            r6.mStartInputCallback = r0
            r6.mStartInputHandler = r0
            if (r4 == 0) goto L_0x007d
            goto L_0x0057
        L_0x0064:
            int r4 = r6.startInputInternal()
            goto L_0x0048
        L_0x0069:
            boolean r0 = r6.mIsManuallyProcessingGraph
            java.lang.String r4 = "startInputInternal failed"
            r3 = 12
            if (r0 != 0) goto L_0x0081
            boolean r0 = IS_UNIT_TEST
            if (r0 != 0) goto L_0x007d
            int r0 = r6.startInputInternal()
            if (r0 == 0) goto L_0x007d
            if (r0 != r3) goto L_0x00c5
        L_0x007d:
            r7.onSuccess()
            return
        L_0x0081:
            X.Xss r0 = r6.mAudioRecorder
            if (r0 == 0) goto L_0x00c9
            X.AQa r0 = r6.mAudioRecorderCallback
            if (r0 == 0) goto L_0x00c9
            X.7mx r2 = r6.mAudioOutputCallback
            if (r2 == 0) goto L_0x009e
            boolean r0 = IS_UNIT_TEST
            if (r0 == 0) goto L_0x00c0
            r1 = 0
        L_0x0092:
            X.7nF r0 = r2.A00
            if (r0 == 0) goto L_0x009e
            X.7nB r0 = r0.A00
            X.ADz r0 = r0.A0E
            if (r0 == 0) goto L_0x009e
            r0.A09 = r1
        L_0x009e:
            X.AQa r2 = r6.mAudioRecorderCallback
            r0 = 0
            r2.A00 = r0
            java.util.HashMap r0 = r2.A01
            r0.clear()
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mStopped
            r0.set(r5)
            boolean r0 = IS_UNIT_TEST
            if (r0 != 0) goto L_0x00ba
            int r0 = r6.startInputInternal()
            if (r0 == 0) goto L_0x00ba
            if (r0 != r3) goto L_0x00c5
        L_0x00ba:
            X.Xss r0 = r6.mAudioRecorder
            r0.A05(r7, r8)
            return
        L_0x00c0:
            boolean r1 = r6.isSubgraphInserted()
            goto L_0x0092
        L_0x00c5:
            reportException(r0, r4, r7)
            return
        L_0x00c9:
            java.lang.String r1 = "AudioRecorder not created. Cannot start input."
            X.9dT r0 = new X.9dT
            r0.<init>(r1)
            r7.DCg(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.audiograph.AudioPipelineImpl.startInput(X.7nM, android.os.Handler):void");
    }

    public int startPlatformInput() {
        boolean isSubgraphInserted;
        C39897ADz aDz;
        int i;
        if (this.mXplatControlsStartInput) {
            C341687nM r3 = this.mStartInputCallback;
            Handler handler = this.mStartInputHandler;
            this.mStartInputCallback = null;
            this.mStartInputHandler = null;
            if (r3 == null || handler == null) {
                C343497qJ r8 = C343487qI.A06;
                int i2 = this.mGraphSampleRate;
                int i3 = this.mPlatformSampleType;
                int i4 = this.mPlatformNumChannels;
                if (i4 == 1) {
                    i = 16;
                } else if (i4 == 2) {
                    i = 12;
                } else {
                    throw new RuntimeException("Channel count not supported");
                }
                C343487qI r7 = new C343487qI(r8, 64000, i, i3, this.mBufferSizeInSamples * i4 * C39902AIk.A00(i3), i2);
                Handler A00 = C341447mt.A00((Handler.Callback) null, C341447mt.A02, "audio_recorder", -19);
                prepareRecorder(r7, sEmptyAudioPerfStatsProvider, A00, sEmptyStateCallback, this.mAudioPipelineHandler);
                this.mAudioRecorderThread = A00;
            }
            if (this.mAudioRecorder != null && this.mAudioRecorderCallback != null) {
                C341477mx r5 = this.mAudioOutputCallback;
                if (r5 != null) {
                    if (IS_UNIT_TEST) {
                        isSubgraphInserted = false;
                    } else {
                        isSubgraphInserted = isSubgraphInserted();
                    }
                    C341617nF r0 = r5.A00;
                    if (!(r0 == null || (aDz = r0.A00.A0E) == null)) {
                        aDz.A09 = isSubgraphInserted;
                    }
                }
                C40070AQa aQa = this.mAudioRecorderCallback;
                aQa.A00 = 0;
                aQa.A01.clear();
                this.mStopped.set(false);
                C22018Xss xss = this.mAudioRecorder;
                ATH ath = new ATH(this, r3);
                if (handler == null) {
                    handler = this.mAudioPipelineHandler;
                }
                xss.A05(ath, handler);
            } else if (r3 == null) {
                return 34;
            } else {
                r3.DCg(new C382299dT("AudioRecorder not created. Cannot start input."));
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r14.mAudioTrack != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r14.mAudioTrack.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r14.mAudioTrack = null;
        r14.mPlatformOutputErrorCallback.A00(new X.C382299dT("Error with AudioTrack constructor or play()"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        return 34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r14.mAudioTrack = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int startPlatformOutput() {
        /*
            r14 = this;
            int r2 = r14.mBufferSizeInSamples
            int r0 = r14.mPlatformNumChannels
            int r2 = r2 * r0
            int r0 = r14.mPlatformSampleType
            int r0 = X.C39902AIk.A00(r0)
            int r2 = r2 * r0
            X.7r6 r0 = r14.mMobileConfigComponent
            r1 = 67
            boolean r0 = r0.CTP(r1)
            if (r0 == 0) goto L_0x001b
            X.7r6 r0 = r14.mMobileConfigComponent
            r0.CTO(r1)
        L_0x001b:
            X.7r6 r1 = r14.mMobileConfigComponent
            r0 = 68
            boolean r0 = r1.CTP(r0)
            if (r0 == 0) goto L_0x0059
            X.9Zc r4 = new X.9Zc
            r4.<init>(r14, r2)
        L_0x002a:
            java.lang.String r2 = "audio_player_thread"
            r3 = 0
            r1 = -19
            X.7mt r0 = X.C341447mt.A02
            android.os.Handler r0 = X.C341447mt.A00(r3, r0, r2, r1)
            r14.mAudioPlayerThread = r0
            int r7 = r4.A00
            long r10 = (long) r7
            int r8 = r14.mPlatformSampleType
            int r0 = r14.mGraphSampleRate
            long r12 = (long) r0
            int r9 = r14.mPlatformNumChannels
            long r5 = X.C39902AIk.A01(r8, r9, r10, r12)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            int r0 = r14.mBufferSizeInSamples
            long r0 = (long) r0
            X.ADz r2 = new X.ADz
            r2.<init>(r5, r0)
            r14.mAudioRenderPerfStats = r2
            r0 = 1
            r2.A09 = r0
            java.lang.Object r2 = r14.mAudioTrackLock
            monitor-enter(r2)
            goto L_0x005f
        L_0x0059:
            X.9Zb r4 = new X.9Zb
            r4.<init>(r14, r2)
            goto L_0x002a
        L_0x005f:
            r14.createAudioTrack(r7)     // Catch:{ all -> 0x009c }
            android.media.AudioTrack r0 = r14.mAudioTrack     // Catch:{ IllegalStateException -> 0x0068 }
            r0.play()     // Catch:{ IllegalStateException -> 0x0068 }
            goto L_0x0070
        L_0x0068:
            r14.createAudioTrack(r7)     // Catch:{ all -> 0x009c }
            android.media.AudioTrack r0 = r14.mAudioTrack     // Catch:{ IllegalStateException -> 0x007d }
            r0.play()     // Catch:{ IllegalStateException -> 0x007d }
        L_0x0070:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            android.os.Handler r1 = r14.mAudioPlayerThread
            X.Alj r0 = new X.Alj
            r0.<init>(r4, r14)
            r1.post(r0)
            r0 = 0
            return r0
        L_0x007d:
            android.media.AudioTrack r0 = r14.mAudioTrack     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0086
            android.media.AudioTrack r0 = r14.mAudioTrack     // Catch:{ all -> 0x0098 }
            r0.release()     // Catch:{ all -> 0x0098 }
        L_0x0086:
            r14.mAudioTrack = r3     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "Error with AudioTrack constructor or play()"
            X.9dT r1 = new X.9dT     // Catch:{ all -> 0x009c }
            r1.<init>(r0)     // Catch:{ all -> 0x009c }
            X.940 r0 = r14.mPlatformOutputErrorCallback     // Catch:{ all -> 0x009c }
            r0.A00(r1)     // Catch:{ all -> 0x009c }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            r0 = 34
            return r0
        L_0x0098:
            r0 = move-exception
            r14.mAudioTrack = r3     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.audiograph.AudioPipelineImpl.startPlatformOutput():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r4 != 0) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 == 13) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stopInput(X.C341687nM r6, android.os.Handler r7) {
        /*
            r5 = this;
            boolean r0 = r5.mXplatControlsStartInput
            if (r0 == 0) goto L_0x002e
            r5.mStopInputCallback = r6
            r5.mStopInputHandler = r7
            boolean r0 = IS_UNIT_TEST
            if (r0 == 0) goto L_0x0029
            r4 = 0
        L_0x000d:
            boolean r3 = r5.mIsManuallyProcessingGraph
            java.lang.String r2 = "stopInputInternal failed"
            r1 = 13
            r0 = 0
            if (r3 == 0) goto L_0x0022
            if (r4 == 0) goto L_0x0021
            r5.mStopInputCallback = r0
            r5.mStopInputHandler = r0
        L_0x001c:
            if (r4 != r1) goto L_0x0042
        L_0x001e:
            r6.onSuccess()
        L_0x0021:
            return
        L_0x0022:
            r5.mStopInputCallback = r0
            r5.mStopInputHandler = r0
            if (r4 == 0) goto L_0x001e
            goto L_0x001c
        L_0x0029:
            int r4 = r5.stopInputInternal()
            goto L_0x000d
        L_0x002e:
            boolean r0 = r5.mIsManuallyProcessingGraph
            if (r0 != 0) goto L_0x0046
            boolean r0 = IS_UNIT_TEST
            if (r0 != 0) goto L_0x001e
            int r4 = r5.stopInputInternal()
            if (r4 == 0) goto L_0x001e
            r0 = 13
            if (r4 == r0) goto L_0x001e
            java.lang.String r2 = "stopInputInternal failed"
        L_0x0042:
            reportException(r4, r2, r6)
            return
        L_0x0046:
            X.Xss r0 = r5.mAudioRecorder
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "AudioRecorder not created. Cannot stop input."
            X.9dT r0 = new X.9dT
            r0.<init>(r1)
            r6.DCg(r0)
            return
        L_0x0055:
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.mStopped
            r0 = 1
            r1.set(r0)
            X.Xss r1 = r5.mAudioRecorder
            X.ATG r0 = new X.ATG
            r0.<init>(r5, r6)
            r1.A06(r0, r7)
            X.AQa r0 = r5.mAudioRecorderCallback
            if (r0 == 0) goto L_0x0021
            X.93z r3 = r5.mAudioDebugCallback
            java.util.HashMap r2 = r0.A01
            long r0 = r0.A00
            r3.A00(r0, r2)
            X.AQa r2 = r5.mAudioRecorderCallback
            r0 = 0
            r2.A00 = r0
            java.util.HashMap r0 = r2.A01
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.audiograph.AudioPipelineImpl.stopInput(X.7nM, android.os.Handler):void");
    }

    public int stopPlatformInput() {
        if (this.mXplatControlsStartInput) {
            C341687nM r3 = this.mStopInputCallback;
            Handler handler = this.mStopInputHandler;
            this.mStopInputCallback = null;
            this.mStopInputHandler = null;
            if (this.mAudioRecorder != null) {
                this.mStopped.set(true);
                C22018Xss xss = this.mAudioRecorder;
                ATI ati = new ATI(this, r3);
                if (handler == null) {
                    handler = this.mAudioPipelineHandler;
                }
                xss.A06(ati, handler);
                C40070AQa aQa = this.mAudioRecorderCallback;
                if (aQa != null) {
                    this.mAudioDebugCallback.A00(aQa.A00, aQa.A01);
                    C40070AQa aQa2 = this.mAudioRecorderCallback;
                    aQa2.A00 = 0;
                    aQa2.A01.clear();
                    return 0;
                }
            } else if (r3 != null) {
                r3.DCg(new C382299dT("AudioRecorder not created. Cannot stop input."));
            }
        }
        return 0;
    }

    public int stopPlatformOutput() {
        String fBAProfileInfo;
        if (this.mAudioPlayerThread != null) {
            C341447mt.A02(this.mAudioPlayerThread, true, true);
            this.mAudioPlayerThread = null;
        }
        synchronized (this.mAudioTrackLock) {
            if (this.mAudioTrack != null) {
                C39897ADz aDz = this.mAudioRenderPerfStats;
                if (aDz != null) {
                    aDz.A01 = (long) this.mAudioTrack.getUnderrunCount();
                }
                this.mAudioTrack.release();
                this.mAudioTrack = null;
            }
            C39897ADz aDz2 = this.mAudioRenderPerfStats;
            if (aDz2 != null) {
                if (IS_UNIT_TEST) {
                    fBAProfileInfo = "test";
                } else {
                    fBAProfileInfo = getFBAProfileInfo(5);
                }
                aDz2.A08 = fBAProfileInfo;
                C39897ADz aDz3 = this.mAudioRenderPerfStats;
                C3730993z r0 = this.mAudioDebugCallback;
                if (r0 != null) {
                    r0.A01(aDz3, false);
                }
                this.mAudioRenderPerfStats = null;
            }
        }
        return 0;
    }
}
