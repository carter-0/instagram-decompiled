package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

public final class B6N extends 0Yg implements 0sP {
    public static final B6N A00 = new B6N();

    public B6N() {
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
