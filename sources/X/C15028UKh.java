package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.UKh  reason: case insensitive filesystem */
public final class C15028UKh extends AnonymousClass0T0 {
    public final C263944Ny A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Map A08;

    public C15028UKh(C263944Ny r2, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, List list, Map map) {
        DbW.A1O(r2, 4, str);
        this.A03 = l;
        this.A07 = list;
        this.A08 = map;
        this.A00 = r2;
        this.A02 = bool;
        this.A04 = str;
        this.A06 = str2;
        this.A01 = bool2;
        this.A05 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15028UKh) {
                C15028UKh uKh = (C15028UKh) obj;
                if (!0qQ.A0K(this.A03, uKh.A03) || !0qQ.A0K(this.A07, uKh.A07) || !0qQ.A0K(this.A08, uKh.A08) || !0qQ.A0K(this.A00, uKh.A00) || !0qQ.A0K(this.A02, uKh.A02) || !0qQ.A0K(this.A04, uKh.A04) || !0qQ.A0K(this.A06, uKh.A06) || !0qQ.A0K(this.A01, uKh.A01) || !0qQ.A0K(this.A05, uKh.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C263944Ny r0 = this.A00;
        String str = this.A04;
        return C41845B3m.A01(this.A05, (((AnonymousClass7TF.A08(str, (AnonymousClass7TF.A07(r0, ((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }
}
