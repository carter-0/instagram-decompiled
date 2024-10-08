package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.P1u  reason: case insensitive filesystem */
public final class C72329P1u implements C74390Pu6 {
    public final /* synthetic */ OHJ A00;

    public C72329P1u(OHJ ohj) {
        this.A00 = ohj;
    }

    public final void Dna(View view, DirectStoreSticker directStoreSticker) {
        P3E p3e = this.A00.A03;
        if (p3e.A0X) {
            UserSession userSession = p3e.A0G;
            if (182.A06(0Tu.A05, userSession, 36329706723033356L)) {
                C54944HZa.A00(view, userSession, AnonymousClass7TE.A1I(new WVL(new N41(new C61077JwF(directStoreSticker, ""), 3), new C72319P1k(p3e, 2), C71044OaM.A03(userSession, directStoreSticker.A04))));
            }
        }
    }

    public final void Dnc(N34 n34, DirectStoreSticker directStoreSticker) {
        C70983OUx oUx = this.A00.A03.A0J.A00.A00;
        if (oUx != null) {
            O6V o6v = oUx.A00.A07;
            o6v.getClass();
            C68464NJc nJc = o6v.A00;
            C74511Pw6 pw6 = nJc.A02;
            if (pw6 != null) {
                String str = nJc.A05;
                if (str == null) {
                    0qQ.A0F("bottomSheetSessionId");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    pw6.Dnb(n34, directStoreSticker, str);
                }
            }
        }
    }
}
