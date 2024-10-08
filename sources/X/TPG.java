package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.GradientBackgroundVideoFilter;

public final class TPG implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public TPG(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final Object invoke() {
        if (this.A00 != 0) {
            GradientBackgroundVideoFilter gradientBackgroundVideoFilter = new GradientBackgroundVideoFilter((UserSession) this.A03, (Context) this.A02, !((C14273Tsw) this.A01).A0P);
            gradientBackgroundVideoFilter.A01();
            return gradientBackgroundVideoFilter;
        }
        return C7288Q2n.A01((C276634te) this.A02, (C13751TgN) this.A03, (C276544tV) this.A01);
    }
}
