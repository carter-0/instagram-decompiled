package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eik  reason: case insensitive filesystem */
public abstract class C48699Eik {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        ClipsViewerSource clipsViewerSource;
        FragmentActivity A04 = C308206Td.A04(r6);
        UserSession A0W = DbX.A0W(r6);
        Object A03 = r7.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        Object A00 = r7.A00();
        0qQ.A0C(A00, A0p);
        if (0qQ.A0K(A00, "live_shopping_netego")) {
            clipsViewerSource = ClipsViewerSource.LIVE_SHOPPING_NETEGO;
        } else {
            clipsViewerSource = ClipsViewerSource.BLOKS;
        }
        C270634h3 r1 = new C270634h3(clipsViewerSource, A0W);
        r1.A1C = str;
        I6Y.A01(A04, r1, A0W, false);
        return null;
    }
}
