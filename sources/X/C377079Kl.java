package X;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Kl  reason: invalid class name and case insensitive filesystem */
public final class C377079Kl extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377079Kl(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        View view2;
        switch (this.A00) {
            case 0:
                View inflate = ((C316926mR) this.A01).A02.inflate();
                0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                return inflate;
            case 1:
                Paint paint = new Paint();
                paint.setColor(((C354798Nk) this.A01).A08.getColor(R.color.grey_2));
                paint.setStrokeWidth(2.0f);
                return paint;
            case 2:
                return new 1NN((UserSession) this.A01);
            case 3:
                return Boolean.valueOf(182.A06(0Tu.A05, ((1NN) this.A01).A00, 36320330810794306L));
            case 4:
                return Boolean.valueOf(182.A06(0Tu.A05, ((1NN) this.A01).A00, 36311483180974620L));
            case 5:
                return Boolean.valueOf(182.A06(0Tu.A05, ((1NN) this.A01).A00, 36311483181302301L));
            case 6:
                return Boolean.valueOf(182.A06(0Tu.A05, ((1NN) this.A01).A00, 36322044501043100L));
            case 7:
                UserSession userSession = (UserSession) this.A01;
                return new AnonymousClass3BK(1Al.A01(userSession).A04(1An.A2m, AnonymousClass3BK.class), new AnonymousClass3BL(userSession), 0eE.A00(userSession), AnonymousClass3BM.A00);
            case 8:
                return new AnonymousClass6W7((UserSession) this.A01);
            case 9:
                return new AnonymousClass506((UserSession) this.A01);
            case 10:
                return new 1O3((UserSession) this.A01);
            case 11:
                return 1Au.A00(((C315446ju) this.A01).A04);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 1Au.A00(((C315456jv) this.A01).A04);
            case 13:
                return 1Al.A01((UserSession) this.A01).A03(1An.A33);
            case 14:
                return C241023No.A00((UserSession) this.A01, C241003Nm.A00, true);
            case 15:
                ViewStub viewStub = ((C316236lK) this.A01).A00;
                if (viewStub != null) {
                    view2 = viewStub.inflate();
                } else {
                    view2 = null;
                }
                if (view2 instanceof ViewGroup) {
                    return view2;
                }
                return null;
            case 16:
                View view3 = (View) ((C316236lK) this.A01).A06.getValue();
                if (view3 != null) {
                    return view3.requireViewById(R.id.reel_item_like_animation_view);
                }
                return null;
            case 17:
                AnonymousClass61R A002 = C303756Aq.A00(((C316236lK) this.A01).A04.getContext(), R.raw.story_likes_crowd_noise);
                if (A002 != null) {
                    return A002;
                }
                throw new IllegalStateException("Required value was null.");
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return C240903Nb.A00((View) ((C240933Nf) this.A01).A04.getValue(), R.id.live_avatar_four_stub);
            case 19:
                return C240903Nb.A00((View) ((C240933Nf) this.A01).A04.getValue(), R.id.live_avatar_one_stub);
            case 20:
                return C240903Nb.A00((View) ((C240933Nf) this.A01).A04.getValue(), R.id.live_avatar_three_stub);
            case 21:
                return C240903Nb.A00((View) ((C240933Nf) this.A01).A04.getValue(), R.id.live_avatar_two_stub);
            case 22:
                return ((C240913Nc) ((C240933Nf) this.A01).A05.getValue()).A00();
            case 23:
                return C240903Nb.A00((View) this.A01, R.id.live_avatar_stub);
            case 24:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.06f});
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.setDuration(300);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                ofFloat.addUpdateListener(new AJX(this.A01, 12));
                return ofFloat;
            case 25:
                return ((View) ((C240933Nf) this.A01).A04.getValue()).findViewById(R.id.live_pulsing_background);
            case 26:
                view = (View) this.A01;
                i = R.id.avatar_checkmark_overlay_stub;
                break;
            case 27:
                view = (View) this.A01;
                i = R.id.branding_badge_stub;
                break;
            case 28:
                return new C240893Na((View) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new AnonymousClass3N9((View) this.A01);
            case 30:
                return new C240933Nf((View) this.A01);
            case 31:
                view = (View) this.A01;
                i = R.id.memories_badge_stub;
                break;
            case 32:
                view = (View) this.A01;
                i = R.id.music_highlight_overlay_stub;
                break;
            case 33:
                view = (View) this.A01;
                i = R.id.my_week_disabled_overlay_stub;
                break;
            case 34:
                view = (View) this.A01;
                i = R.id.my_week_enabled_overlay_stub;
                break;
            case 35:
                view = (View) this.A01;
                i = R.id.own_reel_badge_stub;
                break;
            case 36:
                view = (View) this.A01;
                i = R.id.reel_glyph_stub;
                break;
            case 37:
                view = (View) this.A01;
                i = R.id.suggested_highlight_add_icon;
                break;
            case 38:
                return ((C240913Nc) ((C240893Na) this.A01).A01.getValue()).A00();
            case 39:
                return C240903Nb.A00((View) this.A01, R.id.campfire_avatar_stub);
            case 40:
                C262844Gf r1 = (C262844Gf) this.A01;
                return new AnonymousClass32A(r1.A01, r1.A02, new AnonymousClass328(r1.A00));
            case Seq.NULL_REFNUM:
                IgProgressImageView igProgressImageView = (IgProgressImageView) ((C316976mW) this.A01).A00.getView().requireViewById(R.id.blurred_overlay_image_view);
                igProgressImageView.setPostProcessor(AZS.A00);
                return igProgressImageView;
            case Seq.RefTracker.REF_OFFSET:
                return C240903Nb.A00(((C305836Jt) this.A01).A0V, R.id.iglive_chain_preview_view_stub).A00();
            case 43:
                return ((C316226lJ) this.A01).A00.getView().requireViewById(R.id.reel_item_share_to_friends_story_producer_likes_text);
            case 44:
                return new C308566Ut(((C316006kx) this.A01).A0S);
            case 45:
                UserSession userSession2 = ((C310566bG) this.A01).A06;
                0qQ.A0B(userSession2, 0);
                userSession2.A01(C310626bM.class, new AnonymousClass9L1(userSession2, 49));
                return null;
            case 47:
                View requireViewById = ((C316966mV) this.A01).A00.getView().requireViewById(R.id.roll_call_cta);
                0qQ.A07(requireViewById);
                return requireViewById;
            case 49:
                View requireViewById2 = ((C316856mK) this.A01).A00().requireViewById(R.id.emoji_view);
                0qQ.A07(requireViewById2);
                return requireViewById2;
            default:
                View requireViewById3 = ((C316966mV) this.A01).A00.getView().requireViewById(R.id.roll_call_overlay_title);
                0qQ.A07(requireViewById3);
                return requireViewById3;
        }
        return 2b1.A00(view.requireViewById(i));
    }
}
