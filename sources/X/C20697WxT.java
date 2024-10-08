package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxT  reason: case insensitive filesystem */
public final class C20697WxT extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20697WxT(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20697WxT(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        BaseBundle baseBundle;
        String str;
        Integer num;
        switch (this.A00) {
            case 0:
                C15335Uak uak = (C15335Uak) this.A01;
                return new W26(AnonymousClass7TE.A0l(uak.A0K), C227942kP.A01("instagram_shopping_reconsideration_destination", true, false), C51968G9o.A0v(C66580MXl.A0r(uak.A0O)), DbS.A0t(uak.A0M), DbS.A0t(uak.A0E), DbS.A0t(uak.A0F), DbS.A0t(uak.A0C), AnonymousClass7TF.A1V(uak.A04.getValue()));
            case 1:
                baseBundle = C13991Tnr.A04(this.A01);
                str = "merchant_id";
                break;
            case 2:
                baseBundle = C13991Tnr.A04(this.A01);
                str = "merchant_username";
                break;
            case 3:
                String string = C13991Tnr.A04(this.A01).getString("prior_module_name");
                if (string != null) {
                    return string;
                }
                throw new IllegalStateException("prior module required");
            case 4:
                baseBundle = C13991Tnr.A04(this.A01);
                str = "prior_submodule_name";
                break;
            case 5:
                List list = C15690Ugv.A0U;
                C15335Uak uak2 = (C15335Uak) this.A01;
                return new C15690Ugv(uak2.requireActivity(), uak2.requireContext(), uak2, AnonymousClass7TE.A0l(uak2.A0K), DbS.A0t(uak2.A0M));
            case 6:
                C15335Uak uak3 = (C15335Uak) this.A01;
                AnonymousClass0eM r1 = uak3.A0K;
                C15335Uak uak4 = uak3;
                C18626VvJ vvJ = new C18626VvJ(uak3, AnonymousClass7TE.A0l(r1), uak4, C16675UzB.SHOP_HOME, DbS.A0t(uak3.A0M), DbS.A0t(uak3.A0E), DbS.A0t(uak3.A0F));
                vvJ.A00 = (2el) uak3.A0R.getValue();
                AnonymousClass0eM r2 = uak3.A02;
                vvJ.A0A = DbS.A0t(r2);
                vvJ.A01 = DbX.A0d(r1).A02(DbS.A0t(r2));
                vvJ.A07 = C51968G9o.A0v(C66580MXl.A0r(uak3.A0O));
                vvJ.A09 = DbS.A0t(uak3.A04);
                return vvJ.A02();
            case 7:
                C15335Uak uak5 = (C15335Uak) this.A01;
                return new C15698Uh5(uak5.requireContext(), uak5, uak5, AnonymousClass7TE.A0l(uak5.A0K));
            case 8:
                Fragment fragment = (C15335Uak) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(fragment.A0K);
                Context requireContext = fragment.requireContext();
                AnonymousClass0eM r0 = fragment.A0C;
                String A0t = DbS.A0t(r0);
                0gy A002 = AnonymousClass07i.A00(fragment);
                if (r0.getValue() != null) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                return new C15682Ugn(requireContext, A002, A0l, fragment, num, A0t);
            case 9:
                return C228022kf.A00((Bundle) ((C15335Uak) this.A01).A05.getValue());
            case 10:
                baseBundle = C13991Tnr.A04(this.A01);
                str = "shops_first_entry_point";
                break;
            case 11:
                return Long.valueOf(C13991Tnr.A04(this.A01).getLong(AnonymousClass000.A00(3985), 0));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return this.A01;
            case 13:
                return DbT.A0r(this.A01);
            case 14:
                return DbY.A0I(this.A01);
            case 15:
                baseBundle = C13991Tnr.A04(this.A01);
                str = "surface_title";
                break;
            case 16:
                C15335Uak uak6 = (C15335Uak) this.A01;
                return new C15729Uha(uak6, AnonymousClass7TE.A0l(uak6.A0K), (W26) uak6.A0B.getValue(), uak6, DbS.A0t(uak6.A0C), DbS.A0t(uak6.A0D), AnonymousClass7TF.A1Z(uak6.A09), AnonymousClass7TF.A1Z(uak6.A0A), AnonymousClass7TF.A1Z(uak6.A08));
            case 17:
                C15335Uak uak7 = (C15335Uak) this.A01;
                if (uak7.A0C.getValue() != null) {
                    return null;
                }
                UserSession A0l2 = AnonymousClass7TE.A0l(uak7.A0K);
                FragmentActivity requireActivity = uak7.requireActivity();
                Context requireContext2 = uak7.requireContext();
                String A0t2 = DbS.A0t(uak7.A0M);
                uak7.A0E.getValue();
                uak7.A0F.getValue();
                return new C17911Vi2(requireContext2, requireActivity, A0l2, (W26) uak7.A0B.getValue(), "instagram_shopping_reconsideration_destination", A0t2);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                C19653WdH wdH = (C19653WdH) this.A01;
                return new C19640Wd3(wdH.A00, wdH.A01, wdH.A02);
            case 19:
                C15342Uas uas = (C15342Uas) this.A01;
                return new C18065Vkr(uas.requireContext(), AnonymousClass7TE.A0l(uas.A06), uas, uas);
            case 20:
                C15348Uaz uaz = (C15348Uaz) this.A01;
                Context requireContext3 = uaz.requireContext();
                UserSession A0l3 = AnonymousClass7TE.A0l(uaz.A0D);
                AnonymousClass0eM r12 = uaz.A08;
                List list2 = ((FeaturedProductMediaFeedGridConfiguration) r12.getValue()).A08;
                return new C15479UdU(requireContext3, A0l3, uaz, uaz, (C19611Wca) uaz.A09.getValue(), uaz.A03, (C19742Wej) uaz.A0E.getValue(), list2, ((FeaturedProductMediaFeedGridConfiguration) r12.getValue()).A09);
            case 21:
                C15348Uaz uaz2 = (C15348Uaz) this.A01;
                return WWR.A00(AnonymousClass7TE.A0l(uaz2.A0D), uaz2, 6);
            case 23:
                C15348Uaz uaz3 = (C15348Uaz) this.A01;
                return new C19611Wca(uaz3.requireContext(), uaz3, (FeaturedProductMediaFeedGridConfiguration) uaz3.A08.getValue(), (C19742Wej) uaz3.A0E.getValue());
            case 24:
                C15348Uaz uaz4 = (C15348Uaz) this.A01;
                C234042wt r4 = new C234042wt(uaz4, AnonymousClass7TE.A0l(uaz4.A0D), uaz4);
                r4.A05 = DbS.A0t(uaz4.A0F);
                return r4;
            case 25:
                return DbS.A0B(this.A01).getParcelable(AnonymousClass000.A00(54));
            case 26:
                C15348Uaz uaz5 = (C15348Uaz) this.A01;
                FragmentActivity requireActivity2 = uaz5.requireActivity();
                0hq r7 = uaz5.mFragmentManager;
                if (r7 != null) {
                    return new AnonymousClass2uE(requireActivity2, uaz5, r7, AnonymousClass7TE.A0l(uaz5.A0D), (AnonymousClass57N) null, uaz5, new C19380WWw(uaz5, 0), (C249763kK) null, false, true, false);
                }
                throw AnonymousClass7TE.A0y();
            case 27:
                Fragment fragment2 = (C15348Uaz) this.A01;
                return new C19742Wej(fragment2.requireContext(), AnonymousClass07i.A00(fragment2), AnonymousClass7TE.A0l(fragment2.A0D), fragment2, ((FeaturedProductMediaFeedGridConfiguration) fragment2.A08.getValue()).A05);
            case 28:
            case 43:
                return C228022kf.A00(((Fragment) this.A01).mArguments);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C15348Uaz uaz6 = (C15348Uaz) this.A01;
                return DbX.A0P(uaz6, uaz6.A0D);
            case 30:
                C15351Ub2 ub2 = (C15351Ub2) this.A01;
                return new C15489Ude(ub2.requireActivity(), (AnonymousClass2kR) ub2.A0A.getValue(), ub2, (C19742Wej) ub2.A0K.getValue());
            case 31:
                return C320236s2.A01(DbS.A0B(this.A01), "api_path");
            case 32:
                C15351Ub2 ub22 = (C15351Ub2) this.A01;
                0hq parentFragmentManager = ub22.getParentFragmentManager();
                AnonymousClass0eM r22 = ub22.A07;
                C2362232x r42 = new C2362232x(ub22, parentFragmentManager, (C15489Ude) r22.getValue(), (AnonymousClass2kR) ub22.A0A.getValue());
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                r42.A0C = new C234172xD(ub22, (C227762js) ub22.A0H.getValue(), ub22.A05, (C15489Ude) r22.getValue());
                r42.A0W = DbS.A0t(ub22.A0L);
                return r42.A00();
            case 33:
                C15351Ub2 ub23 = (C15351Ub2) this.A01;
                return new AnonymousClass2kR(ub23.requireContext(), AnonymousClass7TE.A0l(ub23.A0J), ub23);
            case 34:
                return DbS.A0B(this.A01).getStringArrayList("media_ids");
            case 35:
                C15351Ub2 ub24 = (C15351Ub2) this.A01;
                C234042wt r43 = new C234042wt(ub24, AnonymousClass7TE.A0l(ub24.A0J), ub24);
                r43.A05 = DbS.A0t(ub24.A0L);
                return r43;
            case 36:
                C15351Ub2 ub25 = (C15351Ub2) this.A01;
                return WWR.A00(AnonymousClass7TE.A0l(ub25.A0J), ub25, 7);
            case 37:
                baseBundle = DbS.A0B(this.A01);
                str = "merchant_id";
                break;
            case 38:
                baseBundle = DbS.A0B(this.A01);
                str = "prior_module_name";
                break;
            case 39:
                baseBundle = DbS.A0B(this.A01);
                str = "prior_submodule_name";
                break;
            case 40:
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return C227752jr.A00(DbT.A08(this.A01), (Float) null, false);
            case Seq.NULL_REFNUM /*41*/:
                return C320236s2.A01(DbS.A0B(this.A01), AnonymousClass000.A00(772));
            case Seq.RefTracker.REF_OFFSET /*42*/:
                Fragment fragment3 = (C15351Ub2) this.A01;
                return new C19742Wej(fragment3.requireContext(), AnonymousClass07i.A00(fragment3), AnonymousClass7TE.A0l(fragment3.A0J), fragment3, fragment3.requireArguments().getString("next_max_id"));
            case 44:
                baseBundle = DbS.A0B(this.A01);
                str = "surface_title";
                break;
            case 45:
                C15351Ub2 ub26 = (C15351Ub2) this.A01;
                return DbX.A0P(ub26, ub26.A0J);
            case 46:
                C15351Ub2 ub27 = (C15351Ub2) this.A01;
                return new C18558VuA(ub27, AnonymousClass7TE.A0l(ub27.A0J), ub27.A04, DbS.A0t(ub27.A0L), DbS.A0t(ub27.A0F), DbS.A0t(ub27.A0G));
            case 47:
                C15349Ub0 ub0 = (C15349Ub0) this.A01;
                C19611Wca wca = (C19611Wca) ub0.A09.getValue();
                ub0.A08.getValue();
                return new C54225H3u(ub0.requireContext(), AnonymousClass7TE.A0l(ub0.A0D), ub0, ub0, wca, ub0.A03, (C19742Wej) ub0.A0E.getValue());
            case 48:
                C15349Ub0 ub02 = (C15349Ub0) this.A01;
                return new AnonymousClass36D(AnonymousClass7TE.A0l(ub02.A0D), new C57198ISl(ub02, 2), false, false);
            default:
                Parcelable parcelable = DbS.A0B(this.A01).getParcelable(AnonymousClass000.A00(1348));
                0qQ.A0A(parcelable);
                return parcelable;
        }
        return baseBundle.getString(str);
    }
}
