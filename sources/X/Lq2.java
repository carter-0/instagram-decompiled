package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class Lq2 implements C46204DQh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5w8 A01;
    public final /* synthetic */ String A02;

    public Lq2(Context context, AnonymousClass5w8 r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = context;
    }

    public final void DED() {
        C295065nW r1;
        String str;
        boolean z;
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_error_pano_outline_24);
        C310336ap A0a = DbS.A0a();
        DbS.A19(context, A0a, 2131962312);
        if (drawable != null) {
            A0a.A02();
            A0a.A08(drawable, AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_grey_03));
        }
        Dbb.A1Q(A0a);
        AnonymousClass5w8 r2 = this.A01;
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        UserSession userSession = r2.A02;
        C295095nZ A04 = r2.A04();
        C295085nY r02 = null;
        if (A04 != null) {
            r1 = A04.A02;
        } else {
            r1 = null;
        }
        String valueOf = String.valueOf(r1);
        C295095nZ A042 = r2.A04();
        if (A042 != null) {
            str = A042.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        boolean A002 = C363558jv.A00(userSession);
        C295095nZ A043 = r2.A04();
        if (A043 != null) {
            z = A043.A05;
        } else {
            z = false;
        }
        C295095nZ A044 = r2.A04();
        if (A044 != null) {
            r02 = A044.A01;
        }
        C295105na.A02(userSession, "default_privacy_opt_in_mutation_failure", valueOf, str, str2, String.valueOf(r02), false, A002, z);
    }

    public final void onSuccess() {
        String str;
        C295065nW r0;
        boolean z;
        AnonymousClass5w8 r4 = this.A01;
        AnonymousClass5w9 r02 = AnonymousClass5w8.A05;
        UserSession userSession = r4.A02;
        C295095nZ A0S = JTT.A0S(userSession);
        C295085nY r3 = null;
        if (A0S != null) {
            str = A0S.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        boolean z2 = false;
        if (((str2 != null && str2.equals("share_sheet_share_button")) || ((str2 != null && str2.equals("video_feed_share_button")) || (str2 != null && str2.equals("share_later_share_button")))) && 182.A06(0Tu.A05, userSession, 36319007959161648L)) {
            z2 = true;
        }
        if (!z2) {
            String A0c = DbY.A0c(this.A00, String.valueOf(str), 2131962307);
            C310336ap A0a = DbS.A0a();
            A0a.A0L = false;
            A0a.A0D = A0c;
            1xC r03 = 1xC.A01;
            A0a.A0L = false;
            DbY.A1K(r03, A0a);
        }
        if (182.A06(0Tu.A05, userSession, 36323015163652850L)) {
            0xY AR4 = 2D5.A00(userSession).A04.AR4();
            AR4.E5T("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", true);
            AR4.apply();
        }
        C295095nZ A04 = r4.A04();
        if (A04 != null) {
            r0 = A04.A02;
        } else {
            r0 = null;
        }
        String valueOf = String.valueOf(r0);
        boolean A002 = C363558jv.A00(userSession);
        C295095nZ A042 = r4.A04();
        if (A042 != null) {
            z = A042.A05;
        } else {
            z = false;
        }
        C295095nZ A043 = r4.A04();
        if (A043 != null) {
            r3 = A043.A01;
        }
        C295105na.A02(userSession, "default_privacy_opt_in_mutation_success", valueOf, str, str2, String.valueOf(r3), true, A002, z);
    }
}
