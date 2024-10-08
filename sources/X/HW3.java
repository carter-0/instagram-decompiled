package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.io.IOException;

public abstract class HW3 {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        String A0h = DbY.A0h(r13, 0);
        int A04 = DbW.A04(r13.A03(1), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0R = DbW.A0R(r12);
        C229352nF A0Y = C51967G9n.A0Y(A0R);
        try {
            C276124sb parseFromJson = C275964sG.parseFromJson(0c9.A04.A01(A0R, A0h));
            if (parseFromJson != null) {
                AnonymousClass3Y6 r3 = new AnonymousClass3Y6(parseFromJson);
                1Xj r1 = ((C276014sL) r3.A0M.get(A04)).A00;
                if (r1 != null) {
                    C270634h3 A0V = C51975G9x.A0V(ClipsViewerSource.CLIPS_NETEGO, A0R, r1);
                    A0V.A1F = r3.getId();
                    A0V.A0q = r3.A0S;
                    A0V.A1c = false;
                    A0V.A1g = true;
                    A0V.A1s = false;
                    A0V.A0k = r3.getId();
                    ClipsViewerConfig A00 = A0V.A00();
                    A0Y.A03(r3.A04, C294895nD.DEFAULT, r3.getId(), C295325ny.A07(r3.A0M), true, false);
                    C250563lf.A0X(C308206Td.A04(r12), A00, A0R);
                    return null;
                }
            }
        } catch (IOException unused) {
            0wb.A03("NetEgoClipsLauncher", "Unable to parse NetEgo Clips json");
        }
        return null;
    }
}
