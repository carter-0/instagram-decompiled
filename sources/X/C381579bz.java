package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.9bz  reason: invalid class name and case insensitive filesystem */
public final class C381579bz extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final Medium A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381579bz) {
                C381579bz r8 = (C381579bz) obj;
                if (!0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A09, r8.A09) || this.A03 != r8.A03 || this.A02 != r8.A02 || this.A01 != r8.A01 || this.A00 != r8.A00 || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A04, r8.A04) || this.A08 != r8.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = (((((((AnonymousClass7TF.A01(this.A02, AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A05, AnonymousClass7TG.A0E(this.A06) * 31)))) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        return A012 + i;
    }

    public C381579bz(Bitmap bitmap, Bitmap bitmap2, Medium medium, String str, List list, int i, int i2, long j, long j2, boolean z) {
        this.A06 = str;
        this.A05 = bitmap;
        this.A09 = medium;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = list;
        this.A04 = bitmap2;
        this.A08 = z;
    }
}
