package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

public final class IA6 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass2uE A00;

    public IA6(AnonymousClass2uE r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1234133624);
        AnonymousClass2uE r6 = this.A00;
        C266514Zg r1 = r6.A0R;
        0qQ.A0C(r1, AnonymousClass000.A00(719));
        Hashtag BCW = r1.BCW();
        if (BCW != null) {
            1Xj A07 = r6.A07();
            UserSession userSession = r6.A0T;
            1ES.A03(C55026Hax.A00(userSession, A07, BCW));
            AnonymousClass2uE.A03(r6, AnonymousClass3WA.UNRELATED_HASHTAG, true);
            Context context = r6.A0P;
            0qQ.A0B(context, 0);
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131975452);
            A0Y.A08(2131975453);
            A0Y.A06();
            DbT.A1V(A0Y);
            C18683Vwh.A01(r6.A0X, userSession, r6.A07(), BCW, r6.A01);
        }
        AnonymousClass0fD.A0C(-1740286715, A05);
    }
}
