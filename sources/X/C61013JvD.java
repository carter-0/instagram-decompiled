package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Set;

/* renamed from: X.JvD  reason: case insensitive filesystem */
public final class C61013JvD extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final QP7 A02;
    public final C277954w0 A03;
    public final LiveUserPaySupportTier A04;
    public final User A05;
    public final AnonymousClass3NV A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final Set A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final C278114wI A0O;
    public final List A0P;
    public final boolean A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61013JvD) {
                C61013JvD jvD = (C61013JvD) obj;
                if (!0qQ.A0K(this.A05, jvD.A05) || !0qQ.A0K(this.A0H, jvD.A0H) || !0qQ.A0K(this.A0E, jvD.A0E) || !0qQ.A0K(this.A0D, jvD.A0D) || this.A01 != jvD.A01 || this.A06 != jvD.A06 || this.A0K != jvD.A0K || this.A0M != jvD.A0M || this.A0Q != jvD.A0Q || !0qQ.A0K(this.A08, jvD.A08) || !0qQ.A0K(this.A09, jvD.A09) || this.A0O != jvD.A0O || !0qQ.A0K(this.A03, jvD.A03) || this.A04 != jvD.A04 || this.A00 != jvD.A00 || this.A0J != jvD.A0J || !0qQ.A0K(this.A0A, jvD.A0A) || !0qQ.A0K(this.A07, jvD.A07) || !0qQ.A0K(this.A0G, jvD.A0G) || !0qQ.A0K(this.A0C, jvD.A0C) || !0qQ.A0K(this.A0B, jvD.A0B) || !0qQ.A0K(this.A0F, jvD.A0F) || !0qQ.A0K(this.A0P, jvD.A0P) || this.A0N != jvD.A0N || this.A0L != jvD.A0L || this.A0I != jvD.A0I || !0qQ.A0K(this.A02, jvD.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static String A00(C61013JvD jvD) {
        return jvD.A05.getId();
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0H, AnonymousClass7TE.A0K(this.A05));
        int A082 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A07(this.A06, (((AnonymousClass7TF.A07(this.A0E, A072) + AnonymousClass7TG.A0E(this.A0D)) * 31) + this.A01) * 31)))));
        boolean z = this.A0J;
        List list = this.A0G;
        return AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A07(this.A0P, AnonymousClass7TF.A07(this.A0F, AnonymousClass7TF.A08(this.A0B, (AnonymousClass7TF.A07(list, (((AnonymousClass7TF.A09(z, (((((((AnonymousClass7TF.A08(this.A09, A082) + AnonymousClass7TG.A0C(this.A0O)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31)))))) + AnonymousClass7TE.A0L(this.A02);
    }

    public C61013JvD(QP7 qp7, C277954w0 r6, LiveUserPaySupportTier liveUserPaySupportTier, C278114wI r8, User user, AnonymousClass3NV r10, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, Set set, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Set set2 = set;
        List list5 = list;
        AnonymousClass7TG.A1U(user, set2, list5);
        0qQ.A0B(r10, 6);
        String str8 = str7;
        0qQ.A0B(str8, 21);
        this.A05 = user;
        this.A0H = set2;
        this.A0E = list5;
        this.A0D = str;
        this.A01 = i;
        this.A06 = r10;
        this.A0K = z;
        this.A0M = z2;
        this.A0Q = z3;
        this.A08 = str2;
        this.A09 = str3;
        this.A0O = r8;
        this.A03 = r6;
        this.A04 = liveUserPaySupportTier;
        this.A00 = i2;
        this.A0J = z4;
        this.A0A = str4;
        this.A07 = str5;
        this.A0G = list2;
        this.A0C = str6;
        this.A0B = str8;
        this.A0F = list3;
        this.A0P = list4;
        this.A0N = z5;
        this.A0L = z6;
        this.A0I = z7;
        this.A02 = qp7;
    }
}
