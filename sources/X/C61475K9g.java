package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.K9g  reason: case insensitive filesystem */
public final class C61475K9g extends C231632rz {
    public final AnonymousClass0iw A00;
    public final C66468MSw A01;
    public final boolean A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public C61475K9g(AnonymousClass0iw r1, C66468MSw mSw, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = mSw;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        ProductImageContainer BFw;
        ImageInfo BGO;
        ExtendedImageUrl A03;
        int A04 = DbX.A04(view, -1327506252);
        0qQ.A0B(obj, 2);
        ProductCollection productCollection = (ProductCollection) obj;
        AnonymousClass0iw r6 = this.A00;
        boolean z = this.A02;
        C66468MSw mSw = this.A01;
        0qQ.A0B(productCollection, 1);
        AnonymousClass7TF.A1D(r6, 2, mSw);
        Object tag = view.getTag();
        if (tag != null) {
            L8T l8t = (L8T) tag;
            IgTextView igTextView = l8t.A02;
            igTextView.setText(productCollection.getTitle());
            igTextView.getPaint().setFakeBoldText(true);
            l8t.A01.setText(productCollection.getSubtitle());
            IgImageView igImageView = l8t.A03;
            igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ProductCollectionCover Arp = productCollection.Arp();
            if (!(Arp == null || (BFw = Arp.BFw()) == null || (BGO = BFw.BGO()) == null || (A03 = 1iI.A03(BGO)) == null)) {
                igImageView.setUrl(A03, r6);
            }
            if (z) {
                ImageButton imageButton = l8t.A00;
                imageButton.setVisibility(0);
                LY7.A00(imageButton, 51, mSw, productCollection);
            }
            AnonymousClass0fD.A0A(1794445408, A04);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 798722394);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.shopping_item, false);
        A0A.setTag(new L8T(A0A));
        AnonymousClass0fD.A0A(500217884, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
