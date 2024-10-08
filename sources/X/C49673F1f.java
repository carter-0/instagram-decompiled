package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.F1f  reason: case insensitive filesystem */
public final class C49673F1f {
    public final 0wc A00;

    public C49673F1f(0lg r2, String str) {
        0xG r0;
        0qQ.A0B(r2, 1);
        if (str != null) {
            r0 = DbS.A0O(str);
        } else {
            r0 = null;
        }
        this.A00 = AnonymousClass0kN.A01(r0, r2);
    }

    public final void A00(Integer num) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "rage_shake_action");
        if (A0e.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str = "turn_on";
                    break;
                case 1:
                    str = "turn_off";
                    break;
                case 2:
                    str = "report_bug";
                    break;
                case 3:
                    str = "cancel";
                    break;
                case 4:
                    str = "cancel_navigation";
                    break;
                case 5:
                    str = "cancel_dont_send";
                    break;
                case 6:
                    str = "learn_more_abuse_or_spam";
                    break;
                case 7:
                    str = "learn_more_data_policy";
                    break;
                case 8:
                    str = "submit_clicked_success";
                    break;
                case 9:
                    str = "submit_clicked_failed_missing_description";
                    break;
                case 10:
                    str = "submit_clicked_failed_processing_logs";
                    break;
                case 11:
                    str = "submit_clicked_failed_processing_previous_submit";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "retry_launched";
                    break;
                default:
                    str = "bug_submit_failure_dismiss";
                    break;
            }
            DbV.A1G(A0e, str);
        }
    }
}
