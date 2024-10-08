package X;

import android.os.SystemClock;
import com.facebook.cameracore.audiograph.AudioPipelineImpl;
import java.util.HashMap;

/* renamed from: X.AQa  reason: case insensitive filesystem */
public final class C40070AQa implements C22555YAe {
    public long A00 = 0;
    public final HashMap A01 = AnonymousClass7TE.A1E();
    public final /* synthetic */ AudioPipelineImpl A02;

    public C40070AQa(AudioPipelineImpl audioPipelineImpl) {
        this.A02 = audioPipelineImpl;
    }

    public final void D7i(Y1G y1g, int i) {
        int processByteBuffer;
        int i2;
        AudioPipelineImpl audioPipelineImpl = this.A02;
        if (!audioPipelineImpl.mDestructed.get() && !audioPipelineImpl.mStopped.get()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Y1G y1g2 = y1g;
            int i3 = i;
            if (audioPipelineImpl.mAudioTrack == null) {
                C341477mx r8 = audioPipelineImpl.mAudioOutputCallback;
                if (r8 != null) {
                    r8.A00(y1g2, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, (long) i3, elapsedRealtimeNanos);
                    this.A00++;
                    return;
                }
                return;
            }
            if (AudioPipelineImpl.IS_UNIT_TEST) {
                processByteBuffer = 0;
            } else {
                processByteBuffer = audioPipelineImpl.processByteBuffer(y1g2.A02, i3);
            }
            int i4 = 1;
            if (processByteBuffer == 0) {
                C341477mx r82 = audioPipelineImpl.mAudioOutputCallback;
                if (r82 != null) {
                    r82.A00(y1g2, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, (long) i3, elapsedRealtimeNanos);
                }
            } else {
                HashMap hashMap = this.A01;
                Integer valueOf = Integer.valueOf(processByteBuffer);
                Number number = (Number) hashMap.get(valueOf);
                if (number != null) {
                    i2 = number.intValue() + 1;
                } else {
                    i2 = 1;
                }
                hashMap.put(valueOf, Integer.valueOf(i2));
            }
            this.A00++;
            if (processByteBuffer != 0 && processByteBuffer != 101) {
                HashMap hashMap2 = this.A01;
                Integer valueOf2 = Integer.valueOf(processByteBuffer);
                Number number2 = (Number) hashMap2.get(valueOf2);
                if (number2 != null) {
                    i4 = 1 + number2.intValue();
                }
                hashMap2.put(valueOf2, Integer.valueOf(i4));
            }
        }
    }

    public final void D7j(byte[] bArr, int i) {
        int processData;
        int i2;
        AudioPipelineImpl audioPipelineImpl = this.A02;
        if (!audioPipelineImpl.mDestructed.get() && !audioPipelineImpl.mStopped.get()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            byte[] bArr2 = bArr;
            int i3 = i;
            if (audioPipelineImpl.mAudioTrack == null) {
                C341477mx r8 = audioPipelineImpl.mAudioOutputCallback;
                if (r8 != null) {
                    r8.A01(bArr2, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, (long) i3, elapsedRealtimeNanos);
                    this.A00++;
                    return;
                }
                return;
            }
            if (AudioPipelineImpl.IS_UNIT_TEST) {
                processData = 0;
            } else {
                processData = audioPipelineImpl.processData(bArr2, i3);
            }
            int i4 = 1;
            if (processData == 0) {
                C341477mx r82 = audioPipelineImpl.mAudioOutputCallback;
                if (r82 != null) {
                    r82.A01(bArr2, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, (long) i3, elapsedRealtimeNanos);
                }
            } else {
                HashMap hashMap = this.A01;
                Integer valueOf = Integer.valueOf(processData);
                Number number = (Number) hashMap.get(valueOf);
                if (number != null) {
                    i2 = number.intValue() + 1;
                } else {
                    i2 = 1;
                }
                hashMap.put(valueOf, Integer.valueOf(i2));
            }
            this.A00++;
            if (processData != 0 && processData != 101) {
                HashMap hashMap2 = this.A01;
                Integer valueOf2 = Integer.valueOf(processData);
                Number number2 = (Number) hashMap2.get(valueOf2);
                if (number2 != null) {
                    i4 = 1 + number2.intValue();
                }
                hashMap2.put(valueOf2, Integer.valueOf(i4));
            }
        }
    }

    public final void DCe(C382299dT r2) {
        C341617nF r0;
        C341747nS r02;
        C341477mx r03 = this.A02.mAudioOutputCallback;
        if (r03 != null && (r0 = r03.A00) != null && (r02 = r0.A00.A0H) != null) {
            r02.A00(r2);
        }
    }

    public final void DFw() {
        C344037rD r2;
        C341477mx r0 = this.A02.mAudioOutputCallback;
        if (r0 != null && (r2 = r0.A01) != null) {
            r2.DD7(19, "recording_start_audio_first_received");
        }
    }
}
