package X;

import com.instagram.api.schemas.AchievementButtonInfoImpl;
import java.util.List;

/* renamed from: X.BEt  reason: case insensitive filesystem */
public final class C42041BEt extends AnonymousClass0T0 implements DRB {
    public final AchievementButtonInfoImpl A00;
    public final AchievementButtonInfoImpl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42041BEt) {
                C42041BEt bEt = (C42041BEt) obj;
                if (!0qQ.A0K(this.A06, bEt.A06) || !0qQ.A0K(this.A02, bEt.A02) || !0qQ.A0K(this.A03, bEt.A03) || !0qQ.A0K(this.A00, bEt.A00) || !0qQ.A0K(this.A01, bEt.A01) || !0qQ.A0K(this.A04, bEt.A04) || !0qQ.A0K(this.A05, bEt.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A06);
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A08(this.A04, (((((AnonymousClass7TF.A08(this.A02, A0K) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public C42041BEt(AchievementButtonInfoImpl achievementButtonInfoImpl, AchievementButtonInfoImpl achievementButtonInfoImpl2, String str, String str2, String str3, String str4, List list) {
        AnonymousClass7TG.A1O(list, str);
        0qQ.A0B(str3, 6);
        0qQ.A0B(str4, 7);
        this.A06 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = achievementButtonInfoImpl;
        this.A01 = achievementButtonInfoImpl2;
        this.A04 = str3;
        this.A05 = str4;
    }
}
