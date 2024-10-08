package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.PhV  reason: case insensitive filesystem */
public final class C73656PhV extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73656PhV(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((View) this.A01).clearFocus();
                return AnonymousClass7TE.A0u();
            case 1:
                C68495NKo nKo = (C68495NKo) this.A01;
                if (nKo.A0C() > -1 && nKo.A00 >= nKo.A0C()) {
                    C67759MuF A0E = nKo.A0E();
                    C67759MuF.A02(C67759MuF.A01(A0E), A0E, 15);
                    C358248ab A0U = DbW.A0U(nKo);
                    A0U.A09(2131954799);
                    A0U.A0q(DbV.A0z(nKo, Integer.valueOf(nKo.A0C()), 2131954798));
                    A0U.A0Q((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131968772);
                    DbT.A1V(A0U);
                    break;
                } else {
                    Bundle requireArguments = nKo.requireArguments();
                    requireArguments.putString("DirectFragment.ENTRY_POINT", "BUTTON");
                    Dba.A0K(nKo.getActivity(), requireArguments, AnonymousClass7TE.A0l(nKo.A0S), ModalActivity.class, C273654mx.A00(661)).A0D(nKo, 5543);
                    break;
                }
                break;
            case 2:
                ((C68495NKo) this.A01).A0E().A07();
                return C60340gF.A00;
            case 3:
                Dba.A1Q(this.A01);
                return C60340gF.A00;
            case 4:
                Fragment fragment = (Fragment) this.A01;
                C358248ab A0H = Dba.A0H(fragment);
                A0H.A09(2131973640);
                A0H.A08(2131973639);
                A0H.A0F(C71249OgE.A00(fragment, 30));
                A0H.A0C(C71209Ofa.A00);
                AnonymousClass7TH.A0a(A0H, true);
                return C60340gF.A00;
            case 5:
            case 6:
                NV6 nv6 = (NV6) this.A01;
                if (nv6.A05.size() == nv6.A02.size()) {
                    NV6.A03(nv6);
                    break;
                } else {
                    AnonymousClass72Q r2 = nv6.A0C;
                    if (r2 != null) {
                        C290815g0 A012 = r2.A01(nv6.A02, (List) null);
                        A012.A00 = new NQT(nv6, 2);
                        1ES.A03(A012);
                        break;
                    } else {
                        0qQ.A0F("remoteMediaHelper");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            case 7:
                String A0w = C66580MXl.A0w((C68495NKo) this.A01);
                if (A0w != null) {
                    return C66580MXl.A0g(A0w);
                }
                throw AnonymousClass7TE.A0y();
            case 8:
                return ((C68495NKo) this.A01).A0G();
            case 9:
                C68444NIh nIh = (C68444NIh) this.A01;
                return AnonymousClass7IP.A00(nIh, AnonymousClass7TE.A0l(nIh.A0I));
            case 10:
                return C69869NtX.A00(((C67759MuF) this.A01).A04);
            case 11:
                return AnonymousClass7IP.A00(DbS.A0O("direct_card_gallery_fragment"), ((C67759MuF) this.A01).A04);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new String[((AnonymousClass0r6[]) this.A01).length];
            case 13:
                return new Object[((AnonymousClass0r6[]) this.A01).length];
            case 14:
                C67759MuF muF = (C67759MuF) this.A01;
                return 2L2.A00(muF.A04).B33(muF.A09);
            case 15:
                return AnonymousClass7IP.A00(DbS.A0O("direct_card_gallery_fragment"), ((C67746Mtz) this.A01).A01);
            case 16:
                C67746Mtz mtz = (C67746Mtz) this.A01;
                return 1bJ.A00(mtz.A01).B33(mtz.A03);
            case 17:
                return 1Ou.A01((UserSession) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new LP4(new C73656PhV(this.A01, 17));
            case 19:
                return new DirectCardGalleryRepository((UserSession) this.A01);
            case 24:
                return C66583MXo.A0P(((C47513E5w) this.A01).A04);
            case 25:
                return Boolean.valueOf(DbT.A1X(DbS.A0B(this.A01), "DirectPrivateStoryRecipientFragment.IS_DISPLAYED_IN_BOTTOM_SHEET"));
            case 26:
                return C69866NtU.A00(AnonymousClass7TE.A0l(((C47513E5w) this.A01).A04));
            case 27:
                return C48845El7.A00(DbS.A0B(this.A01));
            case 28:
                return DbU.A0g(DbS.A0B(this.A01), "channel_creation_entry_from_chooser");
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                ((E4V) this.A01).A0G.getValue();
                return AnonymousClass7TE.A0u();
            case 30:
                return C66583MXo.A0P(((E4V) this.A01).A0G);
            case 31:
                return C69866NtU.A00(AnonymousClass7TE.A0l(((E4V) this.A01).A0G));
            case 32:
            case 40:
            case 48:
                return this.A01;
            case 33:
            case Seq.NULL_REFNUM:
            case 49:
                return DbT.A0r(this.A01);
            case 34:
            case Seq.RefTracker.REF_OFFSET:
                return DbY.A0I(this.A01);
            case 35:
                E4V e4v = (E4V) this.A01;
                EV0 A013 = E4V.A01(e4v);
                ChannelCreationSource channelCreationSource = (ChannelCreationSource) e4v.A0A.getValue();
                return new C46800Dlb(DbY.A05(e4v), AnonymousClass7TE.A0l(e4v.A0G), (ChannelCreationFlowExtraArgs) e4v.A0C.getValue(), DbZ.A0R(e4v.A0F), channelCreationSource, (C50338FYv) e4v.A0H.getValue(), A013, Integer.valueOf(DbX.A07(e4v.A0D)));
            case 36:
                C46732DkL dkL = (C46732DkL) this.A01;
                dkL.A0B.Epw(C61889KQe.A00);
                dkL.A0H();
                return C60340gF.A00;
            case 37:
                return DbV.A0o(DbS.A0B(this.A01), "BroadcastChannelActivityFeedV2Fragment.ARGUMENT_FETCH_MODE");
            case 38:
                ((BroadcastChannelActivityFeedV2ViewModel) ((C68492NKl) this.A01).A04.getValue()).A01();
                return C60340gF.A00;
            case 39:
                return new C70651OEy(AnonymousClass7TE.A0l(((C68492NKl) this.A01).A03));
            case 43:
                C68492NKl nKl = (C68492NKl) this.A01;
                return new NNC(nKl.requireContext(), AnonymousClass7TE.A0l(nKl.A03), (C70651OEy) nKl.A02.getValue(), DbX.A07(nKl.A01));
            case 44:
                ((C68494NKn) this.A01).A0D().A0D();
                return C60340gF.A00;
            case 45:
                C68494NKn nKn = (C68494NKn) this.A01;
                C70734OIr oIr = C67484Moe.A08;
                Context requireContext = nKn.requireContext();
                AnonymousClass0eM r3 = nKn.A05;
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                C67098MiI miI = new C67098MiI(nKn.requireActivity(), nKn.requireContext(), nKn, AnonymousClass7TE.A0l(r3));
                UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                nKn.A0C();
                Mi5 A002 = Mi4.A00(A0l2);
                Context requireContext2 = nKn.requireContext();
                Q2C q2c = Q2C.A03;
                if (q2c == null) {
                    q2c = new Q2C(requireContext2);
                    Q2C.A03 = q2c;
                }
                return new C67484Moe(requireContext, nKn, nKn, A0l, new P3O(nKn), miI, A002, q2c);
            case 46:
                return OPT.A00(AnonymousClass7TE.A0l(((C68494NKn) this.A01).A05));
            case 47:
                return OPT.A00(((ChannelDiscoveryViewModel) this.A01).A04);
            default:
                DbS.A1U(this.A01);
                return C60340gF.A00;
        }
        return C60340gF.A00;
    }
}
