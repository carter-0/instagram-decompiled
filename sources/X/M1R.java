package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.mediaactions.LikeActionView;
import java.util.Iterator;
import java.util.List;

public final class M1R implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public M1R(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj4;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [X.0r1, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C62010KVj kVj;
        0wc r1;
        String str;
        C270194gL r11;
        String str2;
        List<QOn> list;
        Object obj2 = obj;
        if (this.A00 != 0) {
            QP6 qp6 = (QP6) obj2;
            C8913RFg rFg = (C8913RFg) qp6.A04;
            0sn r2 = (List) qp6.A03;
            0r1 r12 = (0r1) this.A02;
            if (r12.A00 && rFg.A01) {
                r12.A00 = false;
                if (r2 == null) {
                    r2 = 0sn.A00;
                }
                for (Object next : r2) {
                    Iterator A1H = C51966G9m.A1H(this.A03);
                    while (A1H.hasNext()) {
                        C2815858p r13 = (C2815858p) A1H.next();
                        if (0qQ.A0K(r13.A02, next)) {
                            C64102LMw.A00(r13.A01, (C313616gj) this.A01, (C64102LMw) this.A04);
                        }
                    }
                }
            }
            ((C64102LMw) this.A04).A01.A01();
            return;
        }
        if (!((C8918RFl) obj2).A01) {
            C313616gj r7 = (C313616gj) this.A04;
            C2816658x r4 = (C2816658x) this.A02;
            C270194gL r9 = (C270194gL) this.A01;
            C305836Jt r3 = r7.A01;
            Object obj3 = null;
            if (!(r3 == null || (r11 = r7.A00) == null)) {
                AnonymousClass4DH r22 = r7.A0K;
                UserSession userSession = r7.A0N;
                LEK lek = new LEK(r22.requireContext(), r3.A0V, r22, userSession, C313666go.VIEWER, (0sP) null);
                LikeActionView likeActionView = r3.A0h;
                lek.A03 = likeActionView;
                lek.A07 = C51965G9l.A0v(likeActionView);
                C71662eb r32 = r3.A0Y;
                lek.A00 = r32;
                if (r32 != null) {
                    LA7 la7 = new LA7(lek.A08, lek.A09, r32);
                    la7.A03 = lek.A06;
                    UserSession userSession2 = lek.A0A;
                    la7.A00 = DbS.A04(0Tu.A06, userSession2, 36593684002702807L);
                    la7.A01 = DbT.A0j(userSession2).Bh3();
                    lek.A04 = la7;
                }
                C2816258t r0 = r4.A04;
                String description = r0.getDescription();
                String Aiu = r0.Aiu();
                String username = r11.A03().getUsername();
                0qQ.A0B(description, 0);
                if (Aiu == null) {
                    0qQ.A07(lek.A08.getString(2131965410));
                }
                lek.A08.getString(2131965411);
                lek.A06 = username;
                LA7 la72 = lek.A04;
                if (la72 != null) {
                    la72.A03 = username;
                }
                r7.A08 = lek;
                C2816458v r122 = r4.A03;
                LCT lct = LCT.A01;
                if (lct == null) {
                    lct = new LCT();
                    LCT.A01 = lct;
                }
                0qQ.A0C(lct, "null cannot be cast to non-null type com.instagram.video.live.userpay.interactor.UserPayViewerInteractor");
                String str3 = r122.A00;
                String valueOf = String.valueOf(r4.A02);
                String str4 = r9.A0e;
                str4.getClass();
                String A0q = JTP.A0q(r9);
                String username2 = r9.A03().getUsername();
                List<C2815858p> list2 = r4.A05;
                String str5 = r122.A04;
                ImageUrl Bh3 = r9.A03().Bh3();
                String str6 = r122.A01;
                String str7 = r122.A03;
                String str8 = r122.A02;
                DbW.A1N(str3, 0, list2);
                C51973G9u.A0t(6, str5, str6, str7);
                0qQ.A0B(str8, 10);
                C60980Juc juc = (C60980Juc) lct.A00.A02();
                if (juc != null) {
                    juc.A02 = str3;
                    juc.A05 = valueOf;
                    juc.A03 = str4;
                    juc.A04 = A0q;
                    juc.A01 = username2;
                    juc.A0C = list2;
                    juc.A09 = str5;
                    juc.A00 = Bh3;
                    juc.A06 = str6;
                    juc.A08 = str7;
                    juc.A07 = str8;
                }
                C64102LMw lMw = r7.A07;
                if (lMw != null) {
                    String str9 = r9.A0X;
                    str9.getClass();
                    ? obj4 = new Object();
                    UserSession userSession3 = lMw.A02;
                    QP6 qp62 = (QP6) SHQ.A00(C63357Kve.A00(userSession3), Pxd.A00(28)).A0X();
                    boolean z = false;
                    if (!(qp62 == null || qp62.A04 != C8913RFg.COMPLETE_WITH_ERRORS || (list = (List) qp62.A00) == null)) {
                        for (QOn qOn : list) {
                            for (C2815858p r02 : list2) {
                                if (0qQ.A0K(r02.A02, qOn.A00) && qOn.A01 != 2312001) {
                                    LEK lek2 = r7.A08;
                                    if (lek2 != null) {
                                        lek2.A00(AnonymousClass05K.A0Y);
                                    }
                                    lMw.A01.A01();
                                }
                            }
                        }
                    }
                    SHQ A002 = C63357Kve.A00(userSession3);
                    String str10 = lMw.A03;
                    0qQ.A0B(str10, 0);
                    QP6 qp63 = (QP6) SHQ.A00(A002, str10).A0X();
                    if (qp63 != null) {
                        str2 = qp63.A06;
                    } else {
                        str2 = null;
                    }
                    if (str9.equals(str2)) {
                        if (qp63 != null) {
                            obj3 = qp63.A04;
                        }
                        if (obj3 == C8913RFg.IN_PROGRESS || (str10.equals("INSTAGRAM_P2A") && ((C8913RFg) qp63.A04).A01)) {
                            z = true;
                        }
                    }
                    obj4.A00 = z;
                    lMw.A01.A02(SHQ.A00(C63357Kve.A00(userSession3), str10), new M1R(1, obj4, r7, lMw, list2));
                }
                M1T.A00(SHQ.A00(C63357Kve.A00(userSession), "INSTAGRAM_USERPAY_BADGES"), r7.A0M, r7, 12);
            }
            kVj = (C62010KVj) this.A03;
            r1 = kVj.A00;
            str = "ig_user_pay_show_user_pay_badge_cta";
        } else {
            kVj = (C62010KVj) this.A03;
            r1 = kVj.A00;
            str = "ig_user_pay_iap_not_enabled";
        }
        0Aj A0e = AnonymousClass7TE.A0e(r1, str);
        C64090LMi lMi = kVj.A01;
        A0e.AAJ("media_id", lMi.A02);
        C64090LMi.A00(A0e, lMi, "product_type", lMi.A03);
        A0e.Cgf();
    }
}
