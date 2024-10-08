package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.LWz  reason: case insensitive filesystem */
public final class C64247LWz implements View.OnClickListener {
    public final /* synthetic */ FAY A00;

    public C64247LWz(FAY fay) {
        this.A00 = fay;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1238216026);
        FAY fay = this.A00;
        UserSession userSession = fay.A04;
        C63963LFo lFo = new C63963LFo(fay.A03, userSession);
        C62671KkX kkX = C62671KkX.POG_LONG_PRESS;
        lFo.A01(kkX);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(C62528KhK.UPPER_RIGHT_CREATE_AUDIENCE_LIST_BUTTON, (Object) null);
        A1E.put(C62528KhK.DELETE_OPTION_ENABLED, (Object) null);
        A1E.put(C62528KhK.LOGGING_ENTRY_POINT, kkX);
        FragmentActivity fragmentActivity = fay.A02;
        K8H A002 = C63110Krd.A00((MTR) null, userSession, A1E);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0U = A002;
        A0W.A0T = A002;
        A0W.A0X = null;
        DbU.A0y(fragmentActivity, A002, A0W);
        AnonymousClass0fD.A0C(1962763394, A05);
    }
}
