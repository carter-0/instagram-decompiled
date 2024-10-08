package X;

import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.Currency;

/* renamed from: X.UhW  reason: case insensitive filesystem */
public final class C15725UhW extends C228042kh {
    public final int A00;
    public final IGBoostPackagesFlowInfo A01;
    public final UserSession A02;
    public final ProductType A03;
    public final String A04;
    public final String A05;
    public final Currency A06;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        C16176Uq1 uq1 = new C16176Uq1(userSession);
        IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo = this.A01;
        Currency currency = this.A06;
        int i = this.A00;
        return new C14788U8z(iGBoostPackagesFlowInfo.A00, uq1, iGBoostPackagesFlowInfo, userSession, this.A03, this.A04, this.A05, currency, i);
    }

    public C15725UhW(IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo, UserSession userSession, ProductType productType, String str, String str2, Currency currency, int i) {
        AnonymousClass7TG.A1U(userSession, iGBoostPackagesFlowInfo, currency);
        AnonymousClass7TG.A1S(str, str2);
        this.A02 = userSession;
        this.A01 = iGBoostPackagesFlowInfo;
        this.A06 = currency;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = productType;
    }
}
