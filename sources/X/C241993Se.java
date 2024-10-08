package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.3Se  reason: invalid class name and case insensitive filesystem */
public abstract class C241993Se {
    public static void A00(17Z r3, C241953Sa r4) {
        String str = r4.A01;
        if (str != null) {
            r3.A0R("client_context", str);
        }
        String str2 = r4.A04;
        if (str2 != null) {
            r3.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        }
        String str3 = r4.A02;
        if (str3 != null) {
            r3.A0R("item_id", str3);
        }
        String str4 = r4.A03;
        if (str4 != null) {
            r3.A0R("original_message_client_context", str4);
        }
        r3.A0Q("date_created_ms", r4.A00);
    }

    public static void A01(16F r3, C241953Sa r4, String str) {
        String str2 = null;
        if ("client_context".equals(str)) {
            if (r3.A11() != 16L.A0G) {
                str2 = r3.A1P();
            }
            r4.A01 = str2;
        } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(str) || "story_id".equals(str)) {
            if (r3.A11() != 16L.A0G) {
                str2 = r3.A1P();
            }
            r4.A04 = str2;
        } else if ("item_id".equals(str)) {
            if (r3.A11() != 16L.A0G) {
                str2 = r3.A1P();
            }
            r4.A02 = str2;
        } else if ("original_message_client_context".equals(str)) {
            if (r3.A11() != 16L.A0G) {
                str2 = r3.A1P();
            }
            r4.A03 = str2;
        } else if ("date_created_ms".equals(str) || "task_creation_time_ms".equals(str) || "timestamp".equals(str)) {
            r4.A00 = r3.A0y();
        }
    }
}
