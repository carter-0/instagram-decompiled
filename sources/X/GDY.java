package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GDY {
    public static final GDY A00 = new Object();

    public static final C267324bN A00(ClipsViewerConfig clipsViewerConfig, UserSession userSession, String str) {
        AnonymousClass3OA A002;
        1Xj r0;
        0qQ.A0B(userSession, 0);
        String str2 = clipsViewerConfig.A1D;
        int i = clipsViewerConfig.A09;
        boolean z = clipsViewerConfig.A1k;
        if (str == null || (A002 = C324666zh.A00(userSession, str2, str)) == null) {
            return null;
        }
        C295375o3 r3 = C267324bN.A0d;
        if (A002 instanceof AnonymousClass3OA) {
            r0 = A002.A0K;
        } else if (A002 instanceof 1Xj) {
            r0 = (1Xj) A002;
        } else {
            0kg r2 = 0kg.A07;
            String A16 = C51968G9o.A16(A00);
            0qQ.A07(A16);
            0wb.A01(r2, A16, C273654mx.A00(525));
            C267324bN A04 = r3.A04(A002);
            A04.A0D(AnonymousClass05K.A00);
            A04.A0A = z;
            return A04;
        }
        r0.A03 = i;
        C267324bN A042 = r3.A04(A002);
        A042.A0D(AnonymousClass05K.A00);
        A042.A0A = z;
        return A042;
    }
}
