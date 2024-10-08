package com.facebook.tigon;

import X.002;
import X.00p;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C276154sk;
import X.C51967G9n;
import X.C51968G9o;
import X.Pxe;
import java.io.IOException;

public class TigonErrorException extends IOException {
    public static final C276154sk Companion = new Object();
    public final TigonError tigonError;

    public static final String convertErrorToRequestStatus(TigonError tigonError2) {
        return C276154sk.A01(tigonError2);
    }

    public static final String formatTigonError(TigonError tigonError2, String str) {
        return C276154sk.A02(tigonError2, str);
    }

    public static final String formatTigonException(IOException iOException) {
        if (iOException == null) {
            return null;
        }
        TigonError A00 = C276154sk.A00(iOException);
        if (A00 != null) {
            String str = A00.errorDomain;
            if (00p.A0k(str, "Tigon", false) && 00p.A0i(str, "Domain", false)) {
                str = C51967G9n.A0q(str, 5, str.length() - 6);
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(A00.category);
            A1A.append(':');
            A1A.append(str);
            A1A.append(':');
            return Pxe.A0z(A1A, A00.domainErrorCode);
        }
        String A16 = C51968G9o.A16(iOException);
        Throwable cause = iOException.getCause();
        if (cause != null) {
            return 002.A0T(A16, C51968G9o.A16(cause), '|');
        }
        return A16;
    }

    public static final TigonError getUnderlyingTigonError(Throwable th) {
        return C276154sk.A00(th);
    }

    public static final String convertExceptionToRequestStatus(IOException iOException) {
        if (iOException == null) {
            return "done";
        }
        TigonError A00 = C276154sk.A00(iOException);
        if (A00 == null) {
            return "error";
        }
        return C276154sk.A01(A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError2, String str) {
        super(C276154sk.A02(tigonError2, str));
        AnonymousClass7TG.A1O(tigonError2, str);
        this.tigonError = tigonError2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError2) {
        super(C276154sk.A02(tigonError2, ""));
        0qQ.A0B(tigonError2, 1);
        this.tigonError = tigonError2;
    }
}
