package X;

import com.instagram.android.R;

/* renamed from: X.DtT  reason: case insensitive filesystem */
public final class C47242DtT extends AnonymousClass0T0 implements C232262tL {
    public final int A00 = R.drawable.instagram_user_following_pano_outline_24;
    public final Eu0 A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47242DtT) {
                C47242DtT dtT = (C47242DtT) obj;
                if (this.A00 != dtT.A00 || !0qQ.A0K(this.A03, dtT.A03) || !0qQ.A0K(this.A02, dtT.A02) || !0qQ.A0K(this.A01, dtT.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A03, this.A00 * 31))) + C54732HQn.A00();
    }

    public C47242DtT(Eu0 eu0, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = eu0;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TF.A0h(this);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
