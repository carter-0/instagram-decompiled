package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Aaz  reason: case insensitive filesystem */
public final /* synthetic */ class C40366Aaz implements MS6 {
    public final /* synthetic */ AnonymousClass8K4 A00;
    public final /* synthetic */ LD4 A01;
    public final /* synthetic */ C381779cJ A02;
    public final /* synthetic */ C352218Cl A03;

    public /* synthetic */ C40366Aaz(AnonymousClass8K4 r1, LD4 ld4, C381779cJ r3, C352218Cl r4) {
        this.A00 = r1;
        this.A01 = ld4;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void Dgl(boolean z, String str) {
        String str2;
        AnonymousClass8K4 r2 = this.A00;
        LD4 ld4 = this.A01;
        C381779cJ r9 = this.A02;
        C352218Cl r1 = this.A03;
        String str3 = str;
        if (!z || str == null) {
            Activity activity = r2.A0A;
            if (str == null) {
                str2 = "save_screenshot_path_is_null";
            } else {
                str2 = "save_screenshot_success_is_false";
            }
            C59689JTv.A0A(activity, str2);
            return;
        }
        DirectShareTarget directShareTarget = ld4.A00;
        directShareTarget.getClass();
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        if (r0 instanceof AnonymousClass9HR) {
            Activity activity2 = r2.A0A;
            UserSession userSession = r2.A0D;
            AGu aGu = C39622A2m.A02;
            AGu.A00(activity2, userSession, directShareTarget, r9, "PhotoViewController_sendPhotoToMsys", str3);
            return;
        }
        C66551pM.A00().EMG((C53401GnY) null, r1.A01(), r2.A0D, r2.A0P, ld4, r9, (A6R) null, (AnonymousClass3Q2) null, str3, false);
    }
}
