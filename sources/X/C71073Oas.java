package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Oas  reason: case insensitive filesystem */
public final class C71073Oas {
    public static final C71073Oas A00 = new Object();

    public static final NJT A01(Bundle bundle, UserSession userSession, C69358Njy njy) {
        Fragment fragment;
        Bundle bundle2;
        0qQ.A0B(userSession, 2);
        switch (njy.ordinal()) {
            case 0:
                fragment = new C68733NUt();
                break;
            case 1:
                fragment = new NUB();
                break;
            case 2:
                fragment = new NUA();
                break;
            case 3:
                fragment = new KQV();
                break;
            case 4:
                fragment = new KQW();
                break;
            case 5:
                fragment = new NV1();
                break;
            case 6:
                fragment = new C68725NUl();
                break;
            case 7:
                fragment = new C68731NUr();
                break;
            case 8:
                fragment = new C68734NUu();
                break;
            case 9:
                fragment = new NV0();
                break;
            case 10:
                fragment = new C68726NUm();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                bundle2 = C66581MXm.A09(userSession);
                fragment = new C68727NUn();
                break;
            case 14:
                bundle2 = C66581MXm.A09(userSession);
                fragment = new C68739NUz();
                break;
            case 15:
                fragment = new C68730NUq();
                break;
            case 16:
                fragment = new C68732NUs();
                break;
            case 17:
                fragment = new C68738NUy();
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                fragment = new C68735NUv();
                break;
            case 19:
                fragment = new C68736NUw();
                break;
            case 20:
                bundle2 = C66581MXm.A09(userSession);
                fragment = new C68737NUx();
                break;
            case 21:
                fragment = new C68728NUo();
                break;
            case 22:
                fragment = new C68729NUp();
                break;
            default:
                return null;
        }
        fragment.setArguments(bundle2);
        NJT njt = (NJT) fragment;
        if (njt != null) {
            njt.setArguments(bundle);
            return njt;
        }
        return null;
    }

    public final C331127Pr A02(Resources resources, Fragment fragment, UserSession userSession) {
        String str;
        if (fragment instanceof C68735NUv) {
            str = resources.getString(2131961652);
            0qQ.A0A(str);
        } else {
            str = " ";
        }
        C331127Pr A0W = DbS.A0W(userSession);
        boolean z = true;
        A0W.A1I = true;
        A0W.A11 = true;
        A0W.A0d = str;
        if (str.length() <= 0 || str.equals(" ")) {
            z = false;
        }
        A0W.A1C = z;
        return A0W;
    }

    public static final C69358Njy A00(Activity activity, AnonymousClass65E r5, C72203OyT oyT, Integer num) {
        C51974G9v.A1O(oyT, r5, activity, num);
        C72203OyT.A03(oyT, num);
        Object value = oyT.A0R.getValue();
        C72203OyT.A03(oyT, num);
        Object value2 = oyT.A0S.getValue();
        C72203OyT.A03(oyT, num);
        boolean A1b = DbX.A1b(oyT.A0O);
        if (!r5.A02(activity) || value != C69295Niv.Exists) {
            if (value2 == C69295Niv.Exists) {
                return C69358Njy.RESTORE_WITH_PIN;
            }
            if (!A1b) {
                return null;
            }
            if (r5.A01()) {
                return C69358Njy.OTC_RESTORE;
            }
            return C69358Njy.OTC_ENTER_CODE_INTRO;
        } else if (!r5.A01() || num == AnonymousClass05K.A0C) {
            return C69358Njy.GDRIVE_RESTORE;
        } else {
            return C69358Njy.GDRIVE_RESTORE_V2;
        }
    }
}
