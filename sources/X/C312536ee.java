package X;

import com.facebook.breakpad.BreakpadManager;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6ee  reason: invalid class name and case insensitive filesystem */
public final class C312536ee implements C312546ef {
    public static final C312556eg A0B = new Object();
    public AnonymousClass82L A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final XAnalyticsHolder A07;
    public final C60640iu A08;
    public final 0kQ A09;
    public final 0lg A0A;

    public C312536ee(0lg r4) {
        0qQ.A0B(r4, 1);
        this.A0A = r4;
        this.A08 = C60510iO.A00(r4);
        0kQ r1 = new 0kQ((ImmutableMap) null, r4, "IgXAnalyticsAdapter");
        this.A09 = r1;
        this.A07 = new XAnalyticsAdapterHolder(r1);
    }

    public final void DOt(String str, String str2) {
        0qQ.A0B(str, 0);
        if (this.A01 == null) {
            0wb.A03("AREngineServices::CameraARAnalyticsLogger::onLoggedRawEvent", "Log before product information is set.");
            return;
        }
        0xI A012 = 0xI.A01(str, (String) null);
        A012.A0C("camera_product_name", this.A01);
        A012.A0C("product_session_id", this.A06);
        A012.A0C("effect_id", this.A03);
        A012.A0C(AnonymousClass000.A00(1294), this.A04);
        A012.A0C("delivery_operation_id", this.A02);
        A012.A0C("effect_session_id", this.A05);
        UserSession userSession = this.A0A;
        if (userSession instanceof UserSession) {
            String str3 = userSession.A05;
            int A042 = 00l.A04(str3, ':', 0);
            if (A042 != -1) {
                str3 = str3.substring(A042 + 1);
                0qQ.A07(str3);
            }
            A012.A0C("ig_userid", str3);
        }
        if (str2 != null) {
            try {
                A012.A04(C312556eg.A00(A0B, new JSONObject(str2)));
            } catch (JSONException e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                0wb.A03("AREngineServices::CameraARAnalyticsLogger::onLoggedRawEvent", message);
            }
        }
        this.A08.EFq(A012);
    }

    public final void EZn(C312596el r2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A06 = str6;
        AnonymousClass82L r0 = this.A00;
        if (r0 != null) {
            r0.Csw(str5);
        }
    }

    public final String BgN() {
        String str = this.A01;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final XAnalyticsHolder CGu() {
        return this.A07;
    }

    public final void DOu(boolean z) {
        boolean isActive = BreakpadManager.isActive();
        if (z) {
            if (isActive) {
                BreakpadManager.setCustomData("CAMERA_CORE_PRODUCT_NAME", this.A01, new Object[0]);
                BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_ID", this.A03, new Object[0]);
                BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID", this.A04, new Object[0]);
            }
            DOt("camera_ar_session", (String) null);
        } else if (isActive) {
            BreakpadManager.removeCustomData("CAMERA_CORE_PRODUCT_NAME");
            BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_ID");
            BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID");
        }
    }

    public final void Ek3(AnonymousClass82L r1) {
        this.A00 = r1;
    }
}
