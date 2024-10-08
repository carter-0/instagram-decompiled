package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import java.util.List;

/* renamed from: X.6pC  reason: invalid class name and case insensitive filesystem */
public final class C318586pC extends AnonymousClass0T0 {
    public final AvatarCoinFlipBackgroundOptionResponse A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C318586pC(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(list, 3);
        this.A04 = str;
        this.A05 = str2;
        this.A08 = list;
        this.A06 = str3;
        this.A00 = avatarCoinFlipBackgroundOptionResponse;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A07 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C318586pC) {
                C318586pC r5 = (C318586pC) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A08.hashCode()) * 31;
        String str3 = this.A06;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = this.A00;
        int hashCode4 = (hashCode3 + (avatarCoinFlipBackgroundOptionResponse == null ? 0 : avatarCoinFlipBackgroundOptionResponse.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.A07;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }
}
