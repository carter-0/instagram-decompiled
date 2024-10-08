package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.77A  reason: invalid class name */
public final class AnonymousClass77A extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final long A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77A) {
                AnonymousClass77A r8 = (AnonymousClass77A) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int hashCode2 = ((((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31;
        ImageUrl imageUrl = this.A01;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public AnonymousClass77A(ImageUrl imageUrl, String str, String str2, List list, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A04 = list;
        this.A01 = imageUrl;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
