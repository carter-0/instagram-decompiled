package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.7kq  reason: invalid class name and case insensitive filesystem */
public final class C340187kq extends C340157kn {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.7kr, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C340187kq(Context context, C340177kp r12, C340177kp r13, C340147km r14, UserSession userSession) {
        super(new Object(), r12, r13, r14, false, true, false);
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A00 = applicationContext;
        this.A01 = userSession;
        A00(C340167ko.A06, true);
        A00(C340167ko.A03, true);
    }

    public final Object AXG(C340207ks r5) {
        UserSession userSession;
        0Tu r2;
        long j;
        UserSession userSession2;
        0Tu r22;
        long j2;
        0qQ.A0B(r5, 0);
        int i = r5.A00;
        if (i == 10) {
            userSession = this.A01;
            0qQ.A0B(userSession, 0);
            r2 = 0Tu.A05;
            j = 36313153918732079L;
        } else if (i == 14) {
            userSession = this.A01;
            0qQ.A0B(userSession, 0);
            r2 = 0Tu.A05;
            j = 36317242727601094L;
        } else if (i == 16) {
            userSession = this.A01;
            0qQ.A0B(userSession, 0);
            r2 = 0Tu.A05;
            j = 36317762418644472L;
        } else if (i == 31) {
            return true;
        } else {
            if (i == 33) {
                userSession = this.A01;
                0qQ.A0B(userSession, 0);
                r2 = 0Tu.A05;
                j = 36321670838888055L;
            } else if (i == 43) {
                userSession = this.A01;
                0qQ.A0B(userSession, 0);
                r2 = 0Tu.A05;
                j = 36326047410566626L;
            } else if (i != 46) {
                switch (i) {
                    case 27:
                        userSession2 = this.A01;
                        0qQ.A0B(userSession2, 0);
                        r22 = 0Tu.A05;
                        j2 = 36599237395549650L;
                        break;
                    case 28:
                        UserSession userSession3 = this.A01;
                        0qQ.A0B(userSession3, 0);
                        return Long.valueOf((long) 182.A00(0Tu.A05, userSession3, 37162187348902108L));
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                        userSession2 = this.A01;
                        0qQ.A0B(userSession2, 0);
                        r22 = 0Tu.A05;
                        j2 = 36599237395418577L;
                        break;
                    default:
                        return super.AXG(r5);
                }
                return Integer.valueOf((int) 182.A01(r22, userSession2, j2));
            } else {
                userSession = this.A01;
                0qQ.A0B(userSession, 0);
                r2 = 0Tu.A05;
                j = 36317762419103227L;
            }
        }
        return Boolean.valueOf(182.A06(r2, userSession, j));
    }
}
