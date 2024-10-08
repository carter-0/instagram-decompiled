package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

/* renamed from: X.35F  reason: invalid class name */
public final class AnonymousClass35F {
    public final 0wc A00;

    public AnonymousClass35F(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public final void A01(Integer num, ArrayList arrayList, long j) {
        Integer num2;
        String str;
        String A002;
        Integer num3;
        String A003;
        String str2;
        Integer num4 = num;
        0qQ.A0B(num4, 0);
        ArrayList arrayList2 = arrayList;
        if (arrayList == null || arrayList2.isEmpty()) {
            num2 = AnonymousClass05K.A0N;
        } else {
            num2 = AnonymousClass05K.A0C;
        }
        0wc r11 = this.A00;
        0kJ r9 = r11.A00;
        0Aj A004 = r11.A00(r9, "ig4a_ndx_request");
        A004.AAJ("flow_name", "ig_server_eligibility_check");
        if (2 - num2.intValue() != 0) {
            str = "fail_ig_server_filter";
        } else {
            str = "pass_ig_server_filter";
        }
        A004.AAJ("action", str);
        A004.AAJ("step_latency", String.valueOf(j));
        A004.AAJ("ig_appid", "567067343352427");
        String A005 = C49048EoS.A00(num4);
        A004.AAJ("ig_ndx_source", A005);
        A004.Cgf();
        if (arrayList != null && !arrayList2.isEmpty()) {
            for (Integer num5 : AnonymousClass05K.A00(5)) {
                switch (num5.intValue()) {
                    case 1:
                        A002 = "multiple_account";
                        break;
                    case 2:
                        A002 = "phone_number_acquisition";
                        break;
                    case 3:
                        A002 = "email_acquisition";
                        break;
                    case 4:
                        A002 = AnonymousClass000.A00(1559);
                        break;
                    default:
                        A002 = "contact_importer";
                        break;
                }
                if (arrayList2.contains(A002)) {
                    num3 = AnonymousClass05K.A0C;
                } else {
                    num3 = AnonymousClass05K.A0N;
                }
                0Aj A006 = r11.A00(r9, "ig4a_ndx_request");
                switch (num5.intValue()) {
                    case 1:
                        A003 = "multiple_account";
                        break;
                    case 2:
                        A003 = "phone_number_acquisition";
                        break;
                    case 3:
                        A003 = "email_acquisition";
                        break;
                    case 4:
                        A003 = AnonymousClass000.A00(1559);
                        break;
                    default:
                        A003 = "contact_importer";
                        break;
                }
                A006.AAJ("flow_name", A003);
                if (2 - num3.intValue() != 0) {
                    str2 = "fail_ig_server_filter";
                } else {
                    str2 = "pass_ig_server_filter";
                }
                A006.AAJ("action", str2);
                A006.AAJ("ig_appid", "567067343352427");
                A006.AAJ("ig_ndx_source", A005);
                A006.Cgf();
            }
        }
    }

    public final void A00(Integer num, Long l) {
        String str;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig4a_ndx_request");
        A002.AAJ("flow_name", "ndx_immersive_launcher");
        switch (num.intValue()) {
            case 6:
                str = "ndx_steps_found";
                break;
            case 7:
                str = "no_ndx_steps_found";
                break;
            case 8:
                str = "ndx_request_already_finished";
                break;
            case 9:
                str = "ndx_request_error";
                break;
            case 10:
                str = "user_already_seen_ndx";
                break;
            case 11:
                str = "ndx_client_start";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "ndx_client_start_qp";
                break;
            case 13:
                str = "ndx_client_start_error";
                break;
            case 14:
                str = "ndx_client_start_error_qp";
                break;
            case 15:
                str = "ndx_bloks_host_error";
                break;
            case 16:
                str = "ndx_bloks_host_error_qp";
                break;
            case 17:
                str = "device_above_a13_not_running";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str = "device_above_a13_running";
                break;
            case 19:
                str = "device_below_a13_running";
                break;
            default:
                str = "ndx_client_null_activity";
                break;
        }
        A002.AAJ("action", str);
        A002.AAJ("ig_appid", "567067343352427");
        A002.AAJ("ig_ndx_source", "NDX_IG_IMMERSIVE");
        if (l != null) {
            A002.AAJ("step_latency", l.toString());
        }
        A002.Cgf();
    }
}
