package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Va  reason: invalid class name and case insensitive filesystem */
public final class C242573Va {
    public static int A01 = -1;
    public final UserSession A00;

    public C242573Va(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Integer num, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36316860475708092L)) {
            String A002 = C55160HdC.A00(num);
            1Zp A012 = 1Zm.A00(userSession).A01(AnonymousClass05K.A03, AnonymousClass05K.A01, false);
            A012.A03("PRIMARY_REASON", A002);
            A012.A03("ADS_SURFACE", str);
            if (str2 == null) {
                str2 = "";
            }
            A012.A03("ad_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            A012.A03("media_id", str3);
            A012.A03("logview_group_by", "PRIMARY_REASON");
            A012.A00();
        }
    }

    public final void A01(String str, int i, long j, boolean z) {
        0qQ.A0B(str, 3);
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36316860475511481L) && i != 0) {
            1Zp A012 = 1Zm.A00(userSession).A01(AnonymousClass05K.A03, AnonymousClass05K.A0C, false);
            A012.A03("ADS_SURFACE", str);
            A012.A03("is_first_request", String.valueOf(z));
            A012.A03("time_elapsed_since_request_start_ms", String.valueOf(j));
            A012.A03(TraceFieldType.StatusCode, String.valueOf(i));
            A012.A03("logview_group_by", "ADS_SURFACE");
            A012.A00();
        }
    }

    public final void A02(String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36316860475708092L)) {
            1Zp A012 = 1Zm.A00(userSession).A01(AnonymousClass05K.A03, AnonymousClass05K.A01, false);
            A012.A03("PRIMARY_REASON", str);
            A012.A03("ADS_SURFACE", str2);
            if (str3 == null) {
                str3 = "";
            }
            A012.A03("ad_id", str3);
            if (str4 == null) {
                str4 = "";
            }
            A012.A03("media_id", str4);
            A012.A03("logview_group_by", "PRIMARY_REASON");
            A012.A00();
        }
    }
}
