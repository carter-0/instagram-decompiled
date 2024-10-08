package X;

import android.os.Bundle;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Vfo  reason: case insensitive filesystem */
public final class C17777Vfo {
    public final XB6 A00;

    public final void A00(String str, boolean z) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        XB6 xb6 = this.A00;
        if (z) {
            str2 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        xb6.Cgq((Bundle) null, str3, "lead_gen_form_list", AnonymousClass000.A00(259), str2);
    }

    public C17777Vfo(XB6 xb6) {
        this.A00 = xb6;
    }
}
