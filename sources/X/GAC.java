package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class GAC {
    public final 2el A00;
    public final C230752qC A01;

    public GAC(UserSession userSession, 2el r4, AnonymousClass57H r5, C230722q8 r6, C228312lJ r7, Integer num, String str, boolean z) {
        AnonymousClass7TF.A1E(userSession, 1, str);
        this.A00 = r4;
        this.A01 = new C230752qC(userSession, new AnonymousClass2qB(r5, C230732q9.A00(r6, str), r7), num, z);
    }

    public final void A00(View view, C232262tL r4) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("load-more:");
        this.A00.A05(view, DbU.A0a(this.A01, AnonymousClass30Y.A00(r4, C60340gF.A00, AnonymousClass7TF.A0i(r4.getKey(), A1A))));
    }
}
