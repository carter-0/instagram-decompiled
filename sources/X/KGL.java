package X;

import com.instagram.common.typedurl.ImageUrl;

public final class KGL extends AnonymousClass4AA {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KGL kgl = (KGL) obj;
        0qQ.A0B(kgl, 0);
        if (0qQ.A0K(this.A02, kgl.A02) && this.A00 == kgl.A00 && this.A04 == kgl.A04) {
            return true;
        }
        return false;
    }

    public KGL(ImageUrl imageUrl, String str, String str2, int i, boolean z) {
        this.A01 = imageUrl;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = z;
    }
}
