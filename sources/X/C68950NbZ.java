package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NbZ  reason: case insensitive filesystem */
public abstract class C68950NbZ extends C327577Bi {
    public final C327607Bl A00;
    public final C327607Bl A01;

    public final boolean A03(AnonymousClass9J6 r5) {
        C327607Bl r3;
        if (!super.A03(r5)) {
            return false;
        }
        if (A00(r5.A00)) {
            r3 = this.A01;
        } else {
            r3 = this.A00;
        }
        return r3.A04(r5.A01, System.currentTimeMillis());
    }

    public static final boolean A00(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode != -672464592) {
            if (hashCode == -420332607) {
                str2 = "direct_v2_reel_reaction";
            } else if (hashCode != 713969956) {
                return false;
            } else {
                str2 = "direct_v2_like";
            }
            if (!str.equals(str2)) {
                return false;
            }
            return true;
        } else if (str.equals("direct_v2_user_reaction")) {
            return true;
        } else {
            return false;
        }
    }

    public final void A01(AnonymousClass9J6 r5) {
        C327607Bl r3;
        if (A00(r5.A00)) {
            r3 = this.A01;
        } else {
            r3 = this.A00;
        }
        r3.A03(r5.A01, System.currentTimeMillis());
    }

    public final void A02(AnonymousClass9J6 r3) {
        C327607Bl r0 = this.A00;
        String str = r3.A01;
        r0.A02(str);
        this.A01.A02(str);
    }

    public C68950NbZ(UserSession userSession, C327607Bl r2, C327607Bl r3) {
        super(userSession);
        this.A01 = r2;
        this.A00 = r3;
    }
}
