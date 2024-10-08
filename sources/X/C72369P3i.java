package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.user.model.User;

/* renamed from: X.P3i  reason: case insensitive filesystem */
public final class C72369P3i implements C74399PuF {
    public final FragmentActivity A00;
    public final C319736r8 A01;
    public final C72371P3k A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C74471PvR A05;
    public final O7W A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public final void DUW(OIR oir) {
        0qQ.A0B(oir, 0);
        C68209N5y n5y = oir.A05;
        if (n5y == null) {
            C279864zZ r2 = oir.A03;
            if (r2 != null) {
                n5y = C71147Oe5.A00.A08(this.A00, r2);
            } else {
                return;
            }
        }
        User user = n5y.A02;
        String id = user.getId();
        UserSession userSession = this.A04;
        if (!C51966G9m.A1W(userSession, id)) {
            FragmentActivity fragmentActivity = this.A00;
            C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, userSession);
            0Tu r8 = 0Tu.A05;
            if (182.A06(r8, userSession, 2342164778839975670L)) {
                String A0b = DbY.A0b(dg1.A00, user, 2131975869);
                0qQ.A07(A0b);
                dg1.A0A(A0b, new C71408Ok7(2, (Object) this, (Object) n5y));
            }
            if (182.A06(r8, userSession, 2342164778840041207L)) {
                String A0b2 = DbY.A0b(dg1.A00, user, 2131962737);
                0qQ.A07(A0b2);
                dg1.A0A(A0b2, new C71408Ok7(3, (Object) this, (Object) n5y));
            }
            dg1.A02(new C71408Ok7(4, (Object) this, (Object) n5y), 2131954071);
            dg1.A04(new C71408Ok7(5, (Object) this, (Object) n5y), 2131954064);
            dg1.A04(new C71408Ok7(6, (Object) this, (Object) n5y), 2131976660);
            dg1.A03 = new IVE(this, 0);
            C51969G9p.A11(fragmentActivity, dg1);
        }
    }

    public final void DUZ(OIR oir) {
        OIR oir2 = oir;
        0qQ.A0B(oir2, 0);
        C279864zZ r0 = oir2.A03;
        if (r0 != null) {
            UserSession userSession = this.A04;
            AnonymousClass4AB A002 = C71130OdT.A00(r0, userSession);
            C3018760k A012 = C3018660j.A01(userSession);
            A012.A0L(A002);
            A012.A0J(this.A01, A002);
            A012.A0B(C69506Nmo.A0b);
            if (C51966G9m.A1W(userSession, A002.A0A.getId())) {
                ((C72368P3h) this.A09.getValue()).DUZ(oir2);
            } else {
                ((C72366P3f) this.A08.getValue()).DUZ(oir2);
            }
        } else {
            C3018760k A013 = C3018660j.A01(this.A04);
            A013.A01 = new C319496qh((C319746r9) null, C319726r6.POG, (C319736r8) null, (NoteAudience) null, (Long) null, (Long) null, A013.A06.A06, (String) null, (String) null, (String) null, AnonymousClass7TE.A1I(C66947Mfg.FRIEND_MAP_NOTE), 0, false);
            ((C72363P3c) this.A07.getValue()).DUZ(oir2);
        }
    }

    public static final void A00(C72369P3i p3i) {
        AnonymousClass4A3.A00(p3i.A04).A08((Double) null, (Double) null, AnonymousClass56B.A00, true, false);
    }

    public C72369P3i(FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C74471PvR pvR, Integer num) {
        C319736r8 r0;
        boolean A1Y = C51970G9q.A1Y(userSession);
        this.A00 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = r4;
        this.A05 = pvR;
        if (num.intValue() != A1Y) {
            r0 = C319736r8.FRIEND_MAP_FLOATY_GRID;
        } else {
            r0 = C319736r8.FRIEND_MAP;
        }
        this.A01 = r0;
        0eO r1 = 0eO.A02;
        this.A07 = C73924Pm4.A00(this, r1, 6);
        this.A09 = C73924Pm4.A00(this, r1, 8);
        this.A08 = C73924Pm4.A00(this, r1, 7);
        this.A02 = new C72371P3k(this, 1);
        this.A06 = new O7W(this);
    }
}
