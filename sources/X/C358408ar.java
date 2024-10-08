package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8ar  reason: invalid class name and case insensitive filesystem */
public final class C358408ar {
    public AnonymousClass5Gv A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;

    public C358408ar(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        this.A02 = context;
        this.A03 = userSession;
    }

    public final void A00(View view, Integer num, boolean z) {
        if (view != null && view.getVisibility() == 0 && this.A00 == null) {
            if (num.intValue() != 0) {
                UserSession userSession = this.A03;
                if (1Au.A00(userSession).A1h() || this.A01 || 1Au.A00(userSession).A01.getInt("story_private_mention_reshare_tooltip_impression_count", 0) >= 2) {
                    return;
                }
            } else {
                1Av A002 = 1Au.A00(this.A03);
                if (((Boolean) A002.A3z.CDM(A002, 1Av.A8a[193])).booleanValue()) {
                    return;
                }
            }
            view.post(new C41213AqB(view, this, num, z));
        }
    }
}
