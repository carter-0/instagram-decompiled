package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.JiL  reason: case insensitive filesystem */
public final class C60264JiL extends 2YL {
    public AnonymousClass2Fj A00 = JTO.A0K();
    public AnonymousClass3QO A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public final AnonymousClass2Fj A06 = new 2Fk((Object) null);
    public final AnonymousClass2Fj A07 = JTO.A0K();
    public final AnonymousClass2Fj A08 = JTO.A0K();
    public final AnonymousClass2Fj A09 = JTO.A0K();
    public final AnonymousClass2Fj A0A = JTO.A0K();
    public final 05G A0B;
    public final 05G A0C;
    public final UserSession A0D;

    public C60264JiL(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0D = userSession;
        0sn r1 = 0sn.A00;
        this.A0B = 106.A01(r1);
        this.A0C = 106.A01(r1);
        this.A01 = AnonymousClass3QO.DEFAULT;
        this.A05 = r1;
        this.A03 = r1;
        this.A02 = r1;
        this.A04 = r1;
    }

    public final void A01(PeopleTag peopleTag, boolean z) {
        AnonymousClass2Fj r1 = this.A0A;
        ArrayList A0n = JTS.A0n((Collection) r1.A02());
        if (z) {
            A0n.add(0, peopleTag);
        } else {
            A0n.add(peopleTag);
        }
        r1.A0B(A0n);
        AnonymousClass2Fj r2 = this.A08;
        Iterable iterable = (Iterable) r2.A02();
        if (iterable != null) {
            Set A0j = 00k.A0j(iterable);
            if (A0j.remove(peopleTag)) {
                r2.A0B(00k.A0a(A0j));
            }
        }
    }

    public final void A00(PeopleTag peopleTag) {
        Set A0y;
        AnonymousClass2Fj r2 = this.A0A;
        Collection collection = (Collection) r2.A02();
        if (collection != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(collection);
            if (A1D.remove(peopleTag)) {
                r2.A0B(A1D);
            }
        }
        AnonymousClass2Fj r1 = this.A08;
        Iterable iterable = (Iterable) r1.A02();
        if (iterable != null) {
            A0y = 00k.A0j(iterable);
        } else {
            A0y = DbS.A0y();
        }
        A0y.add(peopleTag);
        r1.A0B(00k.A0a(A0y));
    }

    public final void A02(String str) {
        AnonymousClass2Fj r1 = this.A09;
        ArrayList A0n = JTS.A0n((Collection) r1.A02());
        A0n.add(str);
        r1.A0B(A0n);
        AnonymousClass2Fj r2 = this.A07;
        Iterable iterable = (Iterable) r2.A02();
        if (iterable != null) {
            Set A0j = 00k.A0j(iterable);
            if (A0j.remove(str)) {
                r2.A0B(00k.A0a(A0j));
            }
        }
    }

    public final void A03(String str) {
        Set A0y;
        AnonymousClass2Fj r2 = this.A09;
        Collection collection = (Collection) r2.A02();
        if (collection != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(collection);
            if (A1D.remove(str)) {
                r2.A0B(A1D);
            }
        }
        AnonymousClass2Fj r1 = this.A07;
        Iterable iterable = (Iterable) r1.A02();
        if (iterable != null) {
            A0y = 00k.A0j(iterable);
        } else {
            A0y = DbS.A0y();
        }
        A0y.add(str);
        r1.A0B(00k.A0a(A0y));
    }
}
