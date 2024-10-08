package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.user.model.User;

/* renamed from: X.JVh  reason: case insensitive filesystem */
public final class C59723JVh extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C59723JVh(JV2 jv2, ImmutableMap immutableMap, AnonymousClass930 r4, String str, String str2, 0sP r7, AnonymousClass0r6 r8, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(immutableMap, 7);
        this.A07 = str;
        this.A06 = str2;
        this.A08 = z;
        this.A05 = r7;
        this.A04 = r8;
        this.A09 = z2;
        this.A02 = immutableMap;
        this.A03 = r4;
        this.A0A = z3;
        this.A01 = jv2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59723JVh)) {
                return false;
            }
            C59723JVh jVh = (C59723JVh) obj;
            if (jVh.A00 != 1 || !0qQ.A0K(this.A03, jVh.A03) || !0qQ.A0K(this.A06, jVh.A06) || !0qQ.A0K(this.A07, jVh.A07) || this.A09 != jVh.A09 || this.A08 != jVh.A08 || this.A0A != jVh.A0A || !0qQ.A0K(this.A05, jVh.A05) || !0qQ.A0K(this.A01, jVh.A01)) {
                return false;
            }
            obj2 = this.A04;
            obj3 = jVh.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C59723JVh)) {
                return false;
            }
            C59723JVh jVh2 = (C59723JVh) obj;
            if (jVh2.A00 != 0 || !0qQ.A0K(this.A07, jVh2.A07) || !0qQ.A0K(this.A06, jVh2.A06) || this.A08 != jVh2.A08 || !0qQ.A0K(this.A05, jVh2.A05) || !0qQ.A0K(this.A04, jVh2.A04) || this.A09 != jVh2.A09 || !0qQ.A0K(this.A02, jVh2.A02) || !0qQ.A0K(this.A03, jVh2.A03) || this.A0A != jVh2.A0A) {
                return false;
            }
            obj2 = this.A01;
            obj3 = jVh2.A01;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092;
        int A0L;
        if (this.A00 != 0) {
            A092 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31))))) * 31;
            A0L = AnonymousClass7TE.A0L(this.A04);
        } else {
            int A093 = AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A07))))));
            A092 = AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A07(this.A02, A093) + AnonymousClass7TG.A0C(this.A03)) * 31);
            A0L = AnonymousClass7TE.A0L(this.A01);
        }
        return A092 + A0L;
    }

    public C59723JVh(AnonymousClass0iw r3, User user, User user2, String str, String str2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(user, 1);
        this.A03 = user;
        this.A06 = str;
        this.A07 = str2;
        this.A09 = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A05 = user2;
        this.A01 = r3;
        this.A02 = null;
        this.A04 = null;
    }

    public C59723JVh(String str, String str2, 0sP r14, AnonymousClass0r6 r15, boolean z, boolean z2) {
        this((JV2) null, RegularImmutableMap.A02, (AnonymousClass930) null, str, str2, r14, r15, z, z2, false);
    }
}
