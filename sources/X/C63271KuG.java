package X;

import android.app.Activity;
import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.KuG  reason: case insensitive filesystem */
public abstract class C63271KuG {
    public static final void A00(Activity activity, UserSession userSession, String str, boolean z) {
        long j;
        long j2;
        long j3;
        boolean A00 = C363558jv.A00(userSession);
        0Tu r2 = 0Tu.A05;
        if (A00) {
            j = 2342156197492164411L;
        } else {
            j = 2342156334931117946L;
        }
        if (!182.A06(r2, userSession, j)) {
            if (A00) {
                j2 = 36313188278535996L;
            } else {
                j2 = 36313325717620603L;
            }
            if (182.A06(r2, userSession, j2)) {
                Handler A0D = AnonymousClass7TF.A0D();
                C51453FuN fuN = new C51453FuN(userSession, activity, str);
                if (z) {
                    j3 = 2500;
                } else {
                    j3 = 0;
                }
                A0D.postDelayed(fuN, j3);
            }
        }
    }
}
