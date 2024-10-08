package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class LES {
    public int A00 = 4;
    public final long A01;
    public final long A02;
    public final C313666go A03;
    public final Set A04 = DbS.A0y();
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final 05G A0T;
    public final 05G A0U;
    public final AnonymousClass0Ud A0V;
    public final AnonymousClass0Ud A0W;
    public final AnonymousClass0Ud A0X;
    public final AnonymousClass0Ud A0Y;
    public final AnonymousClass0Ud A0Z;
    public final AnonymousClass0Ud A0a;
    public final AnonymousClass0Ud A0b;
    public final AnonymousClass0Ud A0c;
    public final AnonymousClass0Ud A0d;
    public final AnonymousClass0Ud A0e;
    public final AnonymousClass0Ud A0f;
    public final AnonymousClass0Ud A0g;
    public final AnonymousClass0Ud A0h;
    public final AnonymousClass0Ud A0i;
    public final AnonymousClass0Ud A0j;
    public final AnonymousClass0Ud A0k;
    public final AnonymousClass0Ud A0l;
    public final AnonymousClass0Ud A0m;
    public final AnonymousClass0Ud A0n;
    public final AnonymousClass0Ud A0o;
    public final AnonymousClass0Ud A0p;
    public final AnonymousClass0Ud A0q;
    public final AnonymousClass0Ud A0r;
    public final AnonymousClass0Ud A0s;
    public final boolean A0t;
    public final 1Av A0u;
    public final AnonymousClass0Ud A0v;
    public final AnonymousClass0Ud A0w;

    public final void A00(Set set) {
        int i;
        0qQ.A0B(set, 0);
        this.A05.Epw(set);
        boolean z = true;
        AnonymousClass7TF.A1O(this.A0J, !set.isEmpty());
        05G r8 = this.A0B;
        05G r7 = this.A0A;
        boolean z2 = false;
        if (((long) JTR.A0I(r7)) >= this.A01) {
            z2 = true;
        }
        AnonymousClass7TF.A1O(r8, z2);
        05G r2 = this.A0I;
        int size = set.size();
        if (this.A0t) {
            i = JTR.A0I(r7);
        } else {
            i = 0;
        }
        if (size + i < this.A00 - 1) {
            z = false;
        }
        AnonymousClass7TF.A1O(r2, z);
        Set set2 = this.A04;
        ArrayList A0r2 = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DbY.A1W(A0r2, it);
        }
        set2.addAll(A0r2);
    }

    public LES(UserSession userSession, C313666go r9, long j, long j2, boolean z) {
        this.A03 = r9;
        this.A0t = z;
        this.A01 = j;
        this.A02 = j2;
        1Av A002 = 1Au.A00(userSession);
        this.A0u = A002;
        02z A10 = DbS.A10(C62515Kh5.UNKNOWN);
        this.A0U = A10;
        this.A0s = 10b.A03(A10);
        02z A102 = DbS.A10(C62491Kgh.NORMAL);
        this.A0T = A102;
        this.A0r = 10b.A03(A102);
        02z A103 = DbS.A10(C62635Kj6.UNKNOWN);
        this.A06 = A103;
        this.A0W = 10b.A03(A103);
        02z A104 = DbS.A10(false);
        this.A0G = A104;
        this.A0f = 10b.A03(A104);
        C313666go r3 = C313666go.BROADCASTER;
        boolean z2 = true;
        02z A0s2 = JTQ.A0s(C51969G9p.A1a(r9, r3));
        this.A0K = A0s2;
        this.A0j = 10b.A03(A0s2);
        02z A105 = DbS.A10(false);
        this.A0H = A105;
        this.A0g = 10b.A03(A105);
        02z A0s3 = JTQ.A0s(AnonymousClass7TF.A1W(r9, C313666go.GUEST));
        this.A0J = A0s3;
        this.A0i = 10b.A03(A0s3);
        02z A106 = DbS.A10(false);
        this.A0B = A106;
        this.A0a = 10b.A03(A106);
        02z A107 = DbS.A10(false);
        this.A0I = A107;
        this.A0h = 10b.A03(A107);
        02z A108 = DbS.A10(false);
        this.A0O = A108;
        this.A0w = 10b.A03(A108);
        0sl r1 = 0sl.A00;
        02z A012 = 106.A01(r1);
        this.A0A = A012;
        this.A0Z = 10b.A03(A012);
        02z A013 = 106.A01(r1);
        this.A05 = A013;
        this.A0V = 10b.A03(A013);
        02z A109 = DbS.A10(false);
        this.A0N = A109;
        this.A0m = 10b.A03(A109);
        02z A0s4 = JTQ.A0s((A002.A01.getInt("live_nux_tutorial_view_count", 0) == 0 && r9 == r3) ? z2 : false);
        this.A0M = A0s4;
        this.A0l = 10b.A03(A0s4);
        02z A0r2 = JTQ.A0r(0);
        this.A07 = A0r2;
        this.A0v = 10b.A03(A0r2);
        02z A1010 = DbS.A10(false);
        this.A0R = A1010;
        this.A0p = 10b.A03(A1010);
        02z A1011 = DbS.A10(false);
        this.A0S = A1011;
        this.A0q = 10b.A03(A1011);
        02z A1012 = DbS.A10(false);
        this.A0E = A1012;
        this.A0d = 10b.A03(A1012);
        02z A1013 = DbS.A10(false);
        this.A0L = A1013;
        this.A0k = 10b.A03(A1013);
        02z A1014 = DbS.A10(false);
        this.A0P = A1014;
        this.A0n = 10b.A03(A1014);
        02z A1015 = DbS.A10(false);
        this.A0C = A1015;
        this.A0b = 10b.A03(A1015);
        02z A1016 = DbS.A10(false);
        this.A0Q = A1016;
        this.A0o = 10b.A03(A1016);
        02z A1017 = DbS.A10(false);
        this.A08 = A1017;
        this.A0X = 10b.A03(A1017);
        02z A1018 = DbS.A10(false);
        this.A0F = A1018;
        this.A0e = 10b.A03(A1018);
        02z A1019 = DbS.A10(false);
        this.A09 = A1019;
        this.A0Y = 10b.A03(A1019);
        02z A1020 = DbS.A10(false);
        this.A0D = A1020;
        this.A0c = 10b.A03(A1020);
    }
}
