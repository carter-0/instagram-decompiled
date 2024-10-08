package X;

import android.content.Context;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;

/* renamed from: X.PFd  reason: case insensitive filesystem */
public final class C72673PFd implements C74421Pub {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ C66633Ma2 A01;
    public final /* synthetic */ AnonymousClass2Ep A02;

    public final void D0M(int i) {
    }

    public C72673PFd(RectF rectF, C66633Ma2 ma2, AnonymousClass2Ep r3) {
        this.A01 = ma2;
        this.A02 = r3;
        this.A00 = rectF;
    }

    public final void Dn5(C254743sy r12, int i) {
        C66633Ma2 ma2 = this.A01;
        UserSession A0p = ma2.A0p();
        Context requireContext = ma2.A1J.requireContext();
        AnonymousClass2Ep r8 = this.A02;
        C66633Ma2.A0A(this.A00, 28D.A2K, ma2, C71046OaO.A01(requireContext, A0p, (C254933tI) null, r8, r8.C6C(), 0), r8.BJy());
    }
}
