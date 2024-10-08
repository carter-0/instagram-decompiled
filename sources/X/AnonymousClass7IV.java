package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;

/* renamed from: X.7IV  reason: invalid class name */
public final class AnonymousClass7IV {
    public String A00;
    public boolean A01;
    public final UserSession A02;

    public final void A00(Context context, 2Er r9) {
        String C6C;
        0qQ.A0B(context, 0);
        if (r9 != null && (C6C = r9.C6C()) != null) {
            UserSession userSession = this.A02;
            02m.A0p.markerStart(619714951, 0);
            String A04 = 182.A04(0Tu.A05, userSession, 36884998749487700L);
            HashMap A022 = 0Yt.A02(new 0eP[]{new 0eP(C66579MXk.A00(899), C6C), new 0eP("entrypoint", "ig_direct"), new 0eP("creation_session_id", this.A00)});
            if (A04.length() > 0) {
                A022.put("qe_variant", A04);
            }
            C46649DiU A042 = C46649DiU.A04(C66579MXk.A00(58), A022);
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
            igBloksScreenConfig.A0P = AnonymousClass05K.A01;
            igBloksScreenConfig.A00 = 16;
            A042.A0E(context, igBloksScreenConfig);
        }
    }

    public final boolean A02(Activity activity, 2Er r19) {
        String str;
        String C6C;
        Activity activity2 = activity;
        0qQ.A0B(activity2, 0);
        UserSession userSession = this.A02;
        C71868OsA A002 = C69840Nt4.A00(userSession);
        String str2 = this.A00;
        String str3 = "";
        if (r19 == null || (str = r19.C6C()) == null) {
            str = str3;
        }
        0wc r3 = A002.A00;
        0Aj A003 = r3.A00(r3.A00, "gen_ai_imagine_create_ig_mobile_event");
        A003.AAJ("event_type", "imagine_button_click");
        A003.AAJ("creation_session_id", str2);
        A003.A9F("ig_user_id", Long.valueOf(A002.A00()));
        A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A003.Cgf();
        if (C331227Qb.A02(userSession)) {
            return true;
        }
        this.A01 = true;
        C71868OsA A004 = C69840Nt4.A00(userSession);
        String str4 = this.A00;
        if (!(r19 == null || (C6C = r19.C6C()) == null)) {
            str3 = C6C;
        }
        0wc r1 = A004.A00;
        0Aj A005 = r1.A00(r1.A00, "gen_ai_imagine_create_ig_mobile_event");
        A005.AAJ("event_type", "nux_impression");
        A005.AAJ("creation_session_id", str4);
        A005.A9F("ig_user_id", Long.valueOf(A004.A00()));
        A005.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        A005.Cgf();
        AnonymousClass9B9.A00().A01(activity2, C69503Nml.A0C, userSession, (AnonymousClass7JY) null, true, false);
        return false;
    }

    public final void A01(2Er r7, String str) {
        String str2;
        if (str == null) {
            str = AnonymousClass0HM.A00().toString();
            0qQ.A07(str);
        }
        this.A00 = str;
        C71868OsA A002 = C69840Nt4.A00(this.A02);
        String str3 = this.A00;
        if (r7 == null || (str2 = r7.C6C()) == null) {
            str2 = "";
        }
        0wc r2 = A002.A00;
        0Aj A003 = r2.A00(r2.A00, "gen_ai_imagine_create_ig_mobile_event");
        A003.AAJ("event_type", "imagine_button_impression");
        A003.AAJ("creation_session_id", str3);
        A003.A9F("ig_user_id", Long.valueOf(A002.A00()));
        A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A003.Cgf();
    }

    public AnonymousClass7IV(UserSession userSession) {
        this.A02 = userSession;
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        this.A00 = obj;
    }
}
