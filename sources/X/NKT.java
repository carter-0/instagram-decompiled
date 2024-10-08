package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class NKT extends AnonymousClass32G implements AnonymousClass4DS, C74476PvW {
    public static final String __redex_internal_original_name = "LoginActivityFragment";
    public UserSession A00;
    public NL2 A01;
    public C60161Jgg A02;
    public boolean A03;
    public final OAS A04 = new OAS(this);
    public final 1wn A05 = C71932OtG.A00(this, 46);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131965557);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        NL2 nl2 = this.A01;
        if (nl2 == null) {
            0qQ.A0F("loginHistoryAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0V(nl2);
        }
    }

    public static final void A02(NKT nkt, boolean z) {
        String str;
        if (nkt.A03) {
            C60161Jgg jgg = nkt.A02;
            if (jgg == null) {
                str = "loginActivityViewModel";
            } else {
                String A052 = 0qv.A02.A05(nkt.requireContext());
                C318136oS A002 = C318116oQ.A00(jgg);
                int i = 45;
                if (z) {
                    i = 44;
                }
                AnonymousClass7TE.A1Z(new MFV(jgg, A052, (AnonymousClass4D7) null, i), A002);
                return;
            }
        } else {
            UserSession userSession = nkt.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                Activity rootActivity = nkt.getRootActivity();
                1NY A0b = AnonymousClass7TG.A0b(userSession);
                A0b.A0A(MYP.A01(44, 23, 91));
                A0b.A0R(NHD.class, ORQ.class);
                1OC A0T = DbT.A0T(A0b, MYP.A01(0, 9, 86), 0qv.A02.A05(rootActivity));
                A0T.A00 = new C68525NLw(nkt);
                nkt.schedule(A0T);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CxT() {
        if (this.A03) {
            UserSession userSession = this.A00;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            0Aj A09 = JTU.A09(userSession);
            DbS.A1L(A09, "login_activity");
            C66582MXn.A1A(A09, "security_alert_action", AnonymousClass000.A00(4100));
        }
    }

    public final void CxU(C70972OTt oTt) {
        String str = "userSession";
        if (this.A03) {
            String str2 = oTt.A06;
            String str3 = str2;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                C60161Jgg jgg = this.A02;
                if (jgg == null) {
                    str = "loginActivityViewModel";
                } else {
                    if (str3 == null) {
                        str3 = "";
                    }
                    AnonymousClass7TE.A1Z(new MEW(jgg, str3, (AnonymousClass4D7) null, 17, true), C318116oQ.A00(jgg));
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        0Aj A09 = JTU.A09(userSession);
                        DbS.A1L(A09, "login_activity");
                        C66582MXn.A1A(A09, "security_alert_action", "confirm_this_was_me");
                        return;
                    }
                }
            } else {
                return;
            }
        } else {
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                String str4 = oTt.A06;
                if (str4 == null) {
                    str4 = "";
                }
                long j = oTt.A04;
                1NY A0a = AnonymousClass7TG.A0a(userSession2);
                A0a.A0A(MYP.A01(67, 34, 76));
                A0a.A0R(NHD.class, ORQ.class);
                A0a.A9m(C66584MXp.A0S(), str4);
                schedule(DbT.A0T(A0a, MYP.A01(17, 15, 121), String.valueOf(j)));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D5X(C70972OTt oTt) {
        String str = "userSession";
        if (this.A03) {
            String str2 = oTt.A06;
            String str3 = str2;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                C60161Jgg jgg = this.A02;
                if (jgg == null) {
                    str = "loginActivityViewModel";
                } else {
                    if (str3 == null) {
                        str3 = "";
                    }
                    AnonymousClass7TE.A1Z(new MEW(jgg, str3, (AnonymousClass4D7) null, 17, false), C318116oQ.A00(jgg));
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        0Aj A09 = JTU.A09(userSession);
                        DbS.A1L(A09, "login_activity");
                        C66582MXn.A1A(A09, "security_alert_action", "undo_this_was_me");
                        return;
                    }
                }
            } else {
                return;
            }
        } else {
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                String str4 = oTt.A06;
                if (str4 == null) {
                    str4 = "";
                }
                long j = oTt.A04;
                1NY A0a = AnonymousClass7TG.A0a(userSession2);
                A0a.A0A(MYP.A01(C11152SCh.MAX_FACTORIAL, 39, 115));
                A0a.A0R(NHD.class, ORQ.class);
                A0a.A9m(C66584MXp.A0S(), str4);
                schedule(DbT.A0T(A0a, MYP.A01(17, 15, 121), String.valueOf(j)));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D91(C70972OTt oTt) {
        String str;
        if (oTt.A0B) {
            str = oTt.A06;
        } else {
            str = oTt.A08;
        }
        if (str == null) {
            str = "";
        }
        A01(this, str);
        if (this.A03) {
            UserSession userSession = this.A00;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            0Aj A09 = JTU.A09(userSession);
            DbS.A1L(A09, "login_activity");
            C66582MXn.A1A(A09, "security_alert_action", "this_was_not_me");
        }
    }

    public final String getModuleName() {
        return "loginactivity";
    }

    public static final void A01(NKT nkt, String str) {
        AnonymousClass35B.A00().A01();
        UserSession userSession = nkt.A00;
        if (userSession != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("change_password_entrypoint", "suspicious");
            A0a.putString("change_password_login_id", str);
            DbU.A1D(A0a, userSession);
            E75 e75 = new E75();
            e75.setArguments(A0a);
            FragmentActivity requireActivity = nkt.requireActivity();
            UserSession userSession2 = nkt.A00;
            if (userSession2 != null) {
                C309516Yo A0M = DbV.A0M(e75, requireActivity, userSession2);
                A0M.A0F(nkt, 11);
                A0M.A04();
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1 && intent != null) {
            C59689JTv.A09(requireContext(), getString(2131965562));
            NL2 nl2 = this.A01;
            if (nl2 == null) {
                str = "loginHistoryAdapter";
            } else {
                nl2.A06();
                boolean z = true;
                A02(this, true);
                String stringExtra = intent.getStringExtra("change_password_login_id");
                if (!(stringExtra == null || stringExtra.length() == 0)) {
                    z = false;
                }
                str = "userSession";
                if (!z) {
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        1NY A0a = AnonymousClass7TG.A0a(userSession);
                        A0a.A0A(MYP.A01(101, 31, 30));
                        A0a.A0R(1XP.class, 1XY.class);
                        schedule(DbT.A0T(A0a, C66584MXp.A0S(), stringExtra));
                    }
                }
                if (this.A03) {
                    UserSession userSession2 = this.A00;
                    if (userSession2 != null) {
                        0Aj A09 = JTU.A09(userSession2);
                        DbS.A1L(A09, "login_activity");
                        C66582MXn.A1A(A09, "security_alert_action", "change_password_success");
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.PvW, androidx.fragment.app.Fragment, java.lang.Object, X.NKT] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r1 == false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 1224987671(0x4903d417, float:539969.44)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.NKT.super.onCreate(r7)
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r6)
            r6.A00 = r0
            android.content.Context r1 = r6.requireContext()
            X.NL2 r0 = new X.NL2
            r0.<init>(r1, r6, r6)
            r6.A01 = r0
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.String r5 = "userSession"
            if (r0 == 0) goto L_0x0034
            X.KCP r1 = new X.KCP
            r1.<init>(r0)
            java.lang.Class<X.Jgg> r0 = X.C60161Jgg.class
            X.2YL r0 = r1.create(r0)
            X.Jgg r0 = (X.C60161Jgg) r0
            r6.A02 = r0
            if (r0 != 0) goto L_0x003c
            java.lang.String r5 = "loginActivityViewModel"
        L_0x0034:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003c:
            X.2Fk r3 = r0.A00
            r0 = 32
            X.MPC r2 = new X.MPC
            r2.<init>(r6, r0)
            r1 = 5
            X.LZw r0 = new X.LZw
            r0.<init>(r1, r2)
            r3.A06(r6, r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            if (r0 == 0) goto L_0x0034
            boolean r0 = X.AnonymousClass5OS.A00(r0)
            if (r0 == 0) goto L_0x0067
            com.instagram.common.session.UserSession r0 = r6.A00
            if (r0 == 0) goto L_0x0034
            X.5Gf r0 = X.C283115Ge.A00(r0)
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r6.A03 = r0
            r0 = -949329969(0xffffffffc76a5fcf, float:-59999.81)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKT.onCreate(android.os.Bundle):void");
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-892183967);
        NKT.super.onPause();
        UserSession userSession = this.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass1Nd.A00(userSession).A02(this.A05, C71910Oss.class);
        AnonymousClass0fD.A09(-1513357077, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1170533408);
        super.onResume();
        UserSession userSession = this.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass1Nd.A00(userSession).A01(this.A05, C71910Oss.class);
        AnonymousClass0fD.A09(1398678323, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-827768263);
        NKT.super.onStart();
        A02(this, false);
        AnonymousClass0fD.A09(1948630461, A022);
    }
}
