package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.EhM  reason: case insensitive filesystem */
public abstract class C48613EhM {
    public static final Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        AnonymousClass6Tm r0 = r23;
        String A0h = DbY.A0h(r0, 0);
        C276544tV A0P = DbY.A0P(r0, 1);
        String A0E = A0P.A0E();
        boolean A0T = A0P.A0T(true);
        String str = null;
        boolean z = !A0P.A0R(35, false);
        if (A0E != null) {
            str = A0E;
        }
        C307896Rx r6 = r22;
        FragmentActivity A04 = C308206Td.A04(r6);
        A04.getSupportFragmentManager().A0v(new WE4(3, (Object) A0P, (Object) r6), A04, "on_failure");
        0lg A0B = C308206Td.A0B(r6);
        Bundle A0C = DbY.A0C("IACWebviewFragment.LIVE_CHAT_URL_KEY", A0h, AnonymousClass7TE.A1L("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig((String) null, (String) null, false, false, false, true, false, true, false, false, A0T, z, false, false, str, A0h)), AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", A0B.getToken()));
        AnonymousClass4DH r02 = new AnonymousClass4DH();
        r02.setArguments(A0C);
        Dbb.A0o((Bundle) null, r02, A04, A0B);
        return null;
    }
}
