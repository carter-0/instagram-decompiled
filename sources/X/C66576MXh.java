package X;

import android.content.Intent;
import android.location.Location;
import android.view.View;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MXh  reason: case insensitive filesystem */
public interface C66576MXh extends C66527MVf {
    NonSupportedContentSchedulingFeatures CBv();

    void CkT(String str);

    void CnK(IgSimpleImageView igSimpleImageView);

    void CnO(View view);

    void CnS(String str);

    boolean CnW();

    void CnY(IgSimpleImageView igSimpleImageView, int i);

    void Cnp(boolean z);

    void Cns();

    void Cu6(AnonymousClass4DH r1);

    void CuH(AnonymousClass4DH r1, User user);

    void Cug(AnonymousClass4DH r1);

    void Cuh(C60076JfA jfA);

    void CwL();

    void Cwv();

    void Cx3(List list, long j);

    void Cz1(AnonymousClass4DH r1);

    void D1t(AnonymousClass4DH r1);

    void DBI(NewFundraiserInfo newFundraiserInfo);

    void DEv(AnonymousClass818 r1, AnonymousClass4DH r2);

    void DHk(String str, ArrayList arrayList, boolean z);

    void DI9(C63757L5p l5p, String str);

    void DLU(boolean z);

    void DNi(AnonymousClass4DH r1, boolean z, boolean z2);

    void DVF(String str);

    void DVH(boolean z);

    void DWK();

    void DWe();

    void Da3();

    void Dax(AnonymousClass4DH r1, PublishScreenCategoryType publishScreenCategoryType);

    void Dby(AnonymousClass4DH r1, boolean z, boolean z2);

    void Ddh();

    void Dp4(AnonymousClass4DH r1, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel);

    void Dp7(AnonymousClass4DH r1, ShoppingCreationConfig shoppingCreationConfig, MediaSuggestedProductTag mediaSuggestedProductTag, int i);

    void Dp8(boolean z, int i);

    void DqW(View view);

    void DqX(AnonymousClass4DH r1, ShoppingCreationConfig shoppingCreationConfig);

    void Dv2(AnonymousClass4DH r1, boolean z, boolean z2);

    void E0Y(boolean z);

    void E14(L13 l13);

    void E17(Location location, long j);

    void E3e(NewFundraiserInfo newFundraiserInfo);

    void EuY(C295095nZ r1, String str, String str2, boolean z);

    void Ev2(View view, String str);

    void EvB(GAX gax, C62320sa r2);

    void FKU(ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel);

    void FKr(NewFundraiserInfo newFundraiserInfo);

    void FMK(UpcomingEvent upcomingEvent);

    void onActivityResult(int i, int i2, Intent intent);
}
