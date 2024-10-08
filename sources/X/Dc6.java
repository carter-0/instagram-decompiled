package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Dc6 extends 2YL {
    public int A00;
    public IGUserHighlightsTrayType A01;
    public 17M A02;
    public User A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass2Fj A09 = new 2Fk(C46543Dgk.A00);
    public final UserSession A0A;
    public final UserDetailLaunchConfig A0B;
    public final AnonymousClass1L1 A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final 05G A0F = 106.A01((Object) null);

    public final void A07(UserSession userSession, AnonymousClass4D6 r25, C46462DfQ dfQ, C267604bt r27, Dda dda, C323066wt r29, String str, String str2, boolean z) {
        C323126wz r6;
        Dda dda2 = dda;
        String str3 = str;
        AnonymousClass7TF.A1E(dda2, 4, str3);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailViewModel.startUserInfoFetch", -1183771704);
        }
        try {
            C249813kP r7 = C249813kP.A00;
            AnonymousClass0eM r4 = dfQ.A01;
            r7.A05("profile", "user_info_request_strategy", ((C323076wu) r4.getValue()).name());
            UserSession userSession2 = userSession;
            AnonymousClass5CJ A002 = AnonymousClass5CG.A00(userSession2);
            int ordinal = ((C323076wu) r4.getValue()).ordinal();
            AnonymousClass4D6 r10 = r25;
            C267604bt r9 = r27;
            C323066wt r42 = r29;
            if (ordinal == 3) {
                r6 = new EQG(new FTQ(1E4.A00(userSession2), userSession2, r9, dda2, r42, A00(this)), new C47693EDc(1E4.A00(userSession2), r9, dda2, r42), r10, A002);
            } else if (ordinal == 2) {
                r6 = new EQF(1E4.A00(userSession2), new C47693EDc(1E4.A00(userSession2), r9, dda2, r42), r10, A002);
            } else if (ordinal == 1) {
                C323086wv r1 = new C323086wv(r9, dda2, r42);
                r6 = new C323116wy(r1, new C323106wx(r1, userSession2), r10, A002);
            } else if (ordinal != 0) {
                r6 = new EQE(new C323086wv(r9, dda2, r42), r10, A002);
            } else {
                r6 = new EQE(new C323086wv(r9, dda2, r42), r10, A002);
            }
            r9.EaM(true);
            dda2.A04.A04();
            dda2.A03.A04();
            dda2.A08.A04();
            dda2.A06.A04();
            boolean A1Q = AnonymousClass7TF.A1Q(z ? 1 : 0);
            int i = dda2.A00;
            this.A09.A0B(C323136x0.A00);
            C323066wt r17 = r42;
            C323126wz r16 = r6;
            ((Dd7) this.A0E.getValue()).A03(r16, r17, A00(this), str3, str2, i, A1Q);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1351447583);
            }
        }
    }

    public static boolean A02(UserDetailFragment userDetailFragment, String str) {
        return str.equals(userDetailFragment.A10.A03());
    }

    public final String A03() {
        User user = this.A03;
        if (user != null) {
            return user.getId();
        }
        String str = this.A0B.A0O;
        if (str == null) {
            return "INVALID_USER_ID";
        }
        return str;
    }

    public final String A04() {
        User user = this.A03;
        if (user != null) {
            return user.getUsername();
        }
        String str = this.A0B.A0P;
        if (str == null) {
            return "INVALID_USER_NAME";
        }
        return str;
    }

    public final void A05() {
        long j;
        User user = this.A03;
        if (user != null) {
            UserSession userSession = this.A0A;
            0Tu A0J = DbS.A0J(userSession, 0);
            if (!182.A06(A0J, userSession, 36325145469923990L) || !AnonymousClass7TF.A1Y(user.A03.BBE(), false)) {
                C324506zQ r4 = new C324506zQ(user.getId());
                String id = user.getId();
                String str = userSession.A06;
                if (0qQ.A0K(id, str)) {
                    j = 36325145467630208L;
                } else {
                    j = 36325145468678794L;
                }
                if (!182.A06(A0J, userSession, j)) {
                    return;
                }
                if (user.A0N() == AnonymousClass05K.A0C && !user.A29() && !A03().equals(str)) {
                    return;
                }
                if (!this.A05 || ((KWP) this.A0D.getValue()).A01.A00(r4) == null) {
                    this.A0F.Epw(((KWP) this.A0D.getValue()).A01.A00(r4));
                    AnonymousClass7TE.A1Z(new MH5((Object) this, (Object) r4, (AnonymousClass4D7) null, 6), C318116oQ.A00(this));
                }
            }
        }
    }

    public final void A06(Context context, Context context2, AnonymousClass0iw r17, C294265mA r18, UserDetailTabController userDetailTabController, String str, String str2, List list, boolean z) {
        C294255m9 r10;
        int A092;
        Context context3;
        UserDetailTabController userDetailTabController2 = userDetailTabController;
        List list2 = list;
        DbY.A1S(userDetailTabController2, list2);
        C294265mA r4 = r18;
        String str3 = str2;
        AnonymousClass7TF.A1E(r4, 4, str3);
        LinkedList linkedList = new LinkedList();
        if (r4 == C294265mA.MAIN_GRID) {
            r10 = C294255m9.A09;
        } else if (r4 == C294265mA.PHOTOS_OF_YOU) {
            r10 = C294255m9.A0B;
        } else if (r4 == C294265mA.FAN_CLUB_MEDIA_GRID) {
            r10 = C294255m9.A08;
        } else if (r4 == C294265mA.REPOSTS_MEDIA_GRID) {
            r10 = C294255m9.A0C;
        } else {
            return;
        }
        int size = list2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            1Xj r9 = (1Xj) list2.get(i2);
            if (i >= 3) {
                i = 0;
            }
            if (z) {
                A092 = i2 / 3;
            } else {
                A092 = userDetailTabController2.A09(r10.A00, r9.getId());
            }
            if (context != null) {
                context3 = context;
            } else if (context2 != null) {
                context3 = context2;
            }
            linkedList.add(new AnonymousClass9IN(C3252771t.A00(context3, r17, this.A0A, r9, r10, str3, A092, i), A092, i));
            i++;
        }
        String str4 = str;
        1y3 A002 = 1y1.A00(this.A0A);
        if (z) {
            A002.A06(str4, linkedList);
        } else {
            A002.A05(str4, linkedList);
        }
    }

    public final boolean A08() {
        C3727792j r0;
        Dd7 dd7 = (Dd7) this.A0E.getValue();
        String A032 = A03();
        0qQ.A0B(A032, 0);
        boolean z = dd7.A05;
        AnonymousClass92f r1 = dd7.A01;
        if (z) {
            r0 = C3727792j.GRAPHQL_USER_INFO;
        } else {
            r0 = C3727792j.USER_INFO;
        }
        if (!r1.A0B(r0, A032) || this.A07) {
            return false;
        }
        return true;
    }

    public Dc6(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig, C46461DfP dfP) {
        User user;
        this.A0A = userSession;
        this.A0B = userDetailLaunchConfig;
        this.A0E = AnonymousClass0eN.A01(new MJ4(32, dfP, new AnonymousClass8ZA(dfP.A00)));
        int i = 1;
        this.A08 = true;
        this.A04 = "";
        this.A0C = 1L2.A00();
        this.A0D = AnonymousClass0eN.A01(C51800G2j.A00(this, 18));
        this.A02 = 17M.A08;
        17i A002 = 17h.A00(userSession);
        String str = userDetailLaunchConfig.A0O;
        if (str != null) {
            user = A002.A02(str);
        } else {
            String str2 = userDetailLaunchConfig.A0P;
            if (str2 != null) {
                user = (User) A002.A02.get(str2);
            } else {
                throw AnonymousClass7TE.A15("UserDetailLaunchConfig does not contain a valid user id or username");
            }
        }
        this.A03 = user;
        C249813kP.A00.A04("profile", "has_initial_user", user == null ? 0 : i);
        C51647Fy6.A02(this, C318116oQ.A00(this), 48);
    }

    public static final G5K A00(Dc6 dc6) {
        G5K dfK;
        if (!0qQ.A0K(dc6.A03(), "INVALID_USER_ID")) {
            dfK = new C46323Dbr(dc6.A03());
        } else if (!0qQ.A0K(dc6.A04(), "INVALID_USER_NAME")) {
            dfK = new C46456DfK(dc6.A04());
        } else {
            throw AnonymousClass7TE.A0z("userId and userName are both invalid");
        }
        return dfK;
    }

    public static final List A01(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xj r0 = new 1Xj();
            r0.A09 = (ImageUrlBase) it.next();
            A0r.add(r0);
        }
        return A0r;
    }
}
