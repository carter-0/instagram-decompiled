package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GAr  reason: case insensitive filesystem */
public final class C51994GAr implements C59545JNr {
    public final C51995GAs A00;

    public C51994GAr(UserSession userSession, AnonymousClass4DU r3) {
        this.A00 = new C51995GAs(userSession, r3);
    }

    public final void EBO(View view, C267324bN r4, C52058GDe gDe, 2el r6, int i) {
        C51974G9v.A1O(r6, view, r4, gDe);
        if (r4.A01 == C295365o2.SURVEY) {
            C2354830a A002 = AnonymousClass30Y.A00(r4, gDe, r4.getId());
            A002.A00(this.A00);
            C51967G9n.A0z(view, A002, r6);
        }
    }
}
