package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JyM  reason: case insensitive filesystem */
public final class C61170JyM extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImageUrl A03;
    public final C270194gL A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61170JyM) {
                C61170JyM jyM = (C61170JyM) obj;
                if (!0qQ.A0K(this.A05, jyM.A05) || this.A02 != jyM.A02 || !0qQ.A0K(this.A06, jyM.A06) || this.A08 != jyM.A08 || !0qQ.A0K(this.A07, jyM.A07) || this.A01 != jyM.A01 || !0qQ.A0K(this.A03, jyM.A03) || !0qQ.A0K(this.A04, jyM.A04) || this.A00 != jyM.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, (AnonymousClass7TE.A0O(this.A05) + this.A02) * 31);
        return AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, (((AnonymousClass7TF.A09(this.A08, A082) + AnonymousClass7TG.A0E(this.A07)) * 31) + this.A01) * 31)) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        String str2;
        C61170JyM jyM = (C61170JyM) obj;
        String str3 = this.A05;
        ImageUrl imageUrl = null;
        if (jyM != null) {
            str = jyM.A05;
        } else {
            str = null;
        }
        if (0qQ.A0K(str3, str)) {
            String str4 = this.A06;
            if (jyM != null) {
                str2 = jyM.A06;
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str4, str2)) {
                ImageUrl imageUrl2 = this.A03;
                if (jyM != null) {
                    imageUrl = jyM.A03;
                }
                if (!0qQ.A0K(imageUrl2, imageUrl)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C61170JyM(ImageUrl imageUrl, C270194gL r2, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A02 = i;
        this.A06 = str2;
        this.A08 = z;
        this.A07 = str3;
        this.A01 = i2;
        this.A03 = imageUrl;
        this.A04 = r2;
        this.A00 = i3;
    }
}
