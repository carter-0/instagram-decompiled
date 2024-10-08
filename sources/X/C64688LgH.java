package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.List;

/* renamed from: X.LgH  reason: case insensitive filesystem */
public final /* synthetic */ class C64688LgH implements 1wn {
    public final /* synthetic */ AnonymousClass8C9 A00;

    public /* synthetic */ C64688LgH(AnonymousClass8C9 r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        AnonymousClass8C9 r14 = this.A00;
        C64679Lg6 lg6 = (C64679Lg6) obj;
        ReelMoreOptionsModel reelMoreOptionsModel = r14.A03;
        AnonymousClass8CA r18 = reelMoreOptionsModel.A09;
        String str = reelMoreOptionsModel.A0C;
        String str2 = reelMoreOptionsModel.A0B;
        String str3 = reelMoreOptionsModel.A0A;
        ProfileShopLink profileShopLink = reelMoreOptionsModel.A06;
        InstagramShopLink instagramShopLink = reelMoreOptionsModel.A03;
        ProductCollectionLink productCollectionLink = reelMoreOptionsModel.A04;
        ProductCollectionLink productCollectionLink2 = reelMoreOptionsModel.A05;
        ReelProductLink reelProductLink = reelMoreOptionsModel.A08;
        ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel.A07;
        boolean z = reelMoreOptionsModel.A0E;
        boolean z2 = reelMoreOptionsModel.A0G;
        boolean z3 = reelMoreOptionsModel.A0F;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = reelMoreOptionsModel.A02;
        List list = lg6.A02;
        BrandedContentGatingInfo F0x = lg6.A00.F0x();
        boolean z4 = lg6.A03;
        ProfileShopLink profileShopLink2 = profileShopLink;
        ReelMultiProductLink reelMultiProductLink2 = reelMultiProductLink;
        ReelProductLink reelProductLink2 = reelProductLink;
        AnonymousClass8CA r25 = r18;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = mediaGenAIDetectionMethod;
        InstagramShopLink instagramShopLink2 = instagramShopLink;
        ProductCollectionLink productCollectionLink3 = productCollectionLink;
        ProductCollectionLink productCollectionLink4 = productCollectionLink2;
        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = lg6.A01;
        r14.A03 = AnonymousClass8CB.A00(F0x, brandedContentProjectMetadataIntf, mediaGenAIDetectionMethod2, instagramShopLink2, productCollectionLink3, productCollectionLink4, profileShopLink2, reelMultiProductLink2, reelProductLink2, r25, str3, str2, str, list, z, z3, z2, z4);
    }
}
