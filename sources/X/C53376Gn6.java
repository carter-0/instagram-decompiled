package X;

import android.graphics.Bitmap;

/* renamed from: X.Gn6  reason: case insensitive filesystem */
public final class C53376Gn6 extends AnonymousClass0T0 {
    public String A00;
    public final int A01 = 0;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C53376Gn6(Bitmap bitmap, C61078JwG jwG, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(bitmap, 1);
        this.A02 = bitmap;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A06 = str4;
        this.A03 = jwG;
        this.A07 = str5;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A01 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53376Gn6)) {
                return false;
            }
            C53376Gn6 gn6 = (C53376Gn6) obj;
            if (gn6.A01 != 1 || !0qQ.A0K(this.A07, gn6.A07) || !0qQ.A0K(this.A06, gn6.A06) || !0qQ.A0K(this.A02, gn6.A02) || !0qQ.A0K(this.A03, gn6.A03) || !0qQ.A0K(this.A05, gn6.A05) || !0qQ.A0K(this.A04, gn6.A04)) {
                return false;
            }
            str = this.A00;
            str2 = gn6.A00;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53376Gn6)) {
                return false;
            }
            C53376Gn6 gn62 = (C53376Gn6) obj;
            if (gn62.A01 != 0 || !0qQ.A0K(this.A02, gn62.A02) || !0qQ.A0K(this.A05, gn62.A05) || !0qQ.A0K(this.A04, gn62.A04) || !0qQ.A0K(this.A00, gn62.A00) || !0qQ.A0K(this.A06, gn62.A06) || !0qQ.A0K(this.A03, gn62.A03)) {
                return false;
            }
            str = this.A07;
            str2 = gn62.A07;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        String str;
        if (this.A01 != 0) {
            A0K = ((((((((((AnonymousClass7TG.A0E(this.A07) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
            str = this.A00;
        } else {
            A0K = (((((((((AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31;
            str = this.A07;
        }
        return A0K + C41845B3m.A00(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53376Gn6(Bitmap bitmap, C61078JwG jwG, String str, String str2, String str3, String str4, String str5, int i) {
        this(bitmap, (i & 32) != 0 ? null : jwG, str, str2, str3, str4, (i & 64) != 0 ? null : str5);
    }

    public C53376Gn6(Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        this.A07 = str;
        this.A06 = str2;
        this.A02 = num;
        this.A03 = bool;
        this.A05 = str3;
        this.A04 = str4;
        this.A00 = null;
    }
}
