package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.95b  reason: invalid class name and case insensitive filesystem */
public abstract class C3733695b {
    public static final void A00(0wc r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        String str8;
        0Aj A00 = r3.A00(r3.A00, "ig_push_token_registration");
        boolean z2 = false;
        if (A00.isSampled()) {
            A00.AAJ(Dbj.A04(0, 9, 98), str4);
            A00.AAJ("device_type", str5);
            if (z) {
                str8 = RealtimeConstants.SEND_SUCCESS;
            } else {
                str8 = "failure";
            }
            A00.AAJ("result", str8);
            A00.AAJ("error", str2);
            A00.AAJ("error_class", str3);
            A00.AAJ("device_sub_type", str6);
            A00.AAJ("event", str);
            z2 = true;
        }
        if (!str7.equals("unknown")) {
            if (z2) {
                A00.AAJ("trigger", str7);
            } else {
                return;
            }
        } else if (!z2) {
            return;
        }
        A00.Cgf();
    }
}
