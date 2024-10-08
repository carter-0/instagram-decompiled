package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

public final class FBL {
    public final 1wg A00;
    public final 1wW A01;
    public final UserSession A02;

    public FBL(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = 1wB.A00(userSession);
        this.A00 = 1we.A00(userSession);
    }

    public final void A00(Context context, FragmentActivity fragmentActivity, CallerContext callerContext, String str, String str2, String str3, String str4, String str5, String str6) {
        1wg r2;
        HashMap A022;
        String str7;
        String str8 = str2;
        String str9 = str3;
        AnonymousClass7TG.A0w(2, str, str8, str9);
        String str10 = str4;
        String str11 = str5;
        AnonymousClass7TG.A1S(str10, str11);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 9);
        String A012 = this.A01.A01(callerContext, "fx_company_identity_switcher_linking_cache", str8);
        if (A012 == null) {
            r2 = this.A00;
            String str12 = callerContext.A02;
            0qQ.A07(str12);
            A022 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("caller_class", str12), AnonymousClass7TE.A1L("bloks_app_id", str), AnonymousClass7TE.A1L("initiator_name", str9), AnonymousClass7TE.A1L("entrypoint", str10), AnonymousClass7TE.A1L("x_app_session_id", str11)});
            str7 = "deeplink_invalid_fbid";
        } else {
            try {
                FGT.A01(context, fragmentActivity2, this.A02, A012, str9, str10, str11, str6);
                1wg r4 = this.A00;
                String str13 = callerContext.A02;
                0qQ.A07(str13);
                r4.A04("deeplink_attempt", "fx_company_identity_switcher_linking_cache", (List) null, 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("caller_class", str13), AnonymousClass7TE.A1L("bloks_app_id", str), AnonymousClass7TE.A1L("initiator_name", str9), AnonymousClass7TE.A1L("entrypoint", str10), AnonymousClass7TE.A1L("x_app_session_id", str11)}));
                return;
            } catch (Exception e) {
                r2 = this.A00;
                String str14 = callerContext.A02;
                0qQ.A07(str14);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                A022 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("caller_class", str14), AnonymousClass7TE.A1L("bloks_app_id", str), AnonymousClass7TE.A1L("initiator_name", str9), AnonymousClass7TE.A1L("entrypoint", str10), AnonymousClass7TE.A1L("x_app_session_id", str11), AnonymousClass7TE.A1L("error_message", message)});
                str7 = "deeplink_exception";
            }
        }
        r2.A04(str7, "fx_company_identity_switcher_linking_cache", (List) null, A022);
    }

    public FBL() {
    }
}
