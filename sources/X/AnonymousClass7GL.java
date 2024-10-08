package X;

import android.content.Context;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.7GL  reason: invalid class name */
public final class AnonymousClass7GL {
    public static final AnonymousClass7GK A00(UserSession userSession, 2Er r9) {
        AnonymousClass7GM r1;
        0qQ.A0B(userSession, 1);
        2Er r2 = r9;
        if (r9 == null) {
            r1 = AnonymousClass7GM.THREAD;
        } else if (r9.CcG() || r9.CUG() || r9.Car() || !C272094k5.A05(userSession)) {
            r1 = AnonymousClass7GM.PERMISSIONS;
        } else {
            r1 = AnonymousClass7GM.PERMISSIONS_THREAD;
        }
        return new AnonymousClass7GK(r1, r2, (String) null, (String) null, (String) null, (String) null, 0, 0);
    }

    public final AnonymousClass7GK A03(Context context, UserSession userSession, C242373Tu r21, 2Er r22) {
        AnonymousClass7GM r9;
        Integer Bjj;
        DirectThreadKey A04;
        AnonymousClass3U9 A03;
        User BZK;
        C254703su BLG;
        DirectThreadKey A042;
        AnonymousClass3U9 A032;
        User BZK2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        2Er r10 = r22;
        if (r22 != null) {
            if (!(r10.BJz() instanceof MsysThreadId) || !182.A06(0Tu.A05, userSession2, 36313166803765041L) || !(0eE.A00(userSession2).A00().A0J() == 16V.A05 || 0eE.A00(userSession2).A00().A0J() == 16V.A06 || ((!r10.BRZ().isEmpty()) && ((User) r10.BRZ().get(0)).A2L()))) {
                if (C66641MaA.A00(r10)) {
                    r9 = AnonymousClass7GM.BLOCKED;
                } else if (r10.BHS() == 7) {
                    r9 = AnonymousClass7GM.BROADCAST_CHAT_LIMITED;
                } else if (r10.BHS() == 10) {
                    r9 = AnonymousClass7GM.SOCIAL_CHAT_LIMITED;
                } else if (r10.CVr() && r10.Cez()) {
                    r9 = AnonymousClass7GM.XAC_READ_ONLY;
                } else if (!A02(userSession2, r10)) {
                    r9 = AnonymousClass7GM.DISABLED;
                } else {
                    BizUserInboxState A00 = C242003Sf.A00(String.valueOf(AnonymousClass4k9.A00(userSession2).A02()));
                    if (AnonymousClass78K.A00(userSession2) && r10.C66() == 1 && A00 == BizUserInboxState.GENERAL_FOLDER_THROTTLED) {
                        r9 = AnonymousClass7GM.PROFESSIONAL_HMPS_LIMITED;
                    } else {
                        if (!r10.CUG() && (!r10.BRZ().isEmpty()) && (Bjj = ((User) r10.BRZ().get(0)).Bjj()) != null && Bjj.intValue() == 6) {
                            C254743sy BJz = r10.BJz();
                            if (!(BJz instanceof DirectThreadKey) || (A042 = C66647MaG.A04(BJz)) == null || (A032 = 2Dr.A03(2L2.A00(userSession2), A042)) == null || (BZK2 = A032.BZK()) == null || !BZK2.A2A() || !182.A06(0Tu.A05, userSession2, 36323341581364321L)) {
                                C254743sy BJz2 = r10.BJz();
                                if ((!(BJz2 instanceof DirectThreadKey) || (A04 = C66647MaG.A04(BJz2)) == null || (A03 = 2Dr.A03(2L2.A00(userSession2), A04)) == null || (BZK = A03.BZK()) == null || (BLG = A03.BLG()) == null || !0qQ.A0K(BLG.A1u, BZK.getId()) || !182.A06(0Tu.A05, userSession2, 36323341581495394L)) && 182.A06(0Tu.A05, userSession2, 36323341581167712L)) {
                                    r9 = AnonymousClass7GM.REACHABILITY_COMPOSER_BLOCK;
                                }
                            }
                        }
                        C314836iv r4 = new C314836iv(userSession2, context);
                        0Tu r2 = 0Tu.A05;
                        if (182.A06(r2, userSession2, 36318015821911803L) && r4.A00()) {
                            r9 = AnonymousClass7GM.DISABLED_OLD_BUILDS;
                        } else if ((r10.Axj() || r10.CVE()) && !ADD.A08.A00(userSession2, r21, r10).A03) {
                            r9 = AnonymousClass7GM.EPHEMERAL_MODE_DISABLED_COMPOSER;
                        } else if (r10.BHS() != -1) {
                            User BZK3 = r10.BZK();
                            if (BZK3 != null && BZK3.A1X()) {
                                1Av A002 = 1Au.A00(userSession2);
                                0qQ.A0B("meta_ai_in_thread_blocking_nux", 0);
                                if (!A002.A01.getBoolean("meta_ai_in_thread_blocking_nux", false) && 182.A06(r2, userSession2, 36320438185632202L)) {
                                    r9 = AnonymousClass7GM.META_AI_NUX_COMPOSER_BLOCK;
                                }
                            }
                            User BZK4 = r10.BZK();
                            if (BZK4 != null) {
                                boolean z = 1Au.A00(userSession2).A01.getBoolean(002.A0u("reachable_user_composer_block_dismissed/userid/", BZK4.getId(), "/type/", String.valueOf(9)), false);
                                if (!r10.CUG() && !z && !BZK4.CPV()) {
                                    Iterator it = r10.BRZ().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Integer Bjj2 = ((AnonymousClass173) it.next()).Bjj();
                                        if (Bjj2 != null && Bjj2.intValue() == 9) {
                                            if (182.A06(r2, userSession2, 36330561421198006L)) {
                                                r9 = AnonymousClass7GM.REACHABLE_USER_COMPOSER_BLOCK;
                                            }
                                        }
                                    }
                                }
                            }
                            r9 = AnonymousClass7GM.THREAD;
                        }
                    }
                }
                return new AnonymousClass7GK(r9, r10, (String) null, (String) null, (String) null, (String) null, 0, 0);
            }
            r9 = AnonymousClass7GM.ARMADILLO_PROFESSIONAL_FEATURE_LIMITED;
            return new AnonymousClass7GK(r9, r10, (String) null, (String) null, (String) null, (String) null, 0, 0);
        }
        r9 = AnonymousClass7GM.NULL_THREAD_LIMITED;
        return new AnonymousClass7GK(r9, r10, (String) null, (String) null, (String) null, (String) null, 0, 0);
    }

    public final boolean A04(UserSession userSession, 2Er r5, long j) {
        0qQ.A0B(userSession, 2);
        if (j > 0 || !A02(userSession, r5)) {
            return false;
        }
        return true;
    }

    public static final AnonymousClass7GK A01(2Er r9, String str) {
        String str2;
        AnonymousClass7GM r1 = AnonymousClass7GM.LIGHTWEIGHT_INTERVENTION_AND_APPEAL_COMPOSER_BLOCK;
        2Er r2 = r9;
        if (r9 != null) {
            str2 = r9.C6C();
        } else {
            str2 = null;
        }
        return new AnonymousClass7GK(r1, r2, (String) null, (String) null, str, str2, 0, 0);
    }

    public static final boolean A02(UserSession userSession, 2Er r2) {
        if (C66641MaA.A00(r2) || AnonymousClass7LU.A00(userSession, r2) || C377809Ni.A00(r2) || C377819Nj.A04(userSession, r2) || C377829Nk.A00(userSession, r2) || AnonymousClass7LV.A00.A01(userSession, r2) || r2.BHS() != 0) {
            return false;
        }
        return true;
    }
}
