package X;

import android.util.Pair;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.NHz  reason: case insensitive filesystem */
public final class C68439NHz extends C272124k8 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68439NHz(UserSession userSession, Object obj, Object obj2, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void A01(UserSession userSession) {
        int i;
        int i2;
        switch (this.A00) {
            case 5:
                i = AnonymousClass0fD.A03(252460527);
                0SM A0R = ((C71030OZh) this.A01).A0B.A0R(ReactProgressBarViewManager.PROP_PROGRESS);
                if (A0R != null) {
                    A0R.A08();
                }
                i2 = -1070546211;
                break;
            case 6:
                i = AnonymousClass0fD.A03(1786894720);
                0SM A0R2 = ((C71030OZh) this.A01).A0B.A0R(ReactProgressBarViewManager.PROP_PROGRESS);
                if (A0R2 != null) {
                    A0R2.A08();
                }
                i2 = -1243560268;
                break;
            default:
                super.A01(userSession);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void A02(UserSession userSession) {
        int i;
        int i2;
        switch (this.A00) {
            case 5:
                i = AnonymousClass0fD.A03(1545171903);
                i2 = 1430010041;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-561164825);
                i2 = -522176179;
                break;
            default:
                super.A02(userSession);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        if (2 - this.A00 != 0) {
            super.A03(userSession, obj);
            return;
        }
        int A03 = AnonymousClass0fD.A03(1448849284);
        int A032 = AnonymousClass0fD.A03(-702102356);
        E5H e5h = (E5H) this.A01;
        e5h.A04.getClass();
        C3265677h.A08((C48140EZi) this.A02, e5h, e5h.A04);
        AnonymousClass0fD.A0A(1140285317, A032);
        AnonymousClass0fD.A0A(-385446786, A03);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int i;
        int i2;
        boolean z;
        String str;
        Object obj2;
        switch (this.A00) {
            case 2:
                i = AnonymousClass0fD.A03(1142706767);
                C370538wd r14 = (C370538wd) obj;
                int A03 = AnonymousClass0fD.A03(304175356);
                E5H e5h = (E5H) this.A01;
                e5h.A04.getClass();
                C254703su r0 = r14.A00;
                if (r0 == null || (r0.A10 == 2FW.A0G && !r14.CKJ())) {
                    z = true;
                } else {
                    z = false;
                }
                UserSession userSession2 = e5h.A04;
                String str2 = e5h.A0M;
                C48140EZi eZi = (C48140EZi) this.A02;
                String str3 = r14.A1D;
                if (z) {
                    str = "new";
                } else {
                    str = "existing";
                }
                C3265677h.A09(eZi, e5h, userSession2, str2, (String) null, str3, str);
                e5h.A0C.getClass();
                e5h.A0C.FKy(r14, r14.A0o, r14, true);
                AnonymousClass0fD.A0A(-1121038419, A03);
                i2 = -1401125308;
                break;
            case 3:
                i = AnonymousClass0fD.A03(87161523);
                int A032 = AnonymousClass0fD.A03(-1745754903);
                ((C74321Psx) this.A01).DrF(true, true, false);
                ((P3Z) this.A02).A00 = true;
                AnonymousClass0fD.A0A(61179230, A032);
                i2 = -1143664638;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-1516954579);
                NGz nGz = (NGz) obj;
                int A04 = DbX.A04(nGz, -1711862990);
                HashMap A1E = AnonymousClass7TE.A1E();
                int i3 = 0;
                while (true) {
                    List list = (List) this.A01;
                    if (i3 >= list.size() || i3 >= nGz.A00.size()) {
                        2ED r4 = ((AnonymousClass43G) this.A02).A09;
                        AnonymousClass1aS r1 = r4.A07;
                        Map map = (Map) r1.A0X();
                    } else {
                        if (i3 == 2) {
                            obj2 = AnonymousClass43H.A00;
                        } else {
                            obj2 = ((Pair) list.get(i3)).first;
                        }
                        A1E.put(obj2, nGz.A00.get(i3));
                        i3++;
                    }
                }
                2ED r42 = ((AnonymousClass43G) this.A02).A09;
                AnonymousClass1aS r12 = r42.A07;
                Map map2 = (Map) r12.A0X();
                if (map2 == null) {
                    map2 = AnonymousClass7TE.A1E();
                }
                map2.putAll(A1E);
                r12.accept(map2);
                Number A0z = JTO.A0z(AnonymousClass4iZ.A00, A1E);
                if (A0z != null) {
                    r42.A00.A02 = A0z.intValue();
                    r42.A08.accept(A0z);
                }
                AnonymousClass0fD.A0A(1281576171, A04);
                i2 = -75471069;
                break;
            default:
                super.A04(userSession, obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void A05(C268654dm r9, UserSession userSession) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = DbX.A04(r9, -914766836);
                C51965G9l.A1W(this.A02, r9);
                i2 = -1856167874;
                break;
            case 1:
                i = DbX.A04(r9, -1230661690);
                C51965G9l.A1W(this.A02, r9);
                i2 = -63501049;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1528598649);
                C71030OZh oZh = (C71030OZh) this.A01;
                if (oZh.A07 == 29) {
                    C313756gx A002 = C313746gw.A00(oZh.A0D);
                    int i3 = oZh.A06;
                    String str = oZh.A0G;
                    String str2 = oZh.A0H;
                    1Ln A0J = DbT.A0J(A002);
                    if (DbT.A1Y(A0J)) {
                        DbW.A17(A0J, A002);
                        DbV.A1M(A0J, "thread_update_photo_error");
                        A0J.A0p("change_photo");
                        C66582MXn.A1C(A0J, A002, DbZ.A0b(A0J, "change_photo_dialog", str, str2, i3));
                    }
                }
                C71030OZh.A00(oZh);
                i2 = -665301601;
                break;
            case 6:
                i = AnonymousClass0fD.A03(810874785);
                C71030OZh.A00((C71030OZh) this.A01);
                i2 = -1181173119;
                break;
            default:
                super.A05(r9, userSession);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-637534411);
                int A04 = DbX.A04(obj, 1959986023);
                C51965G9l.A1W(this.A01, obj);
                AnonymousClass0fD.A0A(-1351781709, A04);
                i2 = -1834695865;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1986613748);
                int A042 = DbX.A04(obj, -1318850958);
                C51965G9l.A1W(this.A01, obj);
                AnonymousClass0fD.A0A(-182524794, A042);
                i2 = -1842365749;
                break;
            case 3:
                i = AnonymousClass0fD.A03(1550233951);
                int A03 = AnonymousClass0fD.A03(-1079696256);
                ((C74321Psx) this.A01).DrF(true, true, false);
                ((P3Z) this.A02).A00 = true;
                AnonymousClass0fD.A0A(1118664170, A03);
                i2 = -261353406;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1104028954);
                int A032 = AnonymousClass0fD.A03(-1991701321);
                C66584MXp.A14(userSession, (AnonymousClass74W) obj);
                C71030OZh oZh = (C71030OZh) this.A01;
                if (oZh.A07 == 29) {
                    C313756gx A002 = C313746gw.A00(oZh.A0D);
                    int i3 = oZh.A06;
                    String str = oZh.A0G;
                    String str2 = oZh.A0H;
                    1Ln A0J = DbT.A0J(A002);
                    if (DbT.A1Y(A0J)) {
                        DbW.A17(A0J, A002);
                        DbV.A1M(A0J, "thread_update_photo_success");
                        A0J.A0p("change_photo");
                        C66582MXn.A1C(A0J, A002, DbZ.A0b(A0J, "change_photo_dialog", str, str2, i3));
                    }
                }
                ((C74345PtL) this.A02).FML();
                AnonymousClass0fD.A0A(-134232653, A032);
                i2 = -157360595;
                break;
            case 6:
                i = AnonymousClass0fD.A03(1777582824);
                int A033 = AnonymousClass0fD.A03(1930575376);
                C66584MXp.A14(userSession, (AnonymousClass74W) obj);
                ((C74345PtL) this.A02).FML();
                AnonymousClass0fD.A0A(-2013053075, A033);
                i2 = -734004962;
                break;
            default:
                super.A06(userSession, obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFail(C268654dm r5) {
        if (3 - this.A00 != 0) {
            C68439NHz.super.onFail(r5);
            return;
        }
        int A03 = AnonymousClass0fD.A03(-1104268733);
        ((C74321Psx) this.A01).DrF(false, false, true);
        AnonymousClass0fD.A0A(-138192342, A03);
    }
}
