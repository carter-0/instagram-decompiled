package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.5vM  reason: invalid class name and case insensitive filesystem */
public abstract class C299535vM {
    public static final ExtendedImageUrl A00(UserSession userSession, 1Xj r7, Double d) {
        List Al9;
        0qQ.A0B(userSession, 0);
        Context A06 = userSession.A03.A06();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue > 0.0d) {
                return r7.A1m((int) (((double) AnonymousClass0nB.A01(A06)) * doubleValue));
            }
        }
        boolean A062 = 182.A06(0Tu.A05, userSession, 36327838412061427L);
        ImageInfo A1p = r7.A1p();
        if (A062) {
            if (A1p != null) {
                return 1iI.A01(A06, A1p);
            }
            return null;
        } else if (A1p == null || (Al9 = A1p.Al9()) == null) {
            return null;
        } else {
            return (ExtendedImageUrl) 00k.A0J(Al9);
        }
    }
}
