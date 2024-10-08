package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.55v  reason: invalid class name and case insensitive filesystem */
public final class C2811055v implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass35R A01;

    public C2811055v(UserSession userSession, AnonymousClass35R r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(453043571);
        C249813kP.A00.A06("explore_popular", "mainFeedExploreActionBarClick", true);
        UserSession userSession = this.A00;
        AnonymousClass35R r2 = this.A01;
        AB2.A01(userSession, r2.A03, "main_search");
        FragmentActivity fragmentActivity = r2.A01;
        if (!AnonymousClass06S.A01(fragmentActivity.getSupportFragmentManager())) {
            i = -445773961;
        } else {
            C309516Yo r22 = new C309516Yo(fragmentActivity, userSession);
            r22.A0F = true;
            r22.A0B((Bundle) null, ((C55907HpU) C243443Yu.A00().A01.getValue()).A00(1));
            r22.A04();
            i = -376651591;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
