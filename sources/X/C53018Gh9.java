package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;
import java.util.Collection;

/* renamed from: X.Gh9  reason: case insensitive filesystem */
public final class C53018Gh9 extends 2YL {
    public final SchoolSettingsRepository A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final UserSession A03;

    public C53018Gh9(UserSession userSession, SchoolSettingsRepository schoolSettingsRepository) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = schoolSettingsRepository;
        02z A10 = DbS.A10(new C61063Jw1());
        this.A01 = A10;
        this.A02 = 10b.A03(A10);
        C318136oS A002 = C318116oQ.A00(this);
        MG3 mg3 = new MG3((Object) this, (AnonymousClass4D7) null, 47);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new MG3((Object) this, (AnonymousClass4D7) null, 48), C51967G9n.A0M(this, r3, mg3, A002));
    }

    public static final void A00(C53018Gh9 gh9) {
        Object value;
        C61063Jw1 jw1;
        05G r5 = gh9.A01;
        do {
            value = r5.getValue();
            jw1 = (C61063Jw1) value;
        } while (!r5.AIY(value, C61063Jw1.A00((C61083JwL) jw1.A02, 00k.A0T(C56456Hyo.A00, (Collection) jw1.A03), jw1.A01)));
    }
}
