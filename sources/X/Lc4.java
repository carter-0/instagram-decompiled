package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;

public final class Lc4 implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.LEL, X.MRc] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.LEL, X.MRc] */
    public final Object apply(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                NametagController nametagController = (NametagController) this.A01;
                Context context = nametagController.A07;
                ViewGroup viewGroup = nametagController.mRootView;
                AnonymousClass0iw r4 = nametagController.A0C;
                UserSession userSession = nametagController.A0D;
                boolean z = nametagController.A03;
                C51974G9v.A1O(context, viewGroup, r4, userSession);
                new LEL(context, viewGroup, r4, userSession, z).FNd();
                C22031Xty.A0I(r4, userSession, userSession.A06, nametagController.A0F, "download_qr_code", (String) obj2);
                return null;
            case 1:
                NametagController nametagController2 = (NametagController) this.A01;
                Context context2 = nametagController2.A07;
                ViewGroup viewGroup2 = nametagController2.mRootView;
                AnonymousClass0iw r42 = nametagController2.A0C;
                UserSession userSession2 = nametagController2.A0D;
                boolean z2 = nametagController2.A03;
                C51974G9v.A1O(context2, viewGroup2, r42, userSession2);
                new LEL(context2, viewGroup2, r42, userSession2, z2).FNd();
                C22031Xty.A0I(r42, userSession2, userSession2.A06, nametagController2.A0F, "download_qr_code", (String) obj2);
                return null;
            case 2:
                String str = (String) obj2;
                NametagController nametagController3 = (NametagController) ((KHq) this.A01).A01;
                Activity activity = nametagController3.A06;
                0nC.A00(activity, str);
                C49118Eph.A00(activity, (View) null, (String) null, false);
                UserSession userSession3 = nametagController3.A0D;
                C22031Xty.A0I(nametagController3.A0C, userSession3, userSession3.A06, nametagController3.A0F, "copy_link", str);
                return null;
            case 3:
                C59870Jat jat = (C59870Jat) this.A01;
                if (AnonymousClass7TE.A1a(obj)) {
                    return null;
                }
                0kD.A01("VideoCaptureController", "external_dir_unavailable_and_failed_to_start_camera");
                new Handler().post(new M2J(jat));
                return null;
            case 4:
                Number number = (Number) obj2;
                if (number == null) {
                    return null;
                }
                AHO.A01(((C40293AZi) this.A01).A00.A0M(number.intValue()));
                return null;
            default:
                return ((0sP) this.A01).invoke(obj);
        }
    }

    public Lc4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
