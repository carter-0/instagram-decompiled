package X;

import com.instagram.model.mediatype.ProductType;

/* renamed from: X.4O1  reason: invalid class name */
public abstract class AnonymousClass4O1 {
    public static final String A00(C263844No r3) {
        Integer num;
        String str;
        AnonymousClass3WR r1 = r3.A04;
        if (r3.A0P) {
            num = AnonymousClass05K.A01;
        } else if (r1 != null) {
            ProductType productType = r1.A09;
            if (productType != null && (str = productType.A00) != null) {
                return str;
            }
            num = r1.A0E;
        } else {
            1iA r2 = r3.A02;
            if (r2 == 1iA.A09 || r2 == 1iA.A0B) {
                num = AnonymousClass05K.A00;
            } else if (r2 == 1iA.A0L) {
                num = AnonymousClass05K.A0N;
            } else if (r2 == 1iA.A0Q) {
                num = AnonymousClass05K.A15;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Media ID: ");
                sb.append(r3);
                sb.append(", media type: ");
                sb.append(r2);
                String obj = sb.toString();
                0qQ.A07(obj);
                0wb.A03("VideoAnalyticsCommon_getVideoTypeFromMetaData", obj);
                return "unknown";
            }
        }
        return AnonymousClass4O2.A00(num);
    }
}
