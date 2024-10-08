package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GAy  reason: case insensitive filesystem */
public final class C52001GAy implements C59545JNr {
    public final List A00 = AnonymousClass7TE.A1C();
    public final C51982GAf A01;
    public final GB0 A02;
    public final C52002GAz A03;

    public C52001GAy(UserSession userSession, AnonymousClass4DU r3, C230292pL r4, C51982GAf gAf, C51984GAh gAh) {
        this.A01 = gAf;
        this.A03 = new C52002GAz(userSession, r3, gAh);
        this.A02 = new GB0(userSession, r4, gAh);
    }

    public final void EBO(View view, C267324bN r5, C52058GDe gDe, 2el r7, int i) {
        C51974G9v.A1O(r7, view, r5, gDe);
        if (r5.A01 == C295365o2.MULTI_ADS) {
            C2354830a A002 = AnonymousClass30Y.A00(r5, gDe, r5.getId());
            A002.A00(this.A02);
            A002.A00(this.A03);
            for (C250603lj A003 : this.A00) {
                A002.A00(A003);
            }
            for (C233612w1 ABg : this.A01.A00) {
                ABg.ABg(A002);
            }
            C51967G9n.A0z(view, A002, r7);
        }
    }
}
