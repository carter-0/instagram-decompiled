package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Arrays;

/* renamed from: X.51I  reason: invalid class name */
public class AnonymousClass51I {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass51J A04;
    public String A05;
    public String A06;
    public String A07;
    public final float A08;
    public final MediaEffect A09;
    public final Float A0A;

    public AnonymousClass51I(MediaEffect mediaEffect, AnonymousClass51J r3, Float f, String str, String str2, String str3, float f2, float f3, int i, int i2, int i3) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A07 = str2;
        this.A04 = r3;
        this.A06 = str3;
        this.A09 = mediaEffect;
        this.A08 = f3;
        this.A0A = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass51I)) {
            return false;
        }
        AnonymousClass51I r4 = (AnonymousClass51I) obj;
        return Float.compare(r4.A00, this.A00) == 0 && this.A02 == r4.A02 && this.A03 == r4.A03 && this.A01 == r4.A01 && 0qQ.A0K(this.A05, r4.A05) && this.A04 == r4.A04 && 0qQ.A0K(this.A07, r4.A07) && 0qQ.A0K(this.A09, r4.A09) && this.A08 == r4.A08 && 0qQ.A0J(this.A0A, r4.A0A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, Float.valueOf(this.A00), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A04, this.A07, this.A09, Float.valueOf(this.A08), this.A0A});
    }

    public AnonymousClass51I() {
        this((MediaEffect) null, AnonymousClass51J.UNKNOWN, (Float) null, "", (String) null, (String) null, 1.0f, 1.0f, 0, 0, -1);
    }
}
