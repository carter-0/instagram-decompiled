package X;

import android.media.CamcorderProfile;
import java.util.Arrays;

public final class AUM implements C343477qH {
    public int A00;
    public C39800A9v A01;
    public boolean A02;
    public final A82 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AUM aum = (AUM) obj;
            if (!(this.A02 == aum.A02 && this.A01.equals(aum.A01) && this.A00 == aum.A00)) {
                return false;
            }
        }
        return true;
    }

    private void A00(C343967r6 r3, ADm aDm, int i) {
        Boolean bool;
        this.A01 = new C39800A9v(new A82());
        boolean z = false;
        this.A00 = 1;
        if (!(aDm == null || (bool = aDm.A01) == null)) {
            z = bool.booleanValue();
        }
        this.A02 = z;
        String Ar6 = r3.Ar6(1003);
        if (!Ar6.isEmpty()) {
            this.A03.A06 = Ar6;
        }
        if (i != -1) {
            this.A03.A02 = i;
        }
    }

    public final C341767nU CAE() {
        return C341767nU.VIDEO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, 0, Boolean.valueOf(this.A02), Integer.valueOf(this.A00)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AUM(android.media.CamcorderProfile r7, X.C343967r6 r8, X.ADm r9, int r10, int r11, int r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        /*
            r6 = this;
            r6.<init>()
            X.A82 r1 = new X.A82
            r1.<init>()
            r6.A03 = r1
            int r0 = r7.videoFrameRate
            r6.A00(r8, r9, r0)
            r0 = 90
            if (r10 == r0) goto L_0x00b5
            r0 = 270(0x10e, float:3.78E-43)
            if (r10 == r0) goto L_0x00b5
            int r5 = r7.videoFrameWidth
            int r4 = r7.videoFrameHeight
        L_0x001b:
            r0 = 720(0x2d0, float:1.009E-42)
            if (r14 == 0) goto L_0x00a0
            int r5 = java.lang.Math.min(r0, r5)
            r2 = 1071877689(0x3fe38e39, float:1.7777778)
            float r0 = (float) r5
            float r0 = r0 * r2
            int r4 = (int) r0
        L_0x0029:
            r0 = 137(0x89, float:1.92E-43)
            boolean r0 = r8.CTO(r0)
            r3 = 16
            if (r0 == 0) goto L_0x009d
            android.media.MediaCodecInfo$CodecCapabilities r2 = X.C346447vB.A00()
            if (r2 == 0) goto L_0x0047
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            if (r0 == 0) goto L_0x0047
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            int r3 = r0.getWidthAlignment()
        L_0x0047:
            android.media.MediaCodecInfo$CodecCapabilities r2 = X.C346447vB.A00()
            if (r2 == 0) goto L_0x009d
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            if (r0 == 0) goto L_0x009d
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            int r2 = r0.getHeightAlignment()
        L_0x005b:
            int r0 = r5 % r3
            int r5 = r5 - r0
            int r0 = r4 % r2
            int r4 = r4 - r0
            r0 = 84
            boolean r3 = r8.CTO(r0)
            r0 = 85
            boolean r2 = r8.CTO(r0)
            r0 = 1
            if (r2 != 0) goto L_0x0071
            r0 = 0
        L_0x0071:
            r1.A04 = r5
            r1.A03 = r4
            r1.A07 = r3
            r1.A08 = r0
            r2 = 1
            r1.A09 = r2
            if (r13 == 0) goto L_0x0086
            int r0 = r7.videoBitRate
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
        L_0x0086:
            r1.A00 = r2
            r0 = 3
            r1.A01 = r0
            if (r16 == 0) goto L_0x0095
            r1.A09 = r2
            r0 = 6
            r1.A00 = r0
            r0 = 7
            r1.A01 = r0
        L_0x0095:
            X.A9v r0 = new X.A9v
            r0.<init>(r1)
            r6.A01 = r0
            return
        L_0x009d:
            r2 = 16
            goto L_0x005b
        L_0x00a0:
            if (r15 == 0) goto L_0x00aa
            int r5 = java.lang.Math.min(r0, r5)
        L_0x00a6:
            int r4 = r5 * r12
            int r4 = r4 / r11
            goto L_0x0029
        L_0x00aa:
            if (r11 <= 0) goto L_0x0029
            if (r12 <= 0) goto L_0x0029
            int r4 = r4 * r11
            int r4 = r4 / r12
            int r5 = java.lang.Math.min(r5, r4)
            goto L_0x00a6
        L_0x00b5:
            int r5 = r7.videoFrameHeight
            int r4 = r7.videoFrameWidth
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AUM.<init>(android.media.CamcorderProfile, X.7r6, X.ADm, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    public AUM(CamcorderProfile camcorderProfile, C343967r6 r10, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        A82 a82 = new A82();
        this.A03 = a82;
        A00(r10, (ADm) null, camcorderProfile.videoFrameRate);
        if (i == 90 || i == 270) {
            i6 = camcorderProfile.videoFrameHeight;
            i7 = camcorderProfile.videoFrameWidth;
        } else {
            i6 = camcorderProfile.videoFrameWidth;
            i7 = camcorderProfile.videoFrameHeight;
        }
        if (i2 != 0) {
            int i8 = i3;
            if ((i5 + i4) % 180 == 0) {
                i8 = i2;
                i2 = i3;
            }
            float f = (float) i6;
            float f2 = (float) i7;
            float f3 = ((float) i8) / ((float) i2);
            if (f / f2 > f3) {
                i6 = (int) (f2 * f3);
            } else {
                i7 = (int) (f / f3);
            }
        }
        a82.A04 = i6 - (i6 % 16);
        a82.A03 = i7 - (i7 % 16);
        this.A01 = new C39800A9v(a82);
    }
}
