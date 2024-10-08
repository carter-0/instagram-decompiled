package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* renamed from: X.LDe  reason: case insensitive filesystem */
public final class C63923LDe {
    public String A00;
    public final MRR A01;
    public final EffectCollectionService A02;
    public final UserSession A03;
    public final C262224Cq A04;

    public final void A00(MTK mtk) {
        0qQ.A0B(mtk, 0);
        AnonymousClass7TE.A1Z(new MH2((Object) this, (Object) mtk, (AnonymousClass4D7) null, 46), this.A04);
    }

    public C63923LDe(Context context, MRR mrr, UserSession userSession, C262224Cq r5) {
        this.A03 = userSession;
        this.A01 = mrr;
        this.A04 = r5;
        this.A02 = C311766dD.A00(context, userSession);
    }
}
