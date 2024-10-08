package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.7qI  reason: invalid class name and case insensitive filesystem */
public final class C343487qI {
    public static final C343497qJ A06 = C343497qJ.ZERO_BASED_BUFFER_COUNTED;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C343497qJ A05;

    public C343487qI(C343497qJ r1, int i, int i2, int i3, int i4, int i5) {
        this.A04 = i5;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i;
        this.A05 = r1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C343487qI r5 = (C343487qI) obj;
            if (!(this.A04 == r5.A04 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A05 == r5.A05)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        Integer valueOf = Integer.valueOf(this.A04);
        int i = this.A01;
        if (i == 12) {
            str = "CHANNEL_IN_STEREO";
        } else if (i != 16) {
            str = 002.A0O("Wrong enum ", i);
        } else {
            str = "CHANNEL_IN_MONO";
        }
        int i2 = this.A02;
        if (i2 == 2) {
            str2 = "ENCODING_PCM_16BIT";
        } else if (i2 == 3) {
            str2 = "ENCODING_PCM_8BIT";
        } else if (i2 != 4) {
            str2 = 002.A0O("Wrong enum ", i2);
        } else {
            str2 = "ENCODING_PCM_FLOAT";
        }
        return String.format((Locale) null, "AudioRecorderConfig{sampleRateHz=%d, channelType=%s, encoding=%s, readBufferSizeInBytes=%d, bitrate=%d. presentationTimeStrategy=%s}", new Object[]{valueOf, str, str2, Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A05});
    }

    public final HashMap A00() {
        HashMap hashMap = new HashMap();
        hashMap.put("AudioRecorderConfig.channelType", String.valueOf(this.A01));
        hashMap.put("AudioRecorderConfig.encoding", String.valueOf(this.A02));
        hashMap.put("AudioRecorderConfig.sampleRateHz", String.valueOf(this.A04));
        hashMap.put("AudioRecorderConfig.readBufferSizeInBytes", String.valueOf(this.A03));
        hashMap.put("AudioRecorderConfig.bitRate", String.valueOf(this.A00));
        hashMap.put("AudioRecorderConfig.presentationTimeStrategy", String.valueOf(this.A05));
        return hashMap;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A04), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A05});
    }
}
