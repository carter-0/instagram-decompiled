package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.GtN  reason: case insensitive filesystem */
public final class C53732GtN extends C251343mx {
    public final UserSession A00;
    public final C243523Zc A01;
    public final AnonymousClass4DU A02;
    public final FragmentActivity A03;

    public final C251263mp A0X(AnonymousClass3Y5 r48) {
        HBL hbl;
        AnonymousClass3Y5 r2 = r48;
        0qQ.A0B(r2, 0);
        2Wa A002 = C243643Zq.A00(r2, new C58684Ivt(this, 17));
        C334997cD r21 = (C334997cD) C243643Zq.A00(r2, C334987cC.A00).A03;
        C243523Zc r1 = this.A01;
        Integer num = r1.A06;
        if (num != null) {
            UserSession userSession = this.A00;
            FragmentActivity fragmentActivity = this.A03;
            AnonymousClass4DU r10 = this.A02;
            C242963Ww r9 = r1.A05;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            hbl = new HBL(fragmentActivity2, r10, r1.A01, userSession, r1.A02, r1.A03, r1.A04, r9, num);
        } else {
            hbl = null;
        }
        0sL A022 = AnonymousClass3j0.A02(r2, JGK.A01(hbl, 34));
        0sL A023 = AnonymousClass3j0.A02(r2, new JG2(23, hbl, A002));
        0sL A024 = AnonymousClass3j0.A02(r2, new C59137J7t(16, this, hbl, r2, r21));
        0sL A025 = AnonymousClass3j0.A02(r2, JGK.A01(hbl, 35));
        AnonymousClass4Ex r92 = new AnonymousClass4Ex(200);
        C243533Zd r7 = C243533Zd.GLOBAL;
        AnonymousClass4Ey A003 = 2Vi.A00(r7, AnonymousClass000.A00(3139));
        A003.A03(C246033ds.A01);
        A003.A02 = r92;
        AnonymousClass4Ey A0a = C51973G9u.A0a(r7, "follow_chaining_alpha");
        A0a.A02 = r92;
        AnonymousClass4F7.A00(r2, new 2Vl(new AnonymousClass4Ey[]{A003, A0a}));
        AnonymousClass3XV r12 = 2WX.A02;
        2V1 r13 = r2.A05;
        2WX A0V = C51971G9r.A0V(r13, (2WX) null, r7, "follow_chaining_alpha");
        2Wb A0S = AnonymousClass7TG.A0S(r13);
        int A026 = C244013aV.A02(A0S, R.color.direct_widget_primary_background);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0E = C51974G9v.A0E(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51971G9r.A0Y((2WX) null, num2, C51965G9l.A0Y(A026), 4), AnonymousClass05K.A0Y, 0, C51967G9n.A07(A0S)), AnonymousClass05K.A04, 0, C244013aV.A03(A0S)), C51967G9n.A0V(C244013aV.A09(A0S)), 0, C244013aV.A0C(A0S, R.dimen.abc_edit_text_inset_top_material));
        2Wb A0L = C51973G9u.A0L(A0S);
        2V1 r72 = A0L.A00;
        C244103ae A004 = 2WW.A00(r72, R.style.NetEgoTitle);
        A004.A0V(C244013aV.A0E(A0L, 2131974681));
        A004.A0D();
        A004.A0M(2);
        Integer num3 = AnonymousClass05K.A01;
        C244123ag.A00(A004, C51971G9r.A0X((2WX) null, num3, 1.0f, 1));
        C51967G9n.A1G(A0L, A004);
        C244103ae A005 = 2WW.A00(r72, R.style.NetEgoCTA);
        A005.A0V(C244013aV.A0E(A0L, 2131972971));
        A005.A0D();
        A005.A0M(1);
        C51971G9r.A1C(C51967G9n.A0R(C51972G9s.A0V(C51972G9s.A0R((2WX) null, 0, C244013aV.A06(A0L)), J6S.A00(hbl, this, 19)), A005), A0L, A0S, A0E);
        AnonymousClass3AQ r22 = new AnonymousClass3AQ();
        C67832Mva A006 = HSQ.A00(A0S, C51965G9l.A0e(C244013aV.A05(A0S)), C51965G9l.A0e(C244013aV.A06(A0S)), C51965G9l.A0e(C244013aV.A06(A0S)));
        long A06 = C244013aV.A06(A0S);
        2WX A0y = G9t.A0y(C51973G9u.A0X((2WX) null, num3, 217.0d, 0), num2, 0);
        2V1 r93 = A0S.A00;
        2Sa r6 = r93.A02.A01;
        AnonymousClass3X7 r24 = r6.A02;
        boolean z = r6.A0W;
        C336557eo r29 = new C336557eo();
        int i = 0;
        for (Object next : (Iterable) A002.A03) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            if (!(next instanceof PG7)) {
                if (next instanceof User) {
                    User user = (User) next;
                    String id = user.getId();
                    UserSession userSession2 = this.A00;
                    0qQ.A0A(next);
                    r29.A00(new C53983GxR(this.A02, userSession2, user, (String) null, A022, A023, A025, A024, i), id, -1.0f, -1.0f, false);
                } else if (next instanceof AnonymousClass3UL) {
                    AnonymousClass3UL r3 = (AnonymousClass3UL) next;
                    r29.A00(new C53983GxR(this.A02, this.A00, r3.A03, r3.A05, A022, A023, A025, A024, i), r3.A03.getId(), -1.0f, -1.0f, false);
                } else if (next instanceof C17674Vc5) {
                    0qQ.A0A(next);
                    C17674Vc5 vc5 = (C17674Vc5) next;
                    Integer A007 = C18214Vne.A00(vc5);
                    if (A007 != null && A007.intValue() == 1) {
                        User user2 = vc5.A02;
                        if (user2 != null) {
                            r29.A00(new C53983GxR(this.A02, this.A00, user2, (String) null, A022, A023, A025, A024, i), user2.getId(), -1.0f, -1.0f, false);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                } else {
                    continue;
                }
            }
            i = i2;
        }
        A0S.A00(new C336707f3(r22, A006, (C331097Pn) null, (C249403jg) null, A0y, (C334327b5) null, C336677f0.A01(r93, r24, num2, 0, -1, G9t.A0i(A0S, A06), false, z), r29, r21, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false));
        return C51967G9n.A0N(C243563Zg.A0L(A0S, C51971G9r.A0Y(AnonymousClass9JR.A00((2WX) null, num3, 0, C244013aV.A0A(A0S)), num2, C51965G9l.A0Y(A0S.Bnf().A02(R.color.direct_widget_primary_background)), 4)), A0S, r2, A0V);
    }

    public C53732GtN(FragmentActivity fragmentActivity, UserSession userSession, C243523Zc r3, AnonymousClass4DU r4) {
        C51972G9s.A1D(userSession, r4);
        this.A01 = r3;
        this.A03 = fragmentActivity;
        this.A00 = userSession;
        this.A02 = r4;
    }
}
