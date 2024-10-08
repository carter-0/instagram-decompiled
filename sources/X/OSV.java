package X;

import android.view.animation.PathInterpolator;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import java.util.Iterator;

public abstract class OSV {
    public static final C53394GnR A00 = new C53394GnR(180, new PathInterpolator(0.2f, 0.12f, 0.0f, 1.0f), 3);
    public static final C61059Jvx A01 = new C61059Jvx(new C59721JVf(new N4M((GridSelfViewLocation) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (Object) null, 32767, false, false, false, false), (0sP) C73600Pgb.A00), new N3V((C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, AnonymousClass05K.A00, 0.0f, 126), 0sn.A00, 0Yt.A0E());

    public static final C68166N3g A00(C61059Jvx jvx) {
        Object obj;
        Iterator A1H = C51966G9m.A1H(jvx.A05);
        while (true) {
            if (!A1H.hasNext()) {
                obj = null;
                break;
            }
            obj = A1H.next();
            if (((C68166N3g) obj).A03 == GridItemType.SELF_VIEW) {
                break;
            }
        }
        return (C68166N3g) obj;
    }
}
