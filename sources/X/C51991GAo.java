package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GAo  reason: case insensitive filesystem */
public final class C51991GAo implements C59545JNr {
    public final List A00 = AnonymousClass7TE.A1C();
    public final C51982GAf A01;
    public final C51988GAl A02;
    public final C51992GAp A03;
    public final C51993GAq A04;

    public C51991GAo(UserSession userSession, AnonymousClass4DU r4, C51982GAf gAf, C51988GAl gAl, String str) {
        this.A02 = gAl;
        this.A01 = gAf;
        C232852uY r1 = new C232852uY(userSession, (C249763kK) null);
        this.A03 = new C51992GAp(userSession, r1, r4);
        this.A04 = new C51993GAq(userSession, r1, r4, str);
    }

    public final void EBO(View view, C267324bN r5, C52058GDe gDe, 2el r7, int i) {
        C51974G9v.A1O(r7, view, r5, gDe);
        if (r5.A01 == C295365o2.ORGANIC) {
            C2354830a A002 = AnonymousClass30Y.A00(r5, gDe, r5.getId());
            A002.A00(this.A03);
            A002.A00(this.A04);
            A002.A00(this.A02.A00);
            for (C250603lj A003 : this.A00) {
                A002.A00(A003);
            }
            for (C233612w1 ABd : this.A01.A00) {
                ABd.ABd(A002);
            }
            C51967G9n.A0z(view, A002, r7);
        }
    }
}
