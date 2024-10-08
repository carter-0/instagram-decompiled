package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.DLx  reason: case insensitive filesystem */
public final class C46092DLx extends 0Yg implements 0sP {
    public static final C46092DLx A00 = new C46092DLx();

    public C46092DLx() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FundraiserCampaignTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return FundraiserCampaignTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
