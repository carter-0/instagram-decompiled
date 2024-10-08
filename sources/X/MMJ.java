package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.draft.model.IGTVDraftsRoomDataSource;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class MMJ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMJ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new MMJ(obj, i));
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [X.Kpf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v42, types: [X.RVr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v9, types: [X.RVp, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
            case 4:
            case 8:
            case 14:
            case 48:
                return DbT.A0r(this.A01);
            case 2:
                return new C47726EEj(AnonymousClass7TE.A0l(((E7Y) this.A01).A0F));
            case 3:
            case 7:
            case 13:
            case 47:
                return this.A01;
            case 6:
                return new C47727EEk(((E7T) this.A01).A0C());
            case 10:
                return new C47728EEl(AnonymousClass7TE.A0l(((E64) this.A01).A0G));
            case 11:
                E64 e64 = (E64) this.A01;
                RecyclerView recyclerView = e64.A00;
                if (recyclerView != null) {
                    return new C47987EPt(e64.requireActivity(), recyclerView, e64.A0A, e64.A09);
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                E64 e642 = (E64) this.A01;
                return new AnonymousClass32A(e642, AnonymousClass7TE.A0l(e642.A0G), new AnonymousClass328(e642));
            case 16:
                return C320236s2.A01(DbS.A0B(this.A01), "tray_session_id");
            case 17:
                return new C57091IOf((UserSession) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C15381Ube ube = (C15381Ube) this.A01;
                VO7 vo7 = ube.A0d;
                C15381Ube.A00(ube);
                return new C18507Vt4(vo7, (Hashtag) ube.A0h.getValue());
            case 19:
                return C15381Ube.A00((C15381Ube) this.A01);
            case 20:
                DbS.A1U(this.A01);
                return AnonymousClass7TE.A0u();
            case 21:
                return new C19250WRj((UserSession) this.A01);
            case 22:
                UserSession userSession = ((C65381LsM) this.A01).A01;
                return ((C10735RxE) userSession.A01(C10735RxE.class, new TTN(userSession, 42))).A02.getValue();
            case 23:
                ? obj = new Object();
                C65381LsM lsM = (C65381LsM) this.A01;
                return new So8(obj, (C10404Rrg) lsM.A03.getValue(), lsM.A02);
            case 24:
                return new C39893ADv(((C40562Ae9) this.A01).A02, new Object());
            case 25:
                IgSignalsDcpPredictor igSignalsDcpPredictor = (IgSignalsDcpPredictor) this.A01;
                int intValue = igSignalsDcpPredictor.A03.intValue();
                if (intValue == 0) {
                    return new C65382LsN(igSignalsDcpPredictor.A00, (C64418LbZ) igSignalsDcpPredictor.A06.getValue());
                }
                if (intValue == 1) {
                    return new C40562Ae9(igSignalsDcpPredictor.A00, (C64418LbZ) igSignalsDcpPredictor.A06.getValue());
                }
                if (intValue == 2) {
                    return new C65381LsM(igSignalsDcpPredictor.A00, (C64418LbZ) igSignalsDcpPredictor.A06.getValue());
                }
                throw AnonymousClass7TE.A1K();
            case 26:
                C63773L6f l6f = ((IgSignalsDcpPredictor) this.A01).A02;
                return new C64418LbZ(71, l6f.A02, l6f.A01, l6f.A00);
            case 27:
                ? obj2 = new Object();
                C65382LsN lsN = (C65382LsN) this.A01;
                return new C12158So9(obj2, (S4A) lsN.A04.getValue(), lsN.A02);
            case 28:
                return C9265RVq.A00(((C65382LsN) this.A01).A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new C64719Lgt((UserSession) this.A01);
            case 30:
                return new JU5((UserSession) this.A01);
            case 31:
                return AnonymousClass7TF.A0R(0Tu.A05, ((JU5) this.A01).A0H.A00, 36316521173094864L);
            case 32:
                return AnonymousClass7TE.A0u();
            case 33:
                return null;
            case 34:
                return Double.valueOf(1.0d);
            case 35:
                return Integer.valueOf(DbS.A04(0Tu.A05, ((JU5) this.A01).A0H.A00, 36597996149869643L));
            case 36:
                return 1Al.A01(((C65379LsK) this.A01).A04).A03(1An.A1z);
            case 37:
                return new C65375LsG(((C65376LsH) this.A01).A00);
            case 38:
                return 1Al.A01(((LDD) this.A01).A01).A03(1An.A20);
            case 39:
                return new IGTVDraftsRepository(new IGTVDraftsRoomDataSource((UserSession) this.A01));
            case 40:
                UserSession userSession2 = ((JWW) this.A01).A00;
                0qQ.A0B(userSession2, 0);
                return userSession2.A01(IGTVDraftsRepository.class, new MMJ(userSession2, 39));
            case Seq.NULL_REFNUM:
                return AnonymousClass7TE.A14(((C60115Jfw) ((K8M) this.A01).A05.getValue()).A00);
            case Seq.RefTracker.REF_OFFSET:
                K8M k8m = (K8M) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(k8m.A06);
                return new C55809Hnp(k8m.requireContext(), k8m, A0l, (2el) k8m.A07.getValue(), k8m, DbS.A0t(k8m.A01), MPA.A00(k8m, 11));
            case 43:
                K8M k8m2 = (K8M) this.A01;
                return new C61596KDx(AnonymousClass7TE.A0l(k8m2.A06), new C63640L1c(k8m2.requireContext()), C320236s2.A01(k8m2.requireArguments(), "igtv_topic_channel_id"), C320236s2.A01(k8m2.requireArguments(), "igtv_channel_title_arg"));
            case 44:
                K8M k8m3 = (K8M) this.A01;
                I9I i9i = new I9I(k8m3, AnonymousClass7TE.A0l(k8m3.A06), k8m3, DbS.A0t(k8m3.A01));
                k8m3.getViewLifecycleOwner().getLifecycle().A09(i9i);
                return i9i;
            case 45:
                return C51971G9r.A0U(this.A01);
            case 46:
                return JTR.A0b(this.A01);
            default:
                return DbY.A0I(this.A01);
        }
    }
}
