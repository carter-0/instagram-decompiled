package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Flh  reason: case insensitive filesystem */
public final class C50954Flh implements G6O {
    public final C62320sa A00;
    public final AnonymousClass4D6 A01;

    public C50954Flh(AnonymousClass4D6 r1, C62320sa r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        long A012;
        AnonymousClass7TG.A1T(context, userSession, fragmentActivity);
        FBX fbx = new FBX(userSession);
        fbx.A01(857808852, (String) null);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36321434616538484L)) {
            if (182.A06(r2, userSession, 36321434616669557L)) {
                A012 = 1;
            } else {
                A012 = 182.A01(r2, userSession, 36602909593310032L);
                0qQ.A0A(Long.valueOf(A012));
            }
            C49955FGk.A01(context, userSession, A012);
            return;
        }
        fbx.A01(857806880, (String) null);
        C229382nI A013 = C229382nI.A01((SparseArray) null, fragmentActivity, DbS.A0O("SETTINGS"), userSession);
        AnonymousClass4D6 r22 = this.A01;
        C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, userSession, "com.bloks.www.fxcal.settings.async", DbY.A0m("params", "{\"server_params\":{\"entrypoint\":\"app_settings\"}}"));
        E85.A00(A02, A013, fbx, this, 11);
        r22.schedule(A02);
    }
}
