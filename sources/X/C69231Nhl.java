package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nhl  reason: case insensitive filesystem */
public final class C69231Nhl extends C68505NKy {
    public NHU A00;
    public final Context A01;
    public final UserSession A02;
    public final NLT A03;
    public final NLU A04;
    public final NLa A05;
    public final C68513NLk A06;

    public C69231Nhl(Context context, UserSession userSession, NKY nky, C74435Pup pup) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        NLT nlt = new NLT(context);
        this.A03 = nlt;
        NLU nlu = new NLU(context);
        this.A04 = nlu;
        C68513NLk nLk = new C68513NLk(context, userSession, pup);
        this.A06 = nLk;
        NLa nLa = new NLa(context, C69327NjS.IGDS_LIST_ITEM, nky);
        this.A05 = nLa;
        A0B(nlt, nlu, nLk, nLa);
    }
}
