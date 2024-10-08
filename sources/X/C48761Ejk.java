package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ejk  reason: case insensitive filesystem */
public abstract class C48761Ejk {
    public static final Integer A00(0lg r2, Integer num, String str) {
        if (num.intValue() == 0) {
            return AnonymousClass05K.A00;
        }
        if (r2 instanceof UserSession) {
            27y A00 = 27u.A00((UserSession) r2);
            CallerContext.A01(str);
            A00.A00((C363768kJ) null);
            CallerContext.A01(str);
            if (A00.A01()) {
                return AnonymousClass05K.A0C;
            }
        }
        return AnonymousClass05K.A01;
    }
}
