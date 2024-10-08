package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.Dev  reason: case insensitive filesystem */
public final class C46433Dev extends C252233om {
    public boolean A00;
    public final FragmentActivity A01;
    public final AnonymousClass4DH A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final 1wn A04 = FX1.A00(this, 3);
    public final UserSession A05;
    public final Set A06 = AnonymousClass7TE.A1F();
    public final /* synthetic */ C46352Dcv A07;

    public C46433Dev(FragmentActivity fragmentActivity, UserSession userSession, C46352Dcv dcv) {
        this.A07 = dcv;
        this.A01 = fragmentActivity;
        this.A02 = dcv;
        this.A05 = userSession;
        this.A00 = DbT.A0j(userSession).CPm();
        BusinessFlowAnalyticsLogger A012 = C319596qs.A01(C319586qr.CONVERSION_FLOW, userSession, dcv.getModuleName(), (String) null);
        A012.getClass();
        this.A03 = A012;
    }

    public final void A00() {
        2YL A0H = DbS.A0H(this.A07.A0L);
        C51645Fy4.A01(A0H, C318116oQ.A00(A0H), 38);
    }

    public final void D6z(View view) {
        AnonymousClass1Nd.A00(this.A05).A01(this.A04, 2Cy.class);
    }

    public final void onDestroyView() {
        AnonymousClass1Nd.A00(this.A05).A02(this.A04, 2Cy.class);
    }

    public final void onPause() {
        this.A06.clear();
    }
}
