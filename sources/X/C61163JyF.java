package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JyF  reason: case insensitive filesystem */
public final class C61163JyF extends AnonymousClass0T0 implements C232262tL {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61163JyF) {
                C61163JyF jyF = (C61163JyF) obj;
                if (!0qQ.A0K(this.A01, jyF.A01) || !0qQ.A0K(this.A00, jyF.A00) || !0qQ.A0K(this.A02, jyF.A02) || !0qQ.A0K(this.A03, jyF.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01))) + AnonymousClass7TG.A0E(this.A03);
    }

    public C61163JyF(ImageUrl imageUrl, String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, imageUrl, str2);
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
