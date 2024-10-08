package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.ImmutablePandoFBProductItemDetailsDict;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

public final class DHS implements AnonymousClass3ZL {
    public FBProductItemDetailsDict A00;
    public final long A01 = System.currentTimeMillis();
    public final String A02;

    public final void AE7(0lg r3) {
        if (r3 != null) {
            AnonymousClass1Nd.A00(r3).A00(new AnonymousClass3DT(this));
        }
    }

    public final String BHy() {
        return this.A02;
    }

    public final long BI0() {
        return this.A01;
    }

    public final C243373Ym BpO() {
        if (AnonymousClass7TF.A1Y(this.A00.BCR(), true)) {
            return C243373Ym.SAVED;
        }
        return C243373Ym.NOT_SAVED;
    }

    public final String BpP() {
        return C45683D1i.A00(this.A00);
    }

    public final Integer BpT() {
        return AnonymousClass05K.A01;
    }

    public final boolean CbC() {
        return AnonymousClass7TF.A1Y(this.A00.BCR(), true);
    }

    public final void EjB(C243373Ym r21) {
        ProductCheckoutProperties productCheckoutProperties;
        ProductImageContainerImpl productImageContainerImpl;
        Object fBProductItemDetailsDictImpl;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        C45432CwC AKA = this.A00.AKA();
        boolean z = false;
        if (r21 == C243373Ym.SAVED) {
            z = true;
        }
        AKA.A03 = Boolean.valueOf(z);
        FBProductItemDetailsDict fBProductItemDetailsDict = AKA.A0D;
        if (fBProductItemDetailsDict instanceof ImmutablePandoFBProductItemDetailsDict) {
            TreeUpdaterJNI treeUpdaterJNI3 = TreeUpdaterJNI.$redex_init_class;
            ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf = AKA.A00;
            TreeUpdaterJNI treeUpdaterJNI4 = null;
            if (productCheckoutPropertiesIntf != null) {
                treeUpdaterJNI = productCheckoutPropertiesIntf.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L = AnonymousClass7TE.A1L("checkout_properties", treeUpdaterJNI);
            0eP A1L2 = AnonymousClass7TE.A1L("has_viewer_saved", AKA.A03);
            0eP A1L3 = AnonymousClass7TE.A1L("listing_price", AKA.A04);
            0eP A1L4 = AnonymousClass7TE.A1L("listing_price_stripped", AKA.A05);
            ProductImageContainer productImageContainer = AKA.A01;
            if (productImageContainer != null) {
                treeUpdaterJNI2 = productImageContainer.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            0eP A1L5 = AnonymousClass7TE.A1L("main_image", treeUpdaterJNI2);
            0eP A1L6 = AnonymousClass7TE.A1L("page_id", AKA.A06);
            0eP A1L7 = AnonymousClass7TE.A1L("page_name", AKA.A07);
            0eP A1L8 = AnonymousClass7TE.A1L("page_profile_pic", AKA.A08);
            0eP A1L9 = AnonymousClass7TE.A1L("product_id", AKA.A09);
            0eP A1L10 = AnonymousClass7TE.A1L("product_name", AKA.A0A);
            0eP A1L11 = AnonymousClass7TE.A1L("strikethrough_price", AKA.A0B);
            0eP A1L12 = AnonymousClass7TE.A1L("strikethrough_price_stripped", AKA.A0C);
            ProductImageContainer productImageContainer2 = AKA.A02;
            if (productImageContainer2 != null) {
                treeUpdaterJNI4 = productImageContainer2.FHC();
            }
            fBProductItemDetailsDictImpl = C41847B3o.A0o(fBProductItemDetailsDict, new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, AnonymousClass7TE.A1L("thumbnail_image", treeUpdaterJNI4)});
        } else {
            ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf2 = AKA.A00;
            ProductImageContainerImpl productImageContainerImpl2 = null;
            if (productCheckoutPropertiesIntf2 != null) {
                productCheckoutProperties = productCheckoutPropertiesIntf2.FFY();
            } else {
                productCheckoutProperties = null;
            }
            Boolean bool = AKA.A03;
            String str = AKA.A04;
            String str2 = AKA.A05;
            ProductImageContainer productImageContainer3 = AKA.A01;
            if (productImageContainer3 != null) {
                productImageContainerImpl = productImageContainer3.FFc();
            } else {
                productImageContainerImpl = null;
            }
            String str3 = AKA.A06;
            String str4 = AKA.A07;
            String str5 = AKA.A08;
            String str6 = AKA.A09;
            String str7 = AKA.A0A;
            String str8 = AKA.A0B;
            String str9 = AKA.A0C;
            ProductImageContainer productImageContainer4 = AKA.A02;
            if (productImageContainer4 != null) {
                productImageContainerImpl2 = productImageContainer4.FFc();
            }
            fBProductItemDetailsDictImpl = new FBProductItemDetailsDictImpl(productCheckoutProperties, productImageContainerImpl, productImageContainerImpl2, bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
        }
        this.A00 = (FBProductItemDetailsDict) fBProductItemDetailsDictImpl;
    }

    public DHS(FBProductItemDetailsDict fBProductItemDetailsDict) {
        this.A00 = fBProductItemDetailsDict;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A02 = obj;
    }

    public final Collection BpQ() {
        return Collections.emptyList();
    }
}
