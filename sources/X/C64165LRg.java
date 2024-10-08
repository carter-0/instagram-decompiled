package X;

import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.LRg  reason: case insensitive filesystem */
public final class C64165LRg {
    public List A00 = 0sn.A00;
    public final LoggingFanData A01;
    public final C64160LRb A02;
    public final UserSession A03;

    public final void A03(int i, Integer num) {
        C60776Jr7 A002 = A00(this, num, (Integer) null);
        JTR.A1K(A002, i);
        A002.A07("star_package_options", this.A00);
        C64160LRb lRb = this.A02;
        String str = this.A01.A03;
        0sm A0E = 0Yt.A0E();
        DbY.A1S(str, A0E);
        0Aj A0e = AnonymousClass7TE.A0e(lRb.A02, "client_load_appreciationgiver_display");
        if (A0e.isSampled()) {
            C64160LRb.A00(A0e, lRb, str);
            JTU.A0t(lRb.A01, A0e, A002);
            JTT.A1A(A0e, A0E);
        }
    }

    public final void A04(Integer num, int i, boolean z) {
        C60776Jr7 A002 = A00(this, num, (Integer) null);
        JTR.A1K(A002, i);
        A002.A07("star_package_options", this.A00);
        this.A02.A04(A002, this.A01.A03, AnonymousClass7TF.A0w("packs_hit_cache", String.valueOf(z)));
    }

    public final void A05(Integer num, String str, String str2, String str3, String str4, int i) {
        AnonymousClass7TG.A1Q(str, str2);
        C60776Jr7 A002 = A00(this, num, AnonymousClass05K.A00);
        JTR.A1K(A002, i);
        A01(A002, this, str).A02(A002, this.A01.A03, str2, str3, str4, 0Yt.A0E());
    }

    public final void A06(String str, int i, Integer num) {
        0qQ.A0B(str, 2);
        C60776Jr7 A002 = A00(this, num, AnonymousClass05K.A00);
        JTR.A1K(A002, i);
        A01(A002, this, str).A04(A002, this.A01.A03, 0Yt.A0E());
    }

    public static final C60776Jr7 A00(C64165LRg lRg, Integer num, Integer num2) {
        String str;
        String str2;
        String str3 = lRg.A03.A06;
        LoggingFanData loggingFanData = lRg.A01;
        String str4 = loggingFanData.A00;
        String str5 = loggingFanData.A02;
        String str6 = loggingFanData.A01;
        if (num.intValue() != 0) {
            str = "appreciation_buy_and_send";
        } else {
            str = "appreciation_balance";
        }
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "star_package_option";
                    break;
                case 2:
                    str2 = "stars_terms";
                    break;
                case 3:
                    str2 = "payment_terms";
                    break;
                case 4:
                    str2 = "learn_more";
                    break;
                case 5:
                    str2 = "back";
                    break;
                case 6:
                    str2 = "flow_canceled";
                    break;
                default:
                    str2 = "purchase_outside";
                    break;
            }
        } else {
            str2 = null;
        }
        C51974G9v.A1P(str4, str5, str6, str);
        0bb r1 = new 0bb();
        r1.A06("sender_id", str3);
        r1.A06("receiver_id", str4);
        r1.A06("media_id", str5);
        r1.A06("view_name", str);
        r1.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str6);
        if (str2 != null && !00l.A0W(str2)) {
            r1.A06("target_name", str2);
        }
        return r1;
    }

    public static C64160LRb A01(0bb r2, C64165LRg lRg, String str) {
        r2.A06("star_package_id", str);
        r2.A07("star_package_options", lRg.A00);
        return lRg.A02;
    }

    public final void A02(int i, Integer num) {
        C60776Jr7 A002 = A00(this, num, AnonymousClass05K.A0j);
        JTR.A1K(A002, i);
        A002.A07("star_package_options", this.A00);
        C64160LRb lRb = this.A02;
        String str = this.A01.A03;
        0sm A0E = 0Yt.A0E();
        DbY.A1S(str, A0E);
        0Aj A0e = AnonymousClass7TE.A0e(lRb.A02, "user_click_appreciationgiver_exit");
        if (A0e.isSampled()) {
            C64160LRb.A00(A0e, lRb, str);
            JTU.A0t(lRb.A01, A0e, A002);
            JTT.A1A(A0e, A0E);
        }
    }

    public /* synthetic */ C64165LRg(LoggingFanData loggingFanData, AnonymousClass0iw r4, UserSession userSession) {
        C64160LRb lRb = new C64160LRb(AnonymousClass0kN.A01(r4, userSession));
        this.A03 = userSession;
        this.A01 = loggingFanData;
        this.A02 = lRb;
    }
}
