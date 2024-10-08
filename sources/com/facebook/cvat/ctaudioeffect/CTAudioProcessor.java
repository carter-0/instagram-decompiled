package com.facebook.cvat.ctaudioeffect;

import X.0dV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10388RrP;
import X.C10568RuN;
import X.C13886Tj9;
import X.C13950TmB;
import X.C357618Yx;
import X.C66580MXl;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.S7P;
import X.SEV;
import com.facebook.jni.HybridData;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CTAudioProcessor implements C13950TmB {
    public static final int SIGNED_SHORT_LIMIT = ((int) Math.pow(2.0d, 15.0d));
    public static final int UNSIGNED_SHORT_MAX = ((int) Math.pow(2.0d, 16.0d));
    public final List mGlobalAudioEffects;
    public final HybridData mHybridData;
    public boolean mIsWarmingUp;
    public final C10388RrP mLogger;
    public List[] mMediaEffects;
    public int mNumChannels;
    public ByteBuffer mOutputBuffer;
    public int mOutputBufferSize;
    public float mProcessingAmount;
    public double mSampleRate;
    public int mSamplesPerFrame;
    public boolean[] mTrackEnableFlags;
    public final int mWarmupDurationInSec;
    public long mWarmupEndMs;
    public long mWarmupStartMs;

    private native HybridData initHybridData(HashMap hashMap);

    private native void nativeEnableVLOptimisations();

    private native void nativeFlush();

    private native float nativeGetProcessingAmount();

    private native short nativeMixPCMAudioSamples(short s, short s2);

    private native void nativeProcess(ByteBuffer byteBuffer);

    private native void nativeSetBypass(boolean z);

    private native void nativeSetFerrarisModelPath(String str);

    private native void nativeSetProcessingAmount(float f);

    private native void nativeSetWarmupState(boolean z);

    private native void nativeSetupEngine(double d, int i, int i2);

    public ByteBuffer[] applyEffects(ByteBuffer[] byteBufferArr, long j) {
        if (this.mIsWarmingUp) {
            this.mWarmupEndMs = System.currentTimeMillis();
            this.mIsWarmingUp = false;
            nativeSetWarmupState(false);
            nativeFlush();
            C10388RrP rrP = this.mLogger;
            HashMap A1E = AnonymousClass7TE.A1E();
            long j2 = this.mWarmupEndMs - this.mWarmupStartMs;
            A1E.put("sample_rate", Integer.toString((int) this.mSampleRate));
            A1E.put("audio_channels", Integer.toString(this.mNumChannels));
            A1E.put("offline_processing_time", Long.toString(j2));
            A1E.put("warmup_duration", Long.toString(Pxf.A0E(this.mWarmupDurationInSec)));
            HashMap A19 = Pxe.A19(rrP.A01);
            A19.putAll(A1E);
            C13886Tj9 tj9 = rrP.A00;
            if (tj9 != null) {
                tj9.logEvent("cvat_ae_warmup_completed", A19);
            }
        }
        int length = byteBufferArr.length;
        ByteBuffer[] byteBufferArr2 = new ByteBuffer[length];
        for (int i = 0; i < length; i++) {
            if (this.mTrackEnableFlags[i]) {
                ByteBuffer byteBuffer = byteBufferArr[i];
                applyEffectsToTrack(byteBuffer, this.mMediaEffects[i], j);
                applyEffectsToTrack(byteBuffer, this.mGlobalAudioEffects, j);
                byteBufferArr2[i] = byteBuffer;
            }
        }
        return byteBufferArr2;
    }

    public void configure(C10568RuN ruN) {
        int i = ruN.A00;
        this.mTrackEnableFlags = new boolean[i];
        List[] listArr = new List[i];
        this.mMediaEffects = listArr;
        for (int i2 = 0; i2 < i; i2++) {
            listArr[i2] = AnonymousClass7TE.A1C();
        }
        SEV sev = ruN.A02;
        this.mSampleRate = (double) sev.A01;
        int i3 = sev.A00;
        this.mNumChannels = i3;
        this.mSamplesPerFrame = 1024;
        int i4 = i3 * 1024 * 2;
        this.mOutputBufferSize = i4;
        if (this.mOutputBuffer == null) {
            this.mOutputBuffer = Pxg.A13(i4);
        }
        nativeSetupEngine(this.mSampleRate, this.mNumChannels, this.mSamplesPerFrame);
        nativeSetWarmupState(false);
    }

    public void disableTrack(int i) {
        this.mTrackEnableFlags[i] = false;
    }

    public void enableTrack(int i) {
        this.mTrackEnableFlags[i] = true;
    }

    public int getWarmupDurationInSec() {
        return this.mWarmupDurationInSec;
    }

    public boolean isEffectSupported(MediaEffect mediaEffect) {
        return mediaEffect instanceof C357618Yx;
    }

    public ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        ByteBuffer byteBuffer = this.mOutputBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            ByteBuffer[] applyEffects = applyEffects(byteBufferArr, j);
            for (int i = 0; i < this.mOutputBufferSize; i += 2) {
                short s = 0;
                for (int i2 = 0; i2 < applyEffects.length; i2++) {
                    if (this.mTrackEnableFlags[i2]) {
                        s = nativeMixPCMAudioSamples(s, applyEffects[i2].getShort(i));
                    }
                }
                this.mOutputBuffer.putShort(s);
            }
            this.mOutputBuffer.flip();
            return this.mOutputBuffer;
        }
        throw AnonymousClass7TE.A0z("This method should not be called without having called configure()");
    }

    public void warmup(ByteBuffer[] byteBufferArr, long j) {
        if (!this.mIsWarmingUp) {
            this.mIsWarmingUp = true;
            nativeSetWarmupState(true);
            this.mWarmupStartMs = System.currentTimeMillis();
        }
        for (int i = 0; i < byteBufferArr.length; i++) {
            if (this.mTrackEnableFlags[i]) {
                nativeProcess(byteBufferArr[i]);
            }
        }
    }

    public CTAudioProcessor(S7P s7p, C10388RrP rrP) {
        this.mTrackEnableFlags = new boolean[0];
        this.mMediaEffects = new List[0];
        this.mGlobalAudioEffects = AnonymousClass7TE.A1C();
        this.mWarmupStartMs = -1;
        this.mWarmupEndMs = -1;
        this.mIsWarmingUp = false;
        this.mProcessingAmount = -1.0f;
        this.mWarmupDurationInSec = s7p.A00();
        synchronized (CTAudioProcessor.class) {
            0dV.A0C("ctaudioprocessor-native");
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("isNoiseRemoverEnabled", Boolean.valueOf(s7p.A05()));
        A1E.put("isAutoEQEnabled", Boolean.valueOf(s7p.A02()));
        A1E.put("isLevelerEnabled", Boolean.valueOf(s7p.A04()));
        this.mHybridData = initHybridData(A1E);
        this.mLogger = rrP;
    }

    private ByteBuffer applyEffectsToTrack(ByteBuffer byteBuffer, List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaEffect mediaEffect = (MediaEffect) it.next();
            if (mediaEffect instanceof C357618Yx) {
                float f = ((C357618Yx) mediaEffect).A00;
                if (f != this.mProcessingAmount) {
                    this.mProcessingAmount = f;
                    nativeSetProcessingAmount(f);
                    nativeSetBypass(AnonymousClass7TF.A1Q((this.mProcessingAmount > 0.0f ? 1 : (this.mProcessingAmount == 0.0f ? 0 : -1))));
                }
                nativeProcess(byteBuffer);
            }
        }
        return byteBuffer;
    }

    public void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue < 0 || !(mediaEffect instanceof C357618Yx)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Track Index: ");
            A1A.append(num);
            throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(mediaEffect, ", MediaEffect: ", A1A));
        }
        this.mMediaEffects[intValue].add(0, mediaEffect);
    }

    public void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue < 0 || !(mediaEffect instanceof C357618Yx)) {
            throw C66580MXl.A11();
        }
        this.mMediaEffects[intValue].remove(mediaEffect);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.S7P, java.lang.Object] */
    public CTAudioProcessor() {
        this(new Object(), new C10388RrP((C13886Tj9) null, "", (Map) null));
    }

    public void addEffect(MediaEffect mediaEffect) {
        if (mediaEffect instanceof C357618Yx) {
            this.mGlobalAudioEffects.add(mediaEffect);
            return;
        }
        throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(mediaEffect, "MediaEffect: ", AnonymousClass7TE.A1A()));
    }

    public void removeEffect(MediaEffect mediaEffect) {
        if (mediaEffect instanceof C357618Yx) {
            this.mGlobalAudioEffects.remove(mediaEffect);
            return;
        }
        throw C66580MXl.A11();
    }
}
