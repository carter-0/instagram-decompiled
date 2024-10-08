package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import go.Seq;
import java.util.ArrayList;
import java.util.Collections;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxV  reason: case insensitive filesystem */
public final class C20699WxV extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20699WxV(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20699WxV(obj, i));
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [X.Lj1, X.KYa, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        String A002;
        ImageUrlBase imageUrlBase;
        String A003;
        switch (this.A00) {
            case 0:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return this.A01;
            case 1:
            case 19:
                return DbT.A0r(this.A01);
            case 3:
                C59844JaK jaK = (C59844JaK) this.A01;
                return new C15720UhR(jaK, AnonymousClass7TE.A0l(jaK.A06), (C21251XQw) jaK.A05.getValue(), DbS.A0t(jaK.A01), AnonymousClass7TF.A1Z(jaK.A03));
            case 4:
                UserSession userSession = ((SettingsScreenViewModel) this.A01).A06;
                return userSession.A01(LGF.class, new C46573DhF(userSession, 40));
            case 5:
                return new C10993S4n((UserSession) this.A01);
            case 6:
                return new C39772A8m((UserSession) this.A01);
            case 7:
                return C363388je.A00(AnonymousClass7TE.A0l(((C61362K4e) this.A01).A07));
            case 8:
                E4A e4a = (E4A) this.A01;
                return DbX.A0P(e4a, e4a.A01);
            case 9:
                return C363388je.A00(((K7Y) this.A01).getSession());
            case 10:
                ? lj1 = new C64839Lj1((UserSession) this.A01);
                lj1.A00 = AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED;
                return lj1;
            case 11:
                return new C64839Lj1((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C40270AYj((UserSession) this.A01);
            case 13:
                return new C19291WSz((UserSession) this.A01);
            case 14:
                Fragment fragment = (Fragment) this.A01;
                TextView A0G = DbU.A0G(fragment.requireView(), R.id.audience_picker_disclaimer_text);
                C66581MXm.A15(fragment.requireContext(), A0G, 2131973584);
                return A0G;
            case 15:
                Fragment fragment2 = (Fragment) this.A01;
                IgdsButton igdsButton = (IgdsButton) fragment2.requireView().requireViewById(R.id.done_button);
                igdsButton.setEnabled(false);
                igdsButton.setText(2131973082);
                AnonymousClass0fU.A00(new C64273LXz(fragment2, 54), igdsButton);
                return igdsButton;
            case 16:
                return C51971G9r.A0U(this.A01);
            case 17:
                return JTR.A0b(this.A01);
            case 21:
                KXY kxy = (KXY) this.A01;
                return new C61572KCz(AnonymousClass7TE.A0l(kxy.A03), kxy.A03);
            case 22:
                view = ((UEK) this.A01).A00;
                i = R.id.buy_now_button;
                break;
            case 23:
                return ((UEK) this.A01).A00.findViewById(R.id.divider);
            case 24:
                view = ((UEK) this.A01).A00;
                i = R.id.merchant_avatar;
                break;
            case 25:
                view = ((UEK) this.A01).A00;
                i = R.id.merchant_username;
                break;
            case 26:
                return AnonymousClass7TF.A0G(((UEK) this.A01).A00, R.id.offer_available_label);
            case 27:
                View view2 = ((UEK) this.A01).A00;
                IgImageView A0i = JTR.A0i(view2, R.id.thumbnail_image_0);
                VYO vyo = new VYO(AnonymousClass7TE.A0b(view2, R.id.thumbnail_image_tint_0), AnonymousClass7TE.A0b(view2, R.id.product_thumbnail_sold_out_slash_0), (ViewGroup) AnonymousClass7TE.A0b(view2, R.id.thumbnail_image_container_0), A0i);
                IgImageView A0i2 = JTR.A0i(view2, R.id.thumbnail_image_1);
                VYO vyo2 = new VYO(AnonymousClass7TE.A0b(view2, R.id.thumbnail_image_tint_1), AnonymousClass7TE.A0b(view2, R.id.product_thumbnail_sold_out_slash_1), (ViewGroup) AnonymousClass7TE.A0b(view2, R.id.thumbnail_image_container_1), A0i2);
                IgImageView A0i3 = JTR.A0i(view2, R.id.thumbnail_image_2);
                return 0sr.A1L(new VYO[]{vyo, vyo2, new VYO(AnonymousClass7TE.A0b(view2, R.id.thumbnail_image_tint_2), AnonymousClass7TE.A0b(view2, R.id.product_thumbnail_sold_out_slash_2), (ViewGroup) AnonymousClass7TE.A0b(view2, R.id.thumbnail_image_container_2), A0i3)});
            case 28:
                view = ((UEK) this.A01).A00;
                i = R.id.subtitle;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                view = ((UEK) this.A01).A00;
                i = R.id.view_cart_button_bottom;
                break;
            case 30:
                view = ((UEK) this.A01).A00;
                i = R.id.view_cart_button_top;
                break;
            case 31:
                return new ArrayList(Collections.unmodifiableList(((WSH) this.A01).A00.A03.A03));
            case 32:
                ProductCollectionFragment productCollectionFragment = ((C15551Uef) this.A01).A03;
                AnonymousClass37D A0i4 = DbT.A0i(productCollectionFragment.requireActivity());
                ProductCollectionHeader productCollectionHeader = productCollectionFragment.A03;
                String str = productCollectionFragment.A0I;
                if (!(A0i4 == null || str == null || productCollectionHeader == null)) {
                    UserSession userSession2 = productCollectionFragment.A00;
                    String str2 = productCollectionFragment.A0G;
                    String str3 = productCollectionFragment.A0H;
                    String str4 = productCollectionFragment.A0J;
                    String str5 = "";
                    if (AnonymousClass3ZA.A00(productCollectionFragment.A0D) == null) {
                        A002 = str5;
                    } else {
                        A002 = AnonymousClass3ZA.A00(productCollectionFragment.A0D);
                    }
                    AnonymousClass57K r9 = productCollectionFragment.A02;
                    String A004 = Pxd.A00(19);
                    0qQ.A0B(userSession2, 0);
                    AnonymousClass7TG.A0w(1, str2, str4, A002);
                    0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(userSession2, str2), "shops_collection_share_tap");
                    if (A0e.isSampled()) {
                        DbS.A1O(A0e, A004);
                        0bb r3 = new 0bb();
                        r3.A06("submodule", str3);
                        r3.A06("prior_module", str2);
                        C13989Tnp.A1E(A0e, r3, str4);
                        0bb r5 = new 0bb();
                        r5.A06("product_collection_id", str);
                        r5.A06("product_collection_type", String.valueOf(r9));
                        A0e.AAK(r5, "collections_logging_info");
                        A0e.AAJ(C273654mx.A00(44), A004);
                        C13988Tno.A1B(A0e, A002);
                        A0e.AAE((AnonymousClass0Ah) null, "marketer_igid");
                        A0e.Cgf();
                    }
                    ProductImageContainer productImageContainer = productCollectionHeader.A00.A00;
                    if (productImageContainer == null || productImageContainer.BGO().Al9() == null) {
                        imageUrlBase = null;
                    } else {
                        imageUrlBase = (ImageUrlBase) AnonymousClass7TE.A13(productCollectionHeader.A00.A00.BGO().Al9());
                    }
                    C49731F3w A07 = 1as.A04.A02.A07(productCollectionFragment, productCollectionFragment.A00, 2FW.A1Z);
                    String obj = productCollectionFragment.A02.toString();
                    if (AnonymousClass3ZA.A00(productCollectionFragment.A0D) == null) {
                        A003 = str5;
                    } else {
                        A003 = AnonymousClass3ZA.A00(productCollectionFragment.A0D);
                    }
                    if (C13988Tno.A0b(productCollectionFragment.A0D) != null) {
                        str5 = C13988Tno.A0b(productCollectionFragment.A0D);
                    }
                    A07.A07.putParcelable(C66579MXk.A00(93), new ProductCollectionShareInfo(imageUrlBase, productCollectionFragment.A0D.A03.Bh3(), (String) null, str, obj, A003, str5, productCollectionHeader.A04, productCollectionHeader.A03, productCollectionFragment.A0Y));
                    A0i4.A0I(A07.A00());
                }
                return C60340gF.A00;
            case 33:
                C54230H3z h3z = (C54230H3z) this.A01;
                UserSession userSession3 = h3z.A01;
                AnonymousClass4DU r4 = h3z.A03;
                return new IWI(r4, userSession3, (C55626Hkl) null, r4, true);
            case 34:
                view = ((UDF) this.A01).A00;
                break;
            case 35:
                view = ((UDF) this.A01).A00;
                i = R.id.image;
                break;
            case 36:
                view = ((C14886UDo) this.A01).A02;
                break;
            case 37:
                view = ((C14886UDo) this.A01).A02;
                i = R.id.title;
                break;
            case 38:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.aggregated_rating;
                break;
            case 39:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.discounts;
                break;
            case 40:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.header;
                break;
            case Seq.NULL_REFNUM /*41*/:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.loyalty_unconnected_info;
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.merchant_username_price_incentive_experiment;
                break;
            case 43:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.per_unit_price;
                break;
            case 44:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.reasons_to_buy;
                break;
            case 45:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.save_button;
                break;
            case 46:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.secondary_body;
                break;
            case 47:
                return ((C68054MzL) this.A01).A00.findViewById(R.id.share_button);
            case 48:
                view = ((C68054MzL) this.A01).A00;
                i = R.id.tertiary_body;
                break;
            case 49:
                view = (View) this.A01;
                i = R.id.discount_description;
                break;
            default:
                return DbY.A0I(this.A01);
        }
        i = R.id.description;
        return view.findViewById(i);
    }
}
