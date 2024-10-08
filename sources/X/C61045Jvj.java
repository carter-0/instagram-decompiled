package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.Jvj  reason: case insensitive filesystem */
public final class C61045Jvj extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61045Jvj(DirectThreadThemeInfo directThreadThemeInfo, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 1) != 0 ? null : directThreadThemeInfo, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61045Jvj) {
                    C61045Jvj jvj = (C61045Jvj) obj;
                    if (jvj.A00 == 0 && 0qQ.A0K(this.A03, jvj.A03) && 0qQ.A0K(this.A02, jvj.A02) && 0qQ.A0K(this.A04, jvj.A04) && 0qQ.A0K(this.A01, jvj.A01) && 0qQ.A0K(this.A06, jvj.A06) && 0qQ.A0K(this.A07, jvj.A07)) {
                        str = this.A05;
                        str2 = jvj.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61045Jvj) {
                    C61045Jvj jvj2 = (C61045Jvj) obj;
                    if (jvj2.A00 == 1 && 0qQ.A0K(this.A01, jvj2.A01) && 0qQ.A0K(this.A05, jvj2.A05) && 0qQ.A0K(this.A02, jvj2.A02) && 0qQ.A0K(this.A06, jvj2.A06) && 0qQ.A0K(this.A07, jvj2.A07) && 0qQ.A0K(this.A03, jvj2.A03)) {
                        str = this.A04;
                        str2 = jvj2.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61045Jvj) {
                    C61045Jvj jvj3 = (C61045Jvj) obj;
                    if (jvj3.A00 == 2 && 0qQ.A0K(this.A02, jvj3.A02) && 0qQ.A0K(this.A06, jvj3.A06) && 0qQ.A0K(this.A05, jvj3.A05) && this.A01 == jvj3.A01 && 0qQ.A0K(this.A03, jvj3.A03) && 0qQ.A0K(this.A04, jvj3.A04)) {
                        str = this.A07;
                        str2 = jvj3.A07;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08;
        String str;
        switch (this.A00) {
            case 0:
                return C41845B3m.A01(this.A05, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03)))))));
            case 1:
                A08 = (((((((AnonymousClass7TF.A08(this.A05, AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31;
                str = this.A04;
                break;
            default:
                A08 = ((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
                str = this.A07;
                break;
        }
        return A08 + C41845B3m.A00(str);
    }

    public final String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaNoticeUiState(mediaId=");
        A1A.append(this.A02);
        A1A.append(", noticeText=");
        A1A.append(this.A06);
        A1A.append(", noticeSubText=");
        A1A.append(this.A05);
        A1A.append(", noticeIcon=");
        A1A.append(this.A01);
        A1A.append(", noticeMediaId=");
        A1A.append(this.A03);
        A1A.append(", noticeRidgeMatchId=");
        A1A.append(this.A04);
        A1A.append(", noticeUrl=");
        return C51975G9x.A0i(this.A07, A1A);
    }

    public C61045Jvj(MediaNoticeIcon mediaNoticeIcon, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A01 = mediaNoticeIcon;
        this.A03 = str4;
        this.A04 = str5;
        this.A07 = str6;
    }

    public C61045Jvj(DirectThreadThemeInfo directThreadThemeInfo, String str, String str2, String str3, String str4, String str5, String str6) {
        0qQ.A0B(str, 2);
        this.A01 = directThreadThemeInfo;
        this.A05 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A04 = str6;
    }

    public C61045Jvj(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6) {
        C51974G9v.A0d(3, str3, imageUrl, str4, str5);
        0qQ.A0B(str6, 7);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = imageUrl;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
    }
}
