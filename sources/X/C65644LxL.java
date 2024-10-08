package X;

import android.app.Activity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.LxL  reason: case insensitive filesystem */
public final class C65644LxL implements C66461MSp {
    public final /* synthetic */ AnonymousClass818 A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C311296cS A03;

    public C65644LxL(AnonymousClass818 r1, AnonymousClass4DH r2, C255773uh r3, C311296cS r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void afterSelection(boolean z) {
        if (z) {
            String A0n = C51972G9s.A0n();
            C311296cS r2 = this.A03;
            r2.A09.DkA(this.A02, A0n);
            AnonymousClass4DH r1 = this.A01;
            if (r2.A01 && r1.getContext() != null) {
                CallerContext callerContext = C62052KYa.A02;
                LRS.A01(r1.requireContext(), AnonymousClass05K.A0N, 0);
                return;
            }
            return;
        }
        Activity rootActivity = this.A01.getRootActivity();
        if (rootActivity != null) {
            C311296cS r0 = this.A03;
            C255773uh r6 = this.A02;
            AnonymousClass818 r3 = this.A00;
            UserSession userSession = r0.A07;
            AnonymousClass819 r4 = AnonymousClass819.ACTIONSHEET_SINGLE_SHARE_STORY;
            boolean z2 = r0.A01;
            W2A.A00(rootActivity, r0.A04, r3, r4, userSession, r6, r0.A08, r0.A09, z2);
        }
    }
}
