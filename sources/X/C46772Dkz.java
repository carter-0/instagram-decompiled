package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Dkz  reason: case insensitive filesystem */
public final class C46772Dkz extends 2YL {
    public final AnonymousClass2Fj A00 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A01 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A02 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A03 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A04 = new AnonymousClass2Fj();
    public final BusinessFlowAnalyticsLogger A05;
    public final EtV A06;
    public final 0lg A07;
    public final String A08;

    public C46772Dkz(BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, EtV etV, 0lg r4, String str) {
        AnonymousClass7TG.A0w(1, r4, businessFlowAnalyticsLogger, str);
        this.A07 = r4;
        this.A06 = etV;
        this.A05 = businessFlowAnalyticsLogger;
        this.A08 = str;
    }

    public final void A00(String str, int i) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(AnonymousClass000.A00(4117), String.valueOf(i));
        this.A05.Ckp(new C22030Xtl("intro", this.A08, str, (String) null, (String) null, (Map) null, A1E, (Map) null));
    }
}
