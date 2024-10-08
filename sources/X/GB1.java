package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GB1 implements C59545JNr {
    public final List A00 = AnonymousClass7TE.A1C();
    public final GB2 A01;

    public GB1(AnonymousClass07V r2, UserSession userSession, AnonymousClass4DU r4) {
        this.A01 = new GB2(r2, userSession, r4);
    }

    public final void EBO(View view, C267324bN r5, C52058GDe gDe, 2el r7, int i) {
        C51974G9v.A1O(r7, view, r5, gDe);
        if (r5.A01 == C295365o2.MIDCARD) {
            C2354830a A002 = AnonymousClass30Y.A00(r5, gDe, r5.getId());
            A002.A00(this.A01);
            for (C250603lj A003 : this.A00) {
                A002.A00(A003);
            }
            C51967G9n.A0z(view, A002, r7);
        }
    }
}
