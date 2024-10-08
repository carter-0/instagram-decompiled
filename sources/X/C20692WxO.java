package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxO  reason: case insensitive filesystem */
public final class C20692WxO extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20692WxO(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20692WxO(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C15349Ub0 ub0 = (C15349Ub0) this.A01;
                return new C19611Wca(ub0.requireContext(), ub0, (FeaturedProductMediaFeedGridConfiguration) ub0.A08.getValue(), (C19742Wej) ub0.A0E.getValue());
            case 1:
                C15349Ub0 ub02 = (C15349Ub0) this.A01;
                C234042wt r4 = new C234042wt(ub02, AnonymousClass7TE.A0l(ub02.A0D), ub02);
                r4.A05 = DbS.A0t(ub02.A0F);
                return r4;
            case 2:
                return DbS.A0B(this.A01).getParcelable(AnonymousClass000.A00(54));
            case 3:
                C15349Ub0 ub03 = (C15349Ub0) this.A01;
                FragmentActivity requireActivity = ub03.requireActivity();
                0hq r7 = ub03.mFragmentManager;
                if (r7 != null) {
                    return new AnonymousClass2uE(requireActivity, ub03, r7, AnonymousClass7TE.A0l(ub03.A0D), (AnonymousClass57N) null, ub03, new C19380WWw(ub03, 1), (C249763kK) null, false, true, false);
                }
                throw AnonymousClass7TE.A0y();
            case 4:
                Fragment fragment = (C15349Ub0) this.A01;
                return new C19742Wej(fragment.requireContext(), AnonymousClass07i.A00(fragment), AnonymousClass7TE.A0l(fragment.A0D), fragment, ((FeaturedProductMediaFeedGridConfiguration) fragment.A08.getValue()).A05);
            case 5:
            case 21:
            case 31:
            case 40:
                return C228022kf.A00(((Fragment) this.A01).mArguments);
            case 6:
                C15349Ub0 ub04 = (C15349Ub0) this.A01;
                return DbX.A0P(ub04, ub04.A0D);
            case 7:
                C15350Ub1 ub1 = (C15350Ub1) this.A01;
                return new C54230H3z(ub1.requireActivity(), (AnonymousClass2kR) ub1.A0A.getValue(), (C231022qk) ub1.A0H.getValue(), (C19742Wej) ub1.A0L.getValue());
            case 8:
                return C320236s2.A01(DbS.A0B(this.A01), "api_path");
            case 9:
                C15350Ub1 ub12 = (C15350Ub1) this.A01;
                0hq parentFragmentManager = ub12.getParentFragmentManager();
                AnonymousClass0eM r2 = ub12.A07;
                C2362232x r42 = new C2362232x(ub12, parentFragmentManager, (C54230H3z) r2.getValue(), (AnonymousClass2kR) ub12.A0A.getValue());
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                r42.A0C = new C234172xD(ub12, (C227762js) ub12.A0I.getValue(), ub12.A05, (C54230H3z) r2.getValue());
                r42.A0W = DbS.A0t(ub12.A0M);
                return r42.A00();
            case 10:
                C15350Ub1 ub13 = (C15350Ub1) this.A01;
                return new AnonymousClass2kR(ub13.requireContext(), AnonymousClass7TE.A0l(ub13.A0K), ub13);
            case 11:
                return DbS.A0B(this.A01).getStringArrayList("media_ids");
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C15350Ub1 ub14 = (C15350Ub1) this.A01;
                C234042wt r43 = new C234042wt(ub14, AnonymousClass7TE.A0l(ub14.A0K), ub14);
                r43.A05 = DbS.A0t(ub14.A0M);
                return r43;
            case 13:
                C15350Ub1 ub15 = (C15350Ub1) this.A01;
                return new AnonymousClass36D(AnonymousClass7TE.A0l(ub15.A0K), new C57198ISl(ub15, 3), false, false);
            case 14:
                return DbS.A0B(this.A01).getString("merchant_id");
            case 15:
                return DbS.A0B(this.A01).getString("prior_module_name");
            case 16:
                return DbS.A0B(this.A01).getString("prior_submodule_name");
            case 17:
                C15350Ub1 ub16 = (C15350Ub1) this.A01;
                return new C231022qk(ub16, AnonymousClass7TE.A0l(ub16.A0K), ub16.A04, ub16, C231012qj.FEED_PRODUCT_PIVOTS, DbS.A0t(ub16.A0M), DbS.A0t(ub16.A0F), (String) null, (String) null, -1);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return C227752jr.A00(DbT.A08(this.A01), (Float) null, false);
            case 19:
                return C320236s2.A01(DbS.A0B(this.A01), AnonymousClass000.A00(772));
            case 20:
                Fragment fragment2 = (C15350Ub1) this.A01;
                return new C19742Wej(fragment2.requireContext(), AnonymousClass07i.A00(fragment2), AnonymousClass7TE.A0l(fragment2.A0K), fragment2, fragment2.requireArguments().getString("next_max_id"));
            case 22:
                return DbS.A0B(this.A01).getString("surface_title");
            case 23:
                C15350Ub1 ub17 = (C15350Ub1) this.A01;
                return DbX.A0P(ub17, ub17.A0K);
            case 24:
                C15346Uax uax = (C15346Uax) this.A01;
                return new C15486Udb(uax.requireContext(), AnonymousClass7TE.A0l(uax.A0D), uax, uax, uax, (C19612Wcb) uax.A09.getValue(), uax.A04, (C19742Wej) uax.A0E.getValue());
            case 25:
                C15346Uax uax2 = (C15346Uax) this.A01;
                return WWR.A00(AnonymousClass7TE.A0l(uax2.A0D), uax2, 8);
            case 26:
                C15346Uax uax3 = (C15346Uax) this.A01;
                return new C19612Wcb(uax3.requireActivity(), AnonymousClass7TE.A0l(uax3.A0D), (C18000Vjc) uax3.A0A.getValue(), uax3, DbS.A0t(uax3.A0F), new C20705Wxc(uax3, 42), new C20705Wxc(uax3, 43));
            case 27:
                Fragment fragment3 = (C15346Uax) this.A01;
                Context requireContext = fragment3.requireContext();
                AnonymousClass0eM r0 = fragment3.A0D;
                return new C18000Vjc(requireContext, AnonymousClass07i.A00(fragment3), AnonymousClass7TE.A0l(r0), DbU.A0u(r0));
            case 28:
                C15346Uax uax4 = (C15346Uax) this.A01;
                C234042wt r44 = new C234042wt(uax4, AnonymousClass7TE.A0l(uax4.A0D), uax4);
                r44.A05 = DbS.A0t(uax4.A0F);
                return r44;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C15346Uax uax5 = (C15346Uax) this.A01;
                return new AnonymousClass2uE(uax5.requireActivity(), uax5, uax5.getParentFragmentManager(), AnonymousClass7TE.A0l(uax5.A0D), (AnonymousClass57N) null, uax5, new C19380WWw(uax5, 2), (C249763kK) null, false, true, false);
            case 30:
                Fragment fragment4 = (C15346Uax) this.A01;
                return new C19742Wej(fragment4.requireContext(), AnonymousClass07i.A00(fragment4), AnonymousClass7TE.A0l(fragment4.A0D), fragment4, (String) null);
            case 32:
            case Seq.NULL_REFNUM /*41*/:
                return ((Fragment) this.A01).getString(2131962258);
            case 33:
                C15347Uay uay = (C15347Uay) this.A01;
                return new C15486Udb(uay.requireContext(), AnonymousClass7TE.A0l(uay.A0D), uay, uay, uay, (C19613Wcc) uay.A09.getValue(), uay.A04, (C19742Wej) uay.A0E.getValue());
            case 34:
                C15347Uay uay2 = (C15347Uay) this.A01;
                return WWR.A00(AnonymousClass7TE.A0l(uay2.A0D), uay2, 9);
            case 35:
                C15347Uay uay3 = (C15347Uay) this.A01;
                return new C19613Wcc(uay3.requireActivity(), AnonymousClass7TE.A0l(uay3.A0D), (C18000Vjc) uay3.A0A.getValue(), uay3, DbS.A0t(uay3.A0F), new C20705Wxc(uay3, 46), new C20705Wxc(uay3, 47));
            case 36:
                Fragment fragment5 = (C15347Uay) this.A01;
                Context requireContext2 = fragment5.requireContext();
                AnonymousClass0eM r02 = fragment5.A0D;
                return new C18000Vjc(requireContext2, AnonymousClass07i.A00(fragment5), AnonymousClass7TE.A0l(r02), DbU.A0u(r02));
            case 37:
                C15347Uay uay4 = (C15347Uay) this.A01;
                C234042wt r45 = new C234042wt(uay4, AnonymousClass7TE.A0l(uay4.A0D), uay4);
                r45.A05 = DbS.A0t(uay4.A0F);
                return r45;
            case 38:
                C15347Uay uay5 = (C15347Uay) this.A01;
                return new AnonymousClass2uE(uay5.requireActivity(), uay5, uay5.getParentFragmentManager(), AnonymousClass7TE.A0l(uay5.A0D), (AnonymousClass57N) null, uay5, new C19380WWw(uay5, 3), (C249763kK) null, false, true, false);
            case 39:
                Fragment fragment6 = (C15347Uay) this.A01;
                return new C19742Wej(fragment6.requireContext(), AnonymousClass07i.A00(fragment6), AnonymousClass7TE.A0l(fragment6.A0D), fragment6, (String) null);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                View view = ((Fragment) this.A01).mView;
                if (view != null) {
                    return new L9L(view);
                }
                throw new IllegalStateException("No view attached");
            case 43:
                return new UA5(DbT.A08(this.A01));
            case 44:
                C15355Ub6 ub6 = (C15355Ub6) this.A01;
                boolean A1Z = AnonymousClass7TF.A1Z(ub6.A07);
                return new C15470UdL(ub6.A04, (ArrayList) ub6.A06.getValue(), A1Z);
            case 45:
                return C320236s2.A02(DbS.A0B(this.A01), ProductDiscountInformationDictImpl.class, "discounts");
            case 46:
                return DbU.A0g(DbS.A0B(this.A01), "display_discount_link");
            case 47:
                C15355Ub6 ub62 = (C15355Ub6) this.A01;
                return new C17640VbW(AnonymousClass7TE.A0l(ub62.A0B), ub62, DbS.A0t(ub62.A0C), C320236s2.A01(ub62.requireArguments(), "module_name"), C320236s2.A01(ub62.requireArguments(), "prior_module_name"), DbS.A0t(ub62.A0A));
            case 48:
                return C320236s2.A00(DbS.A0B(this.A01), User.class, "merchant");
            default:
                return C320236s2.A01(DbS.A0B(this.A01), "prior_submodule_name");
        }
    }
}
