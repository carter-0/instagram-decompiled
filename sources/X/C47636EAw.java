package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EAw  reason: case insensitive filesystem */
public final class C47636EAw extends C231632rz {
    public final C49624Ezh A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final G88 A04;
    public final boolean A05;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(-838265485);
        View view2 = view;
        AnonymousClass7TG.A1O(view2, obj4);
        0qQ.A0B(obj3, 3);
        UserSession userSession = this.A03;
        AnonymousClass0iw r11 = this.A02;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.follow.chaining.binder.RecommendedUserCardsViewBinder.Holder");
        C49545Exg exg = (C49545Exg) tag;
        0eP r7 = (0eP) obj4;
        C47173Dro dro = (C47173Dro) obj3;
        G88 g88 = this.A04;
        boolean z = this.A05;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A1O(r11, exg);
        0qQ.A0B(r7, 3);
        DbW.A1N(dro, 4, g88);
        F0G f0g = exg.A01;
        String str = dro.A02;
        int i2 = dro.A01;
        UserSession userSession2 = userSession;
        F0G f0g2 = f0g;
        AnonymousClass0iw r16 = r11;
        FED.A00(r16, userSession2, f0g2, g88, (AnonymousClass3UM) r7.A00, str, i2, z);
        AnonymousClass3UM r13 = (AnonymousClass3UM) r7.A01;
        int i3 = 0;
        F0G f0g3 = exg.A02;
        View view3 = f0g3.A00;
        if (r13 != null) {
            view3.setVisibility(0);
            G88 g882 = g88;
            AnonymousClass3UM r15 = r13;
            F0G f0g4 = f0g3;
            FED.A00(r11, userSession, f0g4, g882, r15, str, i2 + 1, z);
        } else {
            view3.setVisibility(4);
        }
        if (!dro.A03) {
            i3 = AnonymousClass7TE.A0C(exg.A00.getResources());
        }
        0nA.A0X(exg.A00, i3);
        C49624Ezh ezh = this.A00;
        String A002 = A00(dro, r7);
        0qQ.A0B(A002, 0);
        AnonymousClass30Y A003 = ezh.A01.A00(A002);
        if (!0qQ.A0K(A003, AnonymousClass30Y.A07)) {
            ezh.A00.A05(view2, A003);
        }
        AnonymousClass0fD.A0A(-324281854, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r6, Object obj, Object obj2) {
        0eP r7 = (0eP) obj;
        C47173Dro dro = (C47173Dro) obj2;
        DbW.A1H(r6);
        if (r7 != null && dro != null) {
            C49624Ezh ezh = this.A00;
            String A002 = A00(dro, r7);
            0qQ.A0B(A002, 0);
            ezh.A01.A01(DbU.A0a(ezh.A03, AnonymousClass30Y.A00(r7, dro, A002)), A002);
        }
    }

    public C47636EAw(Context context, AnonymousClass0iw r2, UserSession userSession, C49624Ezh ezh, G88 g88, boolean z) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r2;
        this.A04 = g88;
        this.A00 = ezh;
        this.A05 = z;
    }

    public static final String A00(C47173Dro dro, 0eP r4) {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(((AnonymousClass17B) r4.A00).getId());
        A1A.append('_');
        AnonymousClass17B r0 = (AnonymousClass17B) r4.A01;
        if (r0 == null || (str = r0.getId()) == null) {
            str = "Empty";
        }
        A1A.append(str);
        A1A.append('_');
        A1A.append(dro.A01);
        return A1A.toString();
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(533833588);
        View A0D = DbT.A0D(DbT.A0B(this.A01), viewGroup, R.layout.row_recommended_user_cards, false);
        A0D.setTag(new C49545Exg(A0D));
        AnonymousClass0fD.A0A(-399539289, A032);
        return A0D;
    }
}
