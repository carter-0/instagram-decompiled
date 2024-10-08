package X;

import android.app.Activity;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.LBi  reason: case insensitive filesystem */
public final class C63902LBi {
    public final void A00(Activity activity, Fragment fragment, AnonymousClass818 r9, AnonymousClass819 r10, UserSession userSession, C66461MSp mSp, String str, String str2, boolean z) {
        DbW.A1N(userSession, 2, mSp);
        0qQ.A0B(str, 7);
        KYZ kyz = (KYZ) userSession.A01(KYZ.class, new C20699WxV(userSession, 11));
        kyz.A00 = r9;
        kyz.A00 = r10;
        kyz.A06 = mSp;
        kyz.A0C = z;
        kyz.A09 = str;
        kyz.A0A = str2;
        C49887FBn A00 = C49797F7i.A00(userSession);
        A00.A02((ComponentActivity) activity, (Integer) null, r9.toString(), r10.toString());
        kyz.A04 = A00;
        if (fragment != null) {
            A00.A01(fragment);
        }
        kyz.A05(activity);
    }
}
