package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.List;

/* renamed from: X.VHo  reason: case insensitive filesystem */
public abstract class C17092VHo {
    public static final void A00(IgImageView igImageView, AnonymousClass4DU r4, ProductImageContainer productImageContainer, Integer num, boolean z) {
        ImageInfo BGO;
        List Al9;
        ExtendedImageUrl A03;
        0qQ.A0B(igImageView, 0);
        if (productImageContainer == null || (BGO = productImageContainer.BGO()) == null || (Al9 = BGO.Al9()) == null || Al9.isEmpty() || (A03 = 1iI.A03(BGO)) == null) {
            igImageView.A0B();
            return;
        }
        ImageUrl imageUrl = igImageView.A0C;
        if (imageUrl == null || imageUrl.getUrl() == null || z) {
            igImageView.setUrl(A03, r4);
            if (num != null) {
                0nA.A0V(igImageView, (int) (((float) num.intValue()) / 1iI.A00(BGO)));
            }
        }
    }
}
