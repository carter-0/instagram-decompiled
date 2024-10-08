package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5tv  reason: invalid class name and case insensitive filesystem */
public final class C298725tv extends AnonymousClass0T0 implements C298735tw {
    public final Hashtag A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C298725tv) {
                C298725tv r5 = (C298725tv) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Hashtag hashtag = this.A00;
        int hashCode2 = (hashCode + (hashtag == null ? 0 : hashtag.hashCode())) * 31;
        List list = this.A06;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.A07;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        User user = this.A01;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode7 + i;
    }

    public C298725tv(Hashtag hashtag, User user, String str, String str2, String str3, String str4, List list, List list2) {
        this.A02 = str;
        this.A00 = hashtag;
        this.A06 = list;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A07 = list2;
        this.A01 = user;
    }
}
