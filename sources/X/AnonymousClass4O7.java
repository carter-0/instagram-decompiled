package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4O7  reason: invalid class name */
public final class AnonymousClass4O7 {
    public static final Long A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String fbidV2 = 0eE.A00(userSession).A00().A03.getFbidV2();
        if (fbidV2 != null) {
            return 00y.A0n(10, fbidV2);
        }
        return null;
    }

    public final void A02(UserSession userSession, AnonymousClass4O6 r10, String str, String str2) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(AnonymousClass4O8.UNKNOWN);
        0qQ.A07(singletonList);
        r10.A00((AnonymousClass9JF) null, A00, "reconsider_prompt_cancel", str, str2, singletonList);
    }

    public final void A03(UserSession userSession, AnonymousClass4O6 r10, String str, String str2) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(AnonymousClass4O8.UNKNOWN);
        0qQ.A07(singletonList);
        r10.A00((AnonymousClass9JF) null, A00, "reconsider_prompt_impression", str, str2, singletonList);
    }

    public final void A04(UserSession userSession, AnonymousClass4O6 r10, String str, String str2) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(AnonymousClass4O8.UNKNOWN);
        0qQ.A07(singletonList);
        r10.A00((AnonymousClass9JF) null, A00, "reconsider_prompt_open_os_setting", str, str2, singletonList);
    }

    public final void A05(UserSession userSession, AnonymousClass4O6 r10, String str, String str2) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(AnonymousClass4O8.UNKNOWN);
        0qQ.A07(singletonList);
        AnonymousClass9JF r2 = new AnonymousClass9JF((AnonymousClass4O9) null, (AnonymousClass4OA) null, 7);
        r2.A04 = str2;
        r10.A00(r2, A00, "try_to_request_location_permission", str, (String) null, singletonList);
    }

    public final Activity A01(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        0qQ.A07(baseContext);
        return A01(baseContext);
    }
}
