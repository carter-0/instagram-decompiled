package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.LZu  reason: case insensitive filesystem */
public final class C64319LZu implements AnonymousClass2gO, C61910qF {
    public final int A00;
    public final Object A01;

    public C64319LZu(int i, 0sP r3) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                break;
            default:
                0qQ.A0B(r3, 1);
                break;
        }
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, this.A01);
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return (AnonymousClass0eL) this.A01;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C51965G9l.A1W(this.A01, obj);
    }
}
