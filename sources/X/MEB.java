package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.security.attestation.keystore.client.KeyAttestationClient;
import com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor;
import com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient;
import com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient;
import com.instagram.settings.common.birthday.repository.BirthdayCenterRepository;
import com.instagram.settings.language.ContentLanguageSettingsApi;
import com.instagram.settings.language.ContentLanguageSettingsRepository;
import com.instagram.settings2.core.data.SettingsNetworkInteractor;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler;
import com.instagram.share.facebook.api.ReelsXARApiUtil;
import com.instagram.sharetofriendsstory.v2.data.ShareToFriendsStoryRepository;
import com.instagram.sharetofriendsstory.v2.viewmodel.ShareToFriendsStoryEventProvider$special$$inlined$map$1$2;
import com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi;
import com.instagram.stickersearch.AvatarStickerInteractor;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MEB extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r11v0, types: [X.MEB, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                A02(obj, this);
                return ((C73525PeH) this.A01).emit((Object) null, this);
            case 8:
                A01(obj, this);
                return KeyAttestationClient.A01((0lg) null, (KeyAttestationClient) this.A02, (String) null, (String) null, this);
            case 9:
                A01(obj, this);
                return KeyAttestationClient.A00((C53375Gn5) null, (0lg) null, (KeyAttestationClient) this.A02, this);
            case 10:
                A01(obj, this);
                return ((IgGooglePlayIntegrityAttestor) this.A02).A00((Context) null, (String) null, this);
            case 11:
                A01(obj, this);
                return ((IgPlayIntegrityAttestationClient) this.A02).A00((C10199RoF) null, (0lg) null, (S7S) null, this, (C262094Cc) null, 0, false);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return PlayIntegrityAttestationClient.A01((0lg) null, (PlayIntegrityAttestationClient) this.A02, (String) null, this);
            case 13:
                A01(obj, this);
                return PlayIntegrityAttestationClient.A00((JV7) null, (0lg) null, (PlayIntegrityAttestationClient) this.A02, this);
            case 14:
                A01(obj, this);
                return ((BirthdayCenterRepository) this.A02).A00((UserSession) null, this);
            case 15:
                A01(obj, this);
                return ((ContentLanguageSettingsApi) this.A02).A00(this);
            case 16:
                A01(obj, this);
                return ((ContentLanguageSettingsRepository) this.A02).A00((C61082JwK) null, this);
            case 17:
                A01(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A05(this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A01((RemoteBooleanSettingId) null, this);
            case 19:
                A01(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A04((RemoteStringSettingId) null, this);
            case 20:
                A01(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A02((RemoteBooleanSettingId) null, this, false);
            case 21:
                A01(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A03((RemoteStringSettingId) null, (String) null, this);
            case 22:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case 23:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case 24:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case 25:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case 26:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case 27:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case 28:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return C64185LSs.A00(this.A02, this);
            case 30:
                A01(obj, this);
                return ((SettingsSession) this.A02).A01((List) null, this);
            case 31:
                A02(obj, this);
                return UiStateKt.A01((JVH) null, (SettingsSession) null, this);
            case 32:
                A01(obj, this);
                return ((SaveStoryToGalleryCustomStorageHandler.NetworkInteractor) this.A02).A00(this, false);
            case 33:
                A01(obj, this);
                return ((ReelsXARApiUtil) this.A02).A01((UserSession) null, this, false);
            case 34:
                A01(obj, this);
                return ((ReelsXARApiUtil) this.A02).A02((UserSession) null, this, false);
            case 35:
                A01(obj, this);
                return ((ShareToFriendsStoryRepository) this.A02).A00(this);
            case 36:
                A02(obj, this);
                return ((ShareToFriendsStoryEventProvider$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 37:
                A02(obj, this);
                return ((MCl) this.A01).emit((Object) null, this);
            case 38:
                A01(obj, this);
                return ((FeaturedProductsMediaApi) this.A02).A00((UserSession) null, (String) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A01(obj, this);
                return ((AvatarStickerInteractor) this.A02).A01((C61082JwK) null, (C317846nw) null, (C317866ny) null, (Integer) null, (Integer) null, (String) null, this);
            case 43:
                A02(obj, this);
                return AvatarStickerInteractor.A00((C61082JwK) null, (C317846nw) null, (C317866ny) null, (AvatarStickerInteractor) null, (Integer) null, (String) null, this);
            default:
                A02(obj, this);
                return ((MCk) this.A01).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEB(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static MEB A00(Object obj, AnonymousClass4D7 r3, int i) {
        return new MEB(obj, r3, i, 42);
    }

    public static void A01(Object obj, MEB meb) {
        meb.A01 = obj;
        meb.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A02(Object obj, MEB meb) {
        meb.A02 = obj;
        meb.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof MEB) || ((MEB) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEB(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEB(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A03 = i;
    }
}
