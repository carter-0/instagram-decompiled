package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fb8  reason: case insensitive filesystem */
public final class C50400Fb8 implements AnonymousClass7X6 {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass3BQ A02;
    public final AnonymousClass0iw A03;
    public final AnonymousClass7TO A04;

    public C50400Fb8(Activity activity, AnonymousClass0iw r3, UserSession userSession, AnonymousClass7TO r5, AnonymousClass3BQ r6) {
        DbW.A1N(r3, 3, r5);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = r3;
        this.A02 = r6;
        this.A04 = r5;
    }

    public final void Cpt(String str, String str2) {
        String str3 = str2;
        String str4 = str;
        AnonymousClass7TF.A1H(str4, str3);
        C270194gL r3 = (C270194gL) this.A04.A00.get(str3);
        if (r3 == null) {
            0wb.A03("DirectThreadFragment_navigateToLiveViewerFromLiveViewerInvite", "Broadcast item wasn't found in the map");
            return;
        }
        UserSession userSession = this.A01;
        AnonymousClass0iw r4 = this.A03;
        String str5 = r3.A0e;
        str5.getClass();
        String id = r3.A03().getId();
        C278114wI r0 = r3.A06;
        if (r0 == null) {
            r0 = C278114wI.UNKNOWN;
        }
        String obj = r0.toString();
        0qQ.A0B(obj, 5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "ig_live_viewer_invite_tap");
        A0e.AAJ(C273654mx.A00(2116), obj);
        A0e.AAJ("i_pk", str4);
        A0e.AAJ("m_pk", str5);
        A0e.AAJ("a_pk", id);
        A0e.Cgf();
        C3265677h.A0I(r4, userSession, 2FW.A19.A00);
        C278114wI r1 = r3.A06;
        if (r1 == null) {
            r1 = C278114wI.UNKNOWN;
        }
        if (r1 == C278114wI.POST_LIVE || !r1.A00()) {
            Reel A0G = 1OP.A05(userSession).A0G(r3);
            F8Q.A01(this.A00, userSession, A0G, this.A02, (String) null, (String) null, AnonymousClass7TE.A1I(A0G), 0, false, false);
        }
    }

    public final void CqB(String str, String str2, String str3) {
        if (str3 != null) {
            UserSession userSession = this.A01;
            C270634h3 r2 = new C270634h3(ClipsViewerSource.DIRECT, userSession);
            r2.A1C = str3;
            FragmentActivity fragmentActivity = this.A00;
            DbS.A1X(fragmentActivity);
            I6Y.A01(fragmentActivity, r2, userSession, false);
        } else if (str2 != null) {
            Cps((OMU) null, str2);
        }
    }

    public final void Cps(OMU omu, String str) {
        C2601144i.A00().A04(new EDL(omu, this, str, 3), this.A01, str, true);
    }
}
