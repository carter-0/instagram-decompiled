package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.LQz  reason: case insensitive filesystem */
public final class C64158LQz {
    public static final C64158LQz A00 = new Object();

    public static final String A00(Context context, UserSession userSession, C62575Ki8 ki8) {
        int i;
        switch (ki8.ordinal()) {
            case 0:
                i = 2131971833;
                break;
            case 1:
                i = 2131971834;
                if (182.A06(0Tu.A05, userSession, 36319162578246646L)) {
                    i = 2131971835;
                    break;
                }
                break;
            case 2:
                return DbW.A0h(context, (Object) null, 2131971836);
            case 3:
                i = 2131971837;
                break;
            case 4:
                i = 2131971838;
                break;
            case 5:
                i = 2131971839;
                break;
            case 6:
                i = 2131971850;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 16:
                i = 2131971843;
                break;
            case 11:
                i = 2131971840;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 2131971841;
                break;
            case 15:
                i = 2131971842;
                break;
            case 17:
                i = 2131971849;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C51967G9n.A0v();
                return AnonymousClass7TE.A16(context, 2131968904);
            case 19:
                i = 2131971844;
                break;
            case 20:
                i = 2131971845;
                break;
            case 21:
                i = 2131971846;
                break;
            case 22:
                i = 2131971847;
                break;
            case 23:
            case 24:
                i = 2131971848;
                break;
            case 25:
                i = 2131971854;
                break;
            case 27:
                i = 2131971851;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = 2131971853;
                break;
            default:
                return null;
        }
        return context.getString(i);
    }

    public final void A01(Context context, UserSession userSession, C62575Ki8 ki8, String str) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131971852);
        A0Y.A06();
        if (str == null) {
            str = A00(context, userSession, ki8);
        }
        A0Y.A0q(str);
        DbT.A1V(A0Y);
    }
}
