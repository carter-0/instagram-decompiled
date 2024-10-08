package X;

import java.util.List;

/* renamed from: X.Jut  reason: case insensitive filesystem */
public final class C60997Jut extends AnonymousClass0T0 {
    public int A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Boolean A06;
    public final Integer A07;
    public final String A08;
    public final List A09;

    public C60997Jut(Boolean bool, Integer num, String str, List list, float f, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(str, 5);
        this.A09 = list;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A08 = str;
        this.A05 = i4;
        this.A06 = bool;
        this.A00 = i5;
        this.A07 = num;
        this.A01 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60997Jut) {
                C60997Jut jut = (C60997Jut) obj;
                if (!(0qQ.A0K(this.A09, jut.A09) && this.A02 == jut.A02 && this.A04 == jut.A04 && this.A03 == jut.A03 && 0qQ.A0K(this.A08, jut.A08) && this.A05 == jut.A05 && 0qQ.A0K(this.A06, jut.A06) && this.A00 == jut.A00 && 0qQ.A0K(this.A07, jut.A07) && Float.compare(this.A01, jut.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.A08, ((((((AnonymousClass7TG.A0C(this.A09) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31) + this.A05) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A07)) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioTrackMetadata(floatAmplitudes=");
        A1A.append(this.A09);
        A1A.append(", fullVideoDurationMs=");
        A1A.append(this.A02);
        A1A.append(", snippetStartTimeMs=");
        A1A.append(this.A04);
        A1A.append(", snippetDurationMs=");
        A1A.append(this.A03);
        A1A.append(", audioTrackOverlayID=");
        A1A.append(this.A08);
        A1A.append(", totalTrackDuration=");
        A1A.append(this.A05);
        A1A.append(", isRecordingVoiceoverSegment=");
        A1A.append(this.A06);
        A1A.append(", titleViewExtraFrontPadding=");
        A1A.append(this.A00);
        A1A.append(", audioFilterNameResId=");
        A1A.append(this.A07);
        A1A.append(", speed=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
