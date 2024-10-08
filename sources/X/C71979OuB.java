package X;

import com.instagram.user.model.User;

/* renamed from: X.OuB  reason: case insensitive filesystem */
public final class C71979OuB implements C232262tL {
    public final int A00;
    public final C61065Jw3 A01;
    public final N37 A02;
    public final User A03;
    public final Float A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C71979OuB(C61065Jw3 jw3, N37 n37, User user, Float f, Integer num, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        0qQ.A0B(str, 1);
        this.A06 = str;
        this.A03 = user;
        this.A07 = str2;
        this.A02 = n37;
        this.A01 = jw3;
        this.A04 = f;
        this.A05 = num;
        this.A00 = i;
        this.A09 = z;
        this.A0D = z2;
        this.A08 = z3;
        this.A0A = z4;
        this.A0B = z5;
        this.A0E = z6;
        this.A0C = z7;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C71979OuB ouB = (C71979OuB) obj;
        0qQ.A0B(ouB, 0);
        if (0qQ.A0K(this.A06, ouB.A06)) {
            User user = this.A03;
            String str2 = null;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            } else {
                str = null;
            }
            User user2 = ouB.A03;
            if (user2 != null) {
                str2 = AnonymousClass3ZA.A00(user2);
            }
            if (0qQ.A0K(str, str2) && 0qQ.A0K(this.A07, ouB.A07) && 0qQ.A0K(this.A02, ouB.A02) && 0qQ.A0K(this.A05, ouB.A05) && this.A00 == ouB.A00 && this.A0D == ouB.A0D && this.A08 == ouB.A08 && this.A0A == ouB.A0A && this.A0B == ouB.A0B) {
                return true;
            }
            return false;
        }
        return false;
    }
}
