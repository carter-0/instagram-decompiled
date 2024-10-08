package X;

import com.instagram.common.session.UserSession;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Vu4  reason: case insensitive filesystem */
public final class C18552Vu4 {
    public Boolean A00;
    public final UserSession A01;

    public final boolean A01(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 11:
                case 14:
                case 16:
                case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                case 19:
                case 20:
                case 21:
                    return true;
                case 13:
                case 15:
                    Boolean bool = this.A00;
                    if (bool == null) {
                        bool = false;
                        this.A00 = bool;
                    }
                    return bool.booleanValue();
            }
        }
        return false;
    }

    public static C18552Vu4 A00(UserSession userSession) {
        Class<C18552Vu4> cls = C18552Vu4.class;
        C18552Vu4 vu4 = (C18552Vu4) userSession.A00(cls);
        if (vu4 != null) {
            return vu4;
        }
        C18552Vu4 vu42 = new C18552Vu4(userSession);
        userSession.A04(cls, vu42);
        return vu42;
    }

    public C18552Vu4(UserSession userSession) {
        this.A01 = userSession;
    }
}
