package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class IKH implements AnonymousClass2WK {
    public final UserSession A00;
    public final User A01;
    public final String A02;

    public final 2WL Cfk(2WI r5, long j) {
        0qQ.A0B(r5, 0);
        View A0N = C51969G9p.A0N(r5, C53983GxR.A09);
        Object tag = A0N.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.coalesced.followchaining.SuggestedEntityUserCardComponent.Holder");
        C55831HoE hoE = (C55831HoE) tag;
        User user = this.A01;
        C54980HaD.A00(hoE, user, this.A02);
        hoE.A05.A0J.A06(this.A00, user);
        C51972G9s.A0y(A0N, j);
        return C51972G9s.A0X(2Wd.A00(r5.Bnf(), C244013aV.A0C(r5, R.dimen.birthday_selfie_preview_margin_top)), Math.max(C245073cH.A02(j), A0N.getMeasuredHeight()));
    }

    public IKH(UserSession userSession, User user, String str) {
        AnonymousClass7TG.A1O(userSession, user);
        this.A00 = userSession;
        this.A01 = user;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
