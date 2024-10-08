package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.9cu  reason: invalid class name and case insensitive filesystem */
public final class C381989cu extends AnonymousClass0T0 implements B3Z, B3a {
    public final AnonymousClass8JL A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final MusicAttributionConfig A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381989cu) {
                C381989cu r5 = (C381989cu) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B00() {
        return this.A05;
    }

    public final String B01() {
        return this.A06;
    }

    public final String B05() {
        return this.A08;
    }

    public final Boolean B0E() {
        return this.A04;
    }

    public final ImageUrl B0H() {
        return this.A01;
    }

    public final MusicAttributionConfig BUm() {
        return this.A03;
    }

    public final AnonymousClass8JL C2k() {
        return this.A00;
    }

    public final ImageUrl C73() {
        return this.A02;
    }

    public final String getEffectId() {
        return this.A07;
    }

    public final int hashCode() {
        int i = 0;
        int A082 = (((((AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0K(this.A03)) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, (A082 + i) * 31)));
    }

    public C381989cu(AnonymousClass8JL r1, ImageUrl imageUrl, ImageUrl imageUrl2, MusicAttributionConfig musicAttributionConfig, Boolean bool, String str, String str2, String str3, String str4) {
        this.A03 = musicAttributionConfig;
        this.A07 = str;
        this.A05 = str2;
        this.A04 = bool;
        this.A08 = str3;
        this.A06 = str4;
        this.A01 = imageUrl;
        this.A00 = r1;
        this.A02 = imageUrl2;
    }
}
