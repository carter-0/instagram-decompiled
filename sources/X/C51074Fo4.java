package X;

import android.text.TextUtils;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.Fo4  reason: case insensitive filesystem */
public final class C51074Fo4 implements MUW {
    public final /* synthetic */ UserDetailTabController A00;
    public final /* synthetic */ Dc6 A01;

    public C51074Fo4(UserDetailTabController userDetailTabController, Dc6 dc6) {
        this.A01 = dc6;
        this.A00 = userDetailTabController;
    }

    public final void DoO(UQY uqy) {
        String str;
        if (uqy != null) {
            String A002 = AnonymousClass000.A00(353);
            String A09 = uqy.A09(A002);
            if (!(A09 == null || A09.length() == 0)) {
                if (182.A06(0Tu.A05, this.A01.A0A, 36312702947165401L)) {
                    UserDetailTabController userDetailTabController = this.A00;
                    String A092 = uqy.A09(A002);
                    C322486vu r1 = userDetailTabController.A0P;
                    String str2 = r1.A0K;
                    if (str2 != null) {
                        if (str2.equals(A092)) {
                            return;
                        }
                    } else if (A092 == null) {
                        return;
                    }
                    r1.A0K = A092;
                    r1.A00();
                    return;
                }
            }
            String A093 = uqy.A09(A002);
            if (!(A093 == null || A093.length() == 0)) {
                return;
            }
        }
        C322486vu r2 = this.A00.A0P;
        if ((!TextUtils.isEmpty(r2.A0K)) && (str = r2.A0K) != null && !str.equals((Object) null)) {
            r2.A0K = null;
            r2.A00();
        }
    }

    public final void onFailure() {
        0wb.A03(AnonymousClass000.A00(2243), AnonymousClass000.A00(2272));
    }
}
