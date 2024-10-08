package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Flf  reason: case insensitive filesystem */
public final class C50952Flf implements G6O {
    public final AnonymousClass4DH A00;

    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        F30 f30;
        int A02 = DbW.A02(1, userSession, fragmentActivity);
        if (AnonymousClass7TE.A0q(userSession).getInt("nelson_nux_shown_count", 0) < 3) {
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            AnonymousClass7TG.A1M(A0q, "nelson_nux_shown_count", A0q.getInt("nelson_nux_shown_count", 0) + 1);
            C49859F9z f9z = new C49859F9z(userSession);
            AnonymousClass4DH r6 = this.A00;
            G2M g2m = G2M.A00;
            0qQ.A0B("com.instagram.bullying.restrict_nux_action", A02);
            UserSession userSession2 = f9z.A00;
            C229382nI A01 = C229382nI.A01((SparseArray) null, fragmentActivity, DbS.A0O("SETTINGS"), userSession2);
            C360678ey A05 = C359988do.A05(userSession2, "com.instagram.bullying.restrict_nux_action", (Map) null);
            E86.A01(A05, A01, g2m, 19);
            r6.schedule(A05);
            return;
        }
        1YZ r0 = 1YZ.A02;
        if (r0 != null && (f30 = (F30) r0.A00.getValue()) != null) {
            DbY.A14(f30.A00(userSession), fragmentActivity, userSession);
        }
    }

    public C50952Flf(AnonymousClass4DH r1) {
        this.A00 = r1;
    }
}
