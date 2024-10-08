package X;

import com.instagram.api.schemas.InterestPivotStyle;

/* renamed from: X.Em5  reason: case insensitive filesystem */
public abstract class C48905Em5 {
    public static final boolean A00(AnonymousClass0iw r2, 1Xj r3) {
        InterestPivotStyle interestPivotStyle;
        if ("feed_timeline".equals(r2.getModuleName())) {
            C51956G8z B5H = r3.A0C.B5H();
            if (B5H != null) {
                interestPivotStyle = B5H.C22();
            } else {
                interestPivotStyle = null;
            }
            if (interestPivotStyle != InterestPivotStyle.UAS) {
                return false;
            }
            return true;
        }
        return false;
    }
}
