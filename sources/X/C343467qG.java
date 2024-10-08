package X;

import java.util.Arrays;
import java.util.HashMap;
import org.webrtc.CameraCapturer;

/* renamed from: X.7qG  reason: invalid class name and case insensitive filesystem */
public class C343467qG implements C343477qH {
    public C343487qI A00;
    public C343507qK A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C343467qG r5 = (C343467qG) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final HashMap A00() {
        C343507qK r2 = this.A01;
        HashMap hashMap = new HashMap();
        hashMap.put("AudioEncoderConfig.bitRate", String.valueOf(r2.A01));
        hashMap.put("AudioEncoderConfig.sampleRate", String.valueOf(r2.A08));
        hashMap.put("AudioEncoderConfig.channelCount", String.valueOf(r2.A03));
        hashMap.put("AudioEncoderConfig.bufferSize", String.valueOf(r2.A02));
        hashMap.put("AudioEncoderConfig.pcmEncoding", String.valueOf(r2.A07));
        hashMap.put("AudioEncoderConfig.dequeueInputBufferTimeoutMs", String.valueOf(r2.A04));
        hashMap.put("AudioEncoderConfig.endOfStreamDequeueOutputBufferTimeoutUs", String.valueOf(r2.A05));
        hashMap.put("AudioEncoderConfig.maxTryAgainLaterRetries", String.valueOf(r2.A06));
        hashMap.put("AudioEncoderConfig.aacProfile", String.valueOf(r2.A00));
        hashMap.put("AudioEncoderConfig.audioMimeType", String.valueOf("audio/mp4a-latm"));
        HashMap A002 = this.A00.A00();
        HashMap hashMap2 = new HashMap(hashMap.size() + A002.size());
        hashMap2.putAll(A002);
        hashMap2.putAll(hashMap);
        return hashMap2;
    }

    public final C341767nU CAE() {
        if (this instanceof C382409de) {
            return C341767nU.SUPERNOVA_AUDIO;
        }
        return C341767nU.AUDIO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C343467qG(C343967r6 r12, ADm aDm, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        Integer num6;
        int intValue;
        Integer num7;
        int i = 44100;
        int i2 = 16;
        int i3 = 2;
        int i4 = 4096;
        int i5 = 64000;
        C343497qJ r2 = C343487qI.A06;
        if (aDm != null && (num7 = aDm.A05) != null) {
            i = num7.intValue();
        } else if (num != null) {
            i = num.intValue();
        }
        i3 = num2 != null ? num2.intValue() : i3;
        if (!(num3 == null || (intValue = num3.intValue()) == 1)) {
            if (intValue == 2) {
                i2 = 12;
            } else {
                throw new RuntimeException("Channel count not supported");
            }
        }
        i4 = num5 != null ? num5.intValue() : i4;
        if (aDm != null) {
            Integer num8 = aDm.A06;
            i5 = num8 != null ? num8.intValue() : i5;
            Boolean bool = aDm.A02;
            if (bool != null) {
                r2 = bool.booleanValue() ? C343497qJ.REAL_TIME_BASED_BUFFER_COUNTED : C343497qJ.ZERO_BASED_BUFFER_COUNTED;
            }
        }
        C343487qI r1 = new C343487qI(r2, i5, i2, i3, i4, i);
        this.A00 = r1;
        int i6 = -1;
        int i7 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        int i8 = 200;
        int i9 = 1;
        int i10 = r1.A00;
        int i11 = r1.A03;
        int i12 = r1.A04;
        int i13 = r1.A02;
        int bitCount = Integer.bitCount(r1.A01);
        if (!(aDm == null || (num6 = aDm.A04) == null)) {
            i9 = num6.intValue();
        }
        if (r12 != null) {
            i7 = (int) r12.B4o(4);
            i8 = (int) r12.B4o(5);
        }
        this.A01 = new C343507qK(i9, i10, i11, bitCount, num4 != null ? num4.intValue() : i6, i7, i8, i13, i12);
    }
}
