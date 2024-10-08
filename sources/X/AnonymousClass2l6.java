package X;

import android.graphics.Bitmap;

/* renamed from: X.2l6  reason: invalid class name */
public final class AnonymousClass2l6 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final C376649Iu A03;
    public final String A04;

    public AnonymousClass2l6(Bitmap bitmap, C376649Iu r3, String str, int i, int i2) {
        0qQ.A0B(bitmap, 1);
        this.A02 = bitmap;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str;
        this.A03 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2l6) {
                AnonymousClass2l6 r5 = (AnonymousClass2l6) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00) * 31;
        String str = this.A04;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C376649Iu r0 = this.A03;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode2 + i;
    }
}
