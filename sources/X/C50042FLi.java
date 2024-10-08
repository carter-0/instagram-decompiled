package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.FLi  reason: case insensitive filesystem */
public final class C50042FLi implements View.OnClickListener {
    public final /* synthetic */ FAY A00;

    public C50042FLi(FAY fay) {
        this.A00 = fay;
    }

    public final void onClick(View view) {
        1NY A0N;
        String id;
        String str;
        String id2;
        int A05 = AnonymousClass0fD.A05(-159256336);
        FAY fay = this.A00;
        Reel reel = fay.A07;
        boolean z = !reel.A1Y;
        Context context = fay.A00;
        0gy A002 = AnonymousClass07i.A00(fay.A01);
        UserSession userSession = fay.A04;
        C10315RqD rqD = fay.A06;
        if (AnonymousClass3PQ.A07(reel)) {
            FEG.A00(userSession, reel, z);
            String A0H = reel.A0H(userSession);
            if (z) {
                id = "main_feed";
                A0N = DbU.A0N(userSession);
                A0N.A0A("friendships/mute_friend_reel/");
                if (reel.A0o()) {
                    id2 = AnonymousClass000.A00(596);
                } else {
                    id2 = reel.getId();
                }
                A0N.A9m("reel_id", id2);
                str = "source";
            } else {
                A0N = DbU.A0N(userSession);
                A0N.A0A("friendships/unmute_friend_reel/");
                if (reel.A0o()) {
                    id = AnonymousClass000.A00(596);
                } else {
                    id = reel.getId();
                }
                str = "reel_id";
            }
            A0N.A9m(str, id);
            A0N.A9m("reel_type", A0H);
            A0N.A0R(C320136rp.class, C320146rq.class);
            1OC A0U = DbT.A0U(A0N, true);
            A0U.A00 = new C8763R8o(1, reel, context, rqD, userSession, z);
            1ES.A00(context, A002, A0U);
        }
        AnonymousClass0fD.A0C(-94195352, A05);
    }
}
