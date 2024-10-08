package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.MaG  reason: case insensitive filesystem */
public abstract class C66647MaG {
    public static final C254793t3 A08(C254743sy r2) {
        DirectThreadKey directThreadKey;
        Object obj = null;
        if (r2 == null) {
            return null;
        }
        if (r2 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) r2;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) r2).A00;
        } else if (r2 instanceof MsysThreadId) {
            obj = r2;
            return (C254793t3) obj;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected DirectThreadKey or MsysThreadId: ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
        }
        String str = directThreadKey.A00;
        if (str != null) {
            obj = new C254763t0(str);
        }
        return (C254793t3) obj;
    }

    @Deprecated(message = "DO NOT USE THIS METHOD. Passing around thread IDs as raw Strings is dangerous and is a sign that code is not properly data source agnostic.")
    public static final String A0B(C254743sy r2) {
        DirectThreadKey directThreadKey;
        0qQ.A0B(r2, 0);
        if (r2 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) r2;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) r2).A00;
        } else if (r2 instanceof MsysThreadId) {
            return String.valueOf(((MsysThreadId) r2).A00);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected DirectThreadKey or MsysThreadId: ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
        }
        return directThreadKey.A00;
    }

    public static final String A0C(C254743sy r2) {
        DirectThreadKey directThreadKey;
        0qQ.A0B(r2, 0);
        if (r2 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) r2;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) r2).A00;
        } else if (r2 instanceof MsysThreadId) {
            return null;
        } else {
            throw C66582MXn.A0k(r2, "Expected DirectThreadKey or MsysThreadId: ", AnonymousClass7TE.A1A());
        }
        return directThreadKey.A01;
    }

    public static final C254923tH A01(C254743sy r2) {
        if ((r2 instanceof DirectThreadKey) || (r2 instanceof DirectMsysMixedThreadKey)) {
            return C254923tH.DJANGO;
        }
        if (r2 instanceof MsysThreadId) {
            return ((MsysThreadId) r2).A01;
        }
        throw C66582MXn.A0k(r2, "Expected DirectThreadKey or MsysThreadId: ", AnonymousClass7TE.A1A());
    }

    public static final DirectThreadKey A03(C254743sy r2) {
        if (r2 instanceof DirectThreadKey) {
            return (DirectThreadKey) r2;
        }
        if (r2 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) r2).A00;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadKey: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final DirectThreadKey A04(C254743sy r1) {
        if (r1 instanceof DirectThreadKey) {
            return (DirectThreadKey) r1;
        }
        if (r1 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) r1).A00;
        }
        return null;
    }

    public static final MsysThreadId A06(C254743sy r2) {
        if (r2 instanceof MsysThreadId) {
            return (MsysThreadId) r2;
        }
        if (r2 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) r2).A01;
        }
        throw C66582MXn.A0k(r2, C273654mx.A00(1256), AnonymousClass7TE.A1A());
    }

    public static final MsysThreadId A07(C254743sy r1) {
        if (r1 instanceof MsysThreadId) {
            return (MsysThreadId) r1;
        }
        if (r1 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) r1).A01;
        }
        return null;
    }

    @Deprecated(message = "Please migrate to new thread id logging API", replaceWith = @ReplaceWith(expression = "UnifiedThreadKeyLoggingUtil", imports = {}))
    public static final String A0A(C254743sy r2) {
        DirectThreadKey directThreadKey;
        if (r2 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) r2;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) r2).A00;
        } else if (r2 instanceof MsysThreadId) {
            return "-1";
        } else {
            throw C66582MXn.A0k(r2, "Expected DirectThreadKey or MsysThreadId: ", AnonymousClass7TE.A1A());
        }
        return directThreadKey.A00;
    }

    public static final boolean A0E(C254743sy r2) {
        if (!(r2 instanceof MsysThreadId) || ((MsysThreadId) r2).A01 != C254923tH.ACT) {
            return false;
        }
        return true;
    }

    public static final boolean A0F(C254743sy r1) {
        if ((r1 instanceof DirectThreadKey) || (r1 instanceof DirectMsysMixedThreadKey)) {
            return true;
        }
        return false;
    }

    public static long A00(C254743sy r1) {
        return A06(r1).A00;
    }

    public static AnonymousClass3U9 A02(2Dm r1, C254743sy r2) {
        return r1.B33(A03(r2));
    }

    public static DirectThreadKey A05(Iterator it) {
        return A03((C254743sy) it.next());
    }

    public static String A09(C254743sy r0) {
        return A03(r0).A00;
    }

    public static void A0D(UserSession userSession, C254743sy r5) {
        C70113NxT.A00(userSession).A00(A06(r5).A00, 0);
    }
}
