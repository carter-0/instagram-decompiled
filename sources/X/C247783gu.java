package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3gu  reason: invalid class name and case insensitive filesystem */
public final class C247783gu extends C247793gv {
    public final int A00;
    public final Bitmap A01;
    public final ImageUrl A02;
    public final String A03;

    public C247783gu(Bitmap bitmap, ImageUrl imageUrl, String str, int i) {
        0qQ.A0B(str, 3);
        this.A01 = bitmap;
        this.A02 = imageUrl;
        this.A03 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247783gu) {
                C247783gu r5 = (C247783gu) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00;
    }
}
