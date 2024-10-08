package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ae8  reason: case insensitive filesystem */
public final class C40561Ae8 implements C226172fn {
    public final /* synthetic */ C359318cb A00;

    public final void DmF(Integer num, float f) {
        0qQ.A0B(num, 1);
        if (num == AnonymousClass05K.A0N) {
            C359318cb r4 = this.A00;
            UserSession userSession = r4.A0b;
            if (AnonymousClass7TE.A0q(userSession).getInt("edit_clips_button_badge_nux", 0) == 0) {
                AnonymousClass7TG.A1M(AnonymousClass7TE.A0q(userSession), "edit_clips_button_badge_nux", 1);
                View view = r4.A02;
                if (view != null) {
                    C359318cb.A03(view, r4);
                }
            }
        }
    }

    public C40561Ae8(C359318cb r1) {
        this.A00 = r1;
    }
}
