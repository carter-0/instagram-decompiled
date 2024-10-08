package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;
import java.util.ArrayList;

/* renamed from: X.NWu  reason: case insensitive filesystem */
public final class C68784NWu extends C392289uY {
    public C331157Pu A00;
    public boolean A01;
    public final C70844ONw A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final long A0G;
    public final Activity A0H;
    public final 1a8 A0I;
    public final UserSession A0J;
    public final C69324NjP A0K;
    public final C69355Nju A0L;
    public final AnonymousClass7ZA A0M;
    public final String A0N;
    public final String A0O;

    public C68784NWu(Activity activity, 1a8 r4, UserSession userSession, C70844ONw oNw, C69324NjP njP, C69355Nju nju, AnonymousClass7ZA r9, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j) {
        0qQ.A0B(nju, 7);
        0qQ.A0B(oNw, 22);
        0qQ.A0B(r4, 23);
        this.A0H = activity;
        this.A0J = userSession;
        this.A0G = j;
        this.A0D = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A0L = nju;
        this.A03 = l;
        this.A0N = str4;
        this.A05 = str5;
        this.A04 = l2;
        this.A0O = str6;
        this.A06 = str7;
        this.A08 = str8;
        this.A07 = str9;
        this.A0A = str10;
        this.A09 = str11;
        this.A0B = str12;
        this.A0C = str13;
        this.A0K = njP;
        this.A0M = r9;
        this.A02 = oNw;
        this.A0I = r4;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r4, boolean z) {
        0qQ.A0B(puH, 1);
        puH.DoM(this);
    }

    public static final void A00(C68784NWu nWu) {
        C70948OSv.A01.A03(nWu.A0J, nWu.A0G);
        nWu.A0I.A02(nWu.A02.A02(nWu.A0L), PTT.A00);
        nWu.A01 = false;
    }

    public final void A04(boolean z) {
        if (!this.A01) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            String str = this.A07;
            String str2 = this.A08;
            if (!(str2 == null || str == null)) {
                A1C.add(new FullscreenBannerViewModel.SectionBulletPoint((Integer) null, str, str2, (String) null));
            }
            String str3 = this.A09;
            String str4 = this.A0A;
            if (!(str4 == null || str3 == null)) {
                A1C.add(new FullscreenBannerViewModel.SectionBulletPoint((Integer) null, str3, str4, (String) null));
            }
            String str5 = this.A0B;
            String str6 = this.A0C;
            if (!(str6 == null || str5 == null)) {
                A1C.add(new FullscreenBannerViewModel.SectionBulletPoint((Integer) null, str5, str6, (String) null));
            }
            C69177NgP A0K2 = C66584MXp.A0K(new FullscreenBannerViewModel((Integer) null, this.A0D, this.A0F, this.A0E, A1C));
            UserSession userSession = this.A0J;
            C331127Pr A0W = DbS.A0W(userSession);
            String str7 = this.A0N;
            if (!(str7 == null || str7.length() == 0)) {
                A0W.A0g = str7;
                A0W.A1J = true;
                A0W.A0K = new C71408Ok7(36, (Object) this, (Object) A0W);
            }
            String str8 = this.A0O;
            if (!(str8 == null || str8.length() == 0)) {
                A0W.A0h = str8;
                A0W.A1N = true;
                A0W.A0L = new C71408Ok7(37, (Object) this, (Object) A0W);
            }
            C331157Pu A002 = C72959PQr.A00(A0W, this, 11);
            this.A00 = A002;
            A002.A02(this.A0H, A0K2);
            this.A01 = true;
            C70948OSv.A01.A04(userSession, this.A0G);
            1a8 r3 = this.A0I;
            C70844ONw oNw = this.A02;
            r3.A02(oNw.A00(this.A0K), PTR.A00);
            r3.A02(oNw.A01(this.A0L), PTS.A00);
        }
    }

    public final boolean A05() {
        return this.A01;
    }

    public final View A06(Context context) {
        return C66584MXp.A09(context);
    }
}
