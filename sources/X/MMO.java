package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.avatars.suggestions.LexiconRecommendationProvider;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.stickersearch.AvatarStickerInteractor;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class MMO extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMO(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new MMO(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        int A04;
        String string;
        ImageView imageView;
        float f;
        switch (this.A00) {
            case 0:
                return AnonymousClass1Nd.A00(((C72199OyL) this.A01).A00);
            case 1:
                C72199OyL oyL = (C72199OyL) this.A01;
                if (!DbT.A0h().A0b()) {
                    return null;
                }
                UserSession userSession = oyL.A00;
                return userSession.A01(ODQ.class, new MMO(userSession, 4));
            case 2:
                return 1bJ.A00(((C72199OyL) this.A01).A00);
            case 3:
                return 1Au.A00(((C72199OyL) this.A01).A00);
            case 4:
                return new ODQ();
            case 5:
                return DbX.A0h(((C47516E5z) this.A01).A00);
            case 6:
                UserSession userSession2 = (UserSession) this.A01;
                C72207OyX oyX = new C72207OyX(userSession2);
                AnonymousClass66g.A00(userSession2).A02.add(oyX);
                return oyX;
            case 7:
                return new C370758x1((UserSession) this.A01);
            case 8:
                return new OL4((UserSession) this.A01);
            case 9:
                TwD twD = new TwD();
                Context context = ((E9C) this.A01).A02;
                String string2 = context.getString(2131972868);
                int A012 = DbV.A01(context);
                twD.A01 = string2;
                twD.A00 = A012;
                return twD;
            case 10:
                return ((DxG) this.A01).A08.invoke();
            case 11:
                return new FV0(AnonymousClass7TE.A0l(((C47418E1m) this.A01).A0E));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                try {
                    f = ((NQE) this.A01).A00.getResources().getDimension(R.dimen.avatar_powerups_avatar_height);
                } catch (Resources.NotFoundException unused) {
                    f = 0nA.A04(((NQE) this.A01).A00, 130);
                }
                return Integer.valueOf((int) f);
            case 13:
                View view = ((C39752A7s) this.A01).A01;
                if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
                    imageView.setImageDrawable((Drawable) null);
                }
                return C60340gF.A00;
            case 14:
                return new LD6(02m.A0p, (UserSession) this.A01);
            case 15:
                LNx lNx = (LNx) this.A01;
                lNx.A00 = null;
                LNx.A00(lNx);
                return C60340gF.A00;
            case 16:
                return new AnonymousClass7T4(02m.A0p, (UserSession) this.A01);
            case 17:
                return new C3261475o((UserSession) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C3261575p((UserSession) this.A01);
            case 19:
                return new AnonymousClass75v((C3262075u) this.A01);
            case 20:
                08y r1 = 09i.A0A;
                Bundle A06 = DbU.A06((Activity) this.A01);
                if (A06 != null) {
                    return r1.A06(A06);
                }
                throw AnonymousClass7TE.A0y();
            case 21:
                return ((E1E) this.A01).A00.invoke();
            case 22:
                0lg A0R = DbY.A0R(((E1E) this.A01).A04);
                return A0R.A01(C3261475o.class, new MMO(A0R, 17));
            case 23:
                return ((E1E) this.A01).A01.invoke();
            case 24:
                return new C49326Eth(AnonymousClass0kN.A02(DbT.A0X(((E1E) this.A01).A04)));
            case 25:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle == null || (string = bundle.getString(AnonymousClass000.A00(2628))) == null) {
                    return null;
                }
                return DbS.A0V(string);
            case 26:
                UserSession userSession3 = (UserSession) this.A01;
                return new L85(AnonymousClass0kN.A02(userSession3), userSession3);
            case 27:
                return new DirectStickerSuggestionsController((UserSession) this.A01);
            case 28:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096040978366L);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096041371588L);
            case 30:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096041306051L);
            case 31:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096041174977L);
            case 32:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096041043903L);
            case 33:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096041240514L);
            case 34:
                DirectStickerSuggestionsController directStickerSuggestionsController = (DirectStickerSuggestionsController) this.A01;
                if (G9t.A1b(directStickerSuggestionsController.A0R)) {
                    A04 = 1;
                } else {
                    A04 = DbS.A04(0Tu.A05, directStickerSuggestionsController.A0B, 36603571017487287L);
                }
                return Integer.valueOf(A04);
            case 35:
                return 02m.A0p;
            case 36:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096041437125L);
            case 37:
                if (G9t.A1b(((DirectStickerSuggestionsController) this.A01).A0F)) {
                    return C317846nw.MIXED_AVATAR_STICKERS;
                }
                return C317846nw.STATIC_AVATAR_STICKERS;
            case 38:
                DirectStickerSuggestionsController directStickerSuggestionsController2 = (DirectStickerSuggestionsController) this.A01;
                UserSession userSession4 = directStickerSuggestionsController2.A0B;
                N4G n4g = directStickerSuggestionsController2.A01;
                LexiconRecommendationProvider lexiconRecommendationProvider = new LexiconRecommendationProvider(userSession4, Integer.valueOf(n4g.A00), n4g.A01);
                0Tu r3 = 0Tu.A05;
                boolean A062 = 182.A06(r3, userSession4, 36321984371500926L);
                return new StickerTypeaheadImpl(new LFu(182.A01(r3, userSession4, 36603459348403108L), 182.A04(r3, userSession4, 36884934324978254L), A062, 182.A01(r3, userSession4, 36603459348337571L)), lexiconRecommendationProvider, (02m) AnonymousClass7TE.A14(directStickerSuggestionsController2.A0M), 0sn.A00);
            case 39:
                DirectStickerSuggestionsController directStickerSuggestionsController3 = (DirectStickerSuggestionsController) this.A01;
                if (G9t.A1b(directStickerSuggestionsController3.A0R)) {
                    UserSession userSession5 = directStickerSuggestionsController3.A0B;
                    return new ContextualSuggestionsPerIntentRepository((C317846nw) directStickerSuggestionsController3.A0O.getValue(), C317866ny.DIRECT, (02m) AnonymousClass7TE.A14(directStickerSuggestionsController3.A0M), userSession5);
                }
                UserSession userSession6 = directStickerSuggestionsController3.A0B;
                boolean A1b = G9t.A1b(directStickerSuggestionsController3.A0F);
                boolean A1b2 = G9t.A1b(directStickerSuggestionsController3.A0I);
                return new ContextualSuggestionsStickersRepository((C317846nw) directStickerSuggestionsController3.A0O.getValue(), C317866ny.DIRECT, (02m) AnonymousClass7TE.A14(directStickerSuggestionsController3.A0M), userSession6, A1b, A1b2);
            case 40:
                return AnonymousClass7TF.A0R(0Tu.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322096041502662L);
            case Seq.NULL_REFNUM:
                return C51968G9o.A0u();
            case Seq.RefTracker.REF_OFFSET:
                return new AvatarStickerInteractor((Context) null, ((C70672OFt) this.A01).A02, 30);
            case 43:
                K3S k3s = (K3S) this.A01;
                return k3s.A09.invoke(k3s.A0K.getValue());
            case 44:
                K3S k3s2 = (K3S) this.A01;
                return new AnonymousClass7IR(k3s2, AnonymousClass7TE.A0l(k3s2.A0K));
            case 45:
                return ((K3S) this.A01).A06.invoke();
            case 46:
                K3S k3s3 = (K3S) this.A01;
                return Boolean.valueOf(C63227KtY.A00(AnonymousClass7TE.A0l(k3s3.A0K), (DirectThreadKey) k3s3.A0P.getValue()));
            case 47:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null) {
                    z = bundle2.getBoolean("args_is_msys_thread");
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 48:
                return this.A01;
            default:
                return DbT.A0r(this.A01);
        }
    }
}
