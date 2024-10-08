package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.H3s  reason: case insensitive filesystem */
public final class C54223H3s extends C331047Ph implements C228412ld, C231322rQ, AnonymousClass36F {
    public boolean A00;
    public final AnonymousClass2rV A01 = new AnonymousClass2rV();
    public final H41 A02;
    public final RecentAdActivityFragment A03;
    public final GTP A04;
    public final AnonymousClass2kR A05;
    public final C229122ms A06;
    public final C231762sK A07;
    public final Map A08 = AnonymousClass7TE.A1E();

    public final void A0C() {
        this.A00 = true;
        AnonymousClass2rV r6 = this.A01;
        UserSession userSession = this.A05.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator A1G = AnonymousClass7TE.A1G(r6.A02);
        while (A1G.hasNext()) {
            Object next = A1G.next();
            C51970G9q.A1Q(next, A1C2, A1C, AnonymousClass3VN.A00(userSession, (1Xg) next) ? 1 : 0);
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            r6.A0C(it.next());
        }
        C51975G9x.A1C(r6, A1C2);
        A06();
        RecentAdActivityFragment recentAdActivityFragment = this.A03;
        if (recentAdActivityFragment != null) {
            C3034368u r2 = recentAdActivityFragment.A02;
            if (r2 != null) {
                A09(this.A02, r2, (Object) null);
            }
            int A032 = C51966G9m.A03(r6);
            for (int i = 0; i < A032; i++) {
                1Xg r1 = (1Xg) r6.A01.get(i);
                if (r1.A06.ordinal() == 1) {
                    1Xj A0o = C51965G9l.A0o(r1);
                    if (A0o != null) {
                        AnonymousClass3W1 BQr = BQr(A0o);
                        BQr.A0D(i);
                        A09(this.A04, A0o, BQr);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            C229122ms r12 = this.A06;
            if (r12.CKB()) {
                A08(this.A07, r12);
            }
            A07();
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final boolean AJb(1Xj r2) {
        0qQ.A0B(r2, 0);
        return this.A01.A0E(r2);
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        0qQ.A0B(r4, 0);
        Map map = this.A08;
        AnonymousClass3W1 r1 = (AnonymousClass3W1) map.get(r4);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass3W1 A18 = G9t.A18(r4);
        A18.A0O(1sy.A03);
        map.put(r4, A18);
        return A18;
    }

    public final void Crn() {
        this.A00 = false;
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A04.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A04.A03 = r2;
    }

    public final boolean CRD() {
        return this.A00;
    }

    public C54223H3s(FragmentActivity fragmentActivity, H41 h41, RecentAdActivityFragment recentAdActivityFragment, AnonymousClass2kR r12, C229122ms r13) {
        boolean A1Z = DbW.A1Z(r13);
        this.A05 = r12;
        this.A06 = r13;
        this.A02 = h41;
        this.A03 = recentAdActivityFragment;
        GTP gtp = new GTP(fragmentActivity, fragmentActivity, r12, A1Z, A1Z);
        this.A04 = gtp;
        C231762sK r0 = new C231762sK(r12.A00);
        this.A07 = r0;
        ArrayList A1D = AnonymousClass7TE.A1D(0sr.A1P(new C231632rz[]{gtp, r0}));
        A1D.add(h41);
        A0A(A1D);
    }

    public final void AV9() {
        A0C();
    }

    public final /* synthetic */ List CBH() {
        return AnonymousClass7TE.A1C();
    }

    public final void Cs9(1Xj r2) {
        0fE.A00(this, -235484333);
    }

    public final void notifyDataSetChanged() {
        A0C();
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final void DQv(1Xj r1) {
        A0C();
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }
}
