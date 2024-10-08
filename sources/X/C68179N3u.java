package X;

import java.util.Arrays;

/* renamed from: X.N3u  reason: case insensitive filesystem */
public final class C68179N3u extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final int[] A0B;
    public final int[] A0C;

    public C68179N3u(String str, String str2, String str3, String str4, String str5, String str6, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(str, 1);
        C51972G9s.A1E(iArr, iArr2);
        this.A09 = str;
        this.A04 = i;
        this.A0A = str2;
        this.A03 = i2;
        this.A01 = i3;
        this.A0C = iArr;
        this.A0B = iArr2;
        this.A02 = i4;
        this.A00 = i5;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj))) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.thread.threaddetail.model.DirectThreadThemeInfoViewModel");
                C68179N3u n3u = (C68179N3u) obj;
                if (!0qQ.A0K(this.A09, n3u.A09) || this.A04 != n3u.A04 || !0qQ.A0K(this.A0A, n3u.A0A) || this.A03 != n3u.A03 || this.A01 != n3u.A01 || !Arrays.equals(this.A0C, n3u.A0C) || !Arrays.equals(this.A0B, n3u.A0B) || this.A02 != n3u.A02 || this.A00 != n3u.A00 || !0qQ.A0K(this.A08, n3u.A08) || !0qQ.A0K(this.A06, n3u.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = (((((((((((((((((AnonymousClass7TE.A0O(this.A09) + this.A04) * 31) + JTR.A0G(this.A0A)) * 31) + this.A03) * 31) + this.A01) * 31) + Arrays.hashCode(this.A0C)) * 31) + Arrays.hashCode(this.A0B)) * 31) + this.A02) * 31) + this.A00) * 31) + JTR.A0G(this.A08)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public C68179N3u() {
        this("", "", "", "", (String) null, (String) null, new int[0], new int[0], 0, 0, 0, 0, 0);
    }
}
