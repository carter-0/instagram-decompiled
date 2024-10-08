package X;

import com.instagram.android.R;

/* renamed from: X.EGf  reason: case insensitive filesystem */
public final class C47768EGf extends AnonymousClass4AA {
    public final int A00 = R.drawable.instagram_crown_pano_filled_24;
    public final C266444Yx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47768EGf) {
                C47768EGf eGf = (C47768EGf) obj;
                if (this.A00 != eGf.A00 || !0qQ.A0K(this.A01, eGf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }

    public C47768EGf(C266444Yx r2) {
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
