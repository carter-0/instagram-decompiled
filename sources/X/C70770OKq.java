package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OKq  reason: case insensitive filesystem */
public final class C70770OKq {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void A00(Integer num, String str, String str2, boolean z, boolean z2) {
        Integer num2;
        int i;
        if (!z && num != null && num.intValue() == 2 && str2 != null && !z2) {
            C66748Mbt mbt = new C66748Mbt(this.A02);
            if (C66748Mbt.A00(mbt, str) == null) {
                num2 = AnonymousClass05K.A00;
            } else if (C66748Mbt.A00(mbt, str) == AnonymousClass05K.A0Y) {
                num2 = AnonymousClass05K.A0C;
            } else {
                return;
            }
            1Av r2 = mbt.A00;
            r2.A12(002.A0g("on_device_nudity_banner_state/recipient/", str, "/message_id/"), str2);
            String A0R = 002.A0R("on_device_nudity_banner_state/recipient/", str);
            switch (num2.intValue()) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                default:
                    i = 3;
                    break;
            }
            r2.A0z(A0R, i);
        }
    }

    public C70770OKq(Context context, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
