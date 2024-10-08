package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;

public class LBA {
    public int A00 = 8;
    public int A01 = 8;
    public int A02 = 8;
    public int A03 = 8;
    public final int A04;
    public final NewFundraiserInfo A05;
    public final MVJ A06;
    public final C63823L8e A07;
    public final ExistingStandaloneFundraiserForFeedModel A08;
    public final DV3 A09;

    public LBA(DV3 dv3, NewFundraiserInfo newFundraiserInfo, MVJ mvj, C63823L8e l8e, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, int i) {
        this.A05 = newFundraiserInfo;
        this.A09 = dv3;
        this.A08 = existingStandaloneFundraiserForFeedModel;
        this.A06 = mvj;
        this.A07 = l8e;
        this.A04 = i;
        if (newFundraiserInfo == null && existingStandaloneFundraiserForFeedModel == null) {
            this.A00 = 0;
            this.A03 = 0;
            return;
        }
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 8;
    }
}
