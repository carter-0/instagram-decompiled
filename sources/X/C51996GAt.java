package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GAt  reason: case insensitive filesystem */
public final class C51996GAt implements C59545JNr {
    public final AnonymousClass07V A00;
    public final AnonymousClass07V A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass57M A04;
    public final AnonymousClass93U A05;

    public final void EBO(View view, C267324bN r10, C52058GDe gDe, 2el r12, int i) {
        AnonymousClass57M r0;
        0qQ.A0B(r12, 0);
        DbZ.A0t(1, view, r10, gDe);
        if (r10.A01 == C295365o2.GHOST) {
            if (i > 1 && (r0 = this.A04) != null) {
                r0.A00(view, r10);
            }
            C2354830a A002 = AnonymousClass30Y.A00(r10, gDe, 002.A0O(r10.getId(), i));
            AnonymousClass07V r3 = this.A01;
            AnonymousClass07V r4 = this.A00;
            AnonymousClass4DU r6 = this.A03;
            UserSession userSession = this.A02;
            A002.A00(new GNA(r3, r4, userSession, r6, this.A05));
            A002.A00(new GNB(userSession));
            C51967G9n.A0z(view, A002, r12);
        }
    }

    public C51996GAt(AnonymousClass07V r1, AnonymousClass07V r2, UserSession userSession, AnonymousClass4DU r4, AnonymousClass57M r5, AnonymousClass93U r6) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = userSession;
        this.A05 = r6;
        this.A04 = r5;
    }
}
