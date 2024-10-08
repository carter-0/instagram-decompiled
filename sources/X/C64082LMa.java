package X;

import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;

/* renamed from: X.LMa  reason: case insensitive filesystem */
public final class C64082LMa {
    public final FundraiserDisplayInfoModel A00;
    public final NewFundraiserInfo A01;
    public final String A02;

    public C64082LMa(FundraiserDisplayInfoModel fundraiserDisplayInfoModel, NewFundraiserInfo newFundraiserInfo, String str) {
        this.A02 = str;
        this.A01 = newFundraiserInfo;
        this.A00 = fundraiserDisplayInfoModel;
    }

    public C64082LMa() {
        this((FundraiserDisplayInfoModel) null, (NewFundraiserInfo) null, (String) null);
    }
}
