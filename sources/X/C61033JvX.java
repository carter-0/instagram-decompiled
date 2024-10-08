package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.JvX  reason: case insensitive filesystem */
public final class C61033JvX extends AnonymousClass0T0 {
    public final SimpleImageUrl A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61033JvX) {
                C61033JvX jvX = (C61033JvX) obj;
                if (!0qQ.A0K(this.A06, jvX.A06) || !0qQ.A0K(this.A05, jvX.A05) || !0qQ.A0K(this.A07, jvX.A07) || !0qQ.A0K(this.A00, jvX.A00) || !0qQ.A0K(this.A0A, jvX.A0A) || !0qQ.A0K(this.A03, jvX.A03) || !0qQ.A0K(this.A08, jvX.A08) || !0qQ.A0K(this.A09, jvX.A09) || !0qQ.A0K(this.A01, jvX.A01) || !0qQ.A0K(this.A04, jvX.A04) || !0qQ.A0K(this.A02, jvX.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C61033JvX jvX, Object obj, Object obj2, Collection collection, 05G r17) {
        ArrayList A0T = 00k.A0T(obj, collection);
        Integer num = jvX.A06;
        Integer num2 = jvX.A05;
        String str = jvX.A07;
        SimpleImageUrl simpleImageUrl = jvX.A00;
        List list = jvX.A0A;
        Boolean bool = jvX.A03;
        List list2 = jvX.A09;
        Boolean bool2 = jvX.A01;
        Integer num3 = jvX.A04;
        Boolean bool3 = jvX.A02;
        0qQ.A0B(A0T, 6);
        return r17.AIY(obj2, new C61033JvX(simpleImageUrl, bool, bool2, bool3, num, num2, num3, str, list, A0T, list2));
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A08, ((((((((((AnonymousClass7TG.A0C(this.A06) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C61033JvX(SimpleImageUrl simpleImageUrl, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, String str, List list, List list2, List list3) {
        this.A06 = num;
        this.A05 = num2;
        this.A07 = str;
        this.A00 = simpleImageUrl;
        this.A0A = list;
        this.A03 = bool;
        this.A08 = list2;
        this.A09 = list3;
        this.A01 = bool2;
        this.A04 = num3;
        this.A02 = bool3;
    }

    public C61033JvX() {
        this((SimpleImageUrl) null, (Boolean) null, (Boolean) null, AnonymousClass7TE.A0v(), (Integer) null, (Integer) null, (Integer) null, (String) null, (List) null, 0sn.A00, (List) null);
    }
}
