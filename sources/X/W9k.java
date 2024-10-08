package X;

import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessagesIntf;

public final class W9k implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C15366UbJ A01;
    public final /* synthetic */ String A02;

    public W9k(C15366UbJ ubJ, String str, long j) {
        this.A01 = ubJ;
        this.A00 = j;
        this.A02 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1175510980);
        C15366UbJ ubJ = this.A01;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = ubJ.A01;
        C52673Gal gal = ubJ.A06;
        OnFeedMessagesIntf onFeedMessagesIntf = ubJ.A02;
        if (!(onFeedMessagesIntf == null || gal == null || iGCTMessagingAdsInfoDict == null)) {
            String str = ubJ.A09;
            if (str == null) {
                str = "-1";
            }
            gal.A08(str, this.A02, AnonymousClass3ZN.A00(onFeedMessagesIntf), C16947VBz.A00(iGCTMessagingAdsInfoDict), this.A00);
        }
        AnonymousClass0fD.A0C(1432255666, A05);
    }
}
