package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7BH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7BH implements View.OnClickListener {
    public final /* synthetic */ C329067Hl A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass7BH(C329067Hl r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onClick(View view) {
        List BRV;
        C69319NjK njK;
        C329067Hl r5 = this.A00;
        boolean z = this.A01;
        if (!z) {
            UserSession userSession = r5.A1Z;
            0qQ.A0B(userSession, 0);
            ((C71867Os9) userSession.A01(C71867Os9.class, new C73661Pha(userSession, 27))).A00("direct_thread");
        }
        2Eq r0 = (2Eq) r5.A22.get();
        if (r0 == null) {
            BRV = null;
        } else {
            BRV = r0.BRV();
        }
        r5.A1d.A02(r5.A1z, BRV, C329067Hl.A0x(r5), r5.A28);
        if (z) {
            njK = C69319NjK.DIRECT_COMPOSER_STICKER_SHORTCUT;
        } else {
            njK = C69319NjK.DIRECT_COMPOSER_STICKER_BUTTON;
        }
        r5.A1L(njK, C329067Hl.A0C(r5), "");
    }
}
