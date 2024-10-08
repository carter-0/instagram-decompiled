package X;

import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import java.io.IOException;

/* renamed from: X.4sk  reason: invalid class name and case insensitive filesystem */
public final class C276154sk {
    public static final String A01(TigonError tigonError) {
        0qQ.A0B(tigonError, 0);
        int ordinal = tigonError.category.ordinal();
        if (ordinal == 1) {
            return "cancelled";
        }
        if (ordinal != 0) {
            return "error";
        }
        return "done";
    }

    public static final String A02(TigonError tigonError, String str) {
        0qQ.A0B(tigonError, 0);
        0qQ.A0B(str, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("TigonError(");
        sb.append("error=");
        sb.append(tigonError.category.toString());
        sb.append(", ");
        sb.append("errorDomain=");
        sb.append(tigonError.errorDomain);
        sb.append(", ");
        sb.append("domainErrorCode=");
        sb.append(tigonError.domainErrorCode);
        if (str.length() != 0) {
            sb.append(", tigonErrorClassname=");
            sb.append(str);
        }
        String str2 = tigonError.analyticsDetail;
        if (str2.length() != 0) {
            sb.append(", analyticsDetail=\"");
            sb.append(str2);
            sb.append("\"");
        }
        sb.append(")");
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final TigonError A00(Throwable th) {
        while (th instanceof IOException) {
            if (th instanceof TigonErrorException) {
                TigonErrorException tigonErrorException = (TigonErrorException) th;
                if (tigonErrorException != null) {
                    return tigonErrorException.tigonError;
                }
                return null;
            }
            th = th.getCause();
        }
        return null;
    }
}
