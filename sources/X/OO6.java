package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OO6 {
    public final Context A00;
    public final C3024563j A01;
    public final C67346MmN A02;
    public final 1aU A03;
    public final UserSession A04;
    public final NUG A05;
    public final NUV A06;
    public final Integer A07;
    public final AnonymousClass0eM A08 = C73904Plf.A00(this, 0eO.A02, 5);
    public final 1aU A09;

    public final C71087ObS A00(Context context) {
        try {
            if (this.A02.A00(context)) {
                C3024563j r2 = this.A01;
                C71087ObS.A00().A05(false);
                return r2.A00.A03();
            }
        } catch (RuntimeException unused) {
        }
        C71087ObS A002 = C71087ObS.A00();
        A002.A05(false);
        return A002;
    }

    public final 1aU A01(1a8 r4) {
        0qQ.A0B(r4, 0);
        return C72168Oxd.A00(this.A09, r4, new C74193PqZ(this, 29), 3);
    }

    public final 1aU A03(1a8 r3, UserSession userSession) {
        0qQ.A0B(r3, 1);
        if (!this.A02.A00(this.A00)) {
            return 1aU.A09(C68712NTy.A00);
        }
        return C72168Oxd.A00(r3, userSession, this, 2);
    }

    public final 1aU A02(1a8 r4) {
        return C72168Oxd.A00(this.A09, r4, new C74193PqZ(this, 30), 3);
    }

    public final 1aU A04(1a8 r4, Integer num) {
        String str;
        if (!this.A02.A00(this.A00)) {
            return 1aU.A09(C68704NTq.A00);
        }
        NUV nuv = this.A06;
        nuv.A09();
        if (num == AnonymousClass05K.A00) {
            str = "YES";
        } else {
            str = "NO";
        }
        nuv.A0D("IS_V3_IMPLICIT_BACKUP", str);
        nuv.A0D("CALLSITE", C69892Ntu.A00(num));
        return 1aU.A06(new C72169Oxe(r4, this, 3));
    }

    public OO6(Context context, C3024563j r4, C67346MmN mmN, 1aU r6, UserSession userSession, NUG nug, NUV nuv, Integer num) {
        this.A01 = r4;
        this.A04 = userSession;
        this.A07 = num;
        this.A02 = mmN;
        this.A06 = nuv;
        this.A05 = nug;
        this.A03 = r6;
        this.A00 = context;
        this.A09 = r6.A0L(C72070Ovj.A00);
    }

    public final 1aU A05(1a8 r5, String str) {
        return C72168Oxd.A00(this.A09, r5, new C73948PmS(this, str, 2, DbW.A1X(str)), 3);
    }
}
