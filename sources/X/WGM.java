package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class WGM implements X9S {
    public final C17770Vfh A00;

    private void A02(Bundle bundle) {
        C17968Vj2 A002 = this.A00.A00("ccu_contacts_upload_failed_event");
        String string = bundle.getString(TraceFieldType.FailureReason);
        0xI r2 = A002.A00;
        r2.A0C(TraceFieldType.FailureReason, string);
        C13988Tno.A0y(bundle, r2, "failure_message");
        r2.A09("full_upload", DbU.A0g(bundle, "full_upload"));
        A00(bundle, A002, C13988Tno.A0T(bundle, "last_upload_success_time"), "last_upload_success_time");
        C13988Tno.A0y(bundle, r2, "ccu_session_id");
        C13988Tno.A0y(bundle, r2, "source");
        A002.A00();
    }

    public static void A03(0xI r1, String str, String str2, String str3) {
        r1.A0C("action", str);
        if (str2 != null) {
            r1.A0C(str3, str2);
        }
    }

    public final void A04(String str, String str2, long j, long j2, boolean z) {
        C17968Vj2 A002 = this.A00.A00("contact_upload_ccu_setting_check");
        0xI r2 = A002.A00;
        r2.A0C("ccu_setting", str);
        r2.A09("has_os_permission", Boolean.valueOf(z));
        A002.A01("upload_interval_in_ms", Long.valueOf(j));
        A002.A01("last_upload_success_time", Long.valueOf(j2));
        A002.A01("now_in_ms", C51968G9o.A0u());
        if (str2 != null) {
            r2.A0C("family_device_id", str2);
        }
        A002.A00();
    }

    public final void A05(String str, String str2, String str3, String str4) {
        C17968Vj2 A002 = this.A00.A00("contact_upload_entry_event");
        0xI r1 = A002.A00;
        r1.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        r1.A0C("action", str2);
        if (str3 != null) {
            r1.A0C(TraceFieldType.FailureReason, str3);
        }
        if (str4 != null) {
            r1.A0C("fdid", str4);
        }
        A002.A00();
    }

    public final void Cxr(Bundle bundle) {
        C17770Vfh vfh = this.A00;
        C17968Vj2 A002 = vfh.A00("ccu_contacts_upload_information_event");
        0xI r2 = A002.A00;
        r2.A0C("upload_step", "batch_upload_succeed");
        r2.A09("full_upload", DbU.A0g(bundle, "full_upload"));
        A01(bundle, A002, "batch_index");
        A01(bundle, A002, "batch_size");
        A01(bundle, A002, "contacts_upload_count");
        A01(bundle, A002, "add_count");
        A01(bundle, A002, "remove_count");
        A00(bundle, A002, DbV.A0o(bundle, "update_count"), "update_count");
        C13988Tno.A0y(bundle, r2, "ccu_session_id");
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C17968Vj2 A003 = vfh.A00("ccu_upload_contacts_event");
        0xI r0 = A003.A00;
        A03(r0, "batch_upload_succeed", string, "family_device_id");
        if (string2 != null) {
            r0.A0C("ccu_session_id", string2);
        }
        A003.A00();
    }

    public final void D4G(Bundle bundle) {
        C17770Vfh vfh = this.A00;
        C17968Vj2 A002 = vfh.A00("ccu_contacts_upload_succeeded_event");
        Boolean A0g = DbU.A0g(bundle, "full_upload");
        0xI r2 = A002.A00;
        r2.A09("full_upload", A0g);
        A00(bundle, A002, C13988Tno.A0T(bundle, "last_upload_success_time"), "last_upload_success_time");
        C13988Tno.A0y(bundle, r2, "ccu_session_id");
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C17968Vj2 A003 = vfh.A00("ccu_upload_contacts_event");
        if (string2 != null) {
            A003.A00.A0C("ccu_session_id", string2);
        }
        A03(A003.A00, "close_session_success", string, "family_device_id");
        A003.A00();
    }

    public final void D6u(Bundle bundle) {
        C17770Vfh vfh = this.A00;
        C17968Vj2 A002 = vfh.A00("ccu_create_session_check_sync_event");
        Boolean A0g = DbU.A0g(bundle, "in_sync");
        0xI r2 = A002.A00;
        r2.A09("in_sync", A0g);
        C13988Tno.A0y(bundle, r2, "root_hash");
        A00(bundle, A002, C13988Tno.A0T(bundle, "last_upload_success_time"), "last_upload_success_time");
        C13988Tno.A0y(bundle, r2, "ccu_session_id");
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C17968Vj2 A003 = vfh.A00("ccu_upload_contacts_event");
        if (string2 != null) {
            A003.A00.A0C("ccu_session_id", string2);
        }
        A03(A003.A00, "create_session_success", string, "family_device_id");
        A003.A00();
    }

    public final void DYp(Bundle bundle) {
        C17770Vfh vfh = this.A00;
        C17968Vj2 A002 = vfh.A00("ccu_contacts_upload_information_event");
        0xI r3 = A002.A00;
        r3.A0C("upload_step", "batch_upload");
        r3.A09("full_upload", DbU.A0g(bundle, "full_upload"));
        A01(bundle, A002, "batch_index");
        A01(bundle, A002, "batch_size");
        A01(bundle, A002, "contacts_upload_count");
        A01(bundle, A002, "add_count");
        A01(bundle, A002, "remove_count");
        A00(bundle, A002, DbV.A0o(bundle, "update_count"), "update_count");
        C13988Tno.A0y(bundle, r3, "ccu_session_id");
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C17968Vj2 A003 = vfh.A00("ccu_upload_contacts_event");
        0xI r0 = A003.A00;
        A03(r0, "batch_upload_start", string, "family_device_id");
        if (string2 != null) {
            r0.A0C("ccu_session_id", string2);
        }
        A003.A00();
    }

    public final void DYq(Bundle bundle) {
        C17770Vfh vfh = this.A00;
        C17968Vj2 A002 = vfh.A00("ccu_contacts_upload_information_event");
        0xI r3 = A002.A00;
        r3.A0C("upload_step", "close_session");
        r3.A09("full_upload", DbU.A0g(bundle, "full_upload"));
        A01(bundle, A002, "total_batch_count");
        A01(bundle, A002, "contacts_upload_count");
        A01(bundle, A002, "add_count");
        A01(bundle, A002, "remove_count");
        A01(bundle, A002, "update_count");
        A01(bundle, A002, "phonebook_size");
        A00(bundle, A002, C13988Tno.A0T(bundle, "max_contacts_to_upload"), "max_contacts_to_upload");
        String string = bundle.getString("ccu_session_id");
        if (string != null) {
            r3.A0C("ccu_session_id", string);
        }
        A002.A00();
        String string2 = bundle.getString("family_device_id");
        String string3 = bundle.getString("ccu_session_id");
        C17968Vj2 A003 = vfh.A00("ccu_upload_contacts_event");
        0xI r0 = A003.A00;
        A03(r0, "close_session_start", string2, "family_device_id");
        if (string3 != null) {
            r0.A0C("ccu_session_id", string3);
        }
        A003.A00();
    }

    public final void DYs(Bundle bundle) {
        String string = bundle.getString("family_device_id");
        C17968Vj2 A002 = this.A00.A00("ccu_upload_contacts_event");
        A03(A002.A00, "pre_ccu_check", string, "family_device_id");
        A002.A00();
    }

    public final void Dmf(Bundle bundle) {
        C17770Vfh vfh = this.A00;
        C17968Vj2 A002 = vfh.A00("ccu_contacts_upload_information_event");
        0xI r2 = A002.A00;
        r2.A0C("upload_step", "create_session");
        r2.A09("full_upload", DbU.A0g(bundle, "full_upload"));
        C13988Tno.A0y(bundle, r2, "source");
        A01(bundle, A002, "batch_size");
        A01(bundle, A002, "num_of_retries");
        A01(bundle, A002, "contacts_upload_count");
        A002.A01("time_spent", C13988Tno.A0T(bundle, "time_spent"));
        A002.A00();
        String string = bundle.getString("family_device_id");
        C17968Vj2 A003 = vfh.A00("ccu_upload_contacts_event");
        A03(A003.A00, "create_session_start", string, "family_device_id");
        A003.A00();
    }

    public final void Dvf(Bundle bundle) {
        C17770Vfh vfh = this.A00;
        C17968Vj2 A002 = vfh.A00("ccu_contacts_upload_failed_event");
        A002.A00.A0C(TraceFieldType.FailureReason, bundle.getString(TraceFieldType.FailureReason));
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString(TraceFieldType.FailureReason);
        C17968Vj2 A003 = vfh.A00("ccu_upload_contacts_event");
        0xI r0 = A003.A00;
        A03(r0, "pre_ccu_check_failed", string, "family_device_id");
        if (string2 != null) {
            r0.A0C(TraceFieldType.FailureReason, string2);
        }
        A003.A00();
    }

    public WGM(C17770Vfh vfh) {
        this.A00 = vfh;
    }

    public static void A00(BaseBundle baseBundle, C17968Vj2 vj2, Number number, String str) {
        vj2.A01(str, number);
        vj2.A01("time_spent", Long.valueOf(baseBundle.getLong("time_spent")));
        vj2.A01("num_of_retries", Integer.valueOf(baseBundle.getInt("num_of_retries")));
    }

    public static void A01(BaseBundle baseBundle, C17968Vj2 vj2, String str) {
        vj2.A01(str, Integer.valueOf(baseBundle.getInt(str)));
    }

    public final void Cxq(Bundle bundle) {
        A02(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C17968Vj2 A002 = this.A00.A00("ccu_upload_contacts_event");
        0xI r0 = A002.A00;
        A03(r0, "batch_upload_failure", string, "family_device_id");
        if (string2 != null) {
            r0.A0C("ccu_session_id", string2);
        }
        A002.A00();
    }

    public final void D6t(Bundle bundle) {
        A02(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString(TraceFieldType.FailureReason);
        String string3 = bundle.getString("ccu_session_id");
        C17968Vj2 A002 = this.A00.A00("ccu_upload_contacts_event");
        0xI r0 = A002.A00;
        A03(r0, "create_session_failure", string2, TraceFieldType.FailureReason);
        if (string != null) {
            r0.A0C("family_device_id", string);
        }
        if (string3 != null) {
            r0.A0C("ccu_session_id", string3);
        }
        A002.A00();
    }
}
