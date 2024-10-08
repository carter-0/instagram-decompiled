package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.33j  reason: invalid class name and case insensitive filesystem */
public final class C2363433j implements C2363233h {
    public final AnonymousClass4DU A00;
    public final UserSession A01;
    public final C2363233h A02;
    public final AnonymousClass2rI A03;
    public final 1Ux A04;
    public final C249763kK A05;
    public final C227802jw A06;

    public C2363433j(UserSession userSession, AnonymousClass4DU r3, C2363233h r4, AnonymousClass2rI r5, 1Ux r6, C249763kK r7, C227802jw r8) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r5, 5);
        this.A02 = r4;
        this.A01 = userSession;
        this.A00 = r3;
        this.A06 = r8;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
    }

    public final void DkW(1Xj r28, AnonymousClass3W1 r29, String str, boolean z, boolean z2) {
        0xF r7;
        String str2;
        AnonymousClass3W1 r10 = r29;
        0qQ.A0B(r10, 1);
        String str3 = r10.A1V;
        if (str3 == null) {
            str3 = AnonymousClass000.A00(1804);
        }
        AnonymousClass4DU r6 = this.A00;
        1Xj r9 = r28;
        if (r6 instanceof C232682uF) {
            r7 = ((C232682uF) r6).E4l(r9).A00();
        } else {
            r7 = null;
        }
        AnonymousClass3WA r5 = r10.A0m;
        int ordinal = r5.ordinal();
        if (ordinal != 12) {
            String str4 = null;
            if (ordinal == 3) {
                String str5 = r10.A1H;
                if (str5 != null) {
                    UserSession userSession = this.A01;
                    String str6 = r10.A1G;
                    C249763kK r2 = this.A05;
                    if (r2 != null) {
                        str2 = r2.getSessionId();
                    } else {
                        str2 = null;
                    }
                    I7O.A05(r6, r7, userSession, r9, r10, str3, str5, str6, str2, (String) null, (String) null, r9.A0C.getLoggingInfoToken(), r10.getPosition(), r10.A2a);
                    r10.A1H = null;
                    r10.A1G = null;
                }
            } else if (ordinal != 15) {
                if (ordinal == 20) {
                    0wc A012 = AnonymousClass0kN.A01(r6, this.A01);
                    0Aj A002 = A012.A00(A012.A00, AnonymousClass000.A00(1075));
                    if (A002.isSampled()) {
                        A002.A8M(HON.X_OUT_UNDO_CLICK, "event_type");
                        String C9L = r9.C9L();
                        if (C9L == null) {
                            C9L = "";
                        }
                        A002.AAJ("ad_client_token", C9L);
                        A002.Cgf();
                    }
                }
            }
            UserSession userSession2 = this.A01;
            C249763kK r22 = this.A05;
            if (r22 != null) {
                str4 = r22.getSessionId();
            }
            I7O.A03(r6, r7, userSession2, r9, r5, r10, str3, str4, r9.A0C.getLoggingInfoToken(), r10.getPosition(), r10.A2a);
        } else {
            0xF A003 = C18766W0k.A00(r9.A0C.B6n());
            int i = r10.A0W;
            if (i >= 0) {
                0xF.A00(A003, Integer.valueOf(i), "recs_ix");
            }
            UserSession userSession3 = this.A01;
            1NY r4 = new 1NY(userSession3, -2);
            r4.A04();
            r4.A0A("feed/unhide_feed_post/");
            r4.A9m("m_pk", r9.getId());
            User A2A = r9.A2A(userSession3);
            if (A2A != null) {
                r4.A9m("a_pk", A2A.getId());
                r4.A0O((15p) null, 1XP.class, 1XY.class, false);
                1ES.A03(r4.A0M());
                FragmentActivity requireActivity = this.A06.requireActivity();
                User A2A2 = r9.A2A(userSession3);
                if (A2A2 != null) {
                    FH6.A01(requireActivity, A003, (1P0) null, userSession3, r9, r10, A2A2, (String) null);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A02.DkW(r9, r10, str, z, false);
    }

    public final void E0t(Integer num) {
        0qQ.A0B(num, 0);
        this.A02.E0t(num);
    }

    public final void EuH(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r3, 1);
        this.A02.EuH(r2, r3);
    }

    public final void EuJ(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r3, 1);
        this.A02.EuJ(r2, r3);
    }

    public final void Ev8(1Xj r2, AnonymousClass3W1 r3, C16677UzD uzD, String str) {
        0qQ.A0B(uzD, 3);
        this.A02.Ev8(r2, r3, uzD, str);
    }

    public final void EvA(1Xj r7, C53157GjT gjT, AnonymousClass3W1 r9, C16677UzD uzD, String str) {
        0qQ.A0B(r9, 1);
        0qQ.A0B(uzD, 3);
        this.A02.EvA(r7, gjT, r9, uzD, str);
    }

    public final void FIU(DHK dhk, C57247IUi iUi) {
        0qQ.A0B(dhk, 0);
        0qQ.A0B(iUi, 1);
        this.A02.FIU(dhk, iUi);
    }

    public final void FIV(C274594oe r2, AnonymousClass5O4 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A02.FIV(r2, r3);
    }

    public final void Cfd(1Xj r2, String str) {
        this.A02.Cfd(r2, str);
    }

    public final void D9c(1Xj r2) {
        this.A02.D9c(r2);
    }

    public final void Ds5(1UQ r25, 1Xj r26, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str7;
        0xF r13;
        String str8 = str6;
        String str9 = str;
        0qQ.A0B(str9, 1);
        1Xj r2 = r26;
        String str10 = str3;
        String str11 = str4;
        int i3 = i2;
        boolean z4 = z;
        if (!z || r26 == null) {
            this.A02.Ds5(r25, r2, str9, str2, str10, str11, str5, str8, i, i3, z4, z2, z3);
            return;
        }
        UserSession userSession = this.A01;
        AnonymousClass4DU r12 = this.A00;
        AnonymousClass3W1 BQr = this.A03.A0S.BQr(r2);
        if (str6 == null) {
            str8 = AnonymousClass000.A00(1804);
        }
        C249763kK r0 = this.A05;
        if (r0 != null) {
            str7 = r0.getSessionId();
        } else {
            str7 = null;
        }
        if (r12 instanceof C232682uF) {
            r13 = ((C232682uF) r12).E4l(r2).A00();
        } else {
            r13 = null;
        }
        I7O.A04(r12, r13, userSession, r2, BQr, str8, str7, str10, str11, (String) null, i3, z4);
    }

    public final void E12(1Xj r2, C53157GjT gjT, AnonymousClass3W1 r4) {
        this.A02.E12(r2, gjT, r4);
    }

    public final void Eul(1Xj r2, AnonymousClass3W1 r3, String str) {
        this.A02.Eul(r2, r3, str);
    }
}
