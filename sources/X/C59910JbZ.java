package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.JbZ  reason: case insensitive filesystem */
public abstract class C59910JbZ {
    public static final Integer A00(1iA r2) {
        switch (DbU.A02(r2, 0)) {
            case 0:
                return AnonymousClass05K.A01;
            case 1:
                return AnonymousClass05K.A0C;
            case 7:
                return AnonymousClass05K.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AnonymousClass05K.A0Y;
            case 17:
                return AnonymousClass05K.A1F;
            case 27:
                return AnonymousClass05K.A15;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return AnonymousClass05K.A0j;
            case 30:
                return AnonymousClass05K.A0u;
            case 31:
                return AnonymousClass05K.A1I;
            default:
                IllegalArgumentException A0g = C51973G9u.A0g(r2, "media type not supported ", AnonymousClass7TE.A1A());
                0wb.A07("logging_media_type_not_supported", A0g);
                throw A0g;
        }
    }
}
