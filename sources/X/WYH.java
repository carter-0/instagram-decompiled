package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final class WYH implements MVB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public WYH(Activity activity, AnonymousClass4DH r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void onButtonClick(View view) {
        LinkedHashMap A06 = 0Yt.A06(JTQ.A1b("module", "", new 0eP("media_id", "0")));
        UserSession userSession = this.A02;
        C360678ey A05 = C359988do.A05(userSession, "com.instagram.sensitivity.see_why_sheets.publisher_news_sheet_action", A06);
        A05.A00(new E85(18, this.A00, this.A01, userSession));
        1ES.A03(A05);
    }
}
