package X;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Collections;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.XrB  reason: case insensitive filesystem */
public final class C22017XrB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final Metadata A0A;
    public final C21376XZj A0B;

    public static int A00(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int A01(int i) {
        switch (i) {
            case CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final SJM A02(Metadata metadata, byte[] bArr) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.A04;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.A0A;
        if (metadata2 != null) {
            if (metadata == null) {
                metadata = metadata2;
            } else {
                metadata = metadata2.A00(metadata.A01);
            }
        }
        SOW sow = new SOW();
        sow.A01(AnonymousClass000.A00(2667));
        sow.A0A = i;
        sow.A04 = this.A02;
        sow.A0G = this.A07;
        sow.A0C = Util.A00(this.A00);
        sow.A0X = Collections.singletonList(bArr);
        sow.A0P = metadata;
        return new SJM(sow);
    }

    public final C22017XrB A03(C21376XZj xZj) {
        return new C22017XrB(this.A0A, xZj, this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09);
    }

    public C22017XrB(Metadata metadata, C21376XZj xZj, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        this.A05 = i;
        this.A03 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A07 = i5;
        this.A08 = A01(i5);
        this.A02 = i6;
        this.A00 = i7;
        this.A01 = A00(i7);
        this.A09 = j;
        this.A0B = xZj;
        this.A0A = metadata;
    }

    public C22017XrB(byte[] bArr, int i) {
        ST7 st7 = new ST7(bArr);
        st7.A09(i * 8);
        this.A05 = st7.A06(16);
        this.A03 = st7.A06(16);
        this.A06 = st7.A06(24);
        this.A04 = st7.A06(24);
        int A062 = st7.A06(20);
        this.A07 = A062;
        this.A08 = A01(A062);
        this.A02 = st7.A06(3) + 1;
        int A063 = st7.A06(5) + 1;
        this.A00 = A063;
        this.A01 = A00(A063);
        int A064 = st7.A06(4);
        this.A09 = (((long) st7.A06(32)) & 4294967295L) | ((((long) A064) & 4294967295L) << 32);
        this.A0B = null;
        this.A0A = null;
    }
}
