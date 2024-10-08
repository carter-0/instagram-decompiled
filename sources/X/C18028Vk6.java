package X;

import android.os.Bundle;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Vk6  reason: case insensitive filesystem */
public final class C18028Vk6 {
    public final XB6 A00;

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        XB6.A02(this.A00, str, "lead_gen_manage_lead_forms_and_cta", AnonymousClass000.A00(2679));
    }

    public final void A01(String str, boolean z) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        XB6 xb6 = this.A00;
        if (z) {
            str2 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        xb6.Cgq((Bundle) null, str3, "lead_gen_manage_lead_forms_and_cta", "access_token_query", str2);
    }

    public final void A02(String str, boolean z) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        XB6 xb6 = this.A00;
        if (z) {
            str2 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        xb6.Cgq((Bundle) null, str3, "lead_gen_manage_lead_forms_and_cta", AnonymousClass000.A00(259), str2);
    }

    public C18028Vk6(XB6 xb6) {
        this.A00 = xb6;
    }
}
