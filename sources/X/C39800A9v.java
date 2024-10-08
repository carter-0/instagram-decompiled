package X;

import com.instagram.debug.devoptions.debughead.util.MemoryUtil;

/* renamed from: X.A9v  reason: case insensitive filesystem */
public final class C39800A9v {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39800A9v)) {
            return false;
        }
        C39800A9v a9v = (C39800A9v) obj;
        return this.A05 == a9v.A05 && this.A04 == a9v.A04 && this.A00 == a9v.A00 && this.A03 == a9v.A03 && this.A06.equals(a9v.A06) && this.A01 == a9v.A01 && this.A02 == a9v.A02;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A08(this.A06, ((((((((this.A05 * 31) + this.A04) * 31) + this.A00) * 31) + this.A03) * 31) + 5) * 31) + 2) * 31) + this.A01) * 31) + this.A02;
    }

    public C39800A9v(A82 a82) {
        int min;
        int i = a82.A04;
        this.A05 = i;
        int i2 = a82.A03;
        this.A04 = i2;
        int i3 = a82.A02;
        this.A03 = i3;
        this.A06 = a82.A06;
        Integer num = a82.A05;
        if (num != null) {
            min = num.intValue();
        } else {
            min = Math.min((int) (((double) (i * i2)) * 0.07d * ((double) ((float) i3)) * 2.0d), MemoryUtil.MAX_ALLOC_SIZE);
        }
        this.A00 = min;
        this.A07 = a82.A07;
        this.A08 = a82.A08;
        this.A09 = a82.A09;
        this.A01 = a82.A00;
        this.A02 = a82.A01;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEncoderConfig{width=");
        A1A.append(this.A05);
        A1A.append(", height=");
        A1A.append(this.A04);
        A1A.append(", bitRate=");
        A1A.append(this.A00);
        A1A.append(Pxd.A00(46));
        A1A.append(this.A03);
        A1A.append(", iFrameIntervalS=");
        A1A.append(5);
        A1A.append(", colorRange=");
        A1A.append(2);
        A1A.append(", colorStandard=");
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(440));
        A1A.append(this.A02);
        A1A.append(", profile='");
        A1A.append(this.A06);
        A1A.append('\'');
        A1A.append(", configureBFrames=");
        A1A.append(this.A07);
        A1A.append(", explicitlySetBaseline=");
        A1A.append(this.A08);
        A1A.append(", explicitlySetColorEncoding=");
        A1A.append(this.A09);
        A1A.append('}');
        return A1A.toString();
    }
}
