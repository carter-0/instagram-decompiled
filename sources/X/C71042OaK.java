package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.io.File;
import java.util.Map;

/* renamed from: X.OaK  reason: case insensitive filesystem */
public final class C71042OaK {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.29x, java.lang.Object] */
    public static final synchronized C12538Swo A00(C71042OaK oaK, File file, boolean z) {
        C12538Swo swo;
        synchronized (oaK) {
            String path = file.getPath();
            Map map = OyP.A09;
            swo = (C12538Swo) map.get(path);
            if (swo == null) {
                if (z) {
                    swo = new C12538Swo(new 29w(OyP.A07), file);
                } else {
                    swo = new C12538Swo(new Object(), file);
                }
            }
            map.put(path, swo);
        }
        return swo;
    }

    public static final OyP A01(UserSession userSession) {
        return (OyP) userSession.A01(OyP.class, new C73661Pha(userSession, 45));
    }

    public static final String A02(CommonMediaTransport commonMediaTransport) {
        String str;
        String str2 = commonMediaTransport.fileSha256_;
        0qQ.A07(str2);
        String A00 = C69852NtG.A00(str2);
        if ((commonMediaTransport.bitField0_ & 256) != 0) {
            str = commonMediaTransport.mimetype_;
        } else {
            str = null;
        }
        return 002.A0R(A00, C66834MdS.A05(str));
    }
}
