package com.facebook.cvat.ctaudioeffectml;

import X.0dV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10568RuN;
import X.C13950TmB;
import X.C357618Yx;
import X.C66580MXl;
import X.Pxg;
import X.SEV;
import com.facebook.jni.HybridData;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class CTAudioProcessorML implements C13950TmB {
    public final List mGlobalAudioEffects = AnonymousClass7TE.A1C();
    public final HybridData mHybridData;
    public List[] mMediaEffects = new List[0];
    public int mNumChannels;
    public ByteBuffer mOutputBuffer;
    public int mOutputBufferSize;
    public float mProcessingAmount = -1.0f;
    public double mSampleRate;
    public int mSamplesPerFrame;
    public boolean[] mTrackEnableFlags = new boolean[0];

    private native HybridData initHybridData();

    private native void nativeFlush();

    private native float nativeGetProcessingAmount();

    private native short nativeMixPCMAudioSamples(short s, short s2);

    private native void nativeProcess(ByteBuffer byteBuffer);

    private native void nativeSetBypass(boolean z);

    private native void nativeSetFerrarisModelPath(String str);

    private native void nativeSetProcessingAmount(float f);

    private native void nativeSetupEngine(double d, int i, int i2);

    public ByteBuffer[] applyEffects(ByteBuffer[] byteBufferArr, long j) {
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

    public int getWarmupDurationInSec() {
        return 0;
    }

    public void warmup(ByteBuffer[] byteBufferArr, long j) {
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
    }

    public void disableTrack(int i) {
        this.mTrackEnableFlags[i] = false;
    }

    public void enableTrack(int i) {
        this.mTrackEnableFlags[i] = true;
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

    public CTAudioProcessorML(String str) {
        synchronized (CTAudioProcessorML.class) {
            0dV.A0C("ctaudioprocessorml-native");
        }
        this.mHybridData = initHybridData();
        nativeSetFerrarisModelPath(str);
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
