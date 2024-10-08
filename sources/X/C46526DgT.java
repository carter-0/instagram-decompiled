package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.DgT  reason: case insensitive filesystem */
public final class C46526DgT {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;

    public C46526DgT(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, AnonymousClass4DU r5) {
        AnonymousClass7TF.A1D(userSession, 2, r3);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = r5;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        A03(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C47179Dru r8, X.C283155Gi r9, java.lang.String r10) {
        /*
            r7 = this;
            r6 = 0
            X.0qQ.A0B(r10, r6)
            r4 = 1
            com.instagram.common.session.UserSession r5 = r7.A02
            boolean r0 = X.C49019Env.A00(r5)
            if (r0 == 0) goto L_0x0016
            int r1 = r9.A00
            java.lang.String r3 = "Required value was null."
            java.lang.String r2 = "bc_inbox"
            switch(r1) {
                case 195: goto L_0x0017;
                case 198: goto L_0x0028;
                case 277: goto L_0x0039;
                case 281: goto L_0x0039;
                case 283: goto L_0x0039;
                case 432: goto L_0x003f;
                case 433: goto L_0x003f;
                case 436: goto L_0x0017;
                case 526: goto L_0x0028;
                case 534: goto L_0x0028;
                case 537: goto L_0x0017;
                case 558: goto L_0x0071;
                case 938: goto L_0x0039;
                default: goto L_0x0016;
            }
        L_0x0016:
            return r6
        L_0x0017:
            androidx.fragment.app.FragmentActivity r1 = r7.A00
            X.5Gj r0 = r9.A04
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L_0x0023
            X.C49950FGf.A05(r1, r5, r2, r0, r6)
            goto L_0x0076
        L_0x0023:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0028:
            androidx.fragment.app.FragmentActivity r1 = r7.A00
            X.5Gj r0 = r9.A04
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L_0x0034
            X.C49950FGf.A05(r1, r5, r2, r0, r4)
            goto L_0x0076
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0039:
            androidx.fragment.app.FragmentActivity r0 = r7.A00
            X.C49950FGf.A03(r0, r5, r10, r1)
            goto L_0x0076
        L_0x003f:
            androidx.fragment.app.FragmentActivity r3 = r7.A00
            X.6Yo r2 = X.DbS.A0M(r3, r5)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.F3W r1 = new X.F3W
            r1.<init>()
            r1.A0B = r10
            r1.A0M = r4
            X.4DU r0 = r7.A03
            java.lang.String r0 = r0.getModuleName()
            r1.A0E = r0
            X.1sy r0 = X.1sy.A0W
            r1.A02 = r0
            r0 = 2131954192(0x7f130a10, float:1.9544876E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0I = r0
            X.32F r0 = r1.A01()
            r2.A0D(r0)
            r2.A04()
            goto L_0x0076
        L_0x0071:
            androidx.fragment.app.FragmentActivity r0 = r7.A00
            X.C49950FGf.A06(r0, r5, r2, r6)
        L_0x0076:
            A03(r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46526DgT.A05(X.Dru, X.5Gi, java.lang.String):boolean");
    }

    public static final void A00(UserMonetizationProductType userMonetizationProductType, C46526DgT dgT, String str, String str2) {
        UserMonetizationProductType userMonetizationProductType2 = userMonetizationProductType;
        String str3 = str;
        if (userMonetizationProductType2 == UserMonetizationProductType.BADGES_INCENTIVES) {
            C49904FEc fEc = C49283EsS.A00;
            FragmentActivity fragmentActivity = dgT.A00;
            UserSession userSession = dgT.A02;
            fEc.A02((Fragment) null, fragmentActivity, userMonetizationProductType2, userSession, F6S.A00(userSession, AnonymousClass7TE.A1E()), dgT.A01.getModuleName(), "MONETIZATION_INBOX", AnonymousClass7TE.A16(fragmentActivity, 2131976253), str3, (String) null, "MONETIZATION_INBOX");
            return;
        }
        FragmentActivity fragmentActivity2 = dgT.A00;
        UserSession userSession2 = dgT.A02;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity2, userSession2);
        A0Q.A0A = "MONETIZATION_INBOX";
        A0Q.A0B((Bundle) null, C49904FEc.A01(userMonetizationProductType2, userSession2, "MONETIZATION_INBOX", str, str2));
        A0Q.A04();
    }

    public static final void A01(C46526DgT dgT) {
        FragmentActivity fragmentActivity = dgT.A00;
        UserSession userSession = dgT.A02;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0D(C46447Df9.A02().A07(EVG.PENDING, AnonymousClass05K.A00, userSession.A06, AnonymousClass7TF.A0Q(userSession).getUsername(), true));
        A0M.A04();
    }

    public static final void A02(C46526DgT dgT) {
        FragmentActivity fragmentActivity = dgT.A00;
        UserSession userSession = dgT.A02;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        1a1 A022 = C46447Df9.A02();
        C46474Dfc A012 = C46548Dgp.A01(userSession, userSession.A06, "branded_content_activity_notification", dgT.A01.getModuleName());
        A012.A0O = C273654mx.A00(51);
        C46474Dfc.A03(A0M, userSession, A022, A012);
    }

    public static final void A03(C46526DgT dgT, C47179Dru dru, C283155Gi r11) {
        UserSession userSession = dgT.A02;
        C283155Gi r6 = r11;
        C46354Dcy.A01(userSession).A0I(dgT.A01, dru, r6, userSession.A06, (String) null, (String) null, (String) null, (String) null);
        r6.A0E();
        String str = r6.A04.A0s;
        if (str != null) {
            String str2 = r6.A09;
            0qQ.A07(str2);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("business/branded_content/news/log/");
            A0a.A9m("action", "click");
            A0a.A9m("pk", str2);
            DbX.A1M(A0a, "tuuid", str);
            1ES.A03(A0a.A0M());
        }
    }

    public static final void A04(C46526DgT dgT, C283155Gi r14) {
        String A09 = r14.A09("media_id");
        String A092 = r14.A09("permission_id");
        if (A09 != null && A09.length() != 0) {
            Bundle A0C = DbV.A0C("media_id", A09);
            A0C.putString("permission_id", A092);
            A0C.putBoolean(AnonymousClass000.A00(785), false);
            C249713kF r3 = C249713kF.A00;
            UserSession userSession = dgT.A02;
            FragmentActivity fragmentActivity = dgT.A00;
            r3.A0i(A0C, fragmentActivity, userSession, C16509Uw6.FEATURED_PRODUCTS, (Integer) null, (String) null, fragmentActivity.getString(2131969659), A09, (String) null, (String) null, (String) null);
        }
    }
}
