package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.NYc  reason: case insensitive filesystem */
public final class C68818NYc extends AnonymousClass7FV implements AnonymousClass7FW {
    public final ImageUrl A00;
    public final AnonymousClass7FE A01;
    public final N3T A02;
    public final CharSequence A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final AnonymousClass7FT A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68818NYc(ImageUrl imageUrl, AnonymousClass7FT r3, AnonymousClass7FE r4, N3T n3t, CharSequence charSequence, String str, String str2, String str3, String str4, boolean z) {
        super(r3);
        0qQ.A0B(str, 3);
        AnonymousClass7TG.A1S(str3, str4);
        this.A02 = n3t;
        this.A00 = imageUrl;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = charSequence;
        this.A08 = z;
        this.A01 = r4;
        this.A09 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68818NYc) {
                C68818NYc nYc = (C68818NYc) obj;
                if (!0qQ.A0K(this.A02, nYc.A02) || !0qQ.A0K(this.A00, nYc.A00) || !0qQ.A0K(this.A04, nYc.A04) || !0qQ.A0K(this.A05, nYc.A05) || !0qQ.A0K(this.A06, nYc.A06) || !0qQ.A0K(this.A07, nYc.A07) || !0qQ.A0K(this.A03, nYc.A03) || this.A08 != nYc.A08 || !0qQ.A0K(this.A01, nYc.A01) || !0qQ.A0K(this.A09, nYc.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        return AnonymousClass7TE.A0N(this.A09, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, (AnonymousClass7TF.A08(str, ((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A05)) * 31))))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProductShareContentViewModel(imageFields=");
        A1A.append(this.A02);
        A1A.append(", merchantProfilePicUrl=");
        A1A.append(this.A00);
        A1A.append(", merchantUsername=");
        A1A.append(this.A04);
        A1A.append(C273654mx.A00(1103));
        A1A.append(this.A05);
        A1A.append(Pxd.A00(48));
        A1A.append(this.A06);
        A1A.append(", productName=");
        A1A.append(this.A07);
        A1A.append(", subtitle=");
        A1A.append(this.A03);
        A1A.append(", checkoutSignalingEnabled=");
        A1A.append(this.A08);
        A1A.append(", themeModel=");
        A1A.append(this.A01);
        A1A.append(", gestureDetectionModel=");
        return AnonymousClass7TG.A0n(this.A09, A1A);
    }
}
