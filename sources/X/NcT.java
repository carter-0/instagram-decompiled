package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class NcT extends C16744V4b {
    public final /* synthetic */ C72918PPc A00;
    public final /* synthetic */ String A01;

    public final void A03() {
    }

    public NcT(C72918PPc pPc, String str) {
        this.A00 = pPc;
        this.A01 = str;
    }

    public final void A00() {
        C72918PPc pPc = this.A00;
        C72208OyY oyY = pPc.A0R;
        oyY.A0C("thumbs_down");
        String str = this.A01;
        Pattern pattern = 0mp.A06;
        oyY.A0B(AnonymousClass05K.A0B, 7, (long) str.length());
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("bot_response_id", pPc.A07);
        Q3B q3b = new Q3B(new C73468PdA(this, 0));
        HashMap A1E2 = AnonymousClass7TE.A1E();
        A1E2.put("on_complete", q3b);
        C49940FFt fFt = new C49940FFt();
        fFt.A03 = C46626Di6.HALF_SHEET;
        fFt.A02 = C46627Di7.DISABLED;
        C46471DfZ A03 = fFt.A03();
        C46649DiU A06 = C46649DiU.A06("com.bloks.www.messenger.aibot.feedback_controller", A1E, A1E2);
        Context context = pPc.A0M;
        C49672F1e f1e = new C49672F1e(pPc.A0Q);
        f1e.A00(A03);
        A06.A0F(context, f1e.A00);
    }

    public final void A01() {
        C72918PPc pPc = this.A00;
        C72208OyY oyY = pPc.A0R;
        oyY.A0C("thumbs_up");
        String str = this.A01;
        Pattern pattern = 0mp.A06;
        oyY.A0B(AnonymousClass05K.A0B, 6, (long) str.length());
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("bot_response_id", pPc.A07);
        Q3B q3b = new Q3B(new C73468PdA(this, 1));
        UserSession userSession = pPc.A0Q;
        C229382nI A002 = C229382nI.A00(new SparseArray(), pPc.A0N, pPc.A0O, userSession, (2el) null);
        FBO fbo = new FBO("com.bloks.www.messenger.aibot.good_feedback_submit_controller");
        fbo.A04 = A1E;
        fbo.A01 = q3b;
        fbo.A01(pPc.A0M, A002);
    }
}
