package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.metagallery.MetaGalleryRepository$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$3$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$4$2;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository.ClipsTemplateSuggestionRepository;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.genai.aistickers.data.AIStickersGhostPromptsRepository;
import com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class ME8 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.ME8, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(java.lang.Object r1, X.ME8 r2, X.02o r3) {
        /*
            r0 = 1
            r2.A00 = r0
            java.lang.Object r0 = r3.emit(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ME8.A00(java.lang.Object, X.ME8, X.02o):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME8(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static ME8 A01(Object obj, AnonymousClass4D7 r2, int i) {
        return new ME8(obj, r2, i);
    }

    public static void A02(ME8 me8) {
        me8.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof ME8) || ((ME8) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.ME8, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                this.A02 = obj;
                A02(this);
                return ((C41501Av2) this.A01).emit((Object) null, this);
            case 1:
                this.A01 = obj;
                A02(this);
                Object A002 = ((CutoutStickerRepository) this.A02).A00((Bitmap) null, (1ua) null, (String) null, (String) null, this);
                if (A002 != 1Hj.A02) {
                    return new 0eR(A002);
                }
                return A002;
            case 2:
                this.A02 = obj;
                A02(this);
                return ((MetaGalleryRepository$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 3:
                this.A02 = obj;
                A02(this);
                return ((AutoCreatedClipsViewModel$special$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 4:
                this.A02 = obj;
                A02(this);
                return ((AutoCreatedClipsViewModel$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 5:
                this.A02 = obj;
                A02(this);
                return ((AutoCreatedClipsViewModel$special$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case 6:
                this.A02 = obj;
                A02(this);
                return ((AutoCreatedClipsViewModel$special$$inlined$map$3$2) this.A01).emit((Object) null, this);
            case 7:
                this.A02 = obj;
                A02(this);
                return ((AutoCreatedClipsViewModel$special$$inlined$map$4$2) this.A01).emit((Object) null, this);
            case 8:
                this.A01 = obj;
                A02(this);
                return MagicMediaRemixEditController.A01((C389549po) null, (MagicMediaRemixEditController) this.A02, this);
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 16:
            case 22:
                this.A02 = obj;
                A02(this);
                return ((C66119MCj) this.A01).emit((Object) null, this);
            case 11:
            case 13:
            case 14:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case 36:
            case 37:
            case 43:
                this.A02 = obj;
                A02(this);
                return MCn.A00(this.A01, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 33:
            case 34:
            case 35:
                this.A02 = obj;
                A02(this);
                return ((MCf) this.A01).emit((Object) null, this);
            case 23:
                this.A02 = obj;
                A02(this);
                return ((C41500Av1) this.A01).emit((Object) null, this);
            case 25:
                this.A01 = obj;
                A02(this);
                return ((SfxNetworkSource) this.A02).A01((UserSession) null, (String) null, (String) null, this);
            case 26:
                this.A02 = obj;
                A02(this);
                return ((ClipsAudioStore$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 27:
                this.A01 = obj;
                A02(this);
                return ((ClipsTemplateSuggestionRepository) this.A02).A00((String) null, this);
            case 40:
                this.A01 = obj;
                A02(this);
                return AlbumEditFragment.A03((AlbumEditFragment) this.A02, this);
            case Seq.NULL_REFNUM:
                this.A01 = obj;
                A02(this);
                return ((AIStickersGhostPromptsRepository) this.A02).A00(this);
            case 44:
                this.A01 = obj;
                A02(this);
                return ((MagicModConsentGraphQLApi) this.A02).A00((UserSession) null, (List) null, this);
            case 45:
                this.A01 = obj;
                A02(this);
                return ((MagicModConsentGraphQLApi) this.A02).A01((UserSession) null, (List) null, this, false);
            case 46:
                this.A01 = obj;
                A02(this);
                return ((MagicModImageGenerationDataSource) this.A02).A01((KS2) null, this);
            default:
                this.A02 = obj;
                A02(this);
                return ((MCe) this.A01).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME8(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
