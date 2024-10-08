package X;

import android.content.Context;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;

public final class PFX implements C51871G5i {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public PFX(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void D6I() {
        if (this.A00 != 0) {
            C71153OeR.A0C((C67058MhZ) this.A03, (C71153OeR) this.A01, (C254743sy) this.A02);
            return;
        }
        C66633Ma2 ma2 = (C66633Ma2) this.A03;
        UserSession A0p = ma2.A0p();
        Context requireContext = ma2.A1J.requireContext();
        AnonymousClass2Ep r8 = (AnonymousClass2Ep) this.A02;
        C66633Ma2.A0A((RectF) this.A01, 28D.A2K, ma2, C71046OaO.A01(requireContext, A0p, (C254933tI) null, r8, r8.C6C(), 0), r8.BJy());
    }
}
