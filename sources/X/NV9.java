package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

public final class NV9 extends NVB {
    public final UserSession A00;

    public final void A01(NVH nvh) {
        super.A01(nvh);
        Integer num = nvh.A01.A04;
        if (num != null) {
            Context A07 = DbS.A07(this);
            TextView textView = (TextView) this.A02.A0I.getView();
            0qQ.A0A(A07);
            textView.setText(1G0.A08(A07, (long) num.intValue()));
            DbT.A17(A07, textView, 2Yu.A0A(A07));
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NV9(View view, UserSession userSession, OLM olm, int i, boolean z) {
        super(view, userSession, olm, i, z);
        AnonymousClass7TG.A1O(userSession, olm);
        this.A00 = userSession;
    }
}
