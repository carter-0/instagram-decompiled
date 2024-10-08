package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.N3f  reason: case insensitive filesystem */
public final class C68165N3f extends AnonymousClass0T0 {
    public DirectAnimatedMedia A00 = null;
    public ExtendedImageUrl A01 = null;
    public Boolean A02 = null;
    public Boolean A03 = null;
    public Long A04 = null;
    public String A05 = null;
    public String A06 = null;
    public String A07 = null;
    public String A08 = null;
    public String A09 = null;
    public String A0A = null;
    public String A0B = null;
    public String A0C = null;
    public String A0D = null;
    public final 1Xj A0E;
    public final DirectShareTarget A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;

    public C68165N3f(1Xj r2, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A1R(r2, str3);
        this.A0F = directShareTarget;
        this.A0I = str;
        this.A0H = str2;
        this.A0E = r2;
        this.A0J = str3;
        this.A0G = str4;
        this.A0K = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68165N3f) {
                C68165N3f n3f = (C68165N3f) obj;
                if (!0qQ.A0K(this.A0F, n3f.A0F) || !0qQ.A0K(this.A0I, n3f.A0I) || !0qQ.A0K(this.A0H, n3f.A0H) || !0qQ.A0K(this.A0E, n3f.A0E) || !0qQ.A0K(this.A0J, n3f.A0J) || !0qQ.A0K(this.A0G, n3f.A0G) || this.A0K != n3f.A0K || !0qQ.A0K(this.A0D, n3f.A0D) || !0qQ.A0K(this.A05, n3f.A05) || !0qQ.A0K(this.A00, n3f.A00) || !0qQ.A0K(this.A03, n3f.A03) || !0qQ.A0K(this.A04, n3f.A04) || !0qQ.A0K(this.A0A, n3f.A0A) || !0qQ.A0K(this.A08, n3f.A08) || !0qQ.A0K(this.A0B, n3f.A0B) || !0qQ.A0K(this.A07, n3f.A07) || !0qQ.A0K(this.A09, n3f.A09) || !0qQ.A0K(this.A01, n3f.A01) || !0qQ.A0K(this.A0C, n3f.A0C) || !0qQ.A0K(this.A06, n3f.A06) || !0qQ.A0K(this.A02, n3f.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C381429bk A00() {
        DirectShareTarget directShareTarget = this.A0F;
        String str = this.A0I;
        String str2 = this.A0H;
        1Xj r38 = this.A0E;
        String str3 = this.A0J;
        String str4 = this.A0G;
        boolean z = this.A0K;
        String str5 = this.A0D;
        String str6 = this.A05;
        DirectAnimatedMedia directAnimatedMedia = this.A00;
        Boolean bool = this.A03;
        Long l = this.A04;
        String str7 = this.A0A;
        String str8 = this.A08;
        String str9 = this.A0B;
        String str10 = this.A07;
        String str11 = this.A09;
        ExtendedImageUrl extendedImageUrl = this.A01;
        String str12 = this.A0C;
        String str13 = this.A06;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        return new C381429bk(r38, directShareTarget, directAnimatedMedia, extendedImageUrl, bool, this.A02, l, str, str14, str15, str16, str17, str18, str19, str20, str9, str10, str11, str12, str13, z);
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A08(this.A0G, AnonymousClass7TF.A08(this.A0J, AnonymousClass7TF.A07(this.A0E, AnonymousClass7TF.A08(this.A0H, AnonymousClass7TF.A08(this.A0I, AnonymousClass7TE.A0K(this.A0F))))))) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31 * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31 * 31) + AnonymousClass7TG.A0E(this.A06)) * 31 * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
