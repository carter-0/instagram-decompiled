package X;

import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.9r4  reason: invalid class name and case insensitive filesystem */
public final class C390309r4 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelNotifyMeShareFragment";

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        AnonymousClass80D A00 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A00, this);
        AnonymousClass80I r2 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r2, A00, this);
        A00.A09 = viewGroup;
        AnonymousClass80D.A07(28D.A5J, this, A00);
        A00.A3H = true;
        A00.A47 = true;
        A00.A3Q = true;
        AnonymousClass80D.A0A(A00);
        A00.A39 = true;
        return A00;
    }

    public final String getModuleName() {
        return "reel_notify_me_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-306902478);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(1714821154, A02);
    }
}
