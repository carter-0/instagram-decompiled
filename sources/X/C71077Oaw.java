package X;

import android.app.Activity;
import android.util.Base64;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.util.Map;

/* renamed from: X.Oaw  reason: case insensitive filesystem */
public final class C71077Oaw {
    public static final Map A02 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("ig_user_impersonation_me", 1), AnonymousClass7TE.A1L("ig_user_impersonation_someone_i_know", 1), AnonymousClass7TE.A1L("ig_user_impersonation_someone_i_follow", 1), AnonymousClass7TE.A1L("ig_user_impersonation_someone_else", 1), AnonymousClass7TF.A0x("ig_impersonation_celebrity", 2)});
    public final UserSession A00;
    public final Activity A01;

    public static final 1aU A00(C71077Oaw oaw, String str, long j) {
        C66594MYg A012 = MYc.A01(oaw.A00, "MsysReportUtil");
        return C66789Mca.A00(MYb.A00(A012.A01), C74173PqF.A00, 20).A0M(new C72018Ous(new C73947PmR(A012, str, 3, j), 8));
    }

    public static final boolean A01(String str, Map map) {
        CommonMediaTransport A03;
        if (str == null || (A03 = C66834MdS.A03(str)) == null) {
            return false;
        }
        AnonymousClass681 r1 = NAY.A00;
        Object A002 = r1.A00(65);
        Object A003 = r1.A00(66);
        Object A004 = r1.A00(64);
        String str2 = A03.mediaKey_;
        0qQ.A07(str2);
        byte[] decode = Base64.decode(str2, 2);
        0qQ.A07(decode);
        map.put(A002, decode);
        map.put(A003, A03.mimetype_);
        map.put(A004, A03.directPath_);
        return true;
    }

    public C71077Oaw(Activity activity, UserSession userSession) {
        this.A01 = activity;
        this.A00 = userSession;
    }

    public final void A02(C299275ur r3, C277014uI r4) {
        AnonymousClass7TG.A1N(r4, r3);
        C59689JTv.A0B(this.A01, "something_went_wrong");
        C299275ur.A00(r3.A00, AnonymousClass6Tm.A01, r4);
    }
}
