package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;

public final class EES extends C252233om implements C230222pE {
    public final Context A00;

    public EES(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final void A00(RectF rectF, FragmentActivity fragmentActivity, AnonymousClass0iw r20, UserSession userSession, Reel reel, AnonymousClass3BQ r23) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity2, 3);
        UserSession userSession2 = userSession;
        AnonymousClass3BQ r7 = r23;
        AnonymousClass7TG.A1R(userSession2, r7);
        AnonymousClass0iw r12 = r20;
        0qQ.A0B(r12, 6);
        AnonymousClass3K2 A07 = 1OP.A07(fragmentActivity2, userSession2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Reel reel2 = reel;
        A1C.add(reel2.getId());
        RectF rectF2 = rectF;
        A07.A0T((RectF) null, rectF2, r12, reel2, r7, new FkU(0, rectF2, fragmentActivity2, this, userSession2, reel2, r7, A07, A1C), 0);
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }
}
