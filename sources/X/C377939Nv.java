package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Nv  reason: invalid class name and case insensitive filesystem */
public final class C377939Nv extends C392289uY {
    public C39761A8b A00;
    public C70619ODq A01;
    public AnonymousClass2Ep A02;
    public boolean A03;
    public final 1wn A04 = new C370968xM(this);
    public final UserSession A05;
    public final AnonymousClass91K A06 = new C370958xL(this);
    public final AnonymousClass4kA A07;

    public C377939Nv(UserSession userSession, AnonymousClass4kA r3) {
        0qQ.A0B(r3, 2);
        this.A05 = userSession;
        this.A07 = r3;
    }

    public final boolean A08(AnonymousClass2Ep r8, boolean z) {
        String C6C;
        if (r8 == null || (C6C = r8.C6C()) == null || !r8.Cbs()) {
            return false;
        }
        0xa r2 = this.A07.A00;
        boolean z2 = false;
        if (r2.contains("preference_direct_shh_mode_replay_existing_shh_user")) {
            z2 = r2.getBoolean("preference_direct_shh_mode_replay_existing_shh_user", false);
        } else {
            if (r2.getInt(C273654mx.A00(2272), 0) > 0) {
                z2 = true;
            }
            0xY AR4 = r2.AR4();
            AR4.E5T("preference_direct_shh_mode_replay_existing_shh_user", z2);
            AR4.apply();
        }
        if (z2) {
            return z || (r2.getInt("direct_shh_mode_replay_banner_seen_count", 0) < 2 && r2.getInt(002.A0R("direct_shh_mode_replay_banner_seen_count_", C6C), 0) < 1);
        }
        return false;
    }
}
