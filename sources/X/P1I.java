package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;

public final class P1I implements C74314Psq {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C72202OyR A02;
    public final /* synthetic */ AnonymousClass2Ep A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public P1I(Activity activity, UserSession userSession, C72202OyR oyR, AnonymousClass2Ep r4, String str, String str2, boolean z, boolean z2) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = oyR;
        this.A07 = z;
        this.A06 = z2;
    }

    public final void DUp() {
        String str;
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass2Ep r6 = this.A03;
        OQ2.A01(activity, OQ2.A00(userSession, r6, DirectPromptTypes.CHALLENGES, (Integer) null, this.A04, this.A05, false), userSession, 4929);
        C72202OyR oyR = this.A02;
        String C6C = r6.C6C();
        String C6k = r6.C6k();
        int AdN = r6.AdN();
        boolean z = this.A07;
        boolean z2 = this.A06;
        Integer valueOf = Integer.valueOf(AdN);
        if (z) {
            str = "MODERATOR";
        } else if (z2) {
            str = "COLLABORATOR";
        } else {
            str = "VIEWER";
        }
        C72202OyR.A03((C69493Nmb) null, oyR, valueOf, C6C, C6k, "challenge_submissions_creation_camera_rendered", "tap", "get_started_button", "challenge_submissions_nux_sheet", AnonymousClass7TF.A0w("user_type", str));
    }
}
