package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IYo  reason: case insensitive filesystem */
public final class C57357IYo implements C230422pb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ String A02;

    public C57357IYo(UserSession userSession, AnonymousClass4DU r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r24, Object obj, Object obj2, float f, long j, long j2) {
        String str;
        1Xj r1 = (1Xj) obj;
        C230472pg r3 = r24;
        AnonymousClass7TG.A1T(r1, obj2, r3);
        String id = r1.getId();
        if (id == null) {
            id = "n/a";
        }
        if (!r1.CcK() || r1.A2R() == null) {
            str = id;
        } else {
            str = r1.A2R();
            if (str == null) {
                throw DbU.A0h();
            }
        }
        return new C253533qw(r3, str, this.A02, id, this.A01.getModuleName(), C51971G9r.A0r(r1), C254373sN.A03(this.A00, r1), f, 0, -1, -1, -1, -1, -1, -1, C254373sN.A00(r1), j, j2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        return C254373sN.A01(C51968G9o.A0m(obj));
    }
}
