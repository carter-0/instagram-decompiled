package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.connections.notifyme.modules.fragments.NotifyMeNotFollowedFragment;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MMC extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMC(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new MMC(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C249383je r1;
        switch (this.A00) {
            case 0:
                return C51966G9m.A18(this.A01);
            case 1:
                return new C61522KBb(AnonymousClass7TE.A0l(((NotifyMeNotFollowedFragment) this.A01).A02));
            case 2:
            case 23:
            case 39:
            case 48:
                return this.A01;
            case 4:
            case 25:
            case Seq.NULL_REFNUM:
                return DbY.A0I(this.A01);
            case 5:
                return new JUB(1vm.A01((UserSession) this.A01));
            case 6:
                return new C52357GPc((UserSession) this.A01);
            case 7:
                UserSession userSession = ((C62033KWl) this.A01).A00;
                return new NotesApi(userSession, 1vm.A01(userSession));
            case 8:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52065GDl) this.A01).A00, 36323161194703815L);
            case 9:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C52065GDl) this.A01).A00, 36323161194572741L);
            case 10:
                C60299Jix jix = (C60299Jix) this.A01;
                return new LD2((LAH) jix.A05.getValue(), (L63) jix.A06.getValue(), (C63872LAb) jix.A08.getValue());
            case 11:
                C60299Jix jix2 = (C60299Jix) this.A01;
                AnonymousClass0iw r2 = jix2.A00;
                UserSession userSession2 = jix2.A01;
                return new LAH(r2, userSession2, new KWS(userSession2));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C63609Kzx((C63872LAb) ((C60299Jix) this.A01).A08.getValue());
            case 13:
                C60299Jix jix3 = (C60299Jix) this.A01;
                UserSession userSession3 = jix3.A01;
                ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = jix3.A03;
                return new C63872LAb(userSession3, jix3.A02, contentNotesImmersiveReplyContent.A02.A08, contentNotesImmersiveReplyContent.A0F);
            case 14:
                return new C63911LBw((L9Y) ((C60299Jix) this.A01).A0A.getValue());
            case 15:
                C60299Jix jix4 = (C60299Jix) this.A01;
                return new L9Y(jix4.A01, jix4.A03);
            case 16:
                return new AnonymousClass5CT((UserSession) this.A01);
            case 17:
                C59704JUm jUm = (C59704JUm) this.A01;
                boolean A1U = Dba.A1U((((float) JTP.A06(jUm)) > 136.0f ? 1 : (((float) JTP.A06(jUm)) == 136.0f ? 0 : -1)));
                float f = jUm.A01;
                if (A1U) {
                    f -= 10.0f;
                }
                return new GVE(2eL.A06(jUm.A07, 12), 10.0f, f);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                ((Handler) this.A01).removeCallbacksAndMessages((Object) null);
                break;
            case 19:
                AnonymousClass4DV r0 = ((GMH) this.A01).A0A;
                if (!(r0 == null || (r1 = C55387Hgt.A00) == null)) {
                    C238133Ar scrollingViewProxy = r0.getScrollingViewProxy();
                    if (scrollingViewProxy != null) {
                        scrollingViewProxy.EEZ(r1);
                    }
                    C55387Hgt.A00 = null;
                    break;
                }
            case 20:
                ((C243673Zt) this.A01).A00(0sl.A00);
                break;
            case 21:
                return new NoteAudienceItem(AnonymousClass916.A00(Integer.valueOf(DbX.A07(((E1H) this.A01).A01))), (String) null, (List) null, 0);
            case 22:
                E1H e1h = (E1H) this.A01;
                return new C70799OLu(e1h, e1h, AnonymousClass7TE.A0l(e1h.A0D), AnonymousClass000.A00(4328));
            case 26:
                E1H e1h2 = (E1H) this.A01;
                return new H6H(AnonymousClass7TE.A0l(e1h2.A0D), DbS.A0t(e1h2.A07), DbS.A0t(e1h2.A09));
            case 27:
                ((LN3) this.A01).A00 = true;
                break;
            case 28:
                C61361K4d k4d = (C61361K4d) this.A01;
                FragmentActivity requireActivity = k4d.requireActivity();
                LAH A012 = C60299Jix.A01(k4d);
                L62 l62 = new L62(A012.A02, A012.A03, A012);
                return new ImmersiveReplyControlMenuViewBinder(requireActivity, C61361K4d.A01(k4d), AnonymousClass7TE.A0l(k4d.A0D), C60299Jix.A00(k4d), l62, (LCf) k4d.A09.getValue(), DbV.A0J(k4d));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C61361K4d k4d2 = (C61361K4d) this.A01;
                return new L3Z(k4d2.requireContext(), C60299Jix.A00(k4d2));
            case 30:
                return AnonymousClass3E4.A01(this.A01, false, true);
            case 31:
                C61361K4d k4d3 = (C61361K4d) this.A01;
                return new C63693L3d(k4d3.requireActivity(), (LCf) k4d3.A09.getValue());
            case 32:
                L63 l63 = ((LD2) C61361K4d.A00((C61361K4d) this.A01).A04.getValue()).A00;
                if (!l63.A00) {
                    l63.A01.Epw(C62451Kg1.CLOSE_ON_DISMISS_KEYBOARD);
                    l63.A00 = true;
                }
                return AnonymousClass7TE.A0v();
            case 33:
                return new H5Y(AnonymousClass7TE.A0l(((C61361K4d) this.A01).A0D));
            case 34:
                C61361K4d k4d4 = (C61361K4d) this.A01;
                return new LCf(AnonymousClass7TE.A0l(k4d4.A0D), C60299Jix.A00(k4d4).A0A);
            case 35:
                C61361K4d k4d5 = (C61361K4d) this.A01;
                return new C63691L3b(C60299Jix.A00(k4d5), (C63911LBw) C61361K4d.A00(k4d5).A09.getValue());
            case 36:
                C61361K4d k4d6 = (C61361K4d) this.A01;
                return new C64897Ljx(k4d6.requireActivity(), AnonymousClass7TE.A0l(k4d6.A0D), (LCf) k4d6.A09.getValue());
            case 37:
                C61361K4d k4d7 = (C61361K4d) this.A01;
                return new C63692L3c(C60299Jix.A00(k4d7), (C63911LBw) C61361K4d.A00(k4d7).A09.getValue());
            case 38:
            case 47:
                return C51971G9r.A0U(this.A01);
            case Seq.RefTracker.REF_OFFSET:
                C61361K4d k4d8 = (C61361K4d) this.A01;
                return new KDI(C61361K4d.A01(k4d8), AnonymousClass7TE.A0l(k4d8.A0D), (ContentNotesImmersiveReplyContent) k4d8.A02.getValue());
            case 43:
                return C247323g9.A00(((C64898Ljy) this.A01).A01);
            case 44:
                return new H5Y(AnonymousClass7TE.A0l(((C54162H1g) this.A01).A09));
            case 45:
                C54162H1g h1g = (C54162H1g) this.A01;
                return new KEG(AnonymousClass7TE.A0l(h1g.A09), (String) null, (String) null, ((ContentNotesImmersiveSelfNoteContent) h1g.A03.getValue()).A01.A0H, false);
            case 46:
                C54162H1g h1g2 = (C54162H1g) this.A01;
                AnonymousClass0eM r12 = h1g2.A03;
                return new H6H(AnonymousClass7TE.A0l(h1g2.A09), ((ContentNotesImmersiveSelfNoteContent) r12.getValue()).A01.A0F, ((ContentNotesImmersiveSelfNoteContent) r12.getValue()).A01.A0H);
            default:
                return DbT.A0r(this.A01);
        }
        return C60340gF.A00;
    }
}
