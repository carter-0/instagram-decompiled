package X;

import com.instagram.common.clips.model.ClipSegment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

public final class KN4 extends AnonymousClass51N {
    public int A00;
    public C376429Hy A01;
    public C53401GnY A02;
    public 0v6 A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final String A0D;
    public final Map A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KN4(C376429Hy r2, C53401GnY gnY, 0v6 r4, String str, String str2, Map map, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        super(AnonymousClass05K.A00);
        0qQ.A0B(str, 1);
        this.A0D = str;
        this.A00 = i;
        this.A0C = i2;
        this.A0A = i3;
        this.A0B = i4;
        this.A05 = z;
        this.A08 = z2;
        this.A02 = gnY;
        this.A07 = z3;
        this.A06 = z4;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str2;
        this.A0E = map;
        this.A09 = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KN4) {
                KN4 kn4 = (KN4) obj;
                if (!(0qQ.A0K(this.A0D, kn4.A0D) && this.A00 == kn4.A00 && this.A0C == kn4.A0C && this.A0A == kn4.A0A && this.A0B == kn4.A0B && this.A05 == kn4.A05 && this.A08 == kn4.A08 && 0qQ.A0K(this.A02, kn4.A02) && this.A07 == kn4.A07 && this.A06 == kn4.A06 && 0qQ.A0K(this.A03, kn4.A03) && 0qQ.A0K(this.A01, kn4.A01) && 0qQ.A0K(this.A04, kn4.A04) && 0qQ.A0K(this.A0E, kn4.A0E) && this.A09 == kn4.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A02() {
        return this.A0A;
    }

    public final int A03() {
        return this.A0C;
    }

    public final C376429Hy A04() {
        return this.A01;
    }

    public final 0v6 A05() {
        return this.A03;
    }

    public final AnonymousClass51S A07() {
        return null;
    }

    public final String A08() {
        return this.A0D;
    }

    public final boolean A09() {
        return this.A05;
    }

    public final boolean A0A() {
        return this.A07;
    }

    public final ClipSegment.PhotoSegment A0B() {
        return new ClipSegment.PhotoSegment(AnonymousClass51Q.A04(this), (Integer) null, (Integer) null, this.A0D, (String) null, (String) null, this.A0C, this.A0A, this.A0B, this.A00, -1, false);
    }

    public final int BrP() {
        return this.A00;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A05, (((((((AnonymousClass7TE.A0O(this.A0D) + this.A00) * 31) + this.A0C) * 31) + this.A0A) * 31) + this.A0B) * 31);
        return ((((((((AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A09(this.A08, A092) + AnonymousClass7TG.A0C(this.A02)) * 31)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A0E)) * 31) + this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass51N A06() {
        try {
            StringWriter A0v = JTO.A0v();
            17W A0Q = JTO.A0Q(A0v);
            LIN.A00(A0Q, this);
            try {
                return LIN.parseFromJson(16P.A00(JTP.A0n(A0Q, A0v)));
            } catch (IOException unused) {
                throw new RuntimeException();
            }
        } catch (IOException unused2) {
            throw new RuntimeException();
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IgPhotoSegment(filePath=");
        A1A.append(this.A0D);
        A1A.append(C273654mx.A00(1064));
        A1A.append(this.A00);
        A1A.append(", width=");
        A1A.append(this.A0C);
        A1A.append(", height=");
        A1A.append(this.A0A);
        A1A.append(AnonymousClass000.A00(404));
        A1A.append(this.A0B);
        A1A.append(C273654mx.A00(1067));
        A1A.append(this.A05);
        A1A.append(C273654mx.A00(1089));
        A1A.append(this.A08);
        A1A.append(C273654mx.A00(1037));
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(1081));
        A1A.append(this.A07);
        A1A.append(C273654mx.A00(1072));
        A1A.append(this.A06);
        A1A.append(C273654mx.A00(1157));
        A1A.append(this.A03);
        A1A.append(C273654mx.A00(199));
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(1117));
        A1A.append(this.A04);
        A1A.append(", exifData=");
        A1A.append(this.A0E);
        A1A.append(", exifOrientation=");
        return C51975G9x.A0j(A1A, this.A09);
    }
}
