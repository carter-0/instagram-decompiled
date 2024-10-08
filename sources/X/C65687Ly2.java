package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.List;

/* renamed from: X.Ly2  reason: case insensitive filesystem */
public final class C65687Ly2 implements C66467MSv {
    public final /* synthetic */ ShoppingCreationConfig A00;
    public final /* synthetic */ ClipsEditMetadataController A01;

    public C65687Ly2(ShoppingCreationConfig shoppingCreationConfig, ClipsEditMetadataController clipsEditMetadataController) {
        this.A01 = clipsEditMetadataController;
        this.A00 = shoppingCreationConfig;
    }

    public final void onClick() {
        String str;
        Long l;
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (this.A00 != null) {
            BrandedContentTag brandedContentTag = (BrandedContentTag) 00k.A0J(clipsEditMetadataController.A0P);
            String str2 = null;
            if (brandedContentTag != null) {
                str = brandedContentTag.A01;
            } else {
                str = null;
            }
            UserSession userSession = clipsEditMetadataController.A0s;
            AnonymousClass4DH r3 = clipsEditMetadataController.A0q;
            String str3 = clipsEditMetadataController.A14;
            TaggingFeedMultiSelectState taggingFeedMultiSelectState = clipsEditMetadataController.A0I;
            1Xj r0 = clipsEditMetadataController.A0D;
            if (r0 != null) {
                l = Long.valueOf(r0.A1B());
            } else {
                l = null;
            }
            1Xj r02 = clipsEditMetadataController.A0D;
            if (r02 != null) {
                str2 = r02.getId();
            }
            C63503KyE.A00(r3, userSession, (AnonymousClass3Q2) null, taggingFeedMultiSelectState, l, str3, str, str2, (List) null, (List) null);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
