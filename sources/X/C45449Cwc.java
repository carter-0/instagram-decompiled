package X;

import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.model.shopping.reels.ProductStickerIntf;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cwc  reason: case insensitive filesystem */
public final class C45449Cwc {
    public DropsEventPageNavigationMetadata A00;
    public TextReviewStatus A01;
    public DropsLaunchAnimationIntf A02;
    public ProductDetailsProductItemDictIntf A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public final ProductStickerIntf A0F;

    public final ProductSticker A00() {
        DropsLaunchAnimation dropsLaunchAnimation;
        DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl;
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ArrayList arrayList = null;
        1E9 A0p = C41847B3o.A0p();
        String str = this.A07;
        DropsLaunchAnimationIntf dropsLaunchAnimationIntf = this.A02;
        if (dropsLaunchAnimationIntf != null) {
            dropsLaunchAnimation = dropsLaunchAnimationIntf.FFR();
        } else {
            dropsLaunchAnimation = null;
        }
        DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata = this.A00;
        if (dropsEventPageNavigationMetadata != null) {
            dropsEventPageNavigationMetadataImpl = dropsEventPageNavigationMetadata.F2h();
        } else {
            dropsEventPageNavigationMetadataImpl = null;
        }
        String str2 = this.A08;
        Boolean bool = this.A04;
        Boolean bool2 = this.A05;
        String str3 = this.A09;
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A03;
        if (productDetailsProductItemDictIntf != null) {
            productDetailsProductItemDict = productDetailsProductItemDictIntf.FGq(A0p);
        } else {
            productDetailsProductItemDict = null;
        }
        List<StoryProductItemStickerTappableDataIntf> list = this.A0E;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            for (StoryProductItemStickerTappableDataIntf FAk : list) {
                arrayList.add(FAk.FAk());
            }
        }
        String str4 = this.A0A;
        String str5 = this.A0B;
        return new ProductSticker(dropsEventPageNavigationMetadataImpl, this.A01, dropsLaunchAnimation, productDetailsProductItemDict, bool, bool2, this.A06, str, str2, str3, str4, str5, this.A0C, this.A0D, arrayList);
    }

    public C45449Cwc(ProductSticker productSticker) {
        this.A0F = productSticker;
        this.A07 = productSticker.A07;
        this.A02 = productSticker.A02;
        this.A00 = productSticker.A00;
        this.A08 = productSticker.A08;
        this.A04 = productSticker.A04;
        this.A05 = productSticker.A05;
        this.A09 = productSticker.A09;
        this.A03 = productSticker.A03;
        this.A0E = productSticker.A0E;
        this.A0A = productSticker.A0A;
        this.A0B = productSticker.A0B;
        this.A01 = productSticker.A01;
        this.A0C = productSticker.A0C;
        this.A0D = productSticker.A0D;
        this.A06 = productSticker.A06;
    }
}
