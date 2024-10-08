package X;

import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

public final class LPB {
    public List A00 = 0sn.A00;
    public final LoggingFanData A01;
    public final C64160LRb A02;
    public final UserSession A03;

    public final void A01(C62560Khq khq, String str, String str2, String str3, List list, int i) {
        C51974G9v.A1K(khq, str, list);
        0qQ.A0B(str2, 4);
        C60776Jr7 A002 = A00(khq, this, (Integer) null);
        JTR.A1K(A002, i);
        A002.A06("gift_id", str);
        A002.A07("gift_options", list);
        this.A02.A02(A002, this.A01.A03, str2, (String) null, str3, 0Yt.A0E());
    }

    public final void A05(String str, int i) {
        0qQ.A0B(str, 0);
        C60776Jr7 A002 = A00(C62560Khq.Animation, this, (Integer) null);
        JTR.A1K(A002, i);
        A002.A06("gift_id", str);
        A002.A07("gift_options", this.A00);
        C64160LRb lRb = this.A02;
        String str2 = this.A01.A03;
        0sm A0E = 0Yt.A0E();
        DbY.A1S(str2, A0E);
        0Aj A0e = AnonymousClass7TE.A0e(lRb.A02, "client_load_appreciationgiver_display");
        if (A0e.isSampled()) {
            C64160LRb.A00(A0e, lRb, str2);
            JTU.A0t(lRb.A01, A0e, A002);
            JTT.A1A(A0e, A0E);
        }
    }

    public static final C60776Jr7 A00(C62560Khq khq, LPB lpb, Integer num) {
        String str;
        String str2 = lpb.A03.A06;
        LoggingFanData loggingFanData = lpb.A01;
        String str3 = loggingFanData.A00;
        String str4 = loggingFanData.A02;
        String str5 = loggingFanData.A01;
        String str6 = khq.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "add_to_balance";
                    break;
                case 2:
                    str = "send";
                    break;
                case 3:
                    str = "appreciation_balance";
                    break;
                case 4:
                    str = "buy_and_send";
                    break;
                case 5:
                    str = "back";
                    break;
                default:
                    str = "select_gift";
                    break;
            }
        } else {
            str = null;
        }
        C51974G9v.A1P(str3, str4, str5, str6);
        0bb r1 = new 0bb();
        r1.A06("sender_id", str2);
        r1.A06("receiver_id", str3);
        r1.A06("media_id", str4);
        r1.A06("view_name", str6);
        r1.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
        if (str != null && !00l.A0W(str)) {
            r1.A06("target_name", str);
        }
        return r1;
    }

    public final void A04(String str) {
        this.A02.A02(A00(C62560Khq.Gift, this, (Integer) null), this.A01.A03, "query_gifts_failure", (String) null, str, 0Yt.A0E());
    }

    public /* synthetic */ LPB(LoggingFanData loggingFanData, AnonymousClass0iw r4, UserSession userSession) {
        C64160LRb lRb = new C64160LRb(AnonymousClass0kN.A01(r4, userSession));
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = loggingFanData;
        this.A02 = lRb;
    }

    public final void A02(C62560Khq khq, String str, List list, int i) {
        AnonymousClass7TG.A1P(str, list);
        C60776Jr7 A002 = A00(khq, this, (Integer) null);
        JTR.A1K(A002, i);
        A002.A06("gift_id", str);
        A002.A07("gift_options", list);
        this.A02.A03(A002, this.A01.A03, 0Yt.A0E());
    }

    public final void A03(C62560Khq khq, String str, List list, int i) {
        C51974G9v.A1K(khq, str, list);
        C60776Jr7 A002 = A00(khq, this, (Integer) null);
        JTR.A1K(A002, i);
        A002.A06("gift_id", str);
        A002.A07("gift_options", list);
        this.A02.A04(A002, this.A01.A03, 0Yt.A0E());
    }
}
