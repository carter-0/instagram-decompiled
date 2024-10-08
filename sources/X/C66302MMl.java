package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MMl  reason: case insensitive filesystem */
public final class C66302MMl extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66302MMl(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C66302MMl(obj, i));
    }

    public static AnonymousClass0eM A01(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C66302MMl(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        ViewStub A0F;
        View A0H;
        switch (this.A00) {
            case 0:
                View findViewById = ((C62259Kct) this.A01).A01.findViewById(R.id.iglive_audio_button);
                0qQ.A0A(findViewById);
                findViewById.setVisibility(0);
                return findViewById;
            case 1:
                View findViewById2 = ((C62259Kct) this.A01).A01.findViewById(R.id.iglive_video_button);
                0qQ.A0A(findViewById2);
                findViewById2.setVisibility(0);
                return findViewById2;
            case 2:
                LEE lee = (LEE) this.A01;
                RecyclerView A0I = DbT.A0I(lee.A01, R.id.iglive_mention_suggestions_recycler_view);
                DbV.A1A(lee.A03.requireContext(), A0I);
                A0I.setAdapter(lee.A05);
                return A0I;
            case 4:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 17:
            case 23:
            case 27:
            case 33:
            case 37:
                return DbT.A0r(this.A01);
            case 5:
            case 9:
            case 13:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 24:
            case 28:
            case 34:
            case 38:
                return DbY.A0I(this.A01);
            case 6:
                LEE lee2 = (LEE) this.A01;
                return new C61583KDk(lee2.A03, lee2.A04, lee2.A06);
            case 10:
                return new KCG(AnonymousClass7TE.A0l(((K8N) this.A01).A03));
            case 14:
                L9R l9r = (L9R) this.A01;
                return new KD5(l9r.A02, l9r.A03);
            case 15:
                View A0c = AnonymousClass7TE.A0c(((K8D) this.A01).A02);
                if (A0c != null) {
                    return A0c.findViewById(R.id.iglive_invite_inline_search_box);
                }
                return null;
            case 19:
                return new KCG(AnonymousClass7TE.A0l(((C62252Kcm) this.A01).A02));
            case 20:
                View view2 = ((Fragment) this.A01).mView;
                if (view2 == null || (A0F = DbS.A0F(view2, R.id.recycler_null_state_view_stub)) == null || (A0H = JTP.A0H(A0F, R.layout.layout_iglive_moderator_actions_fragment)) == null) {
                    return null;
                }
                return A0H.findViewById(R.id.moderator_actions_empty_container);
            case 21:
                K8O k8o = (K8O) this.A01;
                return new F3J(k8o, AnonymousClass7TE.A0l(k8o.A05));
            case 25:
                LA6 la6 = (LA6) this.A01;
                return new KD6(la6.A03, la6.A04);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                LRB lrb = (LRB) this.A01;
                UserSession userSession = lrb.A04;
                C313666go r2 = lrb.A05;
                AnonymousClass4DH r1 = lrb.A02;
                return new KE9(r1.requireContext(), r1, userSession, r2);
            case 30:
                C62261Kcv kcv = (C62261Kcv) this.A01;
                return new C61576KDd(kcv.requireContext(), kcv, AnonymousClass7TE.A0l(kcv.A08));
            case 31:
                0xa r3 = ((C60221Jhe) ((C62261Kcv) this.A01).A07.getValue()).A08.A02.A00;
                AnonymousClass7TG.A1L(r3.AR4(), r3, "key_ig_live_upsell_number_times", 0);
                return C60340gF.A00;
            case 35:
                return C313746gw.A00(AnonymousClass7TE.A0l(((C62260Kcu) this.A01).A0D));
            case 39:
                C62260Kcu kcu = (C62260Kcu) this.A01;
                return new C61584KDl(kcu.requireContext(), kcu, AnonymousClass7TE.A0l(kcu.A0D));
            case 40:
                C64710Lgj lgj = (C64710Lgj) this.A01;
                ViewGroup viewGroup = lgj.A05;
                boolean A06 = 182.A06(0Tu.A05, lgj.A0D, 36322817595288012L);
                int i2 = R.id.iglive_audience_pill_stub;
                if (A06) {
                    i2 = R.id.iglive_audience_pill_new_stub;
                }
                View A0F2 = DbY.A0F(viewGroup, i2);
                0qQ.A0A(A0F2);
                A0F2.setVisibility(8);
                AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0F2);
                A0m.A04 = new C64850LjC(lgj, 8);
                A0m.A05 = AnonymousClass05K.A01;
                A0m.A00();
                return A0F2;
            case Seq.NULL_REFNUM:
                return AnonymousClass7TH.A06(((C64710Lgj) this.A01).A0M).requireViewById(R.id.iglive_audience_pill_icon);
            case Seq.RefTracker.REF_OFFSET:
                return AnonymousClass7TH.A06(((C64710Lgj) this.A01).A0M).requireViewById(R.id.iglive_audience_pill_text);
            case 43:
                ViewGroup viewGroup2 = ((C64710Lgj) this.A01).A05;
                ViewStub A0F3 = DbS.A0F(viewGroup2, R.id.camera_home_button_stub);
                if (A0F3 != null) {
                    A0F3.inflate();
                }
                return viewGroup2.requireViewById(R.id.camera_home_button);
            case 44:
                ViewGroup viewGroup3 = ((C64710Lgj) this.A01).A05;
                ViewStub A0F4 = DbS.A0F(viewGroup3, R.id.camera_settings_gear_stub);
                if (A0F4 != null) {
                    A0F4.inflate();
                }
                return viewGroup3.requireViewById(R.id.camera_settings_gear);
            case 45:
                return JTT.A0E(((C64710Lgj) this.A01).A05, R.id.iglive_new_title_background_stub);
            case 46:
                view = AnonymousClass7TE.A0c(((C64710Lgj) this.A01).A0R);
                i = R.id.iglive_new_title_cancel_button;
                break;
            case 47:
                view = AnonymousClass7TE.A0c(((C64710Lgj) this.A01).A0R);
                i = R.id.iglive_new_title_done_button;
                break;
            case 48:
                C64710Lgj lgj2 = (C64710Lgj) this.A01;
                TextView textView = (TextView) JTT.A0E(lgj2.A05, R.id.iglive_new_title_stub);
                LWP.A00(textView, lgj2, 21);
                LYN.A00(textView, 11, lgj2);
                return textView;
            default:
                return this.A01;
        }
        return view.requireViewById(i);
    }
}
