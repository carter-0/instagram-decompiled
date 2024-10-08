package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import go.Seq;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxP  reason: case insensitive filesystem */
public final class C20693WxP extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20693WxP(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20693WxP(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v118, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v124, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v125, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v127, types: [X.2tF, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return ((View) this.A01).findViewById(R.id.discount_link);
            case 1:
                return ((View) this.A01).findViewById(R.id.discount_title);
            case 2:
                return ((View) this.A01).findViewById(R.id.media);
            case 3:
                ViewStub viewStub = (ViewStub) AnonymousClass7TE.A0b(((VTY) this.A01).A00.getView(), R.id.switch_row_stub);
                0qQ.A0B(viewStub, 0);
                View A0H = JTP.A0H(viewStub, R.layout.row_switch_item);
                0qQ.A0A(A0H);
                Mz1 mz1 = new Mz1(A0H);
                A0H.setTag(mz1);
                C48947Eml.A00(A0H, mz1.A06);
                return A0H;
            case 4:
                return new C14682U1d(((UEL) this.A01).A00);
            case 5:
                return new C18748Vzj((UserSession) this.A01);
            case 6:
                return new LOp((UserSession) this.A01);
            case 7:
                return new C64834Liw((UserSession) this.A01);
            case 8:
                return new C17839Vgs((UserSession) this.A01);
            case 9:
                return new VTZ((UserSession) this.A01);
            case 10:
                W35 w35 = (W35) this.A01;
                return AnonymousClass0kN.A01(w35.A03, w35.A02);
            case 11:
                C17999Vjb vjb = (C17999Vjb) this.A01;
                return AnonymousClass0kN.A01(vjb.A00, vjb.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C17999Vjb vjb2 = (C17999Vjb) this.A01;
                ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = vjb2.A02;
                String str = shoppingTaggingFeedArguments.A0E;
                if (str != null) {
                    return C64832Lit.A04.A00(vjb2.A01).A00(shoppingTaggingFeedArguments.A0G, str);
                }
                return null;
            case 13:
                return new LCJ(1vm.A01((UserSession) this.A01));
            case 14:
                return C51967G9n.A0k();
            case 15:
                return AnonymousClass2f9.A00(((C17453VWg) this.A01).A00);
            case 16:
                return this.A01;
            case 17:
                return DbT.A0r(this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return DbY.A0I(this.A01);
            case 19:
                C18661VwI vwI = (C18661VwI) this.A01;
                return new W27(vwI.A02.requireActivity(), vwI.A03);
            case 20:
                C18626VvJ vvJ = (C18626VvJ) this.A01;
                Fragment fragment = vvJ.A0K;
                FragmentActivity requireActivity = fragment.requireActivity();
                Context requireContext = fragment.requireContext();
                UserSession userSession = vvJ.A0L;
                AnonymousClass4DU r10 = vvJ.A0M;
                String str2 = vvJ.A0Q;
                String str3 = vvJ.A0O;
                String str4 = vvJ.A0P;
                return C231132qv.A00(requireContext, requireActivity, (RankingInfo) null, userSession, r10, (Integer) null, (String) null, (String) null, vvJ.A09, (String) null, (String) null, str3, str4, vvJ.A0F, str2, false, AnonymousClass7TF.A1W(vvJ.A0N, C16675UzB.STOREFRONT));
            case 21:
                C15690Ugv ugv = (C15690Ugv) this.A01;
                List list = C15690Ugv.A0U;
                return new C17536VZp(ugv.A0N, ugv.A0L, ugv.A0O, ugv.A0K.getModuleName());
            case 22:
                2cs A0J = AnonymousClass7TF.A0J();
                A0J.A06 = true;
                A0J.A00 = 0.019999999552965164d;
                A0J.A09(C232972uk.A00);
                A0J.A0A(new C15165UTq(this.A01, 4));
                return A0J;
            case 23:
                C15690Ugv ugv2 = (C15690Ugv) this.A01;
                List list2 = C15690Ugv.A0U;
                return new C17641VbX(ugv2.A0I, ugv2.A0J, ugv2.A0L, ugv2.A0N, (C17536VZp) ugv2.A0P.getValue(), ugv2.A0O, ugv2.A0K.getModuleName());
            case 24:
                int i = C232952ui.A0I;
                C15690Ugv ugv3 = (C15690Ugv) this.A01;
                List list3 = C15690Ugv.A0U;
                C232952ui r4 = new C232952ui(ugv3.A0J, ugv3.A0L, ugv3.A0M);
                r4.A0D = false;
                r4.A01 = 0;
                r4.A04.A09(C71392co.A02(10.0d));
                r4.A05.A09(C71392co.A03(8.0d, 12.0d));
                return r4;
            case 25:
                new ArrayList();
                throw new NullPointerException("cartActionBarController");
            case 26:
                return new C55970Hqb((UserSession) this.A01);
            case 27:
                return Integer.valueOf(C66582MXn.A01(((C15698Uh5) this.A01).A05));
            case 28:
                C15345Uav uav = (C15345Uav) this.A01;
                return new C15484UdZ(uav.requireActivity(), (AnonymousClass2kR) uav.A09.getValue(), uav, (C19610WcZ) uav.A07.getValue());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C15345Uav uav2 = (C15345Uav) this.A01;
                return new C19610WcZ(uav2.requireContext(), (C17886Vhd) uav2.A0I.getValue(), uav2, DbS.A0t(uav2.A0B));
            case 30:
                C15345Uav uav3 = (C15345Uav) this.A01;
                0hq parentFragmentManager = uav3.getParentFragmentManager();
                AnonymousClass0eM r2 = uav3.A06;
                C2362232x r42 = new C2362232x(uav3, parentFragmentManager, (C15484UdZ) r2.getValue(), (AnonymousClass2kR) uav3.A09.getValue());
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                r42.A0C = new C234172xD(uav3, (C227762js) uav3.A0F.getValue(), uav3.A05, (C15484UdZ) r2.getValue());
                r42.A0W = DbS.A0t(uav3.A0H);
                return r42.A00();
            case 31:
                C15345Uav uav4 = (C15345Uav) this.A01;
                return new AnonymousClass2kR(uav4.requireContext(), AnonymousClass7TE.A0l(uav4.A0G), uav4);
            case 32:
                return Integer.valueOf(DbS.A0B(this.A01).getInt("media_carousel_index", -1));
            case 33:
                return C320236s2.A01(DbS.A0B(this.A01), "media_id");
            case 34:
                C15345Uav uav5 = (C15345Uav) this.A01;
                C234042wt r43 = new C234042wt(uav5, AnonymousClass7TE.A0l(uav5.A0G), uav5);
                r43.A05 = DbS.A0t(uav5.A0H);
                return r43;
            case 35:
                C15345Uav uav6 = (C15345Uav) this.A01;
                return new AnonymousClass36D(AnonymousClass7TE.A0l(uav6.A0G), (C15484UdZ) uav6.A06.getValue(), false, false);
            case 36:
                return DbS.A0B(this.A01).getString("permission_id");
            case 37:
                int i3 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return C227752jr.A00(DbT.A08(this.A01), (Float) null, false);
            case 38:
                return C228022kf.A00(((Fragment) this.A01).mArguments);
            case 39:
                Fragment fragment2 = (C15345Uav) this.A01;
                return new C17886Vhd(fragment2.requireContext(), AnonymousClass07i.A00(fragment2), AnonymousClass7TE.A0l(fragment2.A0G), fragment2);
            case 40:
                C15345Uav uav7 = (C15345Uav) this.A01;
                return new C18558VuA(uav7, AnonymousClass7TE.A0l(uav7.A0G), uav7.A04, DbS.A0t(uav7.A0H), (String) null, (String) null);
            case Seq.NULL_REFNUM /*41*/:
                return C13991Tnr.A04(this.A01).getString("media_id");
            case Seq.RefTracker.REF_OFFSET /*42*/:
                C15335Uak uak = (C15335Uak) this.A01;
                AnonymousClass2tC A0S = DbV.A0S(uak);
                A0S.A01(new Object());
                AnonymousClass0eM r44 = uak.A0K;
                A0S.A01(new C15798Uih(C229382nI.A03(uak, DbT.A0X(r44), (2el) uak.A0R.getValue())));
                A0S.A01(new C15773UiI(uak.requireActivity(), AnonymousClass7TE.A0l(r44)));
                A0S.A01(new C15793Uic(uak.requireContext(), uak, AnonymousClass7TE.A0l(r44), uak, AnonymousClass05K.A1F));
                C13991Tnr.A1E(A0S, new Object());
                A0S.A01(new Object());
                A0S.A01(new EGK((G5G) null));
                A0S.A01(new Object());
                A0S.A01(new C15759Ui4(uak.requireContext()));
                A0S.A01(new C15757Ui2((W26) uak.A0B.getValue()));
                return DbU.A0U(A0S, new C15758Ui3(uak));
            case 43:
                return C13991Tnr.A04(this.A01).getString(AnonymousClass000.A00(3984));
            case 44:
                return DbS.A0B(this.A01);
            case 45:
                C15335Uak uak2 = (C15335Uak) this.A01;
                AnonymousClass0eM r5 = uak2.A0K;
                if (!182.A06(0Tu.A05, DbT.A0X(r5), 36311835363771167L)) {
                    return null;
                }
                return C249713kF.A00.A0Q(uak2.requireActivity(), AnonymousClass7TE.A0l(r5), (C15380UbZ) null, (C17869VhM) uak2.A07.getValue(), DbS.A0t(uak2.A0M), "instagram_shopping_reconsideration_destination", "reconsideration_destination", C231122qu.A0I(AnonymousClass7TE.A0l(r5), DbS.A0t(uak2.A02)), (String) null, (String) null, (String) null);
            case 46:
                return C18265Vof.A00(AnonymousClass7TE.A0l(((C15335Uak) this.A01).A0K), C16580Uxa.ShoppingReconsiderationDestinationFragment);
            case 47:
                return DbU.A0g(C13991Tnr.A04(this.A01), AnonymousClass000.A00(3342));
            case 48:
                return DbU.A0g(C13991Tnr.A04(this.A01), AnonymousClass000.A00(3422));
            default:
                return DbU.A0g(C13991Tnr.A04(this.A01), AnonymousClass000.A00(3423));
        }
    }
}
