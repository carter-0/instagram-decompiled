package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

public final class NQu extends AnonymousClass3NK {
    public final /* synthetic */ NQF A00;
    public final /* synthetic */ N60 A01;
    public final /* synthetic */ boolean A02;

    public final void DP5(View view) {
        boolean z;
        View view2 = view;
        0qQ.A0B(view2, 0);
        view2.performHapticFeedback(0);
        NQF nqf = this.A00;
        nqf.A03.Cus();
        UserSession userSession = nqf.A02;
        AnonymousClass0iw r7 = nqf.A01;
        N60 n60 = this.A01;
        C317966o8 r4 = (C317966o8) n60.A01.A00;
        String str = r4.A0S;
        0qQ.A07(str);
        Integer num = AnonymousClass05K.A00;
        String str2 = nqf.A07;
        boolean A1W = AnonymousClass7TF.A1W(nqf.A00, C69447Nlr.AI_STICKER);
        boolean z2 = this.A02;
        String str3 = r4.A0U;
        if (str3 != null) {
            z = O4I.A00.A07(str3);
        } else {
            z = false;
        }
        int i = n60.A00;
        new C70986OVa(view2, r7, userSession, new C70438O6p(nqf), num, str, str2, (String) null, r4.A0U, i, A1W, z2, z).A01();
    }

    public NQu(NQF nqf, N60 n60, boolean z) {
        this.A00 = nqf;
        this.A01 = n60;
        this.A02 = z;
    }

    public final boolean Dqe(View view) {
        NQF nqf = this.A00;
        UserSession userSession = nqf.A02;
        AnonymousClass0iw r3 = nqf.A01;
        N60 n60 = this.A01;
        C61077JwF jwF = n60.A01;
        C317966o8 r12 = (C317966o8) jwF.A00;
        String str = r12.A0S;
        0qQ.A07(str);
        int i = n60.A00;
        String str2 = r12.A0U;
        String str3 = jwF.A01;
        C69447Nlr nlr = nqf.A00;
        String str4 = nqf.A07;
        boolean z = this.A02;
        AnonymousClass7TG.A1N(userSession, r3);
        0qQ.A0B(nlr, 6);
        if (C70014Nvs.A00(userSession)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "direct_ai_sticker_sent");
            if (A0e.isSampled()) {
                DbS.A1N(A0e, "sticker_tray");
                A0e.AAJ("search_query", str2);
                A0e.AAe("sticker_ids", AnonymousClass7TE.A1I(str));
                A0e.A9F("sticker_position_index", DbS.A0j(i));
                C66584MXp.A0n(nlr, A0e, str3, str4);
                A0e.A7p("is_animated", Boolean.valueOf(z));
                A0e.Cgf();
            }
        }
        nqf.A03.Cuu(r12, nqf.A05, i);
        OPI.A01(userSession, new PUH(r12, (C317966o8) null, C69304Nj5.AI, (C68137N2b) null, (DirectStoreSticker) null, System.currentTimeMillis()), DbS.A04(0Tu.A05, userSession, 36609803016607670L));
        return true;
    }
}
