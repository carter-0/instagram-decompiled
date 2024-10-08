package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Uef  reason: case insensitive filesystem */
public final class C15551Uef extends C231632rz {
    public final UserSession A00;
    public final 1Xj A01;
    public final AnonymousClass4DU A02;
    public final ProductCollectionFragment A03;
    public final C15683Ugo A04;
    public final boolean A05;
    public final Context A06;

    public final int getViewTypeCount() {
        return 6;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r26, Object obj, Object obj2) {
        ProductCollectionHeader productCollectionHeader = (ProductCollectionHeader) obj;
        C232672uC r6 = r26;
        boolean A1U = AnonymousClass7TF.A1U(0, r6, productCollectionHeader);
        ProductCollectionCoverImpl productCollectionCoverImpl = productCollectionHeader.A00;
        1Xj r10 = this.A01;
        1Xj r18 = r10;
        ProductCollectionCoverImpl productCollectionCoverImpl2 = productCollectionCoverImpl;
        C53399GnW gnW = new C53399GnW(r18, (ProductCollectionCover) productCollectionCoverImpl2, (CharSequence) productCollectionHeader.A04, (CharSequence) productCollectionHeader.A03, (List) productCollectionHeader.A05, this.A05);
        0sP wxc = new C20705Wxc(this, 32);
        0sP wxc2 = new C20705Wxc(this, 33);
        C20699WxV wxV = new C20699WxV(this, 32);
        0sP wxc3 = new C20705Wxc(this, 34);
        0sP wxc4 = new C20705Wxc(this, 35);
        0sP r21 = wxc3;
        0sP r22 = wxc4;
        0sP r19 = wxc;
        0sP r20 = wxc2;
        C20699WxV wxV2 = wxV;
        C17645Vbb vbb = new C17645Vbb(wxV2, r19, r20, r21, r22, new C20705Wxc(this, 36), new C59346JFy(this, 3));
        AnonymousClass4DU r9 = this.A02;
        r6.A7V(A1U ? 1 : 0, new C19277WSk(gnW, r9, vbb), (Object) null);
        ProductCollectionCoverImpl productCollectionCoverImpl3 = productCollectionHeader.A00;
        if (!(productCollectionCoverImpl3.A01 == null || r10 == null)) {
            r6.A7V(2, new VYQ(this.A00, r10, r9, productCollectionCoverImpl3), (Object) null);
        }
        String str = productCollectionHeader.A02;
        if (str != null && str.length() != 0) {
            C253003q3 r2 = new C253003q3(new SpannableStringBuilder(DbV.A12(str)), this.A00);
            r2.A03(new WXF(this, 1));
            r2.A02(new WXE(this, 0));
            r6.A7V(3, new WS1(new C52255GKw(r2.A00()), this.A04), (Object) null);
        }
    }

