package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FdD implements MVB {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C49334Etp A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdD(AnonymousClass0iw r1, UserSession userSession, C49334Etp etp, String str, List list) {
        this.A02 = etp;
        this.A00 = r1;
        this.A01 = userSession;
        this.A04 = list;
        this.A03 = str;
    }

    public final void onButtonClick(View view) {
        Context context = this.A02.A00;
        AnonymousClass0iw r2 = this.A00;
        UserSession userSession = this.A01;
        List list = this.A04;
        O36.A00(context, r2, userSession, C66579MXk.A00(156), this.A03, list);
    }
}
