package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

public final class ISR implements JOB {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass2xI A03;
    public final 1Ux A04;
    public final C270394gf A05;
    public final SearchContext A06;
    public final C228232l0 A07;
    public final C249763kK A08;
    public final Long A09;
    public final String A0A;

    public ISR(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, AnonymousClass2xI r5, 1Ux r6, SearchContext searchContext, C228232l0 r8, C249763kK r9, C270394gf r10, Long l, String str) {
        0qQ.A0B(r9, 5);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = r4;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r5;
        this.A05 = r10;
        this.A04 = r6;
        this.A06 = searchContext;
        this.A09 = l;
        this.A0A = str;
    }

    public final void DNR(1Xj r39, AnonymousClass3W1 r40, String str, C62320sa r42, int i) {
        C233162v9 r0;
        C243363Yl r8;
        1Xj r4 = r39;
        AnonymousClass3W1 r3 = r40;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, r3);
        0qQ.A0B(str, 3);
        AnonymousClass4DV r15 = this.A00;
        Context context = r15.getContext();
        if (context != null && !C61970qY.A0E(context)) {
            1Av A002 = 1Au.A00(this.A01);
            if (!AnonymousClass7TG.A1a(A002, A002.A4J, 1Av.A8a, 71)) {
                AnonymousClass2xI r82 = this.A03;
                ViewParent parent = r15.getScrollingViewProxy().getParent();
                0qQ.A0C(parent, AnonymousClass000.A00(5));
                r82.A00((ViewGroup) parent, DbU.A0m(r15, 2131968767), r42, 500, false);
            }
        }
        UserSession userSession = this.A01;
        boolean A1X = C51968G9o.A1X(userSession, r4);
        boolean z = false;
        r3.A0J((GQ0) null, A1X, false, false, false);
        C228232l0 r83 = this.A07;
        if (A1X) {
            r0 = C233162v9.UNLIKE_CLICK;
        } else {
            r0 = C233162v9.LIKE_CLICK;
        }
        C51966G9m.A1O(r83, r0, r4, r3);
        if (A1X) {
            r8 = C243363Yl.NOT_LIKED;
        } else {
            r8 = C243363Yl.LIKED;
        }
        C64835Lix A003 = C63446KxB.A00(userSession, false);
        0qQ.A0B(A003, 3);
        if (!r4.A3B().isEmpty()) {
            C243363Yl r1 = C243363Yl.LIKED;
            C16679UzF uzF = C16679UzF.LIKED;
            if (r8 == r1) {
                A003.A0F(r4, uzF);
            } else {
                A003.A0G(r4, uzF);
            }
        }
        C340057kd A004 = C340057kd.A00(userSession);
        Integer num = AnonymousClass05K.A00;
        boolean z2 = !A1X;
        AnonymousClass4DU r6 = this.A02;
        A004.A01(C297085r9.A02(r6, r4, num, "button", z2));
        String A0j = AnonymousClass7TG.A0j();
        C55633Hks hks = (C55633Hks) userSession.A01(C55633Hks.class, new C45999DId(userSession, A1U ? 1 : 0));
        String id = r4.getId();
        1QP r10 = hks.A00;
        long A005 = r10.A00(AnonymousClass05K.A0Y, "like_from_ufi", "ufi_like_clicked");
        r10.flowAnnotate(A005, AnonymousClass000.A00(3467), A1X);
        if (id != null) {
            r10.flowAnnotate(A005, "media_id", id);
        }
        hks.A01.put(A0j, Long.valueOf(A005));
        0jB A0k = C51965G9l.A0k();
        C51967G9n.A1J(C271774jZ.A23, A0k, r3.A2r);
        0j9 r12 = C271774jZ.A22;
        if (r3.A0b > 0) {
            z = true;
        }
        C51967G9n.A1J(r12, A0k, z);
        A0k.A04(C271774jZ.A24, Double.valueOf((double) r3.A0b));
        Context requireContext = r15.requireContext();
        int i2 = r3.A0W;
        int i3 = r3.A03;
        int i4 = r3.A0U;
        FragmentActivity activity = r15.getActivity();
        C249763kK r11 = this.A08;
        boolean z3 = r3.A2V;
        0jB r21 = A0k;
        UserSession userSession2 = userSession;
        C243363Yl r24 = r8;
        1Xj r25 = r4;
        C56622I4z.A01(activity, requireContext, r21, userSession2, new C57203ISq(this, r4, r3, A0j, z2), r24, r25, (GQ0) null, r6, this.A06, r11, num, this.A09, this.A0A, i, i2, i3, i4, z3);
        if (1sx.A0Q(r4, r3.A03) && r4.A5d()) {
            C292885jg.A00(userSession);
            C292905ji.A00(userSession, r4, r6, r3);
            r3.A0m(A1U, A1U);
            r3.A1L = AnonymousClass000.A00(3499);
        }
    }
}
