package com.facebook.cvat.ctvoiceeffect;

import X.03t;
import X.0dV;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10568RuN;
import X.C12334Srg;
import X.C13950TmB;
import X.C66580MXl;
import X.Pxg;
import X.RVA;
import X.SEV;
import com.facebook.jni.HybridData;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;

public final class CTVoiceEffectProcessor implements C13950TmB {
    public static final RVA Companion = new Object();
    public String effectPathFromJson;
    public final List globalAudioEffects = AnonymousClass7TE.A1C();
    public final HybridData mHybridData = initHybridData();
    public List[] mediaEffects = new List[0];
    public int numChannels;
    public int numSamples;
    public ByteBuffer outputBuffer;
    public int outputBufferSize;
    public double sampleRate;
    public boolean[] trackEnableFlags = new boolean[0];
    public float userParameterValue = -1.0f;

    private final native HybridData initHybridData();

    private final native boolean nativeGetBypass();

    private final native String nativeGetEffectName(String str);

    private final native int nativeGetLatencySamples();

    private final native float nativeGetUserParameterValue();

    private final native boolean nativeIsPreparedToPlay();

    private final native short nativeMixPCMAudioSamples(short s, short s2);

    private final native void nativeProcess(ByteBuffer byteBuffer);

    private final native void nativeSetBypass(boolean z);

    private final native void nativeSetOutputGain(float f);

    private final native void nativeSetUserParameterValue(float f);

    private final native void nativeSetVoiceEffectToLoad(String str);

    private final native void nativeSetup(double d, int i, int i2);

    public ByteBuffer[] applyEffects(ByteBuffer[] byteBufferArr, long j) {
        0qQ.A0B(byteBufferArr, 0);
        int length = byteBufferArr.length;
        ByteBuffer[] byteBufferArr2 = new ByteBuffer[length];
        for (int i = 0; i < length; i++) {
            ByteBuffer byteBuffer = byteBufferArr[i];
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocateDirect(0);
            }
            if (this.trackEnableFlags[i]) {
                0qQ.A0A(byteBuffer);
                for (Object obj : this.mediaEffects[i]) {
                    if (obj instanceof C12334Srg) {
                        nativeProcess(byteBuffer);
                    }
                }
                for (Object obj2 : this.globalAudioEffects) {
                    if (obj2 instanceof C12334Srg) {
                        nativeProcess(byteBuffer);
                    }
                }
            }
            byteBufferArr2[i] = byteBuffer;
        }
        return (ByteBuffer[]) 03t.A0I(byteBufferArr2).toArray(new ByteBuffer[0]);
    }

    public void configure(C10568RuN ruN) {
        0qQ.A0B(ruN, 0);
        int i = ruN.A00;
        this.trackEnableFlags = new boolean[i];
        List[] listArr = new List[i];
        for (int i2 = 0; i2 < i; i2++) {
            listArr[i2] = AnonymousClass7TE.A1C();
        }
        this.mediaEffects = listArr;
        SEV sev = ruN.A02;
        this.sampleRate = (double) sev.A01;
        int i3 = sev.A00;
        this.numChannels = i3;
        this.numSamples = 1024;
        int i4 = i3 * 1024 * 2;
        this.outputBufferSize = i4;
        if (this.outputBuffer == null) {
            this.outputBuffer = Pxg.A13(i4);
        }
        nativeSetup(this.sampleRate, this.numSamples, this.numChannels);
    }

    public int getWarmupDurationInSec() {
        return 0;
    }

    public boolean isEffectSupported(MediaEffect mediaEffect) {
        0qQ.A0B(mediaEffect, 0);
        return mediaEffect instanceof C12334Srg;
    }

    public ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        0qQ.A0B(byteBufferArr, 0);
        ByteBuffer byteBuffer = this.outputBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            ByteBuffer[] applyEffects = applyEffects(byteBufferArr, j);
            for (int i = 0; i < this.outputBufferSize; i += 2) {
                int length = applyEffects.length;
                short s = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.trackEnableFlags[i2]) {
                        s = nativeMixPCMAudioSamples(s, applyEffects[i2].getShort(i));
                    }
                }
                ByteBuffer byteBuffer2 = this.outputBuffer;
                0qQ.A0A(byteBuffer2);
                byteBuffer2.putShort(s);
            }
            ByteBuffer byteBuffer3 = this.outputBuffer;
            0qQ.A0A(byteBuffer3);
            byteBuffer3.flip();
            ByteBuffer byteBuffer4 = this.outputBuffer;
            0qQ.A0C(byteBuffer4, "null cannot be cast to non-null type java.nio.ByteBuffer");
            return byteBuffer4;
        }
        throw AnonymousClass7TE.A0z("This method should not be called without having called configure()");
    }

    public void warmup(ByteBuffer[] byteBufferArr, long j) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RVA, java.lang.Object] */
    static {
        0dV.A0C("ctvoiceeffectprocessor-native");
    }

    public void disableTrack(int i) {
        this.trackEnableFlags[i] = false;
    }

    public void enableTrack(int i) {
        this.trackEnableFlags[i] = true;
    }

    public /* bridge */ /* synthetic */ void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        0qQ.A0B(mediaEffect, 1);
        if (intValue < 0 || !(mediaEffect instanceof C12334Srg)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Track Index: ");
            A1A.append(intValue);
            throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(mediaEffect, ", MediaEffect: ", A1A));
        }
        this.mediaEffects[intValue].add(mediaEffect);
        List<Object> list = this.mediaEffects[intValue];
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof C12334Srg) {
                    String str = ((C12334Srg) mediaEffect).A00;
                    if (str != null) {
                        this.effectPathFromJson = str;
                        nativeSetVoiceEffectToLoad(str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        0qQ.A0B(mediaEffect, 1);
        if (intValue < 0 || !(mediaEffect instanceof C12334Srg)) {
            throw C66580MXl.A11();
        }
        this.mediaEffects[intValue].remove(mediaEffect);
    }

    public void addEffect(MediaEffect mediaEffect) {
        0qQ.A0B(mediaEffect, 0);
        if (mediaEffect instanceof C12334Srg) {
            this.globalAudioEffects.add(mediaEffect);
            String str = ((C12334Srg) mediaEffect).A00;
            if (str != null) {
                this.effectPathFromJson = str;
                nativeSetVoiceEffectToLoad(str);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(mediaEffect, "MediaEffect: ", AnonymousClass7TE.A1A()));
    }

    public void removeEffect(MediaEffect mediaEffect) {
        0qQ.A0B(mediaEffect, 0);
        if (mediaEffect instanceof C12334Srg) {
            this.globalAudioEffects.remove(mediaEffect);
            return;
        }
        throw C66580MXl.A11();
    }
}
