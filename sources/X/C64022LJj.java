package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LJj  reason: case insensitive filesystem */
public abstract class C64022LJj {
    public static final void A00(Context context, DialogInterface.OnDismissListener onDismissListener, AnonymousClass07i r12, UserSession userSession, 1Xj r14, Reel reel, AnonymousClass3BQ r16) {
        int i;
        int i2;
        int i3;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 4);
        Reel A0M = ReelStore.A03(userSession).A0M(userSession.A06);
        if (A0M != null) {
            1Xj r5 = r14;
            boolean A1B = A0M.A1B(r14);
            Reel reel2 = reel;
            boolean A1W = AnonymousClass7TF.A1W(reel.A09, HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY);
            if (r14.CeS()) {
                i = 2131972129;
                if (reel.A0l()) {
                    i = 2131972130;
                }
                i2 = 2131972126;
                i3 = 2131972127;
                if (A1B) {
                    i3 = 2131972128;
                }
            } else if (A1W) {
                i = 2131972135;
                i2 = 2131972133;
                i3 = 2131972134;
            } else {
                int i4 = 2131972088;
                if (reel.A0l()) {
                    i4 = 2131972089;
                }
                i2 = 2131972085;
                i3 = 2131972086;
                if (A1B) {
                    i3 = 2131972087;
                }
            }
            C358248ab A0N = JTU.A0N(context, i, i3);
            A0N.A0r(true);
            A0N.A0s(true);
            A0N.A0I(new C50019FJe(6, (Object) r5, (Object) reel2, (Object) userSession2, (Object) r12, (Object) context, (Object) r16), i2);
            A0N.A0C(LV2.A00(onDismissListener, 37));
            A0N.A0f(onDismissListener);
            DbT.A1V(A0N);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(K14 k14, UserSession userSession, Reel reel, List list) {
        AnonymousClass1qK r1;
        boolean A1Z = AnonymousClass7TG.A1Z(k14, userSession);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51966G9m.A0t(it).A4F(JTP.A0r(reel));
        }
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        AnonymousClass3HX r12 = k14.A00;
        if (r12 == null) {
            ReelStore.A03(userSession).A0c(reel.getId());
            r1 = new C312456eS(reel);
        } else {
            r1 = new AnonymousClass376(ReelStore.A03(userSession).A0I(r12, A1Z));
        }
        A00.A05(r1);
    }
}
