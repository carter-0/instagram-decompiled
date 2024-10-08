package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GNI implements C270754hF {
    public Context A00 = null;
    public C290515fR A01 = null;
    public final AnonymousClass9JG A02;
    public final C270694h9 A03;
    public final C54575HJk A04;
    public final C270654h5 A05;
    public final GF2 A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public GNI(AnonymousClass9JG r2, C270694h9 r3, C54575HJk hJk, C270654h5 r5, GF2 gf2, Integer num, String str, String str2) {
        this.A09 = str;
        this.A06 = gf2;
        this.A05 = r5;
        this.A08 = str2;
        this.A03 = r3;
        this.A04 = hJk;
        this.A07 = num;
        this.A02 = r2;
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass93Q r14 = AnonymousClass93Q.A00;
        String str2 = this.A09;
        GF2 gf2 = this.A06;
        if (gf2 != null) {
            str = gf2.A01();
        } else {
            str = null;
        }
        String A002 = this.A05.A00();
        String str3 = this.A08;
        C270694h9 r10 = this.A03;
        C290515fR r8 = this.A01;
        0Tu r3 = 0Tu.A05;
        String A003 = AnonymousClass93R.A00(182.A04(r3, userSession2, 36876370160320611L), String.valueOf(182.A06(r3, userSession2, 2342156429420464053L)), String.valueOf(182.A06(r3, userSession2, 2342156429420529590L)), 182.A04(r3, userSession2, 36876370160386148L), 182.A06(r3, userSession2, 2342156429420398516L));
        C54575HJk hJk = this.A04;
        String str4 = str3;
        return r14.A07(this.A00, this.A02, r10, userSession2, r8, hJk, this.A07, str2, (String) null, str, A002, str4, A003, (String) null, (String) null, (String) null, (C62320sa) null, -1.0d, false, false, false, z, true);
    }

    public final 1OC C42(UserSession userSession, String str) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass93Q r3 = AnonymousClass93Q.A00;
        String str3 = this.A09;
        GF2 gf2 = this.A06;
        if (gf2 != null) {
            str2 = gf2.A01();
        } else {
            str2 = null;
        }
        return r3.A07(this.A00, this.A02, this.A03, userSession2, this.A01, this.A04, this.A07, str3, str, str2, this.A05.A00(), this.A08, (String) null, (String) null, (String) null, (String) null, (C62320sa) null, -1.0d, false, false, false, false, false);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }

    public final void ESn(Context context) {
        this.A00 = context;
    }

    public final void Elk(C290515fR r1) {
        this.A01 = r1;
    }
}
