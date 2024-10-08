package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9iX  reason: invalid class name and case insensitive filesystem */
public final class C385189iX extends C331047Ph implements C229122ms, C337237fw {
    public C337257fy A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final UserSession A02;
    public final C337257fy A03;
    public final C337257fy A04;
    public final C337257fy A05;
    public final C231762sK A06;
    public final C336367eV A07;
    public final C336377eW A08;

    public C385189iX(Context context, AnonymousClass0iw r17, C228602lw r18, UserSession userSession, C336187eD r20) {
        UserSession userSession2 = userSession;
        this.A02 = userSession2;
        C228602lw r8 = r18;
        this.A03 = C336317eQ.A00(userSession2, r8, "share_post_page");
        this.A04 = new C336247eJ((AnonymousClass4D6) r8, (C336227eH) new AfG(2, new C39659A3z(this), userSession2), (C337287g2) new C389829qI());
        this.A05 = C336237eI.A00((1UV) null, userSession2, r8, new C65618Lwt(this, 0), "autocomplete_user_list", (List) null, true);
        Context context2 = context;
        AnonymousClass0iw r10 = r17;
        C336367eV r2 = new C336367eV(context2, r10, userSession2, false);
        this.A07 = r2;
        C336377eW r82 = new C336377eW(context2, r10, userSession2, (C336397eY) null, r20, "share_post_page");
        this.A08 = r82;
        C231762sK r1 = new C231762sK(context2);
        this.A06 = r1;
        A0B(r2, r82, r1);
    }

    public final boolean CKB() {
        return false;
    }

    public final void Dam(C337257fy r6) {
        C231642s0 r3;
        0qQ.A0B(r6, 0);
        C337257fy r4 = this.A05;
        if (r6 == r4) {
            r3 = this.A08;
        } else {
            r4 = this.A03;
            if (r6 == r4 || r6 == (r4 = this.A04)) {
                r3 = this.A07;
            } else {
                return;
            }
        }
        A06();
        for (Object A09 : (List) r4.Bo1()) {
            A09(r3, A09, (Object) null);
        }
        if (r4.isLoading() || r4.CT5()) {
            A09(this.A06, this, (Object) null);
        }
        A07();
    }

    public final boolean CJz() {
        List list;
        C337257fy r0 = this.A00;
        Object obj = null;
        if (r0 != null) {
            obj = r0.Bo1();
        }
        if (!(obj instanceof List) || (list = (List) obj) == null) {
            return false;
        }
        return list.isEmpty();
    }

    public final boolean CT5() {
        C337257fy r0 = this.A00;
        if (r0 == null || !r0.CT5()) {
            return false;
        }
        return true;
    }

    public final boolean CWV() {
        C337257fy r0 = this.A00;
        if (r0 != null && r0.isLoading()) {
            return true;
        }
        C337257fy r02 = this.A00;
        if (r02 == null || !r02.CT5()) {
            return false;
        }
        return true;
    }

    public final void CgO() {
        C337257fy r2 = this.A00;
        if (r2 != null && r2.CT5()) {
            r2.EJE();
        }
    }

    public final boolean isLoading() {
        C337257fy r0 = this.A00;
        if (r0 == null || !r0.isLoading()) {
            return false;
        }
        return true;
    }
}
