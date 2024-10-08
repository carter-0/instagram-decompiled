package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MMc  reason: case insensitive filesystem */
public final class C66293MMc extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66293MMc(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C66293MMc(obj, i));
    }

    public static AnonymousClass0eM A01(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C66293MMc(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C277954w0 r0;
        C277884vt r02;
        View view;
        int i;
        ViewStub A0F;
        switch (this.A00) {
            case 0:
                return new KCA(((L7O) this.A01).A01);
            case 1:
                view = AnonymousClass7TE.A0c(((K8D) this.A01).A02);
                if (view != null) {
                    i = R.id.iglive_invite_inline_search_box;
                    break;
                } else {
                    return null;
                }
            case 2:
            case 9:
            case 15:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 22:
            case 27:
            case 33:
            case 36:
            case 40:
            case 45:
                return this.A01;
            case 3:
            case 10:
            case 16:
            case 19:
            case 23:
            case 28:
            case 34:
            case 37:
            case Seq.NULL_REFNUM:
            case 46:
                return DbT.A0r(this.A01);
            case 5:
                return new KCC(AnonymousClass7TE.A0l(((C62251Kcl) this.A01).A02));
            case 6:
                view = AnonymousClass7TE.A0c(((LNA) this.A01).A07);
                i = R.id.iglive_action_button_text;
                break;
            case 7:
                view = AnonymousClass7TE.A0c(((LNA) this.A01).A07);
                i = R.id.iglive_arrow_to_feature_image_view;
                break;
            case 8:
                view = AnonymousClass7TE.A0c(((LNA) this.A01).A07);
                i = R.id.iglive_step_description_text_view;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                view = AnonymousClass7TE.A0c(((LNA) this.A01).A07);
                i = R.id.iglive_step_number_text_view;
                break;
            case 13:
                return AnonymousClass7TE.A0c(((LNA) this.A01).A07).findViewById(R.id.iglive_three_text_pieces);
            case 14:
                return JTT.A0E(((LNA) this.A01).A01, R.id.iglive_nux_tutroial_screen_stub);
            case 21:
                return new KCD(AnonymousClass7TE.A0l(((C62250Kck) this.A01).A02));
            case 25:
                return C240903Nb.A00((View) this.A01, R.id.iglive_capture_hint_text_stub);
            case 26:
                return new KCB((UserSession) this.A01);
            case 30:
                return new KCC(AnonymousClass7TE.A0l(((K8I) this.A01).A01));
            case 31:
                View view2 = ((Fragment) this.A01).mView;
                if (view2 != null && (A0F = DbS.A0F(view2, R.id.recycler_null_state_view_stub)) != null && (view = JTP.A0H(A0F, R.layout.iglive_cohost_request_empty)) != null) {
                    i = R.id.live_cohost_request_empty;
                    break;
                } else {
                    return null;
                }
                break;
            case 32:
                return new KCD(AnonymousClass7TE.A0l(((K8F) this.A01).A03));
            case 39:
                return new KCE((UserSession) this.A01);
            case 43:
                return new KCF((UserSession) this.A01);
            case 44:
                LBL lbl = (LBL) this.A01;
                return C340217kt.A00(lbl.A03.requireContext(), lbl.A04, C66579MXk.A00(939));
            case 48:
                LBL lbl2 = (LBL) this.A01;
                UserSession userSession = lbl2.A04;
                AnonymousClass4DH r3 = lbl2.A03;
                Context context = lbl2.A01;
                C270194gL r03 = lbl2.A05.A0c;
                boolean z = true;
                if (r03 == null || (r0 = r03.A02) == null || (r02 = r0.A0A) == null || !r02.CVs()) {
                    z = false;
                }
                return new KE7(context, r3, userSession, z);
            case 49:
                View findViewById = ((C64874Lja) this.A01).A01.requireView().findViewById(R.id.avatar_likes_container);
                if (findViewById != null) {
                    return C294975nL.A00(findViewById);
                }
                return null;
            default:
                return DbY.A0I(this.A01);
        }
        return view.findViewById(i);
    }
}
