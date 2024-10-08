package X;

import android.os.Handler;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.business.BusinessInfo;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.registration.model.RegFlowExtras;
import java.util.regex.Pattern;

/* renamed from: X.Fw0  reason: case insensitive filesystem */
public final class C51554Fw0 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ BusinessInfo A03;
    public final /* synthetic */ G69 A04;
    public final /* synthetic */ RegFlowExtras A05;
    public final /* synthetic */ EXD A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public C51554Fw0(Handler handler, AnonymousClass4DH r2, 0lg r3, BusinessInfo businessInfo, G69 g69, RegFlowExtras regFlowExtras, EXD exd, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = regFlowExtras;
        this.A00 = handler;
        this.A09 = str;
        this.A07 = str2;
        this.A03 = businessInfo;
        this.A06 = exd;
        this.A08 = str3;
        this.A04 = g69;
    }

    public final void run() {
        Integer num;
        AnonymousClass0aP r10;
        String str;
        AnonymousClass0aP r8 = this.A02;
        AnonymousClass4DH r7 = this.A01;
        RegFlowExtras regFlowExtras = this.A05;
        Handler handler = this.A00;
        String str2 = this.A09;
        String str3 = this.A07;
        BusinessInfo businessInfo = this.A03;
        EXD exd = this.A06;
        if (exd == EXD.PHONE) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        String str4 = this.A08;
        G69 g69 = this.A04;
        CallerContext callerContext = FRR.A00;
        boolean z = r8 instanceof UserSession;
        if (z) {
            r10 = 09i.A0A.A03(r7.requireActivity());
        } else {
            r10 = r8;
        }
        if (num == AnonymousClass05K.A00) {
            str = "accounts/create_business/";
        } else {
            str = "accounts/create_business_validated/";
        }
        1NY r11 = new 1NY(r10);
        RegFlowExtras.A00(r7.requireContext(), r11, r8, regFlowExtras, true);
        r11.A04();
        r11.A03 = null;
        r11.A0L = true;
        r11.A02 = null;
        r11.A0M = true;
        r11.A0E = str;
        String str5 = str2;
        Pattern pattern = 0mp.A01;
        if (str2 == null) {
            str5 = "";
        }
        r11.A9m(C46476Dff.A01(), str5);
        String str6 = regFlowExtras.A08;
        if (str6 == null) {
            str6 = "";
        }
        r11.A9m("email", str6);
        String str7 = regFlowExtras.A0Q;
        if (str7 == null) {
            str7 = "";
        }
        r11.A9m(C46476Dff.A02(9, 12, 49), str7);
        String str8 = businessInfo.A0J;
        if (str8 == null) {
            str8 = "";
        }
        r11.A9m("page_id", str8);
        String str9 = businessInfo.A09;
        if (str9 == null) {
            str9 = "";
        }
        r11.A9m("category_id", str9);
        boolean z2 = businessInfo.A0S;
        String str10 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str11 = "0";
        String str12 = str11;
        if (z2) {
            str12 = str10;
        }
        r11.A9m("should_show_public_contacts", str12);
        if (!businessInfo.A0Q) {
            str10 = str11;
        }
        r11.A9m("should_show_category", str10);
        C60820jg r3 = 0jh.A04;
        0jh A012 = r3.A01(r10);
        19f r1 = 19f.A1N;
        DbW.A19(r1, r11, A012);
        C49243Erm.A00(r1, r11, r3, r10);
        r11.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        C18559VuB vuB = new C18559VuB(r10);
        String str13 = regFlowExtras.A0P;
        if (str13 == null) {
            str13 = "";
        }
        r11.A9m("enc_password", vuB.A00(str13));
        r11.A0O(0aS.A00, DwQ.class, F7K.class, false);
        16V r12 = businessInfo.A02;
        if (r12 != null) {
            r11.A9m("to_account_type", String.valueOf(r12.A00));
        }
        String str14 = businessInfo.A0I;
        if (TextUtils.isEmpty(str14)) {
            str14 = "instagram";
        }
        r11.A9m("professional_signup_source_user_type", str14);
        String str15 = businessInfo.A0H;
        if (!TextUtils.isEmpty(str15)) {
            r11.A9m("professional_signup_source_page_id", str15);
        }
        String str16 = businessInfo.A0G;
        if (!TextUtils.isEmpty(str16)) {
            r11.A9m("professional_signup_source_account_id", str16);
        } else {
            if (str4 != null) {
                str11 = str4;
            } else if (z) {
                str11 = 0Gl.A02(r8);
            }
            r11.A9m("professional_signup_source_account_id", str11);
        }
        Dbc.A0l(r11, regFlowExtras);
        1OC A0M = r11.A0M();
        Handler handler2 = handler;
        A0M.A00 = new EDZ(r7.requireContext(), handler2, r7.getParentFragmentManager(), r7, r10, r8, businessInfo, g69, exd, exd, str2, str3);
        r7.schedule(A0M);
    }
}
