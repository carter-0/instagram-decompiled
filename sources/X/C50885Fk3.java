package X;

import android.app.Activity;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;

/* renamed from: X.Fk3  reason: case insensitive filesystem */
public final class C50885Fk3 implements G6H {
    public final Activity A00;
    public final AnonymousClass07i A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("business_id");
        String queryParameter2 = uri.getQueryParameter("media_id");
        UserSession userSession = this.A03;
        if (AnonymousClass0BO.A00(userSession).BNw(queryParameter) != null && queryParameter2 != null) {
            1E8 A002 = 1E7.A00(userSession);
            1Xj A022 = A002.A02(queryParameter2);
            if (A022 == null) {
                Activity activity = this.A00;
                AnonymousClass6ST A0h = DbV.A0h(activity);
                DbX.A15(activity, A0h);
                1OC A04 = C3724090s.A04(userSession, queryParameter2);
                A04.A00 = new C47692EDb(16, (Object) A002, (Object) this, (Object) A0h);
                1ES.A00(activity, this.A01, A04);
                return;
            }
            A00(A022, this);
        }
    }

    public static final void A00(1Xj r13, C50885Fk3 fk3) {
        Activity activity = fk3.A00;
        float A09 = (float) 0nA.A09(activity);
        float A08 = (float) 0nA.A08(activity);
        RectF rectF = new RectF(0.0f, 0.0f, A09, A08);
        rectF.offsetTo(0.0f, A08);
        RectF rectF2 = rectF;
        FFV.A02(activity, rectF, rectF2, fk3.A03, (ClipsCelebrationReshareViewModel) null, r13, fk3.A02.getModuleName(), (String) null, 0, true);
    }

    public C50885Fk3(Activity activity, AnonymousClass07i r2, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = activity;
        this.A03 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }
}
