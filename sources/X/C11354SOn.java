package X;

import android.graphics.RectF;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.SOn  reason: case insensitive filesystem */
public final class C11354SOn {
    public static final RectF A0P = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public float A00;
    public int A01;
    public int A02 = 30;
    public int A03 = 10;
    public int A04 = -1;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D = -1;
    public RectF A0E = A0P;
    public C10246Rp6 A0F;
    public SJA A0G;
    public Integer A0H;
    public String A0I;
    public List A0J;
    public Map A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0N = false;
    public boolean A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r8.isEmpty() != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11354SOn A00(X.C7232Q0d r6, X.C11326SNc r7, java.util.List r8) {
        /*
            if (r8 == 0) goto L_0x0009
            boolean r0 = r8.isEmpty()
            r5 = 1
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            r5 = 0
        L_0x000a:
            X.SOn r4 = new X.SOn
            r4.<init>()
            int r3 = r6.A05
            r4.A08 = r3
            int r2 = r6.A03
            r4.A06 = r2
            int r1 = r6.A04
            r4.A07 = r1
            r0 = 30
            r4.A02 = r0
            int r0 = r7.A03
            r4.A03 = r0
            r4.A0J = r8
            int r0 = r1 % 180
            if (r0 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x0033
            r4.A0C = r2
            r4.A0A = r3
            r0 = 0
            r4.A0B = r0
            return r4
        L_0x0033:
            r4.A0C = r3
            r4.A0A = r2
            r4.A0B = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11354SOn.A00(X.Q0d, X.SNc, java.util.List):X.SOn");
    }

    public final int A01() {
        SJA sja = this.A0G;
        if (sja != null) {
            C8907RFa rFa = C8907RFa.CODEC_VIDEO_HEVC;
            C8907RFa rFa2 = sja.A04;
            if (rFa.equals(rFa2) || 1 != sja.A03 || !C8907RFa.CODEC_VIDEO_H264.equals(rFa2)) {
                int i = this.A04;
                if (i != -1) {
                    return i;
                }
                int i2 = this.A01;
                int min = Math.min(Math.max((int) (((double) i2) * 0.85d), 655000), i2);
                this.A04 = min;
                return min;
            }
        }
        return this.A01;
    }

    public final String toString() {
        int i;
        Integer valueOf;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("sourceWidth", Integer.valueOf(this.A08));
        A1E.put("sourceHeight", Integer.valueOf(this.A06));
        A1E.put("sourceRotationDegreesClockwise", Integer.valueOf(this.A07));
        A1E.put("targetWidth", Integer.valueOf(this.A0C));
        A1E.put("targetHeight", Integer.valueOf(this.A0A));
        A1E.put("outputAspectRatio", Float.valueOf(this.A00));
        A1E.put("shouldRetainAspectRatio", Boolean.valueOf(this.A0O));
        A1E.put("targetRotationDegreesClockwise", Integer.valueOf(this.A0B));
        A1E.put("outputRotationDegreesClockwise", Integer.valueOf(this.A05));
        A1E.put("cropRectangle", this.A0E);
        Integer num = this.A0H;
        if (num == null) {
            valueOf = null;
        } else {
            if (1 - num.intValue() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            valueOf = Integer.valueOf(i);
        }
        A1E.put("videoMirroringMode", valueOf);
        A1E.put("baselineBitRate", Integer.valueOf(this.A01));
        A1E.put("mainHighBitRate", Integer.valueOf(this.A04));
        A1E.put("frameRate", Integer.valueOf(this.A02));
        A1E.put("iframeinterval", Integer.valueOf(this.A03));
        A1E.put("videoBitrateMode", Integer.valueOf(this.A0D));
        A1E.put("videoTranscodeProfileLevelParams", this.A0G);
        A1E.put("glRenderers", this.A0J);
        A1E.put("debugStats", this.A0I);
        A1E.put("forceAvcEncoding", Boolean.valueOf(this.A0M));
        return C266784aL.A03(C11354SOn.class, A1E);
    }
}