    public C15551Uef(Context context, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, ProductCollectionFragment productCollectionFragment, C15683Ugo ugo, boolean z) {
        this.A06 = context;
        this.A00 = userSession;
        this.A02 = r4;
        this.A05 = z;
        this.A01 = r3;
        this.A03 = productCollectionFragment;
        this.A04 = ugo;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        ProductImageContainer BFw;
        ImageInfo A1p;
        C52507GVk gVk;
        int A032 = AnonymousClass0fD.A03(-939872722);
        int A022 = DbW.A02(1, view, obj);
        if (i != 0) {
            if (i == 1) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionCoverContentTileViewBinder.ViewHolder");
                UED ued = (UED) tag;
                C19277WSk wSk = (C19277WSk) obj;
                boolean A1S = DbW.A1S(1, ued, wSk);
                IgImageView igImageView = ued.A05;
                if (!igImageView.A0G()) {
                    C53399GnW gnW = wSk.A00;
                    1Xj r0 = (1Xj) gnW.A02;
                    if (r0 == null || (A1p = r0.A1p()) == null) {
                        BFw = ((ProductCollectionCover) gnW.A01).BFw();
                    } else {
                        BFw = new ProductImageContainerImpl(A1p.FEa(), (String) null);
                    }
                    C17092VHo.A00(igImageView, wSk.A01, BFw, Integer.valueOf(0nA.A09(ued.A00)), A1S);
                }
                igImageView.setVisibility(A1S ? 1 : 0);
                C17645Vbb vbb = wSk.A02;
                vbb.A01.invoke(igImageView);
                C53399GnW gnW2 = wSk.A00;
                1Xj r8 = (1Xj) gnW2.A02;
                if (r8 == null || !r8.CeS()) {
                    igImageView.setVisibility(A1S);
                    ued.A08.setVisibility(8);
                } else {
                    igImageView.setVisibility(8);
                    MediaFrameLayout mediaFrameLayout = ued.A08;
                    mediaFrameLayout.setVisibility(A1S);
                    vbb.A06.invoke(mediaFrameLayout, r8);
                }
                ued.A04.setText((CharSequence) gnW2.A05);
                vbb.A05.invoke(igImageView);
                TextView textView = ued.A03;
                CharSequence charSequence = (CharSequence) gnW2.A04;
                int i2 = 0;
                if (charSequence == null || charSequence.length() == 0) {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                textView.setText(charSequence);
                vbb.A04.invoke(igImageView);
                TextView textView2 = ued.A02;
                List list = (List) gnW2.A03;
                textView2.setText(C51971G9r.A0t((User) 00k.A0O(list, A1S)));
                VGK.A00(ued.A06, wSk, (User) 00k.A0O(list, A1S));
                VGK.A00(ued.A07, wSk, (User) 00k.A0O(list, 1));
                User user = (User) 00k.A0O(list, A1S);
                if (user != null) {
                    textView2.setText(C13988Tno.A0b(user));
                    WBD.A00(textView2, 56, wSk, user);
                }
                ImageView imageView = ued.A01;
                if (gnW2.A06) {
                    imageView.setVisibility(A1S);
                    WBC.A00(imageView, 31, wSk);
                } else {
                    imageView.setVisibility(8);
                }
            } else if (i == A022) {
                Object tag2 = view.getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionCoverShowreelViewBinder.ViewHolder");
                VTO vto = (VTO) tag2;
                VYQ vyq = (VYQ) obj;
                boolean A1S2 = DbW.A1S(1, vto, vyq);
                VPZ vpz = vto.A01;
                UserSession userSession = vyq.A00;
                1Xj r02 = vyq.A01;
                AnonymousClass6Q6 r6 = new AnonymousClass6Q6(C231122qu.A07(userSession, r02), r02.A2v());
                IgShowreelNativeAnimationIntf BwB = vyq.A03.BwB();
                if (BwB != null) {
                    gVk = B7C.A00(BwB);
                } else {
                    gVk = null;
                }
                AnonymousClass4DU r1 = vyq.A02;
                0qQ.A0B(vpz, A1S2 ? 1 : 0);
                if (gVk != null) {
                    ShowreelNativeMediaView showreelNativeMediaView = (ShowreelNativeMediaView) vpz.A00.getView();
                    showreelNativeMediaView.setVisibility(A1S2);
                    showreelNativeMediaView.A07(r6, gVk, userSession, r1.getModuleName(), A1S2);
                }
                vpz.A00.getView().setMinimumHeight(0nA.A09(vto.A00));
            } else if (i == 3) {
                Object tag3 = view.getTag();
                0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionDescriptionViewBinder.ViewHolder");
                UDE ude = (UDE) tag3;
                WS1 ws1 = (WS1) obj;
                Dba.A0j(1, ude, ws1);
                CharSequence A002 = C66909Mes.A00(ude.A00, ws1.A00);
                if (A002 == null) {
                    A002 = "";
                }
                TextView textView3 = ude.A01;
                int i3 = 8;
                if (C51966G9m.A1X(A002)) {
                    i3 = 0;
                }
                textView3.setVisibility(i3);
                textView3.setText(A002);
                TextView textView4 = ude.A02;
                textView4.setVisibility(8);
                textView4.setText((CharSequence) null);
            } else {
                IllegalStateException A0b = DbW.A0b("Unsupported view type: ", i);
                AnonymousClass0fD.A0A(453633630, A032);
                throw A0b;
            }
            AnonymousClass0fD.A0A(1638840438, A032);
            return;
        }
        Object tag4 = view.getTag();
        0qQ.A0C(tag4, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionCoverImageViewBinder.ViewHolder");
        Dba.A0j(1, tag4, (Object) null);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0A;
        Object vam;
        int A032 = AnonymousClass0fD.A03(-1690830919);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.product_collection_cover_image, false);
            vam = new C17594Vam(A0A);
        } else if (i == 1) {
            A0A = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.product_collection_cover_content_tile, false);
            vam = new UED(A0A);
        } else if (i == 2) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.product_collection_cover_showreel, false);
            vam = new VTO(A0A);
        } else if (i == 3) {
            A0A = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.product_collection_description, false);
            vam = new UDE(A0A);
        } else {
            IllegalStateException A0b = DbW.A0b("Unsupported view type: ", i);
            AnonymousClass0fD.A0A(1937847957, A032);
            throw A0b;
        }
        A0A.setTag(vam);
        AnonymousClass0fD.A0A(706981171, A032);
        return A0A;
    }
}
