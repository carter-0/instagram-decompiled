package X;

import com.facebook.pando.IPandoGraphQLService$Token;
import com.facebook.pando.PandoPaginationService;

/* renamed from: X.CkS  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44756CkS {
    public static /* synthetic */ IPandoGraphQLService$Token A00(C45407Cvn cvn, 1vn r8, int i) {
        String str = cvn.A01;
        if (str == null) {
            str = "";
        }
        1TZ A00 = 1TZ.A00();
        1vy A002 = 1vn.A00(r8, cvn.A03);
        0qQ.A0B(A002, 0);
        return ((PandoPaginationService) A002.A05.getValue()).loadNextPage(cvn.A02, i, 0, false, str, A00);
    }
}
