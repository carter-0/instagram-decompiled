package X;

import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class MMN extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMN(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new MMN(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        switch (this.A00) {
            case 1:
                return AnonymousClass7TF.A0G(((C65809M0b) this.A01).A04.requireView(), R.id.iglive_reactions_composer);
            case 2:
                return AnonymousClass7TF.A0G(((C65809M0b) this.A01).A04.requireView(), R.id.iglive_reactions_shadow_bottom);
            case 3:
                return C240903Nb.A00((View) this.A01, R.id.iglive_pinned_comment_stub);
            case 4:
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new C60687JpY(JTR.A0W(((C62247Kch) this.A01).A04));
            case 5:
            case 8:
            case 11:
            case 23:
            case 26:
            case 31:
            case 36:
            case 44:
                return this.A01;
            case 6:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 24:
            case 27:
            case 32:
            case 37:
            case 45:
                return DbT.A0r(this.A01);
            case 14:
                K8D k8d = (K8D) this.A01;
                if (!(k8d instanceof C62250Kck)) {
                    return null;
                }
                int i3 = ((C62250Kck) k8d).A00;
                if (Integer.valueOf(i3) != null) {
                    return JTP.A0H(DbS.A0F(k8d.requireView(), R.id.recycler_null_state_view_stub), i3);
                }
                return null;
            case 15:
                K8D k8d2 = (K8D) this.A01;
                if (!(k8d2 instanceof C62249Kcj)) {
                    return JTP.A0H(DbS.A0F(k8d2.requireView(), R.id.recycler_bottom_view_stub), R.layout.layout_iglive_bottom_button).findViewById(R.id.bottom_button_layout);
                }
                return null;
            case 16:
                K8D k8d3 = (K8D) this.A01;
                if (k8d3 instanceof C62252Kcm) {
                    i = ((C62252Kcm) k8d3).A00;
                } else if (k8d3 instanceof C62250Kck) {
                    i = ((C62250Kck) k8d3).A01;
                } else if (!(k8d3 instanceof C62251Kcl)) {
                    return null;
                } else {
                    i = ((C62251Kcl) k8d3).A00;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf == null) {
                    return null;
                }
                return JTP.A0H(DbS.A0F(k8d3.requireView(), R.id.recycler_top_view_stub), valueOf.intValue());
            case 17:
                return AnonymousClass7TF.A0G((View) this.A01, R.id.iglive_reactions_comments);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return AnonymousClass7TF.A0G((View) this.A01, R.id.iglive_reactions_composer);
            case 19:
                return AnonymousClass7TF.A0G((View) this.A01, R.id.iglive_reactions_extensions);
            case 20:
                return AnonymousClass7TF.A0G((View) this.A01, R.id.iglive_header_avatar_text_container);
            case 21:
                return AnonymousClass7TF.A0G((View) this.A01, R.id.iglive_header_close);
            case 22:
                return AnonymousClass7TF.A0G((View) this.A01, R.id.iglive_header_options);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return ((View) this.A01).findViewById(R.id.comment_composer_options_button);
            case 30:
                return ((View) this.A01).findViewById(R.id.comment_composer_post_button);
            case 34:
                C57106IOu iOu = (C57106IOu) this.A01;
                AnonymousClass4DH r3 = iOu.A08;
                return new KE6(r3.getContext(), r3, iOu.A09, iOu.A0C);
            case 35:
                return C240903Nb.A00(((LA5) this.A01).A00, R.id.iglive_capture_debug_textview);
            case 39:
                LA5 la5 = (LA5) this.A01;
                return new KD1(la5.A01, la5.A02);
            case 40:
                View findViewById = AnonymousClass7TH.A06(((C64872LjY) this.A01).A05).findViewById(R.id.action_button);
                2eS.A01(findViewById);
                return findViewById;
            case Seq.NULL_REFNUM:
                return AnonymousClass7TH.A06(((C64872LjY) this.A01).A05).findViewById(R.id.description);
            case Seq.RefTracker.REF_OFFSET:
                return AnonymousClass7TH.A06(((C64872LjY) this.A01).A05).findViewById(R.id.pinned_content_divider);
            case 43:
                View view = (View) this.A01;
                View findViewById2 = view.findViewById(R.id.iglive_pinned_content);
                if (findViewById2 == null) {
                    return JTR.A0V(view, R.id.iglive_pinned_content_stub);
                }
                return findViewById2;
            case 47:
                return AnonymousClass7TH.A06(((C64872LjY) this.A01).A05).findViewById(R.id.title);
            case 48:
                return ((View) this.A01).findViewById(R.id.donation_amount);
            case 49:
                return C240903Nb.A00((View) this.A01, R.id.profile_emoji_overlay_stub);
            default:
                return DbY.A0I(this.A01);
        }
    }
}
