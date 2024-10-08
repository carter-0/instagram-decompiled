package X;

import android.view.View;
import com.facebook.react.views.modal.ReactModalHostManager;

/* renamed from: X.Qb7  reason: case insensitive filesystem */
public final class C7831Qb7 extends C19068WIz {
    public final void EhN(View view, Object obj, String str) {
        String str2;
        switch (str.hashCode()) {
            case -1851617609:
                str2 = "presentationStyle";
                break;
            case -1850124175:
                str2 = "supportedOrientations";
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    ((ReactModalHostManager) this.A00).setTransparent(view, Pxi.A1Y(obj, false));
                    return;
                }
                break;
            case -1618432855:
                str2 = "identifier";
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    ((ReactModalHostManager) this.A00).setStatusBarTranslucent(view, Pxi.A1Y(obj, false));
                    return;
                }
                break;
            case -795203165:
                str2 = "animated";
                break;
            case 466743410:
                str2 = "visible";
                break;
            case 1195991583:
                if (str.equals("hardwareAccelerated")) {
                    ((ReactModalHostManager) this.A00).setHardwareAccelerated(view, Pxi.A1Y(obj, false));
                    return;
                }
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    ((ReactModalHostManager) this.A00).setAnimationType(view, (String) obj);
                    return;
                }
                break;
        }
        if (str.equals(str2)) {
            return;
        }
        super.EhN(view, obj, str);
    }
}
