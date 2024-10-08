package X;

import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.OVc  reason: case insensitive filesystem */
public final class C70988OVc {
    public final float A00;
    public final Activity A01;
    public final Context A02;
    public final UserSession A03;
    public final C331157Pu A04;
    public final User A05;
    public final C71038Oa2 A06;
    public final C16666Uz2 A07;
    public final C72982PRp A08 = new C48058EUc(this);
    public final C14068TpH A09;
    public final C16677UzD A0A;
    public final C74488Pvi A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final HashMap A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public static void A00(BaseBundle baseBundle, C70988OVc oVc) {
        baseBundle.putString("ReportingConstants.ARG_CONTENT_ID", oVc.A0C);
        baseBundle.putBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD", oVc.A0H);
    }

    public final void A01(DirectShareTarget directShareTarget, NHU nhu, boolean z, boolean z2) {
        Fragment r7 = new AnonymousClass4DH();
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = this.A03;
        DbU.A1D(A0a, userSession);
        A00(A0a, this);
        boolean z3 = this.A0I;
        A0a.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", z3);
        float f = this.A00;
        A0a.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", f);
        A0a.putBoolean("ReportingConstants.ARG_IS_PRIVATE_IMPERSONATION", z);
        A0a.putString("ReportingConstants.ARG_EVIDENCE_PAGE_TYPE", "evidence_confirmation");
        A00(A0a, this);
        A0a.putBoolean("ReportingConstants.ARG_IS_SELF_VICTIM", z2);
        r7.setArguments(A0a);
        User user = this.A05;
        r7.A0B = user;
        r7.A09 = directShareTarget;
        r7.A0E = this.A0B;
        C331157Pu r4 = this.A04;
        r7.A07 = r4;
        r7.A0F = nhu;
        C331127Pr A0W = DbS.A0W(userSession);
        Context context = this.A02;
        AnonymousClass7TG.A1N(context, userSession);
        int i = 2131962796;
        if (C49960FGs.A08(userSession, directShareTarget, user, z)) {
            i = 2131962792;
        }
        A0W.A0d = C51967G9n.A0p(context, i);
        DbS.A1S(A0W, z3);
        A0W.A0T = r7;
        A0W.A03 = f;
        r4.A0E(r7, A0W);
    }

    public C70988OVc(Activity activity, Context context, UserSession userSession, C331157Pu r5, User user, C16666Uz2 uz2, C14068TpH tpH, C16677UzD uzD, C74488Pvi pvi, String str, String str2, String str3, String str4, HashMap hashMap, float f, boolean z, boolean z2, boolean z3) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = r5;
        this.A05 = user;
        this.A0C = str;
        this.A0I = z;
        this.A00 = f;
        this.A0B = pvi;
        this.A0F = str2;
        this.A07 = uz2;
        this.A09 = tpH;
        this.A0A = uzD;
        this.A0E = str3;
        this.A0J = z2;
        this.A0H = z3;
        this.A0D = str4;
        this.A0G = hashMap;
        this.A01 = activity;
        this.A06 = new C71038Oa2(uz2, tpH, uzD, str2);
    }
}
