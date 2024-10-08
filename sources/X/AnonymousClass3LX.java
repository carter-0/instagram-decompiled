package X;

import android.graphics.Bitmap;

/* renamed from: X.3LX  reason: invalid class name */
public final class AnonymousClass3LX extends AnonymousClass0T0 {
    public final int A00;
    public final Bitmap A01;
    public final C376649Iu A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3LX) {
                AnonymousClass3LX r5 = (AnonymousClass3LX) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Bitmap bitmap = this.A01;
        int i = 0;
        int hashCode = (((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A00) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C376649Iu r0 = this.A02;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode2 + i;
    }

    public AnonymousClass3LX(Bitmap bitmap, C376649Iu r2, String str, String str2, int i) {
        this.A01 = bitmap;
        this.A04 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A02 = r2;
    }
}
