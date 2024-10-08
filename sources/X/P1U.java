package X;

import android.view.View;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;

public final class P1U implements C74448Pv3 {
    public final /* synthetic */ C68488NKh A00;

    public final void DRr(DirectMessageSearchThread directMessageSearchThread, int i, int i2, int i3, int i4) {
    }

    public P1U(C68488NKh nKh) {
        this.A00 = nKh;
    }

    public final void DRl(DirectMessageSearchMessage directMessageSearchMessage, int i, int i2, int i3, int i4) {
        C254783t2 A0g;
        C68488NKh nKh = this.A00;
        if (nKh.A0A.equals("open") || !nKh.A0G) {
            A0g = C66580MXl.A0g(nKh.A0B);
        } else {
            A0g = C66580MXl.A0j(nKh.A07, Long.parseLong(nKh.A0B));
        }
        DirectMessageSearchMessage directMessageSearchMessage2 = directMessageSearchMessage;
        C66584MXp.A0h(nKh.requireActivity(), nKh, nKh.getSession(), directMessageSearchMessage, A0g);
        if (nKh.A05.A02 != null) {
            C72208OyY A002 = C72208OyY.A00(nKh.getSession());
            A002.A0A(directMessageSearchMessage2, nKh.A09, 25, (long) i, (long) i2);
            A002.A09(directMessageSearchMessage);
        }
        nKh.A05.A04(nKh.A09, nKh.A0C, "message_list", directMessageSearchMessage.A02);
    }

    public final void DfX(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        if (directSearchResult instanceof DirectMessageSearchMessage) {
            C68488NKh nKh = this.A00;
            DirectMessageSearchMessage directMessageSearchMessage = (DirectMessageSearchMessage) directSearchResult;
            if (view != null && nKh.A03 != null) {
                nKh.A03.A05(view, DbU.A0a(new C72261OzW(nKh.A0M), AnonymousClass30Y.A00(directMessageSearchMessage, (Object) null, directMessageSearchMessage.A07)));
            }
        }
    }
}
