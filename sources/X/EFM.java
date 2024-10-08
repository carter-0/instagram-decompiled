package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

public final class EFM extends C228042kh {
    public final G8D A00;
    public final 0lg A01;
    public final String A02 = "professional_account_selection";
    public final String A03;

    public EFM(G8D g8d, 0lg r4, String str) {
        AnonymousClass7TG.A1O(r4, g8d);
        0qQ.A0B(str, 4);
        this.A01 = r4;
        this.A00 = g8d;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        0lg r3 = this.A01;
        String str = this.A02;
        G8D g8d = this.A00;
        BusinessFlowAnalyticsLogger A012 = C319596qs.A01(g8d.B6a(), r3, str, (String) AnonymousClass7TE.A14(((BusinessConversionActivity) g8d).A0C));
        0qQ.A0A(A012);
        return new C46743DkW(A012, r3, this.A03);
    }
}
