package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.9bw  reason: invalid class name and case insensitive filesystem */
public final class C381549bw extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final ImageInfo A04;
    public final String A05;
    public final List A06;

    public C381549bw(ImageInfo imageInfo, String str, List list, float f, int i, int i2, int i3) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A04 = imageInfo;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = f;
        this.A06 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381549bw) {
                C381549bw r5 = (C381549bw) obj;
                if (!(0qQ.A0K(this.A05, r5.A05) && 0qQ.A0K(this.A04, r5.A04) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03 && Float.compare(this.A00, r5.A00) == 0 && 0qQ.A0K(this.A06, r5.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00((((((((AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31, this.A00) + AnonymousClass7TE.A0L(this.A06);
    }
}
