package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.List;

/* renamed from: X.Fld  reason: case insensitive filesystem */
public final class C50950Fld implements G6O {
    public final Integer A00;

    public C50950Fld(Integer num) {
        this.A00 = num;
    }

    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        Fragment fragment;
        AnonymousClass7TG.A1O(userSession, fragmentActivity);
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        Integer num = this.A00;
        switch (num.intValue()) {
            case 1:
                fragment = new C48024ERn();
                break;
            case 3:
                fragment = new ESI();
                break;
            case 7:
                fragment = new C16298UsI();
                break;
            case 8:
                FCL.A00();
                List A1I = AnonymousClass7TE.A1I(UserMonetizationProductType.REELS_OVERLAY_ADS);
                fragment = new C47473E3x();
                DbZ.A1B(fragment, "ARGUMENT_PRODUCT_ELIGIBILITY_LIST", A1I);
                break;
            case 10:
                fragment = C46339Dch.A01().Cqz(userSession);
                break;
            case 11:
                fragment = C49892FBu.A01();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 15:
                fragment = new ESS();
                break;
            case 13:
                Bundle A0B = DbX.A0B(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
                fragment = new C48034ERz();
                fragment.setArguments(A0B);
                break;
            case 16:
                fragment = new C48029ERs();
                break;
            case 17:
                fragment = new C227812jx();
                break;
            case 19:
                fragment = new ES0();
                break;
            case 23:
                fragment = C49139Eq2.A00(userSession);
                break;
            case 28:
                fragment = C46447Df9.A02().A07(EVG.TAGGED, AnonymousClass05K.A0Y, userSession.A06, AnonymousClass7TF.A0Q(userSession).getUsername(), false);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                fragment = new C69181NgU();
                break;
            case 31:
                fragment = new EST();
                break;
            case 37:
                IgFragmentFactoryImpl.A00();
                fragment = new ESM();
                break;
            default:
                throw DbW.A0c("No default navigator implementation for native screen with ID ", C21345XXm.A00(num));
        }
        A0M.A0D(fragment);
        A0M.A04();
    }
}
