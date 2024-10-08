package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;

public final class WGD implements X5r {
    public final /* synthetic */ long A00;
    public final /* synthetic */ W3O A01;

    public WGD(W3O w3o, long j) {
        this.A01 = w3o;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ void Dos(Bundle bundle, Object obj) {
        C18031VkB vkB;
        boolean z;
        String str;
        UXF uxf;
        String str2;
        String str3;
        C17210VMo vMo = (C17210VMo) obj;
        W3O w3o = this.A01;
        WGM wgm = w3o.A0R;
        wgm.A05("background_job_new_protocol_remote_setting", "get_remote_settng_success", (String) null, (String) null);
        if (vMo == null || (uxf = vMo.A00) == null || (str2 = uxf.A00) == null) {
            vkB = w3o.A0S;
            vkB.A01(TraceFieldType.FailureReason, "settings_response_invalid");
            z = false;
            str = "get_remote_setting_failed";
        } else {
            long j = this.A00;
            vkB = w3o.A0S;
            vkB.A00("local_permission_checks");
            z = false;
            boolean A1Q = AnonymousClass7TF.A1Q(w3o.A0N.checkCallingOrSelfPermission("android.permission.READ_CONTACTS"));
            vkB.A01("device_permission", String.valueOf(A1Q));
            long A002 = w3o.A0V.A00();
            String str4 = "on";
            boolean equalsIgnoreCase = str2.equalsIgnoreCase(str4);
            vkB.A01("ccu_setting", str2);
            vkB.A01("upload_source", "CCU_BACKGROUND_PING");
            wgm.A05("background_job_new_protocol_remote_setting", "start_ccu_with_remote_setting", (String) null, (String) null);
            if (!equalsIgnoreCase) {
                str4 = "off";
            }
            wgm.A04(str4, (String) null, j, A002, A1Q);
            if (!equalsIgnoreCase) {
                wgm.A05("background_job_new_protocol_remote_setting", "exit_background_job", "no_app_permission", (String) null);
                str3 = "setting_not_on";
            } else if (w3o.A0D) {
                wgm.A05("background_job_new_protocol_remote_setting", "exit_background_job", "ccu_is_running", (String) null);
                str = "ccu_already_running";
                vkB.A01(str, String.valueOf(true));
            } else if (!A1Q) {
                str3 = "no_os_permission";
                wgm.A05("background_job_new_protocol_remote_setting", "exit_background_job", str3, (String) null);
            } else if (System.currentTimeMillis() - A002 < j) {
                wgm.A05("background_job_new_protocol_remote_setting", "exit_background_job", "time_interval", (String) null);
                str = "time_interval_check_failed";
            } else {
                wgm.A05("background_job_new_protocol_remote_setting", "start_contact_upload", (String) null, (String) null);
                w3o.A07();
                return;
            }
            vkB.A02(true, str3);
            return;
        }
        vkB.A02(z, str);
    }

    public final void onFailure(Throwable th) {
        W3O w3o = this.A01;
        w3o.A0R.A05("background_job_new_protocol_remote_setting", "exit_background_job", "get_remote_settng_fail", (String) null);
        C18031VkB vkB = w3o.A0S;
        vkB.A01(TraceFieldType.FailureReason, th.getMessage());
        vkB.A02(false, "get_remote_setting_failed");
    }
}
