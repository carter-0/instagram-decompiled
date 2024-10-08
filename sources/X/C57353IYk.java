package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IYk  reason: case insensitive filesystem */
public final class C57353IYk implements C230422pb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C57353IYk(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r24, Object obj, Object obj2, float f, long j, long j2) {
        1Xj r1 = (1Xj) obj;
        C230472pg r3 = r24;
        AnonymousClass7TG.A1T(r1, obj2, r3);
        String id = r1.getId();
        if (id != null) {
            String str = this.A01;
            String id2 = r1.getId();
            if (id2 != null) {
                return new C253533qw(r3, id, str, id2, "feed_timeline", AnonymousClass000.A00(1485), C254373sN.A03(this.A00, r1), f, 0, -1, -1, -1, -1, -1, -1, C254373sN.A00(r1), j, j2);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        return C254373sN.A01(C51968G9o.A0m(obj));
    }
}
