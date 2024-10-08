package X;

import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.NsV  reason: case insensitive filesystem */
public abstract class C69808NsV {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        BugReportSource bugReportSource;
        UserSession A01 = 0Gl.A01(C308206Td.A0B(r3));
        Object obj = r4.A00.get(1);
        if (obj == null || (bugReportSource = (BugReportSource) BugReportSource.A01.get(obj)) == null) {
            bugReportSource = BugReportSource.UNKNOWN;
        }
        if (bugReportSource == BugReportSource.UNKNOWN) {
            bugReportSource = BugReportSource.BLOKS;
        }
        if (A01 == null) {
            return null;
        }
        FGP.A00(C308206Td.A04(r3), bugReportSource, A01);
        return null;
    }
}
