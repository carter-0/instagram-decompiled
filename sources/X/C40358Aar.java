package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Aar  reason: case insensitive filesystem */
public final class C40358Aar implements MV5 {
    public final /* synthetic */ AnonymousClass8K4 A00;
    public final /* synthetic */ LD4 A01;
    public final /* synthetic */ C381779cJ A02;

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C40358Aar(AnonymousClass8K4 r1, LD4 ld4, C381779cJ r3) {
        this.A00 = r1;
        this.A01 = ld4;
        this.A02 = r3;
    }

    public final void DEG(Exception exc) {
        C59689JTv.A0A(this.A00.A0A, "photo_to_video_conversion_failed");
    }

    public final void Doe(String str) {
        LD4 ld4 = this.A01;
        DirectShareTarget directShareTarget = ld4.A00;
        directShareTarget.getClass();
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        String str2 = str;
        if (r0 instanceof AnonymousClass9HR) {
            AnonymousClass8K4 r02 = this.A00;
            Activity activity = r02.A0A;
            UserSession userSession = r02.A0D;
            C381779cJ r7 = this.A02;
            AGu aGu = C39622A2m.A02;
            AGu.A01(activity, userSession, directShareTarget, r7, "PhotoViewController_sendPhotoToMsys", str2);
            return;
        }
        1pL A002 = C66551pM.A00();
        AnonymousClass8K4 r03 = this.A00;
        A002.EMy((C53401GnY) null, r03.A0D, r03.A0P, ld4, this.A02, (A6R) null, (AnonymousClass3Q2) null, str2);
    }
}
