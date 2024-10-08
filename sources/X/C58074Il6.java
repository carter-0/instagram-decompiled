package X;

import android.app.Application;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.comments.mvvm.data.network.CarouselChildThumbnailRequestsKt;
import com.instagram.comments.mvvm.data.network.DeleteCommentUpsellRequestsKt;
import com.instagram.comments.mvvm.data.network.HideActionNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.LikeActionNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.MediaCommentDeletionNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.MediaCommentPinUnpinNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt;
import com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.UnhideActionNetworkRequestsKt;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.sfx.SfxStitchingHelper;
import com.instagram.creation.genai.imagine.integrity.ImagineNativeIntegrityUtilKt;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt;
import com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt;
import com.instagram.user.follow.GraphQLFollowRequestApiKt;
import com.meta.compose.material.bottomsheet.AnchoredDraggableKt;
import com.meta.metaai.imagine.service.ImagineNetworkServiceKt;
import java.util.Collection;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Il6  reason: case insensitive filesystem */
public final class C58074Il6 extends C64101El {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Il6, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.1NY r3, java.lang.String r4, X.C58074Il6 r5, java.lang.Object[] r6) {
        /*
            r2 = 1
            r3.A0K(r4, r6)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r3.A0Q(r1, r0)
            r3.A0R = r2
            X.1OC r0 = r3.A0M()
            r5.A00 = r2
            java.lang.Object r0 = r0.A01(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58074Il6.A00(X.1NY, java.lang.String, X.Il6, java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58074Il6(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A02 = i;
    }

    public static void A01(Object obj, C58074Il6 il6) {
        il6.A01 = obj;
        il6.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C58074Il6) || ((C58074Il6) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.Il6, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                A01(obj, this);
                PlatformTextInputModifierNodeKt.A01((C59665JSk) null, this, (0sL) null);
                break;
            case 1:
                A01(obj, this);
                PlatformTextInputModifierNodeKt.A00((C268124co) null, this, (0sL) null);
                break;
            case 2:
                A01(obj, this);
                return CarouselChildThumbnailRequestsKt.A00((UserSession) null, (String) null, this);
            case 3:
                A01(obj, this);
                return DeleteCommentUpsellRequestsKt.A00((UserSession) null, this);
            case 4:
                A01(obj, this);
                return HideActionNetworkRequestsKt.A00((C335907dj) null, (UserSession) null, (String) null, this);
            case 5:
                A01(obj, this);
                return LikeActionNetworkRequestsKt.A00((C53335GmL) null, (C335907dj) null, (C333777a7) null, (UserSession) null, (String) null, this);
            case 6:
                A01(obj, this);
                return MediaCommentDeletionNetworkRequestsKt.A00((UserSession) null, (String) null, (String) null, (Collection) null, this);
            case 7:
                A01(obj, this);
                return MediaCommentPinUnpinNetworkRequestsKt.A00((UserSession) null, (String) null, (String) null, this);
            case 8:
                A01(obj, this);
                return MediaCommentPinUnpinNetworkRequestsKt.A01((UserSession) null, (String) null, (String) null, this);
            case 9:
                A01(obj, this);
                return MediaParentCommentNetworkFetcherKt.A02((UserSession) null, (String) null, this);
            case 10:
                A01(obj, this);
                return RestrictedCommentNetworkRequestsKt.A01((UserSession) null, (String) null, (String) null, this);
            case 11:
                A01(obj, this);
                return RestrictedCommentNetworkRequestsKt.A00((C335907dj) null, (UserSession) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return UnhideActionNetworkRequestsKt.A00((C335907dj) null, (UserSession) null, (String) null, this);
            case 13:
                A01(obj, this);
                return UnhideActionNetworkRequestsKt.A01((C335907dj) null, (UserSession) null, (String) null, this);
            case 14:
                A01(obj, this);
                return SfxStitchingHelper.A00((2Nn) null, (String) null, this);
            case 15:
                A01(obj, this);
                return ImagineNativeIntegrityUtilKt.A00((Application) null, (UserSession) null, (String) null, (String) null, (String) null, (String) null, this);
            case 16:
                A01(obj, this);
                return MutedWordsApiUtil.A02((UserSession) null, this);
            case 17:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A01((C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (SettingsSession) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A04((C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (SettingsSession) null, this);
            case 19:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A00((C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (SettingsSession) null, this);
            case 20:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A07((C64185LSs) null, (SettingsSession) null, this);
            case 21:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A08((C64185LSs) null, (SettingsSession) null, this);
            case 22:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A05((C64185LSs) null, (C64185LSs) null, (SettingsSession) null, this);
            case 23:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A06((C64185LSs) null, (C64185LSs) null, (SettingsSession) null, this);
            case 24:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A02((C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (SettingsSession) null, this);
            case 25:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A03((C64185LSs) null, (C64185LSs) null, (C64185LSs) null, (SettingsSession) null, this);
            case 26:
                A01(obj, this);
                return DerivedValueProviderKt.A00((UserSession) null, this);
            case 27:
                A01(obj, this);
                return DerivedValueProviderKt.A01((UserSession) null, this);
            case 28:
                A01(obj, this);
                return DerivedValueProviderKt.A02((UserSession) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return DerivedValueProviderKt.A03((UserSession) null, this);
            case 30:
                A01(obj, this);
                return GraphQLFollowRequestApiKt.A01((UserSession) null, (String) null, (String) null, this);
            case 31:
                A01(obj, this);
                return GraphQLFollowRequestApiKt.A02((UserSession) null, (String) null, (String) null, this);
            case 32:
                A01(obj, this);
                return AnchoredDraggableKt.A01(this, (C62320sa) null, (0sL) null);
            case 33:
                A01(obj, this);
                return ImagineNetworkServiceKt.A03(this, (0sL) null, 0);
            default:
                A01(obj, this);
                return C56378HxX.A01((OYZ) null, this);
        }
        throw AnonymousClass00P.createAndThrow();
    }
}
