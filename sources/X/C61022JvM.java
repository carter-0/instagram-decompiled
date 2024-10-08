package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JvM  reason: case insensitive filesystem */
public final class C61022JvM extends AnonymousClass0T0 {
    public Double A00;
    public Double A01;
    public Long A02;
    public boolean A03;
    public Long A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final int A0C;

    public C61022JvM(Double d, Double d2, Long l, Long l2, String str, String str2, String str3, String str4, int i, int i2, int i3, long j, boolean z) {
        0qQ.A0B(str, 1);
        this.A08 = str;
        this.A07 = j;
        this.A0C = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A00 = d;
        this.A01 = d2;
        this.A03 = z;
        this.A02 = l;
        this.A04 = l2;
    }

    public final C283155Gi A01(UserSession userSession) {
        StringBuilder sb;
        C46518DgL dgL;
        String A0l;
        Map map;
        C283155Gi r1;
        String str;
        int i;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        int i2 = this.A05;
        if (i2 == 1) {
            sb = AnonymousClass7TF.A0n("ig://");
            dgL = C46518DgL.A2f;
            sb.append(dgL.A00);
            sb.append("?deviceId=");
            sb.append(this.A06);
            sb.append("&ids=");
            A0l = AnonymousClass7TF.A0l(this.A08, sb);
        } else if (i2 != 2) {
            A0l = "";
        } else {
            sb = AnonymousClass7TF.A0n("ig://");
            dgL = C46518DgL.A2e;
            sb.append(dgL.A00);
            sb.append("?deviceId=");
            sb.append(this.A06);
            sb.append("&ids=");
            A0l = AnonymousClass7TF.A0l(this.A08, sb);
        }
        0eP A1L = AnonymousClass7TE.A1L("destination", A0l);
        0eP A1L2 = AnonymousClass7TE.A1L("icon_url", "https://i.instagram.com/static/images/activity/info-1.5.png/3385260677b8.png");
        0eP A1L3 = AnonymousClass7TE.A1L("rich_text", A00());
        0eP A1L4 = AnonymousClass7TE.A1L("timestamp", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.A07)));
        Map A0w = AnonymousClass7TF.A0w("action_type", "hide");
        boolean A062 = 182.A06(0Tu.A06, userSession2, 36321481861375413L);
        C283155Gi r2 = null;
        if (A062) {
            map = AnonymousClass7TF.A0w("action_type", AnonymousClass000.A00(385));
        } else {
            map = null;
        }
        Map[] mapArr = {A0w, map};
        0qQ.A0B(mapArr, 0);
        LinkedHashMap A063 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("inline_controls", 03t.A0I(mapArr)), AnonymousClass7TE.A1L("highlight_config", AnonymousClass7TF.A0w(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "unseen"))});
        try {
            0eP A1L5 = AnonymousClass7TE.A1L("pk", 002.A0W("security_alert/", this.A08, '/', this.A06));
            0eP A1L6 = AnonymousClass7TE.A1L("args", A063);
            if (i2 == 1) {
                str = "local_key_change_security_alert";
            } else if (i2 != 2) {
                str = "unknown";
            } else {
                str = "local_login_security_alert";
            }
            0eP A1L7 = AnonymousClass7TE.A1L("notif_name", str);
            if (i2 != 1) {
                i = 1519;
                if (i2 != 2) {
                    i = 0;
                }
            } else {
                i = 1520;
            }
            r1 = C283145Gh.parseFromJson(16P.A00(JTQ.A0c(0Yt.A06(new 0eP[]{A1L5, A1L6, A1L7, AnonymousClass7TF.A0x("story_type", i), AnonymousClass7TF.A0x(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C283195Gm.CAMPAIGN_MESSAGE.A00)}))));
        } catch (Throwable th) {
            r1 = JTO.A1B(th);
        }
        if (!(r1 instanceof 0eQ)) {
            r2 = r1;
        }
        return r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61022JvM) {
                C61022JvM jvM = (C61022JvM) obj;
                if (!0qQ.A0K(this.A08, jvM.A08) || this.A07 != jvM.A07 || this.A0C != jvM.A0C || this.A05 != jvM.A05 || this.A06 != jvM.A06 || !0qQ.A0K(this.A09, jvM.A09) || !0qQ.A0K(this.A0A, jvM.A0A) || !0qQ.A0K(this.A0B, jvM.A0B) || !0qQ.A0K(this.A00, jvM.A00) || !0qQ.A0K(this.A01, jvM.A01) || this.A03 != jvM.A03 || !0qQ.A0K(this.A02, jvM.A02) || !0qQ.A0K(this.A04, jvM.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private final String A00() {
        String str;
        int i = this.A05;
        if (i == 1) {
            String str2 = this.A0A;
            Context context = C60960kU.A00;
            0qQ.A07(context);
            if (str2 != null) {
                str = DbW.A0h(context, str2, 2131964552);
            } else {
                str = context.getString(2131964553);
            }
        } else if (i != 2) {
            return "";
        } else {
            String str3 = this.A09;
            String str4 = this.A0A;
            Context context2 = C60960kU.A00;
            0qQ.A07(context2);
            if (str3 != null) {
                if (str4 != null) {
                    str = DbV.A0u(context2, str4, str3, 2131974840);
                } else {
                    str = DbW.A0h(context2, str3, 2131972956);
                }
            } else if (str4 != null) {
                str = DbW.A0h(context2, str4, 2131974841);
            } else {
                str = context2.getString(2131972953);
            }
        }
        0qQ.A0A(str);
        return str;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A08);
        return ((AnonymousClass7TF.A09(this.A03, (((((((((((((((C51972G9s.A07(this.A07, A0O) + this.A0C) * 31) + this.A05) * 31) + this.A06) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public final String toString() {
        int i;
        String str;
        String A072;
        C66726MbX A002 = C66725MbW.A00(this);
        A002.A01(this.A08, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        A002.A03("createdTimestampMs", this.A07);
        A002.A02("cryptoMailboxType", this.A0C);
        int i2 = this.A05;
        A002.A02("deviceChangeType", i2);
        int i3 = this.A06;
        A002.A02("deviceId", i3);
        A002.A01(this.A09, "location");
        A002.A01(this.A0A, "model");
        A002.A01(this.A0B, "platform");
        A002.A01(this.A00, Location.LATITUDE);
        A002.A01(this.A01, "longitude");
        A002.A04("isConfirmed", this.A03);
        A002.A01(this.A02, "firstReadTimestampMs");
        A002.A01(this.A04, "activityFeedReadTimestampMs");
        A002.A01(A00(), "label");
        if (i2 != 1) {
            i = 1519;
            if (i2 != 2) {
                i = 0;
            }
        } else {
            i = 1520;
        }
        A002.A02("notificationType", i);
        if (i2 == 1) {
            str = "local_key_change_security_alert";
        } else if (i2 != 2) {
            str = "unknown";
        } else {
            str = "local_login_security_alert";
        }
        A002.A01(str, "notificationName");
        if (i2 == 1) {
            A072 = 002.A07(i3, "ig://", "security_alert_key_details", "?deviceId=");
        } else if (i2 != 2) {
            A072 = "";
        } else {
            A072 = "security_alert_login_activity";
        }
        A002.A01(A072, "notificationDestination");
        return DbT.A10(A002);
    }
}
