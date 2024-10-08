package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class ISC implements C46208DQl {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void DJj(1Xj r7, AnonymousClass3W1 r8) {
        JSO A0l;
        String iconicHorizonWorldDeeplink;
        Context context = this.A00.getContext();
        if (context != null && (A0l = C51966G9m.A0l(r7)) != null && (iconicHorizonWorldDeeplink = A0l.getIconicHorizonWorldDeeplink()) != null) {
            I6E.A00.A03(this.A01, this.A02, r7, AnonymousClass05K.A01);
            FH7.A03(context, iconicHorizonWorldDeeplink);
        }
    }

    public final void EBS(View view, 1Xj r6, AnonymousClass3W1 r7) {
        I6E.A00.A04(this.A01, this.A02, r6, AnonymousClass05K.A01);
    }

    public ISC(Fragment fragment, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = r2;
        this.A02 = userSession;
    }
}
