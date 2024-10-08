package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.HashMap;

public final class FGD {
    public static final FGD A00 = new Object();

    public static final void A01(Activity activity, 28D r8, AnonymousClass4DH r9, UserSession userSession) {
        Bundle bundle;
        UserSession userSession2 = userSession;
        28D r3 = r8;
        if (182.A06(DbS.A0J(userSession, 3), userSession, 36324973668741658L)) {
            C56044Hrt A0C = C250563lf.A0C(r8);
            A0C.A0n = true;
            bundle = A0C.A00();
        } else {
            bundle = null;
        }
        I3M.A01(activity, bundle, r9, r3, userSession2, true, false);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.6Ye, java.lang.Object] */
    public static final C309416Ye A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        1OP r0 = 1OP.$redex_init_class;
        C315656kI r5 = new C315656kI(userSession);
        C16165Upq upq = new C16165Upq((Activity) fragmentActivity, new RectF(), (C230222pE) new FkY(4), AnonymousClass05K.A01);
        ArrayList A1L = 0sr.A1L(new String[]{str});
        1Xv r02 = 1Xj.A0h;
        String str3 = userSession.A06;
        0qQ.A0B(str3, 1);
        HashMap A0m = DbY.A0m(str, 0sc.A05(new String[]{002.A0T(str2, str3, '_')}));
        ? obj = new Object();
        obj.A0A(A1L);
        obj.A09(A1L);
        obj.A03(AnonymousClass3BQ.ACTIVITY_FEED);
        DbY.A1R(obj);
        obj.A01(userSession);
        obj.A02 = new AnonymousClass3BN();
        0qQ.A0B(A0m, 0);
        obj.A0T = A0m;
        obj.A0V = true;
        obj.A0Z = false;
        obj.A06(r5.A02);
        obj.A07(upq.A03);
        return obj;
    }

    public final void A03(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        1Xv r0 = 1Xj.A0h;
        String str2 = userSession.A06;
        0qQ.A0B(str2, 1);
        String A0T = 002.A0T(str, str2, '_');
        C270634h3 r02 = new C270634h3(ClipsViewerSource.ACHIEVEMENTS_EARNED, userSession);
        r02.A1C = A0T;
        DbU.A1M(fragmentActivity, r02, userSession);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        IgFragmentFactoryImpl.A00();
        F3W f3w = new F3W();
        f3w.A0B = str;
        DbY.A14(f3w.A01(), fragmentActivity, userSession);
    }
}
