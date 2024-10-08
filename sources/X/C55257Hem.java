package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.launcher.ExternalBrowserLauncher;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.Hem  reason: case insensitive filesystem */
public abstract class C55257Hem {
    public static final boolean A00(FragmentActivity fragmentActivity, C267324bN r7, UserSession userSession) {
        C257703xp r0;
        AndroidLink A03;
        String CGH;
        boolean z;
        if (r7 != null) {
            0Tu r2 = 0Tu.A05;
            if ((182.A06(r2, userSession, 36317543378588982L) || 182.A06(r2, userSession, 36317543378523445L) || 182.A06(r2, userSession, 2342160552589727013L) || 182.A06(r2, userSession, 36317543376360743L) || 182.A06(r2, userSession, 36317543378720056L)) && r7.CcK() && !r7.A0E() && !C243213Xw.A00(r7, userSession) && !(((r0 = r7.A06().A08) != null && AnonymousClass7TF.A1Y(r0.A00, false)) || (A03 = AnonymousClass47K.A03(fragmentActivity, userSession, r7.A06().A04(), false)) == null || (CGH = A03.CGH()) == null)) {
                AnonymousClass14E r1 = 14D.A04;
                14D A00 = r1.A00();
                if (A00 == null || A00.A00(userSession, CGH) == null) {
                    r1.A00();
                    z = false;
                } else {
                    z = true;
                }
                return C271714jT.A01(A03) == AnonymousClass47L.AD_DESTINATION_WEB && !z && !(new ExternalBrowserLauncher(fragmentActivity, userSession).A02().equals(AnonymousClass05K.A0F) ^ true);
            }
        }
    }
}
