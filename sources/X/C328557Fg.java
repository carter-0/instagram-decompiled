package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7Fg  reason: invalid class name and case insensitive filesystem */
public final class C328557Fg extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final ImageUrl A00;
    public final C328547Ff A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328557Fg) {
                C328557Fg r5 = (C328557Fg) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        int hashCode;
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode2 + i;
    }

    public C328557Fg(ImageUrl imageUrl, C328547Ff r2, boolean z) {
        this.A00 = imageUrl;
        this.A01 = r2;
        this.A02 = z;
    }
}
