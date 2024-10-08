package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.43T  reason: invalid class name */
public final class AnonymousClass43T {
    public final 0wc A00;

    public final void A00(String str, String str2) {
        String str3;
        0qQ.A0B(str, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_thread_fetch_success_rate");
        A002.AAJ("action", "error");
        A002.AAJ("fetch_uuid", str);
        if (str2 == null) {
            str3 = "snapshot";
        } else {
            str3 = "paging_new";
        }
        A002.AAJ("fetch_type", str3);
        A002.Cgf();
    }

    public final void A01(String str, String str2) {
        String str3;
        0qQ.A0B(str, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_thread_fetch_success_rate");
        A002.AAJ("action", "retry");
        A002.AAJ("fetch_uuid", str);
        if (str2 == null) {
            str3 = "snapshot";
        } else {
            str3 = "paging_new";
        }
        A002.AAJ("fetch_type", str3);
        A002.Cgf();
    }

    public final void A02(String str, String str2) {
        String str3;
        0qQ.A0B(str, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_thread_fetch_success_rate");
        A002.AAJ("action", RealtimeConstants.SEND_SUCCESS);
        A002.AAJ("fetch_uuid", str);
        if (str2 == null) {
            str3 = "snapshot";
        } else {
            str3 = "paging_new";
        }
        A002.AAJ("fetch_type", str3);
        A002.Cgf();
    }

    public final void A03(String str, String str2, String str3) {
        String str4;
        0qQ.A0B(str, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_thread_fetch_success_rate");
        A002.AAJ("action", RealtimeConstants.SEND_ATTEMPT);
        A002.AAJ("fetch_uuid", str);
        if (str3 == null) {
            str4 = "snapshot";
        } else {
            str4 = "paging_new";
        }
        A002.AAJ("fetch_type", str4);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A002.AAJ("oldest_cursor", str3);
        A002.Cgf();
    }

    public final void A04(String str, String str2, String str3) {
        String str4;
        0qQ.A0B(str, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_thread_fetch_success_rate");
        A002.AAJ("action", "intent");
        A002.AAJ("fetch_uuid", str);
        if (str3 == null) {
            str4 = "snapshot";
        } else {
            str4 = "paging_new";
        }
        A002.AAJ("fetch_type", str4);
        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A002.AAJ("oldest_cursor", str3);
        A002.Cgf();
    }

    public AnonymousClass43T(0wc r1) {
        this.A00 = r1;
    }
}
