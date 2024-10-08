package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Plj  reason: case insensitive filesystem */
public final class C73908Plj extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73908Plj(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C73908Plj(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C62320sa r0;
        switch (this.A00) {
            case 0:
                UserSession userSession = ((P12) this.A01).A00;
                02m r2 = 02m.A0p;
                return new NUV(r2, AnonymousClass65D.A00(userSession), C66580MXl.A0o(userSession, r2));
            case 1:
                return AnonymousClass65D.A00(((OKI) this.A01).A00);
            case 2:
            case 9:
                return JTO.A0G(this.A01).requireViewById(R.id.devices_recyclerview);
            case 3:
            case 11:
                return JTO.A0G(this.A01).requireViewById(R.id.loading_spinner);
            case 4:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 21:
            case 28:
            case Seq.RefTracker.REF_OFFSET:
                return this.A01;
            case 5:
            case 13:
            case 22:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 43:
                return DbT.A0r(this.A01);
            case 7:
                r0 = ((C68735NUv) this.A01).A00;
                break;
            case 8:
            case 16:
                NJT njt = (NJT) this.A01;
                return new NN1(AnonymousClass7TE.A0l(njt.A00), OP6.A01(njt));
            case 10:
            case 38:
                return AnonymousClass65D.A00(AnonymousClass7TE.A0l(((NJT) this.A01).A00));
            case 15:
                r0 = ((C68736NUw) this.A01).A06;
                break;
            case 17:
                return OP5.A01((UserSession) this.A01, "EncryptedBackupsOneTimeCodeDevicesViewModel");
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 34:
                return 2dZ.A0t.A03(((Fragment) this.A01).getActivity());
            case 19:
            case 35:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.bottom_button);
            case 20:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.display_code_code);
            case 24:
                r0 = ((C68727NUn) this.A01).A00;
                break;
            case 25:
                AnonymousClass0eM r02 = ((NJT) this.A01).A00;
                return new NN9(AnonymousClass12T.A00, AnonymousClass7TE.A0l(r02), C69897Ntz.A00(AnonymousClass7TE.A0l(r02)), C74035Po0.A00);
            case 26:
                return C69897Ntz.A00(AnonymousClass7TE.A0l(((NJT) this.A01).A00));
            case 27:
                return C69897Ntz.A00(AnonymousClass7TE.A0l(((NIC) this.A01).A01));
            case 31:
                r0 = ((NID) this.A01).A03;
                break;
            case 32:
                AnonymousClass0eM r03 = ((NID) this.A01).A01;
                return new NN9(AnonymousClass12T.A00, AnonymousClass7TE.A0l(r03), C69897Ntz.A00(AnonymousClass7TE.A0l(r03)), C74035Po0.A00);
            case 33:
                C67742Mtv mtv = (C67742Mtv) this.A01;
                NUH nuh = mtv.A03;
                nuh.A0B("OTC_DISPLAY_CODE_GET_API_TIMEOUT");
                0KC.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", "timeout getting api");
                mtv.A06.FIA(new O6B(false));
                mtv.A07.FIA("");
                mtv.A04.FIA(new O6A(true));
                C66913Mex.A04(nuh, "FAILURE_REASON", "GENERATE_CODE_ERROR");
                return C60340gF.A00;
            case 36:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.enter_code_edit_text);
            case 37:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.enter_code_description);
            case 39:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.error_text);
            case 40:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.enter_code_description_loading_spinner);
            case Seq.NULL_REFNUM:
            case 49:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.cell_container);
            case 45:
                r0 = ((C68739NUz) this.A01).A00;
                break;
            case 46:
                NJT njt2 = (NJT) this.A01;
                return new NNO(DbY.A05(njt2), AnonymousClass7TE.A0l(njt2.A00), OP6.A01(njt2), C71145Oe2.A02(njt2));
            case 47:
                return Boolean.valueOf(DbT.A1X(DbS.A0B(this.A01), "BUNDLE_WAS_TABLE_DROPPED"));
            case 48:
                return OP6.A01((NJT) this.A01);
            default:
                return DbY.A0I(this.A01);
        }
        return r0.invoke();
    }
}
