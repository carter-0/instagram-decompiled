package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.N3w  reason: case insensitive filesystem */
public final class C68181N3w extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public C68181N3w(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, 1Xj r6, C8944RGm rGm, C10310Rq8 rq8, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0qQ.A0B(rq8, 12);
        this.A04 = userSession;
        this.A0B = str;
        this.A09 = str2;
        this.A02 = fragmentActivity;
        this.A05 = r4;
        this.A0D = str3;
        this.A08 = str4;
        this.A0E = str5;
        this.A03 = r6;
        this.A0C = str6;
        this.A0A = str7;
        this.A06 = rq8;
        this.A07 = rGm;
        this.A01 = bundle;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C68181N3w)) {
                return false;
            }
            C68181N3w n3w = (C68181N3w) obj;
            if (n3w.A00 != 1 || !0qQ.A0K(this.A05, n3w.A05) || !0qQ.A0K(this.A06, n3w.A06) || !0qQ.A0K(this.A07, n3w.A07) || !0qQ.A0K(this.A08, n3w.A08) || !0qQ.A0K(this.A09, n3w.A09) || !0qQ.A0K(this.A0A, n3w.A0A) || !0qQ.A0K(this.A0B, n3w.A0B) || !0qQ.A0K(this.A01, n3w.A01) || !0qQ.A0K(this.A02, n3w.A02) || !0qQ.A0K(this.A03, n3w.A03) || !0qQ.A0K(this.A0C, n3w.A0C) || !0qQ.A0K(this.A0D, n3w.A0D) || !0qQ.A0K(this.A0E, n3w.A0E)) {
                return false;
            }
            obj2 = this.A04;
            obj3 = n3w.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C68181N3w)) {
                return false;
            }
            C68181N3w n3w2 = (C68181N3w) obj;
            if (n3w2.A00 != 0 || !0qQ.A0K(this.A04, n3w2.A04) || !0qQ.A0K(this.A0B, n3w2.A0B) || !0qQ.A0K(this.A09, n3w2.A09) || !0qQ.A0K(this.A02, n3w2.A02) || !0qQ.A0K(this.A05, n3w2.A05) || !0qQ.A0K(this.A0D, n3w2.A0D) || !0qQ.A0K(this.A08, n3w2.A08) || !0qQ.A0K(this.A0E, n3w2.A0E) || !0qQ.A0K(this.A03, n3w2.A03) || !0qQ.A0K(this.A0C, n3w2.A0C) || !0qQ.A0K(this.A0A, n3w2.A0A) || !0qQ.A0K(this.A06, n3w2.A06) || this.A07 != n3w2.A07) {
                return false;
            }
            obj2 = this.A01;
            obj3 = n3w2.A01;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072;
        Object obj;
        if (this.A00 != 0) {
            A072 = ((((((((((((((((((((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31;
            obj = this.A04;
        } else {
            int A073 = AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TE.A0K(this.A04)))));
            A072 = AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A08(this.A0C, (((((AnonymousClass7TF.A08(this.A0D, A073) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31))));
            obj = this.A01;
        }
        return A072 + AnonymousClass7TE.A0L(obj);
    }

    public C68181N3w(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4) {
        this.A05 = list;
        this.A06 = list2;
        this.A07 = list3;
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A0C = str5;
        this.A0D = str6;
        this.A0E = str7;
        this.A04 = list4;
    }
}
