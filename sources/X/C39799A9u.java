package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.A9u  reason: case insensitive filesystem */
public final class C39799A9u {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final MediaEffect A05;
    public final Float A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39799A9u) {
                C39799A9u a9u = (C39799A9u) obj;
                if (!(0qQ.A0K(this.A07, a9u.A07) && this.A03 == a9u.A03 && this.A02 == a9u.A02 && Float.compare(this.A01, a9u.A01) == 0 && this.A04 == a9u.A04 && 0qQ.A0K(this.A08, a9u.A08) && 0qQ.A0K(this.A05, a9u.A05) && Float.compare(this.A00, a9u.A00) == 0 && 0qQ.A0K(this.A06, a9u.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00((((((AnonymousClass7TF.A00((((AnonymousClass7TE.A0O(this.A07) + this.A03) * 31) + this.A02) * 31, this.A01) + this.A04) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31, this.A00) + AnonymousClass7TE.A0L(this.A06);
    }

    public C39799A9u(MediaEffect mediaEffect, Float f, String str, String str2, float f2, float f3, int i, int i2, int i3) {
        this.A07 = str;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f2;
        this.A04 = i3;
        this.A08 = str2;
        this.A05 = mediaEffect;
        this.A00 = f3;
        this.A06 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioOverlay(filePath=");
        A1A.append(this.A07);
        A1A.append(", seekTimeMs=");
        A1A.append(this.A03);
        A1A.append(", durationMs=");
        A1A.append(this.A02);
        A1A.append(", volume=");
        A1A.append(this.A01);
        A1A.append(", videoStartTimeMs=");
        A1A.append(this.A04);
        A1A.append(", uuid=");
        A1A.append(this.A08);
        A1A.append(", audioFilter=");
        A1A.append(this.A05);
        A1A.append(", timeScale=");
        A1A.append(this.A00);
        A1A.append(", pitch=");
        return AnonymousClass7TG.A0n(this.A06, A1A);
    }
}
