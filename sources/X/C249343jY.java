package X;

import com.instagram.api.schemas.NavBarCameraDestination;
import java.io.IOException;

/* renamed from: X.3jY  reason: invalid class name and case insensitive filesystem */
public final class C249343jY {
    public static C249323jW parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("camera_destination".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    NavBarCameraDestination navBarCameraDestination = (NavBarCameraDestination) NavBarCameraDestination.A01.get(str);
                    if (navBarCameraDestination == null) {
                        navBarCameraDestination = NavBarCameraDestination.UNRECOGNIZED;
                    }
                    r2.A01 = navBarCameraDestination;
                } else {
                    1XY.A01(r3, r2, A0q);
                }
                r3.A0z();
            }
            NavBarCameraDestination navBarCameraDestination2 = r2.A01;
            0qQ.A0A(navBarCameraDestination2);
            r2.A00 = new C271454is(navBarCameraDestination2);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
