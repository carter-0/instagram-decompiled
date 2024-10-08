package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.react.activity.IgReactActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import go.Seq;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MJ1 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ1(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String A0e;
        String A0d;
        switch (this.A00) {
            case 0:
            case 7:
            case 23:
            case 28:
                return DbT.A0r(this.A01);
            case 2:
                return Integer.valueOf((int) (((float) AnonymousClass0nB.A01(DbT.A08(this.A01))) * 0.8f));
            case 3:
                C68478NJv nJv = (C68478NJv) this.A01;
                return new C70579OCb(nJv.requireContext(), nJv);
            case 4:
                C68478NJv nJv2 = (C68478NJv) this.A01;
                return new C385689jN(nJv2.requireActivity(), AnonymousClass7TE.A0l(nJv2.A0L));
            case 5:
                return new QuickSnapReactionEmitterView(DbT.A08(this.A01), (AttributeSet) null, 0);
            case 6:
            case 22:
            case 27:
                return this.A01;
            case 9:
                return new L50((UserSession) this.A01);
            case 10:
                L32 l32 = (L32) this.A01;
                if (l32 != null) {
                    l32.A00.A17.EHd();
                    break;
                }
                break;
            case 11:
                View A0O = C51969G9p.A0O(this.A01);
                A0O.clearAnimation();
                A0O.setRotation(0.0f);
                ObjectAnimator.ofFloat(A0O, View.ROTATION, new float[]{0.0f, -5.0f, 0.0f, -5.0f, 0.0f}).setDuration(300).start();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                IgReactActivity igReactActivity = (IgReactActivity) this.A01;
                UserSession userSession = igReactActivity.A00;
                DbS.A1Z(userSession);
                return new AnonymousClass4DF(userSession, igReactActivity);
            case 13:
                return new IgReactExceptionManager((AnonymousClass0wW) this.A01);
            case 14:
                return 02m.A0p;
            case 15:
                return AnonymousClass7TF.A0R(0Tu.A05, (0lg) this.A01, 36317779601528351L);
            case 16:
                return AnonymousClass7TF.A0R(0Tu.A05, (0lg) this.A01, 2342160788813583884L);
            case 17:
                return AnonymousClass2lR.A00((UserSession) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C314206hp((UserSession) this.A01);
            case 19:
                return new C18069Vkw((UserSession) this.A01);
            case 20:
                return new EyC((UserSession) this.A01);
            case 21:
                return new C17833Vgm((UserSession) this.A01);
            case 25:
                return new C61544KBx(AnonymousClass7TE.A0l(((K7D) this.A01).A0F));
            case 26:
                return C51971G9r.A0U(this.A01);
            case 30:
                return new KBR(AnonymousClass7TE.A0l(((DxF) this.A01).A0P));
            case 31:
                return new C310366as(AnonymousClass7TE.A0l(((DxF) this.A01).A0P));
            case 32:
                C369678v9 r5 = (C369678v9) this.A01;
                Context context = r5.A07;
                C15839UjP ujP = new C15839UjP(context);
                int A09 = AnonymousClass7TE.A09(context);
                ujP.A0B(A09);
                float[] fArr = new float[8];
                float f = (float) r5.A04;
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = f;
                fArr[3] = f;
                fArr[4] = 0.0f;
                C51975G9x.A1L(fArr, 0.0f);
                ujP.A0A.setCornerRadii(fArr);
                ujP.A03 = r5.A06;
                ujP.A09(A09);
                int i = r5.A00;
                ujP.A0A(i);
                ImageUrl imageUrl = r5.A08.A01;
                if (imageUrl != null) {
                    ujP.A0B.A00(imageUrl);
                } else {
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.profile_anonymous_user);
                    0qQ.A0A(decodeResource);
                    ujP.A0C(new C240563Lj(decodeResource, false));
                }
                Drawable drawable = context.getDrawable(R.drawable.challenge_sticker_trophy_drawable);
                Drawable drawable2 = context.getDrawable(R.drawable.circle_outline_white_2);
                if (drawable != null) {
                    ujP.A0D(drawable, drawable2, i);
                    return ujP;
                }
                throw AnonymousClass7TE.A0y();
            case 33:
                Drawable drawable3 = ((C369678v9) this.A01).A07.getDrawable(R.drawable.interactive_sticker_background);
                if (drawable3 != null) {
                    return drawable3;
                }
                throw AnonymousClass7TE.A0y();
            case 34:
                C369678v9 r0 = (C369678v9) this.A01;
                return new C363208jL(r0.A07, (float) r0.A01, R.color.chat_sticker_chat_bubble_color, 1);
            case 35:
                C369678v9 r3 = (C369678v9) this.A01;
                C306386Ly A0s = AnonymousClass7TE.A0s(r3.A07, r3.A03);
                A0s.A0b.setFakeBoldText(true);
                A0s.A0A((float) r3.A02);
                Context context2 = A0s.A0Z;
                boolean z = r3.A0F;
                int i2 = R.color.default_cta_dominant_color;
                if (z) {
                    i2 = R.color.clips_remix_camera_outer_container_default_background;
                }
                AnonymousClass7TE.A1O(context2, A0s, i2);
                AnonymousClass7TF.A1A(A0s, context2.getResources().getString(2131954947));
                return A0s;
            case 36:
                C369678v9 r02 = (C369678v9) this.A01;
                Context context3 = r02.A07;
                int i3 = r02.A06;
                String str = r02.A08.A00.A05;
                if (str == null) {
                    str = "";
                }
                return new C59988Jcx(context3, i3, 0, str);
            case 37:
                C369678v9 r32 = (C369678v9) this.A01;
                LwN lwN = r32.A08;
                if (lwN.A09 != null) {
                    return null;
                }
                C306386Ly A0s2 = AnonymousClass7TE.A0s(r32.A07, r32.A03);
                Context context4 = A0s2.A0Z;
                AnonymousClass7TE.A1O(context4, A0s2, R.color.challenge_sticker_subtitle_text_color);
                A0s2.A0A((float) r32.A05);
                String str2 = lwN.A04;
                Resources resources = context4.getResources();
                if (str2 == null) {
                    A0e = resources.getString(2131954949);
                } else {
                    A0e = AnonymousClass7TF.A0e(resources, str2, 2131954948);
                }
                AnonymousClass7TF.A1A(A0s2, A0e);
                return A0s2;
            case 38:
                C369688vA r2 = (C369688vA) this.A01;
                Context context5 = r2.A00;
                C60005JdE jdE = new C60005JdE(context5, 0.5f, 0.6f, (float) AnonymousClass7TG.A06(context5), 0.2f, 0.2f, 0, 0, 0, true, false);
                jdE.A02(r2.A02, r2.A03);
                return jdE;
            case 39:
                C369698vB r22 = (C369698vB) this.A01;
                List<ImageUrl> A0d2 = 00k.A0d(r22.A08, 3);
                ArrayList A0r = AnonymousClass7TG.A0r(A0d2);
                for (ImageUrl r9 : A0d2) {
                    A0r.add(new C244303ay(r9, r22.A07, r22.A00, r22.A01, 0, AnonymousClass7TE.A09(r22.A05)));
                }
                return A0r;
            case 40:
                C369698vB r1 = (C369698vB) this.A01;
                if (r1.A0C) {
                    return r1.A05.getDrawable(R.drawable.interactive_sticker_background);
                }
                return null;
            case Seq.NULL_REFNUM:
                C369698vB r33 = (C369698vB) this.A01;
                C306386Ly A0s3 = AnonymousClass7TE.A0s(r33.A05, r33.A02);
                Context context6 = A0s3.A0Z;
                boolean z2 = r33.A0C;
                int i4 = R.color.canvas_bottom_sheet_description_text_color;
                if (z2) {
                    i4 = R.color.clips_remix_camera_outer_container_default_background;
                }
                AnonymousClass7TE.A1O(context6, A0s3, i4);
                A0s3.A0A((float) r33.A03);
                Resources resources2 = context6.getResources();
                if (z2) {
                    A0d = JTS.A0i(resources2, r33.A04, 2131954950);
                } else {
                    A0d = DbY.A0d(resources2, r33.A04, R.plurals.challenges_story_winners_facepile_text);
                }
                AnonymousClass7TF.A1A(A0s3, A0d);
                return A0s3;
            case Seq.RefTracker.REF_OFFSET:
                return Integer.valueOf(AnonymousClass7TG.A02((Context) this.A01));
            case 43:
            case 45:
                return Integer.valueOf(C51972G9s.A08((Context) this.A01));
            case 44:
                return JTP.A0k(((Context) this.A01).getResources(), R.dimen.challenge_sticker_v2_facepile_text_size);
            case 46:
                return Float.valueOf(AnonymousClass7TE.A01(((Context) this.A01).getResources(), R.dimen.ai_agent_share_profile_sticker_padding));
            case 47:
                Paint A0D = JTP.A0D();
                AnonymousClass7TE.A1N((Context) this.A01, A0D, R.color.chat_sticker_chat_bubble_color);
                return A0D;
            case 48:
                ((Lw7) ((C66413MQt) this.A01)).A00.invoke();
                break;
            case 49:
                C314556iS.A03(C314546iR.A00((C314546iR) this.A01));
                break;
            default:
                return DbY.A0I(this.A01);
        }
        return C60340gF.A00;
    }
}
